package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class mfs extends bfn<ObjectAnimator> {
    public static final int[] k = {533, 567, 850, 750};
    public static final int[] l = {1267, 1000, 333, 0};
    public static final a m = new a(Float.class, "animationFraction");
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final Interpolator[] e;
    public final LinearProgressIndicatorSpec f;
    public int g;
    public boolean h;
    public float i;
    public zd0 j;

    public class a extends Property<mfs, Float> {
        @Override // android.util.Property
        public final Float get(mfs mfsVar) {
            return Float.valueOf(mfsVar.i);
        }

        @Override // android.util.Property
        public final void set(mfs mfsVar, Float f) {
            mfs mfsVar2 = mfsVar;
            float fFloatValue = f.floatValue();
            mfsVar2.i = fFloatValue;
            int i = (int) (fFloatValue * 1800.0f);
            Interpolator[] interpolatorArr = mfsVar2.e;
            ArrayList arrayList = mfsVar2.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                kef.a aVar = (kef.a) arrayList.get(i2);
                int[] iArr = mfs.l;
                int i3 = i2 * 2;
                int i4 = iArr[i3];
                int[] iArr2 = mfs.k;
                aVar.a = cdv.a(interpolatorArr[i3].getInterpolation(bfn.b(i, i4, iArr2[i3])), 0.0f, 1.0f);
                int i5 = i3 + 1;
                aVar.b = cdv.a(interpolatorArr[i5].getInterpolation(bfn.b(i, iArr[i5], iArr2[i5])), 0.0f, 1.0f);
            }
            if (mfsVar2.h) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((kef.a) obj).c = mfsVar2.f.e[mfsVar2.g];
                }
                mfsVar2.h = false;
            }
            mfsVar2.a.invalidateSelf();
        }
    }

    public mfs(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f = linearProgressIndicatorSpec;
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator);
        if (interpolatorLoadInterpolator == null) {
            bmy.a("Failed to parse interpolator, no start tag found");
            throw null;
        }
        Interpolator interpolatorLoadInterpolator2 = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator);
        if (interpolatorLoadInterpolator2 == null) {
            bmy.a("Failed to parse interpolator, no start tag found");
            throw null;
        }
        Interpolator interpolatorLoadInterpolator3 = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator);
        if (interpolatorLoadInterpolator3 == null) {
            bmy.a("Failed to parse interpolator, no start tag found");
            throw null;
        }
        Interpolator interpolatorLoadInterpolator4 = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator);
        if (interpolatorLoadInterpolator4 != null) {
            this.e = new Interpolator[]{interpolatorLoadInterpolator, interpolatorLoadInterpolator2, interpolatorLoadInterpolator3, interpolatorLoadInterpolator4};
        } else {
            bmy.a("Failed to parse interpolator, no start tag found");
            throw null;
        }
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
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.f;
        objectAnimator.setDuration((long) (linearProgressIndicatorSpec.n * 1800.0f));
        this.d.setDuration((long) (linearProgressIndicatorSpec.n * 1800.0f));
        i();
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
        a();
        if (this.a.isVisible()) {
            this.d.setFloatValues(this.i, 1.0f);
            this.d.setDuration((long) ((1.0f - this.i) * 1800.0f));
            this.d.start();
        }
    }

    @Override // defpackage.bfn
    public final void f() {
        h();
        i();
        this.c.start();
    }

    @Override // defpackage.bfn
    public final void g() {
        this.j = null;
    }

    public final void h() {
        ObjectAnimator objectAnimator = this.c;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.f;
        a aVar = m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, aVar, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (linearProgressIndicatorSpec.n * 1800.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new kfs(this));
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (linearProgressIndicatorSpec.n * 1800.0f));
            this.d.setInterpolator(null);
            this.d.addListener(new lfs(this));
        }
    }

    public final void i() {
        this.g = 0;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((kef.a) obj).c = this.f.e[0];
        }
    }
}
