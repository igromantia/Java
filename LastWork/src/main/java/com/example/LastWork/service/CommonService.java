package com.example.LastWork.service;

import com.example.LastWork.dto.listOrdersByStatusDto;
import com.example.LastWork.persistence.entity.Goods;
import com.example.LastWork.persistence.entity.Orders_goods;
import com.example.LastWork.persistence.entity.Person;
import com.example.LastWork.persistence.entity.Row_orders;
import com.example.LastWork.persistence.repository.GoodsRepository;
import com.example.LastWork.persistence.repository.Orders_goodsRepository;
import com.example.LastWork.persistence.repository.Row_ordersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Service
public class CommonService {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    GoodsRepository goodsRepository;
    @Autowired
    Orders_goodsRepository orders_goodsRepository;
    @Autowired
    Row_ordersRepository row_ordersRepository;

    List<Object> list = new ArrayList<>();

    public List<Goods> listGoods() {
        List<Goods> listGoods = new ArrayList<>();
        listGoods = goodsRepository.findAll();
        return listGoods;
    }

    public JdbcTemplate connect() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();

        try (InputStream input = new FileInputStream("src/main/resources/application.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            dataSource.setDriverClassName(prop.getProperty("spring.datasource.driver-class-name"));
            dataSource.setUrl(prop.getProperty("spring.datasource.url"));
            dataSource.setUsername(prop.getProperty("spring.datasource.username"));
            dataSource.setPassword(prop.getProperty("spring.datasource.password"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate;
    }

    public ArrayList<Object> getReportOrders() {
        JdbcTemplate jdbcTemplate = connect();
        String textQuery = """
                SELECT * 
                FROM public.person AS per LEFT JOIN 
                (SELECT * 
                FROM public.orders_goods AS ord LEFT JOIN public.row_orders AS ord_r  
                ON ord.id = ord_r.order_id)AS tab  
                ON per.id = tab.person_id 
                ORDER BY per.id
                """;
        List<Person> resultQuery1 = jdbcTemplate.query(textQuery, new BeanPropertyRowMapper(Person.class));
        List<Orders_goods> resultQuery2 = jdbcTemplate.query(textQuery, new BeanPropertyRowMapper(Orders_goods.class));
        List<Row_orders> resultQuery3 = jdbcTemplate.query(textQuery, new BeanPropertyRowMapper(Row_orders.class));
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(resultQuery1);
        arrayList.add(resultQuery2);
        arrayList.add(resultQuery3);

        return arrayList;
    }

    public List<Goods> listGoodsForSail() {
        JdbcTemplate jdbcTemplate = connect();
        String textQuery = """
                SELECT * FROM public.goods
                    WHERE not_for_sail != true AND quantity > 0
                    ORDER BY id ASC;
                """;
        List<Goods> resultQuery = jdbcTemplate.query(textQuery, new BeanPropertyRowMapper(Goods.class));

        return resultQuery;
    }

    public List<listOrdersByStatusDto> listOrdersByStatus() {
        jdbcTemplate = connect();
        String textQuery = """
                SELECT og.id AS order_id,  address_delivery,
                        p.id AS person_id, p.name AS person_name, p.address AS person_address, p.phone,
                        so.id AS status_id, so.name AS status_name, so.finished,
                        wd.id AS way_id, wd.name AS way_name
                FROM public.orders_goods AS og\s
                LEFT JOIN public.person AS p ON og.person_id = p.id
                LEFT JOIN public.status_order AS so ON og.status_order_id = so.id
                LEFT JOIN public.way_delivery AS wd ON og.way_delivery_id = wd.id
                ORDER BY status_order_id, way_delivery_id, og.id;
                """;
        List<listOrdersByStatusDto> resultQuery = jdbcTemplate.query(textQuery, new BeanPropertyRowMapper(listOrdersByStatusDto.class));

        return resultQuery;
    }

}
