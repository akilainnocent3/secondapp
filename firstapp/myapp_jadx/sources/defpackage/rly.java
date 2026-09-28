package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rly extends d.c implements psr {
    public Function1<? super mmd, iwo> D;
    public boolean E;

    public rly() {
        throw null;
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        final y yVarD0 = vhvVar.d0(j);
        return t.z1(tVar, yVarD0.a, yVarD0.b, new Function1() { // from class: qly
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                rly rlyVar = this.a;
                long j2 = rlyVar.D.invoke(aVar).a;
                boolean z = rlyVar.E;
                y yVar = yVarD0;
                if (z) {
                    y.a.C(aVar, yVar, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                } else {
                    y.a.J(aVar, yVar, (int) (j2 >> 32), (int) (j2 & 4294967295L), null, 12);
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
