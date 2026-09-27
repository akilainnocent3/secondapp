package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@DynamiteApi
public class FlagProviderImpl extends com.google.android.gms.flags.zzd {
    private boolean zza = false;
    private SharedPreferences zzb;

    @Override // com.google.android.gms.flags.zze
    public boolean getBooleanFlagValue(@NonNull String str, boolean z10, int i10) {
        if (!this.zza) {
            return z10;
        }
        SharedPreferences sharedPreferences = this.zzb;
        Boolean boolValueOf = Boolean.valueOf(z10);
        try {
            boolValueOf = (Boolean) com.google.android.gms.internal.flags.zzd.zza(new zza(sharedPreferences, str, boolValueOf));
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.google.android.gms.flags.zze
    public int getIntFlagValue(@NonNull String str, int i10, int i11) {
        if (!this.zza) {
            return i10;
        }
        SharedPreferences sharedPreferences = this.zzb;
        Integer numValueOf = Integer.valueOf(i10);
        try {
            numValueOf = (Integer) com.google.android.gms.internal.flags.zzd.zza(new zzb(sharedPreferences, str, numValueOf));
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return numValueOf.intValue();
    }

    @Override // com.google.android.gms.flags.zze
    public long getLongFlagValue(@NonNull String str, long j10, int i10) {
        if (!this.zza) {
            return j10;
        }
        SharedPreferences sharedPreferences = this.zzb;
        Long lValueOf = Long.valueOf(j10);
        try {
            lValueOf = (Long) com.google.android.gms.internal.flags.zzd.zza(new zzc(sharedPreferences, str, lValueOf));
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return lValueOf.longValue();
    }

    @Override // com.google.android.gms.flags.zze
    @NonNull
    public String getStringFlagValue(@NonNull String str, @NonNull String str2, int i10) {
        if (!this.zza) {
            return str2;
        }
        try {
            return (String) com.google.android.gms.internal.flags.zzd.zza(new zzd(this.zzb, str, str2));
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    @Override // com.google.android.gms.flags.zze
    public void init(@NonNull IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (this.zza) {
            return;
        }
        try {
            this.zzb = zzf.zza(context.createPackageContext("com.google.android.gms", 0));
            this.zza = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            Log.w("FlagProviderImpl", strValueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(strValueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
