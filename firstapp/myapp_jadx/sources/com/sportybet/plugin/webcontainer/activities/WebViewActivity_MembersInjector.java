package com.sportybet.plugin.webcontainer.activities;

import android.webkit.CookieManager;
import com.sportybet.plugin.webcontainer.callback.LDWebViewClient;
import com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService;
import defpackage.c0n;
import defpackage.cbg;
import defpackage.evp;
import defpackage.g9j;
import defpackage.gtm;
import defpackage.gzm;
import defpackage.hze;
import defpackage.i0j0;
import defpackage.iym;
import defpackage.jch0;
import defpackage.l730;
import defpackage.met;
import defpackage.mgb0;
import defpackage.mrm;
import defpackage.oje0;
import defpackage.psm;
import defpackage.r1k;
import defpackage.str;
import defpackage.sym;
import defpackage.tlv;
import defpackage.tta;
import defpackage.uqm;
import defpackage.y8j;
import defpackage.yi5;

/* JADX INFO: loaded from: classes5.dex */
public final class WebViewActivity_MembersInjector implements tlv<WebViewActivity> {
    private final l730<uqm> accountHelperProvider;
    private final l730<mgb0> accountManagerProvider;
    private final l730<mrm> betslipManagerProvider;
    private final l730<yi5> buildConfigurationProvider;
    private final l730<String> cloudflareUrlProvider;
    private final l730<tta> confirmNameDialogLauncherProvider;
    private final l730<CookieManager> cookieManagerLazyProvider;
    private final l730<psm> countryButlerProvider;
    private final l730<psm> countryManagerProvider;
    private final l730<cbg> environmentManagerProvider;
    private final l730<cbg> environmentManagerProvider2;
    private final l730<gtm> foregroundProvider;
    private final l730<y8j> fullStoryCommonManagerProvider;
    private final l730<y8j> fullStoryCommonManagerProvider2;
    private final l730<g9j> fullStoryFragmentManagerProvider;
    private final l730<JSPluginService> jsPluginServiceProvider;
    private final l730<LDWebViewClient.Factory> ldWebViewClientFactoryProvider;
    private final l730<evp.a> ldjsServiceFactoryProvider;
    private final l730<met> locationHelperFactoryProvider;
    private final l730<iym> openTelemetryLoggerProvider;
    private final l730<sym> popupQueueOverlayManagerProvider;
    private final l730<gzm> sportyDeskManagerProvider;
    private final l730<oje0> surveyWebViewManagerProvider;
    private final l730<jch0> uiInteractionObserverProvider;
    private final l730<c0n> urlToolProvider;
    private final l730<i0j0> webViewWrapperServiceProvider;

    private WebViewActivity_MembersInjector(l730<y8j> l730Var, l730<g9j> l730Var2, l730<jch0> l730Var3, l730<psm> l730Var4, l730<gtm> l730Var5, l730<met> l730Var6, l730<mrm> l730Var7, l730<gzm> l730Var8, l730<sym> l730Var9, l730<i0j0> l730Var10, l730<String> l730Var11, l730<oje0> l730Var12, l730<tta> l730Var13, l730<mgb0> l730Var14, l730<evp.a> l730Var15, l730<LDWebViewClient.Factory> l730Var16, l730<cbg> l730Var17, l730<uqm> l730Var18, l730<psm> l730Var19, l730<c0n> l730Var20, l730<iym> l730Var21, l730<CookieManager> l730Var22, l730<y8j> l730Var23, l730<JSPluginService> l730Var24, l730<cbg> l730Var25, l730<yi5> l730Var26) {
        this.fullStoryCommonManagerProvider = l730Var;
        this.fullStoryFragmentManagerProvider = l730Var2;
        this.uiInteractionObserverProvider = l730Var3;
        this.countryManagerProvider = l730Var4;
        this.foregroundProvider = l730Var5;
        this.locationHelperFactoryProvider = l730Var6;
        this.betslipManagerProvider = l730Var7;
        this.sportyDeskManagerProvider = l730Var8;
        this.popupQueueOverlayManagerProvider = l730Var9;
        this.webViewWrapperServiceProvider = l730Var10;
        this.cloudflareUrlProvider = l730Var11;
        this.surveyWebViewManagerProvider = l730Var12;
        this.confirmNameDialogLauncherProvider = l730Var13;
        this.accountManagerProvider = l730Var14;
        this.ldjsServiceFactoryProvider = l730Var15;
        this.ldWebViewClientFactoryProvider = l730Var16;
        this.environmentManagerProvider = l730Var17;
        this.accountHelperProvider = l730Var18;
        this.countryButlerProvider = l730Var19;
        this.urlToolProvider = l730Var20;
        this.openTelemetryLoggerProvider = l730Var21;
        this.cookieManagerLazyProvider = l730Var22;
        this.fullStoryCommonManagerProvider2 = l730Var23;
        this.jsPluginServiceProvider = l730Var24;
        this.environmentManagerProvider2 = l730Var25;
        this.buildConfigurationProvider = l730Var26;
    }

