package defpackage;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bpt extends f32 implements Choreographer.FrameCallback {
    public xmt A;
    public boolean B;
    public boolean C;
    public float d;
    public boolean e;
    public long f;
    public float i;
    public float v;
    public int w;
    public float y;
    public float z;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(g());
        h(true);
    }

    public final float d() {
        xmt xmtVar = this.A;
        if (xmtVar == null) {
            return 0.0f;
        }
        float f = this.v;
        float f2 = xmtVar.l;
        return (f - f2) / (xmtVar.m - f2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.B) {
            h(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        xmt xmtVar = this.A;
        if (xmtVar == null || !this.B) {
            return;
        }
        long j2 = this.f;
        float fAbs = (j2 != 0 ? j - j2 : 0L) / (xmtVar == null ? Float.MAX_VALUE : (1.0E9f / xmtVar.n) / Math.abs(this.d));
        float f = this.i;
        if (g()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float f3 = f();
        float fE = e();
        PointF pointF = rqv.a;
        if (f2 >= f3 && f2 <= fE) {
            z = true;
        }
        float f4 = this.i;
        float fB = rqv.b(f2, f(), e());
        this.i = fB;
        if (this.C) {
            fB = (float) Math.floor(fB);
        }
        this.v = fB;
        this.f = j;
        if (z) {
            if (!this.C || this.i != f4) {
                c();
            }
        } else if (getRepeatCount() == -1 || this.w < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.e = !this.e;
                this.d = -this.d;
            } else {
                float fE2 = g() ? e() : f();
                this.i = fE2;
                this.v = fE2;
            }
            this.f = j;
            if (!this.C || this.i != f4) {
                c();
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.w++;
        } else {
            float f5 = this.d < 0.0f ? f() : e();
            this.i = f5;
            this.v = f5;
            h(true);
            if (!this.C || this.i != f4) {
                c();
            }
            a(g());
        }
        if (this.A == null) {
            return;
        }
        float f6 = this.v;
        float f7 = this.y;
        if (f6 < f7 || f6 > this.z) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f7), Float.valueOf(this.z), Float.valueOf(this.v)));
        }
    }

    public final float e() {
        xmt xmtVar = this.A;
        if (xmtVar == null) {
            return 0.0f;
        }
        float f = this.z;
        return f == 2.1474836E9f ? xmtVar.m : f;
    }

    public final float f() {
        xmt xmtVar = this.A;
        if (xmtVar == null) {
            return 0.0f;
        }
        float f = this.y;
        return f == -2.1474836E9f ? xmtVar.l : f;
    }

    public final boolean g() {
        return this.d < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f;
        float fE;
        float f2;
        if (this.A == null) {
            return 0.0f;
        }
        if (g()) {
            f = e() - this.v;
            fE = e();
            f2 = f();
        } else {
            f = this.v - f();
            fE = e();
            f2 = f();
        }
        return f / (fE - f2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        xmt xmtVar = this.A;
        if (xmtVar == null) {
            return 0L;
        }
        return (long) xmtVar.b();
    }

    public final void h(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.B = false;
        }
    }

    public final void i(float f) {
        if (this.i == f) {
            return;
        }
        float fB = rqv.b(f, f(), e());
        this.i = fB;
        if (this.C) {
            fB = (float) Math.floor(fB);
        }
        this.v = fB;
        this.f = 0L;
        c();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.B;
    }

    public final void j(float f, float f2) {
        if (f > f2) {
            hs50.a("minFrame (", f, ") must be <= maxFrame (", f2, ")");
            return;
        }
        xmt xmtVar = this.A;
        float f3 = xmtVar == null ? -3.4028235E38f : xmtVar.l;
        float f4 = xmtVar == null ? Float.MAX_VALUE : xmtVar.m;
        float fB = rqv.b(f, f3, f4);
        float fB2 = rqv.b(f2, f3, f4);
        if (fB == this.y && fB2 == this.z) {
            return;
        }
        this.y = fB;
        this.z = fB2;
        i((int) rqv.b(this.v, fB, fB2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        this.d = -this.d;
    }
}
