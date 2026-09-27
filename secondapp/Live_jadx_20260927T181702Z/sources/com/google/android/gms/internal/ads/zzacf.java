package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzacf {
    private final ByteBuffer zza = ByteBuffer.allocateDirect(500);

    @Nullable
    private zzgs zzb;

    private final void zzd(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((zzgr) list.get(i10)).zza == 1) {
                this.zzb = zzgs.zza((zzgr) list.get(i10));
            }
        }
    }

    private final void zze() {
        ByteBuffer byteBuffer = this.zza;
        byteBuffer.position(byteBuffer.limit());
    }

    public final int zza(ByteBuffer byteBuffer, boolean z10) {
        zzgs zzgsVar;
        zzgp zzgpVarZzb;
        ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.hasRemaining()) {
            zzd(zzgt.zza(byteBuffer2));
            zze();
        }
        List listZza = zzgt.zza(byteBuffer);
        zzd(listZza);
        int size = listZza.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            zzgr zzgrVar = (zzgr) listZza.get(size);
            int i11 = zzgrVar.zza;
            if (i11 != 2 && i11 != 15) {
                if (i11 == 3) {
                    if (!z10) {
                        break;
                    }
                    i11 = 3;
                    if (i11 != 6) {
                        break;
                    }
                    break;
                }
                if ((i11 != 6 && i11 != 3) || (zzgsVar = this.zzb) == null || (zzgpVarZzb = zzgp.zzb(zzgsVar, zzgrVar)) == null || zzgpVarZzb.zza()) {
                    break;
                }
            }
            if (((zzgr) listZza.get(size)).zza == 6 || ((zzgr) listZza.get(size)).zza == 3) {
                i10++;
            }
            size--;
        }
        if (i10 > 1 || size + 1 >= 8) {
            return byteBuffer.limit();
        }
        return size >= 0 ? ((zzgr) listZza.get(size)).zzb.limit() : byteBuffer.position();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, iPosition + 500));
        ByteBuffer byteBuffer2 = this.zza;
        byteBuffer2.clear();
        byteBuffer2.put(byteBuffer);
        byteBuffer2.flip();
        byteBuffer.position(iPosition);
        byteBuffer.limit(iLimit);
    }

    public final void zzc() {
        this.zzb = null;
        zze();
    }
}
