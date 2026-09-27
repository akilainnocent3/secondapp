package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfz implements zzao {
    public final float zza;
    public final float zzb;

    public zzfz(@k.w(from = -90.0d, to = 90.0d) float f10, @k.w(from = -180.0d, to = 180.0d) float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        }
        zzgsw.zzb(z10, "Invalid latitude or longitude");
        this.zza = f10;
        this.zzb = f11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfz.class == obj.getClass()) {
            zzfz zzfzVar = (zzfz) obj;
            if (this.zza == zzfzVar.zza && this.zzb == zzfzVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.zza) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToIntBits(this.zzb);
    }

    public final String toString() {
        float f10 = this.zza;
        int length = String.valueOf(f10).length();
        float f11 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(f11).length());
        sb2.append("xyz: latitude=");
        sb2.append(f10);
        sb2.append(", longitude=");
        sb2.append(f11);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        j.a(this, zzamVar);
    }
}
