package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pqi {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(446237625);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            long jA = c68.a(R.color.bg_primary_d_base, bVarI);
            zk40.a aVar3 = zk40.a;
            d dVarH = g3w.h(androidx.compose.foundation.a.b(dVarE, jA, aVar3), "for_you_empty_guidance");
            kw0.k kVar = kw0.c;
            n54.a aVar4 = ht.a.n;
            i78 i78VarA = g78.a(kVar, aVar4, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            ty0.a(bVarI, j.i(aVar2, 32.0f));
            slm.b(0, 0, 3, bVarI, null);
            ty0.a(bVarI, j.i(aVar2, 16.0f));
            lkf0.d(cb40.a(R.string.personal_page__for_you_empty_placeholder, new Object[0], bVarI), h.h(aVar2, 40.0f, 0.0f, 2), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            ty0.a(bVarI, j.i(aVar2, 40.0f));
            lkf0.d(cb40.a(R.string.personal_page__following_page_how_to_title, new Object[0], bVarI), h.h(aVar2, 24.0f, 0.0f, 2), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, 48, 0, 130040);
            bVarI = bVarI;
            ty0.a(bVarI, j.i(aVar2, 16.0f));
            ute.b(null, 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 0, 3);
            d dVarH2 = h.h(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.bg_secondary_d_lightest, bVarI), aVar3), 0.0f, 32.0f, 1);
            i78 i78VarA2 = g78.a(kVar, aVar4, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            slm.a(6, 0, bVarI, h.h(aVar2, 24.0f, 0.0f, 2));
            bVarI.X(true);
            ute.b(null, 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 0, 3);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new oqi();
        }
    }
}
