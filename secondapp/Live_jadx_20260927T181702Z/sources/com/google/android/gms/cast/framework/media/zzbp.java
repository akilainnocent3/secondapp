package com.google.android.gms.cast.framework.media;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzbp {
    final /* synthetic */ RemoteMediaClient zza;
    private final Set zzb = new HashSet();
    private final long zzc;
    private final Runnable zzd;
    private boolean zze;

    public zzbp(RemoteMediaClient remoteMediaClient, long j10) {
        this.zza = remoteMediaClient;
        this.zzc = j10;
        this.zzd = new zzbo(this, remoteMediaClient);
    }

    public final long zzb() {
        return this.zzc;
    }

    public final void zzd(RemoteMediaClient.ProgressListener progressListener) {
        this.zzb.add(progressListener);
    }

    public final void zze(RemoteMediaClient.ProgressListener progressListener) {
        this.zzb.remove(progressListener);
    }

    public final void zzf() {
        this.zza.zzc.removeCallbacks(this.zzd);
        this.zze = true;
        this.zza.zzc.postDelayed(this.zzd, this.zzc);
    }

    public final void zzg() {
        this.zza.zzc.removeCallbacks(this.zzd);
        this.zze = false;
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }

    public final boolean zzi() {
        return this.zze;
    }
}
