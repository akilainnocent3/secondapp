package com.sportybet.android.payment.security.sportypin.presentation.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.widgets.CountdownButton;
import com.sporty.android.common_ui.widgets.SmsInputView;
import com.sporty.android.core.model.captcha.CaptchaData;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import com.sporty.android.core.model.pocket.withdraw.transfer.TransferStatusLegacy;
import com.sporty.android.platform.features.captcha.model.CaptchaError;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.payment.security.sportypin.presentation.activity.TransferPinActivity;
import com.sportybet.android.sportypin.e;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import defpackage.a92;
import defpackage.au7;
import defpackage.cu90;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.dq7;
import defpackage.dw90;
import defpackage.e0i0;
import defpackage.ema;
import defpackage.eu90;
import defpackage.gr0;
import defpackage.hb5;
import defpackage.j6c;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.lop;
import defpackage.mn00;
import defpackage.n5s;
import defpackage.nsm;
import defpackage.psm;
import defpackage.pya;
import defpackage.q5s;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.sn5;
import defpackage.snb0;
import defpackage.srg0;
import defpackage.su5;
import defpackage.to20;
import defpackage.trg0;
import defpackage.v8i0;
import defpackage.va0;
import defpackage.vd;
import defpackage.xrg0;
import defpackage.yrg0;
import defpackage.yrh0;
import defpackage.z5m;
import defpackage.zch0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class TransferPinActivity extends z5m implements View.OnClickListener, SmsInputView.c, to20 {
    public static final a C = new a();
    public psm A;
    public d0n B;
    public SmsInputView b;
    public CountdownButton c;
    public TextView d;
    public TextView e;
    public String f;
    public q5s i;
    public yrg0 v;
    public au7 w;
    public ProgressDialog y;
    public nsm z;

    /* JADX INFO: loaded from: classes6.dex */
    public class a extends vd<e0i0, Void> {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            Intent intent = new Intent(context, (Class<?>) TransferPinActivity.class);
            Integer num = ((e0i0) obj).a;
            intent.putExtra("REMAIN_NUMBER", num == null ? 0 : num.intValue());
            return intent;
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            return null;
        }
    }

    public class b extends ClickableSpan {
        public b() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            TransferPinActivity transferPinActivity = TransferPinActivity.this;
            lop.a(transferPinActivity.b);
            transferPinActivity.B.b(transferPinActivity, snb0.OTP);
        }
    }

    public class c implements a92.a {
        public c() {
        }

        @Override // a92.a
        public final void L() {
            a aVar = TransferPinActivity.C;
            TransferPinActivity transferPinActivity = TransferPinActivity.this;
            transferPinActivity.setResult(-1);
            transferPinActivity.finish();
        }

        @Override // a92.a
        public final void p() {
        }
    }

    public class d implements e.a {
        public d() {
        }

        @Override // com.sportybet.android.sportypin.e.a
        public final void a() {
            a aVar = TransferPinActivity.C;
            TransferPinActivity transferPinActivity = TransferPinActivity.this;
            transferPinActivity.B.b(transferPinActivity, snb0.OTP);
        }

        @Override // com.sportybet.android.sportypin.e.a
        public final void onDismiss() {
            TransferPinActivity.this.finish();
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
        d dVar = new d();
        e eVar = new e();
        eVar.a = null;
        eVar.b = str;
        eVar.c = cMSString;
        eVar.d = dVar;
        eVar.show(getSupportFragmentManager(), "VerifyDisablePinAlertOTPLimitDialog");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [wrg0] */
    public final void B1() {
        au7 au7Var = this.w;
        j6c j6cVar = j6c.TRANSFER_ENABLE;
        au7Var.x1(j6cVar);
        final yrg0 yrg0Var = this.v;
        final String str = this.f;
        yrg0Var.getClass();
        yrg0Var.y1().d();
        ema emaVarY1 = yrg0Var.y1();
        cu90 cu90VarC = yrg0Var.d.c(j6cVar, new CaptchaData.Phone(str, yrg0Var.f.P()), new Function1() { // from class: vrg0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CaptchaHeader captchaHeader = (CaptchaHeader) obj;
                captchaHeader.getClass();
                return yrg0Var.e.o(str, ACKxwYRsuWyGz.KjqHGNuZLgdovl, "", captchaHeader.getUuid(), captchaHeader.getToken());
            }
        });
        final mn00 mn00Var = new mn00(yrg0Var, 2);
        dw90 dw90VarB = new eu90(cu90VarC, new pya() { // from class: wrg0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                mn00Var.invoke(obj);
            }
        }).b(va0.a());
        xrg0 xrg0Var = new xrg0(yrg0Var);
        dw90VarB.a(xrg0Var);
        emaVarY1.b(xrg0Var);
    }

    public final void C1() {
        a92.b bVar = new a92.b(R.string.component_supporter__cooldown_started, R.string.component_supporter__congratulations_you_will_be_able_to_transfer_to_friend_tip);
        bVar.i = R.drawable.icon_transfer_enabled;
        bVar.k = true;
        bVar.j = true;
        bVar.l = R.dimen.transfer_image_width;
        bVar.m = R.dimen.transfer_image_height;
        bVar.o = R.dimen.transfer_layout_height;
        bVar.n = R.dimen.transfer_layout_width;
        bVar.g = new c();
        a92.j0(bVar).show(getSupportFragmentManager(), "TransferPinAlertDialog");
    }

    public final void D1(String str) {
        if (!this.z.isConnected()) {
            z1(null, null);
            return;
        }
        ProgressDialog progressDialog = new ProgressDialog(this, R.style.BrandProgressDialogTheme);
        this.y = progressDialog;
        progressDialog.setTitle((CharSequence) null);
        this.y.setMessage(getCMSString(R.string.common_functions__sending_code, new Object[0]));
        this.y.setIndeterminate(true);
        this.y.setCancelable(false);
        this.y.setOnCancelListener(null);
        this.y.show();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otp", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        q5s q5sVar = this.i;
        String string = jSONObject.toString();
        su5<BaseResponse<TransferStatusLegacy>> su5Var = q5sVar.B;
        if (su5Var != null) {
            su5Var.cancel();
        }
        su5<BaseResponse<TransferStatusLegacy>> su5VarY = q5sVar.c.Y(string);
        q5sVar.B = su5VarY;
        su5VarY.G(new n5s(q5sVar, q5sVar.v));
    }

    @Override // com.sporty.android.common_ui.widgets.SmsInputView.c
    public final void O(CharSequence charSequence) {
        lop.a(this.b);
        D1(charSequence.toString());
    }

    @Override // com.sporty.android.common_ui.widgets.SmsInputView.c
    public final void W0() {
        if (this.b.getCurrentNumber().length() == 6) {
            lop.a(this.b);
            D1(this.b.getCurrentNumber().toString());
        }
    }

    @Override // com.sporty.android.common_ui.widgets.SmsInputView.c
    public final void b0(CharSequence charSequence) {
        if (this.b.getCurrentNumber().length() < 6) {
            this.b.setBoxFillColor(getResources().getColor(R.color.brand_secondary));
            this.b.invalidate();
            this.e.setVisibility(8);
        }
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
            }
        } else {
            if (!this.z.isConnected()) {
                z1(null, null);
                return;
            }
            this.b.b();
            this.c.b();
            B1();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_verify_transfer_pin);
        this.d = (TextView) findViewById(R.id.tv_remain_time);
        this.e = (TextView) findViewById(R.id.error_tint);
        ImageButton imageButton = (ImageButton) findViewById(R.id.btn_back);
        imageButton.setOnClickListener(this);
        Drawable drawableA = gr0.a(this, R.drawable.ic_action_bar_back);
        if (drawableA != null) {
            drawableA.mutate();
            drawableA.setTint(-1);
        }
        imageButton.setImageDrawable(drawableA);
        SmsInputView smsInputView = (SmsInputView) findViewById(R.id.otp_view);
        this.b = smsInputView;
        smsInputView.setInputListener(this);
        if (this.A.r()) {
            this.b.setCustomInputType(1);
        }
        CountdownButton countdownButton = (CountdownButton) findViewById(R.id.btn_resend);
        this.c = countdownButton;
        countdownButton.setOnClickListener(this);
        if (getAccountHelper().getAccount() != null) {
            this.f = getAccountHelper().getAccount().name;
        } else {
            z1(getCMSString(R.string.common_feedback__sorry_something_went_wrong, new Object[0]), null);
        }
        ((TextView) findViewById(R.id.tv_subtitle)).setText(getCMSString(R.string.common_otp_verify__we_have_sent_you_a_vnum_digit_code_to_vcountrycode_vphone, "6", this.A.P(), this.f));
        int intExtra = getIntent().getIntExtra("REMAIN_NUMBER", 0);
        TextView textView = this.d;
        String strValueOf = String.valueOf(intExtra);
        AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
        textView.setText(getCMSString(R.string.common_otp_verify__you_have_vnum_vtimetext_left_to_request_another_one, strValueOf, intExtra > 1 ? sn5.b(this, R.string.cashout__l_times, new Object[0]) : sn5.b(this, R.string.cashout__l_time, new Object[0])));
        TextView textView2 = (TextView) findViewById(R.id.tv_hint);
        textView2.setText(zch0.j(getCMSString(R.string.common_otp_verify__please_disable_do_not_disturb_to_recevice_your_code_contact_service_tip, new Object[0]), Color.parseColor("#0d9737"), 14, new b()));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setHighlightColor(0);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(yrg0.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.v = (yrg0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(q5s.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.i = (q5s) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        v8i0 viewModelStore3 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory3 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras3 = getDefaultViewModelCreationExtras();
        viewModelStore3.getClass();
        defaultViewModelProviderFactory3.getClass();
        defaultViewModelCreationExtras3.getClass();
        s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, defaultViewModelCreationExtras3);
        dq7 dq7VarA3 = jq40.a(au7.class);
        String strI3 = dq7VarA3.i();
        if (strI3 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.w = (au7) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
        this.v.v.f(this, new lfy() { // from class: rrg0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                jox joxVar = (jox) obj;
                TransferPinActivity.a aVar = TransferPinActivity.C;
                boolean z = joxVar instanceof jox.e;
                TransferPinActivity transferPinActivity = this.a;
                if (z) {
                    transferPinActivity.c.a(0);
                    transferPinActivity.c.b();
                    return;
                }
                if (!(joxVar instanceof jox.a)) {
                    if (joxVar instanceof jox.c) {
                        Throwable th = ((jox.c) joxVar).a;
                        if (th instanceof CaptchaError) {
                            transferPinActivity.z1(((CaptchaError) th).getErrorString(transferPinActivity), null);
                        } else {
                            transferPinActivity.z1(null, null);
                        }
                        transferPinActivity.c.a(0);
                        return;
                    }
                    return;
                }
                BaseResponse baseResponse = (BaseResponse) ((jox.a) joxVar).a;
                int i = baseResponse.bizCode;
                if (i != 10000) {
                    String str = baseResponse.message;
                    if (i != 11709) {
                        transferPinActivity.z1(str, null);
                        transferPinActivity.c.a(0);
                        return;
                    } else {
                        transferPinActivity.A1(1, str);
                        transferPinActivity.c.a(0);
                        return;
                    }
                }
                transferPinActivity.c.a(0);
                transferPinActivity.c.a(60);
                int iA = lal.a((xdp) baseResponse.data, "remainMsgNum", -1);
                if (iA >= 0) {
                    TextView textView3 = transferPinActivity.d;
                    String strValueOf2 = String.valueOf(iA);
                    AccountHelperEntryPointImpl accountHelperEntryPointImpl2 = yrh0.a;
                    textView3.setText(transferPinActivity.getCMSString(R.string.common_otp_verify__you_have_vnum_vtimetext_left_to_request_another_one, strValueOf2, iA > 1 ? sn5.b(transferPinActivity, R.string.cashout__l_times, new Object[0]) : sn5.b(transferPinActivity, R.string.cashout__l_time, new Object[0])));
                }
            }
        });
        this.i.v.f(this, new trg0(this));
        B1();
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        lop.a(this.b);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.app.b$a] */
    /* JADX WARN: Type inference failed for: r4v0, types: [srg0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.DialogInterface$OnClickListener] */
    /* JADX WARN: Type inference failed for: r4v2, types: [qrg0] */
    public final void z1(String str, srg0 srg0Var) {
        if (TextUtils.isEmpty(str)) {
            str = getCMSString(R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]);
        }
        if (srg0Var == 0) {
            srg0Var = new DialogInterface.OnClickListener() { // from class: qrg0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TransferPinActivity.a aVar = TransferPinActivity.C;
                    TransferPinActivity transferPinActivity = this.a;
                    lop.a(transferPinActivity.b);
                    transferPinActivity.finish();
                }
            };
        }
        ?? aVar = new androidx.appcompat.app.b.a(this);
        aVar.a.f = str;
        androidx.appcompat.app.b bVarCreate = aVar.setPositiveButton(R.string.common_functions__ok, srg0Var).create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }
}
