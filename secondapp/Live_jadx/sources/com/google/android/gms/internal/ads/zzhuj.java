package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhuj extends zzhxb {
    private final zzhuh zza;
    private final zzhuf zzb;
    private final zzhug zzc;
    private final zzhui zzd;

    public /* synthetic */ zzhuj(zzhuh zzhuhVar, zzhuf zzhufVar, zzhug zzhugVar, zzhui zzhuiVar, byte[] bArr) {
        this.zza = zzhuhVar;
        this.zzb = zzhufVar;
        this.zzc = zzhugVar;
        this.zzd = zzhuiVar;
    }

    public static zzhue zzb() {
        return new zzhue(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhuj)) {
            return false;
        }
        zzhuj zzhujVar = (zzhuj) obj;
        return zzhujVar.zza == this.zza && zzhujVar.zzb == this.zzb && zzhujVar.zzc == this.zzc && zzhujVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhuj.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        String string = this.zzd.toString();
        int length = string.length();
        String string2 = this.zzc.toString();
        int length2 = string2.length();
        String string3 = this.zza.toString();
        int length3 = string3.length();
        String string4 = this.zzb.toString();
        StringBuilder sb2 = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + string4.length() + 1);
        sb2.append("ECDSA Parameters (variant: ");
        sb2.append(string);
        sb2.append(", hashType: ");
        sb2.append(string2);
        sb2.append(", encoding: ");
        sb2.append(string3);
        sb2.append(", curve: ");
        sb2.append(string4);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzd != zzhui.zzd;
    }

    public final zzhuh zzc() {
        return this.zza;
    }

    public final zzhuf zzd() {
        return this.zzb;
    }

    public final zzhug zze() {
        return this.zzc;
    }

    public final zzhui zzf() {
        return this.zzd;
    }
}
