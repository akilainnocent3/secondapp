package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.i8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4329i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f62013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f62015c;

    public C4329i8() {
        this.f62013a = 0;
        this.f62014b = 0;
        this.f62015c = "";
    }

    public int a() {
        return this.f62014b;
    }

    public String b() {
        return this.f62015c;
    }

    public int c() {
        return this.f62013a;
    }

    public boolean d() {
        return this.f62014b > 0 && this.f62013a > 0;
    }

    public boolean e() {
        return this.f62014b == 0 && this.f62013a == 0;
    }

    public String toString() {
        return this.f62015c;
    }

    public C4329i8(int i10, int i11, String str) {
        this.f62013a = i10;
        this.f62014b = i11;
        this.f62015c = str;
    }
}
