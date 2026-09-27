package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbn {
    public static final zzbn zza = new zzbn(zzgvz.zzi());
    private final zzgvz zzb;

    static {
        String str = zzfk.zza;
        Integer.toString(0, 36);
    }

    public zzbn(List list) {
        this.zzb = zzgvz.zzq(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbn.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbn) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzgvz zza() {
        return this.zzb;
    }

    public final boolean zzb(int i10) {
        int i11 = 0;
        while (true) {
            zzgvz zzgvzVar = this.zzb;
            if (i11 >= zzgvzVar.size()) {
                return false;
            }
            zzbm zzbmVar = (zzbm) zzgvzVar.get(i11);
            if (zzbmVar.zzb() && zzbmVar.zzd() == i10) {
                return true;
            }
            i11++;
        }
    }
}
