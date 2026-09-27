package com.google.android.gms.internal.measurement;

import zi.u0;
import zi.w0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzpl implements u0 {
    private static final zzpl zza = new zzpl();
    private final u0 zzb = w0.e(new zzpn());

    @ky.e
    public static boolean zza() {
        return zza.get().zza();
    }

    @ky.e
    public static boolean zzb() {
        return zza.get().zzb();
    }

    @Override // zi.u0
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzpm get() {
        return (zzpm) this.zzb.get();
    }
}
