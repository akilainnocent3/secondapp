package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.gms.common.annotation.LjLk.llGRV;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.platform.features.captcha.model.CaptchaError;
import com.sportybet.android.account.international.data.model.INTResetPwdCheckResponse;
import com.sportybet.android.account.international.resetpwd.ResetPwdConfirmFragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class xe50 implements Function1<lk50<? extends BaseResponse<INTResetPwdCheckResponse>>, Unit> {
    public final /* synthetic */ r5b a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ fxo c;
    public final /* synthetic */ ResetPwdConfirmFragment d;

    public xe50(r5b r5bVar, ibs ibsVar, fxo fxoVar, ResetPwdConfirmFragment resetPwdConfirmFragment) {
        this.a = r5bVar;
        this.b = ibsVar;
        this.c = fxoVar;
        this.d = resetPwdConfirmFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(lk50<? extends BaseResponse<INTResetPwdCheckResponse>> lk50Var) {
        lk50<? extends BaseResponse<INTResetPwdCheckResponse>> lk50Var2 = lk50Var;
        lk50Var2.getClass();
        boolean z = lk50Var2 instanceof lk50.b;
        this.c.f.setLoading(z);
        ResetPwdConfirmFragment resetPwdConfirmFragment = this.d;
        resetPwdConfirmFragment.n0();
        if (lk50Var2 instanceof lk50.c) {
            BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var2).a;
            ohp<Object>[] ohpVarArr = ResetPwdConfirmFragment.z;
            fxo fxoVarQ0 = resetPwdConfirmFragment.q0();
            int i = baseResponse.bizCode;
            if (i == 10000) {
                yfx yfxVarA = NavHostFragment.a.a(resetPwdConfirmFragment);
                String strA = auf.a(fxoVarQ0.d);
                String token = ((INTResetPwdCheckResponse) baseResponse.data).getToken();
                strA.getClass();
                token.getClass();
                yfxVarA.getClass();
                Bundle bundleA = whs.a("email", strA, "verify_token", token);
                bundleA.putString(llGRV.qrywmH, "reset_pwd");
                bundleA.putString("token", "");
                bundleA.putString("cpf", "");
                yfxVarA.f(R.id.to_int_verify_fragment, bundleA);
                Unit unit = Unit.a;
            } else if (i == 12003) {
                fxoVarQ0.d.setError(sn5.d(resetPwdConfirmFragment, R.string.register_login_int__error_create_account_12003, new Object[0]));
                Unit unit2 = Unit.a;
            } else if (i != 19000) {
                String str = baseResponse.message;
                if (str != null) {
                    zyf0.c(0, str);
                    Unit unit3 = Unit.a;
                }
            } else {
                fxoVarQ0.d.setError(sn5.d(resetPwdConfirmFragment, R.string.my_account__please_enter_a_vaild_email_address, new Object[0]));
                Unit unit4 = Unit.a;
            }
        } else if (lk50Var2 instanceof lk50.a) {
            Throwable th = ((lk50.a) lk50Var2).a;
            if (th instanceof CaptchaError) {
                Context contextRequireContext = resetPwdConfirmFragment.requireContext();
                contextRequireContext.getClass();
                zyf0.c(0, ((CaptchaError) th).getErrorString(contextRequireContext));
            } else {
                zyf0.c(0, sn5.d(resetPwdConfirmFragment, R.string.common_feedback__something_went_wrong_tip, new Object[0]));
            }
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_INT);
            aVar.b(th);
        } else {
            if (!z) {
                uhc.a();
                return null;
            }
            resetPwdConfirmFragment.o0();
        }
        if (!z) {
            this.a.l(this.b);
        }
        return Unit.a;
    }
}
