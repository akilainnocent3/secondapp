package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import qx.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbj extends zzaz {

    @c
    private final SessionManagerListener zza;
    private final Class zzb;

    public zzbj(SessionManagerListener sessionManagerListener, Class cls) {
        this.zza = sessionManagerListener;
        this.zzb = cls;
    }

    @Override // com.google.android.gms.cast.framework.zzba
    public final IObjectWrapper zzb() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.cast.framework.zzba
    public final void zzc(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        SessionManagerListener sessionManagerListener;
        Session session = (Session) ObjectWrapper.unwrap(iObjectWrapper);
        if (!this.zzb.isInstance(session) || (sessionManagerListener = this.zza) == null) {
            return;
        }
        sessionManagerListener.onSessionEnded((Session) this.zzb.cast(session), i10);
    }

    @Override // com.google.android.gms.cast.framework.zzba
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        SessionManagerListener sessionManagerListener;
        Session session = (Session) ObjectWrapper.unwrap(iObjectWrapper);
        if (!this.zzb.isInstance(session) || (sessionManagerListener = this.zza) == null) {
            return;
        }
        sessionManagerListener.onSessionEnding((Session) this.zzb.cast(session));
    }

    @Override // com.google.android.gms.cast.framework.zzba
    public final void zze(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        SessionManagerListener sessionManagerListener;
        Session session = (Session) ObjectWrapper.unwrap(iObjectWrapper);
        if (!this.zzb.isInstance(session) || (sessionManagerListener = this.zza) == null) {
            return;
        }
        sessionManagerListener.onSessionResumeFailed((Session) this.zzb.cast(session), i10);
    }

    @Override // com.google.android.gms.cast.framework.zzba
    public final void zzf(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException {
        SessionManagerListener sessionManagerListener;
        Session session = (Session) ObjectWrapper.unwrap(iObjectWrapper);
        if (!this.zzb.isInstance(session) || (sessionManagerListener = this.zza) == null) {
            return;
        }
        sessionManagerListener.onSessionResumed((Session) this.zzb.cast(session), z10);
    }

    @Override // com.google.android.gms.cast.framework.zzba
    public final void zzg(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        SessionManagerListener sessionManagerListener;
        Session session = (Session) ObjectWrapper.unwrap(iObjectWrapper);
        if (!this.zzb.isInstance(session) || (sessionManagerListener = this.zza) == null) {
            return;
        }
        sessionManagerListener.onSessionResuming((Session) this.zzb.cast(session), str);
    }

    @Override // com.google.android.gms.cast.framework.zzba
    public final void zzh(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        SessionManagerListener sessionManagerListener;
        Session session = (Session) ObjectWrapper.unwrap(iObjectWrapper);
        if (!this.zzb.isInstance(session) || (sessionManagerListener = this.zza) == null) {
            return;
        }
        sessionManagerListener.onSessionStartFailed((Session) this.zzb.cast(session), i10);
    }

    @Override // com.google.android.gms.cast.framework.zzba
    public final void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        SessionManagerListener sessionManagerListener;
        Session session = (Session) ObjectWrapper.unwrap(iObjectWrapper);
        if (!this.zzb.isInstance(session) || (sessionManagerListener = this.zza) == null) {
            return;
        }
        sessionManagerListener.onSessionStarted((Session) this.zzb.cast(session), str);
    }

    @Override // com.google.android.gms.cast.framework.zzba
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        SessionManagerListener sessionManagerListener;
        Session session = (Session) ObjectWrapper.unwrap(iObjectWrapper);
        if (!this.zzb.isInstance(session) || (sessionManagerListener = this.zza) == null) {
            return;
        }
        sessionManagerListener.onSessionStarting((Session) this.zzb.cast(session));
    }

    @Override // com.google.android.gms.cast.framework.zzba
    public final void zzk(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        SessionManagerListener sessionManagerListener;
        Session session = (Session) ObjectWrapper.unwrap(iObjectWrapper);
        if (!this.zzb.isInstance(session) || (sessionManagerListener = this.zza) == null) {
            return;
        }
        sessionManagerListener.onSessionSuspended((Session) this.zzb.cast(session), i10);
    }
}
