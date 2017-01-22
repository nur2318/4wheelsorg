package imran.a4wheelsorg;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.AutocompletePrediction;
import com.google.android.gms.location.places.AutocompletePredictionBuffer;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.model.LatLngBounds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import imran.a4wheels.R;

public class myactivity extends AppCompatActivity {


    Button rent,list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myactivity);
         rent=(Button)  findViewById(R.id.rent);
       final MediaPlayer ren= MediaPlayer.create(this, R.raw.but);

        list = (Button) findViewById(R.id.list);
        rent.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v){

               Intent myintend=new Intent(v.getContext(), SampleActivity.class);
               startActivityForResult(myintend,0);
               ren.start();




        }

        });
        list.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){

               Intent myintend=new Intent(v.getContext(), SecondActivity.class);
               startActivityForResult(myintend,0);

            ren.start();
            }
        });

     }


}
