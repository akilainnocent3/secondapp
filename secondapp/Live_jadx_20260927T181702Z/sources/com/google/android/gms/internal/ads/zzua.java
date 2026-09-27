package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzua {
    public final int zza;

    @Nullable
    public final zzxc zzb;
    private final CopyOnWriteArrayList zzc;

    private zzua(CopyOnWriteArrayList copyOnWriteArrayList, int i10, @Nullable zzxc zzxcVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzxcVar;
    }

    @CheckResult
    public final zzua zza(int i10, @Nullable zzxc zzxcVar) {
        return new zzua(this.zzc, 0, zzxcVar);
    }

    public final void zzb(Handler handler, zzub zzubVar) {
        this.zzc.add(new zztz(handler, zzubVar));
    }

    public final void zzc(zzub zzubVar) {
        CopyOnWriteArrayList<zztz> copyOnWriteArrayList = this.zzc;
        for (zztz zztzVar : copyOnWriteArrayList) {
            if (zztzVar.zza == zzubVar) {
                copyOnWriteArrayList.remove(zztzVar);
            }
        }
    }

    public zzua() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
