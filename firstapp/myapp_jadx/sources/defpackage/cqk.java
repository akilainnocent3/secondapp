package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cqk {
    public static final void a(final d dVar, final dqk dqkVar, final Function0 function0, a aVar, final int i) {
        int i2;
        b bVar;
        dqkVar.getClass();
        dqk.a aVar2 = dqkVar.b;
        function0.getClass();
        b bVarI = aVar.i(-219250327);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(dqkVar) : bVarI.A(dqkVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarA = ls7.a(dVar, j060.c(2.0f));
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            d dVarF = h.f(androidx.compose.foundation.d.b(dVarA, (psw) objY, ut50.b(0.0f, 3, c68.a(aVar2.a, bVarI), false), false, null, function0, 28), 4.0f);
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            crz crzVarA = erz.a(R.drawable.ic__gift, 0, bVarI);
            d.a aVar4 = d.a.b;
            h6n.b(crzVarA, "Select gift", j.r(aVar4, 20.0f), c68.a(R.color.icon_brand_sub_primary_d_lighter, bVarI), bVarI, 432, 0);
            bVar = bVarI;
            String strG = dqkVar.a.g((Context) bVar.O(AndroidCompositionLocals_androidKt.b));
            Object objY2 = bVar.y();
            if (objY2 == c0042a) {
                objY2 = new aqk();
                bVar.r(objY2);
            }
            lkf0.d(strG, g3w.h(xa80.b(aVar4, false, (Function1) objY2), dqkVar.c), c68.a(aVar2.a, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVar), bVar, 0, 0, 131064);
            h6n.b(erz.a(R.drawable.ic__arrow_triangle_right, 0, bVar), "Select gift", j.r(aVar4, 10.0f), c68.a(R.color.icon_primary, bVar), bVar, 432, 0);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: bqk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    cqk.a(dVar, dqkVar, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
