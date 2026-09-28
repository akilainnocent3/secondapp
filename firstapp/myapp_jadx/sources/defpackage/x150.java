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

/* JADX INFO: loaded from: classes4.dex */
public final class x150 {
    public static final void a(final boolean z, final v150 v150Var, final int i, final Function0 function0, a aVar, final int i2) {
        int i3;
        b bVar;
        b bVarI = aVar.i(-585433564);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.d(v150Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            twd0 twd0VarB = xe0.b(z ? 0.0f : 180.0f, null, "Arrow Rotation", null, bVarI, 3072, 22);
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            boolean z2 = (i3 & 7168) == 2048;
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                objY = new b310(function0, 1);
                bVarI.r(objY);
            }
            d dVarG2 = h.g(androidx.compose.foundation.d.d(dVarG, false, null, null, (Function0) objY, 15), 8.0f, 6.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG2);
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
            int i4 = v150Var.a;
            Integer num = v150Var.b;
            crz crzVarA = erz.a(i4, 0, bVarI);
            bVarI.N(1377066578);
            long jA = c68.a(num.intValue(), bVarI);
            bVarI.X(false);
            h6n.b(crzVarA, null, null, jA, bVarI, 48, 4);
            lkf0.d(cb40.a(i, new Object[0], bVarI), h.h(new LayoutWeightElement(1.0f, true), 6.0f, 0.0f, 2), c68.a(R.color.text_type1_tertiary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((eah0) bVarI.O(gah0.a)).i, bVarI, 0, 0, 131064);
            h6n.b(erz.a(R.drawable.spr_ic_arrow_drop_up_green_20dp, 0, bVarI), null, j.r(p1a.a(aVar2, ((Number) twd0VarB.getValue()).floatValue()), 18.0f), c68.a(R.color.brand_quaternary, bVarI), bVarI, 48, 0);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: w150
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x150.a(z, v150Var, i, function0, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
