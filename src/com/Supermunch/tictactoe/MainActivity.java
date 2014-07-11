package com.Supermunch.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText phoneNo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		phoneNo = (EditText)findViewById(R.id.mobileNumber);
	}
	public void singleplayerClick(View view)
	{
		Intent intent = new Intent(this, Singleplayer.class);
		startActivity(intent); 
	}
	public void multiplayerClick(View view)
	{
		Intent intent = new Intent(this, Multiplayer.class);
		startActivity(intent); 
	}
	public void smsMultiplayerClick(View view)
	{
		Intent intent = new Intent(this, SmsMultiplayer.class);
		intent.putExtra("number", phoneNo.getText().toString());
		startActivity(intent);
	}
}