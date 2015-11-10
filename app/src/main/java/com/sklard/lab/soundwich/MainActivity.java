package com.sklard.lab.soundwich;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnTouch;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.imageView)
    ImageView draggableImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if (3 == 5) {
            draggableImageView.setOnDragListener(new View.OnDragListener() {

                                                     @Override
                                                     public boolean onDrag(View v, DragEvent event) {
                                                         // Defines a variable to store the action type for the incoming event
                                                         final int action = event.getAction();

                                                         // Handles each of the expected events
                                                         switch (action) {
                                                             case DragEvent.ACTION_DRAG_STARTED:
                                                                 return true;
                                                             case DragEvent.ACTION_DRAG_LOCATION:
                                                                 Log.i("DRAG", "Location");
                                                                 return true;
                                                             case DragEvent.ACTION_DROP:
                                                                 return true;
                                                         }
                                                         return true;
                                                     }
                                                 }
            );
        }


        draggableImageView.setOnTouchListener(new View.OnTouchListener() {

                                                  @Override
                                                  public boolean onTouch(View v, MotionEvent event) {
                                                      // Defines a variable to store the action type for the incoming event
                                                      final int action = event.getAction();

                                                      // Handles each of the expected events
                                                      switch (action) {
                                                          case MotionEvent.ACTION_DOWN:
                                                              return true;
                                                          case MotionEvent.ACTION_MOVE:
                                                              Log.i("DRAG", "Move");
                                                              return true;
                                                          case MotionEvent.ACTION_UP:
                                                              return true;
                                                      }
                                                      return true;
                                                  }
                                              }
        );

    }
}
