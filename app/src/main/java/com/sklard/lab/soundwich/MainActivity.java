package com.sklard.lab.soundwich;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnTouch;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.root)
    RelativeLayout root;

    RelativeLayout draggableImageView;

    int activePointerId;
    float lastX, lastY;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        draggableImageView = new SoundBiteView(this, null);
        root.addView(draggableImageView);

        draggableImageView.setOnTouchListener(new View.OnTouchListener() {

                                                  @Override
                                                  public boolean onTouch(View v, MotionEvent event) {
                                                      // Defines a variable to store the action type for the incoming event
                                                      final int action = event.getAction();

                                                      // Handles each of the expected events
                                                      switch (action & MotionEvent.ACTION_MASK) {

                                                          case MotionEvent.ACTION_DOWN: {
                                                              final float x = event.getX();
                                                              final float y = event.getY();
                                                              lastX = x;
                                                              lastY = y;
                                                              activePointerId = event.getPointerId(0);
                                                              break;
                                                          }

                                                          case MotionEvent.ACTION_MOVE: {
                                                              // Where the user's finger is during the drag
                                                              final int pointerIndex = event.findPointerIndex(activePointerId);
                                                              final float x = event.getX(pointerIndex);
                                                              final float y = event.getY(pointerIndex);

                                                              // Calculate change in x and change in y
                                                              final float dx = x - lastX;
                                                              final float dy = y - lastY;

                                                              // Update the margins to move the view
                                                              if (draggableImageView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                                                                  ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) draggableImageView.getLayoutParams();
                                                                  p.leftMargin += dx;
                                                                  // p.topMargin += dy;
                                                                  draggableImageView.setLayoutParams(p);
                                                              }

                                                              draggableImageView.invalidate();
                                                              break;
                                                          }
                                                          case MotionEvent.ACTION_UP:

                                                              return true;
                                                      }
                                                      return true;
                                                  }
                                              }
        );

    }
}
