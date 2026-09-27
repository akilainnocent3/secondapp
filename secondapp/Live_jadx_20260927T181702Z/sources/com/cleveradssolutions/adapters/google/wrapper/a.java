package com.cleveradssolutions.adapters.google.wrapper;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends NativeAd.Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f43073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f43074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f43075c;

    public a(Uri uri, Drawable drawable, double d10) {
        this.f43073a = uri;
        this.f43074b = drawable;
        this.f43075c = d10;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public Drawable getDrawable() {
        return this.f43074b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public double getScale() {
        return this.f43075c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public Uri getUri() {
        return this.f43073a;
    }
}
