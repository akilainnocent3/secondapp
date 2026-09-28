package com.sportybet.android.auth;

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
import defpackage.rdd0;
import defpackage.rw40;
import defpackage.sym;
import defpackage.tlv;
import defpackage.tta;
import defpackage.v5;
import defpackage.xxz;
import defpackage.y8j;

/* JADX INFO: loaded from: classes5.dex */
public final class BaseAccountAuthenticatorActivity_MembersInjector implements tlv<BaseAccountAuthenticatorActivity> {
    private final l730<v5> accRegistrationHelperProvider;
    private final l730<mgb0> accountManagerProvider;
    private final l730<mrm> betslipManagerProvider;
    private final l730<String> cloudflareUrlProvider;
    private final l730<tta> confirmNameDialogLauncherProvider;
    private final l730<psm> countryManagerProvider;
    private final l730<gtm> foregroundProvider;
    private final l730<y8j> fullStoryCommonManagerProvider;
    private final l730<g9j> fullStoryFragmentManagerProvider;
    private final l730<met> locationHelperFactoryProvider;
    private final l730<xxz> patronApiServiceProvider;
    private final l730<sym> popupQueueOverlayManagerProvider;
    private final l730<gzm> sportyDeskManagerProvider;
    private final l730<rdd0> sportyTrackingUseCaseProvider;
    private final l730<oje0> surveyWebViewManagerProvider;
    private final l730<jch0> uiInteractionObserverProvider;
    private final l730<i0j0> webViewWrapperServiceProvider;

    private BaseAccountAuthenticatorActivity_MembersInjector(l730<y8j> l730Var, l730<g9j> l730Var2, l730<jch0> l730Var3, l730<psm> l730Var4, l730<gtm> l730Var5, l730<met> l730Var6, l730<mrm> l730Var7, l730<gzm> l730Var8, l730<sym> l730Var9, l730<i0j0> l730Var10, l730<String> l730Var11, l730<oje0> l730Var12, l730<tta> l730Var13, l730<mgb0> l730Var14, l730<xxz> l730Var15, l730<v5> l730Var16, l730<rdd0> l730Var17) {
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
        this.patronApiServiceProvider = l730Var15;
        this.accRegistrationHelperProvider = l730Var16;
        this.sportyTrackingUseCaseProvider = l730Var17;
    }

    public static tlv<BaseAccountAuthenticatorActivity> create(l730<y8j> l730Var, l730<g9j> l730Var2, l730<jch0> l730Var3, l730<psm> l730Var4, l730<gtm> l730Var5, l730<met> l730Var6, l730<mrm> l730Var7, l730<gzm> l730Var8, l730<sym> l730Var9, l730<i0j0> l730Var10, l730<String> l730Var11, l730<oje0> l730Var12, l730<tta> l730Var13, l730<mgb0> l730Var14, l730<xxz> l730Var15, l730<v5> l730Var16, l730<rdd0> l730Var17) {
        return new BaseAccountAuthenticatorActivity_MembersInjector(l730Var, l730Var2, l730Var3, l730Var4, l730Var5, l730Var6, l730Var7, l730Var8, l730Var9, l730Var10, l730Var11, l730Var12, l730Var13, l730Var14, l730Var15, l730Var16, l730Var17);
    }

    public static void injectAccRegistrationHelper(BaseAccountAuthenticatorActivity baseAccountAuthenticatorActivity, v5 v5Var) {
        baseAccountAuthenticatorActivity.accRegistrationHelper = v5Var;
    }

    public static void injectSportyTrackingUseCase(BaseAccountAuthenticatorActivity baseAccountAuthenticatorActivity, rdd0 rdd0Var) {
        baseAccountAuthenticatorActivity.sportyTrackingUseCase = rdd0Var;
    }

    public void injectMembers(BaseAccountAuthenticatorActivity baseAccountAuthenticatorActivity) {
        baseAccountAuthenticatorActivity.fullStoryCommonManager = this.fullStoryCommonManagerProvider.get();
        baseAccountAuthenticatorActivity.fullStoryFragmentManager = this.fullStoryFragmentManagerProvider.get();
        baseAccountAuthenticatorActivity.uiInteractionObserver = this.uiInteractionObserverProvider.get();
        baseAccountAuthenticatorActivity.countryManager = this.countryManagerProvider.get();
        baseAccountAuthenticatorActivity.foreground = this.foregroundProvider.get();
        baseAccountAuthenticatorActivity.locationHelperFactory = this.locationHelperFactoryProvider.get();
        baseAccountAuthenticatorActivity.betslipManager = this.betslipManagerProvider.get();
        baseAccountAuthenticatorActivity.sportyDeskManager = this.sportyDeskManagerProvider.get();
        baseAccountAuthenticatorActivity.popupQueueOverlayManager = this.popupQueueOverlayManagerProvider.get();
        baseAccountAuthenticatorActivity.webViewWrapperService = this.webViewWrapperServiceProvider.get();
        baseAccountAuthenticatorActivity.cloudflareUrl = hze.a(this.cloudflareUrlProvider);
        baseAccountAuthenticatorActivity.surveyWebViewManager = this.surveyWebViewManagerProvider.get();
        baseAccountAuthenticatorActivity.confirmNameDialogLauncher = this.confirmNameDialogLauncherProvider.get();
        baseAccountAuthenticatorActivity.accountManager = this.accountManagerProvider.get();
        rw40.a(baseAccountAuthenticatorActivity, this.patronApiServiceProvider.get());
        injectAccRegistrationHelper(baseAccountAuthenticatorActivity, this.accRegistrationHelperProvider.get());
        injectSportyTrackingUseCase(baseAccountAuthenticatorActivity, this.sportyTrackingUseCaseProvider.get());
    }
}
