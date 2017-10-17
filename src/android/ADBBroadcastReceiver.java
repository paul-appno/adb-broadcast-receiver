package com.adobe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.adobe.mobile.Analytics;

public class ADBBroadcastReceiver extends BroadcastReceiver {
  @Override
  public void onReceive(Context c, Intent i) {
      com.adobe.mobile.Analytics.processReferrer(c, i);
  }
}
