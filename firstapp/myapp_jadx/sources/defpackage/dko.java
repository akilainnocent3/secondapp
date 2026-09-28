package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dko {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final float f, float f2, final int i, a aVar, final int i2) {
        final float f3;
        Pair pair;
        b bVarI = aVar.i(1117340042);
        int i3 = i2 | 54;
        if ((i2 & 384) == 0) {
            i3 |= bVarI.d(i) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new bko();
                bVarI.r(objY);
            }
            d.a aVar2 = d.a.b;
            d dVarH = g3w.h(xa80.b(aVar2, false, (Function1) objY), "rating_bar");
            f3 = 1.0f;
            d160 d160VarA = b160.a(new kw0.i(1.0f, true, new hw0()), ht.a.j, bVarI, 0);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            bVarI.N(-1956695971);
            for (int i4 = 0; i4 < 5; i4++) {
                if (i4 < i) {
                    bVarI.N(1831578650);
                    pair = new Pair(Integer.valueOf(R.drawable.ic_star_on), new j58(((lib0) bVarI.O(oib0.a)).W));
                    bVarI.X(false);
                } else {
                    bVarI.N(1831665915);
                    pair = new Pair(Integer.valueOf(R.drawable.ic_star_off), new j58(((lib0) bVarI.O(oib0.a)).Q));
                    bVarI.X(false);
                }
                h6n.b(erz.a(((Number) pair.a).intValue(), 0, bVarI), "Star", j.r(aVar2, 10.0f), ((j58) pair.b).a, bVarI, 48, 0);
            }
            bVarI.X(false);
            bVarI.X(true);
            f = 10.0f;
        } else {
            bVarI.G();
            f3 = f2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: cko
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    dko.a(f, f3, i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
