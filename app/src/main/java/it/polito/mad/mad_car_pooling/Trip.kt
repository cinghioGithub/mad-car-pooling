package it.polito.mad.mad_car_pooling

import android.util.Log
import java.net.URI

data class Trip(
    private var photo_: URI,
    private var departureLocation_: String,
    private var arrivalLocation_: String,
    private var departureDateTime_: String,
    private var arrivalDateTime_: String,
    private var duration_: Double,
    private var seats_: Int,
    private var price_: Double,
    private var description_: String
){

    val photo: URI get() = photo_
    val departureLocation: String get() = departureLocation_
    val arrivalLocation: String get() = arrivalLocation_
    val departureDateTime: String get() = departureDateTime_
    val arrivalDateTime: String get() = arrivalDateTime_
    val duration: Double get() = duration_
    val seats: Int get() = seats_
    val price: Double get() = price
    val description: String get() = description


    companion object {
        @JvmStatic  private var id: Int = 0
    }

    init {
        Log.d("POLITOMAD_Trip", "ID: $id")
        Log.d("POLITOMAD_Trip", "Departure: " + this.departureLocation_)
        id++
    }

}