package com.startapp.sdk.internal;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f75008a;

    public ik(View view, Point point, BannerOptions bannerOptions, com.startapp.sdk.ads.banner.bannerstandard.e eVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f75008a = handler;
        handler.postDelayed(new hk(this, new WeakReference(view), point, bannerOptions, eVar), 100L);
    }
}
