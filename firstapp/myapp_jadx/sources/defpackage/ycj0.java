package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.io.FileNotFoundException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ycj0 {
    public static final void a(final int i, a aVar, d dVar, final Function0 function0) throws FileNotFoundException {
        int i2;
        final d dVar2;
        function0.getClass();
        b bVarI = aVar.i(-87075623);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            dVar2 = dVar;
            qfj0.a(dVar2, false, pp8.b(1702194316, new gaj() { // from class: wcj0
                /* JADX WARN: Code duplicated, block: B:23:0x00f4  */
                /* JADX WARN: Code duplicated, block: B:25:0x00fd  */
                /* JADX WARN: Code duplicated, block: B:26:0x0101  */
                /* JADX WARN: Code duplicated, block: B:31:0x011e  */
                /* JADX WARN: Code duplicated, block: B:33:0x018d  */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                    Throwable th;
                    yka.a.c cVar;
                    i78 i78VarA;
                    int iHashCode;
                    ne00 ne00VarO;
                    d dVarC;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((m75) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar3 = d.a.b;
                        d dVarI = j.i(j.g(aVar3, 1.0f), 460.0f);
                        qyd0 qyd0Var = ejb0.a;
                        d dVarI2 = h.i(dVarI, ((cjb0) aVar2.O(qyd0Var)).h, ((cjb0) aVar2.O(qyd0Var)).i, ((cjb0) aVar2.O(qyd0Var)).h, ((cjb0) aVar2.O(qyd0Var)).h);
                        kw0.k kVar = kw0.c;
                        n54.a aVar4 = ht.a.n;
                        i78 i78VarA2 = g78.a(kVar, aVar4, aVar2, 48);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarI2);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, i78VarA2, bVar);
                        yka.a.d dVar3 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO2, dVar3);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g()) {
                            th = null;
                        } else {
                            th = null;
                            if (!Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            }
                            cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC2, cVar);
                            d dVarH = h.h(j.g(aVar3, 1.0f), 0.0f, 72.0f, 1);
                            i78VarA = g78.a(new kw0.i(((cjb0) aVar2.O(qyd0Var)).e, true, new hw0()), aVar4, aVar2, 48);
                            iHashCode = Long.hashCode(aVar2.m());
                            ne00VarO = aVar2.o();
                            dVarC = c.c(aVar2, dVarH);
                            if (aVar2.k() != null) {
                                l2a.b();
                                throw th;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar5);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, i78VarA, bVar);
                            hlh0.a(aVar2, ne00VarO, dVar3);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            hlh0.a(aVar2, dVarC, cVar);
                            lkf0.d(cb40.a(R.string.common_feedback__something_went_wrong, new Object[0], aVar2), j.g(aVar3, 1.0f), ((lib0) aVar2.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).o, aVar2, 48, 0, 130040);
                            vuc0.a(null, false, null, null, function0, null, g9z.d, null, null, y0a.a, aVar2, 805306368, 431);
                            aVar2.s();
                            aVar2.s();
                        }
                        j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC2, cVar);
                        d dVarH2 = h.h(j.g(aVar3, 1.0f), 0.0f, 72.0f, 1);
                        i78VarA = g78.a(new kw0.i(((cjb0) aVar2.O(qyd0Var)).e, true, new hw0()), aVar4, aVar2, 48);
                        iHashCode = Long.hashCode(aVar2.m());
                        ne00VarO = aVar2.o();
                        dVarC = c.c(aVar2, dVarH2);
                        if (aVar2.k() != null) {
                            l2a.b();
                            throw th;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, bVar);
                        hlh0.a(aVar2, ne00VarO, dVar3);
                        if (aVar2.g()) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        } else {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, cVar);
                        lkf0.d(cb40.a(R.string.common_feedback__something_went_wrong, new Object[0], aVar2), j.g(aVar3, 1.0f), ((lib0) aVar2.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).o, aVar2, 48, 0, 130040);
                        vuc0.a(null, false, null, null, function0, null, g9z.d, null, null, y0a.a, aVar2, 805306368, 431);
                        aVar2.s();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i2 & 14) | 384, 2);
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xcj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                    ((Integer) obj2).getClass();
                    ycj0.a(qj40.a(i | 1), (a) obj, dVar2, function0);
                    return Unit.a;
                }
            };
        }
    }
}
