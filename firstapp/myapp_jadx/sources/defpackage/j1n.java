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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j1n {
    public static final void a(final int i, final int i2, a aVar, final d dVar) {
        b bVarI = aVar.i(1139165088);
        int i3 = (bVarI.d(i) ? 4 : 2) | i2 | 48;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            Integer numValueOf = Integer.valueOf(i);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new g1n(0);
                bVarI.r(objY);
            }
            androidx.compose.animation.a.b(numValueOf, null, (Function1) objY, null, "main-score", null, pp8.b(2108518806, new h1n(), bVarI), bVarI, (i3 & 14) | 1597824, 42);
            dVar = d.a.b;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, dVar) { // from class: i1n
                public final /* synthetic */ int a;
                public final /* synthetic */ d b;

                {
                    this.b = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    j1n.a(this.a, iA, (a) obj, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final a4n.a aVar, final f3n f3nVar, final boolean z, a aVar2, final int i) {
        b bVarI = aVar2.i(673532666);
        int i2 = (bVarI.A(aVar) ? 4 : 2) | i | (bVarI.A(f3nVar) ? 32 : 16) | (bVarI.b(z) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            long jA = c68.a(f3nVar.b(false, doc.a(bVarI), z), bVarI);
            d.a aVar3 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.i(j.g(aVar3, 1.0f), 48.0f), jA, zk40.a);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new e1n(0);
                bVarI.r(objY);
            }
            d dVarB2 = xa80.b(dVarB, false, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB2);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarJ = h.j(aVar3, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            n54 n54Var = ht.a.b;
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            d dVarB3 = dVar2.b(dVarJ, n54Var);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            mw90.b(aVar.d, null, g3w.h(j.r(aVar3, 24.0f), "home_team_logo_image"), erz.a(R.drawable.ic_default_team_logo_home, 0, bVarI), null, null, null, null, null, 0.0f, null, bVarI, 432, 0, 32752);
            lkf0.d(aVar.c, g3w.h(h.h(aVar3, 8.0f, 0.0f, 2), "home_team_name_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, 48, 0, 131064);
            a(aVar.j, 0, bVarI, null);
            lkf0.d(cb40.a(R.string.bet_history__vs, new Object[0], bVarI), g3w.h(h.h(aVar3, 16.0f, 0.0f, 2), "vs_text"), c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 48, 0, 131064);
            a(aVar.k, 0, bVarI, null);
            lkf0.d(aVar.e, g3w.h(h.h(aVar3, 8.0f, 0.0f, 2), "away_team_name_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, 48, 0, 131064);
            mw90.b(aVar.f, null, g3w.h(j.r(aVar3, 24.0f), "away_team_logo_image"), erz.a(R.drawable.ic_default_team_logo_away, 0, bVarI), null, null, null, null, null, 0.0f, null, bVarI, 432, 0, 32752);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
            ute.b(dVar2.b(j.g(aVar3, 1.0f), ht.a.h), 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f3nVar, z, i) { // from class: f1n
                public final /* synthetic */ f3n b;
                public final /* synthetic */ boolean c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(73);
                    j1n.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
