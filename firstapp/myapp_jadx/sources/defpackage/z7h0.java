package defpackage;

import com.sporty.android.core.model.patron.NameConfirmationStatus;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel$special$$inlined$flatMapLatest$1", f = "TxListViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class z7h0 extends tje0 implements gaj<myh<? super lk50<? extends NameConfirmationStatus>>, Unit, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o7h0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7h0(v1b v1bVar, o7h0 o7h0Var) {
        super(3, v1bVar);
        this.d = o7h0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends NameConfirmationStatus>> myhVar, Unit unit, v1b<? super Unit> v1bVar) {
        z7h0 z7h0Var = new z7h0(v1bVar, this.d);
        z7h0Var.b = myhVar;
        z7h0Var.c = unit;
        return z7h0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh<lk50<NameConfirmationStatus>> lyhVarJ0 = this.d.f.j0(pu0.c.a);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarJ0, this) == y5bVar) {
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
