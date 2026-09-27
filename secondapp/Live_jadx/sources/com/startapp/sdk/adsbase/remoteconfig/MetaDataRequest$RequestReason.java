package com.startapp.sdk.adsbase.remoteconfig;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public enum MetaDataRequest$RequestReason {
    LAUNCH(1),
    APP_IDLE(2),
    IN_APP_PURCHASE(3),
    CUSTOM(4),
    PERIODIC(5),
    PAS(6),
    CONSENT(7),
    IMPLICIT_LAUNCH(8),
    EXTRAS(9);

    private int index;

    MetaDataRequest$RequestReason(int i10) {
        this.index = i10;
    }
}
