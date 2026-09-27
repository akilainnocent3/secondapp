package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzp extends zzai {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzp(zzt zztVar, String str) {
        super(NotificationCompat.GROUP_KEY_SILENT);
        Objects.requireNonNull(zztVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        return this;
    }
}
