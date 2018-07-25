/*
 *
 * See the file license.txt for copying permission.
 */
package com.zhxh.xtouchdemo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class TwoDimensionGestureScrollActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gesture_scroll);
        ImageView iv = (ImageView) findViewById(R.id.imageView);

        Bitmap image;
        try {
            InputStream in = getAssets().open("android.jpg");
            image = BitmapFactory.decodeStream(in);
            in.close();
        } catch (IOException e) {
            image = null;
        }
        iv.setImageBitmap(image);
    }
}
