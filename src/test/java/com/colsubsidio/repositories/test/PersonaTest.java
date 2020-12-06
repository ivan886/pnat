package com.colsubsidio.repositories.test;

import static org.assertj.core.api.Assertions.assertThat;

import javax.transaction.Transactional;

//https://www.baeldung.com/spring-boot-testing
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.colsubsidio.entities.Persona;
import com.colsubsidio.instituto.InstitutoApplication;
import com.colsubsidio.repositories.PersonaRepository;

/*
@SpringBootTest(classes = { Persona.class, PersonaRepository.class})
@RunWith(SpringRunner.class)
@DataJpaTest
*/

@RunWith(SpringRunner.class)
@SpringBootTest( classes = InstitutoApplication.class)
@AutoConfigureMockMvc
@TestPropertySource( locations = "classpath:application.properties")
public class PersonaTest{
	
	    @Autowired
	    private PersonaRepository personaRepository;
	
	    
	    @Test
	    public void whenFindByCodigoPersona_thenReturnPerson() {
	        
	    	Persona unaPersona= new Persona("David");
	          personaRepository.save(unaPersona);
	          
	        // when
	        Persona unaPersona2= personaRepository.findByCodigoPersona(8L);

	         assertThat(unaPersona2.getNombre()).isEqualTo("David");
	    }
	    
	    @Test
	    @Transactional
	    public void whenDeleteFromPersonaDeletingShouldBeSuccessful() {
	    //    long deletedRecords = personaRepository.deleteByCOdigoPersona(1L);
	  //      assertThat(deletedRecords).isEqualTo(1);
	    }
	    
}