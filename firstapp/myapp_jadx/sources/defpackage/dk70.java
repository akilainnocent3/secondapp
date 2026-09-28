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

/* JADX INFO: loaded from: classes5.dex */
public final class dk70 {
    public static final void a(d dVar, ek70 ek70Var, a aVar, int i) {
        long jD;
        ek70Var.getClass();
        String str = ek70Var.a;
        String str2 = ek70Var.b;
        ek70.b bVar = ek70Var.c;
        b bVarI = aVar.i(948773272);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(ek70Var) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            ek70.b bVar2 = ek70.b.a;
            if (bVar == bVar2) {
                bVarI.N(-275015263);
                jD = ((lib0) bVarI.O(oib0.a)).H0;
                bVarI.X(false);
            } else {
                bVarI.N(-274968887);
                bVarI.X(false);
                jD = r58.d(4278465531L);
            }
            crz crzVarA = erz.a(bVar == bVar2 ? R.drawable.ic_default_team_logo_home : R.drawable.ic_default_team_logo_away, 0, bVarI);
            d dVarG = h.g(androidx.compose.foundation.a.b(j.y(dVar, 64.0f, 0.0f, 2), jD, zk40.a), 8.0f, 6.0f);
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new iw0(ht.a.n)), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            ek70.a aVar3 = ek70Var.d;
            ek70.a aVar4 = ek70.a.a;
            d.a aVar5 = d.a.b;
            if (aVar3 == aVar4) {
                bVarI.N(-138914536);
                mw90.b(str2, null, j.r(aVar5, 16.0f), crzVarA, crzVarA, null, null, null, null, 0.0f, null, bVarI, 432, 0, 32736);
                lkf0.d(str, null, ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).i, bVarI, 0, 0, 131066);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                bVarI.N(-138482024);
                lkf0.d(str, null, ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).i, bVarI, 0, 0, 131066);
                bVarI = bVarI;
                mw90.b(str2, null, j.r(aVar5, 16.0f), crzVarA, crzVarA, null, null, null, null, 0.0f, null, bVarI, 432, 0, 32736);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new mag(dVar, i, 2, ek70Var);
        }
    }
}
