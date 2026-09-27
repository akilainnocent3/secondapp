package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzcfv {
    private final WeakReference zza;

    public zzcfv(View view) {
        this.zza = new WeakReference(view);
    }

    public abstract void zza(ViewTreeObserver viewTreeObserver);

    public abstract void zzb(ViewTreeObserver viewTreeObserver);

    public final void zzc() {
        ViewTreeObserver viewTreeObserverZze = zze();
        if (viewTreeObserverZze != null) {
            zza(viewTreeObserverZze);
        }
    }

    public final void zzd() {
        ViewTreeObserver viewTreeObserverZze = zze();
        if (viewTreeObserverZze != null) {
            zzb(viewTreeObserverZze);
        }
    }

    @Nullable
    public final ViewTreeObserver zze() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.zza.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}
