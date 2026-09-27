package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhmk {
    public static final zziam zza = zziam.zza(new byte[0]);

    public static final zziam zza(int i10) {
        return zziam.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final zziam zzb(int i10) {
        return zziam.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
