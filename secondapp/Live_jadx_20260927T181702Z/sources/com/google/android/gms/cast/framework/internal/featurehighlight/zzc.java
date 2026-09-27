package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzc implements View.OnLayoutChangeListener {
    final /* synthetic */ zzh zza;

    public zzc(zzh zzhVar, Runnable runnable) {
        this.zza = zzhVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.zza.zzk();
        this.zza.removeOnLayoutChangeListener(this);
    }
}
