package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgel {
    private final ExecutorService zza;

    public zzgel(ExecutorService executorService) {
        this.zza = executorService;
    }

    public final zzgec zza(File file, zzifc zzifcVar, zzgsn zzgsnVar) {
        return new zzgek(file, this.zza, new zzgei(zzifcVar), zzgsnVar);
    }

    public final zzgec zzb(File file, byte[] bArr, zzgsn zzgsnVar) {
        return new zzgek(file, this.zza, new zzgee(bArr), zzgsnVar);
    }
}
