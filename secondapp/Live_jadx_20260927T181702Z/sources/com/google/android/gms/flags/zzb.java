package com.google.android.gms.flags;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzb {
    private boolean zza = false;
    private zze zzb = null;

    public final <T> T zza(Flag<T> flag) {
        synchronized (this) {
            try {
                if (this.zza) {
                    return flag.zza(this.zzb);
                }
                return flag.zzc();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(Context context) {
        synchronized (this) {
            if (this.zza) {
                return;
            }
            try {
                zze zzeVarAsInterface = zzd.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.flags.impl.FlagProviderImpl"));
                this.zzb = zzeVarAsInterface;
                zzeVarAsInterface.init(ObjectWrapper.wrap(context));
                this.zza = true;
            } catch (RemoteException | DynamiteModule.LoadingException e10) {
                Log.w("FlagValueProvider", "Failed to initialize flags module.", e10);
            }
        }
    }
}
