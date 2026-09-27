package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhhu extends zzhel {
    private final zzhht zza;
    private final int zzb;

    private zzhhu(zzhht zzhhtVar, int i10) {
        this.zza = zzhhtVar;
        this.zzb = i10;
    }

    public static zzhhu zzb(zzhht zzhhtVar, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzhhu(zzhhtVar, i10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhu)) {
            return false;
        }
        zzhhu zzhhuVar = (zzhhu) obj;
        return zzhhuVar.zza == this.zza && zzhhuVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhhu.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 48 + String.valueOf(i10).length() + 1);
        sb2.append("X-AES-GCM Parameters (variant: ");
        sb2.append(string);
        sb2.append("salt_size_bytes: ");
        sb2.append(i10);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zza != zzhht.zzb;
    }

    public final zzhht zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }
}
