package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class jpb {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private String f36247hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean f36248hv;
    private String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f36249sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f36250tq;
    private double vy;

    public boolean hu() {
        return this.f36248hv;
    }

    public boolean hv() {
        return !TextUtils.isEmpty(this.hww) && this.f36250tq > 0 && this.f36249sd > 0;
    }

    public String hww() {
        return this.hww;
    }

    public int sd() {
        return this.f36249sd;
    }

    public int tq() {
        return this.f36250tq;
    }

    public String vgm() {
        return this.f36247hu;
    }

    public double vy() {
        return this.vy;
    }

    public void hww(String str) {
        this.hww = str;
    }

    public void tq(int i10) {
        this.f36249sd = i10;
    }

    public void hww(int i10) {
        this.f36250tq = i10;
    }

    public void tq(String str) {
        this.f36247hu = str;
    }

    public void hww(boolean z10) {
        this.f36248hv = z10;
    }
}
