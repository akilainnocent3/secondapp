package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pfn extends tkd implements yma {
    public boolean F;
    public boolean G;
    public psw H;
    public float I;
    public float J;
    public boolean K;
    public jvd0 L;
    public lff0 M;
    public wd0<j58, lj0> N;
    public qx80 O;
    public final wd0<g7f, ij0> P;
    public final jr5 Q;

    @c0d(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$1", f = "TextField.kt", l = {1599}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return pfn.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                pfn pfnVar = pfn.this;
                wd0<j58, lj0> wd0Var = pfnVar.N;
                if (wd0Var != null) {
                    lff0 lff0VarD = pfnVar.M;
                    if (lff0VarD == null) {
                        lff0VarD = uff0.d((d68) zma.a(pfnVar, g68.a), (bmf0) zma.a(pfnVar, cmf0.a));
                    }
                    j58 j58Var = new j58(lff0VarD.c(pfnVar.F, pfnVar.G, pfnVar.K));
                    xi0 xi0VarA = pfnVar.F ? a6w.a((y5w) zma.a(pfnVar, scv.a), z5w.d) : yi0.c();
                    this.a = 1;
                    obj = wd0.a(wd0Var, j58Var, xi0VarA, null, null, this, 12);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2", f = "TextField.kt", l = {1611}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return pfn.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                pfn pfnVar = pfn.this;
                wd0<g7f, ij0> wd0Var = pfnVar.P;
                g7f g7fVar = new g7f((pfnVar.K && pfnVar.F) ? pfnVar.I : pfnVar.J);
                xi0 xi0VarA = pfnVar.F ? a6w.a((y5w) zma.a(pfnVar, scv.a), z5w.b) : yi0.c();
                this.a = 1;
                if (wd0.a(wd0Var, g7fVar, xi0VarA, null, null, this, 12) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.material3.IndicatorLineNode$onAttach$1", f = "TextField.kt", l = {1569}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return pfn.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                pfn.this.t2(this);
                return y5bVar;
            }
            if (i == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public pfn(boolean z, boolean z2, psw pswVar, lff0 lff0Var, qx80 qx80Var, float f, float f2) {
        this.F = z;
        this.G = z2;
        this.H = pswVar;
        this.I = f;
        this.J = f2;
        this.M = lff0Var;
        this.O = qx80Var;
        this.P = new wd0<>(new g7f((this.K && z) ? f : f2), gjs.d, null, 12);
        kr5 kr5Var = new kr5(new mr5(), new nfn(this, 0));
        p2(kr5Var);
        this.Q = kr5Var;
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        this.L = ej5.c(d2(), null, null, new c(null), 3);
        if (this.N == null) {
            lff0 lff0VarD = this.M;
            if (lff0VarD == null) {
                lff0VarD = uff0.d((d68) zma.a(this, g68.a), (bmf0) zma.a(this, cmf0.a));
            }
            long jC = lff0VarD.c(this.F, this.G, this.K);
            this.N = new wd0<>(new j58(jC), e78.a.invoke(j58.f(jC)), null, 12);
        }
    }

    public final void s2() {
        ej5.c(d2(), null, null, new a(null), 3);
        ej5.c(d2(), null, null, new b(null), 3);
    }

    public final Object t2(tje0 tje0Var) throws Throwable {
        this.K = false;
        this.H.b().collect(new qfn(new ArrayList(), this), tje0Var);
        return y5b.a;
    }
}
