package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class lzg0 {
    public static final void a(d dVar, final dk5 dk5Var, final dk5 dk5Var2, final float f, a aVar, final int i) {
        d dVar2;
        b bVarI = aVar.i(-1528521091);
        int i2 = i | (bVarI.M(dk5Var) ? 32 : 16) | (bVarI.M(dk5Var2) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            dVar2 = dVar;
            d dVarC = c.c(bVarI, dVar2);
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
            float fD = f.d(f, 0.0f, 1.0f);
            if (fD <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            float f2 = fD;
            if (f2 > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            }
            n45.a(new LayoutWeightElement(f2, true), dk5Var.a, dk5Var.b, false, dk5Var.c, bVarI, 0);
            float fD2 = f.d(1.0f - f, 0.0f, 1.0f);
            if (fD2 <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (fD2 > Float.MAX_VALUE) {
                fD2 = Float.MAX_VALUE;
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(fD2, true);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new g1n(1);
                bVarI.r(objY);
            }
            n45.a(androidx.compose.ui.draw.a.a(layoutWeightElement, (Function1) objY), dk5Var2.a, dk5Var2.b, false, dk5Var2.c, bVarI, 0);
            bVarI.X(true);
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final d dVar3 = dVar2;
            eVarZ.d = new Function2(dk5Var, dk5Var2, f, i) { // from class: kzg0
                public final /* synthetic */ dk5 b;
                public final /* synthetic */ dk5 c;
                public final /* synthetic */ float d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3079);
                    lzg0.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
