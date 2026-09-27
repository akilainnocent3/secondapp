package com.google.android.gms.internal.cast;

import gi.j;
import zq.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfe implements zzfc {
    private static final zzfc zza = new zzfc() { // from class: com.google.android.gms.internal.cast.zzfd
        @Override // com.google.android.gms.internal.cast.zzfc
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzfc zzb;

    @a
    private Object zzc;

    public zzfe(zzfc zzfcVar) {
        this.zzb = zzfcVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + j.f86771d;
    }

    @Override // com.google.android.gms.internal.cast.zzfc
    public final Object zza() {
        zzfc zzfcVar = this.zzb;
        zzfc zzfcVar2 = zza;
        if (zzfcVar != zzfcVar2) {
            synchronized (this) {
                try {
                    if (this.zzb != zzfcVar2) {
                        Object objZza = this.zzb.zza();
                        this.zzc = objZza;
                        this.zzb = zzfcVar2;
                        return objZza;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.zzc;
    }
}
