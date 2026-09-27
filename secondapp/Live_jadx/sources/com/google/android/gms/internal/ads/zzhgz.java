package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgz extends zzhel {
    private final zzhgy zza;
    private final String zzb;
    private final zzhgx zzc;
    private final zzhel zzd;

    public /* synthetic */ zzhgz(zzhgy zzhgyVar, String str, zzhgx zzhgxVar, zzhel zzhelVar, byte[] bArr) {
        this.zza = zzhgyVar;
        this.zzb = str;
        this.zzc = zzhgxVar;
        this.zzd = zzhelVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgz)) {
            return false;
        }
        zzhgz zzhgzVar = (zzhgz) obj;
        return zzhgzVar.zzc.equals(this.zzc) && zzhgzVar.zzd.equals(this.zzd) && zzhgzVar.zzb.equals(this.zzb) && zzhgzVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzhgz.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzhgy zzhgyVar = this.zza;
        zzhel zzhelVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhelVar);
        String strValueOf3 = String.valueOf(zzhgyVar);
        String str = this.zzb;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        sb2.append("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb2.append(str);
        sb2.append(", dekParsingStrategy: ");
        sb2.append(strValueOf);
        sb2.append(", dekParametersForNewKeys: ");
        sb2.append(strValueOf2);
        sb2.append(", variant: ");
        sb2.append(strValueOf3);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zza != zzhgy.zzb;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzhgy zzc() {
        return this.zza;
    }

    public final zzhel zzd() {
        return this.zzd;
    }
}
