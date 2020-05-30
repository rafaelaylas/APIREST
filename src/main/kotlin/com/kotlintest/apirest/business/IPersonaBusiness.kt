package com.kotlintest.apirest.business

import com.kotlintest.apirest.model.Persona

interface IPersonaBusiness {
    fun list(): List<Persona>
    fun load(idPerona: Long): Persona
    fun save(persona: Persona): Persona
    fun remove(idPersona: Long)
}