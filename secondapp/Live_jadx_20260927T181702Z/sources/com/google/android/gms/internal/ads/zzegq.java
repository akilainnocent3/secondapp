package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzegq implements zzhaq {
    static final /* synthetic */ zzegq zza = new zzegq();

    private /* synthetic */ zzegq() {
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final /* synthetic */ nj.t1 zza(Object obj) {
        Throwable cause = (ExecutionException) obj;
        if (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return zzhbi.zzc(cause);
    }
}
