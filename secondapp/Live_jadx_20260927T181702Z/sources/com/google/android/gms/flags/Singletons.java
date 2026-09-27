package com.google.android.gms.flags;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
public final class Singletons {
    private static Singletons zza;
    private final FlagRegistry zzb = new FlagRegistry();
    private final zzb zzc = new zzb();

    static {
        Singletons singletons = new Singletons();
        synchronized (Singletons.class) {
            zza = singletons;
        }
    }

    private Singletons() {
    }

    @NonNull
    @KeepForSdk
    public static FlagRegistry flagRegistry() {
        return zzb().zzb;
    }

    public static zzb zza() {
        return zzb().zzc;
    }

    private static Singletons zzb() {
        Singletons singletons;
        synchronized (Singletons.class) {
            singletons = zza;
        }
        return singletons;
    }
}
