package com.startapp.sdk.ads.video;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public enum VideoUtil$VideoEligibility {
    ELIGIBLE(""),
    INELIGIBLE_NO_STORAGE("Not enough storage for video"),
    INELIGIBLE_MISSING_ACTIVITY("OverlayActivity not declared in AndroidManifest.xml"),
    INELIGIBLE_ERRORS_THRESHOLD_REACHED("Video errors threshold reached.");

    private String desctiption;

    VideoUtil$VideoEligibility(String str) {
        this.desctiption = str;
    }

    public final String a() {
        return this.desctiption;
    }
}
