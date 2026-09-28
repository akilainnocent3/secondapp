package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.zaaccount.otp.ZAOTPViewModel$verifyOtp$1", f = "ZAOTPViewModel.kt", l = {231}, m = "invokeSuspend", v = 2)
public final class jak0 extends tje0 implements Function2<lk50<? extends OTPCompleteResult>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gak0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jak0(gak0 gak0Var, v1b<? super jak0> v1bVar) {
        super(2, v1bVar);
        this.c = gak0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jak0 jak0Var = new jak0(this.c, v1bVar);
        jak0Var.b = obj;
        return jak0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends OTPCompleteResult> lk50Var, v1b<? super Unit> v1bVar) {
        return ((jak0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.b;
        Object obj2 = y5b.a;
        int i = this.a;
        gak0 gak0Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            if (lk50Var instanceof lk50.b) {
                ohp<Object>[] ohpVarArr = gak0.C;
                gak0Var.B1(fak0.a(gak0Var.y1(), null, uxs.LOADING, sx40.c.a, null, 415));
            } else if (lk50Var instanceof lk50.a) {
                ohp<Object>[] ohpVarArr2 = gak0.C;
                fak0 fak0VarY1 = gak0Var.y1();
                Context context = gak0Var.a;
                rdd0 rdd0Var = gak0Var.e;
                uxs uxsVar = uxs.ENABLE;
                lk50.a aVar = (lk50.a) lk50Var;
                UiText uiText = aVar.b;
                gak0Var.B1(fak0.a(fak0VarY1, null, uxsVar, new sx40.a(uiText), null, 415));
                ts40.j0 j0Var = new ts40.j0(0);
                k00 k00Var = k00.d;
                rdd0Var.a(j0Var, k00Var);
                rdd0Var.a(new o7z(uiText.g(context)), k00Var);
                rdd0Var.a(new m7z(1, gak0Var.b.getCountryCode().getCode(), uiText.g(context), "sms", m7z.a.a(bm50.g(aVar)), bm50.g(aVar)), k00.c);
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                yck yckVar = gak0Var.f;
                this.b = lk50Var;
                this.a = 1;
                Object objD = ej5.d(yckVar.c, new xck(yckVar, null), this);
                if (objD != obj2) {
                    objD = Unit.a;
                }
                if (objD == obj2) {
                    return obj2;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        gak0Var.e.a(r7z.a, k00.d);
        ku90<u9k0> ku90Var = gak0Var.i;
        ku90Var.a.a(new u9k0.c(gak0Var.y1().b, (OTPCompleteResult) ((lk50.c) lk50Var).a));
        return Unit.a;
    }
}
