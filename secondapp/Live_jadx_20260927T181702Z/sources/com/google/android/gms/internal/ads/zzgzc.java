package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgzc implements Closeable {
    private static final zzgzb zzc = zzgzb.zza;
    private final Deque zza = new ArrayDeque(4);
    private Throwable zzb;

    public zzgzc(zzgzb zzgzbVar) {
    }

    public static zzgzc zza() {
        return new zzgzc(zzc);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th2 = this.zzb;
        while (true) {
            Deque deque = this.zza;
            if (deque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else if (th2 != th3) {
                    try {
                        th2.addSuppressed(th3);
                    } catch (Throwable unused) {
                        zzgza.zza.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th3);
                    }
                }
            }
        }
        if (this.zzb != null || th2 == null) {
            return;
        }
        zzgtt.zza(th2, IOException.class);
        zzgtt.zzb(th2);
        throw new AssertionError(th2);
    }

    public final Closeable zzb(Closeable closeable) {
        this.zza.addFirst(closeable);
        return closeable;
    }

    public final RuntimeException zzc(Throwable th2) throws Throwable {
        this.zzb = th2;
        zzgtt.zza(th2, IOException.class);
        zzgtt.zzb(th2);
        throw new RuntimeException(th2);
    }
}
