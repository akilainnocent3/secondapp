package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzdsp implements zzgsn {
    static final /* synthetic */ zzdsp zza = new zzdsp();

    private /* synthetic */ zzdsp() {
    }

    @Override // com.google.android.gms.internal.ads.zzgsn
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzbld zzbldVar : (List) obj) {
            if (zzbldVar != null) {
                arrayList.add(zzbldVar);
            }
        }
        return arrayList;
    }
}
