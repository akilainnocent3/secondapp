package defpackage;

import com.sporty.android.platform.features.account.addemailprompt.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.addemailprompt.AddEmailPromptViewModel$handleBindEmail$2", f = "AddEmailPromptViewModel.kt", l = {124}, m = "invokeSuspend", v = 2)
public final class bh extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(e eVar, v1b<? super bh> v1bVar) {
        super(2, v1bVar);
        this.b = eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bh(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bh) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            xq00 xq00Var = this.b.d;
            mr00 mr00Var = mr00.NewDeviceLogin;
            Long l = new Long(System.currentTimeMillis());
            this.a = 1;
            if (xq00Var.a.putLong("awaiting_email_verification", l, this) == y5bVar) {
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
