package defpackage;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sportybet.android.bvn.VerifyBvnWithdrawActivity;
import com.sportybet.android.gp.tz.R;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class kzh0 implements lfy<BankTradeResponse> {
    public final /* synthetic */ VerifyBvnWithdrawActivity a;

    public kzh0(VerifyBvnWithdrawActivity verifyBvnWithdrawActivity) {
        this.a = verifyBvnWithdrawActivity;
    }

    @Override // defpackage.lfy
    public final void u1(BankTradeResponse bankTradeResponse) {
        s8n.a mzh0Var;
        BankTradeResponse bankTradeResponse2 = bankTradeResponse;
        VerifyBvnWithdrawActivity verifyBvnWithdrawActivity = this.a;
        ProgressDialog progressDialog = verifyBvnWithdrawActivity.A;
        if (progressDialog != null && progressDialog.isShowing()) {
            verifyBvnWithdrawActivity.z1();
            verifyBvnWithdrawActivity.A.dismiss();
        }
        if (verifyBvnWithdrawActivity.isFinishing()) {
            return;
        }
        if (bankTradeResponse2 == null) {
            verifyBvnWithdrawActivity.L1();
            return;
        }
        int i = bankTradeResponse2.status;
        String cMSString = bankTradeResponse2.displayMsg;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.g(" bankTrade status =%s", Integer.valueOf(i));
        if (i == 20) {
            Intent intent = new Intent();
            intent.putExtra("tradeId", verifyBvnWithdrawActivity.B);
            intent.putExtra("data_counterPart", bankTradeResponse2.counterPart);
            intent.putExtra("data_counterAuthority", bankTradeResponse2.counterAuthority);
            intent.putExtra("data_counterIconUrl", bankTradeResponse2.counterIconUrl);
            intent.putExtra("data_bankAccName", bankTradeResponse2.bankAccName);
            verifyBvnWithdrawActivity.setResult(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, intent);
            verifyBvnWithdrawActivity.finish();
            return;
        }
        int i2 = R.string.common_functions__home;
        if (i == 10) {
            if (TextUtils.isEmpty(cMSString)) {
                cMSString = verifyBvnWithdrawActivity.getCMSString(R.string.component_bvn__withdraw_pending_msg, new Object[0]);
            }
            ozh0 ozh0Var = new ozh0(verifyBvnWithdrawActivity);
            if (((s8n) verifyBvnWithdrawActivity.getSupportFragmentManager().H("bvn_withdraw_pending")) == null) {
                s8n s8nVar = new s8n();
                Bundle bundle = new Bundle();
                bundle.putInt("arg_title_res_id", R.string.page_payment__pending_request);
                bundle.putInt("arg_description_res_id", 0);
                bundle.putString("arg_description", cMSString);
                bundle.putInt("arg_positive_text_res_id", R.string.common_functions__home);
                bundle.putInt("arg_negative_text_res_id", R.string.common_functions__transactions);
                bundle.putString("arg_image", xib0.IMAGE_BVN_SUCCESS_BUT_ACCOUNT_NAME_INVALID);
                s8nVar.setArguments(bundle);
                s8nVar.A = ozh0Var;
                s8nVar.show(verifyBvnWithdrawActivity.getSupportFragmentManager(), "bvn_withdraw_pending");
                return;
            }
            return;
        }
        int i3 = R.string.common_functions__transactions;
        if (TextUtils.isEmpty(cMSString)) {
            cMSString = verifyBvnWithdrawActivity.getCMSString(R.string.page_payment__we_are_unable_to_accept_your_payment_at_this_time_tip, new Object[0]);
        }
        if (i == 10 || i == 72 || i == -1001) {
            mzh0Var = new mzh0(verifyBvnWithdrawActivity);
        } else {
            mzh0Var = new nzh0(verifyBvnWithdrawActivity, i);
            i3 = 0;
            i2 = 0;
        }
        if (((s8n) verifyBvnWithdrawActivity.getSupportFragmentManager().H("bvn_withdraw_failed")) == null) {
            s8n s8nVar2 = new s8n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("arg_title_res_id", R.string.page_withdraw__failed_to_withdraw);
            bundle2.putInt("arg_description_res_id", 0);
            bundle2.putString("arg_description", cMSString);
            bundle2.putInt("arg_positive_text_res_id", i2);
            bundle2.putInt("arg_negative_text_res_id", i3);
            bundle2.putString("arg_image", xib0.IMAGE_BVN_SUCCESS_BUT_ACCOUNT_NAME_INVALID);
            s8nVar2.setArguments(bundle2);
            s8nVar2.A = mzh0Var;
            s8nVar2.show(verifyBvnWithdrawActivity.getSupportFragmentManager(), "bvn_withdraw_failed");
        }
    }
}
