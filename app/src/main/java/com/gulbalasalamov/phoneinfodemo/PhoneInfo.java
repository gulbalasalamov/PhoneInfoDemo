package com.gulbalasalamov.phoneinfodemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class PhoneInfo extends AppCompatActivity {

    TelephonyManager telephonyManager;
    TextView sim, imei, telefon, sebeke, ulkeKodu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_info);

        telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        sim = (TextView) findViewById(R.id.setSimNo);
        imei = (TextView) findViewById(R.id.setImei);
        telefon = (TextView) findViewById(R.id.setTelNo);
        sebeke = (TextView) findViewById(R.id.setSebekeBilgisi);
        ulkeKodu = (TextView) findViewById(R.id.setUlkeKodu);

        if (telephonyManager.getSimSerialNumber() != null)
            sim.setText(telephonyManager.getSimSerialNumber());
        if (telephonyManager.getLine1Number() != null)
            telefon.setText(telephonyManager.getLine1Number());
        if (telephonyManager.getNetworkOperatorName() != null)
            sebeke.setText(telephonyManager.getNetworkOperatorName());
        if (telephonyManager.getSimCountryIso() != null)
            ulkeKodu.setText(telephonyManager.getSimCountryIso());
        if (telephonyManager.getDeviceId() != null)
            imei.setText(telephonyManager.getDeviceId());


    }
}
