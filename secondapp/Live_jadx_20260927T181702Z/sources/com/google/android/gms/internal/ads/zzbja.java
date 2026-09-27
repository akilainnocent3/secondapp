package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbja extends z.c {
    final /* synthetic */ zzbjd zza;

    public zzbja(zzbjd zzbjdVar) {
        Objects.requireNonNull(zzbjdVar);
        this.zza = zzbjdVar;
    }

    @Override // z.c
    public final void onNavigationEvent(int i10, @Nullable Bundle bundle) {
        this.zza.zzc(i10);
    }
}
