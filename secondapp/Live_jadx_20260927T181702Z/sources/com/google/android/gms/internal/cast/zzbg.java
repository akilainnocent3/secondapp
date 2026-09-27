package com.google.android.gms.internal.cast;

import android.content.Context;
import r7.i1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbg {
    public i1 zza;
    private final Context zzb;

    public zzbg(Context context) {
        this.zzb = context;
    }

    public final i1 zza() {
        if (this.zza == null) {
            this.zza = i1.l(this.zzb);
        }
        return this.zza;
    }

    public final void zzb(i1.a aVar) {
        i1 i1VarZza = zza();
        if (i1VarZza != null) {
            i1VarZza.v(aVar);
        }
    }
}
