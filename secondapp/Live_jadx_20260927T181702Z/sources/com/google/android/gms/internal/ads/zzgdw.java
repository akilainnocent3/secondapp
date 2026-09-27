package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgdw implements zzgdu {
    private final Executor zza;
    private final Queue zzb = new PriorityQueue();

    public zzgdw(Executor executor, zzgbx zzgbxVar) {
        this.zza = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final void zza(Runnable runnable, long j10) {
        if (j10 <= 0) {
            this.zza.execute(runnable);
            return;
        }
        zzgdy zzgdyVar = new zzgdy(runnable, System.currentTimeMillis() + j10);
        Queue queue = this.zzb;
        synchronized (queue) {
            queue.add(zzgdyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final void zzb() {
        Queue queue = this.zzb;
        synchronized (queue) {
            try {
                if (queue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue = new PriorityQueue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (zzgdy zzgdyVar = (zzgdy) queue.peek(); zzgdyVar != null && zzgdyVar.zzb <= jCurrentTimeMillis; zzgdyVar = (zzgdy) queue.peek()) {
                    priorityQueue.add(zzgdyVar);
                }
                Iterator it = priorityQueue.iterator();
                while (it.hasNext()) {
                    try {
                        this.zza.execute(((zzgdy) it.next()).zza);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
