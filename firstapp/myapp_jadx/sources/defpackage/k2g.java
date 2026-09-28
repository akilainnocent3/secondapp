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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class k2g {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    public static final void a(final uvk uvkVar, String str, Function0 function0, a aVar, final int i) {
        int i2;
        final String str2;
        b bVar;
        boolean z;
        boolean z2;
        String strA;
        d.a aVar2;
        int i3;
        int i4;
        final Function0 function1 = function0;
        b bVarI = aVar.i(-140884582);
        if ((i & 6) == 0) {
            i2 = (bVarI.d(uvkVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        int i5 = i & 3072;
        d.a aVar3 = d.a.b;
        if (i5 == 0) {
            i2 |= bVarI.M(aVar3) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d dVarE = j.e(aVar3, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarH = h.h(aVar3, 30.0f, 0.0f, 2);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            int iOrdinal = uvkVar.ordinal();
            if (iOrdinal != 0) {
                z2 = true;
                if (iOrdinal != 1) {
                    throw igf0.a(bVarI, -852620281, false);
                }
                bVarI.N(-852615556);
                z = false;
                strA = cb40.a(R.string.gift__currently_no_used_expired_gifts, new Object[0], bVarI);
                bVarI.X(false);
            } else {
                z = false;
                z2 = true;
                bVarI.N(-852618855);
                strA = cb40.a(R.string.gift__currently_no_available_gifts, new Object[0], bVarI);
                bVarI.X(false);
            }
            lkf0.d(strA, null, c68.a(R.color.text_type1_primary, bVarI), null, mla.m(14.0f, bVarI), null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, bVarI, 0, 0, 261098);
            bVar = bVarI;
            if (str == null || StringsKt.U(str)) {
                str2 = str;
                aVar2 = aVar3;
                i3 = i2;
                i4 = 0;
                bVar.N(-660640540);
                bVar.X(false);
            } else {
                hnw.a(bVar, -660943255, aVar3, 25.0f, bVar);
                i3 = i2;
                aVar2 = aVar3;
                lkf0.d(str, null, c68.a(R.color.brand_secondary, bVar), null, mla.m(14.0f, bVar), null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, bVar, (i2 >> 3) & 14, 0, 261098);
                str2 = str;
                i4 = 0;
                bVar.X(false);
            }
            if (function0 != null) {
                bVar = bVar;
                d.a aVar5 = aVar2;
                hnw.a(bVar, -660549059, aVar5, 25.0f, bVar);
                b bVar3 = bVar;
                xya.a(j.g(aVar5, 1.0f), false, cb40.a(R.string.gift__go_deposit, new Object[i4], bVar), null, null, null, null, null, null, function0, bVar3, ((i3 << 21) & 1879048192) | 6, 506);
                function1 = function0;
                bVar = bVar3;
                bVar.X(i4);
            } else {
                bVar = bVar;
                function1 = function0;
                bVar.N(-660265564);
                bVar.X(i4);
            }
            bVar.X(true);
            bVar.X(true);
        } else {
            str2 = str;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: j2g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    k2g.a(uvkVar, str2, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
