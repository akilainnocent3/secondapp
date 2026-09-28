package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class oly extends d.c implements psr {
    public float D;
    public float E;
    public boolean F;

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        final y yVarD0 = vhvVar.d0(j);
        return t.z1(tVar, yVarD0.a, yVarD0.b, new Function1() { // from class: nly
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                oly olyVar = this.a;
                boolean z = olyVar.F;
                float f = olyVar.D;
                y yVar = yVarD0;
                if (z) {
                    y.a.A(aVar, yVar, aVar.y0(f), aVar.y0(olyVar.E));
                } else {
                    aVar.s(yVar, aVar.y0(f), aVar.y0(olyVar.E), 0.0f);
                }
                return Unit.a;
            }
        });
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }
}
