package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2003Gz {
    public static final C2003Gz A03 = new C2003Gz(-3, -9223372036854775807L, -1);
    public final int A00;
    public final long A01;
    public final long A02;

    public C2003Gz(int i10, long j10, long j11) {
        this.A00 = i10;
        this.A02 = j10;
        this.A01 = j11;
    }

    public static C2003Gz A03(long j10) {
        return new C2003Gz(0, -9223372036854775807L, j10);
    }

    public static C2003Gz A04(long j10, long j11) {
        return new C2003Gz(-1, j10, j11);
    }

    public static C2003Gz A05(long j10, long j11) {
        return new C2003Gz(-2, j10, j11);
    }
}
