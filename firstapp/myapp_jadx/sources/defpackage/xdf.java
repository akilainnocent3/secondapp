package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xdf extends Drawable implements Animatable {
    public static final a B = new a(Float.class, "growFraction");
    public final Context a;
    public final j42 b;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public ArrayList i;
    public boolean v;
    public float w;
    public int z;
    public final float f = -1.0f;
    public final Paint y = new Paint();
    public final Rect A = new Rect();
    public ik0 c = new ik0();

    public class a extends Property<xdf, Float> {
        @Override // android.util.Property
        public final Float get(xdf xdfVar) {
            return Float.valueOf(xdfVar.b());
        }

        @Override // android.util.Property
        public final void set(xdf xdfVar, Float f) {
            xdf xdfVar2 = xdfVar;
            float fFloatValue = f.floatValue();
            if (xdfVar2.w != fFloatValue) {
                xdfVar2.w = fFloatValue;
                xdfVar2.invalidateSelf();
            }
        }
    }

    public xdf(Context context, j42 j42Var) {
        this.a = context;
        this.b = j42Var;
        setAlpha(255);
    }

    public final float b() {
        j42 j42Var = this.b;
        if (j42Var.g == 0 && j42Var.h == 0) {
            return 1.0f;
        }
        return this.w;
    }

    public final float c() {
        float f = this.f;
        if (f > 0.0f) {
            return f;
        }
        boolean z = this instanceof dbe;
        j42 j42Var = this.b;
        if (j42Var.b(z) && j42Var.m != 0) {
            ik0 ik0Var = this.c;
            ContentResolver contentResolver = this.a.getContentResolver();
            ik0Var.getClass();
            float fA = ik0.a(contentResolver);
            if (fA > 0.0f) {
                int i = (int) ((((z ? j42Var.j : j42Var.k) * 1000.0f) / j42Var.m) * fA);
                float fUptimeMillis = (SystemClock.uptimeMillis() % ((long) i)) / i;
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    public final boolean d(boolean z, boolean z2, boolean z3) {
        ik0 ik0Var = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        ik0Var.getClass();
        return e(z, z2, z3 && ik0.a(contentResolver) > 0.0f);
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.d;
        a aVar = B;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, aVar, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.d.setInterpolator(dj0.b);
            ObjectAnimator objectAnimator2 = this.d;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                hb5.a("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.d = objectAnimator2;
            objectAnimator2.addListener(new vdf(this));
        }
        if (this.e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f, 0.0f);
            this.e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.e.setInterpolator(dj0.b);
            ObjectAnimator objectAnimator3 = this.e;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                hb5.a("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.e = objectAnimator3;
            objectAnimator3.addListener(new wdf(this));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.d : this.e;
            ObjectAnimator objectAnimator5 = z ? this.e : this.d;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.v;
                    this.v = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.v = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.v;
                    this.v = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.v = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                j42 j42Var = this.b;
                if (!z ? j42Var.h != 0 : j42Var.g != 0) {
                    boolean z7 = this.v;
                    this.v = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.v = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    public final void f(BaseProgressIndicator.d dVar) {
        ArrayList arrayList = this.i;
        if (arrayList == null || !arrayList.contains(dVar)) {
            return;
        }
        this.i.remove(dVar);
        if (this.i.isEmpty()) {
            this.i = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.e;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.z = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.y.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return d(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
