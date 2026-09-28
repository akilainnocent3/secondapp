package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mgf0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ ytw<yw90> a;
    public final /* synthetic */ ihf0.b b;
    public final /* synthetic */ tmz c;
    public final /* synthetic */ Function2<a, Integer, Unit> d;

    public mgf0(ytw ytwVar, ihf0.b bVar, tmz tmzVar, Function2 function2) {
        this.a = ytwVar;
        this.b = bVar;
        this.c = tmzVar;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d dVarB = i.b(d.a.b, "Container");
            final lgf0 lgf0Var = new lgf0(this.a, ytw.class, "value", "getValue()Ljava/lang/Object;", 0);
            final ht.b bVarE = wgf0.e(this.b);
            final tmz tmzVar = this.c;
            d dVarC = androidx.compose.ui.draw.a.c(dVarB, new Function1() { // from class: w9z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    lza lzaVar = (lza) obj;
                    long j = ((yw90) lgf0Var.get()).a;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    if (fIntBitsToFloat > 0.0f) {
                        float fC1 = lzaVar.C1(4.0f);
                        asr layoutDirection = lzaVar.getLayoutDirection();
                        tmz tmzVar2 = tmzVar;
                        float fC2 = lzaVar.C1(tmzVar2.b(layoutDirection));
                        float f = fIntBitsToFloat / 2.0f;
                        float fA = bVarE.a(ycv.b(fIntBitsToFloat), ycv.b((Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - fC2) - lzaVar.C1(tmzVar2.c(lzaVar.getLayoutDirection()))), lzaVar.getLayoutDirection()) + fC2 + f;
                        float f2 = (fA - f) - fC1;
                        float f3 = f2 < 0.0f ? 0.0f : f2;
                        float f4 = fA + f + fC1;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                        float f5 = f4 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f4;
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j & 4294967295L));
                        float f6 = (-fIntBitsToFloat3) / 2.0f;
                        float f7 = fIntBitsToFloat3 / 2.0f;
                        qc6.b bVarF1 = lzaVar.F1();
                        long jD = bVarF1.d();
                        bVarF1.a().p();
                        try {
                            bVarF1.a.b(f3, f6, f5, f7, 0);
                            lzaVar.b2();
                        } finally {
                            hrh.a(bVarF1, jD);
                        }
                    } else {
                        lzaVar.b2();
                    }
                    return Unit.a;
                }
            });
            aiv aivVarC = g75.c(ht.a.a, true);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC2 = c.c(aVar2, dVarC);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar3);
            } else {
                aVar2.p();
            }
            hlh0.a(aVar2, aivVarC, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            hlh0.a(aVar2, dVarC2, yka.a.d);
            ps.a(0, aVar2, this.d);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
