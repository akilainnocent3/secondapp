package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgtp implements Serializable, zzgto {
    final zzgto zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzgtv zzd = new zzgtv();

    public zzgtp(zzgto zzgtoVar) {
        this.zza = zzgtoVar;
    }

    public final String toString() {
        Object string;
        if (this.zzb) {
            String strValueOf = String.valueOf(this.zzc);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(strValueOf);
            sb2.append(">");
            string = sb2.toString();
        } else {
            string = this.zza;
        }
        String string2 = string.toString();
        StringBuilder sb3 = new StringBuilder(string2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(string2);
        sb3.append(gi.j.f86771d);
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgto
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
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
