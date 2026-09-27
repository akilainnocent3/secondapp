package com.yandex.div.internal;

import androidx.annotation.NonNull;
import com.yandex.div.logging.Severity;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class Log {
    private static volatile boolean sEnabled = false;
    private static volatile Severity sSeverity = Severity.VERBOSE;

    private Log() {
    }

    public static void d(@NonNull String str, @NonNull String str2) {
        if (isAtLeast(Severity.DEBUG)) {
            android.util.Log.d(str, str2);
        }
    }

    public static void e(@NonNull String str, @NonNull String str2) {
        if (isAtLeast(Severity.ERROR)) {
            android.util.Log.e(str, str2);
        }
    }

    public static Severity getSeverity() {
        return sSeverity;
    }

    public static void i(@NonNull String str, @NonNull String str2) {
        if (isAtLeast(Severity.INFO)) {
            android.util.Log.i(str, str2);
        }
    }

    public static boolean isAtLeast(Severity severity) {
        if (isEnabled()) {
            return sSeverity.isAtLeast(severity);
        }
        return false;
    }

    public static boolean isEnabled() {
        return sEnabled;
    }

    public static void setEnabled(Boolean bool) {
        sEnabled = bool.booleanValue();
    }

    public static void setSeverity(@NonNull Severity severity) {
        sSeverity = severity;
    }

    public static void v(@NonNull String str, @NonNull String str2) {
        if (isAtLeast(Severity.VERBOSE)) {
            android.util.Log.v(str, str2);
        }
    }

    public static void w(@NonNull String str, @NonNull String str2) {
        if (isAtLeast(Severity.WARNING)) {
            android.util.Log.w(str, str2);
        }
    }

    public static void d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (isAtLeast(Severity.DEBUG)) {
            android.util.Log.d(str, str2, th2);
        }
    }

    public static void e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (isAtLeast(Severity.ERROR)) {
            android.util.Log.e(str, str2, th2);
        }
    }

    public static void i(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (isAtLeast(Severity.INFO)) {
            android.util.Log.i(str, str2, th2);
        }
    }

    public static void v(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (isAtLeast(Severity.VERBOSE)) {
            android.util.Log.v(str, str2, th2);
        }
    }

    public static void w(@NonNull String str, @NonNull Throwable th2) {
        if (isAtLeast(Severity.WARNING)) {
            android.util.Log.w(str, th2);
        }
    }

    public static void w(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (isAtLeast(Severity.WARNING)) {
            android.util.Log.w(str, str2, th2);
        }
    }
}
