package com.example.hilt_compose.provides

import com.example.hilt_compose.model.Combustivel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

private const val TIPO_COMBUSTIVEL = "Gasolina"

@Module
@InstallIn(ActivityComponent::class)
class CombustivelProvide {

    @Provides
    fun getCombustivel(): Combustivel {
        return Combustivel(TIPO_COMBUSTIVEL)
    }

}