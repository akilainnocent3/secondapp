package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgwn {
    public static boolean zza(Iterable iterable, zzgsx zzgsxVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzgsxVar.getClass();
            return zzc((List) iterable, zzgsxVar);
        }
        Iterator it = iterable.iterator();
        zzgsxVar.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            if (zzgsxVar.zza(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static Object zzb(Iterable iterable, Object obj) {
        zzgyn it = ((zzgye) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean zzc(List list, zzgsx zzgsxVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!zzgsxVar.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        zzd(list, zzgsxVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzd(list, zzgsxVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    private static void zzd(List list, zzgsx zzgsxVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (zzgsxVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            } else {
                list.remove(i11);
            }
        }
    }
}
