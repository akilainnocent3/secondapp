package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class h1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f74939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f74940b;

    public h1(Context context, BannerListener bannerListener, View view) {
        this.f74939a = bannerListener;
        this.f74940b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onImpression() of " + this.f74939a + " with parameter " + this.f74940b;
            WeakHashMap weakHashMap = si.f75514a;
            Log.println(3, "StartAppSDK", str);
            this.f74939a.onImpression(this.f74940b);
        } catch (Throwable th2) {
            String str2 = "Calling method onImpression() of " + this.f74939a + " with parameter " + this.f74940b;
            WeakHashMap weakHashMap2 = si.f75514a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f74939a, th2);
        }
    }
}
