package demo.controller;

import com.example.LastWork.dto.PersonCreateDto;
import com.example.LastWork.persistence.entity.Person;
import com.example.LastWork.service.PersonService;
import com.example.LastWork.controller.PersonController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@WebMvcTest(PersonController.class)
@AutoConfigureMockMvc(addFilters = false)
public class PersonControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private PersonService personService;

    @Test
    public void createPersonTest() throws Exception {
        // given
        PersonCreateDto personCreateDto = new PersonCreateDto();
        Person expectedPerson = new Person("SomeName", "SomeAddress");

        when(personService.createPerson(personCreateDto)
        ).thenReturn(expectedPerson);

       ResultActions result = mockMvc.perform(post("/api/persons/")
                        .contentType(APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(personCreateDto))
                        .accept(APPLICATION_JSON)
                );

       // then
        result
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value("1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("SomeName"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
