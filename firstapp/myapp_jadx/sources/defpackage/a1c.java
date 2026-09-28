package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a1c {
    public static final List<j58> a = b.k(new j58(r58.d(4294948864L)), new j58(r58.d(4294967295L)), new j58(r58.d(4294948864L)));

    public static final void a(int i, final op8 op8Var, a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(283882495);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            final Pair[] pairArr = {new Pair(Float.valueOf(0.0f), new j58(r58.d(4279382054L))), new Pair(Float.valueOf(100.0f), new j58(r58.d(4280441159L)))};
            or0.a(null, false, false, null, pp8.b(-1142357880, new Function2() { // from class: x0c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarA = androidx.compose.foundation.a.a(j.e(d.a.b, 1.0f), ya5.a.i((Pair[]) Arrays.copyOf(pairArr, 2), 14), null, 0.0f, 6);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarA);
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
                        fc0.a(0, op8Var, aVar2);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 24576);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new y0c(i, op8Var);
        }
    }

    public static final void b(int i, a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(1461651589);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarC = j.C(aVar2, null, 3);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarC);
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
            hlh0.a(bVarI, dVarC2, yka.a.d);
            h9n.a(erz.a(R.drawable.ic_nodata, 0, bVarI), "no_data", j.r(aVar2, 36.0f), null, null, 0.0f, new gf4(c68.a(R.color.text_type1_secondary, bVarI), 5), bVarI, 432, 56);
            ty0.a(bVarI, j.i(aVar2, 16.0f));
            lkf0.d(cb40.a(R.string.common_feedback__something_went_wrong_please_try_again_later, new Object[0], bVarI), null, c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 0, 0, 130042);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new z0c();
        }
    }

    public static final d c(boolean z) {
        List listK = b.k(new j58(r58.d(4281761612L)), new j58(r58.d(4280703045L)));
        List listK2 = b.k(new j58(r58.b(869723100)), new j58(r58.b(863602045)));
        d.a aVar = d.a.b;
        ya5.a aVar2 = ya5.a;
        return z ? ls7.a(androidx.compose.foundation.a.a(lx80.d(aVar, 4.0f, j060.c(8.0f), false, 0L, 0L, 28), ya5.a.h(aVar2, listK, 0.0f, 0.0f, 14), null, 0.0f, 6), j060.c(8.0f)) : androidx.compose.foundation.a.a(ls7.a(aVar, j060.c(8.0f)), ya5.a.h(aVar2, listK2, 0.0f, 0.0f, 14), null, 0.0f, 6);
    }
}
