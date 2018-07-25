package com.zhxh.xtouchdemo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.zhxh.xtouchdemo.widget.RotateZoomImageView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zhxh
 * Index Informatics, Inc.
 * Date: 9/24/13
 * MultitouchActivity
 */
public class MultitouchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RotateZoomImageView iv = new RotateZoomImageView(this);

        Bitmap image;
        try {
            InputStream in = getAssets().open("android.jpg");
            image = BitmapFactory.decodeStream(in);
            in.close();
        } catch (IOException e) {
            image = null;
        }
        iv.setImageBitmap(image);

        setContentView(iv);
    }
}
