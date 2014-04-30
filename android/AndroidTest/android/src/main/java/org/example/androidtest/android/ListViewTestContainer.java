package org.example.androidtest.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

/**
 * Created by Hatsune Miku on 4/30/14.
 */
public class ListViewTestContainer extends LinearLayout implements View.OnTouchListener {


    public ListViewTestContainer(Context context) {
        super(context);
    }

    public ListViewTestContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        return false;
    }
}
