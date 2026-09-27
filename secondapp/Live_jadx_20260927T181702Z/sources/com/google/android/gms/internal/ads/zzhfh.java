package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfh extends zzhel {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzhfg zzd;

    public /* synthetic */ zzhfh(int i10, int i11, int i12, zzhfg zzhfgVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzd = zzhfgVar;
    }

    public static zzhff zzb() {
        return new zzhff(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhfh)) {
            return false;
        }
        zzhfh zzhfhVar = (zzhfh) obj;
        return zzhfhVar.zza == this.zza && zzhfhVar.zzb == this.zzb && zzhfhVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhfh.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int i10 = this.zzb;
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(16).length();
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i11).length() + 10);
        sb2.append("AesEax Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte IV, ");
        sb2.append(16);
        sb2.append("-byte tag, and ");
        sb2.append(i11);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzd != zzhfg.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final zzhfg zze() {
        return this.zzd;
    }
}
