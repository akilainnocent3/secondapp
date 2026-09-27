package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Networking.EndpointRepository;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EndpointRepository.EndPoint f38145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EndpointRepository.EndPoint f38146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f38148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f38149f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends a0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f38150g = new a();

        public a() {
            super("Banner", EndpointRepository.EndPoint.BANNER_GET, EndpointRepository.EndPoint.BANNER_SHOW, true, false, 16, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 312973325;
        }

        public String toString() {
            return "Banner";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends a0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f38151g = new b();

        public b() {
            super("Interstitial", EndpointRepository.EndPoint.INTERSTITIAL_GET, EndpointRepository.EndPoint.INTERSTITIAL_SHOW, false, false, 24, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 743805773;
        }

        public String toString() {
            return "Interstitial";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends a0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f38152g = new c();

        public c() {
            super("Rewarded", EndpointRepository.EndPoint.REWARDED_GET, EndpointRepository.EndPoint.REWARDED_SHOW, false, false, 8, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1735897263;
        }

        public String toString() {
            return "Rewarded";
        }
    }

    public a0(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z10, boolean z11) {
        this.f38144a = str;
        this.f38145b = endPoint;
        this.f38146c = endPoint2;
        this.f38147d = z10;
        this.f38148e = z11;
        this.f38149f = !z10;
    }

    public final EndpointRepository.EndPoint a() {
        return this.f38145b;
    }

    public final String b() {
        return this.f38144a;
    }

    public final boolean c() {
        return this.f38147d;
    }

    public final EndpointRepository.EndPoint d() {
        return this.f38146c;
    }

    public final boolean e() {
        return this.f38149f;
    }

    public /* synthetic */ a0(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z10, boolean z11, int i10, kotlin.jvm.internal.x xVar) {
        this(str, endPoint, endPoint2, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? true : z11, null);
    }

    public /* synthetic */ a0(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z10, boolean z11, kotlin.jvm.internal.x xVar) {
        this(str, endPoint, endPoint2, z10, z11);
    }
}
