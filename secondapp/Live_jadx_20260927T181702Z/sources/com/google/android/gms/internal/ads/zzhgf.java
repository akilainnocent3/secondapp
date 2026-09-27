package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgf extends zzhel {
    private final zzhge zza;

    private zzhgf(zzhge zzhgeVar) {
        this.zza = zzhgeVar;
    }

    public static zzhgf zzb(zzhge zzhgeVar) {
        return new zzhgf(zzhgeVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhgf) && ((zzhgf) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhgf.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 39);
        sb2.append("ChaCha20Poly1305 Parameters (variant: ");
        sb2.append(string);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zza != zzhge.zzc;
    }

    public final zzhge zzc() {
        return this.zza;
    }
}
