package com.google.android.gms.cast.framework;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzbi extends zzbd {
    final /* synthetic */ Session zza;

    public /* synthetic */ zzbi(Session session, zzbh zzbhVar) {
        this.zza = session;
    }

    @Override // com.google.android.gms.cast.framework.zzbe
    public final long zzb() {
        return this.zza.getSessionRemainingTimeMs();
    }

    @Override // com.google.android.gms.cast.framework.zzbe
    public final IObjectWrapper zzc() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.cast.framework.zzbe
    public final void zzd(boolean z10) {
        this.zza.end(z10);
    }

    @Override // com.google.android.gms.cast.framework.zzbe
    public final void zze(@Nullable Bundle bundle) {
        this.zza.onResuming(bundle);
    }

    @Override // com.google.android.gms.cast.framework.zzbe
    public final void zzf(@Nullable Bundle bundle) {
        this.zza.onStarting(bundle);
    }

    @Override // com.google.android.gms.cast.framework.zzbe
    public final void zzg(@Nullable Bundle bundle) {
        this.zza.resume(bundle);
    }

    @Override // com.google.android.gms.cast.framework.zzbe
    public final void zzh(@Nullable Bundle bundle) {
        this.zza.start(bundle);
    }

    @Override // com.google.android.gms.cast.framework.zzbe
    public final void zzi(@Nullable Bundle bundle) {
        this.zza.zzk(bundle);
    }
}
