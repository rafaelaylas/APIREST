package com.kotlintest.apirest

import com.kotlintest.apirest.dao.PersonaRepository
import com.kotlintest.apirest.model.Persona
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@SpringBootApplication
class ApirestApplication:CommandLineRunner
{
	@Autowired
	val personaRepository: PersonaRepository? = null

	override fun run(vararg args: String?) {
		val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
		val persona1 = Persona(234232342, "Gaston", "Sailen", LocalDate.parse("29-05-1995", formatter) )
		val persona2 = Persona(244564453, "Pepito", "Selastraga", LocalDate.parse("23-07-2020", formatter))
		personaRepository!!.save(persona1)
		personaRepository!!.save(persona2)
	}
}

fun main(args: Array<String>) {
	runApplication<ApirestApplication>(*args)
}
