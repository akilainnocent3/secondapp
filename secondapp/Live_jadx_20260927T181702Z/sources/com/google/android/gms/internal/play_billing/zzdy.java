package com.google.android.gms.internal.play_billing;

import com.ironsource.C4235d4;
import com.yandex.div.core.ScrollDirection;
import fw.b;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import nj.e2;
import sun.misc.Unsafe;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzdy<V> extends zzfi implements zzeu<V> {
    static final boolean zza;
    static final zzet zzb;
    private static final zza zzc;
    private static final Object zzd;

    @zq.a
    private volatile zzd listeners;

    @zq.a
    private volatile Object value;

    @zq.a
    private volatile zzk waiters;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    abstract class zza {
        public /* synthetic */ zza(zzeb zzebVar) {
        }

        public abstract zzd zza(zzdy zzdyVar, zzd zzdVar);

        public abstract zzk zzb(zzdy zzdyVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, @zq.a zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzdy zzdyVar, @zq.a zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzdy zzdyVar, @zq.a Object obj, Object obj2);

        public abstract boolean zzg(zzdy zzdyVar, @zq.a zzk zzkVar, @zq.a zzk zzkVar2);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    final class zzb {

        @zq.a
        static final zzb zza;

        @zq.a
        static final zzb zzb;
        final boolean zzc;

        @zq.a
        final Throwable zzd;

        static {
            if (zzdy.zza) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        public zzb(boolean z10, @zq.a Throwable th2) {
            this.zzc = z10;
            this.zzd = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.play_billing.zzdy.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th2) {
            th2.getClass();
            this.zzb = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    final class zzd {
        static final zzd zza = new zzd();

        @zq.a
        zzd next;

        @zq.a
        final Runnable zzb;

        @zq.a
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<? super zzdy<?>, zzk> zzc;
        final AtomicReferenceFieldUpdater<? super zzdy<?>, zzd> zzd;
        final AtomicReferenceFieldUpdater<? super zzdy<?>, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final zzd zza(zzdy zzdyVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzdyVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final zzk zzb(zzdy zzdyVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzdyVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final void zzc(zzk zzkVar, @zq.a zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zze(zzdy zzdyVar, @zq.a zzd zzdVar, zzd zzdVar2) {
            return zzdz.zza(this.zzd, zzdyVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zzf(zzdy zzdyVar, @zq.a Object obj, Object obj2) {
            return zzdz.zza(this.zze, zzdyVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zzg(zzdy zzdyVar, @zq.a zzk zzkVar, @zq.a zzk zzkVar2) {
            return zzdz.zza(this.zzc, zzdyVar, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    final class zzf<V> implements Runnable {
        final zzdy<V> zza;
        final zzeu<? extends V> zzb;

        public zzf(zzdy zzdyVar, zzeu zzeuVar) {
            this.zza = zzdyVar;
            this.zzb = zzeuVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzdy) this.zza).value != this) {
                return;
            }
            zzeu<? extends V> zzeuVar = this.zzb;
            if (zzdy.zzc.zzf(this.zza, this, zzdy.zzr(zzeuVar))) {
                zzdy.zzw(this.zza, false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    final class zzg extends zza {
        private zzg() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final zzd zza(zzdy zzdyVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzdyVar) {
                try {
                    zzdVar2 = zzdyVar.listeners;
                    if (zzdVar2 != zzdVar) {
                        zzdyVar.listeners = zzdVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final zzk zzb(zzdy zzdyVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzdyVar) {
                try {
                    zzkVar2 = zzdyVar.waiters;
                    if (zzkVar2 != zzkVar) {
                        zzdyVar.waiters = zzkVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final void zzc(zzk zzkVar, @zq.a zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zze(zzdy zzdyVar, @zq.a zzd zzdVar, zzd zzdVar2) {
            synchronized (zzdyVar) {
                try {
                    if (zzdyVar.listeners != zzdVar) {
                        return false;
                    }
                    zzdyVar.listeners = zzdVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zzf(zzdy zzdyVar, @zq.a Object obj, Object obj2) {
            synchronized (zzdyVar) {
                try {
                    if (zzdyVar.value != obj) {
                        return false;
                    }
                    zzdyVar.value = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zzg(zzdy zzdyVar, @zq.a zzk zzkVar, @zq.a zzk zzkVar2) {
            synchronized (zzdyVar) {
                try {
                    if (zzdyVar.waiters != zzkVar) {
                        return false;
                    }
                    zzdyVar.waiters = zzkVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public /* synthetic */ zzg(zzeb zzebVar) {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    interface zzh<V> extends zzeu<V> {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    abstract class zzi<V> extends zzdy<V> implements zzh<V> {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.play_billing.zzdy.zzj.1
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzdy.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzdy.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzdy.class.getDeclaredField("value"));
                zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField(ScrollDirection.NEXT));
                zza = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        private zzj() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final zzd zza(zzdy zzdyVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzdyVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzdyVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final zzk zzb(zzdy zzdyVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzdyVar.waiters;
                if (zzkVar == zzkVar2) {
                    break;
                }
            } while (!zzg(zzdyVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final void zzc(zzk zzkVar, @zq.a zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zze(zzdy zzdyVar, @zq.a zzd zzdVar, zzd zzdVar2) {
            return zzea.zza(zza, zzdyVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zzf(zzdy zzdyVar, @zq.a Object obj, Object obj2) {
            return zzea.zza(zza, zzdyVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zzg(zzdy zzdyVar, @zq.a zzk zzkVar, @zq.a zzk zzkVar2) {
            return zzea.zza(zza, zzdyVar, zzc, zzkVar, zzkVar2);
        }

        public /* synthetic */ zzj(zzeb zzebVar) {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    final class zzk {
        static final zzk zza = new zzk(false);

        @zq.a
        volatile zzk next;

        @zq.a
        volatile Thread thread;

        public zzk(boolean z10) {
        }

        public zzk() {
            zzdy.zzc.zzd(this, Thread.currentThread());
        }
    }

    static {
        boolean z10;
        Throwable th2;
        zza zzgVar;
        Throwable th3;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        zza = z10;
        zzb = new zzet(zzdy.class);
        zzeb zzebVar = null;
        try {
            zzgVar = new zzj(zzebVar);
            th2 = null;
            th3 = null;
        } catch (Error | Exception e10) {
            try {
                th2 = null;
                th3 = e10;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, ScrollDirection.NEXT), AtomicReferenceFieldUpdater.newUpdater(zzdy.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzdy.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzdy.class, Object.class, "value"));
            } catch (Error | Exception e11) {
                th2 = e11;
                zzgVar = new zzg(zzebVar);
                th3 = e10;
            }
        }
        zzc = zzgVar;
        if (th2 != null) {
            zzet zzetVar = zzb;
            Logger loggerZza = zzetVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            zzetVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        zzd = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zzr(zzeu zzeuVar) {
        Throwable thZzh;
        if (zzeuVar instanceof zzh) {
            Object zzbVar = ((zzdy) zzeuVar).value;
            if (zzbVar instanceof zzb) {
                zzb zzbVar2 = (zzb) zzbVar;
                if (zzbVar2.zzc) {
                    Throwable th2 = zzbVar2.zzd;
                    zzbVar = th2 != null ? new zzb(false, th2) : zzb.zzb;
                }
            }
            Objects.requireNonNull(zzbVar);
            return zzbVar;
        }
        if ((zzeuVar instanceof zzfi) && (thZzh = ((zzfi) zzeuVar).zzh()) != null) {
            return new zzc(thZzh);
        }
        boolean zIsCancelled = zzeuVar.isCancelled();
        if ((!zza) && zIsCancelled) {
            zzb zzbVar3 = zzb.zzb;
            Objects.requireNonNull(zzbVar3);
            return zzbVar3;
        }
        try {
            Object objZzs = zzs(zzeuVar);
            if (!zIsCancelled) {
                return objZzs == null ? zzd : objZzs;
            }
            return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(zzeuVar)));
        } catch (Error | Exception e10) {
            return new zzc(e10);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzeuVar)), e11)) : new zzb(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzeuVar)), e12)) : new zzc(e12.getCause());
        }
    }

    private static Object zzs(Future future) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzt(StringBuilder sb2) {
        try {
            Object objZzs = zzs(this);
            sb2.append("SUCCESS, result=[");
            if (objZzs == null) {
                sb2.append(b.f85379f);
            } else if (objZzs == this) {
                sb2.append("this future");
            } else {
                sb2.append(objZzs.getClass().getName());
                sb2.append(c.phraseDel);
                sb2.append(Integer.toHexString(System.identityHashCode(objZzs)));
            }
            sb2.append(C4235d4.j.f61462e);
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append(C4235d4.j.f61462e);
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private final void zzu(StringBuilder sb2) {
        String strConcat;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb2.append(", setFuture=[");
            zzv(sb2, ((zzf) obj).zzb);
            sb2.append(C4235d4.j.f61462e);
        } else {
            try {
                strConcat = zzg();
                if (strConcat == null || strConcat.isEmpty()) {
                    strConcat = null;
                }
            } catch (Exception | StackOverflowError e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null) {
                sb2.append(", info=[");
                sb2.append(strConcat);
                sb2.append(C4235d4.j.f61462e);
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            zzt(sb2);
        }
    }

    private final void zzv(StringBuilder sb2, @zq.a Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Exception e10) {
            e = e10;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        } catch (StackOverflowError e11) {
            e = e11;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzw(zzdy zzdyVar, boolean z10) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzkVarZzb = zzc.zzb(zzdyVar, zzk.zza); zzkVarZzb != null; zzkVarZzb = zzkVarZzb.next) {
                Thread thread = zzkVarZzb.thread;
                if (thread != null) {
                    zzkVarZzb.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            zzdyVar.zzm();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarZza = zzc.zza(zzdyVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarZza != null) {
                zzd zzdVar4 = zzdVarZza.next;
                zzdVarZza.next = zzdVar3;
                zzdVar3 = zzdVarZza;
                zzdVarZza = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.zzb;
                zzd zzdVar5 = zzdVar3.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzf) {
                    zzf zzfVar = (zzf) runnable2;
                    zzdyVar = zzfVar.zza;
                    if (zzdyVar.value == zzfVar) {
                        if (zzc.zzf(zzdyVar, zzfVar, zzr(zzfVar.zzb))) {
                            zzdVar = zzdVar5;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzx(runnable2, executor);
                }
                zzdVar3 = zzdVar5;
            }
            return;
        }
    }

    private static void zzx(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    private final void zzy(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                        }
                    } else if (!zzc.zzg(this, zzkVar2, zzkVar4)) {
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzz(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th2 = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzd) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        zzb zzbVar;
        Object obj = this.value;
        if (!(obj instanceof zzf) && !(obj == null)) {
            return false;
        }
        if (zza) {
            zzbVar = new zzb(z10, new CancellationException("Future.cancel() was called."));
        } else {
            zzbVar = z10 ? zzb.zza : zzb.zzb;
            Objects.requireNonNull(zzbVar);
        }
        zzdy<V> zzdyVar = this;
        boolean z11 = false;
        while (true) {
            if (zzc.zzf(zzdyVar, obj, zzbVar)) {
                zzw(zzdyVar, z10);
                if (obj instanceof zzf) {
                    zzeu<? extends V> zzeuVar = ((zzf) obj).zzb;
                    if (zzeuVar instanceof zzh) {
                        zzdyVar = (zzdy) zzeuVar;
                        obj = zzdyVar.value;
                        if (!(obj == null) && !(obj instanceof zzf)) {
                            return true;
                        }
                        z11 = true;
                    } else {
                        zzeuVar.cancel(z10);
                    }
                }
                return true;
            }
            obj = zzdyVar.value;
            if (!(obj instanceof zzf)) {
                return z11;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzf))) {
            return zzz(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar != zzk.zza) {
            zzk zzkVar2 = new zzk();
            do {
                zza zzaVar = zzc;
                zzaVar.zzc(zzkVar2, zzkVar);
                if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzy(zzkVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zzf))));
                    return zzz(obj);
                }
                zzkVar = this.waiters;
            } while (zzkVar != zzk.zza);
        }
        Object obj3 = this.value;
        Objects.requireNonNull(obj3);
        return zzz(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (obj != null) & (!(obj instanceof zzf));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.value instanceof zzb) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zzt(sb2);
        } else {
            zzu(sb2);
        }
        sb2.append(C4235d4.j.f61462e);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.zzeu
    public final void zzb(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzbe.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzc.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.zza);
        }
        zzx(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @zq.a
    public String zzg() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    @zq.a
    public final Throwable zzh() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    public final boolean zzn(Object obj) {
        if (obj == null) {
            obj = zzd;
        }
        if (!zzc.zzf(this, null, obj)) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    public final boolean zzo(Throwable th2) {
        if (!zzc.zzf(this, null, new zzc(th2))) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    public final boolean zzp(zzeu zzeuVar) {
        zzc zzcVar;
        Object obj = this.value;
        if (obj == null) {
            if (zzeuVar.isDone()) {
                if (!zzc.zzf(this, null, zzr(zzeuVar))) {
                    return false;
                }
                zzw(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, zzeuVar);
            if (zzc.zzf(this, null, zzfVar)) {
                try {
                    zzeuVar.zzb(zzfVar, zzed.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        zzcVar = new zzc(th2);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzc.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzeuVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    public final boolean zzq() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    public void zzm() {
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z10 = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return zzz(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    while (true) {
                        zza zzaVar = zzc;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, e2.f116944a));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                                        return zzz(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    zzy(zzkVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzy(zzkVar2);
                            break;
                        }
                        zzkVar = this.waiters;
                        if (zzkVar == zzk.zza) {
                        }
                    }
                }
                Object obj3 = this.value;
                Objects.requireNonNull(obj3);
                return zzz(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof zzf))) {
                    return zzz(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j11 = -nanos;
                long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z10) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z10) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(strConcat + " for " + string);
        }
        throw new InterruptedException();
    }
}
