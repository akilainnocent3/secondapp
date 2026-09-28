package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.DepositViewModelLegacy$saveLastSuccessfulDepositChannelId$1", f = "DepositViewModelLegacy.kt", l = {145}, m = "invokeSuspend", v = 2)
public final class q9e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ r9e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9e(r9e r9eVar, v1b<? super q9e> v1bVar) {
        super(2, v1bVar);
        this.b = r9eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q9e(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q9e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            r9e r9eVar = this.b;
            x0l x0lVar = r9eVar.e;
            int i2 = r9eVar.I;
            this.a = 1;
            x0lVar.getClass();
            if (x0lVar.a.putInt("last_successful_deposit_channel_id", new Integer(i2), this) == y5bVar) {
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
