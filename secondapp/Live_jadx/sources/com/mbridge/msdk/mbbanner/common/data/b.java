package com.mbridge.msdk.mbbanner.common.data;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f67729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f67730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f67731c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f67732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f67733e;

    public b(String str, String str2, int i10, int i11) {
        this.f67729a = str;
        this.f67730b = str2;
        this.f67732d = i10;
        this.f67733e = i11;
    }

    public void a(int i10) {
        this.f67732d = i10;
    }

    public void b(String str) {
        this.f67730b = str;
    }

    public int c() {
        return this.f67732d;
    }

    public String d() {
        return this.f67730b;
    }

    public String a() {
        return this.f67731c;
    }

    public int b() {
        return this.f67733e;
    }

    public void a(String str) {
        this.f67731c = str;
    }
}
