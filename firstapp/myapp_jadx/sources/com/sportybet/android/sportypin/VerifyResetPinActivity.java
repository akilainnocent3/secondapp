package com.sportybet.android.sportypin;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.widgets.CountdownButton;
import com.sporty.android.common_ui.widgets.SmsInputView;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.sportypin.VerifyResetPinActivity;
import defpackage.a8b;
import defpackage.ct90;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.dq7;
import defpackage.ema;
import defpackage.f7m;
import defpackage.h8a0;
import defpackage.hb5;
import defpackage.j6c;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.lop;
import defpackage.m5s;
import defpackage.nsm;
import defpackage.o1i0;
import defpackage.psm;
import defpackage.pwx;
import defpackage.q1i0;
import defpackage.q5s;
import defpackage.r1i0;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.sn5;
import defpackage.snb0;
import defpackage.su5;
import defpackage.v8i0;
import defpackage.va0;
import defpackage.wie;
import defpackage.wm70;
import defpackage.xdp;
import defpackage.xxz;
import defpackage.yrh0;
import defpackage.zch0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class VerifyResetPinActivity extends f7m implements View.OnClickListener, SmsInputView.c, pwx {
    public static final /* synthetic */ int H = 0;
    public int A;
    public ProgressDialog B;
    public String C;
    public String D;
    public nsm E;
    public psm F;
    public d0n G;
    public SmsInputView b;
    public CountdownButton c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView i;
    public String v;
    public q5s w;
    public r1i0 y;
    public int z;

    public class a extends ClickableSpan {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            VerifyResetPinActivity verifyResetPinActivity = VerifyResetPinActivity.this;
            lop.a(verifyResetPinActivity.b);
            verifyResetPinActivity.G.b(verifyResetPinActivity, snb0.RESET_PIN);
        }
    }

    public final void A1(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            if (i == 1) {
                str = getCMSString(R.string.page_withdraw__we_can_only_send_you_a_verification_code_vnum_vhours_tip, "5", "24");
            } else if (i == 2) {
                str = getCMSString(R.string.common_otp_verify__rate_limit_exceeded_please_try_again_later_or_cs, new Object[0]);
            }
        }
        String cMSString = getCMSString(R.string.common_functions__contact_service, new Object[0]);
        h hVar = new h(this);
        e eVar = new e();
        eVar.a = null;
        eVar.b = str;
        eVar.c = cMSString;
        eVar.d = hVar;
        eVar.show(getSupportFragmentManager(), "VerifyDisablePinAlertOTPLimitDialog");
    }

    public final void B1(String str, String str2) {
        String string;
        if (!this.E.isConnected()) {
            z1(null, null, null);
            return;
        }
        ProgressDialog progressDialog = new ProgressDialog(this, R.style.BrandProgressDialogTheme);
        this.B = progressDialog;
        progressDialog.setTitle((CharSequence) null);
        this.B.setMessage(getCMSString(R.string.common_functions__sending_code, new Object[0]));
        this.B.setIndeterminate(true);
        this.B.setCancelable(false);
        this.B.setOnCancelListener(null);
        this.B.show();
        q5s q5sVar = this.w;
        String str3 = this.C;
        if (q5sVar.A != null) {
            return;
        }
        xxz xxzVar = q5sVar.b;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizType", "DELETE_WITHDRAW_PIN");
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("token", str3);
            }
            jSONObject.put("otpCode", str);
            jSONObject.put("verifyCodeSource", str2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            string = "";
        }
        su5<BaseResponse<xdp>> su5VarH0 = xxzVar.H0(string);
        q5sVar.A = su5VarH0;
        su5VarH0.G(new m5s(q5sVar, q5sVar.i));
    }

    @Override // com.sporty.android.common_ui.widgets.SmsInputView.c
    public final void O(CharSequence charSequence) {
        lop.a(this.b);
        B1(charSequence.toString(), this.D);
    }

    @Override // com.sporty.android.common_ui.widgets.SmsInputView.c
    public final void W0() {
        if (this.b.getCurrentNumber().length() == 6) {
            lop.a(this.b);
            B1(this.b.getCurrentNumber().toString(), this.D);
        }
    }

    @Override // com.sporty.android.common_ui.widgets.SmsInputView.c
    public final void b0(CharSequence charSequence) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_back) {
            lop.b(view, Boolean.FALSE);
            finish();
            return;
        }
        if (id != R.id.countdown) {
            if (id == R.id.relative_layout_main) {
                lop.b(view, Boolean.FALSE);
                return;
            } else {
                if (id == R.id.tv_contact_support) {
                    this.G.b(this, snb0.RESET_PIN);
                    return;
                }
                return;
            }
        }
        if (!this.E.isConnected()) {
            z1(null, null, null);
            return;
        }
        this.c.b();
        r1i0 r1i0Var = this.y;
        ema emaVarY1 = r1i0Var.y1();
        ct90 ct90VarB = r1i0Var.d.c(j6c.RESET_PIN, null, new h8a0(r1i0Var, 1)).d(wm70.c).b(va0.a());
        q1i0 q1i0Var = new q1i0(r1i0Var);
        ct90VarB.a(q1i0Var);
        emaVarY1.b(q1i0Var);
        if (this.F.r()) {
            this.i.setVisibility(0);
            this.d.setText(getCMSString(R.string.register_login_int__verification_email_sent_desc, new Object[0]));
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_verify_reset_pin);
        if (getIntent() != null) {
            this.z = getIntent().getIntExtra("REMAIN_NUMBER", 0);
            this.v = getIntent().getStringExtra("MOBILE");
            this.A = getIntent().getIntExtra("OTP_TYPE", 0);
            this.C = getIntent().getStringExtra("REVERSE_PIN_TOKEN");
            this.D = getIntent().getStringExtra("verifyCodeSource");
        }
        ImageButton imageButton = (ImageButton) findViewById(R.id.btn_back);
        this.e = (TextView) findViewById(R.id.tv_remain_time);
        this.f = (TextView) findViewById(R.id.tv_hint);
        imageButton.setOnClickListener(this);
        SmsInputView smsInputView = (SmsInputView) findViewById(R.id.otp_view);
        this.b = smsInputView;
        smsInputView.setInputListener(this);
        if (this.F.r()) {
            this.b.setCustomInputType(1);
        }
        CountdownButton countdownButton = (CountdownButton) findViewById(R.id.btn_resend);
        this.c = countdownButton;
        countdownButton.setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.tv_title);
        if (this.F.r()) {
            textView.setText(getCMSString(R.string.common_otp_verify__verify_email, new Object[0]));
        } else {
            textView.setText(getCMSString(R.string.component_withdraw_pin__verify_reset_pin, new Object[0]));
        }
        TextView textView2 = (TextView) findViewById(R.id.tv_subtitle);
        this.d = textView2;
        int i = this.A;
        if (i == 0) {
            textView2.setText(getCMSString(R.string.common_otp_verify__we_have_sent_you_a_vnum_digit_code_to_vcountrycode_vphone, "6", this.F.P(), this.v));
        } else if (i == 2) {
            textView2.setText(Html.fromHtml(getCMSString(R.string.register_login_int__verify_email_sent_desc, getAccountHelper().getAccount().name)));
        } else {
            textView2.setText(getCMSString(R.string.common_otp_verify__we_will_call_you_at_vcountrycode_vphone_within_vsec_vnum_digit_tip, a8b.b(), this.v, "60", "6"));
        }
        int i2 = this.z;
        TextView textView3 = this.e;
        String strValueOf = String.valueOf(i2);
        AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
        textView3.setText(getCMSString(R.string.common_otp_verify__you_have_vnum_vtimetext_left_to_request_another_one, strValueOf, i2 > 1 ? sn5.b(this, R.string.cashout__l_times, new Object[0]) : sn5.b(this, R.string.cashout__l_time, new Object[0])));
        if (this.F.x()) {
            this.f.setText(zch0.j(getCMSString(R.string.common_otp_verify__please_disable_do_not_disturb_to_recevice_your_code_contact_service_tip, new Object[0]), this.f.getContext().getColor(R.color.brand_secondary), 14, new a()));
            this.f.setMovementMethod(LinkMovementMethod.getInstance());
            this.f.setHighlightColor(0);
        }
        TextView textView4 = (TextView) findViewById(R.id.tv_contact_support);
        this.i = textView4;
        textView4.setOnClickListener(this);
        this.c.a(60);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(q5s.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.w = (q5s) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(r1i0.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        r1i0 r1i0Var = (r1i0) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        this.y = r1i0Var;
        r1i0Var.i.f(this, new lfy() { // from class: l1i0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                bi50 bi50Var = (bi50) obj;
                int i3 = VerifyResetPinActivity.H;
                VerifyResetPinActivity verifyResetPinActivity = this.a;
                ProgressDialog progressDialog = verifyResetPinActivity.B;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                if (verifyResetPinActivity.isFinishing()) {
                    return;
                }
                if (bi50Var == null) {
                    verifyResetPinActivity.z1(null, null, null);
                    return;
                }
                BaseResponse baseResponse = (BaseResponse) bi50Var.b;
                if (!bi50Var.a.getIsSuccessful() || baseResponse == null) {
                    verifyResetPinActivity.z1(null, null, null);
                } else {
                    int i4 = baseResponse.bizCode;
                    if (i4 == 10000) {
                        verifyResetPinActivity.c.a(60);
                        verifyResetPinActivity.z = lal.a((xdp) baseResponse.data, "remainMsgNum", -1);
                        verifyResetPinActivity.C = lal.b((xdp) baseResponse.data, "token");
                        int i5 = verifyResetPinActivity.z;
                        if (i5 >= 0) {
                            TextView textView5 = verifyResetPinActivity.e;
                            String strValueOf2 = String.valueOf(i5);
                            AccountHelperEntryPointImpl accountHelperEntryPointImpl2 = yrh0.a;
                            textView5.setText(verifyResetPinActivity.getCMSString(R.string.common_otp_verify__you_have_vnum_vtimetext_left_to_request_another_one, strValueOf2, i5 > 1 ? sn5.b(verifyResetPinActivity, R.string.cashout__l_times, new Object[0]) : sn5.b(verifyResetPinActivity, R.string.cashout__l_time, new Object[0])));
                            return;
                        }
                        return;
                    }
                    String str = baseResponse.message;
                    if (i4 != 11709) {
                        verifyResetPinActivity.z1(null, str, null);
                    } else {
                        verifyResetPinActivity.A1(1, str);
                    }
                }
                verifyResetPinActivity.c.a(0);
            }
        });
        this.w.i.f(this, new o1i0(this));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        lop.a(this.b);
    }

    public final void z1(String str, String str2, DialogInterface.OnClickListener onClickListener) {
        if (TextUtils.isEmpty(str2)) {
            str2 = getCMSString(R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(this);
            aVar.a.f = str2;
            androidx.appcompat.app.b.a positiveButton = aVar.setPositiveButton(R.string.common_functions__ok, onClickListener);
            positiveButton.a.k = false;
            positiveButton.create().show();
            return;
        }
        String cMSString = getCMSString(R.string.common_functions__ok, new Object[0]);
        wie wieVar = new wie();
        wieVar.a = str2;
        wieVar.c = "Cancel";
        wieVar.b = cMSString;
        wieVar.f = false;
        wieVar.e = true;
        wieVar.w = null;
        wieVar.v = null;
        wieVar.i = true;
        wieVar.d = str;
        wieVar.z = R.color.text_type1_secondary;
        wieVar.y = R.color.brand_secondary;
        wieVar.A = R.color.text_type1_secondary;
        wieVar.B = 0;
        wieVar.C = 1;
        wieVar.D = false;
        wieVar.E = true;
        wieVar.F = false;
        wieVar.show(getSupportFragmentManager(), "DialogBasicInfoFragment");
    }
}
