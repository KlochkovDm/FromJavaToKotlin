package com.example.fromjavatokotlin.repository

import com.example.fromjavatokotlin.data.Weather

class Repository :IRepository {

    private val weathers: List<Weather>

    init {
        weathers = listOf(
        Weather("Moсква",25),
        Weather("Рязань",27),
        Weather("Ростов",29),
        Weather("Сочи",31),
        )
    }

    override fun getWeathers(): List<Weather> {
        return weathers
    }

    fun size() = weathers.size
}

interface IRepository {
    fun getWeathers(): List<Weather>
    
}

object RepositorySingle :IRepository{

    private val weather = Weather("Новгород", 20 )
    private val copiedWeather = weather.copy(city = "Магадан")
    private val copiedWeather2 = weather.copy()

    private val weathers: List<Weather> = listOf(
            Weather("Moсква",25),
            Weather("Рязань",27),
            Weather("Ростов",29),
            Weather("Сочи",31),
            weather,
            copiedWeather,
            copiedWeather2,
            Weather("Moсква",25),
            Weather("Рязань",27),
            Weather("Ростов",29),
            Weather("Сочи",31),
            Weather("Moсква",25),
            Weather("Рязань",27),
            Weather("Ростов",29),
            Weather("Сочи",31),
            Weather("Moсква",25),
            Weather("Рязань",27),
            Weather("Ростов",29),
            Weather("Сочи",31))

    override fun getWeathers(): List<Weather> {
        return weathers
    }

}