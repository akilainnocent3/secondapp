package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzilq extends zzilt implements zzaui {
    protected final String zza = "moov";

    public zzilq(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzb(zzilu zziluVar, ByteBuffer byteBuffer, long j10, zzauf zzaufVar) throws IOException {
        zziluVar.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zziluVar;
        this.zze = zziluVar.zzc();
        zziluVar.zzd(zziluVar.zzc() + j10);
        this.zzf = zziluVar.zzc();
        this.zzb = zzaufVar;
    }
}
