package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzakk {
    public final int zza;
    public final int zzb;
    public final float zzc;

    private zzakk(int i10, int i11, float f10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
    }

    public static /* synthetic */ zzakk zza(int i10) {
        int i11 = i10 >> 13;
        if (i11 == 0) {
            return null;
        }
        return new zzakk(i11, (i10 >> 10) & 7, ((i10 & d1.n.f77587u) * ((i10 & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzakk)) {
            return false;
        }
        zzakk zzakkVar = (zzakk) obj;
        return this.zza == zzakkVar.zza && this.zzb == zzakkVar.zzb && Float.compare(this.zzc, zzakkVar.zzc) == 0;
    }

    public final int hashCode() {
        return (((this.zza * 31) + this.zzb) * 31) + Float.floatToIntBits(this.zzc);
    }

    public final String toString() {
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        int i11 = this.zzb;
        int length2 = String.valueOf(i11).length();
        float f10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 28 + length2 + 7 + String.valueOf(f10).length() + 1);
        sb2.append("GainField{name=");
        sb2.append(i10);
        sb2.append(", originator=");
        sb2.append(i11);
        sb2.append(", gain=");
        sb2.append(f10);
        sb2.append("}");
        return sb2.toString();
    }
}
