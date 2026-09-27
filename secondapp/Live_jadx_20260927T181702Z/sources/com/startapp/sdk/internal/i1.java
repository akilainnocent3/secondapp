package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class i1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f74968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f74969b;

    public i1(Context context, BannerListener bannerListener, View view) {
        this.f74968a = bannerListener;
        this.f74969b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onClick() of " + this.f74968a + " with parameter " + this.f74969b;
            WeakHashMap weakHashMap = si.f75514a;
            Log.println(3, "StartAppSDK", str);
            this.f74968a.onClick(this.f74969b);
        } catch (Throwable th2) {
            String str2 = "Calling method onClick() of " + this.f74968a + " with parameter " + this.f74969b;
            WeakHashMap weakHashMap2 = si.f75514a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f74968a, th2);
        }
    }
}
