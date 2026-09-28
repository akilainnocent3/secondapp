package com.sportybet.android.sportypin;

import android.accounts.Account;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.CommonButton;
import com.sporty.android.common_ui.widgets.SmsInputView;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sporty.android.core.model.patron.WithdrawalPinVerifyResponse;
import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sporty.android.platform.features.newotp.util.OtpViewModelClasses;
import com.sporty.android.platform.features.newotp.util.a;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import com.sportybet.android.activity.OtpVerifyResultActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.sportybet.android.sportypin.VerifyResetPinActivity;
import com.sportybet.android.sportypin.WithdrawalPinActivity;
import com.sportybet.android.sportypin.b;
import com.sportybet.android.widget.HintView;
import defpackage.ap0;
import defpackage.au7;
import defpackage.bb40;
import defpackage.bcp;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.dq7;
import defpackage.e8m;
import defpackage.ee;
import defpackage.ej5;
import defpackage.en8;
import defpackage.gg4;
import defpackage.gym;
import defpackage.hb5;
import defpackage.hg2;
import defpackage.itf0;
import defpackage.itj0;
import defpackage.iym;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.lop;
import defpackage.o8i0;
import defpackage.psm;
import defpackage.pwx;
import defpackage.q5s;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.sm80;
import defpackage.snb0;
import defpackage.ssw;
import defpackage.stj0;
import defpackage.su5;
import defpackage.sz00;
import defpackage.tm80;
import defpackage.to20;
import defpackage.ttj0;
import defpackage.tz00;
import defpackage.uz00;
import defpackage.v8i0;
import defpackage.vch0;
import defpackage.vz00;
import defpackage.wtj0;
import defpackage.wz00;
import defpackage.xdp;
import defpackage.xtj0;
import defpackage.xz00;

/* JADX INFO: loaded from: classes2.dex */
public class WithdrawalPinActivity extends e8m implements pwx, SmsInputView.c, g.a, f.a, View.OnTouchListener, b.a, to20, bb40 {
    public static int g0;
    public static int h0;
    public static boolean i0;
    public static boolean j0;
    public TextView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public ImageButton E;
    public ProgressDialog F;
    public long G;
    public ConstraintLayout H;
    public TextView I;
    public b J;
    public int K;
    public androidx.appcompat.app.b L;
    public ImageView M;
    public int O;
    public String P;
    public int Q;
    public String R;
    public String S;
    public ConstraintLayout W;
    public FrameLayout X;
    public HintView Y;
    public ConstraintLayout Z;
    public tz00 a0;
    public q5s b0;
    public com.sporty.android.platform.features.newotp.util.a c;
    public xtj0 c0;
    public psm d;
    public au7 d0;
    public d0n e;
    public String e0;
    public iym f;
    public c i;
    public SmsInputView w;
    public TextView y;
    public CommonButton z;
    public boolean b = true;
    public final ee<OtpModule<OtpData.ResetPin>> v = com.sporty.android.platform.features.newotp.agent.b.a(this, new hg2(this, 2));
    public int N = 42;
    public String T = "DISABLED";
    public boolean U = true;
    public boolean V = false;
    public String f0 = "Sporty PIN";

    /* JADX INFO: loaded from: classes6.dex */
    public class a implements e.a {
        public a() {
        }

        @Override // com.sportybet.android.sportypin.e.a
        public final void a() {
            int i = WithdrawalPinActivity.g0;
            WithdrawalPinActivity withdrawalPinActivity = WithdrawalPinActivity.this;
            withdrawalPinActivity.e.b(withdrawalPinActivity, snb0.RESET_PIN);
        }

        @Override // com.sportybet.android.sportypin.e.a
        public final void onDismiss() {
            WithdrawalPinActivity withdrawalPinActivity = WithdrawalPinActivity.this;
            if (withdrawalPinActivity.d.x()) {
                withdrawalPinActivity.finish();
            }
        }
    }

    public final void A1(String str) {
        if (TextUtils.isEmpty(str)) {
            str = getCMSString(R.string.page_withdraw__we_can_only_send_you_a_verification_code_vnum_vhours_tip, "5", "24");
        }
        String cMSString = getCMSString(R.string.common_functions__contact_service, new Object[0]);
        a aVar = new a();
        e eVar = new e();
        eVar.a = null;
        eVar.b = str;
        eVar.c = cMSString;
        eVar.d = aVar;
        eVar.show(getSupportFragmentManager(), "WithdrawPinOTPLimitAlertDialog");
    }

