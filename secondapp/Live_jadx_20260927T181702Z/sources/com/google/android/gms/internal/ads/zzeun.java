package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeun implements zzfby {
    private final Set zza;

    public zzeun(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final nj.t1 zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzhbi.zza(new zzeum(arrayList, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 8;
    }
}
