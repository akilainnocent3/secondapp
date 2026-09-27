package com.ironsource.adapters.fyber;

import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class zs implements InneractiveAdSpot.RequestListener, InneractiveFullScreenAdRewardedListener, InneractiveFullscreenAdEventsListenerWithImpressionData, VideoContentListener {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private RewardedVideoSmashListener f60844zr;
    private String zz;

    public zs(RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        this.f60844zr = rewardedVideoSmashListener;
        this.zz = str;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.f60844zr;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.f60844zr;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClosed();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
        String str;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("spotId = " + this.zz);
        if (this.f60844zr == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (adDisplayError == null) {
            str = "Rewarded Video show failed (adDisplayError is null)";
        } else {
            String message = adDisplayError.getMessage();
            ironLog.verbose("error = " + message);
            str = message;
        }
        this.f60844zr.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener
    public void onAdRewarded(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.f60844zr;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdRewarded();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz);
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onCompleted() {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.f60844zr;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdEnded();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("spotId = " + this.zz);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.f60844zr;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        if (inneractiveErrorCode != null) {
            ironLog.verbose("inneractiveErrorCode = " + inneractiveErrorCode);
            this.f60844zr.onRewardedVideoLoadFailed(inneractiveErrorCode == InneractiveErrorCode.NO_FILL ? new IronSourceError(1058, inneractiveErrorCode.toString()) : ErrorBuilder.buildLoadFailedError(inneractiveErrorCode.toString()));
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.f60844zr;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onPlayerError() {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
        String creativeId = impressionData.getCreativeId();
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz + " creativeId = " + creativeId);
        if (this.f60844zr == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (creativeId.isEmpty()) {
            this.f60844zr.onRewardedVideoAdOpened();
            this.f60844zr.onRewardedVideoAdStarted();
        } else {
            HashMap map = new HashMap();
            map.put("creativeId", creativeId);
            this.f60844zr.onRewardedVideoAdOpened(map);
            this.f60844zr.onRewardedVideoAdStarted(map);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onProgress(int i10, int i11) {
    }
}
