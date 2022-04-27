package com.example.service_practice;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // assigning ID of startButton
    // to the object start
    // declaring objects of Button class
    private Button mStart, mStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        // assigning ID of stopButton
        // to the object stop

        mStop = findViewById( R.id.stopButton );
        mStart =  findViewById( R.id.startButton );

        // declaring listeners for the
        // buttons to make them respond
        // correctly according to the process
        
        mStart.setOnClickListener( this );
        mStop.setOnClickListener( this );
    }

    public void onClick(View view) {

        // process to be performed
        // if start button is clicked
        if(view == mStart){

            // starting the service
            startService(new Intent( this, NewService.class ) );
        }

        // process to be performed
        // if stop button is clicked
        else if (view == mStop){

            // stopping the service
            stopService(new Intent( this, NewService.class ) );

        }
    }
}




