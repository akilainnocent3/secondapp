package com.sportybet.android.auth;

import defpackage.fi80;
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
import defpackage.num;
import defpackage.oje0;
import defpackage.psm;
import defpackage.py1;
import defpackage.r1k;
import defpackage.rdd0;
import defpackage.rw40;
import defpackage.sym;
import defpackage.tlv;
import defpackage.tta;
import defpackage.v5;
import defpackage.xxz;
import defpackage.y8j;
import defpackage.zuz;

/* JADX INFO: loaded from: classes5.dex */
public final class AuthActivity_MembersInjector implements tlv<AuthActivity> {
    private final l730<v5> accRegistrationHelperProvider;
    private final l730<mgb0> accountManagerProvider;
    private final l730<mrm> betslipManagerProvider;
    private final l730<String> cloudflareUrlProvider;
    private final l730<tta> confirmNameDialogLauncherProvider;
    private final l730<psm> countryManagerProvider;
    private final l730<psm> countryManagerProvider2;
    private final l730<gtm> foregroundProvider;
    private final l730<y8j> fullStoryCommonManagerProvider;
    private final l730<y8j> fullStoryCommonManagerProvider2;
    private final l730<g9j> fullStoryFragmentManagerProvider;
    private final l730<num> localEventsProvider;
    private final l730<met> locationHelperFactoryProvider;
    private final l730<com.sporty.android.platform.features.newotp.util.a> otpModuleFactoryProvider;
    private final l730<zuz> passwordEntryNavigatorProvider;
    private final l730<xxz> patronApiServiceProvider;
    private final l730<sym> popupQueueOverlayManagerProvider;
    private final l730<fi80> setPasswordV2ManagerProvider;
    private final l730<gzm> sportyDeskManagerProvider;
    private final l730<rdd0> sportyTrackingUseCaseProvider;
    private final l730<oje0> surveyWebViewManagerProvider;
    private final l730<jch0> uiInteractionObserverProvider;
    private final l730<i0j0> webViewWrapperServiceProvider;

    private AuthActivity_MembersInjector(l730<y8j> l730Var, l730<g9j> l730Var2, l730<jch0> l730Var3, l730<psm> l730Var4, l730<gtm> l730Var5, l730<met> l730Var6, l730<mrm> l730Var7, l730<gzm> l730Var8, l730<sym> l730Var9, l730<i0j0> l730Var10, l730<String> l730Var11, l730<oje0> l730Var12, l730<tta> l730Var13, l730<mgb0> l730Var14, l730<xxz> l730Var15, l730<v5> l730Var16, l730<rdd0> l730Var17, l730<num> l730Var18, l730<psm> l730Var19, l730<com.sporty.android.platform.features.newotp.util.a> l730Var20, l730<y8j> l730Var21, l730<zuz> l730Var22, l730<fi80> l730Var23) {
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
        this.localEventsProvider = l730Var18;
        this.countryManagerProvider2 = l730Var19;
        this.otpModuleFactoryProvider = l730Var20;
        this.fullStoryCommonManagerProvider2 = l730Var21;
        this.passwordEntryNavigatorProvider = l730Var22;
        this.setPasswordV2ManagerProvider = l730Var23;
    }

    public static tlv<AuthActivity> create(l730<y8j> l730Var, l730<g9j> l730Var2, l730<jch0> l730Var3, l730<psm> l730Var4, l730<gtm> l730Var5, l730<met> l730Var6, l730<mrm> l730Var7, l730<gzm> l730Var8, l730<sym> l730Var9, l730<i0j0> l730Var10, l730<String> l730Var11, l730<oje0> l730Var12, l730<tta> l730Var13, l730<mgb0> l730Var14, l730<xxz> l730Var15, l730<v5> l730Var16, l730<rdd0> l730Var17, l730<num> l730Var18, l730<psm> l730Var19, l730<com.sporty.android.platform.features.newotp.util.a> l730Var20, l730<y8j> l730Var21, l730<zuz> l730Var22, l730<fi80> l730Var23) {
        return new AuthActivity_MembersInjector(l730Var, l730Var2, l730Var3, l730Var4, l730Var5, l730Var6, l730Var7, l730Var8, l730Var9, l730Var10, l730Var11, l730Var12, l730Var13, l730Var14, l730Var15, l730Var16, l730Var17, l730Var18, l730Var19, l730Var20, l730Var21, l730Var22, l730Var23);
    }

    public static void injectCountryManager(AuthActivity authActivity, psm psmVar) {
        authActivity.countryManager = psmVar;
    }

    public static void injectFullStoryCommonManager(AuthActivity authActivity, y8j y8jVar) {
        authActivity.fullStoryCommonManager = y8jVar;
    }

    public static void injectLocalEvents(AuthActivity authActivity, num numVar) {
        authActivity.localEvents = numVar;
    }

    public static void injectOtpModuleFactory(AuthActivity authActivity, com.sporty.android.platform.features.newotp.util.a aVar) {
        authActivity.otpModuleFactory = aVar;
    }

    public static void injectPasswordEntryNavigator(AuthActivity authActivity, zuz zuzVar) {
        authActivity.passwordEntryNavigator = zuzVar;
    }

    public static void injectSetPasswordV2Manager(AuthActivity authActivity, fi80 fi80Var) {
        authActivity.setPasswordV2Manager = fi80Var;
    }

    public void injectMembers(AuthActivity authActivity) {
        ((r1k) authActivity).fullStoryCommonManager = this.fullStoryCommonManagerProvider.get();
        authActivity.fullStoryFragmentManager = this.fullStoryFragmentManagerProvider.get();
        authActivity.uiInteractionObserver = this.uiInteractionObserverProvider.get();
        ((py1) authActivity).countryManager = this.countryManagerProvider.get();
        authActivity.foreground = this.foregroundProvider.get();
        authActivity.locationHelperFactory = this.locationHelperFactoryProvider.get();
        authActivity.betslipManager = this.betslipManagerProvider.get();
        authActivity.sportyDeskManager = this.sportyDeskManagerProvider.get();
        authActivity.popupQueueOverlayManager = this.popupQueueOverlayManagerProvider.get();
        authActivity.webViewWrapperService = this.webViewWrapperServiceProvider.get();
        authActivity.cloudflareUrl = hze.a(this.cloudflareUrlProvider);
        authActivity.surveyWebViewManager = this.surveyWebViewManagerProvider.get();
        authActivity.confirmNameDialogLauncher = this.confirmNameDialogLauncherProvider.get();
        authActivity.accountManager = this.accountManagerProvider.get();
        rw40.a(authActivity, this.patronApiServiceProvider.get());
        BaseAccountAuthenticatorActivity_MembersInjector.injectAccRegistrationHelper(authActivity, this.accRegistrationHelperProvider.get());
        BaseAccountAuthenticatorActivity_MembersInjector.injectSportyTrackingUseCase(authActivity, this.sportyTrackingUseCaseProvider.get());
        injectLocalEvents(authActivity, this.localEventsProvider.get());
        injectCountryManager(authActivity, this.countryManagerProvider2.get());
        injectOtpModuleFactory(authActivity, this.otpModuleFactoryProvider.get());
        injectFullStoryCommonManager(authActivity, this.fullStoryCommonManagerProvider2.get());
        injectPasswordEntryNavigator(authActivity, this.passwordEntryNavigatorProvider.get());
        injectSetPasswordV2Manager(authActivity, this.setPasswordV2ManagerProvider.get());
    }
}
