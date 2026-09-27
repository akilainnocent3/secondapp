package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajq implements zzao {
    public final List zza;

    public zzajq(List list) {
        this.zza = list;
        boolean z10 = false;
        if (!list.isEmpty()) {
            long j10 = ((zzajp) list.get(0)).zzb;
            for (int i10 = 1; i10 < list.size(); i10++) {
                if (((zzajp) list.get(i10)).zza < j10) {
                    z10 = true;
                    break;
                }
                j10 = ((zzajp) list.get(i10)).zzb;
            }
        }
        zzgsw.zza(!z10);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzajq.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzajq) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        j.a(this, zzamVar);
    }
}
