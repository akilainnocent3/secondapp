package com.tiktok.appevents;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f76021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f76022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f76023c;

    public b(String googleInstallReferrer, long gpReferrerInstallTs, long gpReferrerClickTs) {
        this.f76021a = googleInstallReferrer;
        this.f76022b = gpReferrerInstallTs;
        this.f76023c = gpReferrerClickTs;
    }

    public String a() {
        return this.f76021a;
    }

    public long b() {
        return this.f76023c;
    }

    public long c() {
        return this.f76022b;
    }

    public void d(String googleInstallReferrer) {
        this.f76021a = googleInstallReferrer;
    }

    public void e(long gpReferrerClickTs) {
        this.f76023c = gpReferrerClickTs;
    }

    public void f(long gpReferrerInstallTs) {
        this.f76022b = gpReferrerInstallTs;
    }
}
