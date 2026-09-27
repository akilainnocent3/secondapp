package com.google.android.gms.internal.cast;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.internal.Logger;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcy {
    protected final Logger zza;

    @Nullable
    protected final zzda zzb;

    public zzcy(@NonNull Context context) {
        zzdd zzddVar = new zzdd(context, zzsc.zza(Executors.newFixedThreadPool(3)));
        this.zza = new Logger("BaseNetUtils");
        this.zzb = zzddVar;
        zzddVar.zza();
    }
}
