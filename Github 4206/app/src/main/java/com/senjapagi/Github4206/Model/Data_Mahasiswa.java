package com.senjapagi.Github4206.Model;

import com.senjapagi.Github4206.Model.ModelMahasiswa;
import com.senjapagi.Github4206.R;

import java.util.ArrayList;

public class Data_Mahasiswa {

    private static String[] mhsNames = {
            "Jake Wharton",
            "AMIT SHEKHAR",
            "Romain Guy",
            "Chris Banes",
            "David",
            "Ravi Tamada",
            "Deny Prasetyo",
            "Budi Oktaviyan",
            "Hendi Santika",
            "Sidiq Permana",
};

    private static String[] mhsUsername = {
            "JakeWharton",
            "amitshekhariitbhu",
            "romainguy",
            "chrisbanes",
            "tipsy",
            "ravi8x",
            "jasoet",
            "budioktaviyan",
            "hendisantika",
            "sidiqpermana",
    };
    private static String[] mhsLokasi = {
            "Pittsburgh, PA, USA",
            "New Delhi, India",
            "California",
            "Sydney, Australia",
            "Trondheim, Norway",
            "India",
            "Kotagede, Yogyakarta, Indonesia",
            "Jakarta, Indonesia",
            "Bojongsoang - Bandung Jawa Barat",
            "Jakarta Indonesia",
    };
    private static String[] mhsCompany = {
            "Google, Inc.",
            "@MindOrksOpenSource",
            "Google",
            "@google working on @android",
            "Working Group Two",
            "AndroidHive | Droid5",
            "@gojek-engineering",
            "@KotlinID",
            "@JVMDeveloperID @KotlinID @IDDevOps",
            "Nusantara Beta Studio",
    };

    private static int[] mhsAvatar = {
            R.drawable.user1,
            R.drawable.user2,
            R.drawable.user3,
            R.drawable.user4,
            R.drawable.user5,
            R.drawable.user6,
            R.drawable.user7,
            R.drawable.user8,
            R.drawable.user9,
            R.drawable.user10,

    };

    private static String[] repo ={
            "102",
            "37",
            "9",
            "30",
            "56",
            "28",
            "44",
            "110",
            "1064",
            "65",
    };

    public static ArrayList<ModelMahasiswa> getListData() {
        ArrayList<ModelMahasiswa> list = new ArrayList<>();
        for (int position = 0; position < mhsNames.length; position++) {
            ModelMahasiswa men = new ModelMahasiswa();
            men.setNama(mhsNames[position]);
            men.setFoto(mhsAvatar[position]);
            men.setCompany(mhsCompany[position]);
            men.setLokasi(mhsLokasi[position]);
            men.setUsername(mhsUsername[position]);
            men.setFollower(mhsFollowers[position]);
            men.setFollowing(mhsFollowing[position]);
            men.setGithub(repo[position]);
            list.add(men);
        }
        return list;
    }

    private static String[] mhsFollowers = {
            "56995",
            "5153",
            "7972",
            "14725",
            "788",
            "18628",
            "277",
            "178",
            "428",
            "465",
    };
    private static String[] mhsFollowing = {
            "12",
            "2",
            "0",
            "1",
            "0",
            "3",
            "39",
            "23",
            "61",
            "10",
    };




}
