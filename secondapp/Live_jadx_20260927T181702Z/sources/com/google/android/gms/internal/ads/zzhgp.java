package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgp extends zzhel {
    private final String zza;
    private final zzhgo zzb;

    private zzhgp(String str, zzhgo zzhgoVar) {
        this.zza = str;
        this.zzb = zzhgoVar;
    }

    public static zzhgp zzb(String str, zzhgo zzhgoVar) {
        return new zzhgp(str, zzhgoVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgp)) {
            return false;
        }
        zzhgp zzhgpVar = (zzhgp) obj;
        return zzhgpVar.zza.equals(this.zza) && zzhgpVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzhgp.class, this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + string.length() + 1);
        sb2.append("LegacyKmsAead Parameters (keyUri: ");
        sb2.append(str);
        sb2.append(", variant: ");
        sb2.append(string);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzb != zzhgo.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzhgo zzd() {
        return this.zzb;
    }
}
