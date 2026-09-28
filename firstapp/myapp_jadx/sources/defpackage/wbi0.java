package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import androidx.compose.ui.d;
import androidx.compose.ui.draw.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class wbi0 {
    public static d a(d dVar, final long j, final float f, final float f2, final float f3, final i060 i060Var) {
        dVar.getClass();
        return a.c(androidx.compose.ui.graphics.a.a(dVar, new ubi0()), new Function1() { // from class: vbi0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                bxz bxzVarA;
                long j2 = j;
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                lzaVar.b2();
                float fC1 = lzaVar.C1(f);
                float fC2 = lzaVar.C1(f2);
                float fC3 = lzaVar.C1(f3);
                float fC4 = lzaVar.C1(0.0f);
                b9z b9zVarA = i060Var.a(lzaVar.d(), lzaVar.getLayoutDirection(), lzaVar);
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
                float f4 = (-fC4) - fC1;
                lk40 lk40Var = new lk40(f4, f4, Float.intBitsToFloat((int) (lzaVar.d() >> 32)) + fC4 + fC1, Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) + fC4 + fC1);
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
                    b90VarA.m(j58.c(0.03f, j2));
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
        });
    }
}
