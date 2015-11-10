package com.sklard.lab.soundwich;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by sklard on 11/9/15.
 */
public class SoundBiteView extends RelativeLayout {

    public SoundBiteView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(this, context);
    }

    private void init(ViewGroup vg, Context context) {
        SoundBiteView myself = (SoundBiteView) (LayoutInflater.from(context).
                inflate(R.layout.view_soundbite, vg, true));
        ViewGroup.LayoutParams ll = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        myself.setLayoutParams(ll);
    }


}
