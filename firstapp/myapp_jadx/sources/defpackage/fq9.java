package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fq9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        oce0 oce0Var = (oce0) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        oce0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.M(oce0Var) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            b01.b bVar = (b01.b) wyh.c(oce0Var.a().K, aVar, 0, 7).getValue();
            if (bVar instanceof b01.b.d) {
                aVar.N(744804803);
                d.a aVar2 = d.a.b;
                d dVarH = h.h(j.g(aVar2, 1.0f), 24.0f, 0.0f, 2);
                l35 l35VarA = m35.a(1.0f, c68.a(R.color.line_type1_primary, aVar));
                float f = l35VarA.a;
                ya5 ya5Var = l35VarA.b;
                zk40.a aVar3 = zk40.a;
                d dVarB = androidx.compose.foundation.a.b(d35.b(dVarH, f, ya5Var, aVar3), c68.a(R.color.background_general_primary, aVar), aVar3);
                n54 n54Var = ht.a.e;
                aiv aivVarC = g75.c(n54Var, false);
                int iHashCode = Long.hashCode(aVar.m());
                ne00 ne00VarO = aVar.o();
                d dVarC = c.c(aVar, dVarB);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                if (aVar.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar.D();
                if (aVar.g()) {
                    aVar.F(aVar4);
                } else {
                    aVar.p();
                }
                yka.a.b bVar2 = yka.a.f;
                hlh0.a(aVar, aivVarC, bVar2);
                yka.a.d dVar = yka.a.e;
                hlh0.a(aVar, ne00VarO, dVar);
                yka.a.C1350a c1350a = yka.a.g;
                if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                    j3c.a(iHashCode, aVar, iHashCode, c1350a);
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(aVar, dVarC, cVar);
                d dVarF = h.f(j.g(aVar2, 1.0f), 16.0f);
                aiv aivVarC2 = g75.c(n54Var, false);
                int iHashCode2 = Long.hashCode(aVar.m());
                ne00 ne00VarO2 = aVar.o();
                d dVarC2 = c.c(aVar, dVarF);
                if (aVar.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar.D();
                if (aVar.g()) {
                    aVar.F(aVar4);
                } else {
                    aVar.p();
                }
                hlh0.a(aVar, aivVarC2, bVar2);
                hlh0.a(aVar, ne00VarO2, dVar);
                if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                    j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
                }
                hlh0.a(aVar, dVarC2, cVar);
                h9n.a(((b01.b.d) bVar).a, "image", j.g(aVar2, 1.0f), null, d0b.a.d, 0.0f, null, aVar, 25008, 104);
                aVar.s();
                aVar.s();
                aVar.H();
            } else {
                aVar.N(746189635);
                aVar.H();
            }
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
