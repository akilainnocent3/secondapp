package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f5h {
    public static final void a(int i, a aVar, d dVar, String str) {
        d dVar2;
        int i2;
        String strE;
        b bVarI = aVar.i(294428289);
        int i3 = i | 6 | (bVarI.M(str) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            dVar2 = d.a.b;
            d dVarI = j.i(j.g(dVar2, 1.0f), 54.0f);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.foundation.layout.d dVar4 = androidx.compose.foundation.layout.d.a;
            n54 n54Var2 = ht.a.g;
            d dVarA = ls7.a(j.i(j.g(dVar4.b(dVar2, n54Var2), 1.0f), 30.0f), j060.c(8.0f));
            List listK = kotlin.collections.b.k(new j58(r58.d(4294960640L)), new j58(r58.d(4293371136L)));
            float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            int i4 = (14 & 8) != 0 ? 0 : 2;
            d dVarA2 = androidx.compose.foundation.a.a(dVarA, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), i4), null, 0.0f, 6);
            aiv aivVarC2 = g75.c(n54Var, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (str == null) {
                bVarI.N(1698862161);
                strE = pwo.e(R.string.congratulations_you_ve_won_a_free_bet_gifts, bVarI);
                i2 = 0;
                bVarI.X(false);
            } else {
                i2 = 0;
                bVarI.N(1698861200);
                bVarI.X(false);
                strE = str;
            }
            int i5 = i2;
            lkf0.b(strE, h.j(dVar4.b(dVar2, ht.a.d), 55.0f, 0.0f, 12.0f, 0.0f, 10), r58.d(4280426271L), b2x.a(16, bVarI), new n9i(1), t9i.E, null, 0L, null, 0L, 0, false, 1, 0, null, null, bVarI, 196992, 3072, 122816);
            bVarI = bVarI;
            h9n.a(erz.a(R.drawable.ic_fbg_won_confetti, i5, bVarI), null, j.g(j.c(dVar4.b(dVar2, ht.a.f), 1.0f), 0.35f), null, d0b.a.g, 0.0f, null, bVarI, 24624, 104);
            bVarI.X(true);
            h9n.a(erz.a(R.drawable.ic_fbg_won_notification, i5, bVarI), "Gift", j.r(h.j(dVar4.b(dVar2, n54Var2), 5.0f, 0.0f, 0.0f, 0.0f, 14), 42.0f), null, null, 0.0f, null, bVarI, 48, 120);
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new ldc(i, dVar2, str);
        }
    }
}
