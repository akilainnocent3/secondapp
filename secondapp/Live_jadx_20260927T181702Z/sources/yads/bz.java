package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v80 yads.bz[], still in use, count: 1, list:
  (r0v80 yads.bz[]) from 0x06a3: INVOKE (r0v80 yads.bz[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:1700)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bz {
    f147405c("SdkConfigurationExpiredDate"),
    f147407d("SdkConfigurationMraidUrl"),
    f147409e("SdkConfigurationOmSdkControllerUrl"),
    f147411f("CustomClickHandlingEnabled"),
    f147413g("AdIdsStorageSize"),
    f147415h("SdkConfigurationVisibilityErrorIndicatorEnabled"),
    f147417i("SdkConfigurationLibraryVersion"),
    f147419j("SdkConfigurationMediationSensitiveModeDisabled"),
    f147421k("SdkConfigurationSensitiveModeDisabled"),
    f147423l("SdkConfigurationFusedLocationProviderDisabled"),
    f147425m("SdkConfigurationLockScreenEnabled"),
    f147427n("SdkConfigurationUserConsent"),
    f147429o("SdkConfigurationLegacyVisibilityLogicEnabled"),
    f147431p("SdkConfigurationLegacyVastTrackingEnabled"),
    f147433q("SdkConfigurationOverlappingVisibilityTrackingEnabled"),
    f147435r("SdkConfigurationOverlappingWindowTrackingEnabled"),
    f147437s("SdkConfigurationAdRequestMaxRetries"),
    f147439t("SdkConfigurationPingRequestMaxRetries"),
    f147441u("SdkConfigurationImpressionValidationOnClickEnabled"),
    f147443v("SdkConfigurationLegacySliderImpressionEnabled"),
    f147445w("SdkConfigurationShowVersionValidationErrorLog"),
    f147447x("SdkConfigurationShowVersionValidationErrorIndicator"),
    f147449y("SdkConfigurationInstreamDesign"),
    f147451z("SdkConfigurationFullScreenBackButtonEnabled"),
    A("SdkConfigurationOpenMeasurementSdkDisabled"),
    B("SdkConfigurationNativeWebViewPoolSize"),
    C("SdkConfigurationMaxDiskCacheSizeBytesForVideo"),
    D("SdkConfigurationMaxDiskCacheSizeBytesForRequestQueue"),
    E("SdkConfigurationPublicEncryptionKey"),
    F("SdkConfigurationPublicEncryptionVersion"),
    G("SdkConfigurationEcpmImpressionCallbackDisabled"),
    H("SdkConfigurationCloseFullscreenWithAdtuneDisabled"),
    I("SdkConfigurationDivkitisabled"),
    J("SdkConfigurationLocationConsent"),
    K("SdkConfigurationClientBiddingStartupInitializationEnabled"),
    L("SdkConfigurationHeaderBiddingStartupInitializationEnabled"),
    M("SdkConfigurationLibSSLEnabled"),
    N("SdkConfigurationEncryptedRequestsEnabled"),
    O("SdkConfigurationRenderAssetValidationEnabled"),
    P("SdkConfigurationClickHandlerType"),
    Q("SdkConfigurationHardSensitiveModeEnabled"),
    R("SdkConfigurationAgeRestrictedUser"),
    S("SdkConfigurationHost"),
    T("DivkitFont"),
    U("SdkConfigurationAutomaticSdkInitializationDelayEnabled"),
    V("NativeBannerEnabled"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("UseNewBindingApiForDivkit"),
    W("UseDivkitCloseActionInsteadSystemClick"),
    X("BannerSizeCalculationType"),
    Y("StartupVersion"),
    Z("StartupParameters"),
    f147403a0("AppOpenAdPreloadingEnabled"),
    f147404b0("InterstitialPreloadingEnabled"),
    f147406c0("RewardedPreloadingEnabled"),
    f147408d0("NewFalseClickTrackingEnabled"),
    f147410e0("VarioqubEnabled"),
    f147412f0("CrashTrackerEnabled"),
    f147414g0("ErrorTrackerEnabled"),
    f147416h0("AnrTrackerEnabled"),
    f147418i0("AnrTrackerInterval"),
    f147420j0("AnrTrackerThreshold"),
    f147422k0("ExitInfoAnrTrackerEnabled"),
    f147424l0("ExitInfoAnrTrackerMaxResults"),
    f147426m0("ExitInfoAnrTrackerHistoricalThresholdDays"),
    f147428n0("ExitInfoAnrTrackerEnrichedTraces"),
    f147430o0("CrashIgnoreEnabled"),
    f147432p0("CrashStackTraceExclusionRules"),
    f147434q0("TimeStampingTrackingUrlsEnabled"),
    f147436r0("AppAdAnalyticsReportingEnabled"),
    f147438s0("AppMetricaEasyIntegrationAutoActivationDisabled"),
    f147440t0("SdkConfigurationNetworkThreadPoolSize"),
    f147442u0("SdkConfigurationImageLoadingThreadPoolSize"),
    f147444v0("SdkConfigurationTimeoutIntervalForRequest"),
    f147446w0("SdkConfigurationTimeoutIntervalForPingRequest"),
    f147448x0("QualityAdVerificationConfiguration"),
    f147450y0("SdkTrackingReporterEnabled"),
    f147452z0("SdkConfigurationFallbackHosts"),
    A0("ShouldPrefetchDns"),
    B0("ShouldUseAdRenderedWebViewCallback"),
    C0("OutstreamWrapperVideoSupported"),
    D0("ValidateClickInWebView"),
    E0("PassFullScreenHeightFromSdkEnabled"),
    F0("SdkConfigurationInstreamQrcodeSizeInPx"),
    G0("HideBottomNavigationBar"),
    H0("PreWarmWebViewOnBackground"),
    I0("SdkConfigurationFont"),
    J0("ForceDefaultPlayer"),
    K0("SessionToken"),
    L0("UseMedia3"),
    M0("SupportGif"),
    N0("PlaybackOptimizationConfig");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147453b;

    static {
        sr.c.c(bzVarArr);
    }

    public bz(String str) {
        super(str, i);
        this.f147453b = str;
    }

    public static bz valueOf(String str) {
        return (bz) Enum.valueOf(bz.class, str);
    }

    public static bz[] values() {
        return (bz[]) O0.clone();
    }

    public final String a() {
        return this.f147453b;
    }
}
