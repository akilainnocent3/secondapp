package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public interface zzchb extends zzcma, zzcmd, zzbsa {
    Context getContext();

    void setBackgroundColor(int i10);

    void zzA(int i10);

    void zzB(int i10);

    @Nullable
    zzcgq zzdm();

    void zzdn(boolean z10);

    @Nullable
    zzclo zzh();

    @Nullable
    zzbiq zzi();

    @Nullable
    Activity zzj();

    @Nullable
    com.google.android.gms.ads.internal.zza zzk();

    void zzl();

    String zzm();

    @Nullable
    String zzn();

    void zzo(int i10);

    int zzp();

    zzbir zzq();

    @Nullable
    zzcio zzr(String str);

    VersionInfoParcel zzs();

    void zzt(String str, zzcio zzcioVar);

    void zzu(boolean z10, long j10);

    void zzv(int i10);

    void zzw(zzclo zzcloVar);

    int zzx();

    int zzy();

    void zzz();
}
