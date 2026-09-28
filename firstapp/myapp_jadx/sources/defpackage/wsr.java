package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wsr implements tcf, lza {
    public final qc6 a = new qc6();
    public qcf b;

    public static final class a extends qlr implements Function1<tcf, Unit> {
        public final /* synthetic */ qcf b;
        public final /* synthetic */ Function1<tcf, Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(qcf qcfVar, Function1<? super tcf, Unit> function1) {
            super(1);
            this.b = qcfVar;
            this.c = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(tcf tcfVar) throws Throwable {
            qcf qcfVar;
            tcf tcfVar2 = tcfVar;
            wsr wsrVar = wsr.this;
            qc6 qc6Var = wsrVar.a;
            qcf qcfVar2 = wsrVar.b;
            wsrVar.b = this.b;
            try {
                mmd mmdVarB = tcfVar2.F1().b();
                asr asrVarC = tcfVar2.F1().c();
                lc6 lc6VarA = tcfVar2.F1().a();
                long jD = tcfVar2.F1().d();
                v6l v6lVar = tcfVar2.F1().b;
                Function1<tcf, Unit> function1 = this.c;
                mmd mmdVarB2 = qc6Var.b.b();
                asr asrVarC2 = qc6Var.b.c();
                lc6 lc6VarA2 = qc6Var.b.a();
                long jD2 = qc6Var.b.d();
                qc6.b bVar = qc6Var.b;
                try {
                    v6l v6lVar2 = bVar.b;
                    bVar.f(mmdVarB);
                    bVar.g(asrVarC);
                    bVar.e(lc6VarA);
                    bVar.h(jD);
                    bVar.b = v6lVar;
                    lc6VarA.p();
                    try {
                        function1.invoke(wsrVar);
                        lc6VarA.f();
                        qc6.b bVar2 = qc6Var.b;
                        bVar2.f(mmdVarB2);
                        bVar2.g(asrVarC2);
                        bVar2.e(lc6VarA2);
                        bVar2.h(jD2);
                        bVar2.b = v6lVar2;
                        wsrVar.b = qcfVar2;
                        return Unit.a;
                    } catch (Throwable th) {
                        qcfVar = qcfVar2;
                        try {
                            lc6VarA.f();
                            qc6.b bVar3 = qc6Var.b;
                            bVar3.f(mmdVarB2);
                            bVar3.g(asrVarC2);
                            bVar3.e(lc6VarA2);
                            bVar3.h(jD2);
                            bVar3.b = v6lVar2;
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            wsrVar.b = qcfVar;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    qcfVar = qcfVar2;
                }
            } catch (Throwable th4) {
                th = th4;
                qcfVar = qcfVar2;
            }
        }
    }

    @Override // defpackage.tcf
    public final void B0(ya5 ya5Var, long j, long j2, long j3, float f, wcf wcfVar, l58 l58Var, int i) {
        this.a.B0(ya5Var, j, j2, j3, f, wcfVar, l58Var, i);
    }

    @Override // defpackage.tcf
    public final void B1(long j, long j2, long j3, long j4, wcf wcfVar, float f) {
        this.a.B1(j, j2, j3, j4, wcfVar, f);
    }

    @Override // defpackage.mmd
    public final float C1(float f) {
        return this.a.getDensity() * f;
    }

    @Override // defpackage.mmd
    public final float D0(long j) {
        return this.a.D0(j);
    }

    @Override // defpackage.tcf
    public final qc6.b F1() {
        return this.a.b;
    }

    @Override // defpackage.tcf
    public final void G(long j, float f, long j2, float f2, wcf wcfVar) {
        this.a.G(j, f, j2, f2, wcfVar);
    }

    @Override // defpackage.tcf
    public final void H(bxz bxzVar, long j, float f, wcf wcfVar) {
        this.a.H(bxzVar, j, f, wcfVar);
    }

    @Override // defpackage.tcf
    public final void H0(ya5 ya5Var, float f, float f2, boolean z, long j, long j2, wcf wcfVar) {
        this.a.H0(ya5Var, f, f2, z, j, j2, wcfVar);
    }

    @Override // defpackage.mmd
    public final int I1(long j) {
        return this.a.I1(j);
    }

    @Override // defpackage.tcf
    public final void L(long j, v6l v6lVar, Function1 function1) {
        v6lVar.f(this, getLayoutDirection(), j, new a(this.b, function1));
    }

    @Override // defpackage.tcf
    public final void L0(dx80 dx80Var, float f, long j, wcf wcfVar) {
        this.a.L0(dx80Var, f, j, wcfVar);
    }

    @Override // defpackage.tcf
    public final void M1(c8n c8nVar, long j, float f, wcf wcfVar, l58 l58Var, int i) {
        this.a.M1(c8nVar, j, f, wcfVar, l58Var, i);
    }

    @Override // defpackage.mmd
    public final long N(float f) {
        return this.a.N(f);
    }

    @Override // defpackage.tcf
    public final void N1(bxz bxzVar, ya5 ya5Var, float f, wcf wcfVar, l58 l58Var, int i) {
        this.a.N1(bxzVar, ya5Var, f, wcfVar, l58Var, i);
    }

    @Override // defpackage.mmd
    public final long O(long j) {
        return this.a.O(j);
    }

    @Override // defpackage.tcf
    public final void O1(long j, long j2, long j3, float f, wcf wcfVar, l58 l58Var, int i) {
        this.a.O1(j, j2, j3, f, wcfVar, l58Var, i);
    }

    @Override // defpackage.tcf
    public final long R1() {
        return this.a.R1();
    }

    @Override // defpackage.tcf
    public final void S(long j, long j2, long j3, float f, int i, k90 k90Var) {
        this.a.S(j, j2, j3, f, i, k90Var);
    }

    @Override // defpackage.mmd
    public final long U1(long j) {
        return this.a.U1(j);
    }

    @Override // defpackage.mmd
    public final float X(long j) {
        return this.a.X(j);
    }

    @Override // defpackage.tcf
    public final void Z(long j, long j2, long j3, wcf wcfVar) {
        this.a.Z(j, j2, j3, wcfVar);
    }

    @Override // defpackage.tcf
    public final void a1(long j, float f, float f2, boolean z, long j2, long j3, float f3, wcf wcfVar) {
        this.a.a1(j, f, f2, z, j2, j3, f3, wcfVar);
    }

    @Override // defpackage.tcf
    public final void a2(ya5 ya5Var, long j, long j2, float f, wcf wcfVar, l58 l58Var, int i) {
        this.a.a2(ya5Var, j, j2, f, wcfVar, l58Var, i);
    }

    @Override // defpackage.lza
    public final void b2() {
        qc6 qc6Var = this.a;
        qc6.b bVar = qc6Var.b;
        lc6 lc6VarA = qc6Var.b.a();
        qcf qcfVar = this.b;
        if (qcfVar == null) {
            throw w20.a("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        d.c cVarC = qcfVar.i().f;
        if (cVarC != null && (cVarC.d & 4) != 0) {
            while (true) {
                if (cVarC != null) {
                    int i = cVarC.c;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            cVarC = cVarC.f;
                        }
                    }
                }
                cVarC = null;
                break;
            }
        } else {
            cVarC = null;
            break;
        }
        if (cVarC == null) {
            ywx ywxVarD = pkd.d(qcfVar, 4);
            if (ywxVarD.E1() == qcfVar.i()) {
                ywxVarD = ywxVarD.H;
                ywxVarD.getClass();
            }
            ywxVarD.i2(lc6VarA, bVar.b);
            return;
        }
        duw duwVar = null;
        while (cVarC != null) {
            if (cVarC instanceof qcf) {
                qcf qcfVar2 = (qcf) cVarC;
                v6l v6lVar = bVar.b;
                ywx ywxVarD2 = pkd.d(qcfVar2, 4);
                long jD = kc6.d(ywxVarD2.c);
                tsr tsrVar = ywxVarD2.E;
                tsrVar.getClass();
                xsr.a(tsrVar).getSharedDrawScope().e(lc6VarA, jD, ywxVarD2, qcfVar2, v6lVar);
            } else if ((cVarC.c & 4) != 0 && (cVarC instanceof tkd)) {
                int i2 = 0;
                for (d.c cVar = ((tkd) cVarC).E; cVar != null; cVar = cVar.f) {
                    if ((cVar.c & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            cVarC = cVar;
                        } else {
                            if (duwVar == null) {
                                duwVar = new duw(new d.c[16]);
                            }
                            if (cVarC != null) {
                                duwVar.b(cVarC);
                                cVarC = null;
                            }
                            duwVar.b(cVar);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            cVarC = pkd.c(duwVar);
        }
    }

    @Override // defpackage.tcf
    public final void c1(c8n c8nVar, long j, long j2, long j3, long j4, float f, wcf wcfVar, l58 l58Var, int i, int i2) {
        this.a.c1(c8nVar, j, j2, j3, j4, f, wcfVar, l58Var, i, i2);
    }

    @Override // defpackage.tcf
    public final long d() {
        return this.a.d();
    }

    public final void e(lc6 lc6Var, long j, ywx ywxVar, qcf qcfVar, v6l v6lVar) {
        qcf qcfVar2 = this.b;
        this.b = qcfVar;
        asr asrVar = ywxVar.E.O;
        qc6.b bVar = this.a.b;
        mmd mmdVarB = bVar.b();
        asr asrVarC = bVar.c();
        lc6 lc6VarA = bVar.a();
        long jD = bVar.d();
        v6l v6lVar2 = bVar.b;
        bVar.f(ywxVar);
        bVar.g(asrVar);
        bVar.e(lc6Var);
        bVar.h(j);
        bVar.b = v6lVar;
        lc6Var.p();
        try {
            qcfVar.A(this);
            lc6Var.f();
            bVar.f(mmdVarB);
            bVar.g(asrVarC);
            bVar.e(lc6VarA);
            bVar.h(jD);
            bVar.b = v6lVar2;
            this.b = qcfVar2;
        } catch (Throwable th) {
            lc6Var.f();
            bVar.f(mmdVarB);
            bVar.g(asrVarC);
            bVar.e(lc6VarA);
            bVar.h(jD);
            bVar.b = v6lVar2;
            throw th;
        }
    }

    @Override // defpackage.mmd
    public final long g0(float f) {
        return this.a.g0(f);
    }

    @Override // defpackage.mmd
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.tcf
    public final asr getLayoutDirection() {
        return this.a.a.b;
    }

    @Override // defpackage.tcf
    public final void p1(ya5 ya5Var, long j, long j2, float f, int i, float f2) {
        this.a.p1(ya5Var, j, j2, f, i, f2);
    }

    @Override // defpackage.mmd
    public final float u1(int i) {
        return this.a.u1(i);
    }

    @Override // defpackage.mmd
    public final float v1(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.mmd
    public final int y0(float f) {
        return this.a.y0(f);
    }

    @Override // defpackage.mmd
    public final float y1() {
        return this.a.y1();
    }
}
