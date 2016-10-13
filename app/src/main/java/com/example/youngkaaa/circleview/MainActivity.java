package com.example.youngkaaa.circleview;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.youngkaaa.ycircleview.CircleView;

public class MainActivity extends AppCompatActivity {
    private CircleView circleView;
    private ImageView mImageView1;
    private ImageView mImageView2;
    private Bitmap mBitmap1;
    private Bitmap mBitmap2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main2);
        setContentView(R.layout.activity_main);
//        mImageView1= (ImageView) findViewById(R.id.imageView1);
//        mImageView2= (ImageView) findViewById(R.id.imageView2);
//        mBitmap1= BitmapFactory.decodeResource(getResources(),R.drawable.jay_jay1);
//        mImageView1.setImageBitmap(mBitmap1);
//        Matrix matrix=new Matrix();
//        matrix.setRotate(120,mImageView1.getWidth()/2,mImageView1.getHeight()/2);
//        mBitmap2=Bitmap.createBitmap(mBitmap1.getWidth(),mBitmap1.getHeight(), Bitmap.Config.ARGB_8888);
//        Canvas canvas=new Canvas(mBitmap2);
//        canvas.drawBitmap(mBitmap1,0,0,new Paint());
//        mImageView2.setImageBitmap(mBitmap2);
    }
}
