package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class iyr {
    public jvd0 a;
    public aj0<Float, ij0> b;

    @c0d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1", f = "LazyLayoutScrollDeltaBetweenPasses.kt", l = {79}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return iyr.this.new a(v1bVar);
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
                aj0<Float, ij0> aj0Var = iyr.this.b;
                Float f = new Float(0.0f);
                fkd0 fkd0VarD = yi0.d(0.0f, 400.0f, new Float(0.5f), 1);
                this.a = 1;
                if (sje0.f(aj0Var, f, fkd0VarD, true, null, this, 8) == y5bVar) {
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

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public iyr() {
        g0h0 g0h0Var = gjs.b;
        Object objValueOf = Float.valueOf(0.0f);
        this.b = new aj0<>(g0h0Var, objValueOf, (mj0) g0h0Var.a.invoke((T) objValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final void a(float f, mmd mmdVar, v5b v5bVar) {
        if (f <= mmdVar.C1(1.0f)) {
            return;
        }
        c5a0.e.getClass();
        c5a0 c5a0VarA = c5a0.a.a();
        Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
        c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
        try {
            float fFloatValue = ((Number) ((x5a0) this.b.b).getValue()).floatValue();
            jvd0 jvd0Var = this.a;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            aj0<Float, ij0> aj0Var = this.b;
            if (aj0Var.f) {
                this.b = cj0.b(aj0Var, fFloatValue - f, 0.0f, 30);
            } else {
                this.b = new aj0<>(gjs.b, Float.valueOf(-f), null, 60);
            }
            this.a = ej5.c(v5bVar, null, null, new a(null), 3);
            Unit unit = Unit.a;
        } finally {
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
        }
    }
}
