package com.google.android.gms.internal.ads;

import android.os.Looper;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzmq {
    private final zzmp zza;
    private final zzmo zzb;
    private final zzbf zzc;
    private int zzd;

    @Nullable
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzmq(zzmo zzmoVar, zzmp zzmpVar, zzbf zzbfVar, int i10, zzdo zzdoVar, Looper looper) {
        this.zzb = zzmoVar;
        this.zza = zzmpVar;
        this.zzc = zzbfVar;
        this.zzf = looper;
        this.zzg = i10;
    }

    public final zzmp zza() {
        return this.zza;
    }

    public final zzmq zzb(int i10) {
        zzgsw.zzi(!this.zzh);
        this.zzd = i10;
        return this;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzmq zzd(@Nullable Object obj) {
        zzgsw.zzi(!this.zzh);
        this.zze = obj;
        return this;
    }

    @Nullable
    public final Object zze() {
        return this.zze;
    }

    public final Looper zzf() {
        return this.zzf;
    }

    public final zzmq zzg() {
        zzgsw.zzi(!this.zzh);
        this.zzh = true;
        this.zzb.zzk(this);
        return this;
    }

    public final synchronized boolean zzh() {
        return false;
    }

    public final synchronized void zzi(boolean z10) {
        this.zzi = z10 | this.zzi;
        notifyAll();
    }
}
