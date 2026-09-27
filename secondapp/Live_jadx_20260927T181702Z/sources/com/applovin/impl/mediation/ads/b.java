package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.f3;
import com.applovin.impl.h8;
import com.applovin.impl.i8;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b implements i8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f27710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f3 f27711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i8 f27712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h8 f27713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0267a f27714e;

    public b(f3 f3Var, ViewGroup viewGroup, a.InterfaceC0267a interfaceC0267a, com.applovin.impl.sdk.l lVar) {
        this.f27710a = lVar;
        this.f27711b = f3Var;
        this.f27714e = interfaceC0267a;
        this.f27713d = new h8(viewGroup, lVar);
        i8 i8Var = new i8(viewGroup, lVar, this);
        this.f27712c = i8Var;
        i8Var.a(f3Var);
        lVar.Q();
        if (com.applovin.impl.sdk.p.a()) {
            lVar.Q().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + gi.j.f86771d);
        }
    }

    public void a() {
        this.f27712c.b();
    }

    public f3 b() {
        return this.f27711b;
    }

    public void c() {
        this.f27710a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f27710a.Q().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f27711b.x0().compareAndSet(false, true)) {
            this.f27710a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f27710a.Q().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f27711b.getNativeAd().isExpired()) {
                com.applovin.impl.sdk.p.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f27710a.f().a(this.f27711b);
            }
            this.f27710a.Z().processRawAdImpression(this.f27711b, this.f27714e);
        }
    }

    @Override // com.applovin.impl.i8.a
    public void onLogVisibilityImpression() {
        a(this.f27713d.a(this.f27711b));
    }

    private void a(long j10) {
        if (this.f27711b.y0().compareAndSet(false, true)) {
            this.f27710a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f27710a.Q().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f27710a.Z().processViewabilityAdImpressionPostback(this.f27711b, j10, this.f27714e);
        }
    }
}
