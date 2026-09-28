package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;
import com.sportybet.android.gp.tz.R;
import defpackage.j42;

/* JADX INFO: loaded from: classes4.dex */
public final class dbe<S extends j42> extends xdf {
    public static final a N = new a();
    public final kef<S> C;
    public final dkd0 D;
    public final ckd0 E;
    public final kef.a F;
    public float G;
    public boolean H;
    public final ValueAnimator I;
    public ValueAnimator J;
    public TimeInterpolator K;
    public TimeInterpolator L;
    public TimeInterpolator M;

    public class a extends y3l {
        @Override // defpackage.y3l
        public final float l(Object obj) {
            return ((dbe) obj).F.b * 10000.0f;
        }

        @Override // defpackage.y3l
        public final void t(Object obj, float f) {
            final dbe dbeVar = (dbe) obj;
            dbeVar.F.b = f / 10000.0f;
            dbeVar.invalidateSelf();
            int i = (int) f;
            if (dbeVar.b.b(true)) {
                Context context = dbeVar.a;
                if (dbeVar.J == null) {
                    LinearInterpolator linearInterpolator = dj0.a;
                    dbeVar.L = f6w.c(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                    dbeVar.M = f6w.c(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    dbeVar.J = valueAnimator;
                    valueAnimator.setDuration(500L);
                    dbeVar.J.setFloatValues(0.0f, 1.0f);
                    dbeVar.J.setInterpolator(null);
                    dbeVar.J.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cbe
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            dbe dbeVar2 = dbeVar;
                            dbeVar2.F.e = dbeVar2.K.getInterpolation(dbeVar2.J.getAnimatedFraction());
                        }
                    });
                }
                float f2 = i;
                float f3 = (f2 < 1000.0f || f2 > 9000.0f) ? 0.0f : 1.0f;
                float f4 = dbeVar.G;
                ValueAnimator valueAnimator2 = dbeVar.J;
                if (f3 == f4) {
                    if (valueAnimator2.isRunning()) {
                        return;
                    }
                    dbeVar.F.e = f3;
                    dbeVar.invalidateSelf();
                    return;
                }
                if (valueAnimator2.isRunning()) {
                    dbeVar.J.cancel();
                }
                dbeVar.G = f3;
                if (f3 == 1.0f) {
                    dbeVar.K = dbeVar.L;
                    dbeVar.J.start();
                } else {
                    dbeVar.K = dbeVar.M;
                    dbeVar.J.reverse();
                }
            }
        }
    }

    public dbe(Context context, final j42 j42Var, kef<S> kefVar) {
        super(context, j42Var);
        this.H = false;
        this.C = kefVar;
        kef.a aVar = new kef.a();
        this.F = aVar;
        aVar.h = true;
        dkd0 dkd0Var = new dkd0();
        this.D = dkd0Var;
        dkd0Var.a(1.0f);
        dkd0Var.b(50.0f);
        ckd0 ckd0Var = new ckd0(this, N);
        this.E = ckd0Var;
        ckd0Var.s = dkd0Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.I = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bbe
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                j42 j42Var2 = j42Var;
                if (!j42Var2.b(true) || j42Var2.m == 0) {
                    return;
                }
                dbe dbeVar = this.a;
                if (dbeVar.isVisible()) {
                    dbeVar.invalidateSelf();
                }
            }
        });
        if (j42Var.b(true) && j42Var.m != 0) {
            valueAnimator.start();
        }
        if (this.w != 1.0f) {
            this.w = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.A)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.e;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            kef<S> kefVar = this.C;
            kefVar.a.d();
            kefVar.a(canvas, bounds, fB, z, z2);
            float fC = c();
            kef.a aVar = this.F;
            aVar.f = fC;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.y;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            j42 j42Var = this.b;
            aVar.c = j42Var.e[0];
            int iA = j42Var.i;
            kef<S> kefVar2 = this.C;
            if (iA > 0) {
                if (!(kefVar2 instanceof efs)) {
                    iA = (int) ((cdv.a(aVar.b, 0.0f, 0.01f) * iA) / 0.01f);
                }
                this.C.d(canvas, paint, aVar.b, 1.0f, j42Var.f, this.z, iA);
            } else {
                kefVar2.d(canvas, paint, 0.0f, 1.0f, j42Var.f, this.z, 0);
            }
            int i = this.z;
            kef<S> kefVar3 = this.C;
            kefVar3.c(canvas, paint, aVar, i);
            kefVar3.b(j42Var.e[0], this.z, canvas, paint);
            canvas.restore();
        }
    }

    @Override // defpackage.xdf
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean zE = super.e(z, z2, z3);
        ik0 ik0Var = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        ik0Var.getClass();
        float fA = ik0.a(contentResolver);
        if (fA == 0.0f) {
            this.H = true;
            return zE;
        }
        this.H = false;
        this.D.b(50.0f / fA);
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.C.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.C.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.E.e();
        this.F.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f = i;
        float f2 = (f < 1000.0f || f > 9000.0f) ? 0.0f : 1.0f;
        boolean z = this.H;
        kef.a aVar = this.F;
        ckd0 ckd0Var = this.E;
        if (z) {
            ckd0Var.e();
            aVar.b = f / 10000.0f;
            invalidateSelf();
            aVar.e = f2;
            invalidateSelf();
        } else {
            ckd0Var.b = aVar.b * 10000.0f;
            ckd0Var.c = true;
            ckd0Var.d(f);
        }
        return true;
    }
}
