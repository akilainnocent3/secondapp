package io.appmetrica.analytics.coreutils.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;
import vq.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class WrapUtils {
    public static double getFiniteDoubleOrDefault(double d10, double d11) {
        return a.a(d10) ? d10 : d11;
    }

    public static double getFiniteDoubleOrDefaultNullable(@Nullable Double d10, double d11) {
        return d10 == null ? d11 : getFiniteDoubleOrDefault(d10.doubleValue(), d11);
    }

    public static long getMillisOrDefault(@Nullable Long l10, @NonNull TimeUnit timeUnit, long j10) {
        return l10 == null ? j10 : timeUnit.toMillis(l10.longValue());
    }

    @NonNull
    public static <T> T getOrDefault(@Nullable T t10, @NonNull T t11) {
        return t10 == null ? t11 : t10;
    }

    @NonNull
    public static String getOrDefaultIfEmpty(@Nullable String str, @NonNull String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    @Nullable
    public static <T> T getOrDefaultNullable(@Nullable T t10, @Nullable T t11) {
        return t10 == null ? t11 : t10;
    }

    @Nullable
    public static String getOrDefaultNullableIfEmpty(@Nullable String str, @Nullable String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    @NonNull
    public static <T> String wrapToTag(@Nullable T t10) {
        if (t10 == null) {
            return "<null>";
        }
        return t10.toString().isEmpty() ? "<empty>" : t10.toString();
    }
}
