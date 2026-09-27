package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhnp extends RuntimeException {
    public zzhnp(String str) {
        super(str);
    }

    public static Object zza(zzhno zzhnoVar) {
        try {
            return zzhnoVar.zza();
        } catch (Exception e10) {
            throw new zzhnp(e10);
        }
    }

    public zzhnp(String str, Throwable th2) {
        super(str, th2);
    }

    public zzhnp(Throwable th2) {
        super(th2);
    }
}
