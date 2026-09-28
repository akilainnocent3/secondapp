package defpackage;

import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public final class ckd0 extends ahf<ckd0> {
    public dkd0 s;
    public float t;
    public boolean u;

    public <K> ckd0(K k, y3l y3lVar) {
        super(k, y3lVar);
        this.s = null;
        this.t = Float.MAX_VALUE;
        this.u = false;
    }

    public final void d(float f) {
        if (this.f) {
            this.t = f;
            return;
        }
        dkd0 dkd0Var = this.s;
        if (dkd0Var == null) {
            dkd0Var = new dkd0(f);
            this.s = dkd0Var;
        }
        double d = f;
        dkd0Var.i = d;
        double d2 = (float) d;
        if (d2 > this.g) {
            zkh.a("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < this.h) {
            zkh.a("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.j * 0.75f);
        dkd0Var.d = dAbs;
        dkd0Var.e = dAbs * 62.5d;
        if (Thread.currentThread() != ahf.b().e.b.getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.l(this.d);
        }
        float f2 = this.b;
        if (f2 > this.g || f2 < this.h) {
            hb5.a("Starting value need to be in between min value and max value");
        } else {
            ahf.b().a(this);
        }
    }

    public final void e() {
        if (this.s.b <= 0.0d) {
            zkh.a("Spring animations can only come to an end when there is damping");
            return;
        }
        if (Thread.currentThread() != ahf.b().e.b.getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            this.u = true;
        }
    }
}
