package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzewh implements zzfby {

    @Nullable
    private final zzfgs zza;

    public zzewh(@Nullable zzfgs zzfgsVar) {
        this.zza = zzfgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final nj.t1 zza() {
        zzfgs zzfgsVar = this.zza;
        if (zzfgsVar == null) {
            return zzhbi.zza(new zzewg(null));
        }
        String strZza = zzfgsVar.zza();
        return Strings.isEmptyOrWhitespace(strZza) ? zzhbi.zza(new zzewg(null)) : zzhbi.zza(new zzewg(strZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 15;
    }
}
