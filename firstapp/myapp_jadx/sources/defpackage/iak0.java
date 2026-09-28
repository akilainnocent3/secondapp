package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.zaaccount.otp.ZAOTPViewModel$startResendCountdown$2", f = "ZAOTPViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class iak0 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public final /* synthetic */ gak0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iak0(gak0 gak0Var, v1b<? super iak0> v1bVar) {
        super(1, v1bVar);
        this.a = gak0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new iak0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((iak0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ohp<Object>[] ohpVarArr = gak0.C;
        gak0 gak0Var = this.a;
        gak0Var.B1(fak0.a(gak0Var.y1(), null, null, null, null, 383));
        return Unit.a;
    }
}
