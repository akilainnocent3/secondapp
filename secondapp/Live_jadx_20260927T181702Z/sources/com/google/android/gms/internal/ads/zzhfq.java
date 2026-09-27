package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfq extends zzhel {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzhfp zzd;

    public /* synthetic */ zzhfq(int i10, int i11, int i12, zzhfp zzhfpVar, byte[] bArr) {
        this.zza = i10;
        this.zzd = zzhfpVar;
    }

    public static zzhfo zzb() {
        return new zzhfo(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhfq)) {
            return false;
        }
        zzhfq zzhfqVar = (zzhfq) obj;
        return zzhfqVar.zza == this.zza && zzhfqVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhfq.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i10).length() + 10);
        sb2.append("AesGcm Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(12);
        sb2.append("-byte IV, ");
        sb2.append(16);
        sb2.append("-byte tag, and ");
        sb2.append(i10);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzd != zzhfp.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhfp zzd() {
        return this.zzd;
    }
}
