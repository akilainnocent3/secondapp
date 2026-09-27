package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzabo implements zzds {
    static final /* synthetic */ zzabo zza = new zzabo();

    private /* synthetic */ zzabo() {
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final /* synthetic */ void zza(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
