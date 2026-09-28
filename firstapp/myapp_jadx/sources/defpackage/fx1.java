package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fx1 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;

    public fx1(List list, Function1 function1) {
        this.a = list;
        this.b = function1;
    }

    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            mw1 mw1Var = (mw1) this.a.get(iIntValue);
            aVar2.N(-2129703927);
            if (mw1Var instanceof mw1.b) {
                aVar2.N(762584990);
                gx1.b(((mw1.b) mw1Var).a, aVar2, 0);
                aVar2.H();
            } else {
                boolean z = mw1Var instanceof mw1.a;
                d.a aVar3 = d.a.b;
                if (z) {
                    aVar2.N(762587739);
                    ty0.a(aVar2, j.i(aVar3, 16.0f));
                    aVar2.H();
                } else {
                    if (!(mw1Var instanceof mw1.c)) {
                        throw rg.a(762583866, aVar2);
                    }
                    aVar2.N(762590637);
                    mw1.c cVar = (mw1.c) mw1Var;
                    d dVarB = androidx.compose.foundation.a.b(ls7.a(aVar3, cVar.b), c68.a(R.color.bg_secondary_d_lighter, aVar2), zk40.a);
                    i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d dVarC = c.c(aVar2, dVarB);
                    yka.k.getClass();
                    tsr.a aVar4 = yka.a.b;
                    if (aVar2.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar2.D();
                    if (aVar2.g()) {
                        aVar2.F(aVar4);
                    } else {
                        aVar2.p();
                    }
                    hlh0.a(aVar2, i78VarA, yka.a.f);
                    hlh0.a(aVar2, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    hlh0.a(aVar2, dVarC, yka.a.d);
                    gx1.f(null, cVar.a, this.b, aVar2, 0);
                    if (cVar.c) {
                        aVar2.N(222404846);
                        gx1.d(0, aVar2);
                        aVar2.H();
                    } else {
                        aVar2.N(222467311);
                        aVar2.H();
                    }
                    aVar2.s();
                    aVar2.H();
                }
            }
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
