package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfwv extends zzfws {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    public /* synthetic */ zzfwv(String str, boolean z10, boolean z11, boolean z12, long j10, boolean z13, long j11, byte[] bArr) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = j10;
        this.zze = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfws) {
            zzfws zzfwsVar = (zzfws) obj;
            if (this.zza.equals(zzfwsVar.zza()) && this.zzb == zzfwsVar.zzb() && this.zzc == zzfwsVar.zzc()) {
                zzfwsVar.zzd();
                if (this.zzd == zzfwsVar.zze()) {
                    zzfwsVar.zzf();
                    if (this.zze == zzfwsVar.zzg()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zzd)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zze);
    }

    public final String toString() {
        boolean z10 = this.zzb;
        int length = String.valueOf(z10).length();
        boolean z11 = this.zzc;
        int length2 = String.valueOf(z11).length();
        long j10 = this.zzd;
        int length3 = String.valueOf(j10).length();
        long j11 = this.zze;
        int length4 = String.valueOf(j11).length();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb2.append("AdShield2Options{clientVersion=");
        sb2.append(str);
        sb2.append(", shouldGetAdvertisingId=");
        sb2.append(z10);
        sb2.append(", isGooglePlayServicesAvailable=");
        sb2.append(z11);
        sb2.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb2.append(j10);
        sb2.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb2.append(j11);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final boolean zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final long zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final long zzg() {
        return this.zze;
    }
}
