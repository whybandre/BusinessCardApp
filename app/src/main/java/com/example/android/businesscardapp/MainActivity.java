package com.example.android.businesscardapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called to go to company G Plus (in this example goes to g+ create your page)
     */

    public void goToGPlus(View v) {

        Intent openGPlus = new Intent(Intent.ACTION_VIEW, Uri.parse((getString(R.string.company_gplus))));
        startActivity(openGPlus);

    }

    /**
     * This method is called to go to company Linkedin (in this example goes to linkedin homepage)
     */

    public void goToLinkedin(View v) {

        Intent openLinkedin = new Intent(Intent.ACTION_VIEW, Uri.parse((getString(R.string.company_linkedin))));
        startActivity(openLinkedin);

    }

    /**
     * This method is called to go to company page (in this example goes to example.com)
     */

    public void goToCompanyWebsite(View v) {

        Intent OpenCompanyWebsite = new Intent(Intent.ACTION_VIEW, Uri.parse((getString(R.string.company_website))));
        startActivity(OpenCompanyWebsite);

    }

    /**
     * This method is called to go to a company QR code page (in this example goes to a QR code generator)
     */

    public void showQrCode(View v) {

        Intent OpenCompanyWebsite = new Intent(Intent.ACTION_VIEW, Uri.parse((getString(R.string.company_qrcode))));
        startActivity(OpenCompanyWebsite);

    }

    /**
     * This method is called to call to company phone number
     */

    public void callCompany(View v) {

        Intent callCompanyIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:" + (getString(R.string.company_phone_number))));
        startActivity(callCompanyIntent);

    }


    public void goToAddress(View v) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + (getString(R.string.company_address)));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }


    //An intent for sharing with everyone by any app

    public void shareIntent(View view) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(Intent.EXTRA_TEXT, (getString(R.string.company_name)) + "\n" + (getString(R.string.company_phone_number)) + "\n" + (getString(R.string.company_address)) + "\n" + (getString(R.string.company_open_hours)));
        startActivity(Intent.createChooser(sharingIntent, getString(R.string.for_share)));
    }


}



