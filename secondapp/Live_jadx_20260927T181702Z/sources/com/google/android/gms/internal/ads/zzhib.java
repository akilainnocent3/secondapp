package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhib extends zzhel {
    private final zzhia zza;

    private zzhib(zzhia zzhiaVar) {
        this.zza = zzhiaVar;
    }

    public static zzhib zzb(zzhia zzhiaVar) {
        return new zzhib(zzhiaVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhib) && ((zzhib) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhib.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 40);
        sb2.append("XChaCha20Poly1305 Parameters (variant: ");
        sb2.append(string);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zza != zzhia.zzc;
    }

    public final zzhia zzc() {
        return this.zza;
    }
}
