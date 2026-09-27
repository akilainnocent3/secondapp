package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzigh {
    private static volatile int zza = 100;

    public abstract void zza(Object obj, int i10, long j10);

    public abstract void zzb(Object obj, int i10, int i11);

    public abstract void zzc(Object obj, int i10, long j10);

    public abstract void zzd(Object obj, int i10, zzicn zzicnVar);

    public abstract void zze(Object obj, int i10, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract Object zzh(Object obj);

    public abstract void zzi(Object obj, Object obj2);

    public abstract void zzj(Object obj);

    public final boolean zzk(Object obj, zzifp zzifpVar, int i10) throws IOException {
        int iZzc = zzifpVar.zzc();
        int i11 = iZzc >>> 3;
        int i12 = iZzc & 7;
        if (i12 == 0) {
            zza(obj, i11, zzifpVar.zzh());
            return true;
        }
        if (i12 == 1) {
            zzc(obj, i11, zzifpVar.zzj());
            return true;
        }
        if (i12 == 2) {
            zzd(obj, i11, zzifpVar.zzq());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw new zzieg("Protocol message end-group tag did not match expected tag.");
            }
            if (i12 != 5) {
                throw new zzief("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i11, zzifpVar.zzk());
            return true;
        }
        Object objZzf = zzf();
        int i13 = i11 << 3;
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw new zzieg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzifpVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzifpVar, i14)) {
        }
        if ((i13 | 4) != zzifpVar.zzc()) {
            throw new zzieg("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i11, zzg(objZzf));
        return true;
    }
}
