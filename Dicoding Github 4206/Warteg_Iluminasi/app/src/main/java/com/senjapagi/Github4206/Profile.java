package com.senjapagi.Github4206;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.senjapagi.Github4206.R;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
//        findViewById(R.id.btn_email).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Intent intent = new Intent(Intent.ACTION_VIEW)
//                        .setType("plain/text")
//                        .setData(Uri.parse("henryaugusta4@gmail.com"))
//                        .setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail")
//                        .putExtra(Intent.EXTRA_SUBJECT, "Kenalan Dong")
//                        .putExtra(Intent.EXTRA_TEXT, "Hallo Henry");
//                startActivity(intent);
//            }
//        });

    }
}