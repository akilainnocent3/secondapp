package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgtr implements zzgto {
    private static final zzgto zzb = zzgtq.zza;
    private final zzgtv zza = new zzgtv();
    private volatile zzgto zzc;
    private Object zzd;

    public zzgtr(zzgto zzgtoVar) {
        this.zzc = zzgtoVar;
    }

    public final String toString() {
        Object string = this.zzc;
        if (string == zzb) {
            String strValueOf = String.valueOf(this.zzd);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(strValueOf);
            sb2.append(">");
            string = sb2.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(strValueOf2);
        sb3.append(gi.j.f86771d);
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgto
    public final Object zza() {
        zzgto zzgtoVar = this.zzc;
        zzgto zzgtoVar2 = zzb;
        if (zzgtoVar != zzgtoVar2) {
            synchronized (this.zza) {
                try {
                    if (this.zzc != zzgtoVar2) {
                        Object objZza = this.zzc.zza();
                        this.zzd = objZza;
                        this.zzc = zzgtoVar2;
                        return objZza;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.zzd;
    }
}
