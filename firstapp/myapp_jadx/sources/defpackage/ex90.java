package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;

/* JADX INFO: loaded from: classes.dex */
public final class ex90 extends d.c implements psr {
    public float D;
    public float E;
    public float F;
    public float G;
    public boolean H;

    @Override // defpackage.psr
    public final int C(xkt xktVar, mzo mzoVar, int i) {
        long jP2 = p2(xktVar);
        if (kxa.g(jP2)) {
            return kxa.i(jP2);
        }
        if (!this.H) {
            i = oxa.f(i, jP2);
        }
        return oxa.g(mzoVar.b0(i), jP2);
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        int iK;
        int i;
        int iJ;
        int iH;
        long jA;
        long jP2 = p2(tVar);
        if (this.H) {
            jA = oxa.e(j, jP2);
        } else {
            if (Float.isNaN(this.D)) {
                iK = kxa.k(j);
                int i2 = kxa.i(jP2);
                if (iK > i2) {
                    iK = i2;
                }
            } else {
                iK = kxa.k(jP2);
            }
            if (Float.isNaN(this.F)) {
                i = kxa.i(j);
                int iK2 = kxa.k(jP2);
                if (i < iK2) {
                    i = iK2;
                }
            } else {
                i = kxa.i(jP2);
            }
            if (Float.isNaN(this.E)) {
                iJ = kxa.j(j);
                int iH2 = kxa.h(jP2);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = kxa.j(jP2);
            }
            if (Float.isNaN(this.G)) {
                iH = kxa.h(j);
                int iJ2 = kxa.j(jP2);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = kxa.h(jP2);
            }
            jA = oxa.a(iK, i, iJ, iH);
        }
        y yVarD0 = vhvVar.d0(jA);
        return t.z1(tVar, yVarD0.a, yVarD0.b, new dmi(yVarD0, 2));
    }

    @Override // defpackage.psr
    public final int o(xkt xktVar, mzo mzoVar, int i) {
        long jP2 = p2(xktVar);
        if (kxa.g(jP2)) {
            return kxa.i(jP2);
        }
        if (!this.H) {
            i = oxa.f(i, jP2);
        }
        return oxa.g(mzoVar.a0(i), jP2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long p2(t tVar) {
        int iY0;
        int iY1;
        int iY2;
        int i = 0;
        if (Float.isNaN(this.F)) {
            iY0 = Integer.MAX_VALUE;
        } else {
            iY0 = tVar.y0(this.F);
            if (iY0 < 0) {
                iY0 = 0;
            }
        }
        if (Float.isNaN(this.G)) {
            iY1 = Integer.MAX_VALUE;
        } else {
            iY1 = tVar.y0(this.G);
            if (iY1 < 0) {
                iY1 = 0;
            }
        }
        if (Float.isNaN(this.D)) {
            iY2 = 0;
        } else {
            iY2 = tVar.y0(this.D);
            if (iY2 < 0) {
                iY2 = 0;
            }
            if (iY2 > iY0) {
                iY2 = iY0;
            }
            if (iY2 == Integer.MAX_VALUE) {
                iY2 = 0;
            }
        }
        if (!Float.isNaN(this.E)) {
            int iY3 = tVar.y0(this.E);
            if (iY3 < 0) {
                iY3 = 0;
            }
            if (iY3 > iY1) {
                iY3 = iY1;
            }
            if (iY3 != Integer.MAX_VALUE) {
                i = iY3;
            }
        }
        return oxa.a(iY2, iY0, i, iY1);
    }

    @Override // defpackage.psr
    public final int s(xkt xktVar, mzo mzoVar, int i) {
        long jP2 = p2(xktVar);
        if (kxa.f(jP2)) {
            return kxa.h(jP2);
        }
        if (!this.H) {
            i = oxa.g(i, jP2);
        }
        return oxa.f(mzoVar.x(i), jP2);
    }

    @Override // defpackage.psr
    public final int w(xkt xktVar, mzo mzoVar, int i) {
        long jP2 = p2(xktVar);
        if (kxa.f(jP2)) {
            return kxa.h(jP2);
        }
        if (!this.H) {
            i = oxa.g(i, jP2);
        }
        return oxa.f(mzoVar.R(i), jP2);
    }
}
