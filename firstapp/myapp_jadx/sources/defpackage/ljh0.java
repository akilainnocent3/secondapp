package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ljh0 {
    public static final void a(Function0<Unit> function0, a aVar, int i) {
        function0.getClass();
        b bVarI = aVar.i(-968845379);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            long jA = c68.a(R.color.bg_info_secondary, bVarI);
            zk40.a aVar3 = zk40.a;
            d dVarH = h.h(j.k(androidx.compose.foundation.a.b(dVarG, jA, aVar3), 56.0f, 0.0f, 2), 0.0f, 12.0f, 1);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            h9n.a(erz.a(R.drawable.ic__tips, 0, bVarI), "Update Tip Icon", j.r(h.j(aVar2, 12.0f, 0.0f, 0.0f, 0.0f, 14), 20.0f), null, null, 0.0f, new gf4(c68.a(R.color.bg_info_primary, bVarI), 5), bVarI, 432, 56);
            ty0.a(bVarI, j.w(aVar2, 8.0f));
            lkf0.d(cb40.a(R.string.cashout__update_app_banner_description, new Object[0], bVarI), new LayoutWeightElement(1.0f, true), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 0, 0, 262136);
            ty0.a(bVarI, j.w(aVar2, 8.0f));
            d dVarY = j.y(h.j(aVar2, 0.0f, 0.0f, 12.0f, 0.0f, 11), 0.0f, 80.0f, 1);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            d dVarF = h.f(d35.a(ls7.a(j.k(androidx.compose.foundation.d.b(dVarY, (psw) objY, null, false, null, function0, 28), 32.0f, 0.0f, 2), j060.c(2.0f)), 1.0f, c68.a(R.color.text_primary, bVarI), aVar3), 8.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarF);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(cb40.a(R.string.cashout__update_app, new Object[0], bVarI), null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 1, false, 2, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 0, 24960, 109562);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new d5s(i, function0);
        }
    }
}
