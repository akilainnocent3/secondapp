package com.google.android.gms.cast;

import androidx.annotation.Nullable;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzu {
    private String zza = "com.google.android.gms.cast.CATEGORY_CAST";

    @Nullable
    private String zzb;

    @Nullable
    private Collection zzc;

    public /* synthetic */ zzu(zzt zztVar) {
    }

    public static /* synthetic */ zzu zza(zzu zzuVar, String str) {
        zzuVar.zzb = str;
        return zzuVar;
    }

    public static /* synthetic */ zzu zzb(zzu zzuVar, String str) {
        zzuVar.zza = "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK";
        return zzuVar;
    }

    public static /* synthetic */ zzu zzc(zzu zzuVar, Collection collection) {
        zzuVar.zzc = collection;
        return zzuVar;
    }

    public static /* bridge */ /* synthetic */ zzw zzd(zzu zzuVar) {
        return new zzw(zzuVar.zza, zzuVar.zzb, zzuVar.zzc, false, true, null);
    }

    private zzu() {
    }
}
