package com.iab.omid.library.prebidorg.devicevolume;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zz {
    public float zz(int i10, int i11) {
        if (i11 <= 0 || i10 <= 0) {
            return 0.0f;
        }
        float f10 = i10 / i11;
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }
}
