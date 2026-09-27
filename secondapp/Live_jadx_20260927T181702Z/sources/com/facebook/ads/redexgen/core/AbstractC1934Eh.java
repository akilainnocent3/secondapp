package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.AbstractC1934Eh;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1934Eh<T extends AbstractC1934Eh<T>> {
    public final int A00;
    public final int A01;
    public final C3460qI A02;
    public final C3423pg A03;

    public abstract int A08();

    public abstract boolean A09(T t10);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC1934Eh(int i10, C3423pg c3423pg, int i11) {
        this.A00 = i10;
        this.A03 = c3423pg;
        this.A01 = i11;
        this.A02 = c3423pg.A08(i11);
    }
}
