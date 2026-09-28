package defpackage;

import androidx.compose.runtime.j;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class j040 {
    public final int a;
    public final gt7 b;
    public final isw c;
    public final isw d;
    public Function1<? super s0a0, Unit> e;
    public final float[] f;
    public final isw g;
    public final isw h;
    public final isw i;
    public final isw j;
    public final osw k;
    public final isw l;
    public final isw m;
    public final ytw n;
    public final ytw o;
    public final efv p;
    public final isw q;
    public final isw r;

    public j040(float f, float f2, int i, gt7 gt7Var) {
        float[] fArr;
        this.a = i;
        this.b = gt7Var;
        this.c = j.a(f);
        this.d = j.a(f2);
        float f3 = d0a0.a;
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
        this.f = fArr;
        this.g = j.a(0.0f);
        this.h = j.a(0.0f);
        this.i = j.a(0.0f);
        this.j = j.a(0.0f);
        this.k = k.a(0);
        this.l = j.a(0.0f);
        this.m = j.a(0.0f);
        Boolean bool = Boolean.FALSE;
        this.n = m.b(bool);
        this.o = m.b(bool);
        this.p = new efv(this);
        this.q = j.a(0.0f);
        this.r = j.a(0.0f);
    }

    public final float a() {
        gt7 gt7Var = this.b;
        return d0a0.j(Float.valueOf(gt7Var.a).floatValue(), Float.valueOf(gt7Var.b).floatValue(), ((t5a0) this.d).j());
    }

    public final float b() {
        gt7 gt7Var = this.b;
        return d0a0.j(Float.valueOf(gt7Var.a).floatValue(), Float.valueOf(gt7Var.b).floatValue(), ((t5a0) this.c).j());
    }

    public final int c() {
        return (int) Math.floor((1.0f - b()) * this.a);
    }

    public final int d() {
        return (int) Math.floor(a() * this.a);
    }

    public final void e(float f, boolean z) {
        long jH;
        long jH2;
        isw iswVar = this.c;
        float[] fArr = this.f;
        isw iswVar2 = this.d;
        isw iswVar3 = this.m;
        isw iswVar4 = this.l;
        isw iswVar5 = this.q;
        isw iswVar6 = this.r;
        if (z) {
            t5a0 t5a0Var = (t5a0) iswVar4;
            ((t5a0) iswVar4).A(t5a0Var.j() + f);
            t5a0 t5a0Var2 = (t5a0) iswVar6;
            t5a0 t5a0Var3 = (t5a0) iswVar5;
            ((t5a0) iswVar3).A(f(t5a0Var2.j(), t5a0Var3.j(), ((t5a0) iswVar2).j()));
            float fJ = ((t5a0) iswVar3).j();
            float fK = d0a0.k(f.d(t5a0Var.j(), t5a0Var2.j(), fJ), t5a0Var2.j(), t5a0Var3.j(), fArr);
            if (fK > fJ) {
                fK = fJ;
            }
            jH = d0a0.h(fK, fJ);
        } else {
            t5a0 t5a0Var4 = (t5a0) iswVar3;
            ((t5a0) iswVar3).A(t5a0Var4.j() + f);
            t5a0 t5a0Var5 = (t5a0) iswVar6;
            t5a0 t5a0Var6 = (t5a0) iswVar5;
            ((t5a0) iswVar4).A(f(t5a0Var5.j(), t5a0Var6.j(), ((t5a0) iswVar).j()));
            float fJ2 = ((t5a0) iswVar4).j();
            float fK2 = d0a0.k(f.d(t5a0Var4.j(), fJ2, t5a0Var6.j()), t5a0Var5.j(), t5a0Var6.j(), fArr);
            if (fK2 < fJ2) {
                fK2 = fJ2;
            }
            jH = d0a0.h(fJ2, fK2);
        }
        float fJ3 = ((t5a0) iswVar6).j();
        float fJ4 = ((t5a0) iswVar5).j();
        gt7 gt7Var = this.b;
        float fFloatValue = Float.valueOf(gt7Var.a).floatValue();
        float fFloatValue2 = Float.valueOf(gt7Var.b).floatValue();
        float fB = vcv.b(fFloatValue, fFloatValue2, d0a0.j(fJ3, fJ4, s0a0.b(jH)));
        float fB2 = vcv.b(fFloatValue, fFloatValue2, d0a0.j(fJ3, fJ4, s0a0.a(jH)));
        if (z) {
            if (fB > fB2) {
                fB = fB2;
            }
            jH2 = d0a0.h(fB, fB2);
        } else {
            if (fB2 < fB) {
                fB2 = fB;
            }
            jH2 = d0a0.h(fB, fB2);
        }
        if (jH2 == d0a0.h(((t5a0) iswVar).j(), ((t5a0) iswVar2).j())) {
            return;
        }
        Function1<? super s0a0, Unit> function1 = this.e;
        if (function1 != null) {
            function1.invoke(new s0a0(jH2));
        } else {
            h(s0a0.b(jH2));
            g(s0a0.a(jH2));
        }
    }

    public final float f(float f, float f2, float f3) {
        gt7 gt7Var = this.b;
        return vcv.b(f, f2, d0a0.j(Float.valueOf(gt7Var.a).floatValue(), Float.valueOf(gt7Var.b).floatValue(), f3));
    }

    public final void g(float f) {
        float fJ = ((t5a0) this.c).j();
        gt7 gt7Var = this.b;
        ((t5a0) this.d).A(d0a0.k(f.d(f, fJ, Float.valueOf(gt7Var.b).floatValue()), Float.valueOf(gt7Var.a).floatValue(), Float.valueOf(gt7Var.b).floatValue(), this.f));
    }

    public final void h(float f) {
        gt7 gt7Var = this.b;
        ((t5a0) this.c).A(d0a0.k(f.d(f, Float.valueOf(gt7Var.a).floatValue(), ((t5a0) this.d).j()), Float.valueOf(gt7Var.a).floatValue(), Float.valueOf(gt7Var.b).floatValue(), this.f));
    }

    public j040() {
        this(0.0f, 1.0f, 0, new gt7(0.0f, 1.0f));
    }
}
