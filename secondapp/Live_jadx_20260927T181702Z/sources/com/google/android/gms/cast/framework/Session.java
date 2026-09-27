package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.rtsp.e;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Session {
    private static final Logger zza = new Logger(e.f49022z);

    @Nullable
    private final zzaw zzb;
    private final zzbi zzc;

    public Session(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        zzbi zzbiVar = new zzbi(this, null);
        this.zzc = zzbiVar;
        this.zzb = com.google.android.gms.internal.cast.zzag.zzd(context, str, str2, zzbiVar);
    }

    public abstract void end(boolean z10);

    @Nullable
    public final String getCategory() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzh();
            } catch (RemoteException e10) {
                zza.d(e10, "Unable to call %s on %s.", "getCategory", zzaw.class.getSimpleName());
            }
        }
        return null;
    }

    @Nullable
    public final String getSessionId() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzi();
            } catch (RemoteException e10) {
                zza.d(e10, "Unable to call %s on %s.", "getSessionId", zzaw.class.getSimpleName());
            }
        }
        return null;
    }

    public long getSessionRemainingTimeMs() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return 0L;
    }

    public boolean isConnected() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzp();
            } catch (RemoteException e10) {
                zza.d(e10, "Unable to call %s on %s.", "isConnected", zzaw.class.getSimpleName());
            }
        }
        return false;
    }

    public boolean isConnecting() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzq();
            } catch (RemoteException e10) {
                zza.d(e10, "Unable to call %s on %s.", "isConnecting", zzaw.class.getSimpleName());
            }
        }
        return false;
    }

    public boolean isDisconnected() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzr();
            } catch (RemoteException e10) {
                zza.d(e10, "Unable to call %s on %s.", "isDisconnected", zzaw.class.getSimpleName());
            }
        }
        return true;
    }

    public boolean isDisconnecting() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzs();
            } catch (RemoteException e10) {
                zza.d(e10, "Unable to call %s on %s.", "isDisconnecting", zzaw.class.getSimpleName());
            }
        }
        return false;
    }

    public boolean isResuming() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzt();
            } catch (RemoteException e10) {
                zza.d(e10, "Unable to call %s on %s.", "isResuming", zzaw.class.getSimpleName());
            }
        }
        return false;
    }

    public boolean isSuspended() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzu();
            } catch (RemoteException e10) {
                zza.d(e10, "Unable to call %s on %s.", "isSuspended", zzaw.class.getSimpleName());
            }
        }
        return false;
    }

    public final void notifyFailedToResumeSession(int i10) {
        zzaw zzawVar = this.zzb;
        if (zzawVar == null) {
            return;
        }
        try {
            zzawVar.zzj(i10);
        } catch (RemoteException e10) {
            zza.d(e10, "Unable to call %s on %s.", "notifyFailedToResumeSession", zzaw.class.getSimpleName());
        }
    }

    public final void notifyFailedToStartSession(int i10) {
        zzaw zzawVar = this.zzb;
        if (zzawVar == null) {
            return;
        }
        try {
            zzawVar.zzk(i10);
        } catch (RemoteException e10) {
            zza.d(e10, "Unable to call %s on %s.", "notifyFailedToStartSession", zzaw.class.getSimpleName());
        }
    }

    public final void notifySessionEnded(int i10) {
        zzaw zzawVar = this.zzb;
        if (zzawVar == null) {
            return;
        }
        try {
            zzawVar.zzl(i10);
        } catch (RemoteException e10) {
            zza.d(e10, "Unable to call %s on %s.", "notifySessionEnded", zzaw.class.getSimpleName());
        }
    }

    public final void notifySessionResumed(boolean z10) {
        zzaw zzawVar = this.zzb;
        if (zzawVar == null) {
            return;
        }
        try {
            zzawVar.zzm(z10);
        } catch (RemoteException e10) {
            zza.d(e10, "Unable to call %s on %s.", "notifySessionResumed", zzaw.class.getSimpleName());
        }
    }

    public final void notifySessionStarted(@NonNull String str) {
        zzaw zzawVar = this.zzb;
        if (zzawVar == null) {
            return;
        }
        try {
            zzawVar.zzn(str);
        } catch (RemoteException e10) {
            zza.d(e10, "Unable to call %s on %s.", "notifySessionStarted", zzaw.class.getSimpleName());
        }
    }

    public final void notifySessionSuspended(int i10) {
        zzaw zzawVar = this.zzb;
        if (zzawVar == null) {
            return;
        }
        try {
            zzawVar.zzo(i10);
        } catch (RemoteException e10) {
            zza.d(e10, "Unable to call %s on %s.", "notifySessionSuspended", zzaw.class.getSimpleName());
        }
    }

    public abstract void resume(@Nullable Bundle bundle);

    public abstract void start(@Nullable Bundle bundle);

    public final int zzm() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                if (zzawVar.zze() >= 211100000) {
                    return this.zzb.zzf();
                }
            } catch (RemoteException e10) {
                zza.d(e10, "Unable to call %s on %s.", "getSessionStartType", zzaw.class.getSimpleName());
            }
        }
        return 0;
    }

    @Nullable
    public final IObjectWrapper zzn() {
        zzaw zzawVar = this.zzb;
        if (zzawVar != null) {
            try {
                return zzawVar.zzg();
            } catch (RemoteException e10) {
                zza.d(e10, "Unable to call %s on %s.", "getWrappedObject", zzaw.class.getSimpleName());
            }
        }
        return null;
    }

    public void onResuming(@Nullable Bundle bundle) {
    }

    public void onStarting(@Nullable Bundle bundle) {
    }

    public void zzk(@Nullable Bundle bundle) {
    }
}
