package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzgwh<K, V> extends zzgut<K, V> implements Serializable {
    final transient zzgwc<K, ? extends zzgvv<V>> map;
    final transient int size;

    public zzgwh(zzgwc zzgwcVar, int i10) {
        this.map = zzgwcVar;
        this.size = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgxh
    public final int zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgus, com.google.android.gms.internal.ads.zzgxh
    @Deprecated
    public final boolean zze(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxh
    @Deprecated
    public final void zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgus
    public final Set zzh() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.android.gms.internal.ads.zzgus
    public final /* synthetic */ Collection zzj() {
        return new zzgwg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgus
    public final Map zzl() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.zzgus
    public final boolean zzr(Object obj) {
        return obj != null && super.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgus, com.google.android.gms.internal.ads.zzgxh
    public final /* bridge */ /* synthetic */ Collection zzt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgus, com.google.android.gms.internal.ads.zzgxh
    public /* synthetic */ Map zzu() {
        return this.map;
    }
}
