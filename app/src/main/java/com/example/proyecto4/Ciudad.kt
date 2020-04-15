package com.example.proyecto4

import android.os.Parcel
import android.os.Parcelable

data class Ciudad(val ciudad: String?, val clima: String?,val imagen: Int): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(ciudad)
        parcel.writeString(clima)
        parcel.writeInt(imagen)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Ciudad> {
        override fun createFromParcel(parcel: Parcel): Ciudad {
            return Ciudad(parcel)
        }

        override fun newArray(size: Int): Array<Ciudad?> {
            return arrayOfNulls(size)
        }
    }


}