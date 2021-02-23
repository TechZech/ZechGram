package com.example.zechgram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("fruu78azPCRlNHBF1EHanxAQ1dL7JVPOeP5IIirQ")
                .clientKey("PbponzFIS38ucgqxNDfDUpzC42SFhYviPBvVFUOu")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
