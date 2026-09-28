package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class b90 implements zqz {
    public final Paint a;
    public int b = 3;
    public Shader c;
    public l58 d;
    public k90 e;

    public b90(Paint paint) {
        this.a = paint;
    }

    @Override // defpackage.zqz
    public final float a() {
        return this.a.getAlpha() / 255.0f;
    }

    @Override // defpackage.zqz
    public final void b(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    @Override // defpackage.zqz
    public final void c(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        if (i2 >= 29) {
            p7k0.a(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(g40.b(i)));
        }
    }

    @Override // defpackage.zqz
    public final long d() {
        return r58.b(this.a.getColor());
    }

    @Override // defpackage.zqz
    public final Paint e() {
        return this.a;
    }

    @Override // defpackage.zqz
    public final void f(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    @Override // defpackage.zqz
    public final Shader g() {
        return this.c;
    }

    @Override // defpackage.zqz
    public final void h(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public final int i() {
        Paint.Cap strokeCap = this.a.getStrokeCap();
        int i = strokeCap == null ? -1 : c90.a.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int j() {
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        int i = strokeJoin == null ? -1 : c90.a.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void k(l58 l58Var) {
        this.d = l58Var;
        this.a.setColorFilter(l58Var != null ? l58Var.a : null);
    }

    public final void l(int i) {
        this.a.setFilterBitmap(!(i == 0));
    }

    @Override // defpackage.zqz
    public final void m(long j) {
        this.a.setColor(r58.l(j));
    }

    public final void n(k90 k90Var) {
        this.a.setPathEffect(k90Var != null ? k90Var.a : null);
        this.e = k90Var;
    }

    public final void o(int i) {
        Paint.Cap cap;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        this.a.setStrokeCap(cap);
    }

    public final void p(int i) {
        Paint.Join join;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        this.a.setStrokeJoin(join);
    }

    public final void q(float f) {
        this.a.setStrokeMiter(f);
    }

    public final void r(float f) {
        this.a.setStrokeWidth(f);
    }
}
