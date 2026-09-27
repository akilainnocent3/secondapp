package com.google.android.gms.internal.ads;

import com.ironsource.G5;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgwc<K, V> implements Map<K, V>, Serializable {
    private transient zzgwj zza;
    private transient zzgwj zzb;
    private transient zzgvv zzc;

    public static zzgwc zza() {
        return zzgxz.zza;
    }

    public static zzgwc zzb(Object obj, Object obj2) {
        zzguv.zza("dialog_not_shown_reason", obj2);
        return zzgxz.zzk(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public static zzgwc zzc(Map map) {
        if ((map instanceof zzgwc) && !(map instanceof SortedMap)) {
            zzgwc zzgwcVar = (zzgwc) map;
            zzgwcVar.zzj();
            return zzgwcVar;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        zzgwb zzgwbVar = new zzgwb(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzgwbVar.zzb(setEntrySet);
        return zzgwbVar.zzc();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzgxg.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgyj.zzc(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzguv.zzb(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, sc.k.Q));
        sb2.append(fw.b.f85382i);
        boolean z10 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append(G5.T);
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append(fw.b.f85383j);
        return sb2.toString();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgwj entrySet() {
        zzgwj zzgwjVar = this.zza;
        if (zzgwjVar != null) {
            return zzgwjVar;
        }
        zzgwj zzgwjVarZze = zze();
        this.zza = zzgwjVarZze;
        return zzgwjVarZze;
    }

    public abstract zzgwj zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzgwj keySet() {
        zzgwj zzgwjVar = this.zzb;
        if (zzgwjVar != null) {
            return zzgwjVar;
        }
        zzgwj zzgwjVarZzg = zzg();
        this.zzb = zzgwjVarZzg;
        return zzgwjVarZzg;
    }

    public abstract zzgwj zzg();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgvv values() {
        zzgvv zzgvvVar = this.zzc;
        if (zzgvvVar != null) {
            return zzgvvVar;
        }
        zzgvv zzgvvVarZzi = zzi();
        this.zzc = zzgvvVarZzi;
        return zzgvvVarZzi;
    }

    public abstract zzgvv zzi();

    public abstract boolean zzj();
}
