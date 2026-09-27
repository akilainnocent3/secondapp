package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqr {
    private final zzv zza;

    @Nullable
    private AudioDeviceInfo zzc;
    private zzd zzb = zzd.zza;
    private int zzd = 0;
    private int zze = -1;
    private int zzf = -1;

    public zzqr(zzv zzvVar) {
        this.zza = zzvVar;
    }

    public final zzqr zza(zzd zzdVar) {
        this.zzb = zzdVar;
        return this;
    }

    public final zzqr zzb(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.zzc = audioDeviceInfo;
        return this;
    }

    public final zzqr zzc(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzqr zzd(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzqr zze(int i10) {
        this.zzf = -1;
        return this;
    }

    public final /* synthetic */ zzv zzf() {
        return this.zza;
    }

    public final /* synthetic */ zzd zzg() {
        return this.zzb;
    }

    public final /* synthetic */ AudioDeviceInfo zzh() {
        return this.zzc;
    }

    public final /* synthetic */ int zzi() {
        return this.zzd;
    }

    public final /* synthetic */ int zzj() {
        return this.zze;
    }

    public final /* synthetic */ int zzk() {
        return this.zzf;
    }
}
