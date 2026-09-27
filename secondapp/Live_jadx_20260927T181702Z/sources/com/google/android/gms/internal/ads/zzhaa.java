package com.google.android.gms.internal.ads;

import com.ironsource.C4235d4;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhaa extends zzhaz implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    nj.t1 zza;
    Class zzb;
    Object zzc;

    public zzhaa(nj.t1 t1Var, Class cls, Object obj) {
        t1Var.getClass();
        this.zza = t1Var;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objZzs;
        nj.t1 t1Var = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((t1Var == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = t1Var instanceof zzhck ? ((zzhck) t1Var).zzl() : null;
            objZzs = th == null ? zzhbi.zzs(t1Var) : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(t1Var.getClass());
                String strValueOf2 = String.valueOf(e10.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 19 + strValueOf2.length() + 16);
                sb2.append("Future type ");
                sb2.append(strValueOf);
                sb2.append(" threw ");
                sb2.append(strValueOf2);
                sb2.append(" without a cause");
                cause = new NullPointerException(sb2.toString());
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        if (th == null) {
            zza(objZzs);
            return;
        }
        if (!cls.isInstance(th)) {
            zzk(t1Var);
            return;
        }
        try {
            Object objZzf = zzf(obj, th);
            this.zzb = null;
            this.zzc = null;
            zze(objZzf);
        } catch (Throwable th3) {
            try {
                zzhca.zza(th3);
                zzb(th3);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final String zzd() {
        String string;
        nj.t1 t1Var = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
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
        if (cls == null || obj == null) {
            if (strZzd != null) {
                return string.concat(strZzd);
            }
            return null;
        }
        int length = string.length();
        String string3 = cls.toString();
        int length2 = string3.length();
        String string4 = obj.toString();
        StringBuilder sb3 = new StringBuilder(length + 15 + length2 + 13 + string4.length() + 1);
        sb3.append(string);
        sb3.append("exceptionType=[");
        sb3.append(string3);
        sb3.append("], fallback=[");
        sb3.append(string4);
        sb3.append(C4235d4.j.f61462e);
        return sb3.toString();
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Throwable th2) throws Exception;
}
