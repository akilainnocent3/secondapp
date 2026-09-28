package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.AccountActivationConfigAgent$refresh$1$onSuccessData$1", f = "AccountActivationConfigAgent.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(boolean z, v1b<? super w7> v1bVar) {
        super(2, v1bVar);
        this.a = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new w7(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((w7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        vn20.h(System.currentTimeMillis(), "pref_last_account_activation_config_fetch_timestamp", true);
        vn20.g("sportybet", "pref_last_account_activation_config", this.a, true);
        return Unit.a;
    }
}
