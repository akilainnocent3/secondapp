package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhut extends zzhxb {
    private final zzhus zza;

    private zzhut(zzhus zzhusVar) {
        this.zza = zzhusVar;
    }

    public static zzhut zzb(zzhus zzhusVar) {
        return new zzhut(zzhusVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhut) && ((zzhut) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhut.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 30);
        sb2.append("Ed25519 Parameters (variant: ");
        sb2.append(string);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zza != zzhus.zzd;
    }

    public final zzhus zzc() {
        return this.zza;
    }
}
