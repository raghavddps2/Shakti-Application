package com.example.android.shakti;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    public void CallHelpline(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0111-23219750"));
        startActivity(intent);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }
    public void DisplayContact(View view){
        Intent i1 = new Intent(this,Trusted_contacts.class);
        startActivity(i1);
    }
    public void BookCab(View view){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
        Uri.parse("13.0329844,77.5621197");
        startActivity(intent);
    }
    public void trouble(View view){
        Intent intent = new Intent(this,trouble.class);
        startActivity(intent);
    }
}
