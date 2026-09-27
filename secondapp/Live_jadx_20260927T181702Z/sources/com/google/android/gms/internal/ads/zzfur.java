package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfur extends zzfuu {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfur zzb = new zzfur();

    private zzfur() {
    }

    public static zzfur zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    public final boolean zzb() {
        Iterator it = zzfus.zza().zzf().iterator();
        while (it.hasNext()) {
            View viewZzi = ((zzfty) it.next()).zzi();
            if (viewZzi != null && viewZzi.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    public final void zzc(boolean z10) {
        Iterator it = zzfus.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfty) it.next()).zzg().zzf(z10);
        }
    }
}
