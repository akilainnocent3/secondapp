package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgaf extends zzidl implements zzifd {
    private zzgaf() {
        throw null;
    }

    public final zzgaf zza(String str) {
        str.getClass();
        zzbg();
        ((zzgah) this.zza).zze().remove(str);
        return this;
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(((zzgah) this.zza).zzb());
    }

    public final zzgaf zzc(String str, zzgad zzgadVar) {
        str.getClass();
        zzgadVar.getClass();
        zzbg();
        ((zzgah) this.zza).zze().put(str, zzgadVar);
        return this;
    }

    public /* synthetic */ zzgaf(byte[] bArr) {
        super(zzgah.zzb);
    }
}
