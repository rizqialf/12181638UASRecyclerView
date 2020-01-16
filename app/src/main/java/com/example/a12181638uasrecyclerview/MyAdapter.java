package com.example.a12181638uasrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
    Context c;
    ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, null);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, int i) {
        myHolder.mTitle.setText(models.get(i).getTitle());
        myHolder.mDes.setText(models.get(i).getDescription());
        myHolder.mImaeView.setImageResource(models.get(i).getImg());

        myHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                String gTitle = models.get(position).getTitle();
                String gDesc = models.get(position).getDescription();
                BitmapDrawable bitmapDrawable= (BitmapDrawable)myHolder.mImaeView.getDrawable();

                Bitmap bitmap = bitmapDrawable.getBitmap();

                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100,stream);
                byte [] bytes = stream.toByteArray();

                Intent intent = new Intent(c,AnotherActivity.class);
                intent.putExtra("iTitle",gTitle);
                intent.putExtra("iDesc",gDesc);
                intent.putExtra("iImage",bytes);
                c.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
