package com.sports.live.football.tv;

import android.app.Application;
import com.sports.live.football.tv.adsData.AppOpenManager;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class MyApp extends Application {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    public AppOpenManager f73076b;

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        this.f73076b = new AppOpenManager(this);
        cp.a.f77054a.b(this);
    }
}
