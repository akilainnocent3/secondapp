package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sgf0 implements gaj<d, a, Integer, Unit> {
    public final /* synthetic */ twd0<Float> a;
    public final /* synthetic */ long b;
    public final /* synthetic */ imf0 c;
    public final /* synthetic */ Function2<a, Integer, Unit> d;

    public sgf0(dtg0.d dVar, long j, imf0 imf0Var, Function2 function2) {
        this.a = dVar;
        this.b = j;
        this.c = imf0Var;
        this.d = function2;
    }

    @Override // defpackage.gaj
    public final Unit invoke(d dVar, a aVar, Integer num) {
        d dVar2 = dVar;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar2.M(dVar2) ? 4 : 2;
        }
        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            final twd0<Float> twd0Var = this.a;
            boolean zM = aVar2.M(twd0Var);
            Object objY = aVar2.y();
            if (zM || objY == a.C0041a.a) {
                objY = new Function1() { // from class: rgf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((a7l) obj).b(((Number) twd0Var.getValue()).floatValue());
                        return Unit.a;
                    }
                };
                aVar2.r(objY);
            }
            d dVarA = androidx.compose.ui.graphics.a.a(dVar2, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.a, false);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarA);
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
            hlh0.a(aVar2, dVarC, yka.a.d);
            wgf0.b(this.b, this.c, this.d, aVar2, 0);
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
