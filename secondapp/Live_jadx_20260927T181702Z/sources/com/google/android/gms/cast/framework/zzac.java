package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@ShowFirstParty
public final class zzac {
    private static final Logger zza = new Logger("DiscoveryManager");
    private final zzaq zzb;

    public zzac(zzaq zzaqVar) {
        this.zzb = zzaqVar;
    }

    @Nullable
    public final IObjectWrapper zza() {
        try {
            return this.zzb.zze();
        } catch (RemoteException e10) {
            zza.d(e10, "Unable to call %s on %s.", "getWrappedThis", zzaq.class.getSimpleName());
            return null;
        }
    }
}
