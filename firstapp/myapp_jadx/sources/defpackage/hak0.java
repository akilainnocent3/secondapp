package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.zaaccount.otp.ZAOTPViewModel$startResendCountdown$1", f = "ZAOTPViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hak0 extends tje0 implements Function2<Long, v1b<? super Unit>, Object> {
    public /* synthetic */ long a;
    public final /* synthetic */ gak0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak0(gak0 gak0Var, v1b<? super hak0> v1bVar) {
        super(2, v1bVar);
        this.b = gak0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hak0 hak0Var = new hak0(this.b, v1bVar);
        hak0Var.a = ((Number) obj).longValue();
        return hak0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, v1b<? super Unit> v1bVar) {
        return ((hak0) create(Long.valueOf(l.longValue()), v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        long j = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ohp<Object>[] ohpVarArr = gak0.C;
        gak0 gak0Var = this.b;
        gak0Var.B1(fak0.a(gak0Var.y1(), null, null, null, new ResourceUiText(R.string.register_login_int__countdown_sec, a.c(String.valueOf(j / 1000))), 383));
        return Unit.a;
    }
}
