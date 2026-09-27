package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zzavp implements Supplier {
    private final /* synthetic */ int zzc;
    public static final /* synthetic */ zzavp zzb = new zzavp(1);
    static final /* synthetic */ zzavp zza = new zzavp(0);

    private /* synthetic */ zzavp(int i10) {
        this.zzc = i10;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.zzc != 0 ? zzawf.zza(null) : new zzavs();
    }
}
