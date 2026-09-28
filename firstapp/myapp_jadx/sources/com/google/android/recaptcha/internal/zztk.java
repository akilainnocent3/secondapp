package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zztk implements zzuh {
    private static final zztq zza = new zzti();
    private final zztq zzb;

    public zztk() {
        zzsg zzsgVarZza = zzsg.zza();
        int i = zzuc.zza;
        zztj zztjVar = new zztj(zzsgVarZza, zza);
        byte[] bArr = zzsv.zzb;
        this.zzb = zztjVar;
    }

    @Override // com.google.android.recaptcha.internal.zzuh
    public final zzug zza(Class cls) {
        int i = zzui.zza;
        if (!zzsn.class.isAssignableFrom(cls)) {
            int i2 = zzuc.zza;
        }
        zztp zztpVarZzb = this.zzb.zzb(cls);
        if (zztpVarZzb.zzb()) {
            int i3 = zzuc.zza;
            return zztw.zzc(zzui.zzm(), zzsb.zza(), zztpVarZzb.zza());
        }
        int i4 = zzuc.zza;
        return zztv.zzm(cls, zztpVarZzb, zztz.zza(), zztg.zza(), zzui.zzm(), zztpVarZzb.zzc() + (-1) != 1 ? zzsb.zza() : null, zzto.zza());
    }
}
