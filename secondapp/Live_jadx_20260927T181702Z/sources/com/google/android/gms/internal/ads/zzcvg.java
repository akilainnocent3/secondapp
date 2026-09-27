package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzcvg {
    private final zzcxf zza;
    private final View zzb;
    private final zzfju zzc;

    @Nullable
    private final zzcki zzd;

    public zzcvg(View view, @Nullable zzcki zzckiVar, zzcxf zzcxfVar, zzfju zzfjuVar) {
        this.zzb = view;
        this.zzd = zzckiVar;
        this.zza = zzcxfVar;
        this.zzc = zzfjuVar;
    }

    @Nullable
    public final zzcki zza() {
        return this.zzd;
    }

    public final View zzb() {
        return this.zzb;
    }

    public final zzcxf zzc() {
        return this.zza;
    }

    public final zzfju zzd() {
        return this.zzc;
    }

    public zzddr zze(Set set) {
        return new zzddr(set);
    }
}
