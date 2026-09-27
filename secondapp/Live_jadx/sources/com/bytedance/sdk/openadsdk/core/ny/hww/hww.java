package com.bytedance.sdk.openadsdk.core.ny.hww;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum hww {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);


    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final int f36525ok;

    hww(int i10) {
        this.f36525ok = i10;
    }

    @NonNull
    public String hww() {
        return String.valueOf(this.f36525ok);
    }
}
