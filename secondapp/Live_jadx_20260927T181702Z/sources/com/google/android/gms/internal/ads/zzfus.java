package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfus {
    private static final zzfus zza = new zzfus();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfus() {
    }

    public static zzfus zza() {
        return zza;
    }

    public final void zzb(zzfty zzftyVar) {
        this.zzb.add(zzftyVar);
    }

    public final void zzc(zzfty zzftyVar) {
        ArrayList arrayList = this.zzc;
        boolean zZzg = zzg();
        arrayList.add(zzftyVar);
        if (zZzg) {
            return;
        }
        zzfva.zza().zzc();
    }

    public final void zzd(zzfty zzftyVar) {
        ArrayList arrayList = this.zzb;
        boolean zZzg = zzg();
        arrayList.remove(zzftyVar);
        this.zzc.remove(zzftyVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzfva.zza().zze();
    }

    public final Collection zze() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final Collection zzf() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
