package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class io7 extends bfn<ObjectAnimator> {
    public static final w9h k = dj0.b;
    public static final int[] l = {0, 1500, 3000, 4500};
    public static final float[] m = {0.1f, 0.87f};
    public static final a n = new a(Float.class, "animationFraction");
    public static final b o = new b(Float.class, "completeEndFraction");
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final TimeInterpolator e;
    public final CircularProgressIndicatorSpec f;
    public int g;
    public float h;
    public float i;
    public zd0 j;

    public class a extends Property<io7, Float> {
        @Override // android.util.Property
        public final Float get(io7 io7Var) {
            return Float.valueOf(io7Var.h);
        }

        @Override // android.util.Property
        public final void set(io7 io7Var, Float f) {
            io7 io7Var2 = io7Var;
            float fFloatValue = f.floatValue();
            io7Var2.h = fFloatValue;
            int i = (int) (fFloatValue * 6000.0f);
            TimeInterpolator timeInterpolator = io7Var2.e;
            ArrayList arrayList = io7Var2.b;
            kef.a aVar = (kef.a) arrayList.get(0);
            float f2 = io7Var2.h * 1080.0f;
            int[] iArr = io7.l;
            float interpolation = 0.0f;
            for (int i2 : iArr) {
                interpolation += timeInterpolator.getInterpolation(bfn.b(i, i2, 500)) * 90.0f;
            }
            aVar.g = f2 + interpolation;
            float interpolation2 = timeInterpolator.getInterpolation(bfn.b(i, 0, 3000)) - timeInterpolator.getInterpolation(bfn.b(i, 3000, 3000));
            aVar.a = 0.0f;
            float[] fArr = io7.m;
            float fC = bdv.c(fArr[0], fArr[1], interpolation2);
            aVar.b = fC;
            float f3 = io7Var2.i;
            if (f3 > 0.0f) {
                aVar.b = (1.0f - f3) * fC;
            }
            for (int i3 = 0; i3 < iArr.length; i3++) {
                float fB = bfn.b(i, iArr[i3], 100);
                if (fB >= 0.0f && fB <= 1.0f) {
                    int i4 = i3 + io7Var2.g;
                    int[] iArr2 = io7Var2.f.e;
                    int length = i4 % iArr2.length;
                    int length2 = (length + 1) % iArr2.length;
                    ((kef.a) arrayList.get(0)).c = gw0.a(timeInterpolator.getInterpolation(fB), Integer.valueOf(iArr2[length]), Integer.valueOf(iArr2[length2])).intValue();
                    break;
                }
            }
            io7Var2.a.invalidateSelf();
        }
    }

    public class b extends Property<io7, Float> {
        @Override // android.util.Property
        public final Float get(io7 io7Var) {
            return Float.valueOf(io7Var.i);
        }

        @Override // android.util.Property
        public final void set(io7 io7Var, Float f) {
            io7Var.i = f.floatValue();
        }
    }

    public io7(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = circularProgressIndicatorSpec;
        this.e = f6w.c(context, R.attr.motionEasingStandardInterpolator, k);
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
        objectAnimator.setDuration((long) (circularProgressIndicatorSpec.n * 6000.0f));
        this.d.setDuration((long) (circularProgressIndicatorSpec.n * 500.0f));
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
            objectAnimatorOfFloat.setDuration((long) (circularProgressIndicatorSpec.n * 6000.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new go7(this));
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (circularProgressIndicatorSpec.n * 500.0f));
            this.d.addListener(new ho7(this));
        }
    }
}
