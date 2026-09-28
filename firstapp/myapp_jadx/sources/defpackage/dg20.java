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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class dg20 {
    public static final void a(final kk20 kk20Var, final ofb0 ofb0Var, final Function2 function2, a aVar, final int i) {
        final kk20 kk20Var2;
        float f;
        boolean z;
        kk20Var.getClass();
        b bVarI = aVar.i(-1596804205);
        int i2 = i | (bVarI.M(kk20Var) ? 4 : 2) | (bVarI.d(ofb0Var == null ? -1 : ofb0Var.ordinal()) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            long jA = c68.a(R.color.background_general_primary, bVarI);
            zk40.a aVar2 = zk40.a;
            d.a aVar3 = d.a.b;
            d dVarH = h.h(j.g(androidx.compose.foundation.a.b(aVar3, jA, aVar2), 1.0f), 0.0f, 8.0f, 1);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                objY = new Function0() { // from class: bg20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(kk20Var.a, Boolean.FALSE);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarD = androidx.compose.foundation.d.d(dVarH, false, null, null, (Function0) objY, 15);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarD);
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
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            d dVarJ = h.j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 12.0f, 0.0f, 4.0f, 0.0f, 10);
            imf0 imf0VarL = mla.l(R.style.B2_R, bVarI);
            String str = kk20Var.b;
            long jA2 = c68.a(R.color.text_type1_primary, bVarI);
            t9i t9iVar = t9i.E;
            lkf0.d(str, dVarJ, jA2, null, 0L, null, t9iVar, null, 0L, null, new gdf0(6), 0L, 2, false, 3, 0, null, imf0VarL, bVarI, 1572864, 24960, 109496);
            b bVar2 = bVarI;
            String str2 = kk20Var.c;
            d0b.a.e eVar = d0b.a.b;
            if (str2 != null) {
                bVar2.N(-1905594030);
                f = 20.0f;
                mw90.b(kk20Var.c, "logo for team", j.r(aVar3, 20.0f), null, erz.a(pfb0.a(ofb0Var, e9f0.a), 0, bVar2), null, null, null, eVar, 0.0f, null, bVar2, 432, 6, 31720);
                bVar2 = bVar2;
                bVar2.X(false);
            } else {
                f = 20.0f;
                bVar2.N(-1905262113);
                h9n.a(erz.a(pfb0.a(ofb0Var, e9f0.a), 0, bVar2), "Team placeholder icon", j.r(aVar3, 20.0f), null, null, 0.0f, null, bVar2, 432, 120);
                bVar2.X(false);
            }
            d dVarH2 = h.h(aVar3, 8.0f, 0.0f, 2);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVar2, 48);
            int iHashCode2 = Long.hashCode(bVar2.T);
            ne00 ne00VarS2 = bVar2.S();
            d dVarC2 = c.c(bVar2, dVarH2);
            bVar2.D();
            if (bVar2.S) {
                bVar2.F(aVar4);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, i78VarA, bVar);
            hlh0.a(bVar2, ne00VarS2, dVar);
            if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVar2, iHashCode2, c1350a);
            }
            hlh0.a(bVar2, dVarC2, cVar);
            b bVar3 = bVar2;
            lkf0.d(cb40.a(R.string.bet_history__vs, new Object[0], bVar2), null, c68.a(R.color.text_type1_secondary, bVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, bVar2), bVar3, 0, 0, 131066);
            kk20Var2 = kk20Var;
            lkf0.d(kk20Var2.f, null, c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, bVar3), bVar3, 0, 0, 131066);
            b bVar4 = bVar3;
            bVar4.X(true);
            if (kk20Var2.e != null) {
                bVar4.N(-1904331214);
                mw90.b(kk20Var2.e, "logo for team", j.r(aVar3, f), null, erz.a(pfb0.a(ofb0Var, e9f0.b), 0, bVar4), null, null, null, eVar, 0.0f, null, bVar4, 432, 6, 31720);
                bVar4 = bVar4;
                bVar4.X(false);
                z = true;
            } else {
                z = true;
                bVar4.N(-1903999297);
                h9n.a(erz.a(pfb0.a(ofb0Var, e9f0.b), 0, bVar4), "Team placeholder icon", j.r(aVar3, f), null, null, 0.0f, null, bVar4, 432, 120);
                bVar4.X(false);
            }
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            b bVar5 = bVar4;
            lkf0.d(kk20Var2.d, h.j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z), 4.0f, 0.0f, 12.0f, 0.0f, 10), c68.a(R.color.text_type1_primary, bVar4), null, 0L, null, t9iVar, null, 0L, null, null, 0L, 2, false, 3, 0, null, mla.l(R.style.B2_R, bVar4), bVar5, 1572864, 24960, 110520);
            bVarI = bVar5;
            bVarI.X(z);
        } else {
            kk20Var2 = kk20Var;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(ofb0Var, function2, i) { // from class: cg20
                public final /* synthetic */ ofb0 b;
                public final /* synthetic */ Function2 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    dg20.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
