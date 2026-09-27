package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.u8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4540u8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f64255c = 1001;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f64257b;

    public C4540u8(int i10, String str) {
        this.f64257b = i10;
        this.f64256a = str == null ? "" : str;
    }

    public int a() {
        return this.f64257b;
    }

    public String b() {
        return this.f64256a;
    }

    public String toString() {
        return "error - code:" + this.f64257b + ", message:" + this.f64256a;
    }
}
