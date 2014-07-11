package com.Supermunch.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SmsMultiplayer extends Activity {
	ImageButton up;
	ImageButton down;
	ImageButton left;
	ImageButton right;
	ImageButton center;
	ImageButton downRight;
	ImageButton downLeft;
	ImageButton upRight;
	public Boolean playerTurn = true;
	public int[] data = new int[9];
	public Boolean game = true;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.smsmultiplayer);
		for (int i = 0; i < 9; i++)
		{
			data[i] = 0;
		}
	}
	public void upClick(View view)
	{
		if (game == true && data[1] == 0)
		{
			ImageButton up = (ImageButton)findViewById(R.id.ImageButton1);
			if (playerTurn == true)
			{
				up.setImageResource(R.drawable.lxl);
				data[1] = 1;
				if ((checkForWin(1)) == 2)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Player 1 Wins!");
				}
				else if ((checkForWin(1)) == 1)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Tie");
				}
				playerTurn = false;
			}
		}
	}
	public void downClick(View view)
	{
		if (game == true && data[7] == 0)
			{
			ImageButton down = (ImageButton)findViewById(R.id.ImageButton7);
			if (playerTurn == true)
			{
				down.setImageResource(R.drawable.lxl);
				data[7] = 1;
				if ((checkForWin(1)) == 2)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Player 1 Wins!");
				}
				else if ((checkForWin(1)) == 1)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Tie");
				}
				playerTurn = false;
			}
		}
	}
	public void upLeftClick(View view)
	{
		if (game == true && data[0] == 0)
		{
			ImageButton upLeft = (ImageButton)findViewById(R.id.ImageButton0);
			if (playerTurn == true)
			{
				upLeft.setImageResource(R.drawable.x);
				data[0] = 1;
				if ((checkForWin(1)) == 2)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Player 1 Wins!");
				}
				else if ((checkForWin(1)) == 1)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Tie");
				}
				playerTurn = false;
			}
		}
	}
	public void upRightClick(View view)
	{
		if (game == true && data[2] == 0)
		{
			ImageButton upRight = (ImageButton)findViewById(R.id.ImageButton2);
			if (playerTurn == true)
			{
				upRight.setImageResource(R.drawable.x);
				data[2] = 1;
				if ((checkForWin(1)) == 2)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Player 1 Wins!");
				}
				else if ((checkForWin(1)) == 1)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Tie");
				}
				playerTurn = false;
			}
		}
	}
	public void centerClick(View view)
	{
		if (game == true && data[4] == 0)
		{
			ImageButton center = (ImageButton)findViewById(R.id.ImageButton4);
			if (playerTurn == true)
			{
				center.setImageResource(R.drawable._lxl_);
				data[4] = 1;
				if ((checkForWin(1)) == 2)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Player 1 Wins!");
				}
				else if ((checkForWin(1)) == 1)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Tie");
				}
				playerTurn = false;
			}
		}
	}
	public void downLeftClick(View view)
	{
		if (game == true && data[6] == 0)
		{
			ImageButton downLeft = (ImageButton)findViewById(R.id.ImageButton6);
			if (playerTurn == true)
			{
				downLeft.setImageResource(R.drawable.x);
				data[6] = 1;
				if ((checkForWin(1)) == 2)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Player 1 Wins!");
				}
				else if ((checkForWin(1)) == 1)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Tie");
				}
				playerTurn = false;
			}
		}
	}
	public void downRightClick(View view)
	{
		if (game == true && data[8] == 0)
		{
			ImageButton downRight = (ImageButton)findViewById(R.id.ImageButton8);
			if (playerTurn == true)
			{
				downRight.setImageResource(R.drawable.x);
				data[8] = 1;
				if ((checkForWin(1)) == 2)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Player 1 Wins!");
				}
				else if ((checkForWin(1)) == 1)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Tie");
				}
				playerTurn = false;
			}
		}
	}
	public void leftClick(View view)
	{
		if (game == true && data[3] == 0)
		{
			ImageButton left = (ImageButton)findViewById(R.id.ImageButton3);
			if (playerTurn == true)
			{
				left.setImageResource(R.drawable._x_);
				data[3] = 1;
				if ((checkForWin(1)) == 2)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Player 1 Wins!");
				}
				else if ((checkForWin(1)) == 1)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Tie");
				}
				playerTurn = false;
			}
		}
	}
	public void rightClick(View view)
	{
		if (game == true && data[5] == 0)
		{
			if (playerTurn == true)
			{
				ImageButton right = (ImageButton)findViewById(R.id.ImageButton5);
				right.setImageResource(R.drawable._x_);
				data[5] = 1;
				if ((checkForWin(1)) == 2)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Player 1 Wins!");
				}
				else if ((checkForWin(1)) == 1)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Tie");
				}
				playerTurn = false;
			}
		}
	}
	public int checkForWin(int player)
	{
		if ((data[0] == player && data[1] == player && data[2] == player)
		 || (data[3] == player && data[4] == player && data[5] == player)
		 || (data[6] == player && data[7] == player && data[8] == player)
		 || (data[0] == player && data[4] == player && data[8] == player)
		 || (data[2] == player && data[4] == player && data[6] == player)
		 || (data[0] == player && data[3] == player && data[6] == player)
		 || (data[1] == player && data[4] == player && data[7] == player)
		 || (data[2] == player && data[5] == player && data[8] == player))
		{
			game = false;
			return 2;
		}
		else if (data[0] != 0 && data[1] != 0
				&& data[2] != 0 && data[3] != 0
				&& data[4] != 0 && data[5] != 0
				&& data[6] != 0 && data[7] != 0
				&& data[8] != 0)
		{
			game = false;
			return 1;
		}
		else
		{
			return 0;
		}
	}
}