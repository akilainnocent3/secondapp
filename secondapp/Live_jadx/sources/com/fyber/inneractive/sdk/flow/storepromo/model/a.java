package com.fyber.inneractive.sdk.flow.storepromo.model;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f44950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44952c;

    public a(String str, b bVar) {
        this.f44951b = str;
        this.f44950a = bVar;
        this.f44952c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f44952c - ((a) obj).f44952c;
    }

    public a(String str, b bVar, int i10) {
        this.f44951b = str;
        this.f44950a = bVar;
        this.f44952c = i10;
    }
}
