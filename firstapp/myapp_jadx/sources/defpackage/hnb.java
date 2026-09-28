package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$enqueueCashOut$1", f = "CrashInitiatedFragment.kt", l = {3531}, m = "invokeSuspend", v = 1)
public final class hnb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ enb c;
    public final /* synthetic */ Function1<v1b<? super Unit>, Object> d;

    @c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$enqueueCashOut$1$1", f = "CrashInitiatedFragment.kt", l = {3532}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<v1b<? super Unit>, Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super v1b<? super Unit>, ? extends Object> function1, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
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
                this.a = 1;
                if (this.b.invoke(this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hnb(enb enbVar, Function1<? super v1b<? super Unit>, ? extends Object> function1, v1b<? super hnb> v1bVar) {
        super(2, v1bVar);
        this.c = enbVar;
        this.d = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hnb hnbVar = new hnb(this.c, this.d, v1bVar);
        hnbVar.b = obj;
        return hnbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hnb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        enb enbVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            jvd0 jvd0Var = enbVar.s0;
            if (jvd0Var != null) {
                this.b = v5bVar;
                this.a = 1;
                if (jvd0Var.join(this) == y5bVar) {
                    return y5bVar;
                }
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        enbVar.s0 = ej5.c(v5bVar, null, null, new a(this.d, null), 3);
        return Unit.a;
    }
}
