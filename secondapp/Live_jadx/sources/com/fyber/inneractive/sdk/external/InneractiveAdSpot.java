package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface InneractiveAdSpot {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface RequestListener {
        void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode);

        void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class RequestListenerAdapter implements RequestListener {
        public abstract void onInneractiveAdRequestResult(InneractiveAdSpot inneractiveAdSpot, boolean z10, InneractiveErrorCode inneractiveErrorCode);

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            onInneractiveAdRequestResult(inneractiveAdSpot, false, inneractiveErrorCode);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            onInneractiveAdRequestResult(inneractiveAdSpot, true, null);
        }
    }

    void addUnitController(InneractiveUnitController inneractiveUnitController);

    void destroy();

    x getAdContent();

    InneractiveAdRequest getCurrentProcessedRequest();

    String getLocalUniqueId();

    InneractiveMediationName getMediationName();

    String getMediationNameString();

    String getMediationVersion();

    String getRequestedSpotId();

    InneractiveUnitController getSelectedUnitController();

    boolean isReady();

    void loadAd(String str);

    void removeUnitController(InneractiveUnitController inneractiveUnitController);

    void requestAd(InneractiveAdRequest inneractiveAdRequest);

    void setMediationName(InneractiveMediationName inneractiveMediationName);

    void setMediationName(String str);

    void setMediationVersion(String str);

    void setRequestListener(RequestListener requestListener);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class NativeAdRequestListener implements RequestListener {
        public abstract void onInneractiveSuccessfulNativeAdRequest(InneractiveAdSpot inneractiveAdSpot, NativeAdContent nativeAdContent);

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public final void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        }
    }
}
