package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhnz extends zzhoq {
    private final int zza;
    private final int zzb;
    private final zzhny zzc;

    public /* synthetic */ zzhnz(int i10, int i11, zzhny zzhnyVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzhnyVar;
    }

    public static zzhnx zzb() {
        return new zzhnx(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhnz)) {
            return false;
        }
        zzhnz zzhnzVar = (zzhnz) obj;
        return zzhnzVar.zza == this.zza && zzhnzVar.zze() == zze() && zzhnzVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhnz.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        int length = strValueOf.length();
        int i10 = this.zzb;
        int length2 = String.valueOf(i10).length();
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i11).length() + 10);
        sb2.append("AES-CMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte tags, and ");
        sb2.append(i11);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzc != zzhny.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhny zzhnyVar = this.zzc;
        if (zzhnyVar == zzhny.zzd) {
            return this.zzb;
        }
        if (zzhnyVar == zzhny.zza || zzhnyVar == zzhny.zzb || zzhnyVar == zzhny.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhny zzf() {
        return this.zzc;
    }
}
