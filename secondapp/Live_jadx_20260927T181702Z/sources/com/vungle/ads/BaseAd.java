package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.signals.SignaledAd;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.ThreadUtil;
import dr.i0;
import dr.k0;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseAd implements Ad {

    @l
    private final AdConfig adConfig;

    @l
    private final i0 adInternal$delegate;

    @m
    private BaseAdListener adListener;

    @l
    private final Context context;

    @m
    private String creativeId;

    @l
    private final TimeIntervalMetric displayToClickMetric;

    @m
    private String eventId;

    @l
    private final SingleValueMetric leaveApplicationMetric;

    @l
    private final LogEntry logEntry;

    @l
    private final String placementId;

    @l
    private final TimeIntervalMetric presentToDisplayMetric;

    @l
    private final TimeIntervalMetric responseToShowMetric;

    @l
    private final SingleValueMetric rewardedMetric;

    @l
    private final TimeIntervalMetric showToCloseMetric;

    @l
    private final TimeIntervalMetric showToFailMetric;

    @l
    private final i0 signalManager$delegate;

    @m
    private SignaledAd signaledAd;

    public BaseAd(@l Context context, @l String placementId, @l AdConfig adConfig) {
        m0.p(context, "context");
        m0.p(placementId, "placementId");
        m0.p(adConfig, "adConfig");
        this.context = context;
        this.placementId = placementId;
        this.adConfig = adConfig;
        this.adInternal$delegate = k0.b(new BaseAd$adInternal$2(this));
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.signalManager$delegate = k0.a(dr.m0.SYNCHRONIZED, new BaseAd$special$$inlined$inject$1(context));
        LogEntry logEntry = new LogEntry();
        logEntry.setPlacementRefId$vungle_ads_release(placementId);
        this.logEntry = logEntry;
        this.responseToShowMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.presentToDisplayMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.showToFailMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_FAIL_DURATION_MS);
        this.displayToClickMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_DISPLAY_TO_CLICK_DURATION_MS);
        this.leaveApplicationMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_LEAVE_APPLICATION);
        this.rewardedMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_REWARD_USER);
        this.showToCloseMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_CLOSE_DURATION_MS);
    }

    private final void onLoadEnd() {
        this.responseToShowMetric.markStart();
    }

    @Override // com.vungle.ads.Ad
    @l
    public Boolean canPlayAd() {
        return Boolean.valueOf(AdInternal.canPlayAd$default(getAdInternal$vungle_ads_release(), false, 1, null) == null);
    }

    @l
    public abstract AdInternal constructAdInternal$vungle_ads_release(@l Context context);

    @l
    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    @l
    public final AdInternal getAdInternal$vungle_ads_release() {
        return (AdInternal) this.adInternal$delegate.getValue();
    }

    @m
    public final BaseAdListener getAdListener() {
        return this.adListener;
    }

    @l
    public final Context getContext() {
        return this.context;
    }

    @m
    public final String getCreativeId() {
        return this.creativeId;
    }

    @l
    public final TimeIntervalMetric getDisplayToClickMetric$vungle_ads_release() {
        return this.displayToClickMetric;
    }

    @m
    public final String getEventId() {
        return this.eventId;
    }

    @l
    public final SingleValueMetric getLeaveApplicationMetric$vungle_ads_release() {
        return this.leaveApplicationMetric;
    }

    @l
    public final LogEntry getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    @l
    public final String getPlacementId() {
        return this.placementId;
    }

    @l
    public final TimeIntervalMetric getPresentToDisplayMetric$vungle_ads_release() {
        return this.presentToDisplayMetric;
    }

    @l
    public final TimeIntervalMetric getResponseToShowMetric$vungle_ads_release() {
        return this.responseToShowMetric;
    }

    @l
    public final SingleValueMetric getRewardedMetric$vungle_ads_release() {
        return this.rewardedMetric;
    }

    @l
    public final TimeIntervalMetric getShowToCloseMetric$vungle_ads_release() {
        return this.showToCloseMetric;
    }

    @l
    public final TimeIntervalMetric getShowToFailMetric$vungle_ads_release() {
        return this.showToFailMetric;
    }

    @l
    public final SignalManager getSignalManager$vungle_ads_release() {
        return (SignalManager) this.signalManager$delegate.getValue();
    }

    @m
    public final SignaledAd getSignaledAd$vungle_ads_release() {
        return this.signaledAd;
    }

    @Override // com.vungle.ads.Ad
    public void load(@m final String str) throws Throwable {
        getAdInternal$vungle_ads_release().loadAd(this.placementId, str, new AdLoaderCallback() { // from class: com.vungle.ads.BaseAd.load.1
            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onFailure(@l VungleError error) {
                m0.p(error, "error");
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }

            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onSuccess(@l AdPayload advertisement) {
                m0.p(advertisement, "advertisement");
                BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, str);
            }
        });
    }

    public void onAdLoaded$vungle_ads_release(@l AdPayload advertisement) {
        m0.p(advertisement, "advertisement");
        advertisement.setAdConfig(this.adConfig);
        this.creativeId = advertisement.getCreativeId();
        String strEventId = advertisement.eventId();
        this.eventId = strEventId;
        SignaledAd signaledAd = this.signaledAd;
        if (signaledAd == null) {
            return;
        }
        signaledAd.setEventId(strEventId);
    }

    public void onLoadFailure$vungle_ads_release(@l BaseAd baseAd, @l VungleError vungleError) {
        m0.p(baseAd, "baseAd");
        m0.p(vungleError, "vungleError");
        onLoadEnd();
        ThreadUtil.INSTANCE.runOnUiThread(new BaseAd$onLoadFailure$1(this, vungleError));
    }

    public void onLoadSuccess$vungle_ads_release(@l BaseAd baseAd, @m String str) {
        m0.p(baseAd, "baseAd");
        onLoadEnd();
        ThreadUtil.INSTANCE.runOnUiThread(new BaseAd$onLoadSuccess$1(this));
    }

    public final void setAdListener(@m BaseAdListener baseAdListener) {
        this.adListener = baseAdListener;
    }

    public final void setSignaledAd$vungle_ads_release(@m SignaledAd signaledAd) {
        this.signaledAd = signaledAd;
    }
}
