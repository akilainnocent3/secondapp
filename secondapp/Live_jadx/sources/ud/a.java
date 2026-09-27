package ud;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum a {
    RESPONSE_VALIDATION_FAILED("Response validation failed"),
    FAILED_TO_PARSE_AD_CONTENT("Failed to parse ad content"),
    FAILED_TO_LOAD_AD("Failed to load the ad "),
    FMP_NOT_READY_TO_LOAD_ADS("FMP Configuration not available or invalid. Ads cannot be loaded"),
    UNSUPPORTED_AD_TYPE("FMP does not know how to load the received creative type");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f139536b;

    a(String str) {
        this.f139536b = str;
    }

    public String d() {
        return this.f139536b;
    }
}
