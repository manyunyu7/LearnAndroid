package com.feylabs.gitlab1

import java.util.*
import kotlin.collections.ArrayList

object Data_User {

    private val userNames = arrayOf(
        "Jake Wharton",
        "Amit SHEKHAR",
        "Romain Guy",
        "Chris Banes",
        "David",
        "Ravi Tamada",
        "Deny Prasetyo",
        "Budi Oktaviyan",
        "Hendi Santika",
        "Sidiq Permana"
    )

    private val userUsername = arrayOf(
        "JakeWharton",
        "amitshekhariitbhu",
        "romainguy",
        "chrisbanes",
        "tipsy",
        "ravi8x",
        "jasoet",
        "budioktaviyan",
        "hendisantika",
        "sidiqpermana"
    )
    private val userLokasi = arrayOf(
        "Pittsburgh, PA, USA",
        "New Delhi, India",
        "California",
        "Sydney, Australia",
        "Trondheim, Norway",
        "India",
        "Kotagede, Yogyakarta, Indonesia",
        "Jakarta, Indonesia",
        "Bojongsoang - Bandung Jawa Barat",
        "Jakarta Indonesia"
    )
    private val userCompany = arrayOf(
        "Google, Inc.",
        "@MindOrksOpenSource",
        "Google",
        "@google working on @android",
        "Working Group Two",
        "AndroidHive | Droid5",
        "@gojek-engineering",
        "@KotlinID",
        "@JVMDeveloperID @KotlinID @IDDevOps",
        "Nusantara Beta Studio"
    )

    private val userAvatar = intArrayOf(
        R.drawable.user1,
        R.drawable.user2,
        R.drawable.user3,
        R.drawable.user4,
        R.drawable.user5,
        R.drawable.user6,
        R.drawable.user7,
        R.drawable.user8,
        R.drawable.user9,
        R.drawable.user10
    )

    private val userRepo = arrayOf(
        "102",
        "37",
        "9",
        "30",
        "56",
        "28",
        "44",
        "110",
        "1064",
        "65"
    )


    private val userFollowers = arrayOf(
        "56995",
        "5153",
        "7972",
        "14725",
        "788",
        "18628",
        "277",
        "178",
        "428",
        "465"
    )
    private val userFollowing = arrayOf(
        "12",
        "2",
        "0",
        "1",
        "0",
        "3",
        "39",
        "23",
        "61",
        "10"
    )

    val listData: ArrayList<User>
        get() {
            val list = arrayListOf<User>()
            for (position in userNames.indices) {
                val user = User(
                    userNames[position],
                    userUsername[position],
                    userCompany[position],
                    userAvatar[position],
                    userFollowing[position],
                    userFollowers[position],
                    userRepo[position],
                    userLokasi[position]
                    )
                list.add(user)
            }
            return list
        }



}