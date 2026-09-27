package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzebm implements zzdjn {
    private final Bundle zza = new Bundle();

    @k.h1
    public zzebm() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjn
    public final synchronized void zza(String str) {
        this.zza.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdjn
    public final synchronized void zzb(String str) {
        this.zza.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzdjn
    public final synchronized void zzc(String str, String str2) {
        this.zza.putInt(str, 3);
    }

    public final synchronized Bundle zzg() {
        return new Bundle(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdjn
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjn
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjn
    public final void zzd(String str) {
    }
}
