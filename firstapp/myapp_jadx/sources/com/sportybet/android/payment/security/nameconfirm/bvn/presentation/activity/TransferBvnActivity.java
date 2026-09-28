package com.sportybet.android.payment.security.nameconfirm.bvn.presentation.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.r;
import com.sporty.android.core.model.pocket.withdraw.bvn.BvnData;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.payment.security.nameconfirm.bvn.presentation.activity.TransferBvnActivity;
import com.sportybet.feature.kyc.confirmAccountInfo.f;
import defpackage.bb40;
import defpackage.bwf0;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.dzh0;
import defpackage.f00;
import defpackage.grg0;
import defpackage.hb5;
import defpackage.hrg0;
import defpackage.irg0;
import defpackage.jq40;
import defpackage.nsm;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.v8i0;
import defpackage.vd;
import defpackage.vgb0;
import defpackage.w1k;
import defpackage.wga;
import defpackage.wie;
import defpackage.x5m;
import defpackage.zyf0;
import java.text.ParseException;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TransferBvnActivity extends x5m implements bb40 {
    public static final a A = new a();
    public nsm w;
    public ProgressDialog y;
    public dzh0 z;

    /* JADX INFO: loaded from: classes6.dex */
    public class a extends vd<Void, Void> {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            return new Intent(context, (Class<?>) TransferBvnActivity.class);
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            return null;
        }
    }

    @Override // defpackage.e5
    public final int A1() {
        return R.string.component_bvn__please_enter_your_bvn_and_date_of_birthday_to_verify_your_bvn_tip;
    }

    @Override // defpackage.e5
    public final int C1() {
        return R.string.common_functions__withdraw;
    }

    @Override // defpackage.e5
    public final int D1() {
        return R.string.component_bvn__verify_bvn;
    }

    @Override // defpackage.e5
    public final void F1() {
        setResult(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
        finish();
    }

    @Override // defpackage.e5
    public final void G1() {
        this.c.setVisibility(8);
        this.f.setVisibility(8);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(f.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        ((f) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI))).A.f(this, new grg0(this));
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(dzh0.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        dzh0 dzh0Var = (dzh0) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        this.z = dzh0Var;
        dzh0Var.a.f(this, new hrg0(this));
        this.z.b.f(this, new irg0(this));
        if (this.w.isConnected()) {
            N1();
            this.z.x1();
        } else {
            zyf0.c(1, getCMSString(R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
        }
        this.a.E(new Date(), this);
    }

    @Override // defpackage.e5
    public final void H1() {
        getOnBackPressedDispatcher().d();
    }

    @Override // defpackage.e5
    public final void J1() {
    }

    @Override // defpackage.e5
    public final void K1() {
        if (!this.w.isConnected()) {
            zyf0.c(1, getCMSString(R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
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
        if (TextUtils.isEmpty(strL) || TextUtils.isEmpty(this.d.getInputData().toString())) {
            return;
        }
        N1();
        f00 f00Var = vgb0.a;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AnalyticsParam.EVENT_PARAM_STEP, "verify_bvn")};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        if (w1k.a(key, entry, map, key) != null) {
            hb5.a(wga.a(key, "duplicate key: "));
        } else {
            vgb0.c(AnalyticsEvent.DEPOSIT_CONFIRM_NAME, Collections.unmodifiableMap(map), true);
            this.z.y1(strL, this.d.getInputData().toString());
        }
    }

    public final void L1(BvnData bvnData) {
        int bvnState = bvnData == null ? 109 : bvnData.getBvnState();
        if (bvnState == 105) {
            zyf0.c(1, "Reach Limit");
            return;
        }
        if (bvnState != 110) {
            if (bvnState == 112) {
                M1(bvnData.getMessage());
                return;
            } else {
                if (bvnState != 101) {
                    M1(bvnData.getMessage());
                    return;
                }
                return;
            }
        }
        String cMSString = getCMSString(R.string.component_bvn__the_name_on_this_bvn_does_not_match_your_sporty_account_tip, new Object[0]);
        String cMSString2 = getCMSString(R.string.page_withdraw__invalid_bvn, new Object[0]);
        String cMSString3 = getCMSString(R.string.common_functions__u_retry, new Object[0]);
        String cMSString4 = getCMSString(R.string.common_functions__cancel, new Object[0]);
        wie wieVar = new wie();
        wieVar.a = cMSString;
        wieVar.c = cMSString4;
        wieVar.b = cMSString3;
        wieVar.f = true;
        wieVar.e = true;
        wieVar.w = null;
        wieVar.v = null;
        wieVar.i = true;
        wieVar.d = cMSString2;
        wieVar.z = R.color.brand_secondary;
        wieVar.y = R.color.brand_secondary;
        wieVar.A = R.color.text_type1_primary;
        wieVar.B = 0;
        wieVar.C = 1;
        wieVar.D = false;
        wieVar.E = false;
        wieVar.F = false;
        wieVar.show(getSupportFragmentManager(), "transfer_bvn_verify_override_fail");
    }

    public final void M1(String str) {
        String cMSString;
        if (TextUtils.isEmpty(str)) {
            str = getCMSString(R.string.component_bvn__sorry_something_went_wrong_emoji, new Object[0]);
            cMSString = getCMSString(R.string.component_bvn__whoops, new Object[0]);
        } else {
            cMSString = getCMSString(R.string.page_instant_virtual__coming_soon, new Object[0]);
        }
        b.a title = new b.a(this).setTitle(cMSString);
        title.a.f = str;
        title.c(getCMSString(R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: frg0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TransferBvnActivity.a aVar = TransferBvnActivity.A;
                TransferBvnActivity transferBvnActivity = this.a;
                transferBvnActivity.setResult(109);
                transferBvnActivity.finish();
            }
        });
        b bVarCreate = title.create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    public final void N1() {
        ProgressDialog progressDialog = this.y;
        if (progressDialog == null) {
            ProgressDialog progressDialog2 = new ProgressDialog(this, R.style.BrandProgressDialogTheme);
            this.y = progressDialog2;
            progressDialog2.setTitle((CharSequence) null);
            this.y.setMessage(getCMSString(R.string.common_functions__loading_with_dot, new Object[0]));
            this.y.setIndeterminate(true);
            this.y.setCancelable(false);
            this.y.setOnCancelListener(null);
            this.y.show();
        } else {
            progressDialog.show();
        }
        this.b.setEnabled(false);
    }
}
