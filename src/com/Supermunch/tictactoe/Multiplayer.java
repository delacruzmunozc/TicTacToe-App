package com.Supermunch.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Multiplayer extends Activity {
	ImageButton up;
	ImageButton down;
	ImageButton left;
	ImageButton right;
	ImageButton center;
	ImageButton downRight;
	ImageButton downLeft;
	ImageButton upRight;
	public int playerTurn = 1;
	public int[] data = new int[9];
	public Boolean game = true;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.multiplayer);
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
			if (playerTurn == 1)
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
				playerTurn = 2;
			}
			else
			{
				up.setImageResource(R.drawable.lol);
				data[1] = 2;
				if ((checkForWin(2)) == 2)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Player 2 Wins!");
				}
				playerTurn = 1;
			}
		}
	}
	public void downClick(View view)
	{
		if (game == true && data[7] == 0)
			{
			ImageButton down = (ImageButton)findViewById(R.id.ImageButton7);
			if (playerTurn == 1)
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
				playerTurn = 2;
			}
			else
			{
				down.setImageResource(R.drawable.lol);
				data[7] = 2;
				if ((checkForWin(2)) == 2)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Player 2 Wins!");
				}
				playerTurn = 1;
			}
		}
	}
	public void upLeftClick(View view)
	{
		if (game == true && data[0] == 0)
		{
			ImageButton upLeft = (ImageButton)findViewById(R.id.ImageButton0);
			if (playerTurn == 1)
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
				playerTurn = 2;
			}
			else
			{
				upLeft.setImageResource(R.drawable.o);
				data[0] = 2;
				if ((checkForWin(2)) == 2)
				{
					TextView textView = (TextView)findViewById(R.id.textView1);
					textView.setText("Player 2 Wins!");
				}
				playerTurn = 1;
			}
		}
	}
	public void upRightClick(View view)
	{
		if (game == true)
		{
		ImageButton upRight = (ImageButton)findViewById(R.id.ImageButton2);
		if (data[2] == 0)
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
			playerTurn = 2;
		}
		}
	}
	public void centerClick(View view)
	{
		if (game == true)
		{
		ImageButton center = (ImageButton)findViewById(R.id.ImageButton4);
		if (data[4] == 0)
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
			playerTurn = 2;
		}
		}
	}
	public void downLeftClick(View view)
	{
		if (game == true)
		{
		ImageButton downLeft = (ImageButton)findViewById(R.id.ImageButton6);
		if (data[6] == 0)
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
			playerTurn = 2;
		}
		}
	}
	public void downRightClick(View view)
	{
		if (game == true)
		{
		ImageButton downRight = (ImageButton)findViewById(R.id.ImageButton8);
		if (data[8] == 0)
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
			playerTurn = 2;
		}
		}
	}
	public void leftClick(View view)
	{
		ImageButton left = (ImageButton)findViewById(R.id.ImageButton3);
		if (data[3] == 0)
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
			playerTurn = 2;
		}
	}
	public void rightClick(View view)
	{
		if (data[5] == 0)
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
			playerTurn = 2;
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
			return 2;
		}
		else if (data[0] != 0 && data[1] != 0
				&& data[2] != 0 && data[3] != 0
				&& data[4] != 0 && data[5] != 0
				&& data[6] != 0 && data[7] != 0
				&& data[8] != 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}