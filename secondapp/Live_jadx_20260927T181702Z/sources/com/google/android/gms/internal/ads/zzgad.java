package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgad extends zzidr implements zzifd {
    private static final zzgad zzn;
    private static volatile zzifk zzo;
    private int zza;
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private String zzb = "";
    private zziec zzk = zzidr.zzbE();
    private zziec zzl = zzidr.zzbE();
    private zziec zzm = zzidr.zzbE();

    static {
        zzgad zzgadVar = new zzgad();
        zzn = zzgadVar;
        zzidr.zzbu(zzgad.class, zzgadVar);
    }

    private zzgad() {
    }

    public static zzgad zzp() {
        return zzn;
    }

    public final /* synthetic */ void zzA(long j10) {
        zziec zziecVar = this.zzl;
        if (!zziecVar.zza()) {
            this.zzl = zzidr.zzbF(zziecVar);
        }
        this.zzl.zzd(j10);
    }

    public final /* synthetic */ void zzB(long j10) {
        zziec zziecVar = this.zzm;
        if (!zziecVar.zza()) {
            this.zzm = zzidr.zzbF(zziecVar);
        }
        this.zzm.zzd(j10);
    }

    public final /* synthetic */ void zzC() {
        this.zzm = zzidr.zzbE();
    }

    public final String zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    public final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzidr.zzbv(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzgad();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgac(bArr);
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzo;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzgad.class) {
            try {
                zzidmVar = zzo;
                if (zzidmVar == null) {
                    zzidmVar = new zzidm(zzn);
                    zzo = zzidmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidmVar;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzg;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final long zzi() {
        return this.zzi;
    }

    public final boolean zzj() {
        return (this.zza & 64) != 0;
    }

    public final List zzk() {
        return this.zzk;
    }

    public final int zzl() {
        return this.zzk.size();
    }

    public final int zzm() {
        return this.zzl.size();
    }

    public final List zzn() {
        return this.zzm;
    }

    public final int zzo() {
        return this.zzm.size();
    }

    public final /* synthetic */ void zzq(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void zzr(long j10) {
        this.zza |= 1;
        this.zzc = j10;
    }

    public final /* synthetic */ void zzs(int i10) {
        this.zza |= 2;
        this.zzd = i10;
    }

    public final /* synthetic */ void zzt(boolean z10) {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void zzu(boolean z10) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void zzv(long j10) {
        this.zza |= 16;
        this.zzg = j10;
    }

    public final /* synthetic */ void zzw(long j10) {
        this.zzh = j10;
    }

    public final /* synthetic */ void zzx(long j10) {
        this.zza |= 32;
        this.zzi = j10;
    }

    public final /* synthetic */ void zzy(long j10) {
        this.zza |= 64;
        this.zzj = j10;
    }

    public final /* synthetic */ void zzz(long j10) {
        zziec zziecVar = this.zzk;
        if (!zziecVar.zza()) {
            this.zzk = zzidr.zzbF(zziecVar);
        }
        this.zzk.zzd(j10);
    }
}
