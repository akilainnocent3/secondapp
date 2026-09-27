package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhcx {
    private final OutputStream zza;

    private zzhcx(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzhcx zzb(OutputStream outputStream) {
        return new zzhcx(outputStream);
    }

    public final void zza(zzhso zzhsoVar) throws IOException {
        try {
            zzhsoVar.zzaO(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
