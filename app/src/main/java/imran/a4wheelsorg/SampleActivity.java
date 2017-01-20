package imran.a4wheelsorg;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.github.jjobes.slidedatetimepicker.SlideDateTimeListener;
import com.github.jjobes.slidedatetimepicker.SlideDateTimePicker;

import java.text.SimpleDateFormat;
import java.util.Date;

import imran.a4wheels.R;


@SuppressLint("SimpleDateFormat")
public class SampleActivity extends FragmentActivity
{
    private SimpleDateFormat mFormatter = new SimpleDateFormat("MMMM dd yyyy hh:mm aa");
    private Button mButton;
    private Button nButton;

    private SlideDateTimeListener listener = new SlideDateTimeListener() {

        @Override
        public void onDateTimeSet(Date date)
        {
            Toast.makeText(SampleActivity.this,
                    mFormatter.format(date), Toast.LENGTH_SHORT).show();
        }

        // Optional cancel listener
        @Override
        public void onDateTimeCancel()
        {
            Toast.makeText(SampleActivity.this,
                    "Canceled", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sample);



        mButton = (Button) findViewById(R.id.button);
        nButton=(Button) findViewById(R.id.button1);
        nButton.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                new SlideDateTimePicker.Builder(getSupportFragmentManager())
                        .setListener(listener)
                        .setInitialDate(new Date())
                        //.setMinDate(minDate)
                        //.setMaxDate(maxDate)
                        //.setIs24HourTime(true)
                        //.setTheme(SlideDateTimePicker.HOLO_DARK)
                        //.setIndicatorColor(Color.parseColor("#990000"))
                        .build()
                        .show();

            }
                                   });
        mButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v)
            {

                new SlideDateTimePicker.Builder(getSupportFragmentManager())
                    .setListener(listener)
                    .setInitialDate(new Date())
                    //.setMinDate(minDate)
                    //.setMaxDate(maxDate)
                    //.setIs24HourTime(true)
                    //.setTheme(SlideDateTimePicker.HOLO_DARK)
                    //.setIndicatorColor(Color.parseColor("#990000"))
                    .build()
                    .show();
            }
        });
    }
}
