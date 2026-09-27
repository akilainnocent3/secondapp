package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaja extends zzajh {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzajh[] zze;

    public zzaja(String str, boolean z10, boolean z11, String[] strArr, zzajh[] zzajhVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = strArr;
        this.zze = zzajhVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaja.class == obj.getClass()) {
            zzaja zzajaVar = (zzaja) obj;
            if (this.zzb == zzajaVar.zzb && this.zzc == zzajaVar.zzc && Objects.equals(this.zza, zzajaVar.zza) && Arrays.equals(this.zzd, zzajaVar.zzd) && Arrays.equals(this.zze, zzajaVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.zzc ? 1 : 0)) * 31) + this.zza.hashCode();
    }
}
