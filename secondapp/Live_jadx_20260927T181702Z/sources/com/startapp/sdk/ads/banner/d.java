package com.startapp.sdk.ads.banner;

import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.external.ExternalAdTracking;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.b9;
import com.startapp.sdk.internal.c0;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.m1;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BannerListener f74064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f74065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74066c = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f74067d = com.startapp.sdk.internal.g.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f74068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f74069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Point f74070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f74071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MetaData f74073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ BannerRequest f74074k;

    public d(BannerRequest bannerRequest, BannerRequest.Callback callback, AdPreferences adPreferences, Point point, AdUnitConfig adUnitConfig, int i10, MetaData metaData) {
        this.f74074k = bannerRequest;
        this.f74068e = callback;
        this.f74069f = adPreferences;
        this.f74070g = point;
        this.f74071h = adUnitConfig;
        this.f74072i = i10;
        this.f74073j = metaData;
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a() {
    }

    @Override // com.startapp.sdk.internal.c0
    public final void c() {
        BannerListener bannerListener = this.f74064a;
        if (bannerListener != null) {
            bannerListener.onClick(this.f74065b);
        }
        g0.a(this.f74074k.context, this.f74073j.c(), new ExternalAdTracking(this.f74066c, this.f74074k.adPreferences.getAdTag(), this.f74071h.getSioPrice(), this.f74071h.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f74067d, null, "DISABLED", this.f74070g, "BANNER"));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void d() {
        BannerListener bannerListener = this.f74064a;
        if (bannerListener != null) {
            bannerListener.onImpression(this.f74065b);
        }
        b9.a(this.f74074k.context, Collections.singletonList(this.f74073j.B()), (TrackingParams) new ExternalAdTracking(this.f74066c, this.f74074k.adPreferences.getAdTag(), this.f74071h.getSioPrice(), this.f74071h.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f74067d, null, "DISABLED", this.f74070g, "BANNER"));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(View view) {
        if (view == null) {
            this.f74068e.onFinished(null, "No view returned");
        } else {
            this.f74068e.onFinished(new m1(this, view), null);
            this.f74074k.sendInfoAdRequest(true, this.f74066c, this.f74067d, this.f74069f, this.f74070g, this.f74071h, this.f74072i);
        }
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(String str) {
        this.f74068e.onFinished(null, str);
        this.f74074k.sendInfoAdRequest(false, this.f74066c, this.f74067d, this.f74069f, this.f74070g, this.f74071h, this.f74072i);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void b() {
    }
}
