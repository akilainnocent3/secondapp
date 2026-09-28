package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class drz extends d.c implements psr, qcf {
    public crz D;
    public boolean E;
    public ht F;
    public d0b G;
    public float H;
    public l58 I;

    public static final class a extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ y a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar) {
            super(1);
            this.a = yVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            y.a.A(aVar, this.a, 0, 0);
            return Unit.a;
        }
    }

    public static boolean q2(long j) {
        return !yw90.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Reader.READ_DONE) < 2139095040;
    }

    public static boolean r2(long j) {
        return !yw90.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Reader.READ_DONE) < 2139095040;
    }

    @Override // defpackage.qcf
    public final void A(wsr wsrVar) {
        qc6 qc6Var = wsrVar.a;
        long jI = this.D.i();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(r2(jI) ? Float.intBitsToFloat((int) (jI >> 32)) : Float.intBitsToFloat((int) (qc6Var.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(q2(jI) ? Float.intBitsToFloat((int) (jI & 4294967295L)) : Float.intBitsToFloat((int) (qc6Var.d() & 4294967295L)))) & 4294967295L);
        long jC = (Float.intBitsToFloat((int) (qc6Var.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (qc6Var.d() & 4294967295L)) == 0.0f) ? 0L : jrf.c(jFloatToRawIntBits, this.G.a(jFloatToRawIntBits, qc6Var.d()));
        long jA = this.F.a((((long) Math.round(Float.intBitsToFloat((int) (jC >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jC & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (qc6Var.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (qc6Var.d() & 4294967295L)))) & 4294967295L), wsrVar.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        qc6Var.b.a.i(f, f2);
        try {
            this.D.g(wsrVar, jC, this.H, this.I);
            qc6Var.b.a.i(-f, -f2);
            wsrVar.b2();
        } catch (Throwable th) {
            qc6Var.b.a.i(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.psr
    public final int C(xkt xktVar, mzo mzoVar, int i) {
        if (!p2()) {
            return mzoVar.b0(i);
        }
        long jS2 = s2(oxa.b(0, 0, i, 7));
        return Math.max(kxa.k(jS2), mzoVar.b0(i));
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        y yVarD0 = vhvVar.d0(s2(j));
        return t.z1(tVar, yVarD0.a, yVarD0.b, new a(yVarD0));
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    @Override // defpackage.psr
    public final int o(xkt xktVar, mzo mzoVar, int i) {
        if (!p2()) {
            return mzoVar.a0(i);
        }
        long jS2 = s2(oxa.b(0, 0, i, 7));
        return Math.max(kxa.k(jS2), mzoVar.a0(i));
    }

    public final boolean p2() {
        return this.E && this.D.i() != 9205357640488583168L;
    }

    @Override // defpackage.psr
    public final int s(xkt xktVar, mzo mzoVar, int i) {
        if (!p2()) {
            return mzoVar.x(i);
        }
        long jS2 = s2(oxa.b(0, i, 0, 13));
        return Math.max(kxa.j(jS2), mzoVar.x(i));
    }

    public final long s2(long j) {
        boolean z = false;
        boolean z2 = kxa.e(j) && kxa.d(j);
        if (kxa.g(j) && kxa.f(j)) {
            z = true;
        }
        if ((!p2() && z2) || z) {
            return kxa.b(kxa.i(j), 0, kxa.h(j), 0, 10, j);
        }
        long jI = this.D.i();
        int iRound = r2(jI) ? Math.round(Float.intBitsToFloat((int) (jI >> 32))) : kxa.k(j);
        int iRound2 = q2(jI) ? Math.round(Float.intBitsToFloat((int) (jI & 4294967295L))) : kxa.j(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(oxa.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(oxa.g(iRound, j))) << 32);
        if (p2()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!r2(this.D.i()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.D.i() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!q2(this.D.i()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.D.i() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : jrf.c(jFloatToRawIntBits2, this.G.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return kxa.b(oxa.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, oxa.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10, j);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.D + ", sizeToIntrinsics=" + this.E + ", alignment=" + this.F + ", alpha=" + this.H + ", colorFilter=" + this.I + ')';
    }

    @Override // defpackage.psr
    public final int w(xkt xktVar, mzo mzoVar, int i) {
        if (!p2()) {
            return mzoVar.R(i);
        }
        long jS2 = s2(oxa.b(0, i, 0, 13));
        return Math.max(kxa.j(jS2), mzoVar.R(i));
    }
}
