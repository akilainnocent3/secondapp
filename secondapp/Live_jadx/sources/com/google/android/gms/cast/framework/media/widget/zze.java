package com.google.android.gms.cast.framework.media.widget;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zze {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public boolean zzf;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj;
        return this.zza == zzeVar.zza && this.zzb == zzeVar.zzb && this.zzc == zzeVar.zzc && this.zzd == zzeVar.zzd && this.zze == zzeVar.zze && this.zzf == zzeVar.zzf;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Integer.valueOf(this.zze), Boolean.valueOf(this.zzf));
    }
}
