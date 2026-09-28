package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class lln implements Function1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ qx80 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float i;

    public /* synthetic */ lln(float f, float f2, float f3, float f4, qx80 qx80Var, long j, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = qx80Var;
        this.f = j;
        this.i = f5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        bxz bxzVarA;
        long j = this.f;
        float f = this.i;
        lza lzaVar = (lza) obj;
        lzaVar.getClass();
        lzaVar.b2();
        float fC1 = lzaVar.C1(this.a);
        float fC2 = lzaVar.C1(this.b);
        float fC3 = lzaVar.C1(this.c);
        float fC4 = lzaVar.C1(this.d);
        b9z b9zVarA = this.e.a(lzaVar.d(), lzaVar.getLayoutDirection(), lzaVar);
        if (b9zVarA instanceof b9z.c) {
            bxzVarA = m90.a();
            bxz.s(bxzVarA, ((b9z.c) b9zVarA).a);
        } else if (b9zVarA instanceof b9z.b) {
            bxzVarA = m90.a();
            bxz.o(bxzVarA, ((b9z.b) b9zVarA).a);
        } else {
            if (!(b9zVarA instanceof b9z.a)) {
                uhc.a();
                return null;
            }
            bxzVarA = ((b9z.a) b9zVarA).a;
        }
        float f2 = (-fC4) - fC1;
        lk40 lk40Var = new lk40(f2, f2, Float.intBitsToFloat((int) (lzaVar.d() >> 32)) + fC4 + fC1, Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) + fC4 + fC1);
        j90 j90VarA = m90.a();
        bxz.o(j90VarA, lk40Var);
        j90 j90VarA2 = m90.a();
        if (!j90VarA2.u(j90VarA, bxzVarA, 0)) {
            hb5.a("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
            return null;
        }
        qc6.b bVarF1 = lzaVar.F1();
        long jD = bVarF1.d();
        bVarF1.a().p();
        try {
            bVarF1.a.a(bxzVarA, 1);
            b90 b90VarA = c90.a();
            b90VarA.m(j58.c(f, j));
            Paint paint = b90VarA.a;
            paint.setAntiAlias(true);
            paint.setMaskFilter(new BlurMaskFilter(fC1, BlurMaskFilter.Blur.NORMAL));
            qc6.b bVarF2 = lzaVar.F1();
            long jD2 = bVarF2.d();
            bVarF2.a().p();
            try {
                bVarF2.a.i(fC2, fC3);
                lzaVar.F1().a().m(j90VarA2, b90VarA);
                bVarF2.a().f();
                bVarF2.h(jD2);
                hrh.a(bVarF1, jD);
                return Unit.a;
            } catch (Throwable th) {
                bVarF2.a().f();
                bVarF2.h(jD2);
                throw th;
            }
        } catch (Throwable th2) {
            hrh.a(bVarF1, jD);
            throw th2;
        }
    }
}
