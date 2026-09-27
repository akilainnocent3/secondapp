package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzguu extends zzgxt implements Serializable {
    final zzgsn zza;
    final zzgxt zzb;

    public zzguu(zzgsn zzgsnVar, zzgxt zzgxtVar) {
        this.zza = zzgsnVar;
        this.zzb = zzgxtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzgsn zzgsnVar = this.zza;
        return this.zzb.compare(zzgsnVar.apply(obj), zzgsnVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzguu) {
            zzguu zzguuVar = (zzguu) obj;
            if (this.zza.equals(zzguuVar.zza) && this.zzb.equals(zzguuVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        int length = string.length();
        String string2 = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(length + 12 + string2.length() + 1);
        sb2.append(string);
        sb2.append(".onResultOf(");
        sb2.append(string2);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }
}
