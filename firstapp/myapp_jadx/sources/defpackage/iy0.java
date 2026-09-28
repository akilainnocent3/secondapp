package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;

/* JADX INFO: loaded from: classes.dex */
public final class iy0 extends d.c implements psr {
    public float D;

    @Override // defpackage.psr
    public final int C(xkt xktVar, mzo mzoVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.D) : mzoVar.b0(i);
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        long jQ2 = q2(j, true);
        if (jxo.b(jQ2, 0L)) {
            jQ2 = p2(j, true);
            if (jxo.b(jQ2, 0L)) {
                jQ2 = s2(j, true);
                if (jxo.b(jQ2, 0L)) {
                    jQ2 = r2(j, true);
                    if (jxo.b(jQ2, 0L)) {
                        jQ2 = q2(j, false);
                        if (jxo.b(jQ2, 0L)) {
                            jQ2 = p2(j, false);
                            if (jxo.b(jQ2, 0L)) {
                                jQ2 = s2(j, false);
                                if (jxo.b(jQ2, 0L)) {
                                    jQ2 = r2(j, false);
                                    if (jxo.b(jQ2, 0L)) {
                                        jQ2 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!jxo.b(jQ2, 0L)) {
            int i = (int) (jQ2 >> 32);
            int i2 = (int) (4294967295L & jQ2);
            if (!((i >= 0) & (i2 >= 0))) {
                ykn.a("width and height must be >= 0");
            }
            j = oxa.h(i, i, i2, i2);
        }
        y yVarD0 = vhvVar.d0(j);
        return t.z1(tVar, yVarD0.a, yVarD0.b, new hy0(yVarD0, 0));
    }

    @Override // defpackage.psr
    public final int o(xkt xktVar, mzo mzoVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.D) : mzoVar.a0(i);
    }

    public final long p2(long j, boolean z) {
        int iRound;
        int iH = kxa.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH * this.D)) <= 0) {
            return 0L;
        }
        if (!z || c.b(iRound, j, iH)) {
            return (((long) iRound) << 32) | (((long) iH) & 4294967295L);
        }
        return 0L;
    }

    public final long q2(long j, boolean z) {
        int iRound;
        int i = kxa.i(j);
        if (i == Integer.MAX_VALUE || (iRound = Math.round(i / this.D)) <= 0) {
            return 0L;
        }
        if (!z || c.b(i, j, iRound)) {
            return (((long) i) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long r2(long j, boolean z) {
        int iJ = kxa.j(j);
        int iRound = Math.round(iJ * this.D);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || c.b(iRound, j, iJ)) {
            return (((long) iRound) << 32) | (((long) iJ) & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.psr
    public final int s(xkt xktVar, mzo mzoVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.D) : mzoVar.x(i);
    }

    public final long s2(long j, boolean z) {
        int iK = kxa.k(j);
        int iRound = Math.round(iK / this.D);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || c.b(iK, j, iRound)) {
            return (((long) iK) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.psr
    public final int w(xkt xktVar, mzo mzoVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.D) : mzoVar.R(i);
    }
}
