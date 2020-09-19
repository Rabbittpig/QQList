package com.example.qqlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //添加两个成员变量
    private ImageView[] img = new ImageView[12];
    private int[] imagePath = new int[]{
            R.drawable.img1, R.drawable.img4, R.drawable.img3,
            R.drawable.img4, R.drawable.img5, R.drawable.img6,
            R.drawable.img1, R.drawable.img4, R.drawable.img3,
            R.drawable.img4, R.drawable.img5, R.drawable.img6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayout layout = findViewById(R.id.layout);
        for (int i = 0; i < imagePath.length; i++) {
            img[i] = new ImageView(MainActivity.this);
            img[i].setImageResource(imagePath[i]);
            img[i].setPadding(2, 2, 2, 2);
            //设置图片大小
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(116, 68);
            img[i].setLayoutParams(layoutParams);
            //添加到布局管理器
            layout.addView(img[i]);
        }
    }
}