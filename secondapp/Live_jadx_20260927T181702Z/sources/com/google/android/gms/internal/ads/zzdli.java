package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdli extends zzdid {
    private boolean zzb;

    public zzdli(Set set) {
        super(set);
    }

    public final void zza() {
        zzs(zzdlh.zza);
    }

    public final void zzb() {
        zzs(zzdld.zza);
    }

    public final synchronized void zzc() {
        zzs(zzdle.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        try {
            if (!this.zzb) {
                zzs(zzdlg.zza);
                this.zzb = true;
            }
            zzs(zzdlf.zza);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
