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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ubo {
    public static final void a(final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i) {
        final Function0<Unit> function2;
        b bVarA = v2g.a(function0, function1, aVar, -278982509);
        int i2 = (bVarA.A(function0) ? 4 : 2) | i | (bVarA.A(function1) ? 32 : 16);
        if (bVarA.q(i2 & 1, (i2 & 19) != 18)) {
            function2 = function0;
            u60.a(function2, new yle(false, false, 3), pp8.b(-1890860196, new Function2() { // from class: qbo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarF = g3w.f(j.e(aVar3, 1.0f), true, function0);
                        aiv aivVarC = g75.c(ht.a.h, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarF);
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
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, aivVarC, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        d dVarG = j.g(aVar3, 1.0f);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = new sbo(0);
                            aVar2.r(objY);
                        }
                        d dVarF2 = g3w.f(dVarG, true, (Function0) objY);
                        kw0.k kVar = kw0.c;
                        n54.a aVar5 = ht.a.m;
                        i78 i78VarA = g78.a(kVar, aVar5, aVar2, 0);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarF2);
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
                        hlh0.a(aVar2, i78VarA, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        d dVarG2 = j.g(aVar3, 1.0f);
                        qyd0 qyd0Var = oib0.a;
                        d dVarB = androidx.compose.foundation.a.b(dVarG2, ((lib0) aVar2.O(qyd0Var)).i0, zk40.a);
                        i78 i78VarA2 = g78.a(kVar, aVar5, aVar2, 0);
                        int iHashCode3 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO3 = aVar2.o();
                        d dVarC3 = c.c(aVar2, dVarB);
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
                        hlh0.a(aVar2, i78VarA2, bVar);
                        hlh0.a(aVar2, ne00VarO3, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar2, iHashCode3, c1350a);
                        }
                        hlh0.a(aVar2, dVarC3, cVar);
                        d dVarF3 = h.f(androidx.compose.foundation.d.d(j.g(aVar3, 1.0f), false, null, null, function1, 15), 16.0f);
                        Object objY2 = aVar2.y();
                        if (objY2 == c0042a) {
                            z = false;
                            objY2 = new tbo(0);
                            aVar2.r(objY2);
                        } else {
                            z = false;
                        }
                        d dVarH = g3w.h(xa80.b(dVarF3, z, (Function1) objY2), "filter_by_date_cell");
                        d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar2, 48);
                        int iHashCode4 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO4 = aVar2.o();
                        d dVarC4 = c.c(aVar2, dVarH);
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
                        hlh0.a(aVar2, d160VarA, bVar);
                        hlh0.a(aVar2, ne00VarO4, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode4))) {
                            j3c.a(iHashCode4, aVar2, iHashCode4, c1350a);
                        }
                        hlh0.a(aVar2, dVarC4, cVar);
                        h6n.b(erz.a(R.drawable.ic__calendar, 0, aVar2), "Calendar icon", j.r(aVar3, 24.0f), ((lib0) aVar2.O(qyd0Var)).O, aVar2, 432, 0);
                        lkf0.d(cb40.a(R.string.bet_history__filter_by_date, new Object[0], aVar2), h.j(aVar3, 8.0f, 0.0f, 0.0f, 0.0f, 14), ((lib0) aVar2.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).k, aVar2, 48, 0, 131064);
                        aVar2.s();
                        aVar2.s();
                        aVar2.s();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarA), bVarA, (i2 & 14) | 432, 0);
        } else {
            function2 = function0;
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function2, function1) { // from class: rbo
                public final /* synthetic */ Function0 a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = function2;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ubo.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
