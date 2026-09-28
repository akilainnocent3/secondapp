package com.sportybet.android.bvn;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.r;
import com.sporty.android.core.model.pocket.withdraw.bvn.BvnData;
import com.sportybet.android.bvn.VerifyBvnActivity;
import com.sportybet.android.gp.tz.R;
import defpackage.b5a0;
import defpackage.bwf0;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.dq7;
import defpackage.dzh0;
import defpackage.hb5;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.nsm;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.v8i0;
import defpackage.wie;
import defpackage.z6m;
import defpackage.zyf0;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class VerifyBvnActivity extends z6m {
    public static final /* synthetic */ int B = 0;
    public d0n A;
    public dzh0 w;
    public ProgressDialog y;
    public nsm z;

    @Override // defpackage.e5
    public final int A1() {
        return R.string.app_common__bvn_claim_gifts_message;
    }

    @Override // defpackage.e5
    public final int D1() {
        return R.string.component_bvn__claim_gifts;
    }

    @Override // defpackage.e5
    public final void F1() {
        M1(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
    }

    @Override // defpackage.e5
    public final void G1() {
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(dzh0.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        dzh0 dzh0Var = (dzh0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.w = dzh0Var;
        dzh0Var.a.f(this, new lfy() { // from class: vyh0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                BvnData bvnData = (BvnData) obj;
                int i = VerifyBvnActivity.B;
                final VerifyBvnActivity verifyBvnActivity = this.a;
                ProgressDialog progressDialog = verifyBvnActivity.y;
                if (progressDialog != null && progressDialog.isShowing()) {
                    verifyBvnActivity.z1();
                    verifyBvnActivity.y.dismiss();
                }
                int bvnState = bvnData == null ? 109 : bvnData.getBvnState();
                if (bvnState == -2) {
                    String cMSString = verifyBvnActivity.getCMSString(R.string.common_feedback__sorry_something_went_wrong, new Object[0]);
                    if (verifyBvnActivity.isFinishing()) {
                        return;
                    }
                    b.a aVar = new b.a(verifyBvnActivity);
                    AlertController.b bVar = aVar.a;
                    bVar.f = cMSString;
                    bVar.k = false;
                    aVar.setPositiveButton(R.string.common_functions__ok, null).f();
                    return;
                }
                if (bvnState == 101) {
                    a92.b bVar2 = new a92.b(R.string.component_bvn__success, R.string.component_bvn__your_bonuses_are_now_available_to_use);
                    bVar2.h = xib0.IMAGE_BVN_GIFT_CLOSE;
                    bVar2.g = new bzh0(verifyBvnActivity);
                    bVar2.j = true;
                    bVar2.l = R.dimen.bvngift_gift_width;
                    bVar2.m = R.dimen.bvngift_gift_height;
                    a92.j0(bVar2).show(verifyBvnActivity.getSupportFragmentManager(), "bvngift_verify_success");
                    return;
                }
                if (bvnState != 105) {
                    if (bvnState == 109) {
                        String cMSString2 = verifyBvnActivity.getCMSString(R.string.component_bvn__your_verification_has_failed_please_check_your_information_tip, new Object[0]);
                        String cMSString3 = verifyBvnActivity.getCMSString(R.string.common_functions__u_retry, new Object[0]);
                        String cMSString4 = verifyBvnActivity.getCMSString(R.string.common_functions__cancel, new Object[0]);
                        String cMSString5 = verifyBvnActivity.getCMSString(R.string.page_payment__verification_failed, new Object[0]);
                        wie.a aVar2 = new wie.a() { // from class: yyh0
                            @Override // wie.a
                            public final void d() {
                                int i2 = VerifyBvnActivity.B;
                                verifyBvnActivity.M1(109);
                            }
                        };
                        wie wieVar = new wie();
                        wieVar.a = cMSString2;
                        wieVar.c = cMSString4;
                        wieVar.b = cMSString3;
                        wieVar.f = true;
                        wieVar.e = true;
                        wieVar.w = aVar2;
                        wieVar.v = null;
                        wieVar.i = true;
                        wieVar.d = cMSString5;
                        wieVar.z = R.color.brand_secondary;
                        wieVar.y = R.color.brand_secondary;
                        wieVar.A = R.color.text_type1_primary;
                        wieVar.B = 0;
                        wieVar.C = 1;
                        wieVar.D = false;
                        wieVar.E = false;
                        wieVar.F = false;
                        wieVar.show(verifyBvnActivity.getSupportFragmentManager(), "bvngift_verify_fail");
                        return;
                    }
                    if (bvnState != 110) {
                        verifyBvnActivity.N1(bvnData.getMessage());
                        return;
                    }
                }
                verifyBvnActivity.L1(bvnData);
            }
        });
        this.w.b.f(this, new lfy() { // from class: wyh0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                BvnData bvnData = (BvnData) obj;
                int i = VerifyBvnActivity.B;
                VerifyBvnActivity verifyBvnActivity = this.a;
                ProgressDialog progressDialog = verifyBvnActivity.y;
                if (progressDialog != null && progressDialog.isShowing()) {
                    verifyBvnActivity.z1();
                    verifyBvnActivity.y.dismiss();
                }
                verifyBvnActivity.L1(bvnData);
            }
        });
        if (!this.z.isConnected()) {
            zyf0.a(R.string.common_feedback__please_check_your_internet_connection_and_try_again);
        } else {
            O1();
            this.w.x1();
        }
    }

    @Override // defpackage.e5
    public final void H1() {
        M1(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
    }

    @Override // defpackage.e5
    public final void J1() {
    }

    @Override // defpackage.e5
    public final void K1() {
        if (!this.z.isConnected()) {
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
        this.w.y1(strL, this.d.getInputData().toString());
    }

    public final void L1(BvnData bvnData) {
        int bvnState = bvnData == null ? 109 : bvnData.getBvnState();
        if (bvnState == 105) {
            String cMSString = getCMSString(R.string.page_withdraw__too_many_failed_verification_attempts_to_ensure_tip, new Object[0]);
            String cMSString2 = getCMSString(R.string.common_functions__ok, new Object[0]);
            String cMSString3 = getCMSString(R.string.common_functions__live_chat, new Object[0]);
            String cMSString4 = getCMSString(R.string.page_payment__verification_failed, new Object[0]);
            b5a0 b5a0Var = new b5a0(this);
            wie.a aVar = new wie.a() { // from class: azh0
                @Override // wie.a
                public final void d() {
                    int i = VerifyBvnActivity.B;
                    VerifyBvnActivity verifyBvnActivity = this.a;
                    verifyBvnActivity.A.b(verifyBvnActivity, snb0.BVN);
                    verifyBvnActivity.M1(105);
                }
            };
            wie wieVar = new wie();
            wieVar.a = cMSString;
            wieVar.c = cMSString3;
            wieVar.b = cMSString2;
            wieVar.f = true;
            wieVar.e = true;
            wieVar.w = aVar;
            wieVar.v = b5a0Var;
            wieVar.i = true;
            wieVar.d = cMSString4;
            wieVar.z = R.color.text_type1_secondary;
            wieVar.y = R.color.brand_secondary;
            wieVar.A = R.color.text_type1_primary;
            wieVar.B = 0;
            wieVar.C = 1;
            wieVar.D = false;
            wieVar.E = false;
            wieVar.F = false;
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
        String cMSString6 = getCMSString(R.string.common_functions__u_retry, new Object[0]);
        String cMSString7 = getCMSString(R.string.common_functions__cancel, new Object[0]);
        String cMSString8 = getCMSString(R.string.page_withdraw__invalid_bvn, new Object[0]);
        wie.a aVar2 = new wie.a() { // from class: xyh0
            @Override // wie.a
            public final void d() {
                int i = VerifyBvnActivity.B;
                this.a.M1(109);
            }
        };
        wie wieVar2 = new wie();
        wieVar2.a = cMSString5;
        wieVar2.c = cMSString7;
        wieVar2.b = cMSString6;
        wieVar2.f = true;
        wieVar2.e = true;
        wieVar2.w = aVar2;
        wieVar2.v = null;
        wieVar2.i = true;
        wieVar2.d = cMSString8;
        wieVar2.z = R.color.brand_secondary;
        wieVar2.y = R.color.brand_secondary;
        wieVar2.A = R.color.text_type1_primary;
        wieVar2.B = 0;
        wieVar2.C = 1;
        wieVar2.D = false;
        wieVar2.E = false;
        wieVar2.F = false;
        wieVar2.show(getSupportFragmentManager(), "bvn_verify_override_fail");
    }

    public final void M1(int i) {
        setResult(i);
        finish();
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
        b bVarCreate = title.setPositiveButton(R.string.common_functions__ok, new DialogInterface.OnClickListener() { // from class: zyh0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = VerifyBvnActivity.B;
                this.a.M1(109);
            }
        }).create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    public final void O1() {
        if (this.y == null) {
            ProgressDialog progressDialog = new ProgressDialog(this, R.style.BrandProgressDialogTheme);
            this.y = progressDialog;
            progressDialog.setTitle((CharSequence) null);
            this.y.setMessage(getCMSString(R.string.common_functions__loading_with_dot, new Object[0]));
            this.y.setIndeterminate(true);
            this.y.setCancelable(false);
            this.y.setOnCancelListener(null);
            this.y.show();
        }
        this.b.setEnabled(false);
        this.y.show();
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        M1(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
        return true;
    }
}
