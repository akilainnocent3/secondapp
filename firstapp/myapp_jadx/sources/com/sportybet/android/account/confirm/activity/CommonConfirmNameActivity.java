package com.sportybet.android.account.confirm.activity;

import android.os.Bundle;
import android.text.TextUtils;
import com.sporty.android.core.model.patron.KycSource;
import com.sportybet.android.account.RegistrationKYC$Result;
import com.sportybet.android.gp.tz.R;
import defpackage.hc8;
import defpackage.ic8;
import defpackage.jc8;
import defpackage.psm;
import defpackage.pwx;
import defpackage.s8n;
import defpackage.tol;
import defpackage.xib0;
import defpackage.xxz;
import defpackage.zux;

/* JADX INFO: loaded from: classes5.dex */
public class CommonConfirmNameActivity extends tol implements zux, pwx {
    public static final /* synthetic */ int f = 0;
    public xxz b;
    public psm c;
    public KycSource d;
    public int e = 0;

    public final void A1(int i) {
        setResult(i);
        finish();
    }

    @Override // defpackage.pw40
    public final KycSource getRegistrationKYCSource() {
        KycSource kycSource = this.d;
        return kycSource != null ? kycSource : KycSource.ANNOYING;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = KycSource.fromValue(getIntent().getStringExtra("source"));
        this.b.m0().G(new hc8(this, this));
        String lastAccessToken = getAccountHelper().getLastAccessToken();
        if (TextUtils.isEmpty(lastAccessToken)) {
            finish();
        } else {
            showRegistrationKYCPageWithAccessToken(lastAccessToken);
        }
    }

    @Override // defpackage.pw40
    public final void onRegistrationKYCResult(RegistrationKYC$Result registrationKYC$Result) {
        String str;
        if (!registrationKYC$Result.b) {
            A1(5001);
            return;
        }
        boolean z = this.e == 510;
        if (this.d == KycSource.DEPOSIT) {
            str = z ? xib0.IMAGE_GIFT_EACH_YEAR_BIRTHDAY : "";
            ic8 ic8Var = new ic8(this);
            if (((s8n) getSupportFragmentManager().H("bvn_pending_request_dialog")) == null) {
                s8n s8nVar = new s8n();
                Bundle bundle = new Bundle();
                bundle.putInt("arg_title_res_id", R.string.page_payment__pending_request);
                bundle.putInt("arg_description_res_id", R.string.page_payment__you_deposit_request_has_been_submitted_tip);
                bundle.putString("arg_description", null);
                bundle.putInt("arg_positive_text_res_id", R.string.common_functions__home);
                bundle.putInt("arg_negative_text_res_id", R.string.common_functions__transactions);
                bundle.putString("arg_image", str);
                s8nVar.setArguments(bundle);
                s8nVar.A = ic8Var;
                s8nVar.show(getSupportFragmentManager(), "bvn_pending_request_dialog");
                return;
            }
            return;
        }
        if (this.c.x()) {
            A1(5002);
            return;
        }
        str = z ? xib0.IMAGE_GIFT_EACH_YEAR_BIRTHDAY : "";
        jc8 jc8Var = new jc8(this);
        if (((s8n) getSupportFragmentManager().H("account_confirmed_dialog")) == null) {
            s8n s8nVar2 = new s8n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("arg_title_res_id", R.string.page_payment__account_info_confirmed);
            bundle2.putInt("arg_description_res_id", R.string.page_payment__your_account_information_has_been_confirmed_tip);
            bundle2.putString("arg_description", null);
            bundle2.putInt("arg_positive_text_res_id", R.string.common_functions__home);
            bundle2.putInt("arg_negative_text_res_id", R.string.common_functions__transactions);
            bundle2.putString("arg_image", str);
            s8nVar2.setArguments(bundle2);
            s8nVar2.A = jc8Var;
            s8nVar2.show(getSupportFragmentManager(), "account_confirmed_dialog");
        }
    }
}
