package com.senjapagi.Github4206

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.senjapagi.Github4206.Model.ModelMahasiswa

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val ivFoto = findViewById(R.id.ivp_image) as ImageView
        val tvNama = findViewById<TextView>(R.id.tvp_name) as TextView
        val tvAsal = findViewById<TextView>(R.id.tvp_asal) as TextView
        val tvFollowers = findViewById<TextView>(R.id.tvp_followers) as TextView
        val tvFollowing = findViewById<TextView>(R.id.tvp_following) as TextView
        val tvGithub = findViewById<TextView>(R.id.tvp_github) as TextView
        val tvProfesi = findViewById<TextView>(R.id.tvp_profesi) as TextView

        val mahasiswa = intent.getParcelableExtra("data") as ModelMahasiswa
        ivFoto.setImageResource(mahasiswa.getFoto())
        tvNama.setText(mahasiswa.getNama())
        tvProfesi.setText(mahasiswa.getCompany())
        tvGithub.setText("github.com/${mahasiswa.getUsername()}")
        tvAsal.setText(mahasiswa.getLokasi())
        tvFollowers.setText(mahasiswa.getFollower())
        tvFollowing.setText(mahasiswa.getFollowing())


        val button = findViewById<Button>(R.id.btn_back)
        button.setOnClickListener{
            move()
        }

//        val h : Handler = Handler()
//        h.postDelayed({
//        },3000)
    }

    fun move(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}