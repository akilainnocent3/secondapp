package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzbhv {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public /* synthetic */ zzbhv(int i10, String str, Object obj, Object obj2, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzba.zzb().zza(this);
    }

    public static zzbhv zzh(int i10, String str, int i11, int i12) {
        return new zzbhr(1, str, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static zzbhv zzi(int i10, String str, long j10, long j11) {
        return new zzbhs(1, str, Long.valueOf(j10), Long.valueOf(j11));
    }

    public static zzbhv zzj(int i10, String str, float f10, float f11) {
        return new zzbht(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static zzbhv zzk(int i10, String str) {
        zzbhu zzbhuVar = new zzbhu(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzba.zzb().zzb(zzbhuVar);
        return zzbhuVar;
    }

    public static zzbhv zzl(int i10, String str) {
        zzbhu zzbhuVar = new zzbhu(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzba.zzb().zzc(zzbhuVar);
        return zzbhuVar;
    }

    public abstract Object zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, Object obj);

    public abstract Object zzc(JSONObject jSONObject);

    public abstract Object zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final Object zzf() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzb() ? this.zzd : this.zzc;
    }

    public final Object zzg() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzd(this);
    }

    public final int zzm() {
        return this.zza;
    }
}
