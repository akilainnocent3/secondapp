package com.sportybet.android.account.confirm.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.r;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.patron.KycSource;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sporty.android.core.model.pocket.withdraw.bvn.BvnData;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.account.confirm.activity.NameBvnActivity;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.auth.SportyAccountManagerLegacyHelper;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoActivity;
import com.sportybet.feature.kyc.confirmAccountInfo.f;
import defpackage.acx;
import defpackage.bwf0;
import defpackage.crs;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.dq7;
import defpackage.dzh0;
import defpackage.f00;
import defpackage.hb5;
import defpackage.itf0;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.nsm;
import defpackage.psm;
import defpackage.r8i0;
import defpackage.rt40;
import defpackage.rxl;
import defpackage.s8i0;
import defpackage.sh8;
import defpackage.st40;
import defpackage.v8i0;
import defpackage.vd;
import defpackage.vgb0;
import defpackage.w1k;
import defpackage.wga;
import defpackage.wie;
import defpackage.xib0;
import defpackage.yrh0;
import defpackage.zux;
import defpackage.zyf0;
import java.text.ParseException;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class NameBvnActivity extends rxl implements zux {
    public static final a D = new a();
    public nsm A;
    public psm B;
    public d0n C;
    public ProgressDialog w;
    public dzh0 y;
    public int z = 2000;

    public class a extends vd<rt40, st40> {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            Intent intent = new Intent(context, (Class<?>) NameBvnActivity.class);
            intent.putExtra(UserCertConstants.EXTRA_SOURCE, ((rt40) obj).a);
            return intent;
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            return i == 5002 ? st40.b.a : st40.a.a;
        }
    }

    @Override // defpackage.e5
    public final int A1() {
        return R.string.component_bvn__please_provide_your_dob_and_bvn_to_claim_your_first_deposit;
    }

    @Override // defpackage.e5
    public final int B1() {
        return R.drawable.ic_close_black_24dp;
    }

    @Override // defpackage.e5
    public final int C1() {
        return R.string.common_functions__deposit;
    }

    @Override // defpackage.e5
    public final int D1() {
        return R.string.component_bvn__claim_gifts;
    }

    @Override // defpackage.e5
    public final void F1() {
        setResult(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
        finish();
    }

    @Override // defpackage.e5
    public final void G1() {
        if (getIntent() != null && getIntent().hasExtra(UserCertConstants.EXTRA_SOURCE)) {
            this.z = getIntent().getIntExtra(UserCertConstants.EXTRA_SOURCE, 2000);
        }
        this.c.setVisibility(0);
        sh8.a().a(xib0.IMAGE_BVN_CLAIM_GIFT, this.c);
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
        ((f) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI))).A.f(this, new lfy() { // from class: vbx
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                Integer num = (Integer) obj;
                NameBvnActivity.a aVar = NameBvnActivity.D;
                if (num == null) {
                    return;
                }
                SportyAccountManagerLegacyHelper.updateUserCertStatus(this.a.getAccountManager(), num.intValue());
            }
        });
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
        this.y = dzh0Var;
        dzh0Var.a.f(this, new lfy() { // from class: wbx
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                BvnData bvnData = (BvnData) obj;
                NameBvnActivity.a aVar = NameBvnActivity.D;
                NameBvnActivity nameBvnActivity = this.a;
                ProgressDialog progressDialog = nameBvnActivity.w;
                if (progressDialog != null && progressDialog.isShowing()) {
                    nameBvnActivity.z1();
                    nameBvnActivity.w.dismiss();
                }
                int bvnState = bvnData == null ? 109 : bvnData.getBvnState();
                if (bvnState == -2) {
                    String cMSString = nameBvnActivity.getCMSString(R.string.common_feedback__sorry_something_went_wrong, new Object[0]);
                    if (nameBvnActivity.isFinishing()) {
                        return;
                    }
                    b.a aVar2 = new b.a(nameBvnActivity);
                    AlertController.b bVar = aVar2.a;
                    bVar.f = cMSString;
                    bVar.k = false;
                    aVar2.setPositiveButton(R.string.common_functions__ok, null).f();
                    return;
                }
                if (bvnState == 101) {
                    nameBvnActivity.M1();
                    return;
                }
                if (bvnState != 105) {
                    if (bvnState == 109) {
                        String cMSString2 = nameBvnActivity.getCMSString(R.string.component_bvn__your_verification_has_failed_please_check_your_information_tip, new Object[0]);
                        String cMSString3 = nameBvnActivity.getCMSString(R.string.page_transaction__verification_failed, new Object[0]);
                        String cMSString4 = nameBvnActivity.getCMSString(R.string.common_functions__u_retry, new Object[0]);
                        String cMSString5 = nameBvnActivity.getCMSString(R.string.common_functions__cancel, new Object[0]);
                        j5e j5eVar = new j5e(nameBvnActivity);
                        wie wieVar = new wie();
                        wieVar.a = cMSString2;
                        wieVar.c = cMSString5;
                        wieVar.b = cMSString4;
                        wieVar.f = true;
                        wieVar.e = true;
                        wieVar.w = j5eVar;
                        wieVar.v = null;
                        wieVar.i = true;
                        wieVar.d = cMSString3;
                        wieVar.z = R.color.brand_secondary;
                        wieVar.y = R.color.brand_secondary;
                        wieVar.A = R.color.text_type1_primary;
                        wieVar.B = 0;
                        wieVar.C = 1;
                        wieVar.D = false;
                        wieVar.E = false;
                        wieVar.F = false;
                        wieVar.show(nameBvnActivity.getSupportFragmentManager(), "bvngift_verify_fail");
                        return;
                    }
                    if (bvnState != 110) {
                        nameBvnActivity.N1(bvnData.getMessage());
                        return;
                    }
                }
                nameBvnActivity.L1(bvnData);
            }
        });
        this.y.b.f(this, new lfy() { // from class: xbx
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                BvnData bvnData = (BvnData) obj;
                NameBvnActivity.a aVar = NameBvnActivity.D;
                NameBvnActivity nameBvnActivity = this.a;
                ProgressDialog progressDialog = nameBvnActivity.w;
                if (progressDialog != null && progressDialog.isShowing()) {
                    nameBvnActivity.z1();
                    nameBvnActivity.w.dismiss();
                }
                nameBvnActivity.L1(bvnData);
            }
        });
        if (this.A.isConnected()) {
            O1();
            this.y.x1();
        } else {
            zyf0.a(R.string.common_feedback__please_check_your_internet_connection_and_try_again);
        }
        this.a.E(new Date(), this);
    }

    @Override // defpackage.e5
    public final void H1() {
        f00 f00Var = vgb0.a;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AnalyticsParam.EVENT_PARAM_STEP, "back_bvn")};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        if (w1k.a(key, entry, map, key) != null) {
            hb5.a(wga.a(key, "duplicate key: "));
        } else {
            vgb0.c(AnalyticsEvent.DEPOSIT_CONFIRM_NAME, Collections.unmodifiableMap(map), true);
            M1();
        }
    }

    @Override // defpackage.e5
    public final void J1() {
        f00 f00Var = vgb0.a;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AnalyticsParam.EVENT_PARAM_STEP, "skip_bvn")};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        if (w1k.a(key, entry, map, key) != null) {
            hb5.a(wga.a(key, "duplicate key: "));
        } else {
            vgb0.c(AnalyticsEvent.DEPOSIT_CONFIRM_NAME, Collections.unmodifiableMap(map), true);
            M1();
        }
    }

    @Override // defpackage.e5
    public final void K1() {
        if (!this.A.isConnected()) {
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
        if (TextUtils.isEmpty(strL) || TextUtils.isEmpty(this.d.getInputData().toString())) {
            return;
        }
        O1();
        f00 f00Var = vgb0.a;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AnalyticsParam.EVENT_PARAM_STEP, "verify_bvn")};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        if (w1k.a(key, entry, map, key) != null) {
            hb5.a(wga.a(key, "duplicate key: "));
        } else {
            vgb0.c(AnalyticsEvent.DEPOSIT_CONFIRM_NAME, Collections.unmodifiableMap(map), true);
            this.y.y1(strL, this.d.getInputData().toString());
        }
    }

    public final void L1(BvnData bvnData) {
        int bvnState = bvnData == null ? 109 : bvnData.getBvnState();
        if (bvnState == 105) {
            String cMSString = getCMSString(R.string.component_bvn__your_dob_verification_has_failed_you_have_entered_tip, new Object[0]);
            String cMSString2 = getCMSString(R.string.page_transaction__verification_failed, new Object[0]);
            String cMSString3 = getCMSString(R.string.common_functions__continue, new Object[0]);
            String cMSString4 = getCMSString(R.string.common_functions__live_chat, new Object[0]);
            crs crsVar = new crs(this);
            wie.a aVar = new wie.a() { // from class: zbx
                @Override // wie.a
                public final void d() {
                    NameBvnActivity.a aVar2 = NameBvnActivity.D;
                    NameBvnActivity nameBvnActivity = this.a;
                    nameBvnActivity.C.b(nameBvnActivity, snb0.BVN);
                }
            };
            wie wieVar = new wie();
            wieVar.a = cMSString;
            wieVar.c = cMSString4;
            wieVar.b = cMSString3;
            wieVar.f = true;
            wieVar.e = true;
            wieVar.w = aVar;
            wieVar.v = crsVar;
            wieVar.i = true;
            wieVar.d = cMSString2;
            wieVar.z = R.color.text_type1_secondary;
            wieVar.y = R.color.brand_secondary;
            wieVar.A = R.color.text_type1_primary;
            wieVar.B = 0;
            wieVar.C = 1;
            wieVar.D = false;
            wieVar.E = false;
            wieVar.F = true;
            wieVar.show(getSupportFragmentManager(), "bvngift_verify_fail_reach_limit");
            return;
        }
        if (bvnState != 110) {
            if (bvnState != 101) {
                N1(bvnData.getMessage());
                return;
            }
            return;
        }
        String cMSString5 = getCMSString(R.string.component_bvn__the_name_on_this_bvn_does_not_match_your_sporty_account_tip, new Object[0]);
        String cMSString6 = getCMSString(R.string.page_withdraw__invalid_bvn, new Object[0]);
        String cMSString7 = getCMSString(R.string.common_functions__u_retry, new Object[0]);
        String cMSString8 = getCMSString(R.string.common_functions__cancel, new Object[0]);
        acx acxVar = new acx(this);
        wie wieVar2 = new wie();
        wieVar2.a = cMSString5;
        wieVar2.c = cMSString8;
        wieVar2.b = cMSString7;
        wieVar2.f = true;
        wieVar2.e = true;
        wieVar2.w = acxVar;
        wieVar2.v = null;
        wieVar2.i = true;
        wieVar2.d = cMSString6;
        wieVar2.z = R.color.brand_secondary;
        wieVar2.y = R.color.brand_secondary;
        wieVar2.A = R.color.text_type1_primary;
        wieVar2.B = 0;
        wieVar2.C = 1;
        wieVar2.D = false;
        wieVar2.E = false;
        wieVar2.F = false;
        wieVar2.show(getSupportFragmentManager(), "name_bvn_verify_override_fail");
    }

    public final void M1() {
        Intent intent;
        if (this.B.x()) {
            intent = new Intent(this, (Class<?>) CommonConfirmNameActivity.class);
            intent.putExtra("source", (2000 == this.z ? KycSource.DEPOSIT : KycSource.ANNOYING).getValue());
        } else {
            intent = new Intent(this, (Class<?>) ConfirmAccountInfoActivity.class);
            intent.putExtra(UserCertConstants.EXTRA_SOURCE, this.z);
        }
        AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
        try {
            startActivityForResult(intent, 2000, null);
        } catch (Throwable th) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.p(th, "Failed to start activity: %s", intent);
        }
    }

    public final void N1(String str) {
        String cMSString;
        if (TextUtils.isEmpty(str)) {
            str = getCMSString(R.string.component_bvn__sorry_something_went_wrong_emoji, new Object[0]);
            cMSString = getCMSString(R.string.component_bvn__whoops, new Object[0]);
        } else {
            cMSString = getCMSString(R.string.page_instant_virtual__coming_soon, new Object[0]);
        }
        b.a title = new b.a(this).setTitle(cMSString);
        title.a.f = str;
        b bVarCreate = title.setPositiveButton(R.string.common_functions__ok, new DialogInterface.OnClickListener() { // from class: ybx
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                NameBvnActivity.a aVar = NameBvnActivity.D;
                this.a.M1();
            }
        }).create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    public final void O1() {
        if (isFinishing()) {
            return;
        }
        ProgressDialog progressDialog = this.w;
        if (progressDialog == null) {
            ProgressDialog progressDialog2 = new ProgressDialog(this, R.style.BrandProgressDialogTheme);
            this.w = progressDialog2;
            progressDialog2.setTitle((CharSequence) null);
            this.w.setMessage(getCMSString(R.string.common_functions__loading_with_dot, new Object[0]));
            this.w.setIndeterminate(true);
            this.w.setCancelable(false);
            this.w.setOnCancelListener(null);
            this.w.show();
        } else {
            progressDialog.show();
        }
        this.b.setEnabled(false);
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2000) {
            setResult(i2);
            finish();
        }
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        setResult(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
        finish();
        return true;
    }
}
