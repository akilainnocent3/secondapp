package com.google.android.gms.cast;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.internal.CastUtils;
import java.util.Collection;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class CastMediaControlIntent {

    @NonNull
    public static final String ACTION_SYNC_STATUS = "com.google.android.gms.cast.ACTION_SYNC_STATUS";

    @NonNull
    public static final String DEFAULT_MEDIA_RECEIVER_APPLICATION_ID = "CC1AD845";
    public static final int ERROR_CODE_REQUEST_FAILED = 1;
    public static final int ERROR_CODE_SESSION_START_FAILED = 2;
    public static final int ERROR_CODE_TEMPORARILY_DISCONNECTED = 3;

    @NonNull
    public static final String EXTRA_CAST_APPLICATION_ID = "com.google.android.gms.cast.EXTRA_CAST_APPLICATION_ID";

    @NonNull
    public static final String EXTRA_CAST_LANGUAGE_CODE = "com.google.android.gms.cast.EXTRA_CAST_LANGUAGE_CODE";

    @NonNull
    public static final String EXTRA_CAST_RELAUNCH_APPLICATION = "com.google.android.gms.cast.EXTRA_CAST_RELAUNCH_APPLICATION";

    @NonNull
    public static final String EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS = "com.google.android.gms.cast.EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS";

    @NonNull
    public static final String EXTRA_CUSTOM_DATA = "com.google.android.gms.cast.EXTRA_CUSTOM_DATA";

    @NonNull
    public static final String EXTRA_DEBUG_LOGGING_ENABLED = "com.google.android.gms.cast.EXTRA_DEBUG_LOGGING_ENABLED";

    @NonNull
    public static final String EXTRA_ERROR_CODE = "com.google.android.gms.cast.EXTRA_ERROR_CODE";

    private CastMediaControlIntent() {
    }

    @NonNull
    public static String categoryForCast(@NonNull String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        zzu zzuVar = new zzu(null);
        zzu.zza(zzuVar, str);
        return zzw.zza(zzu.zzd(zzuVar));
    }

    @NonNull
    public static String categoryForRemotePlayback() {
        zzu zzuVar = new zzu(null);
        zzu.zzb(zzuVar, "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK");
        return zzw.zza(zzu.zzd(zzuVar));
    }

    @NonNull
    public static String languageTagForLocale(@NonNull Locale locale) {
        return CastUtils.zzb(locale);
    }

    @NonNull
    public static String categoryForRemotePlayback(@NonNull String str) throws IllegalArgumentException {
        if (!TextUtils.isEmpty(str)) {
            zzu zzuVar = new zzu(null);
            zzu.zzb(zzuVar, "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK");
            zzu.zza(zzuVar, str);
            return zzw.zza(zzu.zzd(zzuVar));
        }
        throw new IllegalArgumentException("applicationId cannot be null or empty");
    }

    @NonNull
    public static String categoryForCast(@NonNull String str, @NonNull Collection<String> collection) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        if (collection != null) {
            zzu zzuVar = new zzu(null);
            zzu.zza(zzuVar, str);
            zzu.zzc(zzuVar, collection);
            return zzw.zza(zzu.zzd(zzuVar));
        }
        throw new IllegalArgumentException("namespaces cannot be null");
    }

    @NonNull
    public static String categoryForCast(@NonNull Collection<String> collection) throws IllegalArgumentException {
        if (collection != null) {
            zzu zzuVar = new zzu(null);
            zzu.zzc(zzuVar, collection);
            return zzw.zza(zzu.zzd(zzuVar));
        }
        throw new IllegalArgumentException("namespaces cannot be null");
    }
}
