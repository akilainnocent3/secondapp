package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgtb extends zzgsu {
    private final Object zza;

    public zzgtb(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgtb) {
            return this.zza.equals(((zzgtb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(string);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgsu
    public final Object zza(Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgsu
    public final zzgsu zzb(zzgsn zzgsnVar) {
        Object objApply = zzgsnVar.apply(this.zza);
        zzgsw.zzk(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzgtb(objApply);
    }
}
