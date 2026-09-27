package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgds implements zzgdm {
    private final int zza;
    private final byte[] zzb;

    public zzgds(int i10, byte[] bArr) {
        this.zza = i10;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgdm
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgdm
    public final String zzb() throws IOException {
        return new String(this.zzb);
    }
}
