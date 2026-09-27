package com.bytedance.adsdk.tq.sd;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class sd {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private Typeface f32172hv;
    private final String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final String f32173sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final String f32174tq;
    private final float vy;

    public sd(String str, String str2, String str3, float f10) {
        this.hww = str;
        this.f32174tq = str2;
        this.f32173sd = str3;
        this.vy = f10;
    }

    public String hww() {
        return this.hww;
    }

    public String sd() {
        return this.f32173sd;
    }

    public String tq() {
        return this.f32174tq;
    }

    public Typeface vy() {
        return this.f32172hv;
    }

    public void hww(Typeface typeface) {
        this.f32172hv = typeface;
    }
}
