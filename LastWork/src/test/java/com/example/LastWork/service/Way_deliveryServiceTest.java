package com.example.LastWork.service;

import com.example.LastWork.dto.Way_deliveryCreateDto;
import com.example.LastWork.persistence.repository.Way_deliveryRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//@RunWith(SpringRunner.class)
////@WebMvcTest(PersonController.class)
//@AutoConfigureMockMvc(addFilters = false)

//@RunWith(SpringRunner.class)
//@DataJpaTest
//@ActiveProfiles("test")
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)



@Ignore
public class Way_deliveryServiceTest {
    private static Way_deliveryService way_deliveryService = new Way_deliveryService();
//    @MockBean
    @Autowired
    Way_deliveryRepository way_deliveryRepository;
//    private static Way_deliveryRepository  way_deliveryRepository = Mockito.mock(Way_deliveryRepository.class);
//    private static Way_deliveryCreateDto
    @Test
    public void createWay_delivery() {
        //given
        when(way_deliveryRepository.save(any())).thenReturn(null);
        //when
        way_deliveryService.createWay_delivery(new Way_deliveryCreateDto());
    }
}