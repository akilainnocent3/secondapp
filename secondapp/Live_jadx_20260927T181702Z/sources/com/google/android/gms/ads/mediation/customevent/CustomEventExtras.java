package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class CustomEventExtras {
    private final HashMap zza = new HashMap();

    @Nullable
    public Object getExtra(@NonNull String str) {
        return this.zza.get(str);
    }

    public void setExtra(@NonNull String str, @NonNull Object obj) {
        this.zza.put(str, obj);
    }
}
