package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j00 {
    public static /* synthetic */ int a(int i10, int i11) {
        int i12 = i10 % i11;
        if (i12 == 0) {
            return 0;
        }
        return (((i10 ^ i11) >> 31) | 1) > 0 ? i12 : i12 + i11;
    }
}
