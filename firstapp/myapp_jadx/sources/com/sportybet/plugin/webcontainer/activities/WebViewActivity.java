package com.sportybet.plugin.webcontainer.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.AccountActivationData;
import com.sporty.android.core.model.kyc.phonemigration.KYCDuplicateIDWebViewResponse;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.account.RegistrationKYC$Result;
import com.sportybet.android.data.LaunchOTP;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import com.sportybet.feature.horseracing.model.BmSdkResult;
import com.sportybet.feature.settings.SettingsActivity;
import com.sportybet.plugin.webcontainer.WebviewEffect;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin;
import com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel;
import defpackage.bb40;
import defpackage.c0n;
import defpackage.c8i0;
import defpackage.cbg;
import defpackage.cw;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.fbh0;
import defpackage.fdt;
import defpackage.gym;
import defpackage.h0j0;
import defpackage.hb5;
import defpackage.i9j;
import defpackage.inm;
import defpackage.itf0;
import defpackage.iym;
import defpackage.izi0;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.lit;
import defpackage.o7d;
import defpackage.psm;
import defpackage.q81;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.s9s;
import defpackage.sh8;
import defpackage.str;
import defpackage.uqm;
import defpackage.v8i0;
import defpackage.vxo;
import defpackage.w430;
import defpackage.wae;
import defpackage.xag;
import defpackage.xpg0;
import defpackage.y8j;
import defpackage.yi5;
import defpackage.yrh0;
import defpackage.yyh;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewActivity extends Hilt_WebViewActivity implements k9j, bb40, cw, lit {
    private static final String DEPOSIT_CLOSE_URL_PATH = "deposit/m/close";
    private static final String DEPOSIT_COMPLETED_URL_PATH = "deposit/m/completed";
    private static String PROMOTION_DETAILS_URL_PATH = "promotions/content";
    public uqm accountHelper;
    yi5 buildConfiguration;
    str<CookieManager> cookieManagerLazy;
    public psm countryButler;
    cbg environmentManager;
    y8j fullStoryCommonManager;
    private i9j fullStoryPage;
    JSPluginService jsPluginService;
    iym openTelemetryLogger;
    private String url;
    public c0n urlTool;
    private WebViewCommandReceiver webViewCommandReceiver;
    protected WebViewViewModel webViewViewModel;
    private boolean isDestroy = false;
    private boolean finishOnLogin = false;
    private String webViewTitle = "";

    public class WebViewCommandReceiver extends BroadcastReceiver {
        private WebViewCommandReceiver() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            byte b;
            String stringExtra = intent.getStringExtra("eventName");
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_JAVA_SCRIPT);
            aVar.a("on received command, reason: %s", stringExtra);
            String strValueOf = String.valueOf(stringExtra);
            switch (strValueOf.hashCode()) {
                case -1241591313:
                    b = !strValueOf.equals("goBack") ? (byte) -1 : (byte) 0;
                    break;
                case -524206234:
                    b = !strValueOf.equals("duplicateID") ? (byte) -1 : (byte) 1;
                    break;
                case -319040546:
                    b = !strValueOf.equals("nameMissMatch") ? (byte) -1 : (byte) 2;
                    break;
                case -142564920:
                    b = !strValueOf.equals(rarBonoqWB.Chjh) ? (byte) -1 : (byte) 3;
                    break;
                case 22580968:
                    b = !strValueOf.equals("telegramLogin") ? (byte) -1 : (byte) 4;
                    break;
                case 159270694:
                    b = !strValueOf.equals("openMarket") ? (byte) -1 : (byte) 5;
                    break;
                case 582823033:
                    b = !strValueOf.equals("registrationKYCResult") ? (byte) -1 : (byte) 6;
                    break;
                case 591337921:
                    b = !strValueOf.equals("finishWeb") ? (byte) -1 : (byte) 7;
                    break;
                case 1457820908:
                    b = !strValueOf.equals("bmSdkResult") ? (byte) -1 : (byte) 8;
                    break;
                case 1877600702:
                    b = !strValueOf.equals("showTwoFASuccessSnackbar") ? (byte) -1 : (byte) 9;
                    break;
                case 1956733216:
                    b = !strValueOf.equals("accountActivationResult") ? (byte) -1 : (byte) 10;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    WebView webView = WebViewActivity.this.webView;
                    if (webView != null && webView.canGoBack()) {
                        WebViewActivity.this.webView.goBack();
                    } else if (!WebViewActivity.this.isFinishing()) {
                        WebViewActivity.this.finish();
                    }
                    break;
                case 1:
                    KYCDuplicateIDWebViewResponse kYCDuplicateIDWebViewResponse = (KYCDuplicateIDWebViewResponse) vxo.a(intent, "data", KYCDuplicateIDWebViewResponse.class);
                    WebViewViewModel webViewViewModel = WebViewActivity.this.webViewViewModel;
                    if (webViewViewModel != null && kYCDuplicateIDWebViewResponse != null) {
                        webViewViewModel.setKYCDuplicateIdResult(kYCDuplicateIDWebViewResponse);
                    }
                    break;
                case 2:
                    LaunchOTP launchOTP = (LaunchOTP) vxo.a(intent, "data", LaunchOTP.class);
                    WebViewViewModel webViewViewModel2 = WebViewActivity.this.webViewViewModel;
                    if (webViewViewModel2 != null && launchOTP != null) {
                        webViewViewModel2.setNameMissMatchOTP(launchOTP);
                    }
                    break;
                case 3:
                    String stringExtra2 = intent.getStringExtra("data");
                    WebViewViewModel webViewViewModel3 = WebViewActivity.this.webViewViewModel;
                    if (webViewViewModel3 != null && stringExtra2 != null) {
                        webViewViewModel3.setFacialRecognitionResult(stringExtra2);
                    }
                    break;
                case 4:
                    Serializable serializableExtra = intent.getSerializableExtra("data");
                    if (serializableExtra instanceof HashMap) {
                        int intExtra = WebViewActivity.this.getIntent().getIntExtra("requestCode", 0);
                        Intent intent2 = new Intent();
                        intent2.putExtra("data", (HashMap) serializableExtra);
                        intent2.putExtra("requestCode", intExtra);
                        WebViewActivity.this.setResult(-1, intent2);
                        WebViewActivity.this.finish();
                    }
                    WebViewActivity.this.webViewViewModel.updateShouldShowTwoFASuccessSnackbar();
                    break;
                case 5:
                    WebViewActivity webViewActivity = WebViewActivity.this;
                    yrh0.o(webViewActivity, webViewActivity.buildConfiguration);
                    break;
                case 6:
                    RegistrationKYC$Result registrationKYC$Result = (RegistrationKYC$Result) intent.getParcelableExtra("data");
                    WebViewViewModel webViewViewModel4 = WebViewActivity.this.webViewViewModel;
                    if (webViewViewModel4 != null && registrationKYC$Result != null) {
                        webViewViewModel4.setRegistrationKYCResult(registrationKYC$Result);
                    }
                    break;
                case 7:
                    WebViewActivity.this.handleCustomFinishAction();
                    break;
                case 8:
                    BmSdkResult bmSdkResult = (BmSdkResult) intent.getParcelableExtra("data");
                    WebViewViewModel webViewViewModel5 = WebViewActivity.this.webViewViewModel;
                    if (webViewViewModel5 != null && bmSdkResult != null) {
                        webViewViewModel5.setBmSdkResult(bmSdkResult);
                    }
                    break;
                case 9:
                    WebViewActivity.this.webViewViewModel.updateShouldShowTwoFASuccessSnackbar();
                    break;
                case 10:
                    AccountActivationData accountActivationData = (AccountActivationData) intent.getParcelableExtra("data");
                    WebViewViewModel webViewViewModel6 = WebViewActivity.this.webViewViewModel;
                    if (webViewViewModel6 != null && accountActivationData != null) {
                        webViewViewModel6.setAccountActivationResult(accountActivationData);
                    }
                    break;
            }
            WebViewActivity.this.onHandleMessage(String.valueOf(stringExtra));
        }

        public /* synthetic */ WebViewCommandReceiver(WebViewActivity webViewActivity, int i) {
            this();
        }
    }

    private void clearWebViewCookies() {
        try {
            CookieManager cookieManager = this.cookieManagerLazy.get();
            if (cookieManager != null) {
                cookieManager.removeAllCookies(null);
            }
        } catch (Exception e) {
            itf0.a.f(e, "Failed to clear WebView cookies: %s", e.getMessage());
        }
    }

    private void collectEffect() {
        yyh.b(this.webViewViewModel.getEffect(), this, s9s.b.d, new q81(this, 2));
    }

    private void endPage() {
    }

    private String getCookieUrlForCMSLanguageCode(String str) {
        try {
            Uri uri = Uri.parse(str);
            return new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).build().toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private void initViewModel() {
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(WebViewViewModel.class);
        String strI = dq7VarA.i();
        if (strI != null) {
            this.webViewViewModel = (WebViewViewModel) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        } else {
            hb5.a("Local and anonymous classes can not be ViewModels");
        }
    }

    private boolean isPromotionDetailsPage() {
        String str = this.url;
        return str != null && str.contains(PROMOTION_DETAILS_URL_PATH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$collectEffect$3(WebviewEffect webviewEffect) {
        if (webviewEffect instanceof WebviewEffect.Leave) {
            finish();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshPage$1(String str) {
        this.webView.loadUrl("javascript:window.location.hash=\"" + str + "\"");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshPage$2(boolean z, String str, final String str2) {
        if (isFinishing() || this.isDestroy) {
            return;
        }
        if (z) {
            this.urlTool.c(this.webView, str);
        } else {
            this.webView.loadUrl(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.webView.postDelayed(new Runnable() { // from class: czi0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$refreshPage$1(str2);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setUpPromotion$0(String str, String str2, Integer num, Integer num2, View view) {
        this.fullStoryCommonManager.c(view, AnalyticsEvent.PROMOS_PAGE_SHARE_FS);
        this.webViewViewModel.onShareButtonEvent(w430.f.a);
        fbh0 fbh0VarC = sh8.c();
        fbh0VarC.getClass();
        StringBuilder sb = new StringBuilder(o7d.a(wae.SHARE));
        sb.append("?linkUrl=");
        sb.append(str);
        if (str2 != null) {
            sb.append("&title=");
            sb.append(Uri.encode(str2));
        }
        if (num != null) {
            sb.append("&titleStyle=");
            sb.append(num);
        }
        if (num2 != null) {
            sb.append("&titleBottomPadding=");
            sb.append(num2);
        }
        fbh0VarC.e(sb.toString());
    }

    private void printCookies(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_WEB);
        aVar.a("cookies for %s", str);
        CookieManager cookieManagerA = h0j0.a();
        if (cookieManagerA != null) {
            String cookie = cookieManagerA.getCookie(str);
            if (TextUtils.isEmpty(cookie)) {
                return;
            }
            for (String str2 : cookie.split("; ")) {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_WEB);
                aVar2.a("    cookie: %s", str2);
            }
        }
    }

    private void registerReceivers() {
        this.webViewCommandReceiver = new WebViewCommandReceiver(this, 0);
        fdt.a(this).b(this.webViewCommandReceiver, new IntentFilter("com.sportybet.action.JS_EVENT"));
    }

    private void setCookie(CookieManager cookieManager, String str, String str2) {
        if (cookieManager == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_WEB);
        aVar.a("set cookie: %s, url: %s", str2, str);
        cookieManager.setCookie(str, str2);
    }

    private void setCookies(Bundle bundle) {
        CookieManager cookieManagerA = h0j0.a();
        if (cookieManagerA == null) {
            return;
        }
        cookieManagerA.setAcceptThirdPartyCookies(this.webView, true);
        String string = bundle.getString("url");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        setCookie(cookieManagerA, getCookieUrlForCMSLanguageCode(string), inm.a("locale=", this.accountHelper.getLanguageCode()));
        setCookie(cookieManagerA, string, "sb_country=" + this.countryButler.getCountryCode());
        setCookie(cookieManagerA, string, "download-source=google-play-store");
        String string2 = bundle.getString("data_cookies");
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        for (String str : string2.split(";")) {
            if (!TextUtils.isEmpty(str)) {
                setCookie(cookieManagerA, string, str);
            }
        }
    }

    private void setTitle(Bundle bundle) {
        String string = bundle.getString("title");
        if (!TextUtils.isEmpty(string)) {
            setTitle(string);
            this.hasCustomTitleText = true;
            return;
        }
        this.hasCustomTitleText = false;
        int i = bundle.getInt("title_id", -1);
        if (i == -1) {
            this.hasCustomTitleText = false;
        } else {
            setTitle(i);
            this.hasCustomTitleText = true;
        }
    }

    private void setUpPromotion() {
        Bundle extras = getIntent().getExtras();
        View viewFindViewById = findViewById(R.id.btn_share);
        if (viewFindViewById == null || extras == null) {
            return;
        }
        this.webViewViewModel.onShareButtonEvent(w430.g.a);
        if (extras.containsKey("data_share_dialog_sharing_content")) {
            viewFindViewById.setVisibility(0);
            final String string = extras.getString("data_share_dialog_sharing_content");
            final String string2 = extras.getString("data_share_dialog_title");
            final Integer numValueOf = extras.containsKey("data_share_dialog_title_style") ? Integer.valueOf(extras.getInt("data_share_dialog_title_style")) : null;
            final Integer numValueOf2 = extras.containsKey("data_share_dialog_title_bottom_padding") ? Integer.valueOf(extras.getInt("data_share_dialog_title_bottom_padding")) : null;
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: bzi0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.lambda$setUpPromotion$0(string, string2, numValueOf, numValueOf2, view);
                }
            });
        }
    }

    private void setupActionBar(Bundle bundle) {
        View viewFindViewById = findViewById(R.id.title_view);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(bundle.getBoolean("data_enable_default_action_bar", true) ? 0 : 8);
            if (isPromotionDetailsPage()) {
                setUpPromotion();
            }
        }
    }

    private void unregisterReceivers() {
        if (this.webViewCommandReceiver != null) {
            fdt.a(this).d(this.webViewCommandReceiver);
            this.webViewCommandReceiver = null;
        }
    }

    @Override // com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity
    public void close() {
        String str = this.url;
        if (str != null && str.contains(PROMOTION_DETAILS_URL_PATH)) {
            this.webViewViewModel.onShareButtonEvent(new w430.d(this.webViewTitle));
            this.fullStoryCommonManager.c(getLeftCloseButton(), AnalyticsEvent.PROMOS_PAGE_BACK_BUTTON_FS);
        }
        String str2 = this.url;
        if (str2 != null && str2.contains(WebViewActivityUtils.URL_HOW_TO_PLAY_TRANSACTIONS_HISTORY)) {
            gym.a(this.openTelemetryLogger, new xpg0.h());
        }
        super.close();
    }

    public String getUrl() {
        return this.url;
    }

    @Override // com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity
    public void initWebView() {
        super.initWebView();
        this.client.setDelegeteWebViewClient(new LoadWebViewClient(this, 0));
    }

    @Override // com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null || this.webView == null) {
            finish();
            return;
        }
        initViewModel();
        if (bundle != null && bundle.getBoolean(BaseWebViewActivity.DATA_USER_ACTION)) {
            finish();
            return;
        }
        refreshPage(extras);
        setupActionBar(extras);
        setCookies(extras);
        boolean z = extras.getBoolean("key_finish_on_login", false);
        this.finishOnLogin = z;
        if (z) {
            this.accountHelper.addLoginEventListener(this);
        }
        registerReceivers();
        collectEffect();
    }

    @Override // com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public void onDestroy() {
        if (this.finishOnLogin) {
            this.accountHelper.removeLoginEventListener(this);
        }
        super.onDestroy();
        this.isDestroy = true;
        HashMap<String, LDJSPlugin> jSPlugins = this.jsPluginService.getJSPlugins();
        if (jSPlugins != null) {
            Iterator<LDJSPlugin> it = jSPlugins.values().iterator();
            while (it.hasNext()) {
                it.next().webView = null;
            }
        }
        clearWebViewCookies();
        unregisterReceivers();
    }

    public void onHandleMessage(String str) {
    }

    @Override // defpackage.lit
    public void onLogin() {
        finish();
    }

    @Override // defpackage.rn8, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        refreshPage(intent.getExtras());
    }

    @Override // com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity
    public void onNewPageIsLoading(String str) {
        this.url = str;
        if (isPromotionDetailsPage()) {
            setUpPromotion();
        }
    }

    public void onPageFinished(WebView webView, String str) {
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
    }

    @Override // com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public void onPause() {
        super.onPause();
        endPage();
        getWindow().setFlags(8192, 8192);
        if (!isFinishing() || this.webView == null) {
            return;
        }
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.webView.getWindowToken(), 0);
    }

    @Override // com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().clearFlags(8192);
    }

    public void refreshPage(Bundle bundle) {
        setTitle(bundle);
        this.webView.clearHistory();
        final String string = bundle.getString("jumpJs");
        String string2 = bundle.getString("url");
        boolean zEquals = TextUtils.equals(string2, this.url);
        this.url = string2;
        if (zEquals) {
            endPage();
        }
        final boolean z = !bundle.getBoolean("disable url redirect", false);
        if (this.url != null) {
            String strE = c8i0.e(this.webView);
            boolean zContains = this.url.contains(this.environmentManager.b().i);
            final String strD = this.url;
            if (!zContains) {
                strD = yrh0.d(strE, strD);
            }
            if (this.url.contains("footballquiz")) {
                setTitleBackgroundColor(Color.parseColor("#170741"));
            }
            this.webView.post(new Runnable() { // from class: azi0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$refreshPage$2(z, strD, string);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCustomFinishAction() {
        Object obj;
        try {
            if (getIntent().getExtras() != null) {
                String string = getIntent().getExtras().getString("customFinishAction");
                Object obj2 = izi0.Finish;
                Object[] objArr = (Enum[]) izi0.class.getEnumConstants();
                if (objArr != null) {
                    int length = objArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            obj = objArr[i];
                            obj.getClass();
                            if (Intrinsics.g(((xag) obj).getValue(), string)) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (obj != null) {
                        obj2 = obj;
                    }
                }
                if (((izi0) obj2) == izi0.ToMultiFactorAuth) {
                    Bundle bundle = new Bundle();
                    bundle.putString("destination_in_settings", siPCzPFw.lYoM);
                    Intent intent = new Intent(this, (Class<?>) SettingsActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        } catch (Throwable th) {
            itf0.a.f(th, "Error: %s", th.getLocalizedMessage());
        }
        finish();
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class LoadWebViewClient extends WebViewClient {
        private LoadWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            WebViewActivity.this.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            WebViewActivity.this.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.getUrl().toString().contains(WebViewActivity.DEPOSIT_COMPLETED_URL_PATH)) {
                WebViewActivity.this.setResult(-1);
                WebViewActivity.this.finish();
                return true;
            }
            if (!webResourceRequest.getUrl().toString().contains(WebViewActivity.DEPOSIT_CLOSE_URL_PATH)) {
                return false;
            }
            WebViewActivity.this.finish();
            return true;
        }

        public /* synthetic */ LoadWebViewClient(WebViewActivity webViewActivity, int i) {
            this();
        }
    }

    @Override // com.sportybet.plugin.webcontainer.activities.BaseActivity, android.app.Activity
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.webViewTitle = charSequence.toString();
        if (isPromotionDetailsPage()) {
            this.webViewViewModel.onShareButtonEvent(new w430.e(this.webViewTitle));
        }
    }
}
