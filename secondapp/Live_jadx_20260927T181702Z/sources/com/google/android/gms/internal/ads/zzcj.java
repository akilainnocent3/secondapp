package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcj {

    @Nullable
    private static AudioManager zza;

    public static synchronized AudioManager zza(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                zza = null;
            }
            AudioManager audioManager = zza;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final zzdr zzdrVar = new zzdr(zzdo.zza);
                zzdh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzci
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcj.zzb(applicationContext, zzdrVar);
                    }
                });
                zzdrVar.zzd();
                AudioManager audioManager2 = zza;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                throw null;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            zza = audioManager3;
            if (audioManager3 != null) {
                return audioManager3;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ void zzb(Context context, zzdr zzdrVar) {
        zza = (AudioManager) context.getSystemService("audio");
        zzdrVar.zza();
    }
}
