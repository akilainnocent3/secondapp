package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhez extends zzhel {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzhey zze;
    private final zzhex zzf;

    public /* synthetic */ zzhez(int i10, int i11, int i12, int i13, zzhey zzheyVar, zzhex zzhexVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzheyVar;
        this.zzf = zzhexVar;
    }

    public static zzhew zzb() {
        return new zzhew(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhez)) {
            return false;
        }
        zzhez zzhezVar = (zzhez) obj;
        return zzhezVar.zza == this.zza && zzhezVar.zzb == this.zzb && zzhezVar.zzc == this.zzc && zzhezVar.zzd == this.zzd && zzhezVar.zze == this.zze && zzhezVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzhez.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        zzhex zzhexVar = this.zzf;
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(zzhexVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i10 = this.zzc;
        int length3 = String.valueOf(i10).length();
        int i11 = this.zzd;
        int length4 = String.valueOf(i11).length();
        int i12 = this.zza;
        int length5 = String.valueOf(i12).length();
        int i13 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i13).length() + 15);
        sb2.append("AesCtrHmacAead Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", hashType: ");
        sb2.append(strValueOf2);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte IV, and ");
        sb2.append(i11);
        sb2.append("-byte tags, and ");
        sb2.append(i12);
        sb2.append("-byte AES key, and ");
        sb2.append(i13);
        sb2.append("-byte HMAC key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zze != zzhey.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzc;
    }

    public final zzhey zzg() {
        return this.zze;
    }

    public final zzhex zzh() {
        return this.zzf;
    }
}
