package com.Supermunch.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Multiplayer extends Activity {
	ImageButton piece;
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
		playPiece(1);
	}
	public void downClick(View view)
	{
		playPiece(7);
	}
	public void upLeftClick(View view)
	{
		playPiece(0);
	}
	public void upRightClick(View view)
	{
		playPiece(2);
	}
	public void centerClick(View view)
	{
		playPiece(4);
	}
	public void downLeftClick(View view)
	{
		playPiece(6);
	}
	public void downRightClick(View view)
	{
		playPiece(8);
	}
	public void leftClick(View view)
	{
		playPiece(3);
	}
	public void rightClick(View view)
	{
		playPiece(5);
	}
	public int checkForWin()
	{
		if ((data[0] == playerTurn&& data[1] == playerTurn && data[2] == playerTurn)
		 || (data[3] == playerTurn && data[4] == playerTurn && data[5] == playerTurn)
		 || (data[6] == playerTurn && data[7] == playerTurn && data[8] == playerTurn)
		 || (data[0] == playerTurn && data[4] == playerTurn && data[8] == playerTurn)
		 || (data[2] == playerTurn && data[4] == playerTurn && data[6] == playerTurn)
		 || (data[0] == playerTurn && data[3] == playerTurn && data[6] == playerTurn)
		 || (data[1] == playerTurn && data[4] == playerTurn && data[7] == playerTurn)
		 || (data[2] == playerTurn && data[5] == playerTurn && data[8] == playerTurn))
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
	public Boolean playPiece(int location)
	{
		if (data[location] == 0 && game == true)
		{
			data[location] = playerTurn;
			if ((checkForWin()) == 2)
			{
				TextView textView = (TextView)findViewById(R.id.textView1);
				if (playerTurn == 1)
				{
					textView.setText("Player 1 Wins!");
				}
				else
				{
					textView.setText("Player 2 Wins!");
				}
			}
			else if ((checkForWin()) == 1)
			{
				TextView textView = (TextView)findViewById(R.id.textView1);
				textView.setText("Tie");
			}
			if (playerTurn == 1)
			{
				switch (location)
				{
				case 0:
					piece = (ImageButton)findViewById(R.id.ImageButton0);
					piece.setImageResource(R.drawable.x);
					break;
				case 1:
					piece = (ImageButton)findViewById(R.id.ImageButton1);
					piece.setImageResource(R.drawable.lxl);
					break;
				case 2:
					piece = (ImageButton)findViewById(R.id.ImageButton2);
					piece.setImageResource(R.drawable.x);
					break;
				case 3:
					piece = (ImageButton)findViewById(R.id.ImageButton3);
					piece.setImageResource(R.drawable._x_);
					break;
				case 4:
					piece = (ImageButton)findViewById(R.id.ImageButton4);
					piece.setImageResource(R.drawable._lxl_);
					break;
				case 5:
					piece = (ImageButton)findViewById(R.id.ImageButton5);
					piece.setImageResource(R.drawable._x_);
					break;
				case 6:
					piece = (ImageButton)findViewById(R.id.ImageButton6);
					piece.setImageResource(R.drawable.x);
					break;
				case 7:
					piece = (ImageButton)findViewById(R.id.ImageButton7);
					piece.setImageResource(R.drawable.lxl);
					break;
				case 8:
					piece = (ImageButton)findViewById(R.id.ImageButton8);
					piece.setImageResource(R.drawable.x);
					break;
				}
				playerTurn = 2;
			}
			if (playerTurn == 2)
			{
				switch (location)
				{
				case 0:
					piece = (ImageButton)findViewById(R.id.ImageButton0);
					piece.setImageResource(R.drawable.o);
					break;
				case 1:
					piece = (ImageButton)findViewById(R.id.ImageButton1);
					piece.setImageResource(R.drawable.lol);
					break;
				case 2:
					piece = (ImageButton)findViewById(R.id.ImageButton2);
					piece.setImageResource(R.drawable.o);
					break;
				case 3:
					piece = (ImageButton)findViewById(R.id.ImageButton3);
					piece.setImageResource(R.drawable._o_);
					break;
				case 4:
					piece = (ImageButton)findViewById(R.id.ImageButton4);
					piece.setImageResource(R.drawable._lol_);
					break;
				case 5:
					piece = (ImageButton)findViewById(R.id.ImageButton5);
					piece.setImageResource(R.drawable._o_);
					break;
				case 6:
					piece = (ImageButton)findViewById(R.id.ImageButton6);
					piece.setImageResource(R.drawable.o);
					break;
				case 7:
					piece = (ImageButton)findViewById(R.id.ImageButton7);
					piece.setImageResource(R.drawable.lol);
					break;
				case 8:
					piece = (ImageButton)findViewById(R.id.ImageButton8);
					piece.setImageResource(R.drawable.o);
					break;
				}
				playerTurn = 1;
			}
			return true;
		}
		else
		{
			return false;
		}
	}
}