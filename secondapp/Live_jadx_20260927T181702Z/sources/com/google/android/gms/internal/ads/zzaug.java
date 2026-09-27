package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaug extends zzilt implements Closeable {
    static {
        zzima.zzb(zzaug.class);
    }

    public zzaug(zzilu zziluVar, zzauf zzaufVar) throws IOException {
        zzd(zziluVar, zziluVar.zzb(), zzaufVar);
    }

    @Override // com.google.android.gms.internal.ads.zzilt
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzilt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
