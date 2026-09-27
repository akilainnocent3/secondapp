package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzelc {

    @Nullable
    private s8.a zza;
    private final Context zzb;

    public zzelc(Context context) {
        this.zzb = context;
    }

    public final nj.t1 zza() {
        try {
            s8.a aVarB = s8.a.b(this.zzb);
            this.zza = aVarB;
            return aVarB == null ? zzhbi.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : aVarB.c();
        } catch (Exception e10) {
            return zzhbi.zzc(e10);
        }
    }

    public final nj.t1 zzb(Uri uri, InputEvent inputEvent) {
        try {
            s8.a aVar = this.zza;
            Objects.requireNonNull(aVar);
            return aVar.d(uri, inputEvent);
        } catch (Exception e10) {
            return zzhbi.zzc(e10);
        }
    }
}
