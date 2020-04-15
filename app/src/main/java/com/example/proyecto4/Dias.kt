package com.example.proyecto4

import android.os.Parcel
import android.os.Parcelable

data class Dias(val city:String?,val temp:String?,val dsemana:String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(city)
        parcel.writeString(temp)
        parcel.writeString(dsemana)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Dias> {
        override fun createFromParcel(parcel: Parcel): Dias {
            return Dias(parcel)
        }

        override fun newArray(size: Int): Array<Dias?> {
            return arrayOfNulls(size)
        }
    }
}