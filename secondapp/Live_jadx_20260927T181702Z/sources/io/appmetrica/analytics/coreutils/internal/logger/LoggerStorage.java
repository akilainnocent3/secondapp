package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class LoggerStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap f95325a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f95326b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile PublicLogger f95327c = PublicLogger.getAnonymousInstance();

    @NonNull
    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f95327c;
    }

    @NonNull
    public static PublicLogger getOrCreateMainPublicLogger(@NonNull String str) {
        f95327c = getOrCreatePublicLogger(str);
        return f95327c;
    }

    @NonNull
    public static PublicLogger getOrCreatePublicLogger(@Nullable String str) {
        PublicLogger publicLogger;
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger2 = (PublicLogger) f95325a.get(str);
        if (publicLogger2 != null) {
            return publicLogger2;
        }
        synchronized (f95326b) {
            try {
                publicLogger = (PublicLogger) f95325a.get(str);
                if (publicLogger == null) {
                    publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                    f95325a.put(str, publicLogger);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return publicLogger;
    }

    @h1(otherwise = 5)
    public static void unsetPublicLoggers() {
        f95325a = new HashMap();
        f95327c = PublicLogger.getAnonymousInstance();
    }
}
