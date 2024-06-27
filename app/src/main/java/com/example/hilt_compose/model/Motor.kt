package com.example.hilt_compose.model

import android.util.Log

class Motor (){
    private val combustivel: Combustivel = Combustivel("Gasolina")
    fun ligarMotor(combustivel: Combustivel){
        if(combustivel.combustivel == "Gasolina"){
            Log.e("Teste","Motor Ligado")
        }else{
            Log.e("Teste","Motor não funciona")
        }
    }
}