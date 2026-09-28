package defpackage;

import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.registration.usecase.RegisterAccountUseCase$register$result$2", f = "RegisterAccountUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bt40 extends tje0 implements Function2<lk50<? extends OTPCompleteResult>, v1b<? super Boolean>, Object> {
    public /* synthetic */ Object a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bt40 bt40Var = new bt40(2, v1bVar);
        bt40Var.a = obj;
        return bt40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends OTPCompleteResult> lk50Var, v1b<? super Boolean> v1bVar) {
        return ((bt40) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(!(lk50Var instanceof lk50.b));
    }
}
