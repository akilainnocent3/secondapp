package com.sportybet.plugin.webcontainer.activities;

import com.sportybet.plugin.webcontainer.callback.LDWebViewClient;
import defpackage.cbg;
import defpackage.evp;
import defpackage.g9j;
import defpackage.gtm;
import defpackage.gzm;
import defpackage.hze;
import defpackage.i0j0;
import defpackage.jch0;
import defpackage.l730;
import defpackage.met;
import defpackage.mgb0;
import defpackage.mrm;
import defpackage.oje0;
import defpackage.psm;
import defpackage.sym;
import defpackage.tlv;
import defpackage.tta;
import defpackage.y8j;

/* JADX INFO: loaded from: classes5.dex */
public final class BaseWebViewActivity_MembersInjector implements tlv<BaseWebViewActivity> {
    private final l730<mgb0> accountManagerProvider;
    private final l730<mrm> betslipManagerProvider;
    private final l730<String> cloudflareUrlProvider;
    private final l730<tta> confirmNameDialogLauncherProvider;
    private final l730<psm> countryManagerProvider;
    private final l730<cbg> environmentManagerProvider;
    private final l730<gtm> foregroundProvider;
    private final l730<y8j> fullStoryCommonManagerProvider;
    private final l730<g9j> fullStoryFragmentManagerProvider;
    private final l730<LDWebViewClient.Factory> ldWebViewClientFactoryProvider;
    private final l730<evp.a> ldjsServiceFactoryProvider;
    private final l730<met> locationHelperFactoryProvider;
    private final l730<sym> popupQueueOverlayManagerProvider;
    private final l730<gzm> sportyDeskManagerProvider;
    private final l730<oje0> surveyWebViewManagerProvider;
    private final l730<jch0> uiInteractionObserverProvider;
    private final l730<i0j0> webViewWrapperServiceProvider;

    private BaseWebViewActivity_MembersInjector(l730<y8j> l730Var, l730<g9j> l730Var2, l730<jch0> l730Var3, l730<psm> l730Var4, l730<gtm> l730Var5, l730<met> l730Var6, l730<mrm> l730Var7, l730<gzm> l730Var8, l730<sym> l730Var9, l730<i0j0> l730Var10, l730<String> l730Var11, l730<oje0> l730Var12, l730<tta> l730Var13, l730<mgb0> l730Var14, l730<evp.a> l730Var15, l730<LDWebViewClient.Factory> l730Var16, l730<cbg> l730Var17) {
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
    }

    public static tlv<BaseWebViewActivity> create(l730<y8j> l730Var, l730<g9j> l730Var2, l730<jch0> l730Var3, l730<psm> l730Var4, l730<gtm> l730Var5, l730<met> l730Var6, l730<mrm> l730Var7, l730<gzm> l730Var8, l730<sym> l730Var9, l730<i0j0> l730Var10, l730<String> l730Var11, l730<oje0> l730Var12, l730<tta> l730Var13, l730<mgb0> l730Var14, l730<evp.a> l730Var15, l730<LDWebViewClient.Factory> l730Var16, l730<cbg> l730Var17) {
        return new BaseWebViewActivity_MembersInjector(l730Var, l730Var2, l730Var3, l730Var4, l730Var5, l730Var6, l730Var7, l730Var8, l730Var9, l730Var10, l730Var11, l730Var12, l730Var13, l730Var14, l730Var15, l730Var16, l730Var17);
    }

    public static void injectEnvironmentManager(BaseWebViewActivity baseWebViewActivity, cbg cbgVar) {
        baseWebViewActivity.environmentManager = cbgVar;
    }

    public static void injectLdWebViewClientFactory(BaseWebViewActivity baseWebViewActivity, LDWebViewClient.Factory factory) {
        baseWebViewActivity.ldWebViewClientFactory = factory;
    }

    public static void injectLdjsServiceFactory(BaseWebViewActivity baseWebViewActivity, evp.a aVar) {
        baseWebViewActivity.ldjsServiceFactory = aVar;
    }

    public void injectMembers(BaseWebViewActivity baseWebViewActivity) {
        baseWebViewActivity.fullStoryCommonManager = this.fullStoryCommonManagerProvider.get();
        baseWebViewActivity.fullStoryFragmentManager = this.fullStoryFragmentManagerProvider.get();
        baseWebViewActivity.uiInteractionObserver = this.uiInteractionObserverProvider.get();
        baseWebViewActivity.countryManager = this.countryManagerProvider.get();
        baseWebViewActivity.foreground = this.foregroundProvider.get();
        baseWebViewActivity.locationHelperFactory = this.locationHelperFactoryProvider.get();
        baseWebViewActivity.betslipManager = this.betslipManagerProvider.get();
        baseWebViewActivity.sportyDeskManager = this.sportyDeskManagerProvider.get();
        baseWebViewActivity.popupQueueOverlayManager = this.popupQueueOverlayManagerProvider.get();
        baseWebViewActivity.webViewWrapperService = this.webViewWrapperServiceProvider.get();
        baseWebViewActivity.cloudflareUrl = hze.a(this.cloudflareUrlProvider);
        baseWebViewActivity.surveyWebViewManager = this.surveyWebViewManagerProvider.get();
        baseWebViewActivity.confirmNameDialogLauncher = this.confirmNameDialogLauncherProvider.get();
        baseWebViewActivity.accountManager = this.accountManagerProvider.get();
        injectLdjsServiceFactory(baseWebViewActivity, this.ldjsServiceFactoryProvider.get());
        injectLdWebViewClientFactory(baseWebViewActivity, this.ldWebViewClientFactoryProvider.get());
        injectEnvironmentManager(baseWebViewActivity, this.environmentManagerProvider.get());
    }
}
