package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhvd extends zzhxb {
    private final zzhvb zza;
    private final zzhvc zzb;

    private zzhvd(zzhvb zzhvbVar, zzhvc zzhvcVar) {
        this.zza = zzhvbVar;
        this.zzb = zzhvcVar;
    }

    public static zzhvd zzb(zzhvb zzhvbVar, zzhvc zzhvcVar) {
        return new zzhvd(zzhvbVar, zzhvcVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhvd)) {
            return false;
        }
        zzhvd zzhvdVar = (zzhvd) obj;
        return zzhvdVar.zza == this.zza && zzhvdVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhvd.class, this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        StringBuilder sb2 = new StringBuilder(length + 47 + string2.length() + 1);
        sb2.append("ML-DSA Parameters (ML-DSA instance: ");
        sb2.append(string);
        sb2.append(", variant: ");
        sb2.append(string2);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzb != zzhvc.zzb;
    }
}
