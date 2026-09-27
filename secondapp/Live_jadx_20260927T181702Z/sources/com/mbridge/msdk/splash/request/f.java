package com.mbridge.msdk.splash.request;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f69283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f69284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69287e;

    public void a(String str) {
        this.f69284b = str;
    }

    public int b() {
        return this.f69286d;
    }

    public int c() {
        return this.f69285c;
    }

    public int d() {
        return this.f69283a;
    }

    public String e() {
        return this.f69284b;
    }

    @NonNull
    public String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f69283a + ", session_id='" + this.f69284b + "', offset=" + this.f69285c + ", expectWidth=" + this.f69286d + ", expectHeight=" + this.f69287e + fw.b.f85383j;
    }

    public int a() {
        return this.f69287e;
    }

    public void b(int i10) {
        this.f69286d = i10;
    }

    public void c(int i10) {
        this.f69285c = i10;
    }

    public void d(int i10) {
        this.f69283a = i10;
    }

    public void a(int i10) {
        this.f69287e = i10;
    }
}
