package me.dio.simulator.domain

import com.google.gson.annotations.SerializedName

data class Match (

    @SerializedName("Descricao")
    val description: String,
    @SerializedName("local")
    val place: Place,
    @SerializedName("mandante")
    val homeTeam: Team,
    @SerializedName("visitante")
    val awayTeam: Team

)