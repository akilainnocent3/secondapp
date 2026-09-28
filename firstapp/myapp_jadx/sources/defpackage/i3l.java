package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.GlobalWithdrawViewModel$getAvailableChannels$1", f = "GlobalWithdrawViewModel.kt", l = {160}, m = "invokeSuspend", v = 2)
public final class i3l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ h3l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3l(h3l h3lVar, v1b<? super i3l> v1bVar) {
        super(2, v1bVar);
        this.b = h3lVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i3l(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i3l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        h3l h3lVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            v800 v800Var = h3lVar.d;
            f600 f600Var = f600.WITHDRAW;
            this.a = 1;
            obj = v800Var.b(f600Var, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            h3lVar.x1(g3l.a.a);
        } else {
            h3lVar.x1(g3l.e.a);
            h3lVar.x1(g3l.a.a);
        }
        return Unit.a;
    }
}
