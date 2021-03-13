package com.example.instagramclone;

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
                .applicationId("pC54bb29sk9hIG6JMktBPVczNRhNqV8tRt3SWN7w")
                .clientKey("EgqZ7Ym6JDrOhD9Zlb6TBAUrNHzgNV0pheLr8DnU")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
