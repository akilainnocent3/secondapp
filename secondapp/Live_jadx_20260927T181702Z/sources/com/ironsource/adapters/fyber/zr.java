package com.ironsource.adapters.fyber;

import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class zr implements InneractiveFullscreenAdEventsListenerWithImpressionData, InneractiveAdSpot.RequestListener {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private InterstitialSmashListener f60843zr;
    private String zz;

    public zr(InterstitialSmashListener interstitialSmashListener, String str) {
        this.f60843zr = interstitialSmashListener;
        this.zz = str;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz);
        InterstitialSmashListener interstitialSmashListener = this.f60843zr;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz);
        InterstitialSmashListener interstitialSmashListener = this.f60843zr;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClosed();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
        String str;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("spotId = " + this.zz);
        if (this.f60843zr == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (adDisplayError == null) {
            str = "Interstitial show failed (adDisplayError is null)";
        } else {
            String message = adDisplayError.getMessage();
            ironLog.verbose("error = " + message);
            str = message;
        }
        this.f60843zr.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", str));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        String string;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("spotId = " + this.zz);
        if (this.f60843zr == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (inneractiveErrorCode != null) {
            ironLog.verbose("inneractiveErrorCode = " + inneractiveErrorCode);
            if (inneractiveErrorCode == InneractiveErrorCode.NO_FILL) {
                ironSourceError = new IronSourceError(1158, inneractiveErrorCode.toString());
            } else {
                string = inneractiveErrorCode.toString();
            }
            this.f60843zr.onInterstitialAdLoadFailed(ironSourceError);
        }
        string = "Interstitial failed to load (inneractiveErrorCode is null)";
        ironSourceError = ErrorBuilder.buildLoadFailedError(string);
        this.f60843zr.onInterstitialAdLoadFailed(ironSourceError);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz);
        InterstitialSmashListener interstitialSmashListener = this.f60843zr;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdReady();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
        String creativeId = impressionData.getCreativeId();
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.zz + " creativeId = " + creativeId);
        if (this.f60843zr == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (creativeId.isEmpty()) {
            this.f60843zr.onInterstitialAdOpened();
            this.f60843zr.onInterstitialAdShowSucceeded();
        } else {
            HashMap map = new HashMap();
            map.put("creativeId", creativeId);
            this.f60843zr.onInterstitialAdOpened(map);
            this.f60843zr.onInterstitialAdShowSucceeded(map);
        }
    }
}
