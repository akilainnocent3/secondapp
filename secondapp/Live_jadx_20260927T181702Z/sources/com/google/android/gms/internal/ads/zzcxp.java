package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcxp implements zzeos {
    public final List zza;

    public zzcxp(List list) {
        this.zza = list;
    }

    public static zzelg zza(@NonNull zzenm zzenmVar) {
        return new zzelh(zzenmVar, zzcxo.zza);
    }

    public static zzelg zzb(@NonNull zzelg zzelgVar) {
        return new zzelh(zzelgVar, zzcxn.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeos
    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzhbi.zzr((nj.t1) it.next(), new zzcxm(this), zzhbz.zza());
        }
    }

    public zzcxp(zzcxh zzcxhVar) {
        this.zza = Collections.singletonList(zzhbi.zza(zzcxhVar));
    }
}
