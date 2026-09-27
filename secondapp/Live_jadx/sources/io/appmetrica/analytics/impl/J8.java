package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum J8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96014a;

    J8(int i10) {
        this.f96014a = i10;
    }

    public static J8 a(Integer num) {
        if (num != null) {
            for (J8 j10 : values()) {
                if (j10.f96014a == num.intValue()) {
                    return j10;
                }
            }
        }
        return NONE;
    }
}
