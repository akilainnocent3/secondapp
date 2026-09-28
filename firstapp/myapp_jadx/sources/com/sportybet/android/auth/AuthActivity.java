package com.sportybet.android.auth;

import android.R;
import android.os.Bundle;
import androidx.appcompat.app.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import defpackage.au7;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.ej5;
import defpackage.fc50;
import defpackage.fi80;
import defpackage.fv40;
import defpackage.h7n;
import defpackage.hay;
import defpackage.hb5;
import defpackage.i7n;
import defpackage.j6c;
import defpackage.jdt;
import defpackage.jq40;
import defpackage.lop;
import defpackage.m12;
import defpackage.n41;
import defpackage.num;
import defpackage.o41;
import defpackage.odd;
import defpackage.oke;
import defpackage.p41;
import defpackage.psm;
import defpackage.q5s;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.s9;
import defpackage.sx20;
import defpackage.to20;
import defpackage.v8i0;
import defpackage.v8k0;
import defpackage.vqx;
import defpackage.whs;
import defpackage.xgu;
import defpackage.y8j;
import defpackage.ybj;
import defpackage.z8g;
import defpackage.za;
import defpackage.zu7;
import defpackage.zux;
import defpackage.zuz;
import defpackage.zyf0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AuthActivity extends Hilt_AuthActivity implements zux, to20, bb40 {
    public static final String KEY_IS_CHANGE_PASSWORD = "KEY_IS_CHANGE_PASSWORD";
    public static final String KEY_IS_FORGET_PASSWORD = "KEY_IS_FORGET_PASSWORD";
    public static final String KEY_IS_IDENTITY_VERIFY = "KEY_IS_IDENTITY_VERIFY";
    public static final String KEY_IS_SIGN_UP = "KEY_IS_SIGN_UP";
    public AuthViewModel authViewModel;
    private au7 cloudflareViewModel;
    public psm countryManager;
    y8j fullStoryCommonManager;
    private i7n identityVerifyViewModel;
    public q5s legacyOtpViewModel;
    public num localEvents;
    public com.sporty.android.platform.features.newotp.util.a otpModuleFactory;
    zuz passwordEntryNavigator;
    fi80 setPasswordV2Manager;

    /* JADX INFO: renamed from: com.sportybet.android.auth.AuthActivity$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$sporty$android$core$model$service$CountryCodeName;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            $SwitchMap$com$sporty$android$core$model$service$CountryCodeName = iArr;
            try {
                iArr[CountryCodeName.CAMEROON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$sporty$android$core$model$service$CountryCodeName[CountryCodeName.GHANA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$sporty$android$core$model$service$CountryCodeName[CountryCodeName.SOUTH_AFRICA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$sporty$android$core$model$service$CountryCodeName[CountryCodeName.MOZAMBIQUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void addFragment(Fragment fragment) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
        aVarA.e(R.id.content, fragment, null, 1);
        aVarA.d();
    }

    private void goResetPassword(String str, String str2) {
        String stringExtra = getIntent().getStringExtra("triggered_event");
        m12.w = true;
        getSupportFragmentManager().a0();
        m12.w = false;
        if (this.setPasswordV2Manager.a()) {
            this.passwordEntryNavigator.a(getSupportFragmentManager(), str != null ? str : "", str2 != null ? str2 : "", false, true, stringExtra != null ? stringExtra : "");
            return;
        }
        fc50 fc50Var = new fc50();
        Bundle bundleA = whs.a("mobile", str, "token", str2);
        bundleA.putString("triggered_event", stringExtra);
        fc50Var.setArguments(bundleA);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.h(com.sportybet.android.gp.tz.R.anim.slide_in_right, com.sportybet.android.gp.tz.R.anim.slide_out_left, com.sportybet.android.gp.tz.R.anim.slide_in_left, com.sportybet.android.gp.tz.R.anim.slide_out_right);
        aVar.f(R.id.content, fc50Var, null);
        aVar.c(null);
        aVar.k(true, true);
    }

    private void handleOnRegister(OtpData.Register register) {
        OTPResult<OTPCompleteResult> oTPResult = register.d;
        if (oTPResult instanceof OTPResult.Success) {
            sx20 sx20VarF = this.accRegistrationHelper.f(this, (OTPCompleteResult) ((OTPResult.Success) oTPResult).a, register.a);
            this.authViewModel.getRegSuccessDesc();
            if (!(sx20VarF instanceof sx20.b)) {
                showDialog(this, getString(com.sportybet.android.gp.tz.R.string.common_feedback__something_went_wrong_tip), new n41());
                return;
            } else {
                if (((sx20.b) sx20VarF).a) {
                    finish();
                    return;
                }
                return;
            }
        }
        if (oTPResult instanceof OTPResult.Failed) {
            getSupportFragmentManager().Z(1, "NewOtpSelectorFragment");
            UiText uiTextD1 = ((OTPResult.Failed) oTPResult).getB();
            uiTextD1.getClass();
            b bVarShowDialog = showDialog(this, uiTextD1.e(this).toString(), new o41());
            OTPResult<OTPCompleteResult> oTPResult2 = register.d;
            if ((oTPResult2 instanceof OTPResult.Failed.APIError) && register.c == j6c.REGISTER && ((OTPResult.Failed.APIError) oTPResult2).a == 19411) {
                this.fullStoryCommonManager.e(bVarShowDialog.getWindow().getDecorView(), "otp__limit_popup");
            }
        }
    }

    private void handleOnResetPassword(OtpData.RestPassword restPassword) {
        OTPResult<OTPGeneralResult> oTPResult = restPassword.d;
        if (oTPResult instanceof OTPResult.Success) {
            goResetPassword(restPassword.a, ((OTPGeneralResult) ((OTPResult.Success) oTPResult).a).getToken());
            return;
        }
        if (oTPResult instanceof OTPResult.Failed) {
            getSupportFragmentManager().Z(1, "NewOtpSelectorFragment");
            UiText uiTextD1 = ((OTPResult.Failed) oTPResult).getB();
            uiTextD1.getClass();
            showDialog(this, uiTextD1.e(this).toString(), new p41());
            return;
        }
        if ((oTPResult instanceof OTPResult.NoResult) && getIntent().getBooleanExtra(KEY_IS_IDENTITY_VERIFY, false)) {
            finish();
        }
    }

    private void launchResetPasswordOTP() {
        String stringExtra = getIntent().getStringExtra("mobile");
        if (stringExtra == null) {
            zyf0.b(com.sportybet.android.gp.tz.R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you, 0);
            return;
        }
        com.sporty.android.platform.features.newotp.util.a aVar = this.otpModuleFactory;
        String strP = this.countryManager.P();
        aVar.getClass();
        OtpModule otpModuleD = com.sporty.android.platform.features.newotp.util.a.d(stringExtra, strP);
        vqx vqxVar = new vqx();
        Bundle bundle = new Bundle();
        bundle.putParcelable("key - module", otpModuleD);
        vqxVar.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.h(com.sportybet.android.gp.tz.R.anim.slide_in_right, com.sportybet.android.gp.tz.R.anim.slide_out_left, com.sportybet.android.gp.tz.R.anim.slide_in_left, com.sportybet.android.gp.tz.R.anim.slide_out_right);
        String str = vqxVar.A;
        aVar2.f(R.id.content, vqxVar, str);
        aVar2.c(str);
        aVar2.k(true, true);
    }

    @Override // com.sportybet.android.auth.BaseAccountAuthenticatorActivity, android.app.Activity
    public void finish() {
        if (getIntent().getBooleanExtra(KEY_IS_IDENTITY_VERIFY, false)) {
            i7n i7nVar = this.identityVerifyViewModel;
            if (!i7nVar.b) {
                odd oddVar = zu7.f;
                ej5.c(zu7.b(oddVar), null, null, new h7n(i7nVar, null), 3);
            }
        }
        super.finish();
        overridePendingTransition(com.sportybet.android.gp.tz.R.anim.hold, com.sportybet.android.gp.tz.R.anim.slide_out_bottom);
    }

    @Override // defpackage.r1k
    public boolean onBackPressedCompat() {
        this.localEvents.a(new jdt(jdt.a.a));
        return false;
    }

    @Override // com.sportybet.android.auth.BaseAccountAuthenticatorActivity, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public void onCreate(Bundle bundle) {
        Fragment ybjVar;
        try {
            super.onCreate(bundle);
        } catch (Exception unused) {
        }
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
        this.cloudflareViewModel = (au7) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
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
        this.legacyOtpViewModel = (q5s) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        v8i0 viewModelStore3 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory3 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras3 = getDefaultViewModelCreationExtras();
        viewModelStore3.getClass();
        defaultViewModelProviderFactory3.getClass();
        defaultViewModelCreationExtras3.getClass();
        s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, defaultViewModelCreationExtras3);
        dq7 dq7VarA3 = jq40.a(i7n.class);
        String strI3 = dq7VarA3.i();
        if (strI3 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.identityVerifyViewModel = (i7n) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
        v8i0 viewModelStore4 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory4 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras4 = getDefaultViewModelCreationExtras();
        viewModelStore4.getClass();
        defaultViewModelProviderFactory4.getClass();
        defaultViewModelCreationExtras4.getClass();
        s8i0 s8i0Var4 = new s8i0(viewModelStore4, defaultViewModelProviderFactory4, defaultViewModelCreationExtras4);
        dq7 dq7VarA4 = jq40.a(AuthViewModel.class);
        String strI4 = dq7VarA4.i();
        if (strI4 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.authViewModel = (AuthViewModel) s8i0Var4.a(dq7VarA4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI4));
        if (bundle == null) {
            if (getIntent().getBooleanExtra(KEY_IS_CHANGE_PASSWORD, false)) {
                this.cloudflareViewModel.x1(j6c.RESET_PASSWORD);
                addFragment(new z8g());
            } else if (getIntent().getBooleanExtra(KEY_IS_IDENTITY_VERIFY, false)) {
                launchResetPasswordOTP();
            } else if (getIntent().getBooleanExtra(KEY_IS_SIGN_UP, false)) {
                this.cloudflareViewModel.x1(j6c.REGISTER);
                int i = AnonymousClass1.$SwitchMap$com$sporty$android$core$model$service$CountryCodeName[this.countryManager.getCountryCode().ordinal()];
                if (i == 1) {
                    RegisterRevampConfig.Revamp revamp = new RegisterRevampConfig.Revamp(fv40.b);
                    za zaVar = new za();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("key_register_revamp_config", revamp);
                    zaVar.setArguments(bundle2);
                    ybjVar = zaVar;
                } else if (i == 2) {
                    ybjVar = new ybj();
                } else if (i != 3) {
                    ybjVar = i != 4 ? new za() : new xgu();
                } else {
                    ybjVar = new v8k0();
                }
                addFragment(ybjVar);
            } else if (getIntent().getStringExtra("mobile") == null || getIntent().getStringExtra("token") == null) {
                s9 s9Var = new s9();
                Bundle bundle3 = new Bundle();
                bundle3.putString("mobile", getAccountHelper().getLastAccount());
                s9Var.setArguments(bundle3);
                addFragment(s9Var);
            } else {
                goResetPassword(getIntent().getStringExtra("mobile"), getIntent().getStringExtra("token"));
            }
        }
        getSupportFragmentManager().n0("key - otp result", this, new hay(new Function1() { // from class: q41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.onOTPResult((OtpData) obj);
            }
        }));
    }

    public Unit onOTPResult(OtpData otpData) {
        if (otpData instanceof OtpData.Register) {
            handleOnRegister((OtpData.Register) otpData);
        } else if (otpData instanceof OtpData.RestPassword) {
            handleOnResetPassword((OtpData.RestPassword) otpData);
        }
        return Unit.a;
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public void onPause() {
        super.onPause();
        lop.a(findViewById(R.id.content));
    }
}
