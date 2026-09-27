package com.vungle.ads.internal.privacy;

import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public enum COPPA {
    COPPA_ENABLED(Boolean.TRUE),
    COPPA_DISABLED(Boolean.FALSE),
    COPPA_NOTSET(null);


    @m
    private final Boolean value;

    COPPA(Boolean bool) {
        this.value = bool;
    }

    @m
    public final Boolean getValue() {
        return this.value;
    }
}
