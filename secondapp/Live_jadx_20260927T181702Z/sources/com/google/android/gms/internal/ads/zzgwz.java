package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgwz {
    public static ArrayList zza(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList zzb(int i10) {
        zzguv.zzb(i10, "initialArraySize");
        return new ArrayList(i10);
    }

    public static List zzc(List list, zzgsn zzgsnVar) {
        return list instanceof RandomAccess ? new zzgww(list, zzgsnVar) : new zzgwy(list, zzgsnVar);
    }
}
