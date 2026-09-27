package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaf extends com.google.android.gms.cast.framework.zzad {

    @h1
    public final Set zza = Collections.synchronizedSet(new HashSet());
    private int zzd = zzb;
    private static final Logger zzc = new Logger("AppVisibilityProxy");

    @h1
    static final int zzb = 1;

    @Override // com.google.android.gms.cast.framework.zzae
    public final IObjectWrapper zzb() {
        return ObjectWrapper.wrap(this);
    }

    @Override // com.google.android.gms.cast.framework.zzae
    public final void zzc() {
        zzc.i("onAppEnteredBackground", new Object[0]);
        this.zzd = 2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzae) it.next()).zza();
        }
    }

    @Override // com.google.android.gms.cast.framework.zzae
    public final void zzd() {
        zzc.i("onAppEnteredForeground", new Object[0]);
        this.zzd = 1;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzae) it.next()).zzb();
        }
    }

    public final boolean zze() {
        return this.zzd == 2;
    }
}
