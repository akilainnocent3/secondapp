package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaub implements zzats {
    final /* synthetic */ Context zza;
    private File zzb = null;

    public zzaub(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
