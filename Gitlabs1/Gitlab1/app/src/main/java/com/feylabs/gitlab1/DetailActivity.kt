package com.feylabs.gitlab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val dataIntentParcel = intent.getParcelableExtra<User>("data") as User
        tvp_name.text= dataIntentParcel.name
        tvp_asal.text=dataIntentParcel.location
        tvp_followers.text=dataIntentParcel.followers
        tvp_following.text=dataIntentParcel.following
        tvp_github.text="github.com/"+dataIntentParcel.username
        tvp_profesi.text=dataIntentParcel.company
        ivp_image.setImageResource(dataIntentParcel.photo)

        btn_back.setOnClickListener {
            super.onBackPressed()
            finish()
        }
    }
}