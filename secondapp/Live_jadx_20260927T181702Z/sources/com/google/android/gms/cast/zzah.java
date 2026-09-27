package com.google.android.gms.cast;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzah implements Runnable {
    final /* synthetic */ CastRemoteDisplayLocalService zza;

    public zzah(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.zza = castRemoteDisplayLocalService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzv("onCreate after delay. The local service been started: " + this.zza.zzs);
        CastRemoteDisplayLocalService castRemoteDisplayLocalService = this.zza;
        if (castRemoteDisplayLocalService.zzs) {
            return;
        }
        CastRemoteDisplayLocalService.zza.e("[Instance: %s] %s", castRemoteDisplayLocalService, "The local service has not been been started, stopping it");
        this.zza.stopSelf();
    }
}
