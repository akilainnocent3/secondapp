package com.google.android.gms.internal.play_billing;

import com.ironsource.C4235d4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfh extends zzee implements RunnableFuture {

    @zq.a
    private volatile zzes zzc;

    public zzfh(Callable callable) {
        this.zzc = new zzfg(this, callable);
    }

    public static zzfh zzr(Runnable runnable, Object obj) {
        return new zzfh(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzes zzesVar = this.zzc;
        if (zzesVar != null) {
            zzesVar.run();
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    @zq.a
    public final String zzg() {
        zzes zzesVar = this.zzc;
        if (zzesVar == null) {
            return super.zzg();
        }
        return "task=[" + zzesVar.toString() + C4235d4.j.f61462e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    public final void zzm() {
        zzes zzesVar;
        if (zzq() && (zzesVar = this.zzc) != null) {
            zzesVar.zze();
        }
        this.zzc = null;
    }
}
