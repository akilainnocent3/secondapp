package com.fyber.inneractive.sdk.external;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface InneractiveAdViewEventsListener extends InneractiveUnitController.EventsListener {
    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdClicked(InneractiveAdSpot inneractiveAdSpot);

    void onAdCollapsed(InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError);

    void onAdExpanded(InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdImpression(InneractiveAdSpot inneractiveAdSpot);

    void onAdResized(InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot);
}
