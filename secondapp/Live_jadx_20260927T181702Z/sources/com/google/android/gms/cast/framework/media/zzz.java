package com.google.android.gms.cast.framework.media;

import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzz extends zzf {
    final /* synthetic */ NotificationActionsProvider zza;

    public /* synthetic */ zzz(NotificationActionsProvider notificationActionsProvider, zzy zzyVar) {
        this.zza = notificationActionsProvider;
    }

    @Override // com.google.android.gms.cast.framework.media.zzg
    public final IObjectWrapper zze() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.cast.framework.media.zzg
    public final List zzf() {
        return this.zza.getNotificationActions();
    }

    @Override // com.google.android.gms.cast.framework.media.zzg
    public final int[] zzg() {
        return this.zza.getCompactViewActionIndices();
    }
}
