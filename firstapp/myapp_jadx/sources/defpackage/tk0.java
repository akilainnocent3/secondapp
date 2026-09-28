package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tk0 {
    public static final Pair<List<nk0.d<ji10>>, List<nk0.d<gaj<String, androidx.compose.runtime.a, Integer, Unit>>>> a;

    public static final class a implements aiv {
        public static final a a = new a();

        @Override // defpackage.aiv
        public final biv c(t tVar, List<? extends vhv> list, long j) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(list.get(i2).d0(j));
            }
            return t.z1(tVar, kxa.i(j), kxa.h(j), new sk0(arrayList, i));
        }
    }

    static {
        m2g m2gVar = m2g.a;
        a = new Pair<>(m2gVar, m2gVar);
    }

    public static final void a(final nk0 nk0Var, final List<nk0.d<gaj<String, androidx.compose.runtime.a, Integer, Unit>>> list, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(-1794596951);
        int i2 = (i & 6) == 0 ? (bVarI.M(nk0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= bVarI.A(list) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                nk0.d<gaj<String, androidx.compose.runtime.a, Integer, Unit>> dVar = list.get(i3);
                gaj<String, androidx.compose.runtime.a, Integer, Unit> gajVar = dVar.a;
                int i4 = dVar.b;
                int i5 = dVar.c;
                Object objY = bVarI.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = a.a;
                    bVarI.r(objY);
                }
                aiv aivVar = (aiv) objY;
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, d.a.b);
                yka.k.getClass();
                tsr.a aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVar, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                gajVar.invoke(nk0Var.subSequence(i4, i5).b, bVarI, 0);
                bVarI.X(true);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rk0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    tk0.a(nk0Var, list, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
