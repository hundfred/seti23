package org.seti23;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
//import android.widget.AnalogClock;

public class Seti23 extends Activity implements OnClickListener {
	private Button button_irc;
	private Button button_ticket;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageView image = (ImageView) findViewById(R.id.test_image);
        image.setImageResource(R.drawable.s23);        
    
        button_irc = (Button)findViewById(R.id.button_irc);
        button_irc.setOnClickListener(this);
        button_ticket = (Button)findViewById(R.id.button_ticket);
        button_ticket.setOnClickListener(this);    
    }
	public void onClick(View v) {
		EditText nameField = (EditText) findViewById(R.id.name_field);
		String name = nameField.getText().toString();
		if (name.length() == 0) {
		    new AlertDialog.Builder(this) 
		            .setMessage(R.string.error_name_missing)
		            .setNeutralButton(R.string.error_ok, null)
		            .show();
		    return;
		}
		
		else {
			if ( v==button_irc ) {
				name=name+"_irc_button";
			}
			
			if ( v==button_ticket ) {
				name=name+"_ticket_button";
			}
			new AlertDialog.Builder(this) 			
			.setMessage(name)
			.setNeutralButton(R.string.error_ok, null)
			.show();
			return;
		}
			
			
			
			
			
		
		
		// TODO Auto-generated method stub
		
	}
    
}