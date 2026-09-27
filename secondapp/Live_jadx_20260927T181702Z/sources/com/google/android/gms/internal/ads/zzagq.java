package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzagq {
    public final zzagt zza;
    public final zzagt zzb;

    public zzagq(zzagt zzagtVar, zzagt zzagtVar2) {
        this.zza = zzagtVar;
        this.zzb = zzagtVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagq.class == obj.getClass()) {
            zzagq zzagqVar = (zzagq) obj;
            if (this.zza.equals(zzagqVar.zza) && this.zzb.equals(zzagqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzagt zzagtVar = this.zza;
        zzagt zzagtVar2 = this.zzb;
        String string = zzagtVar.toString();
        String strConcat = zzagtVar.equals(zzagtVar2) ? "" : ", ".concat(zzagtVar2.toString());
        StringBuilder sb2 = new StringBuilder(string.length() + 1 + strConcat.length() + 1);
        sb2.append(C4235d4.j.f61460d);
        sb2.append(string);
        sb2.append(strConcat);
        sb2.append(C4235d4.j.f61462e);
        return sb2.toString();
    }
}
