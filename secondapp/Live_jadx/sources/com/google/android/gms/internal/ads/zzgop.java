package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgop {
    private final Set zza;
    private final zzgpg zzb;

    public zzgop(zzgpg zzgpgVar, Set set) {
        this.zza = set;
        this.zzb = zzgpgVar;
    }

    public final void zza(List list) {
        this.zzb.zza(list);
    }

    public final Map zzb() {
        HashMap map = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgor) it.next()).zzb(map);
        }
        return map;
    }

    public final Map zzc(Context context, View view) {
        HashMap map = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgor) it.next()).zzc(map, context, view);
        }
        return map;
    }

    public final Map zzd() {
        HashMap map = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgor) it.next()).zzd(map);
        }
        return map;
    }
}
