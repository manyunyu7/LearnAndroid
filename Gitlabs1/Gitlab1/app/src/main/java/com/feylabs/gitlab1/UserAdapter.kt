package com.feylabs.gitlab1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.list_anggota.view.*

class UserAdapter(private val listUser : ArrayList<User>): RecyclerView.Adapter<UserAdapter.UserHolder>() {

    inner class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//        var name = user_
        var usrName = itemView.user_name
        var usrUserName = itemView.user_username
        var loc = itemView.user_city
        var usrPic = itemView.usr_profile
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_anggota,parent,false)
        return UserHolder(view)
    }

    override fun getItemCount(): Int {
        return listUser.size
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        val usr = listUser[position]
        holder.usrName.text=usr.name
        holder.usrUserName.text="github.com/"+usr.username
        holder.loc.text=usr.location

        holder.itemView.setOnClickListener {
            val a = Intent(holder.itemView.context, DetailActivity::class.java)
            a.putExtra("data", listUser[position])
            holder.itemView.context.startActivity(a)
        }

        Glide.with(holder.itemView.context)
            .load(usr.photo)
            .apply(RequestOptions().override(75))
            .into(holder.usrPic)
    }


}

