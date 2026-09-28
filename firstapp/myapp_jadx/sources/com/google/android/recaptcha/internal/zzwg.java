package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzwg extends zzsn implements zztt {
    private static final zzwg zzb;
    private static volatile zzua zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzwg zzwgVar = new zzwg();
        zzb = zzwgVar;
        zzsn.zzI(zzwg.class, zzwgVar);
    }

    private zzwg() {
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i, Object obj, Object obj2) {
        zzua zzsiVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzwg();
        }
        zzwf zzwfVar = null;
        if (i2 == 4) {
            return new zzwe(zzwfVar);
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
        synchronized (zzwg.class) {
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
}
