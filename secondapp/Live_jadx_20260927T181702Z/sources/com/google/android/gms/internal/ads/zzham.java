package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzham extends zzhal {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzhao.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzhao.class, "remainingField");

    private zzham() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zza(zzhao zzhaoVar, Set set, Set set2) {
        h0.b.a(zza, zzhaoVar, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final int zzb(zzhao zzhaoVar) {
        return zzb.decrementAndGet(zzhaoVar);
    }

    public /* synthetic */ zzham(byte[] bArr) {
        super(null);
    }
}
