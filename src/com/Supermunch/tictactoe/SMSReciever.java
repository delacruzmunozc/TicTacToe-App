package com.Supermunch.tictactoe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;

public class SMSReciever extends BroadcastReceiver {
	static String message;
	@Override
	 public void onReceive(Context context, Intent intent) {    
	     Bundle pudsBundle = intent.getExtras();
	     Object[] pdus = (Object[]) pudsBundle.get("pdus");
	     SmsMessage messages =SmsMessage.createFromPdu((byte[]) pdus[0]);
	     message = messages.getMessageBody();
	}
	public static String getMessage()
	{
		return message;
	}
}