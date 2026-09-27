package com.google.android.gms.cast.internal;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
public class Logger {

    @NonNull
    protected final String zza;
    private final boolean zzb;
    private boolean zzc;
    private final String zzd;

    @KeepForSdk
    public Logger(@NonNull String str) {
        this(str, null);
    }

    @KeepForSdk
    public void d(@NonNull String str, @NonNull Object... objArr) {
        if (zzc()) {
            Log.d(this.zza, zza(str, objArr));
        }
    }

    @KeepForSdk
    public void e(@NonNull String str, @NonNull Object... objArr) {
        Log.e(this.zza, zza(str, objArr));
    }

    @KeepForSdk
    public void i(@NonNull String str, @NonNull Object... objArr) {
        Log.i(this.zza, zza(str, objArr));
    }

    @KeepForSdk
    public void w(@NonNull String str, @NonNull Object... objArr) {
        Log.w(this.zza, zza(str, objArr));
    }

    @NonNull
    public final String zza(@NonNull String str, @NonNull Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.zzd)) {
            return str;
        }
        String str2 = this.zzd;
        return String.valueOf(str2).concat(String.valueOf(str));
    }

    public final void zzb(boolean z10) {
        this.zzc = true;
    }

    public final boolean zzc() {
        if (Build.TYPE.equals("user")) {
            return false;
        }
        if (this.zzc) {
            return true;
        }
        return this.zzb && Log.isLoggable(this.zza, 3);
    }

    public Logger(@NonNull String str, @NonNull String str2) {
        Preconditions.checkNotEmpty(str, "The log tag cannot be null or empty.");
        this.zza = str;
        this.zzb = str.length() <= 23;
        this.zzc = false;
        this.zzd = TextUtils.isEmpty(str2) ? null : String.format("[%s] ", str2);
    }

    @KeepForSdk
    public void e(@NonNull Throwable th2, @NonNull String str, @NonNull Object... objArr) {
        Log.e(this.zza, zza(str, objArr), th2);
    }

    @KeepForSdk
    public void i(@NonNull Throwable th2, @NonNull String str, @NonNull Object... objArr) {
        Log.i(this.zza, zza(str, objArr), th2);
    }

    @KeepForSdk
    public void w(@NonNull Throwable th2, @NonNull String str, @NonNull Object... objArr) {
        Log.w(this.zza, zza(str, objArr), th2);
    }

    @KeepForSdk
    public void d(@NonNull Throwable th2, @NonNull String str, @NonNull Object... objArr) {
        if (zzc()) {
            Log.d(this.zza, zza(str, objArr), th2);
        }
    }

    @KeepForSdk
    public void v(@NonNull String str, @NonNull Object... objArr) {
    }
}
