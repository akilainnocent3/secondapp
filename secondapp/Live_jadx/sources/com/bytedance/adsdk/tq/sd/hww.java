package com.bytedance.adsdk.tq.sd;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hww {
    private final PointF hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final PointF f32161sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final PointF f32162tq;

    public hww() {
        this.hww = new PointF();
        this.f32162tq = new PointF();
        this.f32161sd = new PointF();
    }

    public void hww(float f10, float f11) {
        this.hww.set(f10, f11);
    }

    public void sd(float f10, float f11) {
        this.f32161sd.set(f10, f11);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f32161sd.x), Float.valueOf(this.f32161sd.y), Float.valueOf(this.hww.x), Float.valueOf(this.hww.y), Float.valueOf(this.f32162tq.x), Float.valueOf(this.f32162tq.y));
    }

    public void tq(float f10, float f11) {
        this.f32162tq.set(f10, f11);
    }

    public PointF hww() {
        return this.hww;
    }

    public PointF sd() {
        return this.f32161sd;
    }

    public PointF tq() {
        return this.f32162tq;
    }

    public hww(PointF pointF, PointF pointF2, PointF pointF3) {
        this.hww = pointF;
        this.f32162tq = pointF2;
        this.f32161sd = pointF3;
    }
}
