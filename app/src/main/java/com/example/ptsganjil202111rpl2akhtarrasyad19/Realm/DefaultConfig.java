package com.example.ptsganjil202111rpl2akhtarrasyad19.Realm;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class DefaultConfig extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .name("localDB.db")
                .schemaVersion(0)
                .build();
        Realm.setDefaultConfiguration(configuration);
    }
}
