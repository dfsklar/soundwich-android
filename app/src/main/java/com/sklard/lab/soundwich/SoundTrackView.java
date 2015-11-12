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
public class SoundTrackView extends RelativeLayout {

    public SoundTrackView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(this, context);
    }

    private void init(ViewGroup vg, Context context) {
        SoundTrackView myself = this;
        ViewGroup.LayoutParams ll = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 35);
        this.setBackgroundColor(0xFF00FF00);
        myself.setLayoutParams(ll);
    }

}
