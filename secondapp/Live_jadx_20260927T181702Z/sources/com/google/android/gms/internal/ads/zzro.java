package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzro {

    @Nullable
    private final Handler zza;

    @Nullable
    private final zzrp zzb;

    public zzro(@Nullable Handler handler, @Nullable zzrp zzrpVar) {
        this.zza = zzrpVar == null ? null : handler;
        this.zzb = zzrpVar;
    }

    public final /* synthetic */ void zzA(int i10) {
        String str = zzfk.zza;
        this.zzb.zzx(i10);
    }

    public final /* synthetic */ void zzB(zzit zzitVar) {
        String str = zzfk.zza;
        this.zzb.zzy(zzitVar);
    }

    public final void zza(final zziv zzivVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(zzivVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzra
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(str, j10, j11);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, @Nullable final zziw zziwVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzre
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(zzvVar, zziwVar);
                }
            });
        }
    }

    public final void zzd(final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(j10);
                }
            });
        }
    }

    public final void zze(final int i10, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(i10, j10, j11);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(str);
                }
            });
        }
    }

    public final void zzg(final zziv zzivVar) {
        zzivVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzri
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(zzivVar);
                }
            });
        }
    }

    public final void zzh(final boolean z10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(z10);
                }
            });
        }
    }

    public final void zzi(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzw(exc);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzx(exc);
                }
            });
        }
    }

    public final void zzk(final zzrq zzrqVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzy(zzrqVar);
                }
            });
        }
    }

    public final void zzl(final zzrq zzrqVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzz(zzrqVar);
                }
            });
        }
    }

    public final void zzm(final int i10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzA(i10);
                }
            });
        }
    }

    public final void zzn(final zzit zzitVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzB(zzitVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzo(zziv zzivVar) {
        String str = zzfk.zza;
        this.zzb.zzl(zzivVar);
    }

    public final /* synthetic */ void zzp(String str, long j10, long j11) {
        String str2 = zzfk.zza;
        this.zzb.zzm(str, j10, j11);
    }

    public final /* synthetic */ void zzq(zzv zzvVar, zziw zziwVar) {
        String str = zzfk.zza;
        this.zzb.zzn(zzvVar, zziwVar);
    }

    public final /* synthetic */ void zzr(long j10) {
        String str = zzfk.zza;
        this.zzb.zzo(j10);
    }

    public final /* synthetic */ void zzs(int i10, long j10, long j11) {
        String str = zzfk.zza;
        this.zzb.zzp(i10, j10, j11);
    }

    public final /* synthetic */ void zzt(String str) {
        String str2 = zzfk.zza;
        this.zzb.zzq(str);
    }

    public final /* synthetic */ void zzu(zziv zzivVar) {
        zzivVar.zza();
        String str = zzfk.zza;
        this.zzb.zzr(zzivVar);
    }

    public final /* synthetic */ void zzv(boolean z10) {
        String str = zzfk.zza;
        this.zzb.zzs(z10);
    }

    public final /* synthetic */ void zzw(Exception exc) {
        String str = zzfk.zza;
        this.zzb.zzt(exc);
    }

    public final /* synthetic */ void zzx(Exception exc) {
        String str = zzfk.zza;
        this.zzb.zzu(exc);
    }

    public final /* synthetic */ void zzy(zzrq zzrqVar) {
        String str = zzfk.zza;
        this.zzb.zzv(zzrqVar);
    }

    public final /* synthetic */ void zzz(zzrq zzrqVar) {
        String str = zzfk.zza;
        this.zzb.zzw(zzrqVar);
    }
}
