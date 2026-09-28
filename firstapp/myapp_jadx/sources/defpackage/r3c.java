package defpackage;

import androidx.compose.runtime.k;
import kotlin.ranges.f;
import kotlin.time.TimeMark;
import kotlin.time.b;
import kotlin.time.i;

/* JADX INFO: loaded from: classes.dex */
public final class r3c extends crz {
    public TimeMark A;
    public boolean B;
    public float C;
    public l58 D;
    public crz E;
    public final long F;
    public final crz f;
    public final d0b i;
    public final long v;
    public final i w;
    public final boolean y;
    public final osw z;

    public r3c(crz crzVar, crz crzVar2, d0b d0bVar, long j, boolean z) {
        i.a aVar = i.a.a;
        this.f = crzVar2;
        this.i = d0bVar;
        this.v = j;
        this.w = aVar;
        this.y = z;
        this.z = k.a(0);
        this.C = 1.0f;
        this.E = crzVar;
        long jI = crzVar != null ? crzVar.i() : 0L;
        long jI2 = crzVar2 != null ? crzVar2.i() : 0L;
        long jFloatToRawIntBits = 9205357640488583168L;
        boolean z2 = jI != 9205357640488583168L;
        boolean z3 = jI2 != 9205357640488583168L;
        if (z2 && z3) {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jI & 4294967295L)), Float.intBitsToFloat((int) (jI2 & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jI >> 32)), Float.intBitsToFloat((int) (jI2 >> 32))))) << 32);
        }
        this.F = jFloatToRawIntBits;
    }

    @Override // defpackage.crz
    public final boolean a(float f) {
        this.C = f;
        return true;
    }

    @Override // defpackage.crz
    public final boolean b(l58 l58Var) {
        this.D = l58Var;
        return true;
    }

    @Override // defpackage.crz
    public final long i() {
        return this.F;
    }

    @Override // defpackage.crz
    public final void j(tcf tcfVar) {
        boolean z = this.B;
        crz crzVar = this.f;
        if (z) {
            k(tcfVar, crzVar, this.C);
            return;
        }
        TimeMark timeMarkA = this.A;
        if (timeMarkA == null) {
            timeMarkA = this.w.a();
            this.A = timeMarkA;
        }
        float fE = b.e(timeMarkA.a()) / b.e(this.v);
        float fD = f.d(fE, 0.0f, 1.0f);
        float f = this.C;
        float f2 = fD * f;
        if (this.y) {
            f -= f2;
        }
        this.B = fE >= 1.0f;
        k(tcfVar, this.E, f);
        k(tcfVar, crzVar, f2);
        if (this.B) {
            this.E = null;
        } else {
            u5a0 u5a0Var = (u5a0) this.z;
            u5a0Var.k(u5a0Var.D() + 1);
        }
    }

    public final void k(tcf tcfVar, crz crzVar, float f) {
        if (crzVar == null || f <= 0.0f) {
            return;
        }
        long jD = tcfVar.d();
        long jI = crzVar.i();
        long jC = (jI == 9205357640488583168L || yw90.e(jI) || jD == 9205357640488583168L || yw90.e(jD)) ? jD : jrf.c(jI, this.i.a(jI, jD));
        if (jD == 9205357640488583168L || yw90.e(jD)) {
            crzVar.g(tcfVar, jC, f, this.D);
            return;
        }
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jD >> 32)) - Float.intBitsToFloat((int) (jC >> 32))) / 2.0f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jD & 4294967295L)) - Float.intBitsToFloat((int) (jC & 4294967295L))) / 2.0f;
        tcfVar.F1().a.e(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            crzVar.g(tcfVar, jC, f, this.D);
        } finally {
            float f2 = -fIntBitsToFloat;
            float f3 = -fIntBitsToFloat2;
            tcfVar.F1().a.e(f2, f3, f2, f3);
        }
    }
}
