package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dbr {
    public static final void a(final d dVar, final ijf0 ijf0Var, final Function1 function1, a aVar, final int i) {
        int i2;
        b bVar;
        dVar.getClass();
        ijf0Var.getClass();
        b bVarI = aVar.i(541383164);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(ijf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            final psw pswVar = (psw) objY;
            imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).k;
            qyd0 qyd0Var = oib0.a;
            imf0 imf0VarB = imf0.b(imf0Var, ((lib0) bVarI.O(qyd0Var)).a, 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
            soa0 soa0Var = new soa0(((lib0) bVarI.O(qyd0Var)).x0);
            op8 op8VarB = pp8.b(180142047, new gaj() { // from class: bbr
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ijf0 ijf0Var2;
                    Function2 function2 = (Function2) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    function2.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.A(function2) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d dVarG = j.g(d.a.b, 1.0f);
                        aiv aivVarC = g75.c(ht.a.d, false);
                        int iHashCode = Long.hashCode(aVar2.m());
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
                        hlh0.a(aVar2, aivVarC, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        ijf0 ijf0Var3 = ijf0Var;
                        if (ijf0Var3.a.b.length() == 0) {
                            aVar2.N(2119508071);
                            ijf0Var2 = ijf0Var3;
                            lkf0.d(cb40.a(R.string.common_functions__search, new Object[0], aVar2), null, ((lib0) aVar2.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).k, aVar2, 0, 0, 131066);
                            aVar2 = aVar2;
                            aVar2.H();
                        } else {
                            ijf0Var2 = ijf0Var3;
                            aVar2.N(2119747081);
                            aVar2.H();
                        }
                        String str = ijf0Var2.a.b;
                        umz umzVarA = h.a(3, 0.0f, 0.0f);
                        long j = j58.l;
                        qyd0 qyd0Var2 = oib0.a;
                        a aVar4 = aVar2;
                        uff0.a.b(str, function2, true, true, uni0.a.a, pswVar, null, null, null, null, uff0.c(((lib0) aVar2.O(qyd0Var2)).a, ((lib0) aVar2.O(qyd0Var2)).a, 0L, j, j, j, j, j, j, j, aVar4, 2147452812), umzVarA, null, aVar4, ((iIntValue << 3) & 112) | 1797504, 102236160, 163712);
                        aVar4.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            int i3 = i2 >> 3;
            bVar = bVarI;
            ab2.a(ijf0Var, function1, dVar, true, false, imf0VarB, null, null, true, 1, 0, uni0.a.a, null, null, soa0Var, op8VarB, bVar, (i3 & 112) | (i3 & 14) | 905972736 | ((i2 << 6) & 896), 196656, 13520);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: cbr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    dbr.a(dVar, ijf0Var, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
