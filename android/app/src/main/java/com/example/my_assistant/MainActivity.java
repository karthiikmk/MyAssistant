package com.example.my_assistant;

import android.os.Bundle;

import org.devio.flutter.splashscreen.SplashScreen;
import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;


public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    //SplashScreen.show(this, R.style.SplashScreenTheme);
    SplashScreen.show(this, true);// here
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(this);
  }
}
