package com.fyber.inneractive.sdk.measurement;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum i {
    VERIFICATION_RESOURCE_REJECTED(1),
    VERIFICATION_NOT_SUPPORTED(2),
    ERROR_DURING_RESOURCE_LOAD(3);

    int mReason;

    i(int i10) {
        this.mReason = i10;
    }
}
