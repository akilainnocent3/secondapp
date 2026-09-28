package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class efc0 {
    public static final void a(final tfc0 tfc0Var, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function2, final Function1<? super hfc0, Unit> function3, a aVar, final int i) {
        b bVar;
        tfc0Var.getClass();
        final String str = tfc0Var.a;
        function1.getClass();
        function2.getClass();
        function3.getClass();
        b bVarI = aVar.i(-1263422473);
        int i2 = i | (bVarI.M(tfc0Var) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function3) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            yec0 yec0Var = tfc0Var.b;
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new zec0();
                bVarI.r(objY);
            }
            d dVarH = g3w.h(xa80.b(dVarG, false, (Function1) objY), "market_" + str + "_content");
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            boolean zM = ((i2 & 112) == 32) | bVarI.M(str);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new dk00(2, function1, str);
                bVarI.r(objY2);
            }
            Function0 function0 = (Function0) objY2;
            boolean zM2 = ((i2 & 896) == 256) | bVarI.M(str);
            Object objY3 = bVarI.y();
            if (zM2 || objY3 == c0042a) {
                objY3 = new ek00(1, str, function2);
                bVarI.r(objY3);
            }
            xec0.a(yec0Var, function0, (Function0) objY3, bVarI, 0);
            bVar = bVarI;
            hh0.b(l78.a, yec0Var.a, null, null, null, null, pp8.b(-1066009751, new gaj() { // from class: afc0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        i78 i78VarA2 = g78.a(kw0.c, ht.a.m, aVar4, 0);
                        int iHashCode2 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d.a aVar5 = d.a.b;
                        d dVarC2 = c.c(aVar4, aVar5);
                        yka.k.getClass();
                        tsr.a aVar6 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar6);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, i78VarA2, yka.a.f);
                        hlh0.a(aVar4, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                        }
                        hlh0.a(aVar4, dVarC2, yka.a.d);
                        nec0 nec0Var = tfc0Var.c;
                        boolean z = nec0Var instanceof nfc0;
                        final Function1 function4 = function3;
                        final String str2 = str;
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (z) {
                            aVar4.N(727885182);
                            nfc0 nfc0Var = (nfc0) nec0Var;
                            boolean zM3 = aVar4.M(function4) | aVar4.M(str2);
                            Object objY4 = aVar4.y();
                            if (zM3 || objY4 == c0042a2) {
                                objY4 = new gaj() { // from class: cfc0
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        String str3 = (String) obj4;
                                        String str4 = (String) obj5;
                                        String str5 = (String) obj6;
                                        str3.getClass();
                                        str4.getClass();
                                        str5.getClass();
                                        function4.invoke(new hfc0(str2, str3, str4, str5));
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY4);
                            }
                            mfc0.b(nfc0Var, (gaj) objY4, aVar4, 0);
                            aVar4.H();
                        } else {
                            if (!(nec0Var instanceof sfc0)) {
                                throw rg.a(993308852, aVar4);
                            }
                            aVar4.N(728680177);
                            sfc0 sfc0Var = (sfc0) nec0Var;
                            boolean zM4 = aVar4.M(function4) | aVar4.M(str2);
                            Object objY5 = aVar4.y();
                            if (zM4 || objY5 == c0042a2) {
                                objY5 = new gaj() { // from class: dfc0
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        String str3 = (String) obj4;
                                        String str4 = (String) obj5;
                                        String str5 = (String) obj6;
                                        str3.getClass();
                                        str4.getClass();
                                        str5.getClass();
                                        function4.invoke(new hfc0(str2, str3, str4, str5));
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY5);
                            }
                            rfc0.b(sfc0Var, (gaj) objY5, aVar4, 0);
                            aVar4.H();
                        }
                        ty0.a(aVar4, j.i(aVar5, 11.0f));
                        aVar4.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 1572870, 30);
            ute.b(j.g(aVar2, 1.0f), ((qhb0) bVar.O(shb0.a)).a, ((lib0) bVar.O(oib0.a)).A, bVar, 6, 0);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, function3, i) { // from class: bfc0
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    efc0.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
