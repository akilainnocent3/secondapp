package defpackage;

import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class jmt implements fmt {
    public final ytw A;
    public final mae B;
    public final puw C;
    public final ytw a;
    public final ytw b;
    public final ytw c;
    public final ytw d;
    public final ytw e;
    public final ytw f;
    public final ytw i;
    public final mae v;
    public final ytw w;
    public final ytw y;
    public final ytw z;

    public static final class a extends qlr implements Function0<Float> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            jmt jmtVar = jmt.this;
            float fA = 0.0f;
            if (jmtVar.E() != null) {
                if (jmtVar.z() < 0.0f) {
                    wmt wmtVarI = jmtVar.I();
                    if (wmtVarI != null) {
                        fA = wmtVarI.b();
                    }
                } else {
                    wmt wmtVarI2 = jmtVar.I();
                    fA = wmtVarI2 != null ? wmtVarI2.a() : 1.0f;
                }
            }
            return Float.valueOf(fA);
        }
    }

    public static final class b extends qlr implements Function0<Float> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            jmt jmtVar = jmt.this;
            return Float.valueOf((jmtVar.w() && jmtVar.B() % 2 == 0) ? -jmtVar.z() : jmtVar.z());
        }
    }

    public static final class c extends qlr implements Function0<Boolean> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            jmt jmtVar = jmt.this;
            return Boolean.valueOf(jmtVar.B() == jmtVar.y() && jmtVar.g() == ((Number) jmtVar.B.getValue()).floatValue());
        }
    }

    public jmt() {
        Boolean bool = Boolean.FALSE;
        this.a = m.b(bool);
        this.b = m.b(1);
        this.c = m.b(1);
        this.d = m.b(bool);
        this.e = m.b(null);
        this.f = m.b(Float.valueOf(1.0f));
        this.i = m.b(bool);
        this.v = a6a0.b(new b());
        this.w = m.b(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.y = m.b(fValueOf);
        this.z = m.b(fValueOf);
        this.A = m.b(Long.MIN_VALUE);
        this.B = a6a0.b(new a());
        a6a0.b(new c());
        this.C = new puw();
    }

    @Override // defpackage.qmt
    public final int B() {
        return ((Number) ((x5a0) this.b).getValue()).intValue();
    }

    @Override // defpackage.fmt
    public final Object C(xmt xmtVar, float f, int i, boolean z, tje0 tje0Var) {
        Object objA = puw.a(this.C, new kmt(this, xmtVar, f, i, z, null), tje0Var);
        return objA == y5b.a ? objA : Unit.a;
    }

    @Override // defpackage.qmt
    public final xmt E() {
        return (xmt) ((x5a0) this.w).getValue();
    }

    @Override // defpackage.fmt
    public final Object G(xmt xmtVar, int i, int i2, boolean z, float f, wmt wmtVar, float f2, boolean z2, umt umtVar, boolean z3, v1b v1bVar) {
        Object objA = puw.a(this.C, new gmt(this, i, i2, z, f, wmtVar, xmtVar, f2, z3, z2, umtVar, null), v1bVar);
        return objA == y5b.a ? objA : Unit.a;
    }

    @Override // defpackage.qmt
    public final wmt I() {
        return (wmt) ((x5a0) this.e).getValue();
    }

    public final boolean b(int i, long j) {
        xmt xmtVarE = E();
        if (xmtVarE == null) {
            return true;
        }
        ytw ytwVar = this.A;
        long jLongValue = ((Number) ((x5a0) ytwVar).getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) ((x5a0) ytwVar).getValue()).longValue();
        ((x5a0) ytwVar).setValue(Long.valueOf(j));
        wmt wmtVarI = I();
        float fB = wmtVarI != null ? wmtVarI.b() : 0.0f;
        wmt wmtVarI2 = I();
        float fA = wmtVarI2 != null ? wmtVarI2.a() : 1.0f;
        float fB2 = (jLongValue / 1000000) / xmtVarE.b();
        mae maeVar = this.v;
        float fFloatValue = ((Number) maeVar.getValue()).floatValue() * fB2;
        float fFloatValue2 = ((Number) maeVar.getValue()).floatValue();
        ytw ytwVar2 = this.y;
        float fFloatValue3 = fFloatValue2 < 0.0f ? fB - (((Number) ((x5a0) ytwVar2).getValue()).floatValue() + fFloatValue) : (((Number) ((x5a0) ytwVar2).getValue()).floatValue() + fFloatValue) - fA;
        if (fB == fA) {
            f(fB);
            return false;
        }
        if (fFloatValue3 < 0.0f) {
            f(f.d(((Number) ((x5a0) ytwVar2).getValue()).floatValue(), fB, fA) + fFloatValue);
            return true;
        }
        float f = fA - fB;
        int i2 = (int) (fFloatValue3 / f);
        int i3 = i2 + 1;
        if (B() + i3 > i) {
            f(((Number) this.B.getValue()).floatValue());
            c(i);
            return false;
        }
        c(B() + i3);
        float f2 = fFloatValue3 - (i2 * f);
        f(((Number) maeVar.getValue()).floatValue() < 0.0f ? fA - f2 : fB + f2);
        return true;
    }

    public final void c(int i) {
        ((x5a0) this.b).setValue(Integer.valueOf(i));
    }

    public final void d(boolean z) {
        ((x5a0) this.a).setValue(Boolean.valueOf(z));
    }

    public final void f(float f) {
        xmt xmtVarE;
        ((x5a0) this.y).setValue(Float.valueOf(f));
        if (((Boolean) ((x5a0) this.i).getValue()).booleanValue() && (xmtVarE = E()) != null) {
            f -= f % (1.0f / xmtVarE.n);
        }
        ((x5a0) this.z).setValue(Float.valueOf(f));
    }

    @Override // defpackage.qmt
    public final float g() {
        return ((Number) ((x5a0) this.z).getValue()).floatValue();
    }

    @Override // defpackage.twd0
    public final Float getValue() {
        return Float.valueOf(g());
    }

    @Override // defpackage.qmt
    public final boolean w() {
        return ((Boolean) ((x5a0) this.d).getValue()).booleanValue();
    }

    @Override // defpackage.qmt
    public final int y() {
        return ((Number) ((x5a0) this.c).getValue()).intValue();
    }

    @Override // defpackage.qmt
    public final float z() {
        return ((Number) ((x5a0) this.f).getValue()).floatValue();
    }
}
