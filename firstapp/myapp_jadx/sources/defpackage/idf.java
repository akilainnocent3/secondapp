package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import androidx.compose.runtime.m;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class idf extends crz implements j350 {
    public final Drawable f;
    public final ytw i;
    public final ytw v;
    public final mpe0 w;

    public static final class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            long jFloatToRawIntBits;
            drawable.getClass();
            idf idfVar = idf.this;
            ytw ytwVar = idfVar.i;
            ((x5a0) ytwVar).setValue(Integer.valueOf(((Number) ((x5a0) ytwVar).getValue()).intValue() + 1));
            Drawable drawable2 = idfVar.f;
            ttr ttrVar = kdf.a;
            if (drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) {
                jFloatToRawIntBits = 9205357640488583168L;
            } else {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(drawable2.getIntrinsicWidth())) << 32) | (((long) Float.floatToRawIntBits(drawable2.getIntrinsicHeight())) & 4294967295L);
            }
            ((x5a0) idfVar.v).setValue(new yw90(jFloatToRawIntBits));
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            drawable.getClass();
            runnable.getClass();
            ((Handler) kdf.a.getValue()).postAtTime(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            drawable.getClass();
            runnable.getClass();
            ((Handler) kdf.a.getValue()).removeCallbacks(runnable);
        }
    }

    public idf(Drawable drawable) {
        long jFloatToRawIntBits;
        drawable.getClass();
        this.f = drawable;
        int i = 0;
        this.i = m.b(0);
        ttr ttrVar = kdf.a;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            jFloatToRawIntBits = 9205357640488583168L;
        } else {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(drawable.getIntrinsicHeight())) & 4294967295L) | (Float.floatToRawIntBits(intrinsicWidth) << 32);
        }
        this.v = m.b(new yw90(jFloatToRawIntBits));
        this.w = hwr.b(new hdf(this, i));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.crz
    public final boolean a(float f) {
        this.f.setAlpha(f.e(ycv.b(f * 255.0f), 0, 255));
        return true;
    }

    @Override // defpackage.crz
    public final boolean b(l58 l58Var) {
        this.f.setColorFilter(l58Var != null ? l58Var.a : null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j350
    public final void c() {
        Drawable.Callback callback = (Drawable.Callback) this.w.getValue();
        Drawable drawable = this.f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.crz
    public final void d(asr asrVar) {
        int i;
        asrVar.getClass();
        int iOrdinal = asrVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
        } else {
            i = 0;
        }
        this.f.setLayoutDirection(i);
    }

    @Override // defpackage.j350
    public final void e() {
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j350
    public final void f() {
        Drawable drawable = this.f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // defpackage.crz
    public final long i() {
        return ((yw90) ((x5a0) this.v).getValue()).a;
    }

    @Override // defpackage.crz
    public final void j(tcf tcfVar) {
        tcfVar.getClass();
        lc6 lc6VarA = tcfVar.F1().a();
        ((Number) ((x5a0) this.i).getValue()).intValue();
        try {
            lc6VarA.p();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.f;
            if (i < 28 || i >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, ycv.b(yw90.d(tcfVar.d())), ycv.b(yw90.b(tcfVar.d())));
            } else {
                lc6VarA.a(yw90.d(tcfVar.d()) / yw90.d(i()), yw90.b(tcfVar.d()) / yw90.b(i()));
            }
            Canvas canvas = i40.a;
            drawable.draw(((h40) lc6VarA).a);
        } finally {
            lc6VarA.f();
        }
    }
}
