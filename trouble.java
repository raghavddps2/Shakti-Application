package com.example.android.shakti;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class trouble extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trouble);
    }
    public void SosMessage(View view){

        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.putExtra("sms_body", "Hey, I am in trouble! Please help me out!!");
        sendIntent.setType("vnd.android-dir/mms-sms");
        startActivity(sendIntent);
    }
    public void RaiseRequest(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://savewomen.createaforum.com/"));
        startActivity(intent);
    }
    public void ShareRealLocation(View view){

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/html");
        intent.putExtra(Intent.EXTRA_EMAIL, "emailaddress@emailaddress.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Trouble!!!");
        intent.putExtra(Intent.EXTRA_TEXT, "I am in a trouble!! My location co-ordinates are 13.0329844,77.5621197");

        startActivity(Intent.createChooser(intent, "Send Email"));
    }
    public void shareWhatsappLocation(View view){

        Intent sendIntent = new Intent();
        sendIntent.setPackage("com.whatsapp");
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Hey, I am in trouble! Please help me out!!");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }

}
