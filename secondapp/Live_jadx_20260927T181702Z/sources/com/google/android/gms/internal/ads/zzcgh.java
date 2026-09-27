package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzcgh extends TextureView implements zzche {
    protected final zzcgv zza;
    protected final zzchf zzb;

    public zzcgh(Context context) {
        super(context);
        this.zza = new zzcgv();
        this.zzb = new zzchf(context, this);
    }

    public abstract String zza();

    public abstract void zzb(zzcgg zzcggVar);

    public abstract void zzc(@Nullable String str);

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract void zzi(int i10);

    public abstract void zzj(float f10, float f11);

    public abstract int zzk();

    public abstract int zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract int zzp();

    public abstract void zzq();

    @Nullable
    public Integer zzw() {
        return null;
    }

    public void zzx(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        zzc(str);
    }

    public void zzA(int i10) {
    }

    public void zzB(int i10) {
    }

    public void zzC(int i10) {
    }

    public void zzy(int i10) {
    }

    public void zzz(int i10) {
    }
}
