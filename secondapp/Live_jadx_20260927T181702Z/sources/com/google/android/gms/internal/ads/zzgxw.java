package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgxw extends zzgwj {
    private final transient zzgwc zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzgxw(zzgwc zzgwcVar, Object[] objArr, int i10, int i11) {
        this.zza = zzgwcVar;
        this.zzb = objArr;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, com.google.android.gms.internal.ads.zzgvv
    /* JADX INFO: renamed from: zza */
    public final zzgyn iterator() {
        return zze().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    public final int zzg(Object[] objArr, int i10) {
        return zze().zzg(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final zzgvz zzs() {
        return new zzgxv(this);
    }

    public final /* synthetic */ Object[] zzw() {
        return this.zzb;
    }

    public final /* synthetic */ int zzx() {
        return this.zzc;
    }
}
