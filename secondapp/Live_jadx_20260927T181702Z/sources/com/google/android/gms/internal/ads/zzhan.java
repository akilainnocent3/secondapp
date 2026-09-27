package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhan extends zzhal {
    private zzhan() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zza(zzhao zzhaoVar, Set set, Set set2) {
        synchronized (zzhaoVar) {
            try {
                if (zzhaoVar.seenExceptionsField == null) {
                    zzhaoVar.seenExceptionsField = set2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final int zzb(zzhao zzhaoVar) {
        int i10;
        synchronized (zzhaoVar) {
            i10 = zzhaoVar.remainingField - 1;
            zzhaoVar.remainingField = i10;
        }
        return i10;
    }

    public /* synthetic */ zzhan(byte[] bArr) {
        super(null);
    }
}