    public static tlv<WebViewActivity> create(l730<y8j> l730Var, l730<g9j> l730Var2, l730<jch0> l730Var3, l730<psm> l730Var4, l730<gtm> l730Var5, l730<met> l730Var6, l730<mrm> l730Var7, l730<gzm> l730Var8, l730<sym> l730Var9, l730<i0j0> l730Var10, l730<String> l730Var11, l730<oje0> l730Var12, l730<tta> l730Var13, l730<mgb0> l730Var14, l730<evp.a> l730Var15, l730<LDWebViewClient.Factory> l730Var16, l730<cbg> l730Var17, l730<uqm> l730Var18, l730<psm> l730Var19, l730<c0n> l730Var20, l730<iym> l730Var21, l730<CookieManager> l730Var22, l730<y8j> l730Var23, l730<JSPluginService> l730Var24, l730<cbg> l730Var25, l730<yi5> l730Var26) {
        return new WebViewActivity_MembersInjector(l730Var, l730Var2, l730Var3, l730Var4, l730Var5, l730Var6, l730Var7, l730Var8, l730Var9, l730Var10, l730Var11, l730Var12, l730Var13, l730Var14, l730Var15, l730Var16, l730Var17, l730Var18, l730Var19, l730Var20, l730Var21, l730Var22, l730Var23, l730Var24, l730Var25, l730Var26);
    }

    public static void injectAccountHelper(WebViewActivity webViewActivity, uqm uqmVar) {
        webViewActivity.accountHelper = uqmVar;
    }

    public static void injectBuildConfiguration(WebViewActivity webViewActivity, yi5 yi5Var) {
        webViewActivity.buildConfiguration = yi5Var;
    }

    public static void injectCookieManagerLazy(WebViewActivity webViewActivity, str<CookieManager> strVar) {
        webViewActivity.cookieManagerLazy = strVar;
    }

    public static void injectCountryButler(WebViewActivity webViewActivity, psm psmVar) {
        webViewActivity.countryButler = psmVar;
    }

    public static void injectEnvironmentManager(WebViewActivity webViewActivity, cbg cbgVar) {
        webViewActivity.environmentManager = cbgVar;
    }

    public static void injectFullStoryCommonManager(WebViewActivity webViewActivity, y8j y8jVar) {
        webViewActivity.fullStoryCommonManager = y8jVar;
    }

    public static void injectJsPluginService(WebViewActivity webViewActivity, JSPluginService jSPluginService) {
        webViewActivity.jsPluginService = jSPluginService;
    }

    public static void injectOpenTelemetryLogger(WebViewActivity webViewActivity, iym iymVar) {
        webViewActivity.openTelemetryLogger = iymVar;
    }

    public static void injectUrlTool(WebViewActivity webViewActivity, c0n c0nVar) {
        webViewActivity.urlTool = c0nVar;
    }

    public void injectMembers(WebViewActivity webViewActivity) {
        ((r1k) webViewActivity).fullStoryCommonManager = this.fullStoryCommonManagerProvider.get();
        webViewActivity.fullStoryFragmentManager = this.fullStoryFragmentManagerProvider.get();
        webViewActivity.uiInteractionObserver = this.uiInteractionObserverProvider.get();
        webViewActivity.countryManager = this.countryManagerProvider.get();
        webViewActivity.foreground = this.foregroundProvider.get();
        webViewActivity.locationHelperFactory = this.locationHelperFactoryProvider.get();
        webViewActivity.betslipManager = this.betslipManagerProvider.get();
        webViewActivity.sportyDeskManager = this.sportyDeskManagerProvider.get();
        webViewActivity.popupQueueOverlayManager = this.popupQueueOverlayManagerProvider.get();
        webViewActivity.webViewWrapperService = this.webViewWrapperServiceProvider.get();
        webViewActivity.cloudflareUrl = hze.a(this.cloudflareUrlProvider);
        webViewActivity.surveyWebViewManager = this.surveyWebViewManagerProvider.get();
        webViewActivity.confirmNameDialogLauncher = this.confirmNameDialogLauncherProvider.get();
        webViewActivity.accountManager = this.accountManagerProvider.get();
        BaseWebViewActivity_MembersInjector.injectLdjsServiceFactory(webViewActivity, this.ldjsServiceFactoryProvider.get());
        BaseWebViewActivity_MembersInjector.injectLdWebViewClientFactory(webViewActivity, this.ldWebViewClientFactoryProvider.get());
        BaseWebViewActivity_MembersInjector.injectEnvironmentManager(webViewActivity, this.environmentManagerProvider.get());
        injectAccountHelper(webViewActivity, this.accountHelperProvider.get());
        injectCountryButler(webViewActivity, this.countryButlerProvider.get());
        injectUrlTool(webViewActivity, this.urlToolProvider.get());
        injectOpenTelemetryLogger(webViewActivity, this.openTelemetryLoggerProvider.get());
        injectCookieManagerLazy(webViewActivity, hze.a(this.cookieManagerLazyProvider));
        injectFullStoryCommonManager(webViewActivity, this.fullStoryCommonManagerProvider2.get());
        injectJsPluginService(webViewActivity, this.jsPluginServiceProvider.get());
        injectEnvironmentManager(webViewActivity, this.environmentManagerProvider2.get());
        injectBuildConfiguration(webViewActivity, this.buildConfigurationProvider.get());
    }
}
