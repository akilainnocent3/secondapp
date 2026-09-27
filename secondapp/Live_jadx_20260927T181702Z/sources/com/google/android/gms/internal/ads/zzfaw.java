package com.google.android.gms.internal.ads;

import android.os.Bundle;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfaw implements zzfbw {
    private final String zza;

    public zzfaw(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((Bundle) obj).putString(CommonUrlParts.REQUEST_ID, this.zza);
    }
}
