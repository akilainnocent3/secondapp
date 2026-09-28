package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface tcf extends mmd {

    public static final class a extends qlr implements Function1<tcf, Unit> {
        public final /* synthetic */ Function1<tcf, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super tcf, Unit> function1) {
            super(1);
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(tcf tcfVar) {
            qc6.b bVarF1;
            tcf tcfVar2 = tcfVar;
            mmd mmdVarB = tcfVar2.F1().b();
            asr asrVarC = tcfVar2.F1().c();
            lc6 lc6VarA = tcfVar2.F1().a();
            long jD = tcfVar2.F1().d();
            v6l v6lVar = tcfVar2.F1().b;
            Function1<tcf, Unit> function1 = this.b;
            tcf tcfVar3 = tcf.this;
            mmd mmdVarB2 = tcfVar3.F1().b();
            asr asrVarC2 = tcfVar3.F1().c();
            lc6 lc6VarA2 = tcfVar3.F1().a();
            long jD2 = tcfVar3.F1().d();
            v6l v6lVar2 = tcfVar3.F1().b;
            qc6.b bVarF2 = tcfVar3.F1();
            bVarF2.f(mmdVarB);
            bVarF2.g(asrVarC);
            bVarF2.e(lc6VarA);
            bVarF2.h(jD);
            bVarF2.b = v6lVar;
            lc6VarA.p();
            try {
                function1.invoke(tcfVar3);
                return Unit.a;
            } finally {
                lc6VarA.f();
                bVarF1 = tcfVar3.F1();
                bVarF1.f(mmdVarB2);
                bVarF1.g(asrVarC2);
                bVarF1.e(lc6VarA2);
                bVarF1.h(jD2);
                bVarF1.b = v6lVar2;
            }
        }
    }

    static void F(tcf tcfVar, dx80 dx80Var, float f, long j, yae0 yae0Var, int i) {
        if ((i & 4) != 0) {
            j = tcfVar.R1();
        }
        long j2 = j;
        wcf wcfVar = yae0Var;
        if ((i & 16) != 0) {
            wcfVar = rlh.a;
        }
        tcfVar.L0(dx80Var, f, j2, wcfVar);
    }

    static void I(tcf tcfVar, long j, float f, float f2, boolean z, long j2, long j3, float f3, wcf wcfVar, int i) {
        long j4 = (i & 16) != 0 ? 0L : j2;
        tcfVar.a1(j, f, f2, z, j4, (i & 32) != 0 ? w1(tcfVar.d(), j4) : j3, (i & 64) != 0 ? 1.0f : f3, (i & 128) != 0 ? rlh.a : wcfVar);
    }

    static void J1(tcf tcfVar, c8n c8nVar, long j, long j2, long j3, long j4, float f, wcf wcfVar, l58 l58Var, int i, int i2, int i3) {
        long jB;
        long j5 = (i3 & 2) != 0 ? 0L : j;
        if ((i3 & 4) != 0) {
            jB = (((long) c8nVar.b()) & 4294967295L) | (((long) c8nVar.c()) << 32);
        } else {
            jB = j2;
        }
        tcfVar.c1(c8nVar, j5, jB, (i3 & 8) != 0 ? 0L : j3, (i3 & 16) != 0 ? jB : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? rlh.a : wcfVar, (i3 & 128) != 0 ? null : l58Var, (i3 & 256) != 0 ? 3 : i, (i3 & 512) != 0 ? 1 : i2);
    }

    static void M0(tcf tcfVar, ya5 ya5Var, long j, long j2, float f, float f2, int i) {
        int i2 = (i & 16) != 0 ? 0 : 1;
        if ((i & 64) != 0) {
            f2 = 1.0f;
        }
        tcfVar.p1(ya5Var, j, j2, f, i2, f2);
    }

    static void P0(tcf tcfVar, ya5 ya5Var, float f, float f2, boolean z, long j, long j2, yae0 yae0Var, int i) {
        long j3 = (i & 16) != 0 ? 0L : j;
        tcfVar.H0(ya5Var, f, f2, z, j3, (i & 32) != 0 ? w1(tcfVar.d(), j3) : j2, (i & 128) != 0 ? rlh.a : yae0Var);
    }

    static void Q1(tcf tcfVar, bxz bxzVar, long j, float f, wcf wcfVar, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            wcfVar = rlh.a;
        }
        tcfVar.H(bxzVar, j, f2, wcfVar);
    }

    static void V1(tcf tcfVar, ya5 ya5Var, long j, long j2, float f, wcf wcfVar, l58 l58Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        tcfVar.a2(ya5Var, j3, (i2 & 4) != 0 ? w1(tcfVar.d(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? rlh.a : wcfVar, (i2 & 32) != 0 ? null : l58Var, (i2 & 64) != 0 ? 3 : i);
    }

    static void Z1(tcf tcfVar, long j, long j2, long j3, float f, int i, k90 k90Var, int i2) {
        tcfVar.S(j, j2, j3, (i2 & 8) != 0 ? 0.0f : f, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : k90Var);
    }

    static void b1(tcf tcfVar, c8n c8nVar, long j, float f, l58 l58Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        rlh rlhVar = rlh.a;
        if ((i2 & 16) != 0) {
            l58Var = null;
        }
        l58 l58Var2 = l58Var;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        tcfVar.M1(c8nVar, j2, f2, rlhVar, l58Var2, i);
    }

    static void d1(tcf tcfVar, long j, long j2, long j3, long j4, wcf wcfVar, float f, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            j3 = w1(tcfVar.d(), j2);
        }
        if ((i & 8) != 0) {
            j4 = 0;
        }
        if ((i & 16) != 0) {
            wcfVar = rlh.a;
        }
        if ((i & 32) != 0) {
            f = 1.0f;
        }
        tcfVar.B1(j, j2, j3, j4, wcfVar, f);
    }

    static void g1(tcf tcfVar, long j, long j2, long j3) {
        tcfVar.Z(j, j2, j3, rlh.a);
    }

    static void j0(tcf tcfVar, bxz bxzVar, ya5 ya5Var, float f, yae0 yae0Var, l58 l58Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        wcf wcfVar = yae0Var;
        if ((i2 & 8) != 0) {
            wcfVar = rlh.a;
        }
        wcf wcfVar2 = wcfVar;
        if ((i2 & 16) != 0) {
            l58Var = null;
        }
        l58 l58Var2 = l58Var;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        tcfVar.N1(bxzVar, ya5Var, f2, wcfVar2, l58Var2, i);
    }

    static void m0(tcf tcfVar, long j, long j2, long j3, float f, l58 l58Var, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j2;
        tcfVar.O1(j, j4, (i2 & 4) != 0 ? w1(tcfVar.d(), j4) : j3, (i2 & 8) != 0 ? 1.0f : f, rlh.a, (i2 & 32) != 0 ? null : l58Var, (i2 & 64) != 0 ? 3 : i);
    }

    static void n0(tcf tcfVar, long j, float f, long j2, float f2, wcf wcfVar, int i) {
        if ((i & 2) != 0) {
            f = yw90.c(tcfVar.d()) / 2.0f;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            j2 = tcfVar.R1();
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            f2 = 1.0f;
        }
        tcfVar.G(j, f3, j3, f2, (i & 16) != 0 ? rlh.a : wcfVar);
    }

    static void q1(tcf tcfVar, ya5 ya5Var, long j, long j2, long j3, float f, wcf wcfVar, l58 l58Var, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j;
        tcfVar.B0(ya5Var, j4, (i2 & 4) != 0 ? w1(tcfVar.d(), j4) : j2, j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? rlh.a : wcfVar, (i2 & 64) != 0 ? null : l58Var, (i2 & 128) != 0 ? 3 : i);
    }

    static long w1(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    void B0(ya5 ya5Var, long j, long j2, long j3, float f, wcf wcfVar, l58 l58Var, int i);

    void B1(long j, long j2, long j3, long j4, wcf wcfVar, float f);

    qc6.b F1();

    void G(long j, float f, long j2, float f2, wcf wcfVar);

    void H(bxz bxzVar, long j, float f, wcf wcfVar);

    void H0(ya5 ya5Var, float f, float f2, boolean z, long j, long j2, wcf wcfVar);

    default void L(long j, v6l v6lVar, Function1 function1) {
        v6lVar.f(this, getLayoutDirection(), j, new a(function1));
    }

    void L0(dx80 dx80Var, float f, long j, wcf wcfVar);

    void M1(c8n c8nVar, long j, float f, wcf wcfVar, l58 l58Var, int i);

    void N1(bxz bxzVar, ya5 ya5Var, float f, wcf wcfVar, l58 l58Var, int i);

    void O1(long j, long j2, long j3, float f, wcf wcfVar, l58 l58Var, int i);

    default long R1() {
        return wo9.a(F1().d());
    }

    void S(long j, long j2, long j3, float f, int i, k90 k90Var);

    void Z(long j, long j2, long j3, wcf wcfVar);

    void a1(long j, float f, float f2, boolean z, long j2, long j3, float f3, wcf wcfVar);

    void a2(ya5 ya5Var, long j, long j2, float f, wcf wcfVar, l58 l58Var, int i);

    default void c1(c8n c8nVar, long j, long j2, long j3, long j4, float f, wcf wcfVar, l58 l58Var, int i, int i2) {
        J1(this, c8nVar, j, j2, j3, j4, f, wcfVar, l58Var, i, 0, 512);
    }

    default long d() {
        return F1().d();
    }

    asr getLayoutDirection();

    void p1(ya5 ya5Var, long j, long j2, float f, int i, float f2);
}
