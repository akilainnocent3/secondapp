package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfz extends zzhel {
    private final int zza;
    private final zzhfy zzb;

    public /* synthetic */ zzhfz(int i10, zzhfy zzhfyVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = zzhfyVar;
    }

    public static zzhfx zzb() {
        return new zzhfx(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhfz)) {
            return false;
        }
        zzhfz zzhfzVar = (zzhfz) obj;
        return zzhfzVar.zza == this.zza && zzhfzVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhfz.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        int length = strValueOf.length();
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 33 + String.valueOf(i10).length() + 10);
        sb2.append("AesGcmSiv Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzb != zzhfy.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhfy zzd() {
        return this.zzb;
    }
}
