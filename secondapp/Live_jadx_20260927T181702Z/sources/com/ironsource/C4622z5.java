package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.z5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4622z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final C4622z5 f64557a = new C4622z5();

    private C4622z5() {
    }

    public static /* synthetic */ IronSourceError a(C4622z5 c4622z5, EnumC4257e8 enumC4257e8, IronSourceError ironSourceError, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            ironSourceError = null;
        }
        return c4622z5.a(enumC4257e8, ironSourceError);
    }

    @oy.l
    public final IronSourceError b() {
        return a(this, EnumC4257e8.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    @oy.l
    public final IronSourceError c() {
        return a(this, EnumC4257e8.ISErrorInitInvalidResponse, null, 2, null);
    }

    @oy.l
    public final IronSourceError d() {
        return a(this, EnumC4257e8.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    @oy.l
    public final IronSourceError e() {
        return a(this, EnumC4257e8.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    @oy.l
    public final IronSourceError f() {
        return a(this, EnumC4257e8.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    @oy.l
    public final IronSourceError g() {
        return a(this, EnumC4257e8.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    @oy.l
    public final IronSourceError h() {
        return a(this, EnumC4257e8.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    @oy.l
    public final IronSourceError i() {
        return a(this, EnumC4257e8.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    @oy.l
    public final IronSourceError j() {
        return a(this, EnumC4257e8.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    @oy.l
    public final IronSourceError k() {
        return a(this, EnumC4257e8.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    @oy.l
    public final IronSourceError l() {
        return a(this, EnumC4257e8.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    @oy.l
    public final IronSourceError m() {
        return a(this, EnumC4257e8.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    @oy.l
    public final IronSourceError n() {
        return a(this, EnumC4257e8.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    @oy.l
    public final IronSourceError o() {
        return a(this, EnumC4257e8.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    @oy.l
    public final IronSourceError p() {
        return a(this, EnumC4257e8.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    @oy.l
    public final IronSourceError q() {
        return a(this, EnumC4257e8.ISErrorLoadNullADM, null, 2, null);
    }

    @oy.l
    public final IronSourceError r() {
        return a(this, EnumC4257e8.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    @oy.l
    public final IronSourceError s() {
        return a(this, EnumC4257e8.ISErrorLoadTimedOut, null, 2, null);
    }

    @oy.l
    public final IronSourceError t() {
        return a(this, EnumC4257e8.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    private final IronSourceError a(EnumC4257e8 enumC4257e8, IronSourceError ironSourceError) {
        String strC;
        if (ironSourceError != null) {
            strC = enumC4257e8.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + ":" + ironSourceError.getErrorMessage() + "'";
        } else {
            strC = enumC4257e8.c();
        }
        return new IronSourceError(enumC4257e8.b(), strC);
    }

    @oy.l
    public final IronSourceError b(@oy.l IronSourceError error) {
        kotlin.jvm.internal.m0.p(error, "error");
        return a(EnumC4257e8.ISErrorLoadNetworkFailed, error);
    }

    @oy.l
    public final IronSourceError c(@oy.l String description) {
        kotlin.jvm.internal.m0.p(description, "description");
        return a(EnumC4257e8.ISErrorLoadNetworkFailed, description);
    }

    @oy.l
    public final IronSourceError d(@oy.m String str) {
        return a(EnumC4257e8.ISErrorRewardedLoadNoConfig, str);
    }

    public static /* synthetic */ IronSourceError b(C4622z5 c4622z5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c4622z5.b(str);
    }

    @oy.l
    public final IronSourceError c(@oy.l IronSourceError networkError) {
        kotlin.jvm.internal.m0.p(networkError, "networkError");
        return a(EnumC4257e8.ISErrorShowNetworkFailed, networkError);
    }

    public static /* synthetic */ IronSourceError c(C4622z5 c4622z5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c4622z5.d(str);
    }

    @oy.l
    public final IronSourceError b(@oy.m String str) {
        return a(EnumC4257e8.ISErrorInterstitialLoadNoConfig, str);
    }

    private final IronSourceError a(EnumC4257e8 enumC4257e8, String str) {
        if (str == null || str.length() == 0) {
            str = enumC4257e8.c();
        }
        return new IronSourceError(enumC4257e8.b(), str);
    }

    @oy.l
    public final IronSourceError a(@oy.l IronSourceError networkError) {
        kotlin.jvm.internal.m0.p(networkError, "networkError");
        return a(EnumC4257e8.ISErrorInitNetworkFailed, networkError);
    }

    @oy.l
    public final IronSourceError a() {
        return a(this, EnumC4257e8.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public static /* synthetic */ IronSourceError a(C4622z5 c4622z5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c4622z5.a(str);
    }

    @oy.l
    public final IronSourceError a(@oy.m String str) {
        return a(EnumC4257e8.ISErrorBannerLoadNoConfig, str);
    }
}
