package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzchx {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzaul zzaulVar;
        zzauk zzaukVar;
        long j10 = this.zza;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzaug(new zzchw(byteBufferDuplicate), zzcib.zzb).zzc().iterator();
            while (true) {
                zzaulVar = null;
                if (!it.hasNext()) {
                    zzaukVar = null;
                    break;
                }
                zzaui zzauiVar = (zzaui) it.next();
                if (zzauiVar instanceof zzauk) {
                    zzaukVar = (zzauk) zzauiVar;
                    break;
                }
            }
            for (zzaui zzauiVar2 : zzaukVar.zzc()) {
                if (zzauiVar2 instanceof zzaul) {
                    zzaulVar = (zzaul) zzauiVar2;
                    break;
                }
            }
            long jZzd = (zzaulVar.zzd() * 1000) / zzaulVar.zzc();
            this.zza = jZzd;
            return jZzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
