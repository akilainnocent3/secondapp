package com.fyber.inneractive.sdk.cache;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44223b;

    public l(String str) {
        this.f44222a = str;
        this.f44223b = String.format("template_%d.html", Integer.valueOf(str.hashCode()));
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return this.f44223b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return this.f44223b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.f44222a;
    }
}
