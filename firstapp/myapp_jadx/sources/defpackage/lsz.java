package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;

/* JADX INFO: loaded from: classes.dex */
public final class lsz extends d.c implements psr {
    public float D;
    public twd0<Integer> E;

    public lsz() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        int i;
        twd0<Integer> twd0Var = this.E;
        if (twd0Var != null) {
            osw oswVar = (osw) twd0Var;
            if (oswVar.getValue().intValue() != Integer.MAX_VALUE) {
                i = Math.round(oswVar.getValue().floatValue() * this.D);
            } else {
                i = Integer.MAX_VALUE;
            }
        } else {
            i = Integer.MAX_VALUE;
        }
        int iK = i != Integer.MAX_VALUE ? i : kxa.k(j);
        int iJ = kxa.j(j);
        if (i == Integer.MAX_VALUE) {
            i = kxa.i(j);
        }
        y yVarD0 = vhvVar.d0(oxa.a(iK, i, iJ, kxa.h(j)));
        return t.z1(tVar, yVarD0.a, yVarD0.b, new ksz(yVarD0, 0));
    }
}
