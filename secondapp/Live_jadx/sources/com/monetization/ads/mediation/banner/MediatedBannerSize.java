package com.monetization.ads.mediation.banner;

import dr.v1;
import fr.n1;
import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class MediatedBannerSize {
    private final int height;
    private final int width;

    public MediatedBannerSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    @l
    public final Map<String, Integer> toSizeData() {
        return n1.W(v1.a("width", Integer.valueOf(this.width)), v1.a("height", Integer.valueOf(this.height)));
    }
}
