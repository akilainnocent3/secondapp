package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class rzo extends d.c implements psr {
    @Override // defpackage.psr
    public int C(xkt xktVar, mzo mzoVar, int i) {
        return mzoVar.b0(i);
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        long jP2 = p2(vhvVar, j);
        if (q2()) {
            jP2 = oxa.e(j, jP2);
        }
        y yVarD0 = vhvVar.d0(jP2);
        return t.z1(tVar, yVarD0.a, yVarD0.b, new qzo(yVarD0, 0));
    }

    @Override // defpackage.psr
    public int o(xkt xktVar, mzo mzoVar, int i) {
        return mzoVar.a0(i);
    }

    public abstract long p2(vhv vhvVar, long j);

    public abstract boolean q2();

    public int s(xkt xktVar, mzo mzoVar, int i) {
        return mzoVar.x(i);
    }

    public int w(xkt xktVar, mzo mzoVar, int i) {
        return mzoVar.R(i);
    }
}
