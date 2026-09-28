package com.sportybet.plugin.webcontainer.fragments;

import android.webkit.CookieManager;
import com.sportybet.plugin.webcontainer.callback.LDGoBackWebViewClient;
import com.sportybet.plugin.webcontainer.callback.LDWebViewClient;
import com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService;
import defpackage.c0n;
import defpackage.cbg;
import defpackage.evp;
import defpackage.hze;
import defpackage.l730;
import defpackage.psm;
import defpackage.str;
import defpackage.tlv;
import defpackage.uqm;

/* JADX INFO: loaded from: classes5.dex */
public final class WebViewBottomSheetFragment_MembersInjector implements tlv<WebViewBottomSheetFragment> {
    private final l730<uqm> accountHelperProvider;
    private final l730<CookieManager> cookieManagerLazyProvider;
    private final l730<psm> countryButlerProvider;
    private final l730<cbg> environmentManagerProvider;
    private final l730<JSPluginService> jsPluginServiceProvider;
    private final l730<LDWebViewClient.Factory> ldWebViewClientFactoryProvider;
    private final l730<evp.a> ldjsServiceFactoryProvider;
    private final l730<LDGoBackWebViewClient.Factory> stayOnPageClientFactoryProvider;
    private final l730<c0n> urlToolProvider;

    private WebViewBottomSheetFragment_MembersInjector(l730<uqm> l730Var, l730<psm> l730Var2, l730<c0n> l730Var3, l730<CookieManager> l730Var4, l730<cbg> l730Var5, l730<evp.a> l730Var6, l730<LDWebViewClient.Factory> l730Var7, l730<LDGoBackWebViewClient.Factory> l730Var8, l730<JSPluginService> l730Var9) {
        this.accountHelperProvider = l730Var;
        this.countryButlerProvider = l730Var2;
        this.urlToolProvider = l730Var3;
        this.cookieManagerLazyProvider = l730Var4;
        this.environmentManagerProvider = l730Var5;
        this.ldjsServiceFactoryProvider = l730Var6;
        this.ldWebViewClientFactoryProvider = l730Var7;
        this.stayOnPageClientFactoryProvider = l730Var8;
        this.jsPluginServiceProvider = l730Var9;
    }

    public static tlv<WebViewBottomSheetFragment> create(l730<uqm> l730Var, l730<psm> l730Var2, l730<c0n> l730Var3, l730<CookieManager> l730Var4, l730<cbg> l730Var5, l730<evp.a> l730Var6, l730<LDWebViewClient.Factory> l730Var7, l730<LDGoBackWebViewClient.Factory> l730Var8, l730<JSPluginService> l730Var9) {
        return new WebViewBottomSheetFragment_MembersInjector(l730Var, l730Var2, l730Var3, l730Var4, l730Var5, l730Var6, l730Var7, l730Var8, l730Var9);
    }

    public static void injectAccountHelper(WebViewBottomSheetFragment webViewBottomSheetFragment, uqm uqmVar) {
        webViewBottomSheetFragment.accountHelper = uqmVar;
    }

    public static void injectCookieManagerLazy(WebViewBottomSheetFragment webViewBottomSheetFragment, str<CookieManager> strVar) {
        webViewBottomSheetFragment.cookieManagerLazy = strVar;
    }

    public static void injectCountryButler(WebViewBottomSheetFragment webViewBottomSheetFragment, psm psmVar) {
        webViewBottomSheetFragment.countryButler = psmVar;
    }

    public static void injectEnvironmentManager(WebViewBottomSheetFragment webViewBottomSheetFragment, cbg cbgVar) {
        webViewBottomSheetFragment.environmentManager = cbgVar;
    }

    public static void injectJsPluginService(WebViewBottomSheetFragment webViewBottomSheetFragment, JSPluginService jSPluginService) {
        webViewBottomSheetFragment.jsPluginService = jSPluginService;
    }

    public static void injectLdWebViewClientFactory(WebViewBottomSheetFragment webViewBottomSheetFragment, LDWebViewClient.Factory factory) {
        webViewBottomSheetFragment.ldWebViewClientFactory = factory;
    }

    public static void injectLdjsServiceFactory(WebViewBottomSheetFragment webViewBottomSheetFragment, evp.a aVar) {
        webViewBottomSheetFragment.ldjsServiceFactory = aVar;
    }

    public static void injectStayOnPageClientFactory(WebViewBottomSheetFragment webViewBottomSheetFragment, LDGoBackWebViewClient.Factory factory) {
        webViewBottomSheetFragment.stayOnPageClientFactory = factory;
    }

    public static void injectUrlTool(WebViewBottomSheetFragment webViewBottomSheetFragment, c0n c0nVar) {
        webViewBottomSheetFragment.urlTool = c0nVar;
    }

    public void injectMembers(WebViewBottomSheetFragment webViewBottomSheetFragment) {
        injectAccountHelper(webViewBottomSheetFragment, this.accountHelperProvider.get());
        injectCountryButler(webViewBottomSheetFragment, this.countryButlerProvider.get());
        injectUrlTool(webViewBottomSheetFragment, this.urlToolProvider.get());
        injectCookieManagerLazy(webViewBottomSheetFragment, hze.a(this.cookieManagerLazyProvider));
        injectEnvironmentManager(webViewBottomSheetFragment, this.environmentManagerProvider.get());
        injectLdjsServiceFactory(webViewBottomSheetFragment, this.ldjsServiceFactoryProvider.get());
        injectLdWebViewClientFactory(webViewBottomSheetFragment, this.ldWebViewClientFactoryProvider.get());
        injectStayOnPageClientFactory(webViewBottomSheetFragment, this.stayOnPageClientFactoryProvider.get());
        injectJsPluginService(webViewBottomSheetFragment, this.jsPluginServiceProvider.get());
    }
}
