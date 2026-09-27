package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhon extends zzhoq {
    private final int zza;
    private final int zzb;
    private final zzhom zzc;
    private final zzhol zzd;

    public /* synthetic */ zzhon(int i10, int i11, zzhom zzhomVar, zzhol zzholVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzhomVar;
        this.zzd = zzholVar;
    }

    public static zzhok zzb() {
        return new zzhok(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhon)) {
            return false;
        }
        zzhon zzhonVar = (zzhon) obj;
        return zzhonVar.zza == this.zza && zzhonVar.zze() == zze() && zzhonVar.zzc == this.zzc && zzhonVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhon.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzhol zzholVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzholVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i10 = this.zzb;
        int length3 = String.valueOf(i10).length();
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i11).length() + 10);
        sb2.append("HMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", hashType: ");
        sb2.append(strValueOf2);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte tags, and ");
        sb2.append(i11);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzc != zzhom.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhom zzhomVar = this.zzc;
        if (zzhomVar == zzhom.zzd) {
            return this.zzb;
        }
        if (zzhomVar == zzhom.zza || zzhomVar == zzhom.zzb || zzhomVar == zzhom.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhom zzf() {
        return this.zzc;
    }

    public final zzhol zzg() {
        return this.zzd;
    }
}
