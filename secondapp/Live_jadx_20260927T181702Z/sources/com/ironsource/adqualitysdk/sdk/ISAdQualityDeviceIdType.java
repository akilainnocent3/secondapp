package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum ISAdQualityDeviceIdType {
    NONE(0),
    GAID(1),
    IDFA(2);


    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final int f45;

    ISAdQualityDeviceIdType(int i10) {
        this.f45 = i10;
    }

    public static ISAdQualityDeviceIdType fromInt(int i10) {
        if (i10 == 0) {
            return NONE;
        }
        if (i10 == 1) {
            return GAID;
        }
        if (i10 != 2) {
            return null;
        }
        return IDFA;
    }

    public final int getValue() {
        return this.f45;
    }
}
