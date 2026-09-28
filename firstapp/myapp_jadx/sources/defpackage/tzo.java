package defpackage;

import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes.dex */
public final class tzo extends rzo {
    public pzo D;
    public boolean E;

    @Override // defpackage.rzo, defpackage.psr
    public final int C(xkt xktVar, mzo mzoVar, int i) {
        return this.D == pzo.a ? mzoVar.a0(i) : mzoVar.b0(i);
    }

    @Override // defpackage.rzo, defpackage.psr
    public final int o(xkt xktVar, mzo mzoVar, int i) {
        return this.D == pzo.a ? mzoVar.a0(i) : mzoVar.b0(i);
    }

    @Override // defpackage.rzo
    public final long p2(vhv vhvVar, long j) {
        int iA0 = this.D == pzo.a ? vhvVar.a0(kxa.h(j)) : vhvVar.b0(kxa.h(j));
        if (iA0 < 0) {
            iA0 = 0;
        }
        if (iA0 < 0) {
            ykn.a("width must be >= 0");
        }
        return oxa.h(iA0, iA0, 0, Reader.READ_DONE);
    }

    @Override // defpackage.rzo
    public final boolean q2() {
        return this.E;
    }
}
