package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class fo7 extends bfn<ObjectAnimator> {
    public static final int[] k = {0, 1350, 2700, 4050};
    public static final int[] l = {667, 2017, 3367, 4717};
    public static final int[] m = {1000, 2350, 3700, 5050};
    public static final c n = new c(Float.class, "animationFraction");
    public static final d o = new d(Float.class, "completeEndFraction");
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final w9h e;
    public final CircularProgressIndicatorSpec f;
    public int g;
    public float h;
    public float i;
    public zd0 j;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            fo7 fo7Var = fo7.this;
            fo7Var.g = (fo7Var.g + 4) % fo7Var.f.e.length;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            fo7 fo7Var = fo7.this;
            fo7Var.a();
            zd0 zd0Var = fo7Var.j;
            if (zd0Var != null) {
                zd0Var.a(fo7Var.a);
            }
        }
    }

    public class c extends Property<fo7, Float> {
        @Override // android.util.Property
        public final Float get(fo7 fo7Var) {
            return Float.valueOf(fo7Var.h);
        }

        @Override // android.util.Property
        public final void set(fo7 fo7Var, Float f) {
            fo7 fo7Var2 = fo7Var;
            float fFloatValue = f.floatValue();
            fo7Var2.h = fFloatValue;
            int i = (int) (fFloatValue * 5400.0f);
            w9h w9hVar = fo7Var2.e;
            ArrayList arrayList = fo7Var2.b;
            kef.a aVar = (kef.a) arrayList.get(0);
            float f2 = fo7Var2.h * 1520.0f;
            aVar.a = (-20.0f) + f2;
            aVar.b = f2;
            for (int i2 = 0; i2 < 4; i2++) {
                aVar.b = (w9hVar.getInterpolation(bfn.b(i, fo7.k[i2], 667)) * 250.0f) + aVar.b;
                aVar.a = (w9hVar.getInterpolation(bfn.b(i, fo7.l[i2], 667)) * 250.0f) + aVar.a;
            }
            float f3 = aVar.a;
            float f4 = aVar.b;
            aVar.a = (((f4 - f3) * fo7Var2.i) + f3) / 360.0f;
            aVar.b = f4 / 360.0f;
            for (int i3 = 0; i3 < 4; i3++) {
                float fB = bfn.b(i, fo7.m[i3], 333);
                if (fB > 0.0f && fB < 1.0f) {
                    int i4 = i3 + fo7Var2.g;
                    int[] iArr = fo7Var2.f.e;
                    int length = i4 % iArr.length;
                    int length2 = (length + 1) % iArr.length;
                    int i5 = iArr[length];
                    int i6 = iArr[length2];
                    ((kef.a) arrayList.get(0)).c = gw0.a(w9hVar.getInterpolation(fB), Integer.valueOf(i5), Integer.valueOf(i6)).intValue();
                    break;
                }
            }
            fo7Var2.a.invalidateSelf();
        }
    }

    public class d extends Property<fo7, Float> {
        @Override // android.util.Property
        public final Float get(fo7 fo7Var) {
            return Float.valueOf(fo7Var.i);
        }

        @Override // android.util.Property
        public final void set(fo7 fo7Var, Float f) {
            fo7Var.i = f.floatValue();
        }
    }

    public fo7(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = circularProgressIndicatorSpec;
        this.e = new w9h();
    }

    @Override // defpackage.bfn
    public final void a() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.bfn
    public final void c() {
        h();
        ObjectAnimator objectAnimator = this.c;
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = this.f;
        objectAnimator.setDuration((long) (circularProgressIndicatorSpec.n * 5400.0f));
        this.d.setDuration((long) (circularProgressIndicatorSpec.n * 333.0f));
        this.g = 0;
        ((kef.a) this.b.get(0)).c = circularProgressIndicatorSpec.e[0];
        this.i = 0.0f;
    }

    @Override // defpackage.bfn
    public final void d(BaseProgressIndicator.c cVar) {
        this.j = cVar;
    }

    @Override // defpackage.bfn
    public final void e() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.a.isVisible()) {
            this.d.start();
        } else {
            a();
        }
    }

    @Override // defpackage.bfn
    public final void f() {
        h();
        this.g = 0;
        ((kef.a) this.b.get(0)).c = this.f.e[0];
        this.i = 0.0f;
        this.c.start();
    }

    @Override // defpackage.bfn
    public final void g() {
        this.j = null;
    }

    public final void h() {
        ObjectAnimator objectAnimator = this.c;
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = this.f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (circularProgressIndicatorSpec.n * 5400.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new a());
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (circularProgressIndicatorSpec.n * 333.0f));
            this.d.setInterpolator(this.e);
            this.d.addListener(new b());
        }
    }
}
