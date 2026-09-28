package defpackage;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sporty.android.core.model.pocket.withdraw.bvn.VerifyBVNResponse;
import com.sportybet.android.bvn.VerifyBvnWithdrawActivity;
import com.sportybet.android.gp.tz.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class jzh0 implements lfy<VerifyBVNResponse> {
    public final /* synthetic */ VerifyBvnWithdrawActivity a;

    public jzh0(VerifyBvnWithdrawActivity verifyBvnWithdrawActivity) {
        this.a = verifyBvnWithdrawActivity;
    }

    @Override // defpackage.lfy
    public final void u1(VerifyBVNResponse verifyBVNResponse) {
        VerifyBVNResponse verifyBVNResponse2 = verifyBVNResponse;
        final VerifyBvnWithdrawActivity verifyBvnWithdrawActivity = this.a;
        ProgressDialog progressDialog = verifyBvnWithdrawActivity.A;
        if (progressDialog != null && progressDialog.isShowing()) {
            verifyBvnWithdrawActivity.z1();
            verifyBvnWithdrawActivity.A.dismiss();
        }
        if (verifyBvnWithdrawActivity.isFinishing()) {
            return;
        }
        if (verifyBVNResponse2 == null) {
            verifyBvnWithdrawActivity.L1();
            return;
        }
        final int i = verifyBVNResponse2.status;
        String cMSString = verifyBVNResponse2.gatewayResponse;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.g(" bvn status =%s", Integer.valueOf(i));
        if (i == 105) {
            if (TextUtils.isEmpty(cMSString)) {
                cMSString = verifyBvnWithdrawActivity.getCMSString(R.string.page_withdraw__too_many_failed_verification_attempts_to_ensure_tip, new Object[0]);
            }
            String cMSString2 = verifyBvnWithdrawActivity.getCMSString(R.string.common_functions__ok, new Object[0]);
            String cMSString3 = verifyBvnWithdrawActivity.getCMSString(R.string.common_functions__live_chat, new Object[0]);
            String cMSString4 = verifyBvnWithdrawActivity.getCMSString(R.string.page_payment__verification_failed, new Object[0]);
            wie.b bVar = new wie.b() { // from class: fzh0
                @Override // wie.b
                public final void b() {
                    VerifyBvnWithdrawActivity.a aVar2 = VerifyBvnWithdrawActivity.D;
                    verifyBvnWithdrawActivity.M1(i);
                }
            };
            wie.a aVar2 = new wie.a() { // from class: gzh0
                @Override // wie.a
                public final void d() {
                    VerifyBvnWithdrawActivity.a aVar3 = VerifyBvnWithdrawActivity.D;
                    VerifyBvnWithdrawActivity verifyBvnWithdrawActivity2 = verifyBvnWithdrawActivity;
                    verifyBvnWithdrawActivity2.y.b(verifyBvnWithdrawActivity2, snb0.BVN);
                    verifyBvnWithdrawActivity2.M1(i);
                }
            };
            wie wieVar = new wie();
            wieVar.a = cMSString;
            wieVar.c = cMSString3;
            wieVar.b = cMSString2;
            wieVar.f = true;
            wieVar.e = true;
            wieVar.w = aVar2;
            wieVar.v = bVar;
            wieVar.i = true;
            wieVar.d = cMSString4;
            wieVar.z = R.color.text_type1_secondary;
            wieVar.y = R.color.brand_secondary;
            wieVar.A = R.color.text_type1_primary;
            wieVar.B = 0;
            wieVar.C = 1;
            wieVar.D = true;
            wieVar.E = true;
            wieVar.F = false;
            wieVar.show(verifyBvnWithdrawActivity.getSupportFragmentManager(), "bvn_withdraw_verify_fail_reach_limit");
            return;
        }
        if (i == 101) {
            if (verifyBvnWithdrawActivity.C != 1) {
                Intent intent = new Intent();
                intent.putExtra("tradeId", verifyBvnWithdrawActivity.B);
                intent.putExtra("data_counterPart", verifyBVNResponse2.counterPart);
                intent.putExtra("data_counterAuthority", verifyBVNResponse2.counterAuthority);
                intent.putExtra("data_counterIconUrl", verifyBVNResponse2.counterIconUrl);
                intent.putExtra("data_bankAccName", verifyBVNResponse2.bankAccName);
                verifyBvnWithdrawActivity.setResult(i, intent);
                verifyBvnWithdrawActivity.finish();
                return;
            }
            if (TextUtils.isEmpty(verifyBvnWithdrawActivity.d.getInputData().toString()) || TextUtils.isEmpty(verifyBvnWithdrawActivity.B)) {
                verifyBvnWithdrawActivity.L1();
                return;
            }
            verifyBvnWithdrawActivity.O1();
            szh0 szh0Var = verifyBvnWithdrawActivity.z;
            String str = verifyBvnWithdrawActivity.B;
            String string = verifyBvnWithdrawActivity.d.getInputData().toString();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 13);
                jSONObject.put("tradeId", str);
                jSONObject.put("bvn", string);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String string2 = jSONObject.toString();
            su5<BaseResponse<BankTradeResponse>> su5Var = szh0Var.d;
            if (su5Var != null) {
                su5Var.cancel();
            }
            su5<BaseResponse<BankTradeResponse>> su5VarH = ap0.g().h(str, string2);
            szh0Var.d = su5VarH;
            su5VarH.G(new rzh0(szh0Var));
            return;
        }
        if (i == 111) {
            if (TextUtils.isEmpty(cMSString)) {
                cMSString = verifyBvnWithdrawActivity.getCMSString(R.string.page_withdraw__you_can_only_withdraw_to_accounts_connected_to_the_bvn_tip, new Object[0]);
            }
            lzh0 lzh0Var = new lzh0(verifyBvnWithdrawActivity, i);
            if (((s8n) verifyBvnWithdrawActivity.getSupportFragmentManager().H("bvn_withdraw_verify_invalid_account")) == null) {
                s8n s8nVar = new s8n();
                Bundle bundle = new Bundle();
                bundle.putInt("arg_title_res_id", R.string.page_withdraw__invalid_account_name);
                bundle.putInt("arg_description_res_id", 0);
                bundle.putString("arg_description", cMSString);
                bundle.putInt("arg_positive_text_res_id", 0);
                bundle.putInt("arg_negative_text_res_id", 0);
                bundle.putString("arg_image", xib0.IMAGE_BVN_SUCCESS_BUT_ACCOUNT_NAME_INVALID);
                s8nVar.setArguments(bundle);
                s8nVar.A = lzh0Var;
                s8nVar.show(verifyBvnWithdrawActivity.getSupportFragmentManager(), "bvn_withdraw_verify_invalid_account");
                return;
            }
            return;
        }
        if (i == 110) {
            if (TextUtils.isEmpty(cMSString)) {
                cMSString = verifyBvnWithdrawActivity.getCMSString(R.string.component_bvn__the_name_on_this_bvn_does_not_match_your_sporty_account_tip, new Object[0]);
            }
            String cMSString5 = verifyBvnWithdrawActivity.getCMSString(R.string.common_functions__u_retry, new Object[0]);
            String cMSString6 = verifyBvnWithdrawActivity.getCMSString(R.string.common_functions__cancel, new Object[0]);
            String cMSString7 = verifyBvnWithdrawActivity.getCMSString(R.string.page_withdraw__invalid_bvn, new Object[0]);
            wie.a aVar3 = new wie.a() { // from class: izh0
                @Override // wie.a
                public final void d() {
                    VerifyBvnWithdrawActivity.a aVar4 = VerifyBvnWithdrawActivity.D;
                    verifyBvnWithdrawActivity.M1(i);
                }
            };
            wie wieVar2 = new wie();
            wieVar2.a = cMSString;
            wieVar2.c = cMSString6;
            wieVar2.b = cMSString5;
            wieVar2.f = true;
            wieVar2.e = true;
            wieVar2.w = aVar3;
            wieVar2.v = null;
            wieVar2.i = true;
            wieVar2.d = cMSString7;
            wieVar2.z = R.color.brand_secondary;
            wieVar2.y = R.color.brand_secondary;
            wieVar2.A = R.color.text_type1_primary;
            wieVar2.B = 0;
            wieVar2.C = 1;
            wieVar2.D = true;
            wieVar2.E = true;
            wieVar2.F = false;
            wieVar2.show(verifyBvnWithdrawActivity.getSupportFragmentManager(), "bvn_withdraw_verify_override_fail");
            return;
        }
        if (TextUtils.isEmpty(cMSString)) {
            cMSString = verifyBvnWithdrawActivity.getCMSString(R.string.component_bvn__your_verification_has_failed_please_check_your_information_tip, new Object[0]);
        }
        String cMSString8 = verifyBvnWithdrawActivity.getCMSString(R.string.common_functions__u_retry, new Object[0]);
        String cMSString9 = verifyBvnWithdrawActivity.getCMSString(R.string.common_functions__cancel, new Object[0]);
        String cMSString10 = verifyBvnWithdrawActivity.getCMSString(R.string.page_payment__verification_failed, new Object[0]);
        wie.a aVar4 = new wie.a() { // from class: hzh0
            @Override // wie.a
            public final void d() {
                VerifyBvnWithdrawActivity.a aVar5 = VerifyBvnWithdrawActivity.D;
                verifyBvnWithdrawActivity.M1(i);
            }
        };
        wie wieVar3 = new wie();
        wieVar3.a = cMSString;
        wieVar3.c = cMSString9;
        wieVar3.b = cMSString8;
        wieVar3.f = true;
        wieVar3.e = true;
        wieVar3.w = aVar4;
        wieVar3.v = null;
        wieVar3.i = true;
        wieVar3.d = cMSString10;
        wieVar3.z = R.color.brand_secondary;
        wieVar3.y = R.color.brand_secondary;
        wieVar3.A = R.color.text_type1_primary;
        wieVar3.B = 0;
        wieVar3.C = 1;
        wieVar3.D = true;
        wieVar3.E = true;
        wieVar3.F = false;
        wieVar3.show(verifyBvnWithdrawActivity.getSupportFragmentManager(), "bvn_withdraw_verify_fail");
    }
}
