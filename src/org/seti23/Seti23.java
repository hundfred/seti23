package org.seti23;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
//import android.widget.AnalogClock;

public class Seti23 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageView image = (ImageView) findViewById(R.id.test_image);
        image.setImageResource(R.drawable.s23);        
    
        
    }
}