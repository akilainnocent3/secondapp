package defpackage;

import androidx.compose.animation.l;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f490 extends qlr implements iaj<l, d, a, Integer, Unit> {
    public final /* synthetic */ d a;
    public final /* synthetic */ op8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f490(d dVar, op8 op8Var) {
        super(4);
        this.a = dVar;
        this.b = op8Var;
    }

    @Override // defpackage.iaj
    public final Unit d(l lVar, d dVar, a aVar, Integer num) {
        int i;
        l lVar2 = lVar;
        d dVar2 = dVar;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            i = (aVar2.M(lVar2) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= aVar2.M(dVar2) ? 32 : 16;
        }
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            d dVarN = this.a.n(dVar2);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(aVar2.m());
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarN);
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
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            this.b.invoke(lVar2, aVar2, Integer.valueOf(i & 14));
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
