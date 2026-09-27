package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfq {
    private final zzfp zza;
    private final zzdy zzb;
    private final zzdy zzc;
    private boolean zzd;
    private boolean zze;

    public zzfq(Context context, Looper looper, zzdo zzdoVar) {
        this.zza = new zzfp(context.getApplicationContext());
        this.zzb = zzdoVar.zzd(looper, null);
        this.zzc = zzdoVar.zzd(Looper.getMainLooper(), null);
    }

    private final void zzg(final boolean z10, final boolean z11) {
        if (zzh(z10, z11)) {
            this.zzb.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze(z10, z11);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.zzc.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(atomicBoolean);
            }
        }, 1000L);
        this.zzb.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(atomicBoolean, z10, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzh(boolean z10, boolean z11) {
        return z10 && z11;
    }

    public final void zza(boolean z10) {
        if (this.zzd == z10) {
            return;
        }
        this.zzd = z10;
        zzg(z10, this.zze);
    }

    public final void zzb(boolean z10) {
        if (this.zze == z10) {
            return;
        }
        this.zze = z10;
        if (this.zzd) {
            zzg(true, z10);
        }
    }

    public final /* synthetic */ void zzc(final AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get()) {
            final zzfp zzfpVar = this.zza;
            new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfpVar.zza(atomicBoolean);
                }
            }, "ExoPlayer:WakeLockManager").start();
        }
    }

    public final /* synthetic */ void zzd(AtomicBoolean atomicBoolean, boolean z10, boolean z11) {
        atomicBoolean.set(false);
        this.zza.zzb(z10, z11);
    }

    public final /* synthetic */ void zze(boolean z10, boolean z11) {
        this.zza.zzb(z10, z11);
    }
}
