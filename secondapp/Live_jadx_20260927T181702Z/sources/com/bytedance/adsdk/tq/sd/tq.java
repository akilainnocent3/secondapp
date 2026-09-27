package com.bytedance.adsdk.tq.sd;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class tq {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    public PointF f32229ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    public float f32230hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public int f32231hv;
    public String hww;
    public float nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    public PointF f32232ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    public int f32233ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    public int f32234rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public float f32235sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public String f32236tq;
    public float vgm;
    public boolean vhb;
    public hww vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum hww {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public tq(String str, String str2, float f10, hww hwwVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        hww(str, str2, f10, hwwVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.hww.hashCode() * 31) + this.f32236tq.hashCode()) * 31) + this.f32235sd)) * 31) + this.vy.ordinal()) * 31) + this.f32231hv;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f32230hu);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f32233ok;
    }

    public void hww(String str, String str2, float f10, hww hwwVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.hww = str;
        this.f32236tq = str2;
        this.f32235sd = f10;
        this.vy = hwwVar;
        this.f32231hv = i10;
        this.f32230hu = f11;
        this.vgm = f12;
        this.f32233ok = i11;
        this.f32234rs = i12;
        this.nod = f13;
        this.vhb = z10;
        this.f32232ny = pointF;
        this.f32229ed = pointF2;
    }

    public tq() {
    }
}
