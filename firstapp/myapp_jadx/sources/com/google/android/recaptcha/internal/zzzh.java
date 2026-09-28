package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzh extends zzsn implements zztt {
    private static final zzzh zzb;
    private static volatile zzua zzd;
    private int zze;

    static {
        zzzh zzzhVar = new zzzh();
        zzb = zzzhVar;
        zzsn.zzI(zzzh.class, zzzhVar);
    }

    private zzzh() {
    }

    public static zzzh zzg(byte[] bArr) {
        return (zzzh) zzsn.zzx(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i, Object obj, Object obj2) {
        zzua zzsiVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzzh();
        }
        zzzv zzzvVar = null;
        if (i2 == 4) {
            return new zzzg(zzzvVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzua zzuaVar = zzd;
        if (zzuaVar != null) {
            return zzuaVar;
        }
        synchronized (zzzh.class) {
            try {
                zzsiVar = zzd;
                if (zzsiVar == null) {
                    zzsiVar = new zzsi(zzb);
                    zzd = zzsiVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzsiVar;
    }

    public final zzzk zzi() {
        zzzk zzzkVarZzb = zzzk.zzb(this.zze);
        return zzzkVarZzb == null ? zzzk.UNRECOGNIZED : zzzkVarZzb;
    }
}
