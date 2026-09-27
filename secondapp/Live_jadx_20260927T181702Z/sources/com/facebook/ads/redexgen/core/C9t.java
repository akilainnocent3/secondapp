package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9t, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class C9t extends Timeline {
    public final Timeline A00;

    public C9t(Timeline timeline) {
        this.A00 = timeline;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return this.A00.A06();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return this.A00.A07();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A08(int i10, int i11, boolean z10) {
        return this.A00.A08(i10, i11, z10);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A0A(Object obj) {
        return this.A00.A0A(obj);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z10) {
        return this.A00.A0B(z10);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z10) {
        return this.A00.A0C(z10);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C3427pl A0I(int i10, C3427pl c3427pl, boolean z10) {
        return this.A00.A0I(i10, c3427pl, z10);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C3425pj A0L(int i10, C3425pj c3425pj, long j10) {
        return this.A00.A0L(i10, c3425pj, j10);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public Object A0M(int i10) {
        return this.A00.A0M(i10);
    }
}
