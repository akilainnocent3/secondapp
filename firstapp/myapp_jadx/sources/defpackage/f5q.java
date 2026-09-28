package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f5q implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                d5q d5qVar = (d5q) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d.a aVar2 = d.a.b;
                    d dVarK = j.k(j.w(aVar2, 360.0f), 360.0f, 0.0f, 2);
                    long j = j58.b;
                    zk40.a aVar3 = zk40.a;
                    d dVarB = androidx.compose.foundation.a.b(dVarK, j, aVar3);
                    i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar, 0);
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
                    yka.a.b bVar = yka.a.f;
                    hlh0.a(aVar, i78VarA, bVar);
                    yka.a.d dVar = yka.a.e;
                    hlh0.a(aVar, ne00VarO, dVar);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(aVar, dVarC, cVar);
                    d dVarI = j.i(j.g(aVar2, 1.0f), 32.0f);
                    qyd0 qyd0Var = oib0.a;
                    d dVarB2 = androidx.compose.foundation.a.b(dVarI, ((lib0) aVar.O(qyd0Var)).H0, aVar3);
                    n54 n54Var = ht.a.a;
                    aiv aivVarC = g75.c(n54Var, false);
                    int iHashCode2 = Long.hashCode(aVar.m());
                    ne00 ne00VarO2 = aVar.o();
                    d dVarC2 = c.c(aVar, dVarB2);
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
                    hlh0.a(aVar, aivVarC, bVar);
                    hlh0.a(aVar, ne00VarO2, dVar);
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
                    }
                    hlh0.a(aVar, dVarC2, cVar);
                    qyd0 qyd0Var2 = ejb0.a;
                    h9n.a(erz.a(R.drawable.ic_sportybet_logo, 0, aVar), "logo", j.t(h.f(h.j(aVar2, ((cjb0) aVar.O(qyd0Var2)).e, ((cjb0) aVar.O(qyd0Var2)).c, 0.0f, 0.0f, 12), 1.7f), 79.6f, 16.6f), null, null, 0.0f, new gf4(((lib0) aVar.O(qyd0Var)).a0, 5), aVar, 48, 56);
                    aVar.s();
                    d dVarG = j.g(aVar2, 1.0f);
                    aiv aivVarC2 = g75.c(n54Var, false);
                    int iHashCode3 = Long.hashCode(aVar.m());
                    ne00 ne00VarO3 = aVar.o();
                    d dVarC3 = c.c(aVar, dVarG);
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
                    hlh0.a(aVar, aivVarC2, bVar);
                    hlh0.a(aVar, ne00VarO3, dVar);
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode3))) {
                        j3c.a(iHashCode3, aVar, iHashCode3, c1350a);
                    }
                    hlh0.a(aVar, dVarC3, cVar);
                    d dVarI2 = j.i(j.g(aVar2, 1.0f), 100.0f);
                    List listK = b.k(new j58(r58.d(4293138471L)), new j58(r58.b(14948391)));
                    float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
                    ty0.a(aVar, androidx.compose.foundation.a.a(dVarI2, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), null, 0.0f, 6));
                    q5q.b(h.j(h.h(aVar2, ((cjb0) aVar.O(qyd0Var2)).c, 0.0f, 2), 0.0f, 0.0f, 0.0f, ((cjb0) aVar.O(qyd0Var2)).c, 7), d5qVar, aVar, 0);
                    aVar.s();
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                mhu.c((Function0) obj3, (a) obj, qj40.a(1));
                return Unit.a;
        }
    }

    public /* synthetic */ f5q(d5q d5qVar) {
        this.b = d5qVar;
    }
}
