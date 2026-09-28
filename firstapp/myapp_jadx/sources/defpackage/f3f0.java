package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f3f0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ op8 a;
    public final /* synthetic */ op8 b;
    public final /* synthetic */ op8 c;

    public f3f0(op8 op8Var, op8 op8Var2, op8 op8Var3) {
        this.a = op8Var;
        this.b = op8Var2;
        this.c = op8Var3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            goh gohVarB = a6w.b(z5w.a, aVar2);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new e3f0(gohVarB);
                aVar2.r(objY);
            }
            e3f0 e3f0Var = (e3f0) objY;
            d dVarG = j.g(d.a.b, 1.0f);
            List listK = b.k(this.a, this.b, pp8.b(-1333331860, new b3f0(this.c, e3f0Var), aVar2));
            Object objY2 = aVar2.y();
            if (objY2 == c0042a) {
                objY2 = new d3f0(e3f0Var);
                aVar2.r(objY2);
            }
            z8w z8wVar = (z8w) objY2;
            op8 op8VarB = lsr.b(listK);
            Object objY3 = aVar2.y();
            if (objY3 == c0042a) {
                objY3 = new a9w(z8wVar);
                aVar2.r(objY3);
            }
            aiv aivVar = (aiv) objY3;
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarG);
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
            hlh0.a(aVar2, aivVar, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            fc0.a(0, op8VarB, aVar2);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
