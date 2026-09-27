package com.google.android.gms.internal.ads;

import androidx.media3.session.fe;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgw {

    @zq.h
    private zzhgy zza;

    @zq.h
    private String zzb;

    @zq.h
    private zzhgx zzc;

    @zq.h
    private zzhel zzd;

    private zzhgw() {
        throw null;
    }

    public final zzhgw zza(zzhgy zzhgyVar) {
        this.zza = zzhgyVar;
        return this;
    }

    public final zzhgw zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzhgw zzc(zzhgx zzhgxVar) {
        this.zzc = zzhgxVar;
        return this;
    }

    public final zzhgw zzd(zzhel zzhelVar) {
        this.zzd = zzhelVar;
        return this;
    }

    public final zzhgz zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzhgy.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzhgx zzhgxVar = this.zzc;
        if (zzhgxVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzhel zzhelVar = this.zzd;
        if (zzhelVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzhelVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzhgxVar.equals(zzhgx.zza) && (zzhelVar instanceof zzhfq)) || ((zzhgxVar.equals(zzhgx.zzc) && (zzhelVar instanceof zzhgf)) || ((zzhgxVar.equals(zzhgx.zzb) && (zzhelVar instanceof zzhib)) || ((zzhgxVar.equals(zzhgx.zzd) && (zzhelVar instanceof zzhez)) || ((zzhgxVar.equals(zzhgx.zze) && (zzhelVar instanceof zzhfh)) || (zzhgxVar.equals(zzhgx.zzf) && (zzhelVar instanceof zzhfz))))))) {
            return new zzhgz(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        String string = this.zzc.toString();
        String strValueOf = String.valueOf(this.zzd);
        StringBuilder sb2 = new StringBuilder(string.length() + 67 + strValueOf.length() + 1);
        sb2.append("Cannot use parsing strategy ");
        sb2.append(string);
        sb2.append(" when new keys are picked according to ");
        sb2.append(strValueOf);
        sb2.append(fe.F);
        throw new GeneralSecurityException(sb2.toString());
    }

    public /* synthetic */ zzhgw(byte[] bArr) {
    }
}
