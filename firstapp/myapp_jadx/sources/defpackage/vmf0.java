package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vmf0 {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(-2110661894);
        int i2 = 1;
        if (bVarI.q(i & 1, i != 0)) {
            long jA = c68.a(R.color.background_general_primary, bVarI);
            zk40.a aVar2 = zk40.a;
            d.a aVar3 = d.a.b;
            d dVarG = j.g(j.i(androidx.compose.foundation.a.b(aVar3, jA, aVar2), 44.0f), 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            d dVarI = j.i(aVar3, 42.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarI);
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
            i060 i060VarC = j060.c(0.0f);
            boolean zA = bVarI.A(context);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new hsb0(context, i2);
                bVarI.r(objY);
            }
            ddd0.b(null, false, i060VarC, null, null, 0.0f, false, null, null, (Function0) objY, sw9.b, sw9.c, null, bVarI, 0, 54, 4603);
            bVarI.X(true);
            ute.a(null, 0.0f, c68.a(R.color.background_type1_tertiary, bVarI), bVarI, 0, 3);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new umf0();
        }
    }
}
