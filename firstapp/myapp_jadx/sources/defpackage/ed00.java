package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.PendingRequestViewModel$refreshNotificationStatuses$1", f = "PendingRequestViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ed00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hd00 b;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.PendingRequestViewModel$refreshNotificationStatuses$1$1", f = "PendingRequestViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ hd00 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hd00 hd00Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = hd00Var;
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
                if (this.b.x1(this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.PendingRequestViewModel$refreshNotificationStatuses$1$2", f = "PendingRequestViewModel.kt", l = {69}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ hd00 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hd00 hd00Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = hd00Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
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
                this.a = 1;
                hd00 hd00Var = this.b;
                if (new e7k(bm50.d(hd00Var.a.a.e(pu0.c.a))).collect(new dd00(hd00Var), this) == y5bVar) {
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
    public ed00(hd00 hd00Var, v1b<? super ed00> v1bVar) {
        super(2, v1bVar);
        this.b = hd00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ed00 ed00Var = new ed00(this.b, v1bVar);
        ed00Var.a = obj;
        return ed00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ed00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        hd00 hd00Var = this.b;
        ej5.c(v5bVar, null, null, new a(hd00Var, null), 3);
        ej5.c(v5bVar, null, null, new b(hd00Var, null), 3);
        return Unit.a;
    }
}
