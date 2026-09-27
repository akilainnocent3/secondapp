package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaqh extends zzafb {
    public zzaqh(zzfh zzfhVar, long j10, long j11) {
        super(new zzaew(), new zzaqg(zzfhVar, null), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static /* synthetic */ int zzh(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
