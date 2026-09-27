package com.google.android.gms.internal.ads;

import com.ironsource.C4235d4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhah extends zzhaz implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    nj.t1 zza;
    Object zzb;

    public zzhah(nj.t1 t1Var, Object obj) {
        t1Var.getClass();
        this.zza = t1Var;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nj.t1 t1Var = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (t1Var == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (t1Var.isCancelled()) {
            zzk(t1Var);
            return;
        }
        try {
            try {
                Object objZzf = zzf(obj, zzhbi.zzs(t1Var));
                this.zzb = null;
                zze(objZzf);
            } catch (Throwable th2) {
                try {
                    zzhca.zza(th2);
                    zzb(th2);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e10) {
            zzb(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            zzb(e11.getCause());
        } catch (Exception e12) {
            zzb(e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final String zzd() {
        String string;
        nj.t1 t1Var = this.zza;
        Object obj = this.zzb;
        String strZzd = super.zzd();
        if (t1Var != null) {
            String string2 = t1Var.toString();
            StringBuilder sb2 = new StringBuilder(string2.length() + 16);
            sb2.append("inputFuture=[");
            sb2.append(string2);
            sb2.append("], ");
            string = sb2.toString();
        } else {
            string = "";
        }
        if (obj == null) {
            if (strZzd != null) {
                return string.concat(strZzd);
            }
            return null;
        }
        int length = string.length();
        String string3 = obj.toString();
        StringBuilder sb3 = new StringBuilder(length + 10 + string3.length() + 1);
        sb3.append(string);
        sb3.append("function=[");
        sb3.append(string3);
        sb3.append(C4235d4.j.f61462e);
        return sb3.toString();
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Object obj2) throws Exception;
}
