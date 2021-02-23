package com.example.zechgram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("fruu78azPCRlNHBF1EHanxAQ1dL7JVPOeP5IIirQ")
                .clientKey("PbponzFIS38ucgqxNDfDUpzC42SFhYviPBvVFUOu")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
