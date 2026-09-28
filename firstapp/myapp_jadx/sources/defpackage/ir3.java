package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ir3 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ ir3(int i, haj hajVar, Object obj) {
        this.a = i;
        this.b = obj;
        this.c = hajVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        haj hajVar = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                vr3 vr3Var = (vr3) obj4;
                Function0 function0 = (Function0) hajVar;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gwr) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dqk dqkVar = vr3Var.k;
                    d.a aVar2 = d.a.b;
                    Unit unit = null;
                    if (dqkVar == null) {
                        aVar.N(-466101778);
                        aVar.H();
                    } else {
                        aVar.N(-466101777);
                        d dVarG = j.g(aVar2, 1.0f);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = c.c(aVar, dVarG);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar.D();
                        if (aVar.g()) {
                            aVar.F(aVar3);
                        } else {
                            aVar.p();
                        }
                        hlh0.a(aVar, aivVarC, yka.a.f);
                        hlh0.a(aVar, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar, iHashCode, c1350a);
                        }
                        hlh0.a(aVar, dVarC, yka.a.d);
                        cqk.a(androidx.compose.foundation.layout.d.a.b(h.j(aVar2, 0.0f, 4.0f, 8.0f, 8.0f, 1), ht.a.f), dqkVar, function0, aVar, 0);
                        aVar.s();
                        aVar.H();
                        unit = Unit.a;
                    }
                    if (unit == null) {
                        aVar.N(262076362);
                        ty0.a(aVar, j.i(aVar2, 16.0f));
                    } else {
                        aVar.N(262058258);
                    }
                    aVar.H();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                c7r c7rVar = (c7r) obj4;
                Function1 function1 = (Function1) hajVar;
                a aVar4 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((gwr) obj).getClass();
                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    w6r.b(c7rVar, function1, aVar4, 0);
                } else {
                    aVar4.G();
                }
                return Unit.a;
        }
    }
}
