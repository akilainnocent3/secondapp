package defpackage;

import android.app.ProgressDialog;
import android.text.TextUtils;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.data.CallbackWrapper;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.selfexclusion.SelfExclusionConfirmFragment;
import java.net.ConnectException;

/* JADX INFO: loaded from: classes5.dex */
public final class w980 extends CallbackWrapper<BaseResponse<xdp>> {
    public final /* synthetic */ SelfExclusionConfirmFragment a;

    public w980(SelfExclusionConfirmFragment selfExclusionConfirmFragment) {
        this.a = selfExclusionConfirmFragment;
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseComplete() {
        ProgressDialog progressDialog = this.a.E;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseFailure(Throwable th) {
        boolean z = th instanceof ConnectException;
        SelfExclusionConfirmFragment selfExclusionConfirmFragment = this.a;
        if (z) {
            selfExclusionConfirmFragment.n0(null);
        } else {
            selfExclusionConfirmFragment.n0(sn5.d(selfExclusionConfirmFragment, R.string.common_feedback__something_went_wrong_tip, new Object[0]));
        }
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseSuccess(BaseResponse<xdp> baseResponse) {
        int i;
        int i2;
        BaseResponse<xdp> baseResponse2 = baseResponse;
        int i3 = baseResponse2.bizCode;
        SelfExclusionConfirmFragment selfExclusionConfirmFragment = this.a;
        if (i3 == 10000) {
            if (selfExclusionConfirmFragment.M.O()) {
                i = R.string.self_exclusion__self_exclusion_now__ZA;
                i2 = R.string.self_exclusion__your_self_exclusion_has_begun_you_have_been_automatically_logged_out_of_your_account__ZA;
            } else {
                i = R.string.self_exclusion__self_exclusion_now;
                i2 = R.string.self_exclusion__your_self_exclusion_has_begun_you_have_been_automatically_logged_out_of_your_account;
            }
            String strD = sn5.d(selfExclusionConfirmFragment, i2, new Object[0]);
            String strD2 = sn5.d(selfExclusionConfirmFragment, R.string.common_functions__ok, new Object[0]);
            lxg lxgVar = new lxg(selfExclusionConfirmFragment);
            String strD3 = sn5.d(selfExclusionConfirmFragment, i, new Object[0]);
            wie wieVar = new wie();
            wieVar.a = strD;
            wieVar.c = "Cancel";
            wieVar.b = strD2;
            wieVar.f = false;
            wieVar.e = true;
            wieVar.w = null;
            wieVar.v = lxgVar;
            wieVar.i = true;
            wieVar.d = strD3;
            wieVar.z = R.color.text_type1_secondary;
            wieVar.y = R.color.brand_secondary;
            wieVar.A = R.color.text_type1_primary;
            wieVar.B = 0;
            wieVar.C = 1;
            wieVar.D = false;
            wieVar.E = true;
            wieVar.F = false;
            wieVar.show(selfExclusionConfirmFragment.requireActivity().getSupportFragmentManager(), "confirm_dialog");
            return;
        }
        if (i3 == 11603) {
            String strD4 = sn5.d(selfExclusionConfirmFragment, R.string.self_exclusion__please_try_again, new Object[0]);
            String strD5 = sn5.d(selfExclusionConfirmFragment, R.string.common_functions__retry, new Object[0]);
            String strD6 = sn5.d(selfExclusionConfirmFragment, R.string.self_exclusion__incorrect_password, new Object[0]);
            wie wieVar2 = new wie();
            wieVar2.a = strD4;
            wieVar2.c = "Cancel";
            wieVar2.b = strD5;
            wieVar2.f = false;
            wieVar2.e = true;
            wieVar2.w = null;
            wieVar2.v = null;
            wieVar2.i = true;
            wieVar2.d = strD6;
            wieVar2.z = R.color.text_type1_secondary;
            wieVar2.y = R.color.brand_secondary;
            wieVar2.A = R.color.text_type1_primary;
            wieVar2.B = 0;
            wieVar2.C = 1;
            wieVar2.D = false;
            wieVar2.E = true;
            wieVar2.F = false;
            wieVar2.show(selfExclusionConfirmFragment.requireActivity().getSupportFragmentManager(), "wrong_dialog");
            return;
        }
        String strD7 = baseResponse2.message;
        if (i3 != 11900) {
            selfExclusionConfirmFragment.n0(strD7);
            return;
        }
        if (TextUtils.isEmpty(strD7)) {
            strD7 = sn5.d(selfExclusionConfirmFragment, selfExclusionConfirmFragment.M.O() ? R.string.self_exclusion__there_is_an_existed_self_exclusion__ZA : R.string.self_exclusion__there_is_an_existed_self_exclusion, new Object[0]);
        }
        String strD8 = sn5.d(selfExclusionConfirmFragment, R.string.common_functions__close, new Object[0]);
        mxg mxgVar = new mxg(selfExclusionConfirmFragment);
        String strD9 = sn5.d(selfExclusionConfirmFragment, R.string.self_exclusion__set_up_failed, new Object[0]);
        wie wieVar3 = new wie();
        wieVar3.a = strD7;
        wieVar3.c = "Cancel";
        wieVar3.b = strD8;
        wieVar3.f = false;
        wieVar3.e = true;
        wieVar3.w = null;
        wieVar3.v = mxgVar;
        wieVar3.i = true;
        wieVar3.d = strD9;
        wieVar3.z = R.color.text_type1_secondary;
        wieVar3.y = R.color.brand_secondary;
        wieVar3.A = R.color.text_type1_primary;
        wieVar3.B = 0;
        wieVar3.C = 1;
        wieVar3.D = false;
        wieVar3.E = true;
        wieVar3.F = false;
        wieVar3.show(selfExclusionConfirmFragment.requireActivity().getSupportFragmentManager(), "setup_failed_dialog");
    }
}
