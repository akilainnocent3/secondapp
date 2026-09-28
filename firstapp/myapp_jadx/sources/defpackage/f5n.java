package defpackage;

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
public final class f5n {
    public static final void a(final d dVar, final k3n k3nVar, a aVar, final int i) {
        k3nVar.getClass();
        b bVarI = aVar.i(941551631);
        int i2 = (bVarI.d(k3nVar.ordinal()) ? 32 : 16) | i | (bVarI.d(R.drawable.ib_match_tracker_bg) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            final float f = k3nVar == k3n.a ? 0.0f : 180.0f;
            boolean zC = bVarI.c(f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zC || objY == c0042a) {
                objY = new Function1() { // from class: c5n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.r(f);
                        a7lVar.p(12000.0f);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarA = androidx.compose.ui.graphics.a.a(dVar, (Function1) objY);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new d5n();
                bVarI.r(objY2);
            }
            d dVarB = xa80.b(dVarA, false, (Function1) objY2);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            h9n.a(erz.a(R.drawable.ib_match_tracker_bg, (i2 >> 6) & 14, bVarI), null, g3w.h(j.e(d.a.b, 1.0f), "ib_team_image_flip"), null, d0b.a.g, 0.0f, null, bVarI, 25008, 104);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(k3nVar, i) { // from class: e5n
                public final /* synthetic */ k3n b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    f5n.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
