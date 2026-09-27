package com.startapp.sdk.internal;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerCreator;
import com.startapp.sdk.ads.banner.BannerListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class m1 implements BannerCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f75161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f75162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.d f75163c;

    public m1(com.startapp.sdk.ads.banner.d dVar, View view) {
        this.f75163c = dVar;
        this.f75162b = view;
    }

    @Override // com.startapp.sdk.ads.banner.BannerCreator
    public final View create(Context context, BannerListener bannerListener) {
        if (this.f75161a) {
            throw new IllegalStateException();
        }
        com.startapp.sdk.ads.banner.d dVar = this.f75163c;
        dVar.f74064a = bannerListener;
        View view = this.f75162b;
        dVar.f74065b = view;
        view.addOnAttachStateChangeListener(new l1(this));
        this.f75161a = true;
        return this.f75162b;
    }
}
