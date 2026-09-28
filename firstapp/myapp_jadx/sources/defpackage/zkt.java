package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zkt implements urr {
    public final ykt a;

    public zkt(ykt yktVar) {
        this.a = yktVar;
    }

    @Override // defpackage.urr
    public final void C(urr urrVar, float[] fArr) {
        this.a.E.C(urrVar, fArr);
    }

    @Override // defpackage.urr
    public final long D(long j) {
        return gly.f(this.a.E.D(j), b());
    }

    @Override // defpackage.urr
    public final long M(urr urrVar, long j) {
        return Q(urrVar, j, true);
    }

    @Override // defpackage.urr
    public final lk40 P(urr urrVar, boolean z) {
        return this.a.E.P(urrVar, z);
    }

    @Override // defpackage.urr
    public final long Q(urr urrVar, long j, boolean z) {
        boolean z2 = urrVar instanceof zkt;
        ykt yktVar = this.a;
        if (!z2) {
            ykt yktVarA = alt.a(yktVar);
            ywx ywxVar = yktVarA.E;
            long jQ = Q(yktVarA.H, j, z);
            long j2 = yktVarA.F;
            long jE = gly.e(jQ, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!ywxVar.E1().C) {
                wkn.c("LayoutCoordinate operations are only valid when isAttached is true");
            }
            ywxVar.d2();
            ywx ywxVar2 = ywxVar.I;
            if (ywxVar2 != null) {
                ywxVar = ywxVar2;
            }
            return gly.f(jE, ywxVar.Q(urrVar, 0L, z));
        }
        ykt yktVar2 = ((zkt) urrVar).a;
        ywx ywxVar3 = yktVar2.E;
        ywxVar3.d2();
        ykt yktVarX1 = yktVar.E.s1(ywxVar3).x1();
        if (yktVarX1 != null) {
            boolean z3 = !z;
            long jC = iwo.c(iwo.d(yktVar2.k1(yktVarX1, z3), jwo.a(j)), yktVar.k1(yktVarX1, z3));
            return (((long) Float.floatToRawIntBits((int) (jC >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L);
        }
        ykt yktVarA2 = alt.a(yktVar2);
        boolean z4 = !z;
        long jD = iwo.d(iwo.d(yktVar2.k1(yktVarA2, z4), yktVarA2.F), jwo.a(j));
        ykt yktVarA3 = alt.a(yktVar);
        long jC2 = iwo.c(jD, iwo.d(yktVar.k1(yktVarA3, z4), yktVarA3.F));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        ywx ywxVar4 = yktVarA3.E.I;
        ywxVar4.getClass();
        ywx ywxVar5 = yktVarA2.E.I;
        ywxVar5.getClass();
        return ywxVar4.Q(ywxVar5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), z);
    }

    @Override // defpackage.urr
    public final long T(long j) {
        return this.a.E.T(gly.f(j, b()));
    }

    @Override // defpackage.urr
    public final void W(float[] fArr) {
        this.a.E.W(fArr);
    }

    @Override // defpackage.urr
    public final long a() {
        ykt yktVar = this.a;
        return (((long) yktVar.a) << 32) | (((long) yktVar.b) & 4294967295L);
    }

    public final long b() {
        ykt yktVar = this.a;
        ykt yktVarA = alt.a(yktVar);
        return gly.e(Q(yktVarA.H, 0L, true), yktVar.E.Q(yktVarA.E, 0L, true));
    }

    @Override // defpackage.urr
    public final boolean e() {
        return this.a.E.E1().C;
    }

    @Override // defpackage.urr
    public final urr e0() {
        ykt yktVarX1;
        if (!e()) {
            wkn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ywx ywxVar = this.a.E.E.U.d.I;
        if (ywxVar == null || (yktVarX1 = ywxVar.x1()) == null) {
            return null;
        }
        return yktVarX1.H;
    }

    @Override // defpackage.urr
    public final long i0(long j) {
        return this.a.E.i0(gly.f(j, b()));
    }

    @Override // defpackage.urr
    public final long o(long j) {
        return gly.f(this.a.E.o(j), b());
    }

    @Override // defpackage.urr
    public final long w(long j) {
        return this.a.E.w(gly.f(0L, b()));
    }
}
