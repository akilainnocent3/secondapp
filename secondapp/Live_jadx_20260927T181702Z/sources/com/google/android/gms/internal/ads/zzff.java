package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzff implements zzdy {

    @k.a0("messagePool")
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzff(Handler handler) {
        this.zzb = handler;
    }

    public static /* synthetic */ void zzo(zzfe zzfeVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzfeVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static zzfe zzp() {
        zzfe zzfeVar;
        List list = zza;
        synchronized (list) {
            try {
                zzfeVar = list.isEmpty() ? new zzfe(null) : (zzfe) list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzfeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzb(int i10) {
        return this.zzb.hasMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final zzdx zzc(int i10) {
        Handler handler = this.zzb;
        zzfe zzfeVarZzp = zzp();
        zzfeVarZzp.zzb(handler.obtainMessage(i10), this);
        return zzfeVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final zzdx zzd(int i10, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzfe zzfeVarZzp = zzp();
        zzfeVarZzp.zzb(handler.obtainMessage(i10, obj), this);
        return zzfeVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final zzdx zze(int i10, int i11, int i12) {
        Handler handler = this.zzb;
        zzfe zzfeVarZzp = zzp();
        zzfeVarZzp.zzb(handler.obtainMessage(i10, i11, i12), this);
        return zzfeVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final zzdx zzf(int i10, int i11, int i12, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzfe zzfeVarZzp = zzp();
        zzfeVarZzp.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzfeVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzg(zzdx zzdxVar) {
        return ((zzfe) zzdxVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzh(int i10) {
        return this.zzb.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzi(int i10, int i11) {
        return this.zzb.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzj(int i10, long j10) {
        return this.zzb.sendEmptyMessageAtTime(2, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final void zzk(int i10) {
        this.zzb.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final void zzl(@Nullable Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzm(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final boolean zzn(Runnable runnable, long j10) {
        return this.zzb.postDelayed(runnable, 1000L);
    }
}
