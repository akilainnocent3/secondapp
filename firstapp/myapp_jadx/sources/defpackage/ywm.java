package defpackage;

import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.account.international.data.model.INTResetPwdCheckResponse;
import com.sportybet.android.account.international.verify.INTVerifyFragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ywm extends saj implements Function1<BaseResponse<INTResetPwdCheckResponse>, Unit> {
    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BaseResponse<INTResetPwdCheckResponse> baseResponse) {
        BaseResponse<INTResetPwdCheckResponse> baseResponse2 = baseResponse;
        baseResponse2.getClass();
        INTVerifyFragment iNTVerifyFragment = (INTVerifyFragment) this.receiver;
        ohp<Object>[] ohpVarArr = INTVerifyFragment.G;
        mxo mxoVarS0 = iNTVerifyFragment.s0();
        int i = baseResponse2.bizCode;
        if (i == 10000) {
            yfx yfxVarA = NavHostFragment.a.a(iNTVerifyFragment);
            String email = iNTVerifyFragment.u0().x1().getEmail();
            String token = baseResponse2.data.getToken();
            boolean zT0 = iNTVerifyFragment.t0();
            email.getClass();
            token.getClass();
            yfxVarA.getClass();
            Bundle bundleA = whs.a("email", email, "token", token);
            bundleA.putBoolean("from_deeplink", zT0);
            bundleA.putBoolean("from_settings_password", false);
            yfxVarA.f(R.id.to_reset_pwd_fragment, bundleA);
        } else if (i == 11612) {
            mxoVarS0.v.setErrorState(Integer.valueOf(R.string.register_login_int__error_create_account_11612_11614_12001));
        } else if (i == 11700) {
            mxoVarS0.v.setErrorState(Integer.valueOf(R.string.register_login_int__error_register_19002));
        } else if (i == 11707) {
            mxoVarS0.v.setErrorState(Integer.valueOf(R.string.register_login_int__error_register_11707));
        } else if (i == 11810) {
            mxoVarS0.v.setErrorState(Integer.valueOf(R.string.register_login_int__error_register_11810));
            iNTVerifyFragment.u0().c.a(new ts40.j0(0), k00.d);
        } else if (i == 11812) {
            iNTVerifyFragment.z0();
            mxoVarS0.v.setErrorState(Integer.valueOf(R.string.register_login_int__error_register_11812));
        } else if (i == 12004) {
            iNTVerifyFragment.z0();
            mxoVarS0.v.setErrorState(Integer.valueOf(R.string.register_login_int__error_register_12004));
        } else if (i == 19000 || i == 19002) {
            mxoVarS0.v.setErrorState(Integer.valueOf(R.string.register_login_int__error_register_19002));
        } else {
            mxoVarS0.v.setErrorState(baseResponse2.message);
        }
        return Unit.a;
    }
}
