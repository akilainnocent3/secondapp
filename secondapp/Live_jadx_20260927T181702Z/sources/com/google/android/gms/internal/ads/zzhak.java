package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhak extends zzhao {
    private static final zzhbq zza = new zzhbq(zzhak.class);
    private zzgvv zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzhak(zzgvv zzgvvVar, boolean z10, boolean z11) {
        super(zzgvvVar.size());
        this.zzb = zzgvvVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i10, nj.t1 t1Var) {
        try {
            if (t1Var.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i10, t1Var);
            }
        } finally {
            zzz(null);
        }
    }

    private final void zzE(Throwable th2) {
        th2.getClass();
        if (this.zzc && !zzb(th2) && zzI(zzB(), th2)) {
            zzF(th2);
        } else if (th2 instanceof Error) {
            zzF(th2);
        }
    }

    private static void zzF(Throwable th2) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th2 instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
    }

    private final void zzG(int i10, Future future) {
        try {
            zzw(i10, zzhcj.zza(future));
        } catch (ExecutionException e10) {
            zzE(e10.getCause());
        } catch (Throwable th2) {
            zzE(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgvv zzgvvVar) {
        int iZzC = zzC();
        int i10 = 0;
        zzgsw.zzj(iZzC >= 0, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgvvVar != null) {
                zzgyn it = zzgvvVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i10, future);
                    }
                    i10++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    public void zzA(int i10) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final void zzc() {
        zzgvv zzgvvVar = this.zzb;
        zzA(1);
        if ((zzgvvVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzgyn it = zzgvvVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final String zzd() {
        zzgvv zzgvvVar = this.zzb;
        return zzgvvVar != null ? "futures=".concat(zzgvvVar.toString()) : super.zzd();
    }

    public final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzgyn it = this.zzb.iterator();
            final int i10 = 0;
            while (it.hasNext()) {
                final nj.t1 t1Var = (nj.t1) it.next();
                int i11 = i10 + 1;
                if (t1Var.isDone()) {
                    zzy(i10, t1Var);
                } else {
                    t1Var.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhaj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy(i10, t1Var);
                        }
                    }, zzhax.INSTANCE);
                }
                i10 = i11;
            }
            return;
        }
        zzgvv zzgvvVar = this.zzb;
        final zzgvv zzgvvVar2 = true != this.zzd ? null : zzgvvVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzhai
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgvvVar2);
            }
        };
        zzgyn it2 = zzgvvVar.iterator();
        while (it2.hasNext()) {
            nj.t1 t1Var2 = (nj.t1) it2.next();
            if (t1Var2.isDone()) {
                zzz(zzgvvVar2);
            } else {
                t1Var2.addListener(runnable, zzhax.INSTANCE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhao
    public final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzI(set, thZzl);
    }

    public abstract void zzw(int i10, Object obj);

    public abstract void zzx();
}
