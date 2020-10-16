package com.senjapagi.Github4206.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelMahasiswa implements Parcelable {
    String nama,username,company,lokasi,github,following,follower;
    int foto;

    public ModelMahasiswa(String nama, String username, String company, String lokasi, String github, String following, String follower, int foto) {
        this.nama = nama;
        this.username = username;
        this.company = company;
        this.lokasi = lokasi;
        this.github = github;
        this.following = following;
        this.follower = follower;
        this.foto = foto;
    }
    public ModelMahasiswa(){}

    protected ModelMahasiswa(Parcel in) {
        nama = in.readString();
        username = in.readString();
        company = in.readString();
        lokasi = in.readString();
        github = in.readString();
        following = in.readString();
        follower = in.readString();
        foto = in.readInt();
    }

    public static final Creator<ModelMahasiswa> CREATOR = new Creator<ModelMahasiswa>() {
        @Override
        public ModelMahasiswa createFromParcel(Parcel in) {
            return new ModelMahasiswa(in);
        }

        @Override
        public ModelMahasiswa[] newArray(int size) {
            return new ModelMahasiswa[size];
        }
    };
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(username);
        dest.writeString(company);
        dest.writeString(lokasi);
        dest.writeString(github);
        dest.writeString(following);
        dest.writeString(follower);
        dest.writeInt(foto);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }


}
