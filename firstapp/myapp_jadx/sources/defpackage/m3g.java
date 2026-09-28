package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m3g implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m3g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar;
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                kmn kmnVar = (kmn) obj4;
                Function2 function2 = (Function2) obj;
                a aVar2 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                function2.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= aVar2.A(function2) ? 4 : 2;
                }
                int i2 = iIntValue;
                if (aVar2.q(i2 & 1, (i2 & 19) != 18)) {
                    aiv aivVarC = g75.c(ht.a.f, false);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d.a aVar3 = d.a.b;
                    d dVarC = c.c(aVar2, aVar3);
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
                    hlh0.a(aVar2, aivVarC, yka.a.f);
                    hlh0.a(aVar2, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    hlh0.a(aVar2, dVarC, yka.a.d);
                    if (kmnVar.b.a.length() == 0) {
                        aVar2.N(-282292021);
                        lkf0.d(cb40.a(R.string.component_betslip__max, new Object[0], aVar2), j.g(aVar3, 1.0f), c68.a(R.color.text_placeholder, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar2), aVar2, 48, 0, 130040);
                        aVar = aVar2;
                        aVar.H();
                    } else {
                        aVar = aVar2;
                        aVar.N(-281824045);
                        aVar.H();
                    }
                    ps.a(i2 & 14, aVar, function2);
                } else {
                    aVar2.G();
                }
                return Unit.a;
            default:
                zsk zskVar = (zsk) obj4;
                x0g0 x0g0Var = (x0g0) obj;
                a aVar5 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                x0g0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar5.M(x0g0Var) : aVar5.A(x0g0Var) ? 4 : 2;
                }
                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    r0g0.a(x0g0Var, null, i0g0.b, 0.0f, null, j58.f, j58.b, pp8.b(-1600533046, new wsk(zskVar, 0), aVar5), aVar5, (iIntValue2 & 14) | 807075840, 205);
                } else {
                    aVar5.G();
                }
                return Unit.a;
        }
    }
}
