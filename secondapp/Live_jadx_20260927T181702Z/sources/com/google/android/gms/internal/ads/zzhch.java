package com.google.android.gms.internal.ads;

import com.ironsource.C4235d4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhch extends zzhaz implements RunnableFuture {
    private volatile zzhbp zza;

    public zzhch(zzhap zzhapVar) {
        this.zza = new zzhcf(this, zzhapVar);
    }

    public static zzhch zze(Runnable runnable, Object obj) {
        return new zzhch(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzhbp zzhbpVar = this.zza;
        if (zzhbpVar != null) {
            zzhbpVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final void zzc() {
        zzhbp zzhbpVar;
        if (zzj() && (zzhbpVar = this.zza) != null) {
            zzhbpVar.zzh();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final String zzd() {
        zzhbp zzhbpVar = this.zza;
        if (zzhbpVar == null) {
            return super.zzd();
        }
        String string = zzhbpVar.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 7);
        sb2.append("task=[");
        sb2.append(string);
        sb2.append(C4235d4.j.f61462e);
        return sb2.toString();
    }

    public zzhch(Callable callable) {
        this.zza = new zzhcg(this, callable);
    }
}
