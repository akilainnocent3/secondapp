package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgwo extends zzgtx {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzgsx zzb;

    public zzgwo(Iterator it, zzgsx zzgsxVar) {
        this.zza = it;
        this.zzb = zzgsxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtx
    public final Object zza() {
        zzgsx zzgsxVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzgsxVar = this.zzb;
            next = it.next();
        } while (!zzgsxVar.zza(next));
        return next;
    }
}
