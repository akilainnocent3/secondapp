package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sporty.android.platform.features.account.addemailprompt.AddEmailVerifiedTracker$clearTracking$1", f = "AddEmailVerifiedTracker.kt", l = {55}, m = "invokeSuspend", v = 2)
public final class dh extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(fh fhVar, v1b<? super dh> v1bVar) {
        super(2, v1bVar);
        this.b = fhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dh(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dh) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            xq00 xq00Var = this.b.b;
            mr00 mr00Var = mr00.NewDeviceLogin;
            this.a = 1;
            if (xq00Var.a.b("awaiting_email_verification", this) == y5bVar) {
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
