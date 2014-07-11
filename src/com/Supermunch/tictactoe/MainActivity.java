package com.Supermunch.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
		startActivity(intent);
	}
}