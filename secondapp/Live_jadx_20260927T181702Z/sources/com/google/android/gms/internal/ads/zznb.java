package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zznb {
    public static final zznb zza = new zznb(new zzna());
    public final zzgwj zzb;

    @Nullable
    @k.w(from = 0.0d, to = 1.0d)
    public final Double zzc = null;

    @Nullable
    @k.w(from = 0.0d, to = 1.0d)
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzi = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zznb(zzna zznaVar) {
        this.zzb = zznaVar.zza();
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof zznb) && this.zzb.equals(((zznb) obj).zzb);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.zzb, null, null, bool, bool, bool, bool, bool);
    }
}
