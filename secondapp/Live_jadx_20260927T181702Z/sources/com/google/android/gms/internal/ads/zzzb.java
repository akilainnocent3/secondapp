package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzzb implements zzyu {
    private final zzyu zza;
    private final long zzb;

    public zzzb(zzyu zzyuVar, long j10) {
        this.zza = zzyuVar;
        this.zzb = j10;
    }

    public final zzyu zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final int zzd(zzlq zzlqVar, zzip zzipVar, int i10) {
        int iZzd = this.zza.zzd(zzlqVar, zzipVar, i10);
        if (iZzd != -4) {
            return iZzd;
        }
        zzipVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final int zze(long j10) {
        return this.zza.zze(j10 - this.zzb);
    }
}
