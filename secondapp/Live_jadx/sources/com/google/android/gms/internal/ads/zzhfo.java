package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfo {

    @zq.h
    private Integer zza = null;

    @zq.h
    private Integer zzb = null;

    @zq.h
    private Integer zzc = null;
    private zzhfp zzd = zzhfp.zzc;

    private zzhfo() {
    }

    public final zzhfo zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzhfo zzb(int i10) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzhfo zzc(int i10) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzhfo zzd(zzhfp zzhfpVar) {
        this.zzd = zzhfpVar;
        return this;
    }

    public final zzhfq zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.zzb.getClass();
        this.zzc.getClass();
        return new zzhfq(iIntValue, 12, 16, this.zzd, null);
    }

    public /* synthetic */ zzhfo(byte[] bArr) {
    }
}
