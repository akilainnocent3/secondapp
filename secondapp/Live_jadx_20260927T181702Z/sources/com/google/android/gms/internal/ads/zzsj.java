package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzsj implements zzsw {
    final /* synthetic */ zzsq zza;

    public /* synthetic */ zzsj(zzsq zzsqVar, byte[] bArr) {
        Objects.requireNonNull(zzsqVar);
        this.zza = zzsqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsw
    public final void zza(long j10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 41);
        sb2.append("Ignoring impossibly large audio latency: ");
        sb2.append(j10);
        zzef.zzc(f5.b1.f82804t, sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzsw
    public final void zzb(final long j10) {
        zzsq zzsqVar = this.zza;
        if (zzsqVar.zzu().zzb()) {
            zzee zzeeVarZzu = zzsqVar.zzu();
            zzeeVarZzu.zze(-1, new zzdz() { // from class: com.google.android.gms.internal.ads.zzsi
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj) {
                    ((zzqn) obj).zza(j10);
                }
            });
            zzeeVarZzu.zzf();
        }
    }
}
