package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzaoy implements Comparator {
    static final /* synthetic */ zzaoy zza = new zzaoy();

    private /* synthetic */ zzaoy() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.compare(((zzaop) obj).zzb, ((zzaop) obj2).zzb);
    }
}
