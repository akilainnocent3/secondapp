package defpackage;

import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes.dex */
public final class lzo extends rzo {
    public pzo D;
    public boolean E;

    @Override // defpackage.rzo
    public final long p2(vhv vhvVar, long j) {
        int iR = this.D == pzo.a ? vhvVar.R(kxa.i(j)) : vhvVar.x(kxa.i(j));
        if (iR < 0) {
            iR = 0;
        }
        if (iR < 0) {
            ykn.a("height must be >= 0");
        }
        return oxa.h(0, Reader.READ_DONE, iR, iR);
    }

    @Override // defpackage.rzo
    public final boolean q2() {
        return this.E;
    }

    @Override // defpackage.rzo, defpackage.psr
    public final int s(xkt xktVar, mzo mzoVar, int i) {
        return this.D == pzo.a ? mzoVar.R(i) : mzoVar.x(i);
    }

    @Override // defpackage.rzo, defpackage.psr
    public final int w(xkt xktVar, mzo mzoVar, int i) {
        return this.D == pzo.a ? mzoVar.R(i) : mzoVar.x(i);
    }
}
