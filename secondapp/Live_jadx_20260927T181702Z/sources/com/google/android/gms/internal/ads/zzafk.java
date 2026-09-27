package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzafk {
    private final zzafj zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzafk(zzafj zzafjVar) {
        this.zza = zzafjVar;
    }

    @Nullable
    public final zzafp zza(Object... objArr) {
        Constructor constructorZza;
        AtomicBoolean atomicBoolean = this.zzb;
        synchronized (atomicBoolean) {
            try {
                if (!atomicBoolean.get()) {
                    try {
                        constructorZza = this.zza.zza();
                    } catch (ClassNotFoundException unused) {
                        this.zzb.set(true);
                        constructorZza = null;
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating extension", e10);
                    }
                }
                constructorZza = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (zzafp) constructorZza.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }
}
