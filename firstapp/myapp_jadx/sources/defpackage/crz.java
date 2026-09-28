package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class crz {
    public b90 a;
    public boolean b;
    public l58 c;
    public float d = 1.0f;
    public asr e = asr.a;

    public static final class a extends qlr implements Function1<tcf, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(tcf tcfVar) {
            crz.this.j(tcfVar);
            return Unit.a;
        }
    }

    public crz() {
        new a();
    }

    public boolean a(float f) {
        return false;
    }

    public boolean b(l58 l58Var) {
        return false;
    }

    public final void g(tcf tcfVar, long j, float f, l58 l58Var) {
        if (this.d != f) {
            if (!a(f)) {
                b90 b90VarA = this.a;
                if (f == 1.0f) {
                    if (b90VarA != null) {
                        b90VarA.b(f);
                    }
                    this.b = false;
                } else {
                    if (b90VarA == null) {
                        b90VarA = c90.a();
                        this.a = b90VarA;
                    }
                    b90VarA.b(f);
                    this.b = true;
                }
            }
            this.d = f;
        }
        if (!Intrinsics.g(this.c, l58Var)) {
            if (!b(l58Var)) {
                b90 b90VarA2 = this.a;
                if (l58Var == null) {
                    if (b90VarA2 != null) {
                        b90VarA2.k(null);
                    }
                    this.b = false;
                } else {
                    if (b90VarA2 == null) {
                        b90VarA2 = c90.a();
                        this.a = b90VarA2;
                    }
                    b90VarA2.k(l58Var);
                    this.b = true;
                }
            }
            this.c = l58Var;
        }
        asr layoutDirection = tcfVar.getLayoutDirection();
        if (this.e != layoutDirection) {
            d(layoutDirection);
            this.e = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) - Float.intBitsToFloat(i2);
        tcfVar.F1().a.e(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.b) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        lk40 lk40VarB = pk40.b(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        lc6 lc6VarA = tcfVar.F1().a();
                        b90 b90VarA3 = this.a;
                        if (b90VarA3 == null) {
                            b90VarA3 = c90.a();
                            this.a = b90VarA3;
                        }
                        try {
                            lc6VarA.s(lk40VarB, b90VarA3);
                            j(tcfVar);
                            lc6VarA.f();
                        } catch (Throwable th) {
                            lc6VarA.f();
                            throw th;
                        }
                    } else {
                        j(tcfVar);
                    }
                }
            } catch (Throwable th2) {
                tcfVar.F1().a.e(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        tcfVar.F1().a.e(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long i();

    public abstract void j(tcf tcfVar);

    public void d(asr asrVar) {
    }
}
