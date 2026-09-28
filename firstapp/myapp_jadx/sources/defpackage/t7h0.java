package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel$onClickTxCategory$1", f = "TxListViewModel.kt", l = {340}, m = "invokeSuspend", v = 2)
public final class t7h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ o7h0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7h0(v1b v1bVar, o7h0 o7h0Var) {
        super(2, v1bVar);
        this.b = o7h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t7h0(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t7h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            o7h0 o7h0Var = this.b;
            b390 b390Var = o7h0Var.E;
            g5h0.b bVar = new g5h0.b(((w0h0) o7h0Var.A.getValue()).a);
            this.a = 1;
            if (b390Var.emit(bVar, this) == y5bVar) {
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
