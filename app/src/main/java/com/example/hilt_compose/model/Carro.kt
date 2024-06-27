package com.example.hilt_compose.model

import javax.inject.Inject


class Carro @Inject constructor(
    val combustivel: Combustivel,
    val motor: Motor,
){

    fun ligarCarro(){
        motor.ligarMotor(combustivel)
    }


}