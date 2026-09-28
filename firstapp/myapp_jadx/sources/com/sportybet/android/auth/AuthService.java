package com.sportybet.android.auth;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes5.dex */
public class AuthService extends Service {
    private Authenticator mAuthenticator;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mAuthenticator.getIBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mAuthenticator = new Authenticator();
    }
}
