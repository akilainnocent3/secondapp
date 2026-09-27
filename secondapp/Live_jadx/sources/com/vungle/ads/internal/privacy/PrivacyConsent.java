package com.vungle.ads.internal.privacy;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public enum PrivacyConsent {
    UNKNOWN("unknown"),
    OPT_IN("opted_in"),
    OPT_OUT("opted_out");


    @l
    private final String value;

    PrivacyConsent(String str) {
        this.value = str;
    }

    @l
    public final String getValue() {
        return this.value;
    }
}
