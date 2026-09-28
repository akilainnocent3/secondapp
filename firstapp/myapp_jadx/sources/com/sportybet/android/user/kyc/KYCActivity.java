package com.sportybet.android.user.kyc;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pairip.VMRunner;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.kyc.KYCActivity;
import defpackage.bmy;
import defpackage.bnh0;
import defpackage.c0n;
import defpackage.c8i0;
import defpackage.dj5;
import defpackage.dsp;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.fae;
import defpackage.fdt;
import defpackage.gip;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.i0j0;
import defpackage.mpe0;
import defpackage.o7d;
import defpackage.qlh0;
import defpackage.rtl;
import defpackage.sh8;
import defpackage.thp;
import defpackage.uqm;
import defpackage.vhp;
import defpackage.wae;
import defpackage.wae0;
import defpackage.yrh0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/user/kyc/KYCActivity;", "Li12;", "<init>", "()V", "WebFinishReceiver", "Companion", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class KYCActivity extends rtl {
    public static final Companion E = new Companion(null);
    public final mpe0 A;
    public dsp B;
    public WebFinishReceiver C;
    public c0n D;
    public gip v;
    public bnh0 w;
    public final mpe0 y;
    public final mpe0 z = hwr.b(new Function0() { // from class: uhp
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KYCActivity.Companion companion = KYCActivity.E;
            final KYCActivity kYCActivity = this.a;
            return new WebViewClient() { // from class: com.sportybet.android.user.kyc.KYCActivity$kycWebViewClient$2$1
                @Override // android.webkit.WebViewClient
                @fae
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    Object obj;
                    Object obj2;
                    view.getClass();
                    url.getClass();
                    if (StringsKt.M(url, "identity_verification", false)) {
                        view.loadUrl(url);
                        return false;
                    }
                    if (StringsKt.M(url, "home", false)) {
                        kYCActivity.finish();
                        return true;
                    }
                    if (!StringsKt.M(url, "blob", false)) {
                        sh8.c().e(o7d.a(wae.HOME));
                        kYCActivity.finish();
                        return false;
                    }
                    KYCActivity kYCActivity2 = kYCActivity;
                    KYCActivity.Companion companion2 = KYCActivity.E;
                    kYCActivity2.getClass();
                    ArrayList arrayList = kYCActivity2.e;
                    int size = arrayList.size();
                    int i = 0;
                    do {
                        if (i >= size) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i);
                        i++;
                    } while (!Intrinsics.g(((qlh0) obj).b, url));
                    if (obj == null) {
                        ((qlh0) CollectionsKt.b0(arrayList)).b = url;
                    }
                    int size2 = arrayList.size();
                    int i2 = 0;
                    do {
                        if (i2 >= size2) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i2);
                        i2++;
                    } while (!Intrinsics.g(((qlh0) obj2).b, url));
                    qlh0 qlh0Var = (qlh0) obj2;
                    Uri uri = qlh0Var != null ? qlh0Var.a : null;
                    if (uri != null) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(uri);
                        intent.addFlags(1);
                        kYCActivity2.startActivity(intent);
                    }
                    return false;
                }
            };
        }
    });

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u001d\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/sportybet/android/user/kyc/KYCActivity$Companion;", "", "<init>", "()V", "UNDEFINED", "", "DIRECT", "", "COOKIE_SUFFIX", "FILE_NAME", "SUFFIX", "ACCESS_TOKEN", "REFRESH_TOKEN", "USER_ID", "COUNTRY_CODE", "INT_COUNTRY_CODE", "INT_CURRENCY_CODE", "PHONE_COUNTRY_CODE", "LOCAL_LANGUAGE", "HIDE_TIER_3", "PATH_VERIFICATION", "PATH_HOME", "PATH_BLOB", "EXTRA_BANK_ASSET_ID", "newInstanceForIdentityVerification", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "newInstanceForBankAccountVerification", "bankAssetId", "(Landroid/content/Context;Ljava/lang/Integer;)Landroid/content/Intent;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent newInstanceForBankAccountVerification(Context context, Integer bankAssetId) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) KYCActivity.class);
            intent.putExtra("bankAssetId", bankAssetId);
            return intent;
        }

        public final Intent newInstanceForIdentityVerification(Context context) {
            context.getClass();
            return new Intent(context, (Class<?>) KYCActivity.class);
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/sportybet/android/user/kyc/KYCActivity$WebFinishReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/sportybet/android/user/kyc/KYCActivity;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class WebFinishReceiver extends BroadcastReceiver {
        public WebFinishReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("Hpb6ML2dsGQvIqjn", new Object[]{this, context, intent});
        }
    }

    public KYCActivity() {
        int i = 0;
        this.y = hwr.b(new thp(this, i));
        this.A = hwr.b(new vhp(i));
    }

    @Override // defpackage.i12
    public final String[] A1() {
        return new String[]{"image/*", "application/pdf"};
    }

    public final void C1() {
        Account account;
        String password;
        uqm accountHelper = getAccountHelper();
        String lastAccessToken = accountHelper.getLastAccessToken();
        if (lastAccessToken == null || (account = accountHelper.getAccount()) == null || (password = AccountManager.get(this).getPassword(account)) == null) {
            return;
        }
        bnh0 bnh0Var = this.w;
        if (bnh0Var == null) {
            Intrinsics.n("urlCreator");
            throw null;
        }
        String strH = bnh0Var.h("/identity_verification");
        CookieManager cookieManager = (CookieManager) this.A.getValue();
        if (cookieManager != null) {
            cookieManager.setCookie(strH, "accessToken=" + lastAccessToken + "; path=/");
            cookieManager.setCookie(strH, "refreshToken=" + password + "; path=/");
            cookieManager.setCookie(strH, "userId=" + accountHelper.getUserId() + "; path=/");
            cookieManager.setCookie(strH, "countryCode=" + getCountryManager().getCountryCode() + "; path=/");
            cookieManager.setCookie(strH, "int-country-code=" + getCountryManager().getCountryCode() + "; path=/");
            cookieManager.setCookie(strH, "locale=" + accountHelper.getLanguageCode() + "; path=/");
            cookieManager.setCookie(strH, "int-currency-code=" + getCountryManager().B() + "; path=/");
            cookieManager.setCookie(strH, "phoneCountryCode=" + wae0.D(1, getCountryManager().M()) + "; path=/");
            dj5.b(new KYCActivity$setCookies$1$1$1(cookieManager, strH, this, null));
        }
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        dsp dspVar = this.B;
        if (dspVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        WebView webView = dspVar.b;
        if (!webView.canGoBack()) {
            return false;
        }
        webView.goBack();
        return true;
    }

    @Override // defpackage.i12, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.kyc_activity, (ViewGroup) null, false);
        WebView webView = (WebView) h5e.a(R.id.webView, viewInflate);
        if (webView == null) {
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.webView)));
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        this.B = new dsp(constraintLayout, webView);
        setContentView(constraintLayout);
        WebFinishReceiver webFinishReceiver = new WebFinishReceiver();
        fdt.a(this).b(webFinishReceiver, new IntentFilter("com.sportybet.action.JS_EVENT"));
        this.C = webFinishReceiver;
        dsp dspVar = this.B;
        if (dspVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        WebView webView2 = dspVar.b;
        getWebViewWrapperService().installJsBridge(this, webView2, (KYCActivity$kycWebViewClient$2$1) this.z.getValue(), (KYCActivity$kycWebChromeClient$2$1) this.y.getValue(), Boolean.TRUE);
        C1();
        String strE = c8i0.e(webView2);
        bnh0 bnh0Var = this.w;
        if (bnh0Var == null) {
            Intrinsics.n("urlCreator");
            throw null;
        }
        StringBuilder sb = new StringBuilder(bnh0Var.h("/identity_verification") + "?direct=" + getIntent().getBooleanExtra("direct", false));
        int intExtra = getIntent().getIntExtra("bankAssetId", -1);
        if (intExtra != -1) {
            sb.append("&bank_statement=true&assetId=" + intExtra);
        }
        ej5.c(ebs.a(getLifecycle()), null, null, new KYCActivity$setupWebView$1$1(webView2, yrh0.d(strE, sb.toString()), this, null), 3);
    }

    @Override // defpackage.i12, defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        i0j0 webViewWrapperService = getWebViewWrapperService();
        dsp dspVar = this.B;
        if (dspVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        webViewWrapperService.uninstallJsBridge(dspVar.b);
        WebFinishReceiver webFinishReceiver = this.C;
        if (webFinishReceiver != null) {
            fdt.a(this).d(webFinishReceiver);
            this.C = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        C1();
    }

    @Override // defpackage.i12
    public final String z1() {
        return "kyc_image.jpg";
    }
}
