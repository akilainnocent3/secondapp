package com.google.android.gms.internal.cast;

import android.hardware.display.VirtualDisplay;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.CastRemoteDisplay;
import com.google.android.gms.cast.CastRemoteDisplayApi;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class zzdn implements CastRemoteDisplayApi {
    private static final Logger zza = new Logger("CastRemoteDisplayApiImpl");
    private final Api zzb;

    @Nullable
    private VirtualDisplay zzc;
    private final zzdv zzd = new zzdf(this);

    public zzdn(Api api) {
        this.zzb = api;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzdn zzdnVar) {
        VirtualDisplay virtualDisplay = zzdnVar.zzc;
        if (virtualDisplay != null) {
            if (virtualDisplay.getDisplay() != null) {
                zza.d("releasing virtual display: " + virtualDisplay.getDisplay().getDisplayId(), new Object[0]);
            }
            virtualDisplay.release();
        }
        zzdnVar.zzc = null;
    }

    @Override // com.google.android.gms.cast.CastRemoteDisplayApi
    public final PendingResult<CastRemoteDisplay.CastRemoteDisplaySessionResult> startRemoteDisplay(GoogleApiClient googleApiClient, String str) {
        zza.d("startRemoteDisplay", new Object[0]);
        return googleApiClient.execute(new zzdg(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.cast.CastRemoteDisplayApi
    public final PendingResult<CastRemoteDisplay.CastRemoteDisplaySessionResult> stopRemoteDisplay(GoogleApiClient googleApiClient) {
        zza.d("stopRemoteDisplay", new Object[0]);
        return googleApiClient.execute(new zzdh(this, googleApiClient));
    }
}
