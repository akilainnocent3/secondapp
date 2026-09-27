package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzimt {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzimt(int i10, int i11, zzims zzimsVar) {
        this.zza = zzimf.zza(i10);
        this.zzb = zzimf.zza(i11);
    }

    public final zzimt zza(zzimr zzimrVar) {
        this.zza.add(zzimrVar);
        return this;
    }

    public final zzimt zzb(zzimr zzimrVar) {
        this.zzb.add(zzimrVar);
        return this;
    }

    public final zzimu zzc() {
        return new zzimu(this.zza, this.zzb, null);
    }
}
