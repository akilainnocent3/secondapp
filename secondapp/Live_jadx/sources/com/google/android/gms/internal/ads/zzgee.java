package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgee implements zzgej {
    private final byte[] zza;

    public zzgee(byte[] bArr) {
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        outputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return zzgyz.zza(inputStream);
        } catch (IOException e10) {
            throw new zzgef("Cannot read bytes.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
