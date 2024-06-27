package com.example.hilt_compose.model

class Carro {
    private val motor = Motor()
    private val gasolina = Combustivel("Gasolina")
    fun ligarCarro(){
        motor.ligarMotor(gasolina)
    }


}