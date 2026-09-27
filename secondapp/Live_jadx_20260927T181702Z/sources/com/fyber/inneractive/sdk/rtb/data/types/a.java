package com.fyber.inneractive.sdk.rtb.data.types;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum a {
    VAST_1_0(1),
    VAST_2_0(2),
    VAST_3_0(3),
    VAST_1_0_WRAPPER(4),
    VAST_2_0_WRAPPER(5),
    VAST_3_0_WRAPPER(6);

    int value;

    a(int i10) {
        this.value = i10;
    }

    public final int a() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.value);
    }
}
