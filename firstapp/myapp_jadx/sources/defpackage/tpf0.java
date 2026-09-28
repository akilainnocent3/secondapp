package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tpf0 extends d.c implements psr {
    public psw D;
    public boolean E;
    public goh<Float> F;
    public boolean G;
    public wd0<Float, ij0> H;
    public wd0<Float, ij0> I;
    public float J;
    public float K;

    @c0d(c = "androidx.compose.material3.ThumbNode$measure$1", f = "Switch.kt", l = {272}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = f;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return tpf0.this.new a(this.c, v1bVar);
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
                tpf0 tpf0Var = tpf0.this;
                wd0<Float, ij0> wd0Var = tpf0Var.I;
                if (wd0Var != null) {
                    Float f = new Float(this.c);
                    xi0 xi0Var = tpf0Var.G ? androidx.compose.material3.b.f : tpf0Var.F;
                    this.a = 1;
                    obj = wd0.a(wd0Var, f, xi0Var, null, null, this, 12);
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

    @c0d(c = "androidx.compose.material3.ThumbNode$measure$2", f = "Switch.kt", l = {278}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = f;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return tpf0.this.new b(this.c, v1bVar);
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
                tpf0 tpf0Var = tpf0.this;
                wd0<Float, ij0> wd0Var = tpf0Var.H;
                if (wd0Var != null) {
                    Float f = new Float(this.c);
                    xi0 xi0Var = tpf0Var.G ? androidx.compose.material3.b.f : tpf0Var.F;
                    this.a = 1;
                    obj = wd0.a(wd0Var, f, xi0Var, null, null, this, 12);
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

    @c0d(c = "androidx.compose.material3.ThumbNode$onAttach$1", f = "Switch.kt", l = {227}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public static final class a<T> implements myh {
            public final /* synthetic */ bq40 a;
            public final /* synthetic */ tpf0 b;

            public a(bq40 bq40Var, tpf0 tpf0Var) {
                this.a = bq40Var;
                this.b = tpf0Var;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                xxo xxoVar = (xxo) obj;
                boolean z = xxoVar instanceof mp20.b;
                bq40 bq40Var = this.a;
                if (z) {
                    bq40Var.a++;
                } else if ((xxoVar instanceof mp20.c) || (xxoVar instanceof mp20.a)) {
                    bq40Var.a--;
                }
                boolean z2 = bq40Var.a > 0;
                tpf0 tpf0Var = this.b;
                if (tpf0Var.G != z2) {
                    tpf0Var.G = z2;
                    pkd.f(tpf0Var).P();
                }
                return Unit.a;
            }
        }

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return tpf0.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            bq40 bq40Var = new bq40();
            tpf0 tpf0Var = tpf0.this;
            b390 b390VarB = tpf0Var.D.b();
            a aVar = new a(bq40Var, tpf0Var);
            this.a = 1;
            b390VarB.collect(aVar, this);
            return y5bVar;
        }
    }

    public tpf0() {
        throw null;
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        float f;
        boolean z = (vhvVar.x(kxa.i(j)) == 0 || vhvVar.b0(kxa.h(j)) == 0) ? false : true;
        if (this.G) {
            f = soe0.n;
        } else {
            f = (z || this.E) ? androidx.compose.material3.b.a : androidx.compose.material3.b.b;
        }
        float fC1 = tVar.C1(f);
        wd0<Float, ij0> wd0Var = this.I;
        int iFloatValue = (int) (wd0Var != null ? wd0Var.d().floatValue() : fC1);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            ykn.a("width and height must be >= 0");
        }
        final y yVarD0 = vhvVar.d0(oxa.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        final float fC2 = tVar.C1((androidx.compose.material3.b.d - tVar.v1(fC1)) / 2.0f);
        float fC3 = tVar.C1((androidx.compose.material3.b.c - androidx.compose.material3.b.a) - androidx.compose.material3.b.e);
        boolean z2 = this.G;
        if (z2 && this.E) {
            fC2 = fC3 - tVar.C1(soe0.u);
        } else if (z2 && !this.E) {
            fC2 = tVar.C1(soe0.u);
        } else if (this.E) {
            fC2 = fC3;
        }
        wd0<Float, ij0> wd0Var2 = this.I;
        if (!Intrinsics.e(wd0Var2 != null ? (Float) ((x5a0) wd0Var2.e).getValue() : null, fC1)) {
            ej5.c(d2(), null, null, new a(fC1, null), 3);
        }
        wd0<Float, ij0> wd0Var3 = this.H;
        if (!Intrinsics.e(wd0Var3 != null ? (Float) ((x5a0) wd0Var3.e).getValue() : null, fC2)) {
            ej5.c(d2(), null, null, new b(fC2, null), 3);
        }
        if (Float.isNaN(this.K) && Float.isNaN(this.J)) {
            this.K = fC1;
            this.J = fC2;
        }
        return t.z1(tVar, iFloatValue, iFloatValue, new Function1() { // from class: spf0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                wd0<Float, ij0> wd0Var4 = this.H;
                y.a.A(aVar, yVarD0, (int) (wd0Var4 != null ? wd0Var4.d().floatValue() : fC2), 0);
                return Unit.a;
            }
        });
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        ej5.c(d2(), null, null, new c(null), 3);
    }
}
