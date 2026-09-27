package com.bytedance.adsdk.tq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
class tq {
    static final int[] hww = new int[0];

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    static final long[] f32318tq = new long[0];

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    static final Object[] f32317sd = new Object[0];

    public static int hww(int[] iArr, int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }
}
