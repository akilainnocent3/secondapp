package defpackage;

import android.os.Bundle;
import androidx.fragment.app.e;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.LoginResponse;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.account.international.INTAuthActivity;
import com.sportybet.android.account.international.verify.INTVerifyFragment;
import com.sportybet.android.auth.BaseAccountAuthenticatorActivity;
import com.sportybet.android.gp.tz.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xwm extends saj implements Function1<BaseResponse<LoginResponse>, Unit> {
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BaseResponse<LoginResponse> baseResponse) {
        BaseResponse<LoginResponse> baseResponse2 = baseResponse;
        baseResponse2.getClass();
        INTVerifyFragment iNTVerifyFragment = (INTVerifyFragment) this.receiver;
        ohp<Object>[] ohpVarArr = INTVerifyFragment.G;
        mxo mxoVarS0 = iNTVerifyFragment.s0();
        int i = baseResponse2.bizCode;
        if (i == 10000) {
            psm psmVar = iNTVerifyFragment.v;
            if (psmVar == null) {
                Intrinsics.n("countryManager");
                throw null;
            }
            if (psmVar.W()) {
                yfx yfxVarA = NavHostFragment.a.a(iNTVerifyFragment);
                String str = iNTVerifyFragment.r0().a;
                String str2 = iNTVerifyFragment.r0().e;
                str.getClass();
                str2.getClass();
                yfxVarA.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email", str);
                bundle.putString("cpf", str2);
                bundle.putString("phoneNumber", "");
                bundle.putString("phoneCountryCode", "");
                bundle.putBoolean("isResumptionFlow", false);
                yfxVarA.f(R.id.to_registration_validation_fragment, bundle);
            } else {
                e eVarRequireActivity = iNTVerifyFragment.requireActivity();
                INTAuthActivity iNTAuthActivity = eVarRequireActivity instanceof INTAuthActivity ? (INTAuthActivity) eVarRequireActivity : null;
                if (iNTAuthActivity != null) {
                    LoginResponse loginResponse = baseResponse2.data;
                    if (loginResponse == null) {
                        zyf0.b(R.string.common_feedback__something_went_wrong_please_try_again, 0);
                    } else {
                        uqm uqmVar = iNTVerifyFragment.i;
                        if (uqmVar == null) {
                            Intrinsics.n("accountHelper");
                            throw null;
                        }
                        uqmVar.setRegisterStatus(true);
                        uqmVar.saveToken(iNTAuthActivity, vqm.a.a(loginResponse, iNTVerifyFragment.r0().a, 0L));
                        f00 f00Var = vgb0.a;
                        vgb0.c(AnalyticsEvent.SIGN_UP, jpu.b(new Pair(AnalyticsParam.EVENT_PARAM_STEP, "register_success")), true);
                        vgb0.a("Reg_5");
                        v5 v5Var = iNTVerifyFragment.y;
                        if (v5Var == null) {
                            Intrinsics.n("accRegistrationHelper");
                            throw null;
                        }
                        e eVarRequireActivity2 = iNTVerifyFragment.requireActivity();
                        eVarRequireActivity2.getClass();
                        Boolean bool = Boolean.FALSE;
                        v5Var.a((BaseAccountAuthenticatorActivity) eVarRequireActivity2, "Reg_5", bool, bool);
                    }
                }
            }
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
            mxoVarS0.v.setErrorState(Integer.valueOf(R.string.register_login_int__error_register_12004));
            iNTVerifyFragment.z0();
        } else if (i == 19000 || i == 19002) {
            mxoVarS0.v.setErrorState(Integer.valueOf(R.string.register_login_int__error_register_19002));
        } else {
            mxoVarS0.v.setErrorState(baseResponse2.message);
        }
        return Unit.a;
    }
}
