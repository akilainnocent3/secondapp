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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wx90 {
    public static final void a(final boolean z, a aVar, final int i) {
        b bVarI = aVar.i(898472380);
        int i2 = (bVarI.b(z) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), c68.a(R.color.background_general_primary, bVarI), zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            if (z) {
                bVarI.N(523738292);
                gy90.a(0, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(523776732);
                bVarI.X(false);
            }
            ty0.a(bVarI, j.i(aVar2, 24.0f));
            yx90.a(j.g(h.h(aVar2, 20.0f, 0.0f, 2), 1.0f), bVarI, 6);
            ty0.a(bVarI, j.i(aVar2, 16.0f));
            d dVarG = j.g(h.h(aVar2, 20.0f, 0.0f, 2), 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            yx90.a(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), bVarI, 0);
            ty0.a(bVarI, j.w(aVar2, 8.0f));
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            yx90.a(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), bVarI, 0);
            szg.a(bVarI, true, aVar2, 16.0f, bVarI);
            yx90.a(j.g(h.h(aVar2, 20.0f, 0.0f, 2), 1.0f), bVarI, 6);
            ty0.a(bVarI, j.i(aVar2, 16.0f));
            g75.a(j.i(androidx.compose.foundation.a.a(j.g(h.h(aVar2, 20.0f, 0.0f, 2), 1.0f), m590.a(null, bVarI, 3), null, 0.0f, 6), 40.0f), bVarI, 0);
            ty0.a(bVarI, j.i(aVar2, 28.0f));
            ux90.a(kotlin.collections.b.k(Float.valueOf(1.0f), Float.valueOf(0.625f)), bVarI, 6);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, z) { // from class: vx90
                public final /* synthetic */ boolean a;

                {
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    wx90.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
