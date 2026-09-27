package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzemv extends zzbuv implements zzddp {
    private zzbuw zza;
    private zzddo zzb;

    @Override // com.google.android.gms.internal.ads.zzddp
    public final synchronized void zza(zzddo zzddoVar) {
        this.zzb = zzddoVar;
    }

    public final synchronized void zzc(zzbuw zzbuwVar) {
        this.zza = zzbuwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zze() throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzf() throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzg(int i10) throws RemoteException {
        zzddo zzddoVar = this.zzb;
        if (zzddoVar != null) {
            zzddoVar.zzb(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzh() throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzi() throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzj() throws RemoteException {
        try {
            zzbuw zzbuwVar = this.zza;
            if (zzbuwVar != null) {
                zzbuwVar.zzj();
            }
            zzddo zzddoVar = this.zzb;
            if (zzddoVar != null) {
                zzddoVar.zza();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzk() throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzl(String str, String str2) throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzl(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzm(zzbmj zzbmjVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzn() throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzo() throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzp(zzcbp zzcbpVar) throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzp(zzcbpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzq() throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzr(zzcbt zzcbtVar) throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzr(zzcbtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzs(int i10) throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzs(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzt() throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzu() throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzv(String str) throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzv(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzw(int i10, String str) throws RemoteException {
        zzddo zzddoVar = this.zzb;
        if (zzddoVar != null) {
            zzddoVar.zzc(i10, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzddo zzddoVar = this.zzb;
        if (zzddoVar != null) {
            zzddoVar.zzd(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzy(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzz() throws RemoteException {
        zzbuw zzbuwVar = this.zza;
        if (zzbuwVar != null) {
            zzbuwVar.zzz();
        }
    }
}
