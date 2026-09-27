package com.bytedance.adsdk.tq.vgm;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.tq.vgm;
import fw.b;
import hb.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hww<T> {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private int f32345ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    public final float f32346hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public final Interpolator f32347hv;
    public final T hww;
    private int khx;
    private final vgm nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private float f32348ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    public PointF f32349ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    public PointF f32350rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public final Interpolator f32351sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public T f32352tq;
    public Float vgm;
    private float vhb;
    public final Interpolator vy;
    private float weu;
    private float wgt;

    public hww(vgm vgmVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.vhb = -3987645.8f;
        this.f32348ny = -3987645.8f;
        this.f32345ed = a.f88078r;
        this.khx = a.f88078r;
        this.weu = Float.MIN_VALUE;
        this.wgt = Float.MIN_VALUE;
        this.f32349ok = null;
        this.f32350rs = null;
        this.nod = vgmVar;
        this.hww = t10;
        this.f32352tq = t11;
        this.f32351sd = interpolator;
        this.vy = null;
        this.f32347hv = null;
        this.f32346hu = f10;
        this.vgm = f11;
    }

    public float hu() {
        if (this.vhb == -3987645.8f) {
            this.vhb = ((Float) this.hww).floatValue();
        }
        return this.vhb;
    }

    public boolean hv() {
        return this.f32351sd == null && this.vy == null && this.f32347hv == null;
    }

    public hww<T> hww(T t10, T t11) {
        return new hww<>(t10, t11);
    }

    public int ok() {
        if (this.f32345ed == 784923401) {
            this.f32345ed = ((Integer) this.hww).intValue();
        }
        return this.f32345ed;
    }

    public int rs() {
        if (this.khx == 784923401) {
            this.khx = ((Integer) this.f32352tq).intValue();
        }
        return this.khx;
    }

    public float sd() {
        vgm vgmVar = this.nod;
        if (vgmVar == null) {
            return 0.0f;
        }
        if (this.weu == Float.MIN_VALUE) {
            this.weu = (this.f32346hu - vgmVar.hu()) / this.nod.bs();
        }
        return this.weu;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.hww + ", endValue=" + this.f32352tq + ", startFrame=" + this.f32346hu + ", endFrame=" + this.vgm + ", interpolator=" + this.f32351sd + b.f85383j;
    }

    public float vgm() {
        if (this.f32348ny == -3987645.8f) {
            this.f32348ny = ((Float) this.f32352tq).floatValue();
        }
        return this.f32348ny;
    }

    public float vy() {
        if (this.nod == null) {
            return 1.0f;
        }
        if (this.wgt == Float.MIN_VALUE) {
            if (this.vgm == null) {
                this.wgt = 1.0f;
            } else {
                this.wgt = sd() + ((this.vgm.floatValue() - this.f32346hu) / this.nod.bs());
            }
        }
        return this.wgt;
    }

    public boolean hww(float f10) {
        return f10 >= sd() && f10 < vy();
    }

    public hww(vgm vgmVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.vhb = -3987645.8f;
        this.f32348ny = -3987645.8f;
        this.f32345ed = a.f88078r;
        this.khx = a.f88078r;
        this.weu = Float.MIN_VALUE;
        this.wgt = Float.MIN_VALUE;
        this.f32349ok = null;
        this.f32350rs = null;
        this.nod = vgmVar;
        this.hww = t10;
        this.f32352tq = t11;
        this.f32351sd = null;
        this.vy = interpolator;
        this.f32347hv = interpolator2;
        this.f32346hu = f10;
        this.vgm = f11;
    }

    public hww(vgm vgmVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.vhb = -3987645.8f;
        this.f32348ny = -3987645.8f;
        this.f32345ed = a.f88078r;
        this.khx = a.f88078r;
        this.weu = Float.MIN_VALUE;
        this.wgt = Float.MIN_VALUE;
        this.f32349ok = null;
        this.f32350rs = null;
        this.nod = vgmVar;
        this.hww = t10;
        this.f32352tq = t11;
        this.f32351sd = interpolator;
        this.vy = interpolator2;
        this.f32347hv = interpolator3;
        this.f32346hu = f10;
        this.vgm = f11;
    }

    public hww(T t10) {
        this.vhb = -3987645.8f;
        this.f32348ny = -3987645.8f;
        this.f32345ed = a.f88078r;
        this.khx = a.f88078r;
        this.weu = Float.MIN_VALUE;
        this.wgt = Float.MIN_VALUE;
        this.f32349ok = null;
        this.f32350rs = null;
        this.nod = null;
        this.hww = t10;
        this.f32352tq = t10;
        this.f32351sd = null;
        this.vy = null;
        this.f32347hv = null;
        this.f32346hu = Float.MIN_VALUE;
        this.vgm = Float.valueOf(Float.MAX_VALUE);
    }

    private hww(T t10, T t11) {
        this.vhb = -3987645.8f;
        this.f32348ny = -3987645.8f;
        this.f32345ed = a.f88078r;
        this.khx = a.f88078r;
        this.weu = Float.MIN_VALUE;
        this.wgt = Float.MIN_VALUE;
        this.f32349ok = null;
        this.f32350rs = null;
        this.nod = null;
        this.hww = t10;
        this.f32352tq = t11;
        this.f32351sd = null;
        this.vy = null;
        this.f32347hv = null;
        this.f32346hu = Float.MIN_VALUE;
        this.vgm = Float.valueOf(Float.MAX_VALUE);
    }
}
