package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzewm implements zzfby {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(Boolean.FALSE);
    private final Clock zzc;
    private final Executor zzd;
    private final zzfby zze;
    private final long zzf;
    private final zzdyz zzg;

    public zzewm(zzfby zzfbyVar, long j10, Clock clock, Executor executor, zzdyz zzdyzVar) {
        this.zzc = clock;
        this.zze = zzfbyVar;
        this.zzf = j10;
        this.zzd = executor;
        this.zzg = zzdyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final nj.t1 zza() {
        zzewj zzewjVar;
        zzewj zzewjVar2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznj)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzni)).booleanValue() && !((Boolean) this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcff.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzewl
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzc();
                    }
                };
                long j10 = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j10, j10, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.zza;
                    zzewjVar = (zzewj) atomicReference.get();
                    if (zzewjVar == null) {
                        zzewj zzewjVar3 = new zzewj(this.zze.zza(), this.zzf, this.zzc);
                        atomicReference.set(zzewjVar3);
                        return zzewjVar3.zza;
                    }
                    if (!((Boolean) this.zzb.get()).booleanValue() && zzewjVar.zza()) {
                        nj.t1 t1Var = zzewjVar.zza;
                        zzfby zzfbyVar = this.zze;
                        zzewjVar2 = new zzewj(zzfbyVar.zza(), this.zzf, this.zzc);
                        this.zza.set(zzewjVar2);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznk)).booleanValue()) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznl)).booleanValue()) {
                                zzdyy zzdyyVarZza = this.zzg.zza();
                                zzdyyVarZza.zzc("action", "scs");
                                zzdyyVarZza.zzc("sid", String.valueOf(zzfbyVar.zzb()));
                                zzdyyVarZza.zzd();
                            }
                            return t1Var;
                        }
                        zzewjVar = zzewjVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.zza;
            zzewjVar = (zzewj) atomicReference2.get();
            if (zzewjVar == null || zzewjVar.zza()) {
                zzfby zzfbyVar2 = this.zze;
                zzewjVar2 = new zzewj(zzfbyVar2.zza(), this.zzf, this.zzc);
                atomicReference2.set(zzewjVar2);
                zzewjVar = zzewjVar2;
            }
        }
        return zzewjVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return this.zze.zzb();
    }

    public final /* synthetic */ void zzc() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }

    public final /* synthetic */ void zzd() {
        this.zza.set(new zzewj(this.zze.zza(), this.zzf, this.zzc));
    }
}
