package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kng {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static final void a(d dVar, String str, String str2, ofb0 ofb0Var, a aVar, int i) {
        b bVar;
        ofb0 ofb0Var2;
        ?? r1;
        d.a aVar2;
        float f;
        float f2;
        androidx.compose.foundation.layout.d dVar2;
        b bVar2;
        b bVar3;
        dVar.getClass();
        b bVarI = aVar.i(1988082984);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.d(ofb0Var == null ? -1 : ofb0Var.ordinal()) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d.a aVar4 = d.a.b;
            d0b.a.e eVar = d0b.a.b;
            n54 n54Var = ht.a.d;
            androidx.compose.foundation.layout.d dVar3 = androidx.compose.foundation.layout.d.a;
            if (str != null) {
                bVarI.N(-1017984877);
                b bVar4 = bVarI;
                ofb0Var2 = ofb0Var;
                r1 = 0;
                mw90.b(str, "Home Team background logo", g.d(dVar3.b(dw.a(j.r(aVar4, 120.0f), 0.05f), n54Var), -50.0f, 0.0f, 2), null, erz.a(pfb0.a(ofb0Var, e9f0.a), 0, bVarI), null, null, null, eVar, 0.0f, null, bVar4, ((i2 >> 3) & 14) | 48, 6, 31720);
                bVar4.X(false);
                aVar2 = aVar4;
                dVar2 = dVar3;
                f = 120.0f;
                f2 = 0.05f;
                bVar2 = bVar4;
            } else {
                ofb0Var2 = ofb0Var;
                r1 = 0;
                bVarI.N(-1017511817);
                aVar2 = aVar4;
                f = 120.0f;
                f2 = 0.05f;
                dVar2 = dVar3;
                h9n.a(erz.a(pfb0.a(ofb0Var2, e9f0.a), 0, bVarI), "Team placeholder background home icon", g.d(dVar3.b(dw.a(j.r(aVar2, 120.0f), 0.05f), n54Var), -50.0f, 0.0f, 2), null, eVar, 0.0f, null, bVarI, 24624, 104);
                eVar = eVar;
                b bVar5 = bVarI;
                bVar5.X(false);
                bVar2 = bVar5;
            }
            n54 n54Var2 = ht.a.f;
            if (str2 != null) {
                bVar2.N(-1017010826);
                mw90.b(str2, "Away Team background logo", g.d(dVar2.b(dw.a(j.r(aVar2, f), f2), n54Var2), 50.0f, 0.0f, 2), null, erz.a(pfb0.a(ofb0Var2, e9f0.b), r1, bVar2), null, null, null, eVar, 0.0f, null, bVar2, ((i2 >> 6) & 14) | 48, 6, 31720);
                bVar2.X(r1);
                bVar3 = bVar2;
            } else {
                bVar2.N(-1016540742);
                b bVar6 = bVar2;
                h9n.a(erz.a(pfb0.a(ofb0Var2, e9f0.b), r1, bVar2), "Team placeholder background away icon", g.d(dVar2.b(dw.a(j.r(aVar2, f), f2), n54Var2), 50.0f, 0.0f, 2), null, eVar, 0.0f, null, bVar6, 24624, 104);
                b bVar7 = bVar6;
                bVar7.X(r1);
                bVar3 = bVar7;
            }
            bVar3.X(true);
            bVar = bVar3;
        } else {
            b bVar8 = bVarI;
            bVar8.G();
            bVar = bVar8;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new jng(dVar, str, str2, ofb0Var, i);
        }
    }
}
