package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zza extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ zzh zza;

    public zza(zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        zzh zzhVar = this.zza;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (zzhVar.zzk == null) {
            return true;
        }
        if (zzhVar.zzd.contains(Math.round(x10), Math.round(y10)) && this.zza.zze.zzg(x10, y10)) {
            return true;
        }
        this.zza.zzk.zza();
        return true;
    }
}
