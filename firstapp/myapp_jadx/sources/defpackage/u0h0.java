package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.calendar.viewmodel.TxCalendarViewModel$closeNewFeatureAlert$1", f = "TxCalendarViewModel.kt", l = {162}, m = "invokeSuspend", v = 2)
public final class u0h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ v0h0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0h0(v0h0 v0h0Var, v1b<? super u0h0> v1bVar) {
        super(2, v1bVar);
        this.b = v0h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u0h0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u0h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a1h0 a1h0Var = this.b.e;
            this.a = 1;
            if (a1h0Var.a.closeForever("need_show_tx_date_range_new_feature_alert", this) == y5bVar) {
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
