package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n4l implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n4l(op8 op8Var, Function0 function0) {
        this.b = op8Var;
        this.c = function0;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0153  */
    /* JADX WARN: Code duplicated, block: B:49:0x015c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0182  */
    /* JADX WARN: Code duplicated, block: B:54:0x018b  */
    /* JADX WARN: Code duplicated, block: B:55:0x018f  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d9  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        double d;
        aiv aivVarC;
        int iHashCode;
        ne00 ne00VarO;
        d dVarC;
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                op8 op8Var = (op8) obj4;
                Function0 function0 = (Function0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d.a aVar2 = d.a.b;
                    d dVarC2 = j.c(j.g(aVar2, 1.0f), 0.8f);
                    i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar, 48);
                    int iHashCode2 = Long.hashCode(aVar.m());
                    ne00 ne00VarO2 = aVar.o();
                    d dVarC3 = c.c(aVar, dVarC2);
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
                    yka.a.b bVar = yka.a.f;
                    hlh0.a(aVar, i78VarA, bVar);
                    yka.a.d dVar = yka.a.e;
                    hlh0.a(aVar, ne00VarO2, dVar);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(aVar, dVarC3, cVar);
                    long jD = r58.d(4279967269L);
                    zk40.a aVar4 = zk40.a;
                    d dVarB = androidx.compose.foundation.a.b(aVar2, jD, aVar4);
                    if (0.8f <= 0.0d) {
                        ukn.a("invalid weight; must be greater than zero");
                    }
                    d dVarF = h.f(dVarB.n(new LayoutWeightElement(0.8f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.8f, true)), 8.0f);
                    aiv aivVarC2 = g75.c(ht.a.b, false);
                    int iHashCode3 = Long.hashCode(aVar.m());
                    ne00 ne00VarO3 = aVar.o();
                    d dVarC4 = c.c(aVar, dVarF);
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
                    hlh0.a(aVar, aivVarC2, bVar);
                    hlh0.a(aVar, ne00VarO3, dVar);
                    if (aVar.g()) {
                        d = 0.0d;
                    } else {
                        d = 0.0d;
                        if (!Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode3))) {
                        }
                        hlh0.a(aVar, dVarC4, cVar);
                        fc0.a(0, op8Var, aVar);
                        d dVarB2 = androidx.compose.foundation.a.b(aVar2, j58.l, aVar4);
                        if (0.2f <= d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        d dVarN = dVarB2.n(new LayoutWeightElement(0.2f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.2f, true));
                        aivVarC = g75.c(ht.a.h, false);
                        iHashCode = Long.hashCode(aVar.m());
                        ne00VarO = aVar.o();
                        dVarC = c.c(aVar, dVarN);
                        if (aVar.k() != null) {
                            l2a.b();
                            throw null;
                        }
                        aVar.D();
                        if (aVar.g()) {
                            aVar.F(aVar3);
                        } else {
                            aVar.p();
                        }
                        hlh0.a(aVar, aivVarC, bVar);
                        hlh0.a(aVar, ne00VarO, dVar);
                        if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar, iHashCode, c1350a);
                        }
                        hlh0.a(aVar, dVarC, cVar);
                        c6n.b(function0, j.r(androidx.compose.foundation.a.b(aVar2, r58.d(4281678405L), j060.a), 48.0f), false, null, u49.a, aVar, 196608, 28);
                        aVar.s();
                        aVar.s();
                    }
                    j3c.a(iHashCode3, aVar, iHashCode3, c1350a);
                    hlh0.a(aVar, dVarC4, cVar);
                    fc0.a(0, op8Var, aVar);
                    d dVarB3 = androidx.compose.foundation.a.b(aVar2, j58.l, aVar4);
                    if (0.2f <= d) {
                        ukn.a("invalid weight; must be greater than zero");
                    }
                    d dVarN2 = dVarB3.n(new LayoutWeightElement(0.2f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.2f, true));
                    aivVarC = g75.c(ht.a.h, false);
                    iHashCode = Long.hashCode(aVar.m());
                    ne00VarO = aVar.o();
                    dVarC = c.c(aVar, dVarN2);
                    if (aVar.k() != null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar3);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, aivVarC, bVar);
                    hlh0.a(aVar, ne00VarO, dVar);
                    if (aVar.g()) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    } else {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, cVar);
                    c6n.b(function0, j.r(androidx.compose.foundation.a.b(aVar2, r58.d(4281678405L), j060.a), 48.0f), false, null, u49.a, aVar, 196608, 28);
                    aVar.s();
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                pq70.a((d) obj4, (nk0) obj3, (a) obj, qj40.a(7));
                return Unit.a;
        }
    }

    public /* synthetic */ n4l(d dVar, nk0 nk0Var, int i) {
        this.b = dVar;
        this.c = nk0Var;
    }
}
