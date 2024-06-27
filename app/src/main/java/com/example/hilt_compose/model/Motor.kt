package com.example.hilt_compose.model

import android.util.Log
import javax.inject.Inject


class Motor @Inject constructor(){
    fun ligarMotor(combustivel: Combustivel){
        if(combustivel.combustivel == "Gasolina"){
            Log.e("Teste","Motor Ligado")
        }else{
            Log.e("Teste","Sem Combustivel")
        }
    }
}