package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import jv.b2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgas {
    @oy.l
    public static final zzgaq zza(@oy.l final ExecutorService executorService) {
        kotlin.jvm.internal.m0.p(executorService, "executorService");
        return new zzgaq() { // from class: com.google.android.gms.internal.ads.zzgar
            @Override // com.google.android.gms.internal.ads.zzgaq
            public final /* synthetic */ jv.s0 zza() {
                return jv.t0.a(b2.d(executorService));
            }
        };
    }
}
