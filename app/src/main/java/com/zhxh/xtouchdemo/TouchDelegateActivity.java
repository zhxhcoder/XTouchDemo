/*
 *
 * See the file license.txt for copying permission.
 */
package com.zhxh.xtouchdemo;

import android.app.Activity;
import android.os.Bundle;

import com.zhxh.xtouchdemo.widget.TouchDelegateLayout;

public class TouchDelegateActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TouchDelegateLayout layout = new TouchDelegateLayout(this);
        setContentView(layout);
    }
}
