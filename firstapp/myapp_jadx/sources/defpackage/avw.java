package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class avw<State> extends j8i0 {
    public final wwd0 a;
    public final v340 b;
    public final b390 c;
    public final t340 d;

    @c0d(c = "com.sportybet.base.mvvm.MvvmBaseViewModel$emitSideEffectEvent$1", f = "MvvmBaseViewModel.kt", l = {53}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ avw<State> b;
        public final /* synthetic */ id90 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(avw<State> avwVar, id90 id90Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = avwVar;
            this.c = id90Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
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
                b390 b390Var = this.b.c;
                this.a = 1;
                if (b390Var.emit(this.c, this) == y5bVar) {
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

    public avw(State state) {
        wwd0 wwd0VarA = xwd0.a(state);
        this.a = wwd0VarA;
        this.b = e1i.e(wwd0VarA, o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), state);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.c = b390VarB;
        this.d = e1i.a(b390VarB);
    }

    public final void x1(id90 id90Var) {
        id90Var.getClass();
        ej5.c(o8i0.d(this), null, null, new a(this, id90Var, null), 3);
    }

    public final jvd0 y1(Function2 function2) {
        return ej5.c(o8i0.d(this), new bvw(this).plus(fse.a), null, function2, 2);
    }
}
