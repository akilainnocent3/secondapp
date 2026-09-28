package com.sportybet.android.account;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common.util.EmptyParcelable;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.AccountActivationData;
import com.sporty.android.core.model.account.ReactivateResult;
import com.sporty.android.core.model.account.RegistrationData;
import com.sporty.android.core.model.security.otp.ReactivateAccountResult;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sporty.android.platform.features.newotp.util.OtpViewModelClasses;
import com.sportybet.android.account.AccountActivationActivity;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.feature.country.ChangeRegionActivity;
import com.twilio.voice.EventKeys;
import defpackage.a8b;
import defpackage.au7;
import defpackage.b340;
import defpackage.bb40;
import defpackage.bjb0;
import defpackage.bmy;
import defpackage.ce;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.e8;
import defpackage.ee;
import defpackage.f340;
import defpackage.gzc;
import defpackage.h5e;
import defpackage.haj;
import defpackage.hzc;
import defpackage.itf0;
import defpackage.j6c;
import defpackage.jq40;
import defpackage.kll;
import defpackage.lfy;
import defpackage.mzc;
import defpackage.o240;
import defpackage.o7d;
import defpackage.p7;
import defpackage.paj;
import defpackage.pwx;
import defpackage.pzc;
import defpackage.q7;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.sh8;
import defpackage.snb0;
import defpackage.t240;
import defpackage.to20;
import defpackage.tzc;
import defpackage.u7;
import defpackage.ud;
import defpackage.uqm;
import defpackage.ux5;
import defpackage.v240;
import defpackage.v8i0;
import defpackage.vqm;
import defpackage.wae;
import defpackage.wzc;
import defpackage.x240;
import defpackage.xux;
import defpackage.yrh0;
import defpackage.zux;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sportybet/android/account/AccountActivationActivity;", "Lpy1;", "Lpwx;", "Lzux;", "Lxux;", "Lto20;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AccountActivationActivity extends kll implements pwx, zux, xux, to20, bb40 {
    public static final /* synthetic */ int z = 0;
    public com.sporty.android.platform.features.newotp.util.a c;
    public d0n d;
    public AccountActivationData y;
    public final ee<Intent> b = registerForActivityResult(new ce(), new ud() { // from class: r7
        @Override // defpackage.ud
        public final void a(Object obj) throws UnsupportedEncodingException {
            AccountActivationActivity accountActivationActivity = this.a;
            q8i0 q8i0Var = accountActivationActivity.v;
            ActivityResult activityResult = (ActivityResult) obj;
            int i = AccountActivationActivity.z;
            activityResult.getClass();
            Intent intent = activityResult.b;
            AccountActivationData accountActivationData = intent != null ? (AccountActivationData) intent.getParcelableExtra("data") : null;
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_ACCOUNT);
            aVar.a("%s received account activation web page result: %s", jq40.a(AccountActivationActivity.class).k(), accountActivationData);
            if (accountActivationData != null) {
                AccountActivationData accountActivationData2 = accountActivationActivity.y;
                if (accountActivationData2 == null) {
                    Intrinsics.n("accountActivationData");
                    throw null;
                }
                accountActivationData2.setStatus(accountActivationData.getStatus());
                String status = accountActivationData.getStatus();
                int iHashCode = status.hashCode();
                if (iHashCode != -1403128422) {
                    if (iHashCode != -1174850051) {
                        if (iHashCode == 128854604 && status.equals("REACTIVATE_SELECT_DONE")) {
                            ((au7) q8i0Var.getValue()).x1(j6c.REACTIVATE);
                            AccountActivationData accountActivationData3 = accountActivationActivity.y;
                            if (accountActivationData3 == null) {
                                Intrinsics.n("accountActivationData");
                                throw null;
                            }
                            if (!accountActivationActivity.z1(accountActivationData, accountActivationData3)) {
                                zyf0.a(R.string.identity_verification__please_enter_a_valid_mobile_number);
                                AccountActivationData accountActivationData4 = accountActivationActivity.y;
                                if (accountActivationData4 == null) {
                                    Intrinsics.n("accountActivationData");
                                    throw null;
                                }
                                accountActivationData4.setStatus("CLOSE");
                            }
                        }
                    } else if (status.equals("REACTIVATE_RESET_PASSWORD_DONE")) {
                        AccountActivationData accountActivationData5 = accountActivationActivity.y;
                        if (accountActivationData5 == null) {
                            Intrinsics.n("accountActivationData");
                            throw null;
                        }
                        accountActivationData5.setReactivateResult(accountActivationData.getReactivateResult());
                    }
                } else if (status.equals("DEACTIVATE_SELECT_DONE")) {
                    ((au7) q8i0Var.getValue()).x1(j6c.DEACTIVATE);
                    AccountActivationData accountActivationData6 = accountActivationActivity.y;
                    if (accountActivationData6 == null) {
                        Intrinsics.n("accountActivationData");
                        throw null;
                    }
                    accountActivationData6.setReasonId(accountActivationData.getReasonId());
                    AccountActivationData accountActivationData7 = accountActivationActivity.y;
                    if (accountActivationData7 == null) {
                        Intrinsics.n("accountActivationData");
                        throw null;
                    }
                    if (!accountActivationActivity.z1(accountActivationData, accountActivationData7)) {
                        zyf0.a(R.string.identity_verification__please_enter_a_valid_mobile_number);
                        AccountActivationData accountActivationData8 = accountActivationActivity.y;
                        if (accountActivationData8 == null) {
                            Intrinsics.n("accountActivationData");
                            throw null;
                        }
                        accountActivationData8.setStatus("CLOSE");
                    }
                }
                accountActivationActivity.A1();
            }
        }
    });
    public final ee<OtpModule<OtpData.Deactivate>> e = com.sporty.android.platform.features.newotp.agent.b.a(this, new Function1() { // from class: s7
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) throws UnsupportedEncodingException {
            OtpData.Deactivate deactivate = (OtpData.Deactivate) obj;
            int i = AccountActivationActivity.z;
            deactivate.getClass();
            OTPResult<EmptyParcelable> oTPResult = deactivate.e;
            boolean z2 = oTPResult instanceof OTPResult.Success;
            AccountActivationActivity accountActivationActivity = this.a;
            if (z2) {
                AccountActivationData accountActivationData = accountActivationActivity.y;
                if (accountActivationData == null) {
                    Intrinsics.n("accountActivationData");
                    throw null;
                }
                accountActivationData.setStatus("DEACTIVATE_ACCOUNT_DONE");
                accountActivationActivity.A1();
            } else if (oTPResult instanceof OTPResult.NoResult) {
                AccountActivationData accountActivationData2 = accountActivationActivity.y;
                if (accountActivationData2 == null) {
                    Intrinsics.n("accountActivationData");
                    throw null;
                }
                accountActivationData2.setStatus("CLOSE");
                accountActivationActivity.A1();
            } else {
                if (!(oTPResult instanceof OTPResult.Failed)) {
                    uhc.a();
                    return null;
                }
                AccountActivationData accountActivationData3 = accountActivationActivity.y;
                if (accountActivationData3 == null) {
                    Intrinsics.n("accountActivationData");
                    throw null;
                }
                accountActivationData3.setStatus("CLOSE");
                UiText b2 = ((OTPResult.Failed) oTPResult).getB();
                b2.getClass();
                accountActivationActivity.B1(b2.e(accountActivationActivity).toString());
            }
            return Unit.a;
        }
    });
    public final ee<OtpModule<OtpData.Reactivate>> f = com.sporty.android.platform.features.newotp.agent.b.a(this, new Function1() { // from class: t7
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) throws UnsupportedEncodingException {
            OtpData.Reactivate reactivate = (OtpData.Reactivate) obj;
            int i = AccountActivationActivity.z;
            reactivate.getClass();
            OTPResult<ReactivateAccountResult> oTPResult = reactivate.e;
            boolean z2 = oTPResult instanceof OTPResult.Success;
            AccountActivationActivity accountActivationActivity = this.a;
            if (z2) {
                AccountActivationData accountActivationData = accountActivationActivity.y;
                if (accountActivationData == null) {
                    Intrinsics.n("accountActivationData");
                    throw null;
                }
                accountActivationData.setStatus("REACTIVATE_ACCOUNT_DONE");
                AccountActivationData accountActivationData2 = accountActivationActivity.y;
                if (accountActivationData2 == null) {
                    Intrinsics.n("accountActivationData");
                    throw null;
                }
                accountActivationData2.setReactivateToken(((ReactivateAccountResult) ((OTPResult.Success) oTPResult).a).getToken());
                accountActivationActivity.A1();
            } else if (oTPResult instanceof OTPResult.NoResult) {
                AccountActivationData accountActivationData3 = accountActivationActivity.y;
                if (accountActivationData3 == null) {
                    Intrinsics.n("accountActivationData");
                    throw null;
                }
                accountActivationData3.setStatus("CLOSE");
                accountActivationActivity.A1();
            } else {
                if (!(oTPResult instanceof OTPResult.Failed)) {
                    uhc.a();
                    return null;
                }
                AccountActivationData accountActivationData4 = accountActivationActivity.y;
                if (accountActivationData4 == null) {
                    Intrinsics.n("accountActivationData");
                    throw null;
                }
                accountActivationData4.setStatus("CLOSE");
                UiText b2 = ((OTPResult.Failed) oTPResult).getB();
                b2.getClass();
                accountActivationActivity.B1(b2.e(accountActivationActivity).toString());
            }
            return Unit.a;
        }
    });
    public final q8i0 i = new q8i0(jq40.a(u7.class), new d(), new c(), new e());
    public final q8i0 v = new q8i0(jq40.a(au7.class), new g(), new f(), new h());
    public Integer w = -1;

    public static final class a implements lfy, paj {
        public final /* synthetic */ q7 a;

        public a(q7 q7Var) {
            this.a = q7Var;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class b implements com.sportybet.android.sportypin.e.a {
        public b() {
        }

        @Override // com.sportybet.android.sportypin.e.a
        public final void a() {
        }

        @Override // com.sportybet.android.sportypin.e.a
        public final void onDismiss() throws UnsupportedEncodingException {
            int i = AccountActivationActivity.z;
            AccountActivationActivity.this.A1();
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return AccountActivationActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return AccountActivationActivity.this.getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return AccountActivationActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return AccountActivationActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class g extends qlr implements Function0<v8i0> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return AccountActivationActivity.this.getViewModelStore();
        }
    }

    public static final class h extends qlr implements Function0<cyb> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return AccountActivationActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void A1() throws UnsupportedEncodingException {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_ACCOUNT);
        AccountActivationData accountActivationData = this.y;
        if (accountActivationData == null) {
            Intrinsics.n("accountActivationData");
            throw null;
        }
        aVar.a("process data: %s", accountActivationData);
        AccountActivationData accountActivationData2 = this.y;
        if (accountActivationData2 == null) {
            Intrinsics.n("accountActivationData");
            throw null;
        }
        String status = accountActivationData2.getStatus();
        int iHashCode = status.hashCode();
        ee<Intent> eeVar = this.b;
        switch (iHashCode) {
            case -1403128422:
                if (status.equals("DEACTIVATE_SELECT_DONE")) {
                    if (this.c == null) {
                        Intrinsics.n("otpModuleFactory");
                        throw null;
                    }
                    AccountActivationData accountActivationData3 = this.y;
                    if (accountActivationData3 == null) {
                        Intrinsics.n("accountActivationData");
                        throw null;
                    }
                    String phoneNumber = accountActivationData3.getPhoneNumber();
                    String str = phoneNumber == null ? "" : phoneNumber;
                    String phoneCountryCode = accountActivationData3.getPhoneCountryCode();
                    this.e.b(new OtpModule(new OtpData.Deactivate(str, phoneCountryCode == null ? "" : phoneCountryCode, j6c.DEACTIVATE, accountActivationData3, OTPResult.NoResult.a), new OtpViewModelClasses(hzc.class, pzc.class, wzc.class, mzc.class, tzc.class, gzc.class)));
                    return;
                }
                return;
            case -1174850051:
                if (status.equals("REACTIVATE_RESET_PASSWORD_DONE")) {
                    AccountActivationData accountActivationData4 = this.y;
                    if (accountActivationData4 == null) {
                        Intrinsics.n("accountActivationData");
                        throw null;
                    }
                    ReactivateResult reactivateResult = accountActivationData4.getReactivateResult();
                    if (reactivateResult == null) {
                        finish();
                        return;
                    }
                    int bizCode = reactivateResult.getBizCode();
                    if (bizCode != 10000) {
                        if (bizCode != 12400) {
                            C1(499, "");
                            return;
                        } else {
                            C1(400, reactivateResult.getMessage());
                            return;
                        }
                    }
                    AccountActivationData accountActivationData5 = this.y;
                    if (accountActivationData5 == null) {
                        Intrinsics.n("accountActivationData");
                        throw null;
                    }
                    String phoneNumber2 = accountActivationData5.getPhoneNumber();
                    uqm accountHelper = getAccountHelper();
                    String accessToken = reactivateResult.getAccessToken();
                    String refreshToken = reactivateResult.getRefreshToken();
                    String userId = reactivateResult.getUserId();
                    Integer userCert = reactivateResult.getUserCert();
                    if (phoneNumber2 != null && !StringsKt.U(phoneNumber2)) {
                        RegistrationData registrationData = new RegistrationData();
                        registrationData.mobile = phoneNumber2;
                        registrationData.accessToken = accessToken;
                        registrationData.refreshToken = refreshToken;
                        registrationData.userId = userId;
                        if (registrationData.hasRegistrationTokens()) {
                            accountHelper.setRegisterStatus(true);
                            String str2 = registrationData.mobile;
                            str2.getClass();
                            String str3 = registrationData.accessToken;
                            str3.getClass();
                            String str4 = registrationData.refreshToken;
                            str4.getClass();
                            String str5 = registrationData.userId;
                            str5.getClass();
                            accountHelper.saveToken(null, new vqm(str2, str5, str3, str4, (Long) null, (String) null, userCert, (String) null, (String) null, (String) null, (String) null, false, 0L));
                        }
                    }
                    C1(399, "");
                    return;
                }
                return;
            case -895457135:
                if (status.equals("START_DEACTIVATE")) {
                    Intent intent = new Intent(this, (Class<?>) AccountActivationWebViewActivity.class);
                    String lastAccessToken = ((uqm) p7.b.getValue()).getLastAccessToken();
                    intent.putExtra("url", bjb0.S("/wv/deactivate_reactivate/select?flow=deactivate&accessToken=" + (TextUtils.isEmpty(lastAccessToken) ? "" : URLEncoder.encode(lastAccessToken, "utf-8"))));
                    intent.putExtra("data_enable_default_action_bar", false);
                    eeVar.b(intent);
                    return;
                }
                return;
            case 64218584:
                if (status.equals("CLOSE")) {
                    finish();
                    return;
                }
                return;
            case 128854604:
                if (status.equals("REACTIVATE_SELECT_DONE")) {
                    if (this.c == null) {
                        Intrinsics.n("otpModuleFactory");
                        throw null;
                    }
                    AccountActivationData accountActivationData6 = this.y;
                    if (accountActivationData6 == null) {
                        Intrinsics.n("accountActivationData");
                        throw null;
                    }
                    String phoneNumber3 = accountActivationData6.getPhoneNumber();
                    String str6 = phoneNumber3 == null ? "" : phoneNumber3;
                    String phoneCountryCode2 = accountActivationData6.getPhoneCountryCode();
                    this.f.b(new OtpModule(new OtpData.Reactivate(str6, phoneCountryCode2 == null ? "" : phoneCountryCode2, j6c.REACTIVATE, accountActivationData6, OTPResult.NoResult.a), new OtpViewModelClasses(t240.class, x240.class, f340.class, v240.class, b340.class, o240.class)));
                    return;
                }
                return;
            case 148876084:
                if (status.equals("CUSTOMER_SERVICE")) {
                    d0n d0nVar = this.d;
                    if (d0nVar == null) {
                        Intrinsics.n("utils");
                        throw null;
                    }
                    d0nVar.b(this, snb0.ACCOUNT_ACTIVATION);
                    finish();
                    return;
                }
                return;
            case 452297876:
                if (status.equals("START_DEACTIVATE_REACTIVATE")) {
                    Intent intent2 = new Intent(this, (Class<?>) AccountActivationWebViewActivity.class);
                    AccountHelperEntryPointImpl accountHelperEntryPointImpl = p7.a;
                    intent2.putExtra("url", bjb0.S("/wv/deactivate_reactivate/select?flow=deactivate_reactivate"));
                    intent2.putExtra("data_enable_default_action_bar", false);
                    eeVar.b(intent2);
                    return;
                }
                return;
            case 581569123:
                if (status.equals("CHANGE_REGION")) {
                    Integer num = this.w;
                    if (num != null && num.intValue() == 55688) {
                        yrh0.s(this, ChangeRegionActivity.z1(this), true);
                    } else if (num != null && num.intValue() == 66799) {
                        yrh0.s(this, ChangeRegionActivity.z1(this), true);
                    }
                    finish();
                    return;
                }
                return;
            case 895475835:
                if (status.equals("SELF_EXCLUSION")) {
                    sh8.c().e(o7d.a(wae.SELF_EXECLUSION));
                    finish();
                    return;
                }
                return;
            case 1582499935:
                if (status.equals("DEACTIVATE_ACCOUNT_DONE")) {
                    C1(199, "");
                    return;
                }
                return;
            case 1829333485:
                if (status.equals("REACTIVATE_ACCOUNT_DONE")) {
                    AccountActivationData accountActivationData7 = this.y;
                    if (accountActivationData7 == null) {
                        Intrinsics.n("accountActivationData");
                        throw null;
                    }
                    Intent intent3 = new Intent(this, (Class<?>) AccountActivationWebViewActivity.class);
                    AccountHelperEntryPointImpl accountHelperEntryPointImpl2 = p7.a;
                    String phoneNumber4 = accountActivationData7.getPhoneNumber();
                    String reactivateToken = accountActivationData7.getReactivateToken();
                    String reasonId = accountActivationData7.getReasonId();
                    String strEncode = URLEncoder.encode(phoneNumber4, "utf-8");
                    String strEncode2 = URLEncoder.encode(reactivateToken, "utf-8");
                    StringBuilder sbA = ux5.a("/wv/deactivate_reactivate/reset?phone=", strEncode, "&reasonId=", URLEncoder.encode(reasonId, "utf-8"), "&token=");
                    sbA.append(strEncode2);
                    intent3.putExtra("url", bjb0.S(sbA.toString()));
                    intent3.putExtra("data_enable_default_action_bar", false);
                    eeVar.b(intent3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void B1(String str) {
        if (TextUtils.isEmpty(str)) {
            str = getCMSString(R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]);
        }
        b bVar = new b();
        com.sportybet.android.sportypin.e eVar = new com.sportybet.android.sportypin.e();
        eVar.a = "";
        eVar.b = str;
        eVar.c = "";
        eVar.d = bVar;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        eVar.show(supportFragmentManager, "errorDialog");
    }

    public final void C1(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        bundle.putString(EventKeys.ERROR_MESSAGE, str);
        e8 e8Var = new e8();
        e8Var.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.f(R.id.fragment_container, e8Var, null);
        aVar.k(true, true);
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() throws UnsupportedEncodingException {
        AccountActivationData accountActivationData = this.y;
        if (accountActivationData == null) {
            Intrinsics.n("accountActivationData");
            throw null;
        }
        accountActivationData.setStatus("CLOSE");
        A1();
        return true;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) throws UnsupportedEncodingException {
        String str;
        super.onCreate(bundle);
        try {
            setRequestedOrientation(1);
        } catch (Exception unused) {
        }
        int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_account_activation, (ViewGroup) null, false);
        int i2 = R.id.fragment_container;
        if (((FrameLayout) h5e.a(R.id.fragment_container, viewInflate)) != null) {
            i2 = R.id.loading;
            if (((LoadingView) h5e.a(R.id.loading, viewInflate)) != null) {
                setContentView((FrameLayout) viewInflate);
                ((u7) this.i.getValue()).a.f(this, new a(new q7(this, i)));
                Intent intent = getIntent();
                Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("action", 66799)) : null;
                this.w = numValueOf;
                if (numValueOf != null && numValueOf.intValue() == 55688) {
                    ((au7) this.v.getValue()).x1(j6c.DEACTIVATE);
                    str = "START_DEACTIVATE";
                } else {
                    str = (numValueOf != null && numValueOf.intValue() == 66799) ? "START_DEACTIVATE_REACTIVATE" : "CLOSE";
                }
                this.y = new AccountActivationData(str, getCountryManager().P(), null, null, null, null, 60, null);
                A1();
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    public final boolean z1(AccountActivationData accountActivationData, AccountActivationData accountActivationData2) {
        String phoneNumber = accountActivationData.getPhoneNumber();
        accountActivationData2.setPhoneNumber((phoneNumber == null || StringsKt.U(phoneNumber)) ? getAccountHelper().getPhoneNumber() : accountActivationData.getPhoneNumber());
        String phoneNumber2 = accountActivationData2.getPhoneNumber();
        return (phoneNumber2 == null || StringsKt.U(phoneNumber2) || !a8b.c().C(accountActivationData2.getPhoneNumber())) ? false : true;
    }
}
