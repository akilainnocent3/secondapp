package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hnv {
    private long hww = 10000;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private long f36226tq = 10000;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private long f36225sd = 10;
    private long vy = 20;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private String f36224hv = "";

    public String hv() {
        return this.f36224hv;
    }

    public long hww() {
        return this.hww;
    }

    public long sd() {
        return this.f36225sd;
    }

    public long tq() {
        return this.f36226tq;
    }

    public long vy() {
        return this.vy;
    }

    public void hww(long j10) {
        if (j10 <= 0) {
            this.hww = 10L;
        } else {
            this.hww = j10;
        }
    }

    public void sd(long j10) {
        if (j10 <= 0) {
            this.f36225sd = 10L;
        } else {
            this.f36225sd = j10;
        }
    }

    public void tq(long j10) {
        if (j10 < 0) {
            this.f36226tq = 20L;
        } else {
            this.f36226tq = j10;
        }
    }

    public void vy(long j10) {
        if (j10 < 0) {
            this.vy = 20L;
        } else {
            this.vy = j10;
        }
    }

    public void hww(String str) {
        this.f36224hv = str;
    }
}
