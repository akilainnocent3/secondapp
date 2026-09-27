package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzeb {
    public final Object zza;
    private zzr zzb = new zzr();
    private boolean zzc;
    private boolean zzd;

    public zzeb(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzeb.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzeb) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i10, zzdz zzdzVar) {
        if (this.zzd) {
            return;
        }
        if (i10 != -1) {
            this.zzb.zza(i10);
        }
        this.zzc = true;
        zzdzVar.zza(this.zza);
    }

    public final void zzb(zzea zzeaVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzs zzsVarZzb = this.zzb.zzb();
        this.zzb = new zzr();
        this.zzc = false;
        zzeaVar.zza(this.zza, zzsVarZzb);
    }

    public final /* synthetic */ void zzc(zzea zzeaVar) {
        this.zzd = true;
        if (zzeaVar == null || !this.zzc) {
            return;
        }
        this.zzc = false;
        zzeaVar.zza(this.zza, this.zzb.zzb());
    }
}
