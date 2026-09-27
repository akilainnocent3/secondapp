package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface IReporter {
    void clearAppEnvironment();

    @NonNull
    IPluginReporter getPluginExtension();

    void pauseSession();

    void putAppEnvironmentValue(@NonNull String str, @Nullable String str2);

    void reportAdRevenue(@NonNull AdRevenue adRevenue);

    void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map);

    void reportECommerce(@NonNull ECommerceEvent eCommerceEvent);

    void reportError(@NonNull String str, @Nullable String str2);

    void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th2);

    void reportError(@NonNull String str, @Nullable Throwable th2);

    void reportEvent(@NonNull String str);

    void reportEvent(@NonNull String str, @Nullable String str2);

    void reportEvent(@NonNull String str, @Nullable Map<String, Object> map);

    void reportRevenue(@NonNull Revenue revenue);

    void reportUnhandledException(@NonNull Throwable th2);

    void reportUserProfile(@NonNull UserProfile userProfile);

    void resumeSession();

    void sendEventsBuffer();

    void setDataSendingEnabled(boolean z10);

    void setUserProfileID(@Nullable String str);
}
