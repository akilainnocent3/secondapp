package com.google.android.gms.internal.cast;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzsm implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzsu zzsuVar = (zzsu) obj;
        zzsu zzsuVar2 = (zzsu) obj2;
        zzsl zzslVar = new zzsl(zzsuVar);
        zzsl zzslVar2 = new zzsl(zzsuVar2);
        while (zzslVar.hasNext() && zzslVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzslVar.zza() & 255).compareTo(Integer.valueOf(zzslVar2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzsuVar.zzd()).compareTo(Integer.valueOf(zzsuVar2.zzd()));
    }
}
