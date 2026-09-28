package defpackage;

import androidx.compose.runtime.j;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class w0a0 implements kcf {
    public final int a;
    public Function0<Unit> b;
    public final gt7 c;
    public final isw d;
    public Function1<? super Float, Unit> e;
    public final boolean f;
    public final float[] g;
    public final osw h;
    public final osw i;
    public boolean j;
    public final osw k;
    public final osw l;
    public final i3z m;
    public final ytw n;
    public final t0a0 o;
    public final isw p;
    public final isw q;
    public final v0a0 r;
    public final puw s;

    public w0a0(float f, int i, Function0 function0, gt7 gt7Var) {
        float[] fArr;
        this.a = i;
        this.b = function0;
        this.c = gt7Var;
        this.d = j.a(f);
        this.f = true;
        float f2 = d0a0.a;
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.g = fArr;
        this.h = k.a(0);
        this.i = k.a(0);
        this.k = k.a(0);
        this.l = k.a(0);
        this.m = i3z.b;
        this.n = m.b(Boolean.FALSE);
        this.o = new t0a0(this);
        this.p = j.a(vcv.b(0.0f, 0.0f, d0a0.j(Float.valueOf(gt7Var.a).floatValue(), Float.valueOf(gt7Var.b).floatValue(), f)));
        this.q = j.a(0.0f);
        this.r = new v0a0(this);
        this.s = new puw();
    }

    @Override // defpackage.kcf
    public final void a(float f) {
        float fMax;
        float fMin;
        if (this.m == i3z.a) {
            float fD = ((u5a0) this.i).D();
            u5a0 u5a0Var = (u5a0) this.l;
            fMax = Math.max(fD - (u5a0Var.D() / 2.0f), 0.0f);
            fMin = Math.min(u5a0Var.D() / 2.0f, fMax);
        } else {
            float fD2 = ((u5a0) this.h).D();
            u5a0 u5a0Var2 = (u5a0) this.k;
            fMax = Math.max(fD2 - (u5a0Var2.D() / 2.0f), 0.0f);
            fMin = Math.min(u5a0Var2.D() / 2.0f, fMax);
        }
        t5a0 t5a0Var = (t5a0) this.p;
        float fJ = t5a0Var.j() + f;
        isw iswVar = this.q;
        t5a0Var.A(((t5a0) iswVar).j() + fJ);
        ((t5a0) iswVar).A(0.0f);
        float fK = d0a0.k(t5a0Var.j(), fMin, fMax, this.g);
        gt7 gt7Var = this.c;
        float fB = vcv.b(Float.valueOf(gt7Var.a).floatValue(), Float.valueOf(gt7Var.b).floatValue(), d0a0.j(fMin, fMax, fK));
        if (fB == ((t5a0) this.d).j()) {
            return;
        }
        Function1<? super Float, Unit> function1 = this.e;
        if (function1 != null) {
            function1.invoke(Float.valueOf(fB));
        } else {
            d(fB);
        }
    }

    @Override // defpackage.kcf
    public final Object b(icf icfVar, g9f g9fVar) {
        huw huwVar = huw.a;
        Object objD = w5b.d(new u0a0(this, icfVar, null), g9fVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    public final float c() {
        gt7 gt7Var = this.c;
        float fFloatValue = Float.valueOf(gt7Var.a).floatValue();
        float f = gt7Var.b;
        return d0a0.j(fFloatValue, Float.valueOf(f).floatValue(), f.d(((t5a0) this.d).j(), Float.valueOf(gt7Var.a).floatValue(), Float.valueOf(f).floatValue()));
    }

    public final void d(float f) {
        if (this.f) {
            gt7 gt7Var = this.c;
            float f2 = gt7Var.a;
            float f3 = gt7Var.b;
            f = d0a0.k(f.d(f, Float.valueOf(f2).floatValue(), Float.valueOf(f3).floatValue()), Float.valueOf(gt7Var.a).floatValue(), Float.valueOf(f3).floatValue(), this.g);
        }
        ((t5a0) this.d).A(f);
    }

    public w0a0() {
        this(0.0f, 0, null, new gt7(0.0f, 1.0f));
    }
}
