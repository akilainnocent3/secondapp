package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzis {
    private final Map zza;

    public zzis() {
        this.zza = new HashMap();
    }

    public final zzis zza(String str, int i10) {
        this.zza.put(str, Integer.valueOf(i10));
        return this;
    }

    public final zzis zzb(String str, long j10) {
        this.zza.put(str, Long.valueOf(j10));
        return this;
    }

    public final zzis zzc(String str, float f10) {
        this.zza.put(str, Float.valueOf(f10));
        return this;
    }

    public final zzis zzd(String str, @Nullable String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzis zze(String str, @Nullable ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            this.zza.put(str, null);
            return this;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer.duplicate());
        byteBufferAllocate.flip();
        this.zza.put(str, byteBufferAllocate);
        return this;
    }

    public final zzis zzf(String str) {
        this.zza.remove(str);
        return this;
    }

    public final zzit zzg() {
        return new zzit(this.zza, null);
    }
}
