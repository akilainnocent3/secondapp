package com.sportybet.android.bvn;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.r;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.bvn.BVNVerifyData;
import com.sporty.android.core.model.pocket.withdraw.bvn.VerifyBVNResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.MainActivity;
import defpackage.ap0;
import defpackage.b7m;
import defpackage.bb40;
import defpackage.bwf0;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.dq7;
import defpackage.gr0;
import defpackage.hb5;
import defpackage.jq40;
import defpackage.jzh0;
import defpackage.kzh0;
import defpackage.nsm;
import defpackage.o7d;
import defpackage.pwx;
import defpackage.qzh0;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.sh8;
import defpackage.su5;
import defpackage.szh0;
import defpackage.tt40;
import defpackage.ut40;
import defpackage.v8i0;
import defpackage.vd;
import defpackage.wae;
import defpackage.zyf0;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class VerifyBvnWithdrawActivity extends b7m implements pwx, bb40 {
    public static final a D = new a();
    public ProgressDialog A;
    public String B = "";
    public int C = 0;
    public nsm w;
    public d0n y;
    public szh0 z;

    public class a extends vd<tt40, ut40> {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            tt40 tt40Var = (tt40) obj;
            Intent intent = new Intent(context, (Class<?>) VerifyBvnWithdrawActivity.class);
            intent.putExtra("bvn_withdraw_tradeid", tt40Var.a);
            intent.putExtra("bvn_withdraw_type", tt40Var.b.a);
            return intent;
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            if (i == 101) {
                return intent == null ? new ut40.b(null, null, null, null, null) : new ut40.b(intent.getStringExtra("tradeId"), intent.getStringExtra("data_counterPart"), intent.getStringExtra("data_counterAuthority"), intent.getStringExtra("data_counterIconUrl"), intent.getStringExtra("data_bankAccName"));
            }
            return ut40.a.a;
        }
    }

    @Override // defpackage.e5
    public final int A1() {
        return R.string.page_withdraw__in_order_to_protect_your_account_you_must_enter_your_bvn_tip;
    }

    @Override // defpackage.e5
    public final int C1() {
        return R.string.common_functions__withdraw;
    }

    @Override // defpackage.e5
    public final int D1() {
        return R.string.page_withdraw__verify_bvn_to_withdraw;
    }

    @Override // defpackage.e5
    public final boolean E1() {
        return false;
    }

    @Override // defpackage.e5
    public final void F1() {
        M1(0);
    }

    @Override // defpackage.e5
    public final void G1() {
        this.a.setBackground(gr0.a(this, R.drawable.bvn_withdraw_text_success_bg));
        this.d.setBackground(gr0.a(this, R.drawable.bvn_withdraw_text_success_bg));
    }

    @Override // defpackage.e5
    public final void H1() {
        if (this.C == 0) {
            M1(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
        } else {
            M1(-1);
        }
    }

    @Override // defpackage.e5
    public final void I1() {
    }

    @Override // defpackage.e5
    public final void J1() {
        M1(0);
    }

    @Override // defpackage.e5
    public final void K1() {
        if (!this.w.isConnected()) {
            zyf0.a(R.string.common_feedback__please_check_your_internet_connection_and_try_again);
            return;
        }
        String date = this.a.getDate();
        String strL = "";
        if (!TextUtils.isEmpty(date)) {
            try {
                Date date2 = this.e.parse(date);
                if (date2 != null) {
                    Locale locale = Locale.US;
                    locale.getClass();
                    strL = bwf0.l(date2, "yyyy-MM-dd", locale, 0, 0);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (TextUtils.isEmpty(strL) || TextUtils.isEmpty(this.d.getInputData().toString()) || TextUtils.isEmpty(this.B)) {
            return;
        }
        O1();
        szh0 szh0Var = this.z;
        String string = this.d.getInputData().toString();
        String str = this.B;
        su5<BaseResponse<VerifyBVNResponse>> su5Var = szh0Var.c;
        if (su5Var != null) {
            su5Var.cancel();
        }
        su5<BaseResponse<VerifyBVNResponse>> su5VarN = ap0.g().N(new BVNVerifyData(strL, string, str));
        szh0Var.c = su5VarN;
        su5VarN.G(new qzh0(szh0Var));
    }

    public final void L1() {
        String cMSString = getCMSString(R.string.common_feedback__sorry_something_went_wrong, new Object[0]);
        if (isFinishing()) {
            return;
        }
        b.a aVar = new b.a(this);
        AlertController.b bVar = aVar.a;
        bVar.f = cMSString;
        bVar.k = false;
        aVar.setPositiveButton(R.string.common_functions__ok, null).f();
    }

    public final void M1(int i) {
        setResult(i);
        finish();
    }

    public final void N1() {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("tab", 4);
        startActivity(intent);
        sh8.c().e(o7d.a(wae.ME_GIFTS));
    }

    public final void O1() {
        if (this.A == null) {
            ProgressDialog progressDialog = new ProgressDialog(this, R.style.BrandProgressDialogTheme);
            this.A = progressDialog;
            progressDialog.setTitle((CharSequence) null);
            this.A.setMessage(getCMSString(R.string.common_functions__loading_with_dot, new Object[0]));
            this.A.setIndeterminate(true);
            this.A.setCancelable(false);
            this.A.setOnCancelListener(null);
            this.A.show();
        }
        this.b.setEnabled(false);
        this.A.show();
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        if (this.C == 0) {
            M1(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
            return true;
        }
        M1(-1);
        return true;
    }

    @Override // defpackage.e5, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.B = getIntent().getStringExtra("bvn_withdraw_tradeid");
        this.C = getIntent().getIntExtra("bvn_withdraw_type", 0);
        super.onCreate(bundle);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(szh0.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        szh0 szh0Var = (szh0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.z = szh0Var;
        szh0Var.a.f(this, new jzh0(this));
        this.z.b.f(this, new kzh0(this));
        if (this.w.isConnected()) {
            return;
        }
        zyf0.a(R.string.common_feedback__please_check_your_internet_connection_and_try_again);
    }
}
