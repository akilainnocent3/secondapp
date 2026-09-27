package com.tiktok.appevents;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f76013c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f76014d = -2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f76015e = "SDK not initialized";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f76016f = "HTTP error";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f76018b;

    public a(int code, String msg) {
        this.f76017a = code;
        this.f76018b = msg;
    }

    public int a() {
        return this.f76017a;
    }

    public String b() {
        return this.f76018b;
    }

    public void c(int code) {
        this.f76017a = code;
    }

    public void d(String msg) {
        this.f76018b = msg;
    }
}
