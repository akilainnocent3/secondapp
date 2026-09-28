package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wmz extends d.c implements psr {
    public tmz D;

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        float fB = this.D.b(tVar.getLayoutDirection());
        float fD = this.D.d();
        float fC = this.D.c(tVar.getLayoutDirection());
        float fA = this.D.a();
        if (!((Float.compare(fB, 0.0f) >= 0) & (Float.compare(fD, 0.0f) >= 0) & (Float.compare(fC, 0.0f) >= 0) & (Float.compare(fA, 0.0f) >= 0))) {
            ukn.a("Padding must be non-negative");
        }
        final int iY0 = tVar.y0(fB);
        int iY1 = tVar.y0(fC) + iY0;
        final int iY2 = tVar.y0(fD);
        int iY3 = tVar.y0(fA) + iY2;
        final y yVarD0 = vhvVar.d0(oxa.i(-iY1, j, -iY3));
        return t.z1(tVar, oxa.g(yVarD0.a + iY1, j), oxa.f(yVarD0.b + iY3, j), new Function1() { // from class: vmz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((y.a) obj).s(yVarD0, iY0, iY2, 0.0f);
                return Unit.a;
            }
        });
    }
}
