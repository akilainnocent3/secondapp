package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q4q {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(o4q o4qVar, a aVar, int i) {
        b bVar;
        Pair pair;
        o4qVar.getClass();
        b bVarI = aVar.i(-1266870239);
        int i2 = i | (bVarI.M(o4qVar) ? 4 : 2) | 48;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = o4qVar instanceof o4q.a;
            d.a aVar2 = d.a.b;
            if (z) {
                bVarI.N(-1453493470);
                o4q.a aVar3 = (o4q.a) o4qVar;
                if (aVar3.a) {
                    bVarI.N(-1453466252);
                    pair = new Pair(new j58(fjb0.b(bVarI).j), new j58(fjb0.b(bVarI).K0));
                    bVarI.X(false);
                } else {
                    bVarI.N(-1453383916);
                    pair = new Pair(new j58(fjb0.b(bVarI).a), new j58(fjb0.b(bVarI).q0));
                    bVarI.X(false);
                }
                long j = ((j58) pair.a).a;
                d dVarG = h.g(androidx.compose.foundation.a.b(aVar2, ((j58) pair.b).a, j060.c(4.0f)), 4.0f, 4.0f);
                d160 d160VarA = b160.a(new kw0.i(2.0f, true, new hw0()), ht.a.k, bVarI, 54);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarG);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                bVarI.N(-789735899);
                bVarI.X(false);
                lkf0.d(aVar3.b, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).o, bVarI, 0, 0, 131066);
                bVar = bVarI;
                bVar.X(true);
                bVar.X(false);
            } else {
                if (!o4qVar.equals(o4q.b.a)) {
                    throw igf0.a(bVarI, -1986550750, false);
                }
                bVarI.N(-1452382244);
                qyd0 qyd0Var = oib0.a;
                lkf0.d(cb40.a(R.string.page_lucky_numbers__upcoming, new Object[0], bVarI), h.g(androidx.compose.foundation.a.b(aVar2, ((lib0) bVarI.O(qyd0Var)).q0, j060.c(4.0f)), 4.0f, 5.0f), ((lib0) bVarI.O(qyd0Var)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, 0, 0, 131064);
                bVar = bVarI;
                bVar.X(false);
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new p4q(o4qVar, i);
        }
    }
}
