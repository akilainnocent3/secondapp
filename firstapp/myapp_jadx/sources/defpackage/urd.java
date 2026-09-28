package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseViewModel$observeFirstDepositBanner$1$1", f = "DepositBaseViewModel.kt", l = {408}, m = "invokeSuspend", v = 2)
public final class urd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wrd b;
    public final /* synthetic */ qxd0<String> c;

    public static final class a<T> implements myh {
        public final /* synthetic */ qxd0<String> a;

        public a(qxd0<String> qxd0Var) {
            this.a = qxd0Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            qxd0<String> qxd0Var = this.a;
            qxd0Var.a.invoke().getClass();
            qxd0Var.a((String) obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urd(wrd wrdVar, qxd0<String> qxd0Var, v1b<? super urd> v1bVar) {
        super(2, v1bVar);
        this.b = wrdVar;
        this.c = qxd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new urd(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((urd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            uwd0<String> uwd0VarX0 = this.b.N.x0();
            a aVar = new a(this.c);
            this.a = 1;
            if (uwd0VarX0.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        fkd.a();
        return null;
    }
}
