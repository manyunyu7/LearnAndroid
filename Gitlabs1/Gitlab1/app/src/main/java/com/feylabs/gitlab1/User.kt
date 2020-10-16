package com.feylabs.gitlab1

import android.os.Parcel
import android.os.Parcelable

data class User (
    var name: String? = "",
    var username: String? = "",
    var company: String? = "",
    var photo: Int = 0,
    var following : String?,
    var followers : String?,
    var repo : String?,
    var location : String?
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(username)
        parcel.writeString(company)
        parcel.writeInt(photo)
        parcel.writeString(following)
        parcel.writeString(followers)
        parcel.writeString(repo)
        parcel.writeString(location)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}