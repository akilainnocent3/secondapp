package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.SpeiByStpWithdrawViewModel$loadBalanceInfo$1", f = "SpeiByStpWithdrawViewModel.kt", l = {251}, m = "invokeSuspend", v = 2)
public final class bxa0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zwa0 b;

    public static final /* synthetic */ class a extends saj implements Function1<Long, String> {
        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Long l) {
            return ((xsm) this.receiver).g(l.longValue());
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ zwa0 a;

        public b(zwa0 zwa0Var) {
            this.a = zwa0Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            this.a.H.setValue((wu1) obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxa0(zwa0 zwa0Var, v1b<? super bxa0> v1bVar) {
        super(2, v1bVar);
        this.b = zwa0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bxa0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bxa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zwa0 zwa0Var = this.b;
            w9e w9eVar = zwa0Var.a;
            dae daeVar = new dae(w9eVar.d.h(pu0.b.a), new a(1, zwa0Var.b, xsm.class, "formatWithoutSymbol", "formatWithoutSymbol(J)Ljava/lang/String;", 0));
            b bVar = new b(zwa0Var);
            this.a = 1;
            if (daeVar.collect(bVar, this) == y5bVar) {
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
