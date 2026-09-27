package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhao extends zzhab.zzf {
    private static final zzhal zzbp;
    private static final zzhbq zzbq = new zzhbq(zzhao.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th2;
        zzhal zzhanVar;
        byte[] bArr = null;
        try {
            zzhanVar = new zzham(bArr);
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            zzhanVar = new zzhan(bArr);
        }
        zzbp = zzhanVar;
        if (th2 != null) {
            zzbq.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    public zzhao(int i10) {
        this.remainingField = i10;
    }

    public final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(setNewSetFromMap);
        zzbp.zza(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptionsField;
        Objects.requireNonNull(set2);
        return set2;
    }

    public final int zzC() {
        return zzbp.zzb(this);
    }

    public abstract void zzf(Set set);
}
