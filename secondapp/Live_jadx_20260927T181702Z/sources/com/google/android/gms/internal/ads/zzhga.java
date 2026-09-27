package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhga extends zzhek {
    private final zzhgf zza;
    private final zziao zzb;
    private final zziam zzc;

    @zq.h
    private final Integer zzd;

    private zzhga(zzhgf zzhgfVar, zziao zziaoVar, zziam zziamVar, @zq.h Integer num) {
        this.zza = zzhgfVar;
        this.zzb = zziaoVar;
        this.zzc = zziamVar;
        this.zzd = num;
    }

    public static zzhga zzd(zzhge zzhgeVar, zziao zziaoVar, @zq.h Integer num) throws GeneralSecurityException {
        zziam zziamVarZzb;
        zzhge zzhgeVar2 = zzhge.zzc;
        if (zzhgeVar != zzhgeVar2 && num == null) {
            String string = zzhgeVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 62);
            sb2.append("For given Variant ");
            sb2.append(string);
            sb2.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzhgeVar == zzhgeVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zziaoVar.zzd() != 32) {
            int iZzd = zziaoVar.zzd();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 74);
            sb3.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb3.append(iZzd);
            throw new GeneralSecurityException(sb3.toString());
        }
        zzhgf zzhgfVarZzb = zzhgf.zzb(zzhgeVar);
        if (zzhgfVarZzb.zzc() == zzhgeVar2) {
            zziamVarZzb = zzhmk.zza;
        } else if (zzhgfVarZzb.zzc() == zzhge.zzb) {
            zziamVarZzb = zzhmk.zza(num.intValue());
        } else {
            if (zzhgfVarZzb.zzc() != zzhge.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhgfVarZzb.zzc().toString()));
            }
            zziamVarZzb = zzhmk.zzb(num.intValue());
        }
        return new zzhga(zzhgfVarZzb, zziaoVar, zziamVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhek, com.google.android.gms.internal.ads.zzhdc
    public final /* synthetic */ zzhdt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    @zq.h
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final zziam zzc() {
        return this.zzc;
    }

    public final zziao zze() {
        return this.zzb;
    }

    public final zzhgf zzf() {
        return this.zza;
    }
}
