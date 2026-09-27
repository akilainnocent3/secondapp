package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzavi implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        zzavj zzavjVar = (zzavj) obj;
        zzavj zzavjVar2 = (zzavj) obj2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = zzavjVar.zza.length;
            if (i10 >= length || i11 >= zzavjVar2.zza.length) {
                break;
            }
            int iCompare = Integer.compare(zzavj.zzg(zzavjVar.zzb(i10)), zzavj.zzg(zzavjVar2.zzb(i11)));
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
            i11++;
        }
        return Integer.compare(length, zzavjVar2.zza.length);
    }
}
