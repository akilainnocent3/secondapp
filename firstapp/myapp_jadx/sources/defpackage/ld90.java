package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class ld90 {
    public static final void a(final a390 a390Var, final s9s.b bVar, final Function2 function2, a aVar, final int i) {
        a390Var.getClass();
        function2.getClass();
        b bVarI = aVar.i(741750183);
        int i2 = (bVarI.A(a390Var) ? 4 : 2) | i | 48 | (bVarI.A(function2) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            bVar = s9s.b.d;
            ibs ibsVar = (ibs) bVarI.O(ndt.a);
            ytw ytwVarC = m.c(function2, bVarI);
            boolean zA = bVarI.A(ibsVar) | bVarI.A(a390Var) | bVarI.M(ytwVarC);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new kd90(ibsVar, a390Var, ytwVarC, null);
                bVarI.r(objY);
            }
            xvf.f(a390Var, ibsVar, bVar, (Function2) objY, bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(bVar, function2, i) { // from class: jd90
                public final /* synthetic */ s9s.b b;
                public final /* synthetic */ Function2 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ld90.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
