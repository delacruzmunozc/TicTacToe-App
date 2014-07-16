package com.Supermunch.tictactoe;

import java.util.Random;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Singleplayer extends Activity {
	ImageButton piece;
	ImageButton down;
	ImageButton left;
	ImageButton right;
	ImageButton center;
	ImageButton downRight;
	ImageButton downLeft;
	ImageButton upRight;
	public int[] data = new int[9];
	public Boolean game = true;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.singleplayer);
		for (int i = 0; i < 9; i++)
		{
			data[i] = 0;
		}
	}
	public void upClick(View view)
	{
		if (playPiece(1, 1) == true)
		{
			computerPlay();
		}
	}
	public void downClick(View view)
	{
		if (playPiece(1, 7) == true)
		{
			computerPlay();
		}
	}
	public void upLeftClick(View view)
	{
		if (playPiece(1, 0) == true)
		{
			computerPlay();
		}
	}
	public void upRightClick(View view)
	{
		if (playPiece(1, 2) == true)
		{
			computerPlay();
		}
	}
	public void centerClick(View view)
	{
		if (playPiece(1, 4) == true)
		{
			computerPlay();
		}
	}
	public void downLeftClick(View view)
	{
		if (playPiece(1, 6) == true)
		{
			computerPlay();
		}
	}
	public void downRightClick(View view)
	{
		if (playPiece(1, 8) == true)
		{
			computerPlay();
		}
	}
	public void leftClick(View view)
	{
		if (playPiece(1, 3) == true)
		{
			computerPlay();
		}
	}
	public void rightClick(View view)
	{
		if (playPiece(1, 5) == true)
		{
			computerPlay();
		}
	}
	public void computerPlay()
	{
		if (((data[0] == 2 && data[8] == 2)
		 || (data[1] == 2 && data[7] == 2)
		 || (data[2] == 2 && data[6] == 2)
		 || (data[3] == 2 && data[5] == 2))
		 && data[4] == 0)
		{
			playPiece(2, 4);
		}
		else if (((data[0] == 2 && data[1] == 2)
			    || (data[5] == 2 && data[8] == 2)
			    || (data[7] == 2 && data[4] == 2))
			    && data[2] == 0)
		{
			playPiece(2, 2);
		}
		else if (((data[2] == 2 && data[1] == 2)
			  || (data[4] == 2 && data[6] == 2)
			  || (data[8] == 2 && data[4] == 2))
			  && data[0] == 0)
		{
			playPiece(2, 0);
		}
		else if (((data[0] == 2 && data[3] == 2)
			  || (data[7] == 2 && data[8] == 2)
			  || (data[2] == 2 && data[4] == 2))
			  && data[6] == 0)
		{
			playPiece(2, 6);
		}
		else if (((data[7] == 2 && data[6] == 2)
			  || (data[5] == 2 && data[2] == 2)
			  || (data[0] == 2 && data[4] == 2))
			  && data[8] == 0)
		{
			playPiece(2, 8);
		}
		else if (((data[0] == 2 && data[2] == 2)
				|| (data[4] == 2 && data[7] == 2))
				&& data[1] == 0)
		{
			playPiece(2, 1);
		}
		else if (((data[0] == 2 && data[6] == 2)
				|| (data[4] == 2 && data[5] == 2))
			  	&& data[3] == 0)
		{
			playPiece(2, 3);
		}
		else if (((data[1] == 2 && data[4] == 2)
				|| (data[6] == 2 && data[8] == 2))
		  		&& data[7] == 0)
		{
			playPiece(2, 7);
		}
		else if (((data[8] == 2 && data[2] == 2)
				|| (data[4] == 2 && data[3] == 2))
		  		&& data[5] == 0)
		{
			playPiece(2, 5);
		}
		else
		{
			if (((data[0] == 1 && data[8] == 1)
			   || (data[1] == 1 && data[7] == 1)
			   || (data[2] == 1 && data[6] == 1)
			   || (data[3] == 1 && data[5] == 1))
			   && data[4] == 0)
			{
				playPiece(2, 4);
			}
			else if (((data[0] == 1 && data[1] == 1)
					|| (data[5] == 1 && data[8] == 1)
					|| (data[6] == 1 && data[4] == 1))
					&& data[2] == 0)
			{
				playPiece(2, 2);
			}
			else if (((data[2] == 1 && data[1] == 1)
					|| (data[3] == 1 && data[6] == 1)
					|| (data[8] == 1 && data[4] == 1))
					&& data[0] == 0)
			{
				playPiece(2, 0);
			}
			else if (((data[0] == 1 && data[3] == 1)
					|| (data[7] == 1 && data[8] == 1)
					|| (data[2] == 1 && data[4] == 1))
					&& data[6] == 0)
			{
				playPiece(2, 6);
			}
			else if (((data[7] == 1 && data[6] == 1)
				  || (data[5] == 1 && data[2] == 1)
				  || (data[0] == 1 && data[4] == 1))
				  && data[8] == 0)
			{
				playPiece(2, 8);
			}
			else if (((data[0] == 1 && data[2] == 1)
					|| data[4] == 1 && data[7] == 1)
					&& data[1] == 0)
			{
				playPiece(2, 1);
			}
			else if (((data[0] == 1 && data[6] == 1)
					|| data[4] == 1 && data[5] == 1)
					&& data[3] == 0)
			{
				playPiece(2, 3);
			}
			else if (((data[1] == 1 && data[4] == 1)
					|| data[6] == 1 && data[8] == 1)
					&& data[7] == 0)
			{
				playPiece(2, 7);
			}
			else if (((data[8] == 1 && data[2] == 1)
					|| data[4] == 1 && data[3] == 1)
					&& data[5] == 0)
			{
				playPiece(2, 5);
			}
			else
			{
				Random generator = new Random();
				int randomInt = generator.nextInt(9);
				Boolean bool = true;
				while (bool == true)
				{
					if (data[randomInt] == 0)
					{
						playPiece(2, randomInt);
					}
				}
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
	public Boolean playPiece(int player, int location)
	{
		if (data[location] == 0 && game == true)
		{
			data[location] = player;
			if ((checkForWin(player)) == 2)
			{
				TextView textView = (TextView)findViewById(R.id.textView1);
				if (player == 1)
				{
					textView.setText("You Win!");
				}
				else
				{
					textView.setText("You Lose!");
				}
			}
			else if ((checkForWin(player)) == 1)
			{
				TextView textView = (TextView)findViewById(R.id.textView1);
				textView.setText("Tie");
			}
			if (player == 1)
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
			}
			if (player == 2)
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
			}
			return true;
		}
		else
		{
			return false;
		}
	}
}