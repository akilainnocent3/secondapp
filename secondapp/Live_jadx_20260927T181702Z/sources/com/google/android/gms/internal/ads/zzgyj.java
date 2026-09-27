package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgyj {
    public static zzgyi zza(Set set, Set set2) {
        zzgsw.zzk(set, "set1");
        zzgsw.zzk(set2, "set2");
        return new zzgye(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set zzb(Set set, zzgsx zzgsxVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (!(sortedSet instanceof zzgyf)) {
                return new zzgyg(sortedSet, zzgsxVar);
            }
            zzgyf zzgyfVar = (zzgyf) sortedSet;
            return new zzgyg((SortedSet) zzgyfVar.zza, zzgta.zzb(zzgyfVar.zzb, zzgsxVar));
        }
        if (!(set instanceof zzgyf)) {
            set.getClass();
            return new zzgyf(set, zzgsxVar);
        }
        zzgyf zzgyfVar2 = (zzgyf) set;
        return new zzgyf((Set) zzgyfVar2.zza, zzgta.zzb(zzgyfVar2.zzb, zzgsxVar));
    }

    public static int zzc(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zze(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static boolean zzf(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzgxq) {
            collection = ((zzgxq) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }
}
