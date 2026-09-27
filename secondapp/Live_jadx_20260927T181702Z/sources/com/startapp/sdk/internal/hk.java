package com.startapp.sdk.internal;

import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class hk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f74958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Point f74959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BannerOptions f74960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.bannerstandard.e f74961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ik f74962e;

    public hk(ik ikVar, WeakReference weakReference, Point point, BannerOptions bannerOptions, com.startapp.sdk.ads.banner.bannerstandard.e eVar) {
        this.f74962e = ikVar;
        this.f74958a = weakReference;
        this.f74959b = point;
        this.f74960c = bannerOptions;
        this.f74961d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jk jkVarA = fk.a((View) this.f74958a.get(), this.f74959b, this.f74960c, new AtomicReference(), true);
        this.f74961d.a(jkVarA.f75066d == null, jkVarA);
        this.f74962e.f75008a.postDelayed(this, 100L);
    }
}
