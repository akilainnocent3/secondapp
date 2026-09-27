package com.mbridge.msdk.advanced.request;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f64817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f64819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f64820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f64821e;

    public void a(String str) {
        this.f64818b = str;
    }

    public int b() {
        return this.f64820d;
    }

    public int c() {
        return this.f64819c;
    }

    public int d() {
        return this.f64817a;
    }

    public String e() {
        return this.f64818b;
    }

    @NonNull
    public String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f64817a + ", session_id='" + this.f64818b + "', offset=" + this.f64819c + ", expectWidth=" + this.f64820d + ", expectHeight=" + this.f64821e + fw.b.f85383j;
    }

    public int a() {
        return this.f64821e;
    }

    public void b(int i10) {
        this.f64820d = i10;
    }

    public void c(int i10) {
        this.f64819c = i10;
    }

    public void d(int i10) {
        this.f64817a = i10;
    }

    public void a(int i10) {
        this.f64821e = i10;
    }
}
