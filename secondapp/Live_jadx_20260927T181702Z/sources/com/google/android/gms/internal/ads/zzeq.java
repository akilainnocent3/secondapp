package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeq {

    @Nullable
    private static zzeq zza;
    private final Executor zzb;
    private final CopyOnWriteArrayList zzc;
    private final Object zzd;

    @k.a0("lock")
    private int zze;

    @k.a0("lock")
    private boolean zzf;

    private zzeq(final Context context) {
        Executor executorZza = zzdh.zza();
        this.zzb = executorZza;
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new Object();
        this.zze = 0;
        executorZza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzen
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new zzep(this.zza, null), intentFilter);
            }
        });
    }

    public static synchronized zzeq zza(Context context) {
        try {
            if (zza == null) {
                zza = new zzeq(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }

    private final void zzg() {
        CopyOnWriteArrayList<zzem> copyOnWriteArrayList = this.zzc;
        for (zzem zzemVar : copyOnWriteArrayList) {
            if (zzemVar.zza()) {
                copyOnWriteArrayList.remove(zzemVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze(int i10) {
        zzg();
        synchronized (this.zzd) {
            try {
                if (this.zzf && this.zze == i10) {
                    return;
                }
                this.zzf = true;
                this.zze = i10;
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((zzem) it.next()).zzb();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(zzek zzekVar, Executor executor) {
        boolean z10;
        zzg();
        zzem zzemVar = new zzem(this, zzekVar, executor);
        synchronized (this.zzd) {
            this.zzc.add(zzemVar);
            z10 = this.zzf;
        }
        if (z10) {
            zzemVar.zzb();
        }
    }

    public final int zzc() {
        int i10;
        synchronized (this.zzd) {
            i10 = this.zze;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    public final /* synthetic */ void zzd(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i10 = 1;
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i10 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i10 = 4;
                                break;
                            case 13:
                                i10 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i10 = 6;
                                break;
                            case 18:
                                i10 = 2;
                                break;
                            case 20:
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i10 = 9;
                                }
                                break;
                        }
                    } else if (type == 1) {
                        i10 = 2;
                    } else if (type == 4 || type == 5) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i10 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i10 = 4;
                                break;
                            case 13:
                                i10 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i10 = 6;
                                break;
                            case 18:
                                i10 = 2;
                                break;
                            case 20:
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i10 = 9;
                                }
                                break;
                        }
                    } else if (type != 6) {
                        i10 = type != 9 ? 8 : 7;
                    } else {
                        i10 = 5;
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 31 || i10 != 5) {
            zze(i10);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                throw null;
            }
            zzej zzejVar = new zzej(this);
            telephonyManager.registerTelephonyCallback(this.zzb, zzejVar);
            telephonyManager.unregisterTelephonyCallback(zzejVar);
        } catch (RuntimeException unused2) {
            zze(5);
        }
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzb;
    }
}