    public final void B1() {
        ProgressDialog progressDialog = this.F;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    public final void C1(int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_CURRENT_STATUS", this.N);
        int intExtra = getIntent().getIntExtra("requestCode", 0);
        intent.putExtra("EXTRA_PIN_CODE", str);
        intent.putExtra("EXTRA_PIN_TOKEN", this.S);
        intent.putExtra("EXTRA_CURRENT_STATUS", this.N);
        intent.putExtra("EXTRA_VERIFY_TOKEN", this.R);
        intent.putExtra("requestCode", intExtra);
        setResult(i, intent);
        finish();
    }

    @Override // com.sportybet.android.sportypin.f.a
    public final void D0() {
        if (!i0) {
            if (j0) {
                finish();
                return;
            }
            return;
        }
        this.W.setVisibility(0);
        this.X.setVisibility(8);
        T1(true);
        this.N = 42;
        this.w.b();
        U1();
        V1(this.N);
    }

    public final void D1() {
        if (this.N == 49) {
            S1(this.U);
        }
        Intent intent = new Intent();
        intent.putExtra("EXTRA_VERIFY_TOKEN", this.R);
        setResult(UserCertConstants.REQUEST_CODE_BVN, intent);
        lop.a(this.w);
        this.W.setVisibility(8);
        this.X.setVisibility(0);
        Bundle bundle = new Bundle();
        bundle.putInt("Status", this.N);
        bundle.putString("token", this.R);
        bundle.putBoolean("isWithdrawing", i0);
        bundle.putBoolean("isUseOtpReset", j0);
        com.sportybet.android.sportypin.a aVar = new com.sportybet.android.sportypin.a();
        aVar.G = this;
        aVar.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.f(R.id.frame, aVar, "ActivationFragment");
        aVar2.k(true, true);
    }

    public final void F1(int i, int i2, String str) {
        Bundle bundle = new Bundle();
        this.W.setVisibility(8);
        this.X.setVisibility(0);
        lop.a(this.w);
        B1();
        bundle.putInt("Status", i);
        bundle.putInt("option", i2);
        bundle.putString("token", str);
        bundle.putBoolean("isUseOtpReset", j0);
        g gVar = new g();
        gVar.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.f(R.id.frame, gVar, "RequirePinFragment");
        aVar.k(true, true);
    }

    public final void G1() {
        this.y.setVisibility(4);
        this.w.setBoxFillColor(getResources().getColor(R.color.brand_secondary));
        this.w.invalidate();
    }

    public final void H1(final en8 en8Var) {
        if (this.F != null) {
            long jAbs = Math.abs(System.currentTimeMillis() - this.G);
            if (jAbs < 1000) {
                this.B.postDelayed(new Runnable() { // from class: etj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = WithdrawalPinActivity.g0;
                        WithdrawalPinActivity withdrawalPinActivity = this.a;
                        if (!withdrawalPinActivity.isFinishing()) {
                            withdrawalPinActivity.F.dismiss();
                        }
                        en8Var.a();
                    }
                }, 1000 - jAbs);
            } else {
                this.F.dismiss();
                en8Var.a();
            }
        }
    }

    public final void I1() {
        if (i0) {
            this.W.setVisibility(0);
            this.X.setVisibility(8);
            T1(true);
            this.N = 42;
            this.w.b();
            U1();
            V1(this.N);
            return;
        }
        if (j0) {
            C1(2300, "");
        } else if (this.d.x()) {
            C1(2300, "");
        } else {
            E1();
        }
    }

    public final void J1() {
        W1();
        if (g0 > 0) {
            this.I.setText(getCMSString(R.string.app_common__fingerprint_try_again, new Object[0]));
            g0--;
        } else {
            h0 = 1003;
            O1(getCMSString(R.string.app_common__fingerprint_approval_failed_content, new Object[0]));
            this.J.f();
            N1(false);
        }
    }

    @Override // com.sportybet.android.sportypin.g.a
    public final void K(int i) {
        this.Q = i;
        L1();
    }

