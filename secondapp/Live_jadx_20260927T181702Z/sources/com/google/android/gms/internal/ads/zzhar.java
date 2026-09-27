package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhar extends zzhat {
    public zzhar(zzgvv zzgvvVar, boolean z10) {
        super(zzgvvVar, z10);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList arrayListZzb = zzgwz.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhas zzhasVar = (zzhas) it.next();
            arrayListZzb.add(zzhasVar != null ? zzhasVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZzb);
    }
}
