package com.google.android.gms.internal.ads;

import com.ironsource.C4235d4;
import com.yandex.div.core.ScrollDirection;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import nj.e2;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhac<V> extends zzhck implements nj.t1<V> {
    private static final zza zzbr;
    static final Object zze = new Object();
    static final zzhbq zzf = new zzhbq(zzhab.class);
    static final boolean zzg;
    volatile zzhab.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    abstract class zza {
        public /* synthetic */ zza(byte[] bArr) {
        }

        public abstract void zza(zze zzeVar, Thread thread);

        public abstract void zzb(zze zzeVar, zze zzeVar2);

        public abstract boolean zzc(zzhac zzhacVar, zze zzeVar, zze zzeVar2);

        public abstract boolean zzd(zzhac zzhacVar, zzhab.zzd zzdVar, zzhab.zzd zzdVar2);

        public abstract zze zze(zzhac zzhacVar, zze zzeVar);

        public abstract zzhab.zzd zzf(zzhac zzhacVar, zzhab.zzd zzdVar);

        public abstract boolean zzg(zzhac zzhacVar, Object obj, Object obj2);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, ScrollDirection.NEXT);
        private static final AtomicReferenceFieldUpdater<? super zzhac<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzhac.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzhac<?>, zzhab.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzhac.class, zzhab.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzhac<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzhac.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final boolean zzc(zzhac zzhacVar, zze zzeVar, zze zzeVar2) {
            return h0.b.a(zzc, zzhacVar, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final boolean zzd(zzhac zzhacVar, zzhab.zzd zzdVar, zzhab.zzd zzdVar2) {
            return h0.b.a(zzd, zzhacVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final zze zze(zzhac zzhacVar, zze zzeVar) {
            return zzc.getAndSet(zzhacVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final zzhab.zzd zzf(zzhac zzhacVar, zzhab.zzd zzdVar) {
            return zzd.getAndSet(zzhacVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final boolean zzg(zzhac zzhacVar, Object obj, Object obj2) {
            return h0.b.a(zze, zzhacVar, obj, obj2);
        }

        public /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final void zza(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final boolean zzc(zzhac zzhacVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzhacVar) {
                try {
                    if (zzhacVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzhacVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final boolean zzd(zzhac zzhacVar, zzhab.zzd zzdVar, zzhab.zzd zzdVar2) {
            synchronized (zzhacVar) {
                try {
                    if (zzhacVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzhacVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final zze zze(zzhac zzhacVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzhacVar) {
                try {
                    zzeVar2 = zzhacVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzhacVar.waitersField = zzeVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final zzhab.zzd zzf(zzhac zzhacVar, zzhab.zzd zzdVar) {
            zzhab.zzd zzdVar2;
            synchronized (zzhacVar) {
                try {
                    zzdVar2 = zzhacVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzhacVar.listenersField = zzdVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final boolean zzg(zzhac zzhacVar, Object obj, Object obj2) {
            synchronized (zzhacVar) {
                try {
                    if (zzhacVar.valueField != obj) {
                        return false;
                    }
                    zzhacVar.valueField = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(zzhad.zza);
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzhac.class.getDeclaredField("waitersField"));
                    zzb = unsafe.objectFieldOffset(zzhac.class.getDeclaredField("listenersField"));
                    zzd = unsafe.objectFieldOffset(zzhac.class.getDeclaredField("valueField"));
                    zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField(ScrollDirection.NEXT));
                    zza = unsafe;
                } catch (NoSuchFieldException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        }

        private zzd() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final boolean zzc(zzhac zzhacVar, zze zzeVar, zze zzeVar2) {
            return z0.a(zza, zzhacVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final boolean zzd(zzhac zzhacVar, zzhab.zzd zzdVar, zzhab.zzd zzdVar2) {
            return z0.a(zza, zzhacVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final zze zze(zzhac zzhacVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzhacVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzhacVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final zzhab.zzd zzf(zzhac zzhacVar, zzhab.zzd zzdVar) {
            zzhab.zzd zzdVar2;
            do {
                zzdVar2 = zzhacVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzd(zzhacVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhac.zza
        public final boolean zzg(zzhac zzhacVar, Object obj, Object obj2) {
            return z0.a(zza, zzhacVar, zzd, obj, obj2);
        }

        public /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        public zze(boolean z10) {
        }

        public zze() {
            zzhac.zzv(this, Thread.currentThread());
        }
    }

    static {
        boolean z10;
        Throwable th2;
        Throwable th3;
        zza zzcVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        zzg = z10;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains(C4235d4.f61260d)) {
            try {
                zzcVar = new zzd(bArr);
            } catch (Error | Exception e10) {
                try {
                    zzcVar = new zzb(bArr);
                    th2 = null;
                    th3 = e10;
                } catch (Error | Exception e11) {
                    th2 = e11;
                    th3 = e10;
                    zzcVar = new zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new zzb(bArr);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(bArr);
            }
        }
        th2 = null;
        th3 = null;
        zzbr = zzcVar;
        if (th2 != null) {
            zzhbq zzhbqVar = zzf;
            Logger loggerZza = zzhbqVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            zzhbqVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                        }
                    } else if (!zzbr.zzc(this, zzeVar2, zzeVar4)) {
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    public static boolean zzr(zzhac zzhacVar, Object obj, Object obj2) {
        return zzbr.zzg(zzhacVar, obj, obj2);
    }

    public static /* synthetic */ void zzv(zze zzeVar, Thread thread) {
        zzbr.zza(zzeVar, thread);
    }

    public final boolean zzp(zzhab.zzd zzdVar, zzhab.zzd zzdVar2) {
        return zzbr.zzd(this, zzdVar, zzdVar2);
    }

    public final zzhab.zzd zzq(zzhab.zzd zzdVar) {
        return zzbr.zzf(this, zzdVar);
    }

    public final void zzs() {
        for (zze zzeVarZze = zzbr.zze(this, zze.zza); zzeVarZze != null; zzeVarZze = zzeVarZze.next) {
            Thread thread = zzeVarZze.thread;
            if (thread != null) {
                zzeVarZze.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final Object zzt(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzhab.zzh(obj)) {
            return zzhab.zzg(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                while (true) {
                    zza zzaVar = zzbr;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, e2.f116944a));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzhab.zzh(obj2)) {
                                return zzhab.zzg(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                        break;
                    }
                    zzeVar = this.waitersField;
                    if (zzeVar == zze.zza) {
                    }
                }
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzhab.zzg(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzhab.zzh(obj4)) {
                return zzhab.zzg(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 8 + String.valueOf(lowerCase2).length());
        sb2.append("Waited ");
        sb2.append(j10);
        sb2.append(" ");
        sb2.append(lowerCase2);
        String string3 = sb2.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb3 = new StringBuilder(strConcat.length() + String.valueOf(jConvert).length() + 1 + String.valueOf(lowerCase).length());
                sb3.append(strConcat);
                sb3.append(jConvert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String string4 = sb3.toString();
                if (z10) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(" ");
            }
            if (z10) {
                StringBuilder sb4 = new StringBuilder(strConcat.length() + String.valueOf(nanos2).length() + 13);
                sb4.append(strConcat);
                sb4.append(nanos2);
                sb4.append(" nanoseconds ");
                strConcat = sb4.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb5 = new StringBuilder(string3.length() + 5 + String.valueOf(string).length());
        sb5.append(string3);
        sb5.append(" for ");
        sb5.append(string);
        throw new TimeoutException(sb5.toString());
    }

    public final Object zzu() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzhab.zzh(obj2)) {
            return zzhab.zzg(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzbr;
                zzaVar.zzb(zzeVar2, zzeVar);
                if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzhab.zzh(obj)));
                    return zzhab.zzg(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        Object obj3 = this.valueField;
        Objects.requireNonNull(obj3);
        return zzhab.zzg(obj3);
    }
}
