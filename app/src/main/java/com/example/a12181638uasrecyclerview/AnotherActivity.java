package com.example.a12181638uasrecyclerview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

public class AnotherActivity extends AppCompatActivity {
    TextView mTitleTV,mDescTV;
    ImageView mImageIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        ActionBar actionBar = getSupportActionBar();

        mTitleTV = findViewById(R.id.title);
        mDescTV = findViewById(R.id.description);
        mImageIv = findViewById(R.id.imageIv);

        Intent intent = getIntent();
        String mTitle = intent.getStringExtra("iTitle");
        String mDescription = intent.getStringExtra("iDesc");

        byte[] mBytes=getIntent().getByteArrayExtra("iImage");
        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes,0,mBytes.length);

        actionBar.setTitle(mTitle);

       /* mTitleTV.setText(mTitle);
        mDescTV.setText(mDescription);
        mImageIv.setText(bitmap); */
    }
}
