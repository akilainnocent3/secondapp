package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgqc extends zzgqk {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzgqk
    public final zzgqk zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgqk
    public final zzgqk zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgqk
    public final zzgql zzc() {
        return new zzgqd(this.zza, this.zzb, null);
    }
}
