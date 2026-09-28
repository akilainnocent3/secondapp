package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class z2 extends d.c implements qcf, psr, ya80 {
    public ht D;
    public d0b E;
    public float F;
    public l58 G;
    public boolean H;
    public String I;
    public qxa J;

    @Override // defpackage.qcf
    public final void A(wsr wsrVar) {
        qc6 qc6Var = wsrVar.a;
        long jP2 = p2(qc6Var.d());
        long jA = this.D.a(qsh0.e(jP2), qsh0.e(qc6Var.d()), wsrVar.getLayoutDirection());
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        qc6.b bVar = qc6Var.b;
        long jD = bVar.d();
        bVar.a().p();
        try {
            rc6 rc6Var = bVar.a;
            if (this.H) {
                rc6.c(rc6Var, 0.0f, 0.0f, 31);
            }
            rc6Var.i(i, i2);
            ((c0b) this).K.g(wsrVar, jP2, this.F, this.G);
            bVar.a().f();
            bVar.h(jD);
            wsrVar.b2();
        } catch (Throwable th) {
            hrh.a(bVar, jD);
            throw th;
        }
    }

    @Override // defpackage.psr
    public final int C(xkt xktVar, mzo mzoVar, int i) {
        long jB = oxa.b(0, 0, i, 7);
        qxa qxaVar = this.J;
        if (qxaVar != null) {
            qxaVar.z(jB);
        }
        if (((c0b) this).K.i() == 9205357640488583168L) {
            return mzoVar.b0(i);
        }
        long jQ2 = q2(jB);
        return Math.max(kxa.k(jQ2), mzoVar.b0(i));
    }

    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
        String str = this.I;
        if (str != null) {
            lb80.c(pb80Var, str);
            lb80.h(pb80Var, 5);
        }
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        qxa qxaVar = this.J;
        if (qxaVar != null) {
            qxaVar.z(j);
        }
        final y yVarD0 = vhvVar.d0(q2(j));
        return t.z1(tVar, yVarD0.a, yVarD0.b, new Function1() { // from class: y2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a.A((y.a) obj, yVarD0, 0, 0);
                return Unit.a;
            }
        });
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    @Override // defpackage.psr
    public final int o(xkt xktVar, mzo mzoVar, int i) {
        long jB = oxa.b(0, 0, i, 7);
        qxa qxaVar = this.J;
        if (qxaVar != null) {
            qxaVar.z(jB);
        }
        if (((c0b) this).K.i() == 9205357640488583168L) {
            return mzoVar.a0(i);
        }
        long jQ2 = q2(jB);
        return Math.max(kxa.k(jQ2), mzoVar.a0(i));
    }

    public final long p2(long j) {
        if (yw90.e(j)) {
            return 0L;
        }
        long jI = ((c0b) this).K.i();
        if (jI != 9205357640488583168L) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
            if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI & 4294967295L));
            if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            long jA = this.E.a(jFloatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (jA >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (4294967295L & jA))) <= Float.MAX_VALUE) {
                return jrf.c(jFloatToRawIntBits, jA);
            }
        }
        return j;
    }

    public final long q2(long j) {
        float fK;
        int iJ;
        float fD;
        boolean zG = kxa.g(j);
        boolean zF = kxa.f(j);
        if (!zG || !zF) {
            c0b c0bVar = (c0b) this;
            boolean z = kxa.e(j) && kxa.d(j);
            b01 b01Var = c0bVar.K;
            long jI = b01Var.i();
            if (jI != 9205357640488583168L) {
                if (!z || (!zG && !zF)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI & 4294967295L));
                    if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                        int i = qsh0.b;
                        fK = f.d(fIntBitsToFloat, kxa.k(j), kxa.i(j));
                    } else {
                        fK = kxa.k(j);
                    }
                    if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                        int i2 = qsh0.b;
                        fD = f.d(fIntBitsToFloat2, kxa.j(j), kxa.h(j));
                    } else {
                        iJ = kxa.j(j);
                    }
                    long jP2 = p2((((long) Float.floatToRawIntBits(fD)) & 4294967295L) | (((long) Float.floatToRawIntBits(fK)) << 32));
                    return kxa.b(oxa.g(ycv.b(Float.intBitsToFloat((int) (jP2 >> 32))), j), 0, oxa.f(ycv.b(Float.intBitsToFloat((int) (jP2 & 4294967295L))), j), 0, 10, j);
                }
                fK = kxa.i(j);
                iJ = kxa.h(j);
                fD = iJ;
                long jP3 = p2((((long) Float.floatToRawIntBits(fD)) & 4294967295L) | (((long) Float.floatToRawIntBits(fK)) << 32));
                return kxa.b(oxa.g(ycv.b(Float.intBitsToFloat((int) (jP3 >> 32))), j), 0, oxa.f(ycv.b(Float.intBitsToFloat((int) (jP3 & 4294967295L))), j), 0, 10, j);
            }
            if (z && ((b01.b) b01Var.K.a.getValue()).a() != null) {
                return kxa.b(kxa.i(j), 0, kxa.h(j), 0, 10, j);
            }
        }
        return j;
    }

    @Override // defpackage.psr
    public final int s(xkt xktVar, mzo mzoVar, int i) {
        long jB = oxa.b(0, i, 0, 13);
        qxa qxaVar = this.J;
        if (qxaVar != null) {
            qxaVar.z(jB);
        }
        if (((c0b) this).K.i() == 9205357640488583168L) {
            return mzoVar.x(i);
        }
        long jQ2 = q2(jB);
        return Math.max(kxa.j(jQ2), mzoVar.x(i));
    }

    @Override // defpackage.psr
    public final int w(xkt xktVar, mzo mzoVar, int i) {
        long jB = oxa.b(0, i, 0, 13);
        qxa qxaVar = this.J;
        if (qxaVar != null) {
            qxaVar.z(jB);
        }
        if (((c0b) this).K.i() == 9205357640488583168L) {
            return mzoVar.R(i);
        }
        long jQ2 = q2(jB);
        return Math.max(kxa.j(jQ2), mzoVar.R(i));
    }
}
