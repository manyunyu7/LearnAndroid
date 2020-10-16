package com.senjapagi.Github4206.Model;

import com.senjapagi.Github4206.Model.ModelMahasiswa;
import com.senjapagi.Github4206.R;

import java.util.ArrayList;

public class Data_Mahasiswa {

    private static String[] mhsNames = {
            "Ghina Khaerunnisa",
            "Zafira Chaerunnisa",
            "Henry Augusta",
            "Ifen Faridian R",
            "Hagai Tarigan",
            "Dinda Sekar Cendani",
            "Meliana Listyawati",
            "Maulana Malik Ibrahim",
            "Rocky Gerung",
            "Sandhika Galih",
};

    private static String[] mhsFollowers = {
            "43",
            "235",
            "132",
            "53",
            "754",
            "235",
            "232",
            "766",
            "64",
            "43",
    };
    private static String[] mhsFollowing = {
            "59",
            "12",
            "64",
            "12",
            "64",
            "65",
            "11",
            "22",
            "65",
            "53",
    };

    private static String[] mhsUsername = {
            "gingin",
            "zafiraa123",
            "henryaugusta",
            "ifenfaridian",
            "equinoxx",
            "dinda_cdn",
            "meliana_lisyawati",
            "maul_cisco",
            "akal_sehat",
            "sandika_unpas",
    };
    private static String[] mhsLokasi = {
            "Bandung",
            "Jakarta",
            "Cisarua",
            "Magelang",
            "Dieng",
            "Blitar",
            "Cinere",
            "Garut",
            "Bogor Timur",
            "Bandung",
    };
    private static String[] mhsCompany = {
            "Bandung Valley",
            "Bandung Valley",
            "Senja Pagi Tech",
            "AEH IT Solution",
            "Plateau Geek",
            "Silicon Valley",
            "Primajasa",
            "Amidis",
            "Unilever",
            "KCI Indonesia",
    };

    private static int[] mhsAvatar = {
            R.drawable.student_ghina,
            R.drawable.student_zafira,
            R.drawable.student_henry,
            R.drawable.student_ifen,
            R.drawable.student_hagai,
            R.drawable.student_dinda,
            R.drawable.student_meliana,
            R.drawable.student_maul,
            R.drawable.student_rocky,
            R.drawable.student_sandi,
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
            men.setGithub("github.com/"+mhsUsername[position]);
            list.add(men);
        }
        return list;
    }

}
