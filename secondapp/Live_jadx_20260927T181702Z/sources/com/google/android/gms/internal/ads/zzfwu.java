package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfwu extends zzfwr {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private long zzd;
    private long zze;
    private byte zzf;

    @Override // com.google.android.gms.internal.ads.zzfwr
    public final zzfwr zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwr
    public final zzfwr zzb(boolean z10) {
        this.zzb = z10;
        this.zzf = (byte) (this.zzf | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwr
    public final zzfwr zzc(boolean z10) {
        this.zzc = true;
        this.zzf = (byte) (this.zzf | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwr
    public final zzfwr zzd(boolean z10) {
        this.zzf = (byte) (this.zzf | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwr
    public final zzfwr zze(long j10) {
        this.zzd = 100L;
        this.zzf = (byte) (this.zzf | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwr
    public final zzfwr zzf(boolean z10) {
        this.zzf = (byte) (this.zzf | zi.c.f161640r);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwr
    public final zzfwr zzg(long j10) {
        this.zze = 300L;
        this.zzf = (byte) (this.zzf | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwr
    public final zzfws zzh() {
        String str;
        if (this.zzf == 63 && (str = this.zza) != null) {
            return new zzfwv(str, this.zzb, this.zzc, false, this.zzd, false, this.zze, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" clientVersion");
        }
        if ((this.zzf & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.zzf & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        if ((this.zzf & 4) == 0) {
            sb2.append(" enableQuerySignalsTimeout");
        }
        if ((this.zzf & 8) == 0) {
            sb2.append(" querySignalsTimeoutMs");
        }
        if ((this.zzf & zi.c.f161640r) == 0) {
            sb2.append(" enableQuerySignalsCache");
        }
        if ((this.zzf & 32) == 0) {
            sb2.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