    public final void K1(boolean z) {
        ImageView imageView = this.M;
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    public final void M1(String str) {
        this.y.setText(str);
        this.y.setVisibility(0);
        this.w.setBoxFillColor(getResources().getColor(R.color.brand_primary));
        this.w.invalidate();
    }

    public final void N1(boolean z) {
        SmsInputView smsInputView = this.w;
        if (z) {
            lop.a(smsInputView);
            this.H.setVisibility(0);
            return;
        }
        smsInputView.setDefaultKeyBoardVisible(true);
        lop.d(this.w);
        this.H.setVisibility(8);
        b bVar = this.J;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // com.sporty.android.common_ui.widgets.SmsInputView.c
    public final void O(CharSequence charSequence) {
        U1();
    }

    public final void O1(String str) {
        if (isFinishing()) {
            return;
        }
        androidx.appcompat.app.b bVar = this.L;
        if (bVar != null) {
            bVar.dismiss();
            this.L = null;
        }
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(this);
        aVar.d(R.string.app_common__fingerprint_approval_failed);
        aVar.a.f = str;
        androidx.appcompat.app.b.a positiveButton = aVar.setPositiveButton(R.string.common_functions__ok, new DialogInterface.OnClickListener() { // from class: htj0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = WithdrawalPinActivity.g0;
                WithdrawalPinActivity withdrawalPinActivity = this.a;
                withdrawalPinActivity.u(false);
                withdrawalPinActivity.N1(false);
            }
        });
        positiveButton.a.k = true;
        androidx.appcompat.app.b bVarCreate = positiveButton.create();
        this.L = bVarCreate;
        bVarCreate.setCanceledOnTouchOutside(false);
        this.L.show();
    }

    public final void P1(String str) {
        if (TextUtils.isEmpty(str)) {
            str = getCMSString(R.string.common_feedback__something_went_wrong_please_try_again, new Object[0]);
        }
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(this);
        aVar.a.f = str;
        androidx.appcompat.app.b.a positiveButton = aVar.setPositiveButton(R.string.common_functions__ok, new DialogInterface.OnClickListener() { // from class: dtj0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = WithdrawalPinActivity.g0;
                this.a.C1(2300, "");
            }
        });
        positiveButton.a.k = false;
        androidx.appcompat.app.b bVarCreate = positiveButton.create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    public final void Q1(String str) {
        if (isFinishing()) {
            return;
        }
        if (this.F != null) {
            this.G = System.currentTimeMillis();
            this.F.setMessage(str);
            this.F.show();
            return;
        }
        ProgressDialog progressDialog = new ProgressDialog(this, R.style.BrandProgressDialogTheme);
        this.F = progressDialog;
        progressDialog.setTitle((CharSequence) null);
        this.F.setMessage(str);
        this.F.setIndeterminate(true);
        this.F.setCancelable(false);
        this.F.setOnCancelListener(null);
        this.F.show();
    }

    public final void R1() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        String cMSString = getCMSString(R.string.component_withdraw_pin__too_many_failed_attempt_pin_is_locked_for_1_hour, new Object[0]);
        N1(false);
        androidx.appcompat.app.b.a title = new androidx.appcompat.app.b.a(this).setTitle(getCMSString(R.string.component_withdraw_pin__sporty_pin_locked, new Object[0]));
        title.a.f = cMSString;
        title.c(getCMSString(R.string.common_functions__live_chat, new Object[0]), new DialogInterface.OnClickListener() { // from class: atj0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = WithdrawalPinActivity.g0;
                WithdrawalPinActivity withdrawalPinActivity = this.a;
                withdrawalPinActivity.e.b(withdrawalPinActivity, snb0.RESET_PIN);
            }
        });
        title.b(getCMSString(R.string.common_functions__back, new Object[0]), new DialogInterface.OnClickListener() { // from class: btj0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = WithdrawalPinActivity.g0;
                this.a.C1(UserCertConstants.REQUEST_CODE_CONFIRM_NAME, "");
            }
        });
        title.a.k = false;
        androidx.appcompat.app.b bVarCreate = title.create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    public final void S1(boolean z) {
        this.E.setVisibility(z ? 0 : 8);
    }

    public final void T1(boolean z) {
        HintView hintView = this.Y;
        if (z) {
            hintView.setVisibility(0);
        } else {
            hintView.setVisibility(8);
        }
    }

    @Override // com.sportybet.android.sportypin.f.a
    public final void U(int i, String str) {
        this.N = 50;
        this.Q = i;
        this.R = str;
        F1(50, i, str);
    }

    public final void U1() {
        this.z.setEnabled(this.w.getCurrentNumber().length() == 4);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    public final void V1(int i) {
        String cMSString;
        int i2;
        int i3;
        G1();
        if (i == 0) {
            this.W.setVisibility(0);
            this.X.setVisibility(8);
            cMSString = getCMSString(R.string.component_withdraw_pin__please_enter_a_sporty_pin_it_must_be_exactly_vnum_digits, "4");
            this.w.b();
            U1();
            i2 = R.string.component_withdraw_pin__create_pin;
            i3 = i2;
        } else {
            if (i != 1) {
                i2 = R.string.component_withdraw_pin__enter_sporty_pin;
                if (i == 41) {
                    cMSString = getCMSString(R.string.component_withdraw_pin__please_enter_your_pin_to_continue, new Object[0]);
                    i3 = R.string.common_functions__confirm;
                } else if (i != 42) {
                    if (i == 46) {
                        this.W.setVisibility(0);
                        this.X.setVisibility(8);
                        cMSString = getCMSString(R.string.component_withdraw_pin__please_enter_a_sporty_pin_it_must_be_exactly_vnum_digits, "4");
                        this.w.b();
                        U1();
                        i2 = R.string.component_withdraw_pin__create_pin;
                    } else if (i != 47) {
                        return;
                    }
                    i3 = i2;
                } else {
                    cMSString = getCMSString(R.string.component_withdraw_pin__too_many_failed_attempts_will_lock_payments_for_1_hour, new Object[0]);
                    i3 = R.string.identity_verification__verify;
                }
            }
            cMSString = getCMSString(R.string.component_withdraw_pin__please_confirm_your_pin, new Object[0]);
            this.w.b();
            U1();
            i2 = R.string.component_withdraw_pin__confirm_pin;
            i3 = i2;
        }
        TextView textView = this.A;
        if (i == 42) {
            textView.setText(this.e0);
        } else {
            textView.setText(getCMSString(R.string.wap_profile__sporty_pin, new Object[0]));
        }
        this.B.setText(getCMSString(i2, new Object[0]));
        this.C.setText(cMSString);
        this.z.setText(getCMSString(i3, new Object[0]));
        this.D.setVisibility((i == 0 || i == 1 || i == 46 || i == 47) ? 4 : 0);
    }

    @Override // com.sporty.android.common_ui.widgets.SmsInputView.c
    public final void W0() {
        if (this.w.getCurrentNumber().length() == 4) {
            L1();
        }
    }

    public final void W1() {
        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(200L, -1));
        } else {
            vibrator.vibrate(200L);
        }
    }

    @Override // com.sportybet.android.sportypin.g.a
    public final void Y(int i, String str) {
        this.Q = i;
        this.R = str;
        L1();
    }

    @Override // com.sporty.android.common_ui.widgets.SmsInputView.c
    public final void b0(CharSequence charSequence) {
        if (charSequence.length() < 4) {
            G1();
        }
        U1();
    }

    @Override // com.sportybet.android.sportypin.f.a
    public final void h1(int i, String str) {
        S1(this.U);
        this.R = str;
        this.Q = i;
        this.N = 46;
        V1(46);
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.g("onActivityResult, requestCode=" + i + ", resultCode=" + i2, new Object[0]);
        if (i != 3001) {
            if (i2 != 2100) {
                return;
            }
            C1(2400, "");
            return;
        }
        if (i2 == 4001) {
            this.W.setVisibility(0);
            this.X.setVisibility(8);
            this.Z.setVisibility(0);
            getSupportFragmentManager().a0();
            return;
        }
        if (i2 == 4003) {
            C1(2300, "");
            return;
        }
        if (i2 == 4002) {
            T1(false);
            return;
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("pinToken");
            this.Z.setVisibility(0);
            j0 = true;
            this.R = stringExtra;
            T1(false);
            this.N = 0;
            V1(0);
            if (this.d.r()) {
                Intent intent2 = new Intent(this, (Class<?>) OtpVerifyResultActivity.class);
                intent2.putExtra(AnalyticsParam.EVENT_STATUS, 6);
                intent2.addFlags(65536);
                startActivity(intent2);
                return;
            }
            return;
        }
        if (this.d.x()) {
            if (!i0) {
                C1(2300, "");
                return;
            }
            this.Z.setVisibility(0);
            this.W.setVisibility(0);
            this.X.setVisibility(8);
            T1(false);
            this.N = 42;
            this.w.b();
            U1();
            V1(this.N);
        }
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        if (!this.U) {
            if (this.N != 43) {
                return true;
            }
            C1(2300, "");
            return false;
        }
        ConstraintLayout constraintLayout = this.Z;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        if (this.N != 1) {
            C1(2300, "");
            return false;
        }
        V1(0);
        this.N = 0;
        return true;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String cMSString;
        super.onCreate(bundle);
        setContentView(R.layout.activity_withdraw_pin);
        this.O = getIntent().getIntExtra("REQUEST_CODE", 1100);
        if (this.d.x()) {
            this.Q = getIntent().getIntExtra("option", 61);
        } else if (this.d.n()) {
            this.Q = getIntent().getIntExtra("option", 62);
        }
        i0 = getIntent().getBooleanExtra("isWithdrawing", false);
        int i2 = this.O;
        if (i2 != 1200) {
            i = (i2 == 1300 || i2 == 1400) ? 42 : 0;
        } else {
            i = 41;
        }
        this.N = i;
        this.U = getIntent().getBooleanExtra("EXTRA_SHOW_TITLE_ICON", true);
        String stringExtra = getIntent().getStringExtra("EXTRA_TITLE");
        if (stringExtra == null) {
            cMSString = getCMSString(R.string.my_account__sporty_pin, new Object[0]);
        } else if (stringExtra.equals("Deposit")) {
            cMSString = getCMSString(R.string.common_functions__deposit, new Object[0]);
        } else {
            cMSString = !stringExtra.equals("Withdraw") ? getCMSString(R.string.my_account__sporty_pin, new Object[0]) : getCMSString(R.string.common_functions__withdraw, new Object[0]);
        }
        this.e0 = cMSString;
        this.V = getIntent().getBooleanExtra("EXTRA_VERIFIED_USER", false);
        if (getIntent().getStringExtra("EXTRA_TITLE") == null) {
            this.f0 = "Sporty PIN";
        } else {
            this.f0 = getIntent().getStringExtra("EXTRA_TITLE");
        }
        if (getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            this.J = this.i.a(this, this);
        }
        int i3 = this.O;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ysj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = WithdrawalPinActivity.g0;
                int id = view.getId();
                WithdrawalPinActivity withdrawalPinActivity = this.a;
                if (R.id.btn_continue == id) {
                    withdrawalPinActivity.T1(false);
                    withdrawalPinActivity.L1();
                    return;
                }
                if (R.id.btn_action_bar_close != id) {
                    if (R.id.tv_forgot_pin != id) {
                        if (R.id.enter_pin_btn == id) {
                            WithdrawalPinActivity.h0 = 1002;
                            withdrawalPinActivity.N1(false);
                            return;
                        }
                        return;
                    }
                    if (withdrawalPinActivity.d.r() && !withdrawalPinActivity.d.v()) {
                        if (withdrawalPinActivity.getAccountHelper().getAccount() != null) {
                            withdrawalPinActivity.Q1(withdrawalPinActivity.getCMSString(R.string.common_functions__loading_with_dot, new Object[0]));
                            q5s q5sVar = withdrawalPinActivity.b0;
                            su5<BaseResponse<xdp>> su5Var = q5sVar.z;
                            if (su5Var != null) {
                                su5Var.cancel();
                            }
                            su5<BaseResponse<xdp>> su5VarC1 = q5sVar.b.c1("DELETE_WITHDRAW_PIN");
                            q5sVar.z = su5VarC1;
                            su5VarC1.G(new l5s(q5sVar, q5sVar.f));
                            return;
                        }
                        return;
                    }
                    Account account = withdrawalPinActivity.getAccountHelper().getAccount();
                    String str = account == null ? null : account.name;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    withdrawalPinActivity.d0.x1(j6c.RESET_PIN);
                    withdrawalPinActivity.T1(false);
                    lop.a(withdrawalPinActivity.X);
                    ee<OtpModule<OtpData.ResetPin>> eeVar = withdrawalPinActivity.v;
                    a aVar = withdrawalPinActivity.c;
                    String strP = withdrawalPinActivity.d.P();
                    aVar.getClass();
                    str.getClass();
                    strP.getClass();
                    eeVar.b(new OtpModule(new OtpData.ResetPin(str, strP, 12), new OtpViewModelClasses(ce50.class, ke50.class, re50.class, he50.class, ne50.class, yd50.class)));
                    return;
                }
                if (withdrawalPinActivity.d.x()) {
                    if (withdrawalPinActivity.b && WithdrawalPinActivity.i0) {
                        sh8.c().e(o7d.a(wae.ME));
                        return;
                    } else {
                        withdrawalPinActivity.C1(2300, "");
                        return;
                    }
                }
                boolean zR = withdrawalPinActivity.d.r();
                int i5 = withdrawalPinActivity.N;
                if (!zR) {
                    if (i5 == 46 || i5 == 47 || i5 == 50 || i5 == 49) {
                        withdrawalPinActivity.E1();
                        return;
                    } else {
                        withdrawalPinActivity.C1(2300, "");
                        return;
                    }
                }
                if (i5 == 0 || i5 == 1) {
                    if (withdrawalPinActivity.V) {
                        withdrawalPinActivity.finish();
                        return;
                    } else {
                        sh8.c().e(o7d.a(wae.ME));
                        return;
                    }
                }
                if (!WithdrawalPinActivity.i0 || (i5 != 40 && i5 != 45)) {
                    if (withdrawalPinActivity.V) {
                        withdrawalPinActivity.getOnBackPressedDispatcher().d();
                        return;
                    } else {
                        withdrawalPinActivity.C1(2300, "");
                        return;
                    }
                }
                withdrawalPinActivity.W.setVisibility(0);
                withdrawalPinActivity.X.setVisibility(8);
                withdrawalPinActivity.T1(true);
                withdrawalPinActivity.N = 42;
                withdrawalPinActivity.w.b();
                withdrawalPinActivity.U1();
                withdrawalPinActivity.V1(withdrawalPinActivity.N);
            }
        };
        TextView textView = (TextView) findViewById(R.id.tv_action_bar_title);
        this.A = textView;
        textView.setText(getCMSString(R.string.wap_profile__sporty_pin, new Object[0]));
        this.B = (TextView) findViewById(R.id.tv_title);
        this.C = (TextView) findViewById(R.id.tv_description);
        this.y = (TextView) findViewById(R.id.tv_error_msg);
        SmsInputView smsInputView = (SmsInputView) findViewById(R.id.view_pin_code);
        this.w = smsInputView;
        smsInputView.setInputListener(this);
        this.w.setOnTouchListener(this);
        if (i3 != 1100) {
            this.w.K = true;
        }
        CommonButton commonButton = (CommonButton) findViewById(R.id.btn_continue);
        this.z = commonButton;
        commonButton.setOnClickListener(onClickListener);
        this.z.setEnabled(false);
        TextView textView2 = (TextView) findViewById(R.id.tv_forgot_pin);
        this.D = textView2;
        textView2.setOnClickListener(onClickListener);
        ImageButton imageButton = (ImageButton) findViewById(R.id.btn_action_bar_close);
        this.E = imageButton;
        imageButton.setOnClickListener(onClickListener);
        this.W = (ConstraintLayout) findViewById(R.id.main_frame);
        this.X = (FrameLayout) findViewById(R.id.frame);
        this.Y = (HintView) findViewById(R.id.hint_view);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.fingerprint_container);
        this.H = constraintLayout;
        constraintLayout.setOnClickListener(onClickListener);
        this.I = (TextView) findViewById(R.id.finger_title);
        ((CommonButton) findViewById(R.id.enter_pin_btn)).setOnClickListener(onClickListener);
        this.Z = (ConstraintLayout) findViewById(R.id.layout_action_bar);
        this.M = (ImageView) findViewById(R.id.grey_background);
        if (i3 == 1300 || i3 == 1400) {
            this.A.setText(this.e0);
        }
        findViewById(R.id.home).setOnClickListener(new itj0());
        findViewById(R.id.home).setVisibility(8);
        S1(this.U);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(au7.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.d0 = (au7) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(tz00.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.a0 = (tz00) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        v8i0 viewModelStore3 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory3 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras3 = getDefaultViewModelCreationExtras();
        viewModelStore3.getClass();
        defaultViewModelProviderFactory3.getClass();
        defaultViewModelCreationExtras3.getClass();
        s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, defaultViewModelCreationExtras3);
        dq7 dq7VarA3 = jq40.a(xtj0.class);
        String strI3 = dq7VarA3.i();
        if (strI3 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.c0 = (xtj0) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
        this.a0.a.f(this, new lfy() { // from class: jtj0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                final int i4;
                final String str;
                final BaseResponse baseResponse = (BaseResponse) obj;
                int i5 = WithdrawalPinActivity.g0;
                if (baseResponse == null) {
                    i4 = 30000;
                    str = null;
                } else {
                    i4 = baseResponse.bizCode;
                    str = baseResponse.message;
                }
                final WithdrawalPinActivity withdrawalPinActivity = this.a;
                withdrawalPinActivity.H1(new en8() { // from class: ftj0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.en8
                    public final void a() {
                        int i6 = WithdrawalPinActivity.g0;
                        WithdrawalPinActivity withdrawalPinActivity2 = withdrawalPinActivity;
                        int i7 = i4;
                        String str2 = str;
                        if (i7 != 10000) {
                            if (i7 == 20011) {
                                withdrawalPinActivity2.R1();
                                return;
                            } else if (i7 != 20012) {
                                withdrawalPinActivity2.P1(str2);
                                return;
                            } else {
                                withdrawalPinActivity2.M1(withdrawalPinActivity2.getString(R.string.component_withdraw_pin__incorrect_pin_please_try_again));
                                return;
                            }
                        }
                        T t = baseResponse.data;
                        if (t == 0) {
                            withdrawalPinActivity2.P1(str2);
                            return;
                        }
                        withdrawalPinActivity2.R = lal.b((xdp) t, "pinToken");
                        withdrawalPinActivity2.b = false;
                        withdrawalPinActivity2.D1();
                    }
                });
            }
        });
        this.a0.d.f(this, new lfy() { // from class: ktj0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i4;
                String str;
                BaseResponse baseResponse = (BaseResponse) obj;
                int i5 = WithdrawalPinActivity.g0;
                if (baseResponse == null) {
                    i4 = 30000;
                    str = null;
                } else {
                    i4 = baseResponse.bizCode;
                    str = baseResponse.message;
                }
                WithdrawalPinActivity withdrawalPinActivity = this.a;
                withdrawalPinActivity.H1(new qtj0(withdrawalPinActivity, i4, baseResponse, str));
            }
        });
        this.a0.e.f(this, new stj0(this));
        this.a0.b.f(this, new lfy() { // from class: ltj0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                WithdrawalPinStatusInfo withdrawalPinStatusInfo = (WithdrawalPinStatusInfo) obj;
                int i4 = WithdrawalPinActivity.g0;
                if (withdrawalPinStatusInfo == null) {
                    return;
                }
                String status = withdrawalPinStatusInfo.getStatus();
                WithdrawalPinActivity withdrawalPinActivity = this.a;
                withdrawalPinActivity.T = status;
                withdrawalPinActivity.K = withdrawalPinStatusInfo.getFingerprintStatus();
                if (TextUtils.equals(withdrawalPinStatusInfo.getStatus(), SportyPinStatus.Blocked.getValue())) {
                    withdrawalPinActivity.R1();
                    return;
                }
                if (TextUtils.equals(withdrawalPinStatusInfo.getStatus(), SportyPinStatus.Enabled.getValue())) {
                    withdrawalPinActivity.b = false;
                }
                b bVar = withdrawalPinActivity.J;
                if (bVar != null && bVar.d() && withdrawalPinActivity.J.b() && withdrawalPinActivity.K == 1 && WithdrawalPinActivity.h0 == 1000) {
                    if ((WithdrawalPinActivity.i0 || withdrawalPinActivity.V) && withdrawalPinActivity.N == 42 && withdrawalPinActivity.J != null) {
                        withdrawalPinActivity.N1(true);
                        withdrawalPinActivity.J.e();
                    }
                }
            }
        });
        this.a0.c.f(this, new lfy() { // from class: mtj0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                final WithdrawalPinVerifyResponse withdrawalPinVerifyResponse = (WithdrawalPinVerifyResponse) obj;
                int i4 = WithdrawalPinActivity.g0;
                final WithdrawalPinActivity withdrawalPinActivity = this.a;
                if (withdrawalPinVerifyResponse == null || TextUtils.isEmpty(withdrawalPinVerifyResponse.result)) {
                    withdrawalPinActivity.P1(withdrawalPinActivity.getCMSString(R.string.common_feedback__sorry_something_went_wrong, new Object[0]));
                } else {
                    withdrawalPinActivity.H1(new en8() { // from class: ctj0
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // defpackage.en8
                        public final void a() {
                            int i5 = WithdrawalPinActivity.g0;
                            WithdrawalPinVerifyResponse withdrawalPinVerifyResponse2 = withdrawalPinVerifyResponse;
                            String str = withdrawalPinVerifyResponse2.result;
                            str.getClass();
                            byte b = -1;
                            switch (str.hashCode()) {
                                case -100452904:
                                    if (str.equals("UNMATCHED_BLOCKED")) {
                                        b = 0;
                                    }
                                    break;
                                case 696544716:
                                    if (str.equals("BLOCKED")) {
                                        b = 1;
                                    }
                                    break;
                                case 1044290635:
                                    if (str.equals("UNMATCHED")) {
                                        b = 2;
                                    }
                                    break;
                                case 1053567612:
                                    if (str.equals("DISABLED")) {
                                        b = 3;
                                    }
                                    break;
                                case 1558844676:
                                    if (str.equals("MATCHED")) {
                                        b = 4;
                                    }
                                    break;
                            }
                            WithdrawalPinActivity withdrawalPinActivity2 = withdrawalPinActivity;
                            switch (b) {
                                case 0:
                                case 1:
                                    withdrawalPinActivity2.R1();
                                    withdrawalPinActivity2.z.setEnabled(false);
                                    break;
                                case 2:
                                    withdrawalPinActivity2.M1(withdrawalPinActivity2.getString(R.string.component_withdraw_pin__incorrect_pin_please_try_again));
                                    withdrawalPinActivity2.z.setEnabled(false);
                                    break;
                                case 3:
                                    withdrawalPinActivity2.P1(withdrawalPinActivity2.getCMSString(R.string.common_feedback__sorry_something_went_wrong, new Object[0]));
                                    withdrawalPinActivity2.z.setEnabled(false);
                                    break;
                                case 4:
                                    withdrawalPinActivity2.R = withdrawalPinVerifyResponse2.pinToken;
                                    int i6 = withdrawalPinActivity2.N;
                                    if (i6 == 42) {
                                        withdrawalPinActivity2.C1(UserCertConstants.REQUEST_CODE_BVN, withdrawalPinActivity2.w.getCurrentNumber().toString());
                                    } else if (i6 == 44) {
                                        lop.a(withdrawalPinActivity2.X);
                                        if (!withdrawalPinActivity2.d.x()) {
                                            withdrawalPinActivity2.E1();
                                        } else {
                                            withdrawalPinActivity2.h1(61, withdrawalPinActivity2.R);
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        });
        this.a0.f.f(this, new lfy() { // from class: ntj0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                UiText uiText = (UiText) obj;
                int i4 = WithdrawalPinActivity.g0;
                WithdrawalPinActivity withdrawalPinActivity = this.a;
                if (withdrawalPinActivity.isFinishing() || uiText == null) {
                    return;
                }
                String string = uiText.e(withdrawalPinActivity).toString();
                if (TextUtils.isEmpty(string) || withdrawalPinActivity.N != 42) {
                    return;
                }
                Fragment fragmentH = withdrawalPinActivity.getSupportFragmentManager().H("SelectPinOtpWayFragment");
                if (fragmentH == null || !fragmentH.isVisible()) {
                    withdrawalPinActivity.T1(true);
                    withdrawalPinActivity.Y.setHint(string);
                }
            }
        });
        this.a0.v.f(this, new lfy() { // from class: otj0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                int i4 = WithdrawalPinActivity.g0;
                if (baseResponse == null) {
                    return;
                }
                int i5 = baseResponse.bizCode;
                String str = baseResponse.message;
                WithdrawalPinActivity withdrawalPinActivity = this.a;
                if (i5 != 10000) {
                    withdrawalPinActivity.B1();
                    withdrawalPinActivity.P1(str);
                    return;
                }
                T t = baseResponse.data;
                if (t == 0) {
                    withdrawalPinActivity.B1();
                    withdrawalPinActivity.P1(str);
                    return;
                }
                String strB = lal.b((xdp) t, "token");
                Intent intent = new Intent();
                intent.putExtra("EXTRA_CURRENT_STATUS", withdrawalPinActivity.N);
                int intExtra = withdrawalPinActivity.getIntent().getIntExtra("requestCode", 0);
                intent.putExtra("EXTRA_FINGERPRINT_TOKEN", strB);
                intent.putExtra("requestCode", intExtra);
                withdrawalPinActivity.setResult(UserCertConstants.REQUEST_CODE_BVN, intent);
                withdrawalPinActivity.finish();
            }
        });
        v8i0 viewModelStore4 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory4 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras4 = getDefaultViewModelCreationExtras();
        viewModelStore4.getClass();
        defaultViewModelProviderFactory4.getClass();
        defaultViewModelCreationExtras4.getClass();
        s8i0 s8i0Var4 = new s8i0(viewModelStore4, defaultViewModelProviderFactory4, defaultViewModelCreationExtras4);
        dq7 dq7VarA4 = jq40.a(q5s.class);
        String strI4 = dq7VarA4.i();
        if (strI4 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        q5s q5sVar = (q5s) s8i0Var4.a(dq7VarA4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI4));
        this.b0 = q5sVar;
        q5sVar.f.f(this, new ttj0(this));
        this.c0.y.f(this, new lfy() { // from class: ptj0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                bi50 bi50Var = (bi50) obj;
                int i4 = WithdrawalPinActivity.g0;
                WithdrawalPinActivity withdrawalPinActivity = this.a;
                withdrawalPinActivity.B1();
                if (withdrawalPinActivity.isFinishing()) {
                    return;
                }
                if (bi50Var == null) {
                    withdrawalPinActivity.z1(null);
                    return;
                }
                BaseResponse baseResponse = (BaseResponse) bi50Var.b;
                if (!bi50Var.a.getIsSuccessful() || baseResponse == null) {
                    withdrawalPinActivity.z1(null);
                    return;
                }
                int i5 = baseResponse.bizCode;
                if (i5 != 10000) {
                    if (i5 == 11708 || i5 == 11709) {
                        withdrawalPinActivity.A1(baseResponse.message);
                        return;
                    } else {
                        withdrawalPinActivity.z1(baseResponse.message);
                        return;
                    }
                }
                int iA = lal.a((xdp) baseResponse.data, "remainMsgNum", -1);
                String strB = lal.b((xdp) baseResponse.data, "token");
                if (withdrawalPinActivity.d.r()) {
                    Intent intent = new Intent(withdrawalPinActivity, (Class<?>) VerifyResetPinActivity.class);
                    intent.putExtra("REQUEST_CODE", 3001);
                    intent.putExtra("REMAIN_NUMBER", iA);
                    intent.putExtra("OTP_TYPE", 2);
                    intent.putExtra("verifyCodeSource", "EMAIL");
                    intent.putExtra("REVERSE_PIN_TOKEN", strB);
                    withdrawalPinActivity.startActivityForResult(intent, 3001);
                    return;
                }
                if (withdrawalPinActivity.getAccountHelper().getAccount() == null || withdrawalPinActivity.getAccountHelper().getAccount().name == null) {
                    withdrawalPinActivity.z1(null);
                    return;
                }
                String str = withdrawalPinActivity.getAccountHelper().getAccount().name;
                Intent intent2 = new Intent(withdrawalPinActivity, (Class<?>) VerifyResetPinActivity.class);
                intent2.putExtra("REQUEST_CODE", 3001);
                intent2.putExtra("REMAIN_NUMBER", iA);
                intent2.putExtra("MOBILE", str);
                intent2.putExtra("OTP_TYPE", 0);
                intent2.putExtra("REVERSE_PIN_TOKEN", strB);
                intent2.putExtra("verifyCodeSource", jbkEboCkTqmGf.eyhFKbZegze);
                withdrawalPinActivity.startActivityForResult(intent2, 3001);
            }
        });
        this.c0.A.f(this, new lfy() { // from class: zsj0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                final myf myfVar = (myf) obj;
                int i4 = WithdrawalPinActivity.g0;
                UiText uiText = myfVar.c;
                uiText.getClass();
                final WithdrawalPinActivity withdrawalPinActivity = this.a;
                final String string = uiText.e(withdrawalPinActivity).toString();
                withdrawalPinActivity.H1(new en8() { // from class: gtj0
                    @Override // defpackage.en8
                    public final void a() {
                        int i5 = WithdrawalPinActivity.g0;
                        String str = string;
                        boolean zIsEmpty = TextUtils.isEmpty(str);
                        WithdrawalPinActivity withdrawalPinActivity2 = withdrawalPinActivity;
                        if (!zIsEmpty) {
                            withdrawalPinActivity2.M1(str);
                            withdrawalPinActivity2.z.setEnabled(false);
                            return;
                        }
                        withdrawalPinActivity2.G1();
                        Intent intent = new Intent();
                        intent.putExtra("email_change_pin_check_result", myfVar.a);
                        withdrawalPinActivity2.setResult(-1, intent);
                        withdrawalPinActivity2.finish();
                    }
                });
            }
        });
        V1(this.N);
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        ProgressDialog progressDialog = this.F;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.F.dismiss();
        }
        androidx.appcompat.app.b bVar = this.L;
        if (bVar != null && bVar.isShowing()) {
            this.L.dismiss();
        }
        j0 = false;
        i0 = false;
        b bVar2 = this.J;
        if (bVar2 != null) {
            bVar2.f();
            this.J = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        lop.a(this.w);
        b bVar = this.J;
        if (bVar != null) {
            bVar.f();
        }
        super.onPause();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        su5<BaseResponse<Object>> su5VarC;
        lop.a(this.w);
        tz00 tz00Var = this.a0;
        tz00Var.z.y1().G(new vz00(tz00Var));
        tz00 tz00Var2 = this.a0;
        psm psmVar = tz00Var2.y;
        if (psmVar.r()) {
            ssw<UiText> sswVar = tz00Var2.f;
            StringUiText stringUiText = vch0.a;
            sswVar.m(new ResourceUiText(R.string.component_withdraw_pin__please_never_reveal_your_sporty_pin_to_anyone_tip));
        } else {
            bcp bcpVar = new bcp();
            xdp xdpVar = new xdp();
            xdpVar.i("appId", "common");
            xdpVar.i("namespace", "application");
            xdpVar.i("configKey", "withdraw.info.tips.text.app");
            bcpVar.h(xdpVar);
            su5<BaseResponse<Object>> su5Var = tz00Var2.w;
            if (su5Var != null) {
                su5Var.cancel();
            }
            if (psmVar.r()) {
                su5VarC = ap0.c().b(bcpVar.toString());
                tz00Var2.w = su5VarC;
            } else {
                su5VarC = ap0.c().c(bcpVar.toString());
                tz00Var2.w = su5VarC;
            }
            su5VarC.G(new wz00(tz00Var2));
        }
        super.onResume();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.getId() != R.id.view_pin_code || this.w.getCurrentNumber().length() != 4 || this.y.getVisibility() != 0) {
            return false;
        }
        this.w.b();
        this.y.setVisibility(8);
        U1();
        return false;
    }

    @Override // com.sportybet.android.sportypin.f.a
    public final void u(boolean z) {
        tz00 tz00Var = this.a0;
        tz00Var.z.Q(z ? 1 : 0).G(new xz00(tz00Var));
    }

    public final void z1(String str) {
        if (TextUtils.isEmpty(str)) {
            str = getCMSString(R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]);
        }
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(this);
        aVar.a.f = str;
        androidx.appcompat.app.b bVarCreate = aVar.setPositiveButton(R.string.common_functions__ok, null).create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    public final void E1() {
        S1(this.U);
        this.W.setVisibility(8);
        this.X.setVisibility(0);
        this.N = 45;
        Bundle bundle = new Bundle();
        bundle.putInt("option", this.Q);
        bundle.putString("token", this.R);
        bundle.putBoolean("isWithdrawing", i0);
        bundle.putBoolean(yFmFZvuWxAYfEj.OxGYjbL, this.K != 0);
        bundle.putBoolean("isShowCloseIcon", this.U);
        f fVar = new f();
        fVar.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.f(R.id.frame, fVar, "PinSettingFragment");
        aVar.k(true, true);
    }

    public final void L1() {
        int i = this.N;
        int i2 = 1;
        if ((i == 1 || i == 47) && !TextUtils.equals(this.P, this.w.getCurrentNumber())) {
            M1(getString(R.string.component_withdraw_pin__incorrect_pin_please_try_again));
            return;
        }
        int i3 = this.N;
        if (i3 == 0) {
            gym.a(this.f, new tm80());
        } else if (i3 == 1) {
            gym.a(this.f, new sm80());
        }
        int i4 = this.N;
        if (i4 == 0 || i4 == 46) {
            this.P = this.w.getCurrentNumber().toString();
        }
        if (i4 != 0) {
            if (i4 == 1) {
                i2 = 40;
            } else if (i4 == 40) {
                i2 = 43;
            } else if (i4 == 41 || i4 == 45) {
                i2 = 44;
            } else if (i4 == 46) {
                i2 = 47;
            } else {
                i2 = ((i4 != 47 || j0) && !(this.d.r() && i4 == 47 && j0)) ? i4 : 49;
            }
        }
        V1(i2);
        this.N = i2;
        if (i2 < 40 || i2 == 47 || i2 == 46) {
            return;
        }
        Q1(getCMSString(R.string.common_functions__sending_code, new Object[0]));
        if (i2 == 40) {
            if (!this.d.x() && !this.d.r()) {
                F1(40, this.Q, this.R);
                return;
            }
            if ((i0 || j0) && TextUtils.equals(this.T, SportyPinStatus.Enabled.getValue())) {
                this.a0.x1(61, this.R, this.w.getCurrentNumber().toString());
                return;
            }
            tz00 tz00Var = this.a0;
            String string = this.w.getCurrentNumber().toString();
            tz00Var.getClass();
            tz00Var.z.f(Base64.encodeToString(string.getBytes(), 2), 61).G(new gg4(tz00Var));
            return;
        }
        if (i2 == 49) {
            this.a0.x1(this.Q, this.R, this.w.getCurrentNumber().toString());
            return;
        }
        if (i2 == 50) {
            tz00 tz00Var2 = this.a0;
            tz00Var2.z.H1(this.R, this.Q).G(new uz00(tz00Var2));
            return;
        }
        switch (i2) {
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (!this.f0.equals(siPCzPFw.wbMwQ)) {
                    tz00 tz00Var3 = this.a0;
                    String string2 = this.w.getCurrentNumber().toString();
                    tz00Var3.getClass();
                    tz00Var3.z.O(Base64.encodeToString(string2.getBytes(), 2)).G(new sz00(tz00Var3));
                } else {
                    xtj0 xtj0Var = this.c0;
                    String string3 = this.w.getCurrentNumber().toString();
                    xtj0Var.getClass();
                    string3.getClass();
                    ej5.c(o8i0.d(xtj0Var), null, null, new wtj0(xtj0Var, string3, null), 3);
                }
                break;
            case 43:
                if ((i0 || j0) && TextUtils.equals(this.T, SportyPinStatus.Enabled.getValue())) {
                    this.a0.x1(this.Q, this.R, this.w.getCurrentNumber().toString());
                } else {
                    tz00 tz00Var4 = this.a0;
                    String string4 = this.w.getCurrentNumber().toString();
                    int i5 = this.Q;
                    tz00Var4.getClass();
                    tz00Var4.z.f(Base64.encodeToString(string4.getBytes(), 2), i5).G(new gg4(tz00Var4));
                }
                break;
        }
    }
}
