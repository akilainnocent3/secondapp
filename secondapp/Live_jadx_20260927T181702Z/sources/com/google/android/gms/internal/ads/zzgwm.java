package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzgwm<K, V> extends zzgwh<K, V> implements zzgxh<K, V> {
    private final transient zzgwj<V> emptySet;
    private transient zzgwj zza;

    public zzgwm(zzgwc zzgwcVar, int i10, Comparator comparator) {
        super(zzgwcVar, i10);
        this.emptySet = zzgya.zza;
    }

    public final zzgwj zza() {
        zzgwj zzgwjVar = this.zza;
        if (zzgwjVar != null) {
            return zzgwjVar;
        }
        zzgwl zzgwlVar = new zzgwl(this);
        this.zza = zzgwlVar;
        return zzgwlVar;
    }
}
