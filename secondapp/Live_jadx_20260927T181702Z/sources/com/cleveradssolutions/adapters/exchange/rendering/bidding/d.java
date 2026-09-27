package com.cleveradssolutions.adapters.exchange.rendering.bidding;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42099d;

    public d(String str, int i10, int i11) {
        this.f42097b = str;
        this.f42098c = i10;
        this.f42099d = i11;
        this.f42096a = str.contains("<VAST");
    }

    public int a() {
        return this.f42099d;
    }

    public int b() {
        return this.f42098c;
    }

    public String c() {
        return this.f42097b;
    }
}
