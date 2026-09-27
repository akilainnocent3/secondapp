package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbp {
    private final Context zza;
    private final zzfkm zzb;
    private final Bundle zzc;

    @Nullable
    private final zzfkf zzd;

    @Nullable
    private final zzdbi zze;

    @Nullable
    private final zzell zzf;

    public /* synthetic */ zzdbp(zzdbo zzdboVar, byte[] bArr) {
        this.zza = zzdboVar.zzh();
        this.zzb = zzdboVar.zzi();
        this.zzc = zzdboVar.zzj();
        this.zzd = zzdboVar.zzk();
        this.zze = zzdboVar.zzl();
        this.zzf = zzdboVar.zzm();
    }

    public final zzdbo zza() {
        zzdbo zzdboVar = new zzdbo();
        zzdboVar.zza(this.zza);
        zzdboVar.zzb(this.zzb);
        zzdboVar.zzc(this.zzc);
        zzdboVar.zzd(this.zze);
        zzdboVar.zzg(this.zzf);
        return zzdboVar;
    }

    public final zzfkm zzb() {
        return this.zzb;
    }

    @Nullable
    public final zzfkf zzc() {
        return this.zzd;
    }

    @Nullable
    public final Bundle zzd() {
        return this.zzc;
    }

    @Nullable
    public final zzdbi zze() {
        return this.zze;
    }

    public final Context zzf(Context context) {
        return this.zza;
    }

    public final zzell zzg(String str) {
        zzell zzellVar = this.zzf;
        return zzellVar != null ? zzellVar : new zzell(str);
    }
}
