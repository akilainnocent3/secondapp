package com.google.android.gms.internal.play_billing;

import com.ironsource.G5;
import fw.b;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import sc.k;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzcr implements Map, Serializable {

    @zq.a
    private transient zzcv zza;

    @zq.a
    private transient zzcv zzb;

    @zq.a
    private transient zzcj zzc;

    public static zzcr zzc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        zzbw.zzb("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        zzbw.zzb("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        zzbw.zzb("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return zzdp.zzg(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@zq.a Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@zq.a Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@zq.a Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    @zq.a
    public abstract Object get(@zq.a Object obj);

    @Override // java.util.Map
    @zq.a
    public final Object getOrDefault(@zq.a Object obj, @zq.a Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzds.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzcv zzcvVar = this.zzb;
        if (zzcvVar != null) {
            return zzcvVar;
        }
        zzcv zzcvVarZze = zze();
        this.zzb = zzcvVarZze;
        return zzcvVarZze;
    }

    @Override // java.util.Map
    @zq.a
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
    @zq.a
    @Deprecated
    public final Object remove(@zq.a Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzbw.zza(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, k.Q));
        sb2.append(b.f85382i);
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append(G5.T);
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append(b.f85383j);
        return sb2.toString();
    }

    public abstract zzcj zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzcj values() {
        zzcj zzcjVar = this.zzc;
        if (zzcjVar != null) {
            return zzcjVar;
        }
        zzcj zzcjVarZza = zza();
        this.zzc = zzcjVarZza;
        return zzcjVarZza;
    }

    public abstract zzcv zzd();

    public abstract zzcv zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzcv entrySet() {
        zzcv zzcvVar = this.zza;
        if (zzcvVar != null) {
            return zzcvVar;
        }
        zzcv zzcvVarZzd = zzd();
        this.zza = zzcvVarZzd;
        return zzcvVarZzd;
    }
}
