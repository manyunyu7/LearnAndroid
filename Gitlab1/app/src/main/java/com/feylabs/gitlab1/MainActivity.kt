package com.feylabs.gitlab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.start_screen.*

class MainActivity : AppCompatActivity() {
    val data = ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener {
            splash.visibility= View.GONE
        }

        rv_user.setHasFixedSize(true)
        data.addAll(Data_User.listData)
        showData()
    }
    private fun showData(){
        rv_user.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val userAdapter =  UserAdapter(data)
        rv_user.adapter=userAdapter
    }

    override fun onBackPressed() {
        finishAffinity()
    }

}