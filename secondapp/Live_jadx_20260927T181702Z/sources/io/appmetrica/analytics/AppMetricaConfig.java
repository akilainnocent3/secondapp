package io.appmetrica.analytics;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C5084h0;
import io.appmetrica.analytics.impl.C5267o5;
import io.appmetrica.analytics.impl.D7;
import io.appmetrica.analytics.impl.Fn;
import io.appmetrica.analytics.impl.H3;
import io.appmetrica.analytics.impl.mo;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class AppMetricaConfig {

    @NonNull
    public final Map<String, Object> additionalConfig;

    @Nullable
    public final Boolean advIdentifiersTracking;

    @Nullable
    public final Boolean anrMonitoring;

    @Nullable
    public final Integer anrMonitoringTimeout;

    @NonNull
    public final String apiKey;

    @Nullable
    public final Integer appBuildNumber;

    @Nullable
    public final Map<String, String> appEnvironment;

    @Nullable
    public final Boolean appOpenTrackingEnabled;

    @Nullable
    public final String appVersion;

    @Nullable
    public final Boolean crashReporting;

    @Nullable
    public final ICrashTransformer crashTransformer;

    @Nullable
    public final List<String> customHosts;

    @Nullable
    public final Boolean dataSendingEnabled;

    @Nullable
    public final String deviceType;

    @Nullable
    public final Integer dispatchPeriodSeconds;

    @Nullable
    public final Map<String, String> errorEnvironment;

    @Nullable
    public final Boolean firstActivationAsUpdate;

    @Nullable
    public final Location location;

    @Nullable
    public final Boolean locationTracking;

    @Nullable
    public final Boolean logs;

    @Nullable
    public final Integer maxReportsCount;

    @Nullable
    public final Integer maxReportsInDatabaseCount;

    @Nullable
    public final Boolean nativeCrashReporting;

    @Nullable
    public final PreloadInfo preloadInfo;

    @Nullable
    public final Boolean revenueAutoTrackingEnabled;

    @Nullable
    public final Integer sessionTimeout;

    @Nullable
    public final Boolean sessionsAutoTrackingEnabled;

    @Nullable
    public final String userProfileID;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {
        private static final Fn D = new Fn(new C5084h0());
        private Integer A;
        private List B;
        private final HashMap C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C5267o5 f94917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f94918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f94919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f94920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f94921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Boolean f94922f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Location f94923g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Boolean f94924h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Boolean f94925i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Boolean f94926j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private PreloadInfo f94927k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Boolean f94928l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Boolean f94929m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f94930n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final LinkedHashMap f94931o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f94932p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Boolean f94933q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Boolean f94934r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Boolean f94935s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f94936t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Integer f94937u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Integer f94938v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Integer f94939w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final LinkedHashMap f94940x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ICrashTransformer f94941y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Boolean f94942z;

        public /* synthetic */ Builder(String str, int i10) {
            this(str);
        }

        @NonNull
        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        @NonNull
        public Builder handleFirstActivationAsUpdate(boolean z10) {
            this.f94928l = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, @Nullable Object obj) {
            this.C.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAdvIdentifiersTracking(boolean z10) {
            this.f94925i = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoring(boolean z10) {
            this.f94942z = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoringTimeout(int i10) {
            this.A = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withAppBuildNumber(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f94937u = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
            this.f94940x.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withAppOpenTrackingEnabled(boolean z10) {
            this.f94935s = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withAppVersion(@Nullable String str) {
            this.f94919c = str;
            return this;
        }

        @NonNull
        public Builder withCrashReporting(boolean z10) {
            this.f94921e = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withCrashTransformer(@Nullable ICrashTransformer iCrashTransformer) {
            this.f94941y = iCrashTransformer;
            return this;
        }

        @NonNull
        public Builder withCustomHosts(@NonNull List<String> list) {
            this.B = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z10) {
            this.f94929m = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withDeviceType(@Nullable String str) {
            this.f94936t = str;
            if (!PredefinedDeviceTypes.ALL_VALUES.contains(str)) {
                PublicLogger.getAnonymousInstance().info("PredefinedDeviceTypes does not contain value for `deviceType = %s`. It may cause events to not appear in AppMetrica reports.", str);
            }
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i10) {
            this.f94938v = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withErrorEnvironmentValue(@NonNull String str, @Nullable String str2) {
            this.f94931o.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withLocation(@Nullable Location location) {
            this.f94923g = location;
            return this;
        }

        @NonNull
        public Builder withLocationTracking(boolean z10) {
            this.f94924h = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f94926j = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i10) {
            this.f94939w = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i10) {
            this.f94930n = Integer.valueOf(this.f94917a.a(i10));
            return this;
        }

        @NonNull
        public Builder withNativeCrashReporting(boolean z10) {
            this.f94922f = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withPreloadInfo(@Nullable PreloadInfo preloadInfo) {
            this.f94927k = preloadInfo;
            return this;
        }

        @NonNull
        public Builder withRevenueAutoTrackingEnabled(boolean z10) {
            this.f94933q = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i10) {
            this.f94920d = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withSessionsAutoTrackingEnabled(boolean z10) {
            this.f94934r = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String str) {
            this.f94932p = str;
            return this;
        }

        private Builder(String str) {
            this.f94931o = new LinkedHashMap();
            this.f94940x = new LinkedHashMap();
            this.C = new HashMap();
            D.a(str);
            this.f94917a = new C5267o5(str);
            this.f94918b = str;
        }
    }

    public /* synthetic */ AppMetricaConfig(Builder builder, int i10) {
        this(builder);
    }

    @Nullable
    public static AppMetricaConfig fromJson(String str) {
        Builder builderA = new H3().a(str);
        if (builderA == null) {
            return null;
        }
        return builderA.build();
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }

    public String toJson() {
        String string;
        new D7();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apikey", this.apiKey);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put("session_timeout", this.sessionTimeout);
            jSONObject.put(FirebaseAnalytics.d.f52112s, H3.a(this.location));
            PreloadInfo preloadInfo = this.preloadInfo;
            JSONArray jSONArray = null;
            if (preloadInfo == null) {
                string = null;
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("trackid", preloadInfo.getTrackingId());
                    Map<String, String> additionalParams = preloadInfo.getAdditionalParams();
                    jSONObject2.put("params", additionalParams == null ? null : new JSONObject(additionalParams));
                    string = jSONObject2.toString();
                } catch (Throwable unused) {
                    string = null;
                }
            }
            jSONObject.put("preload_info", string);
            jSONObject.put("logs", this.logs);
            jSONObject.put("crash_enabled", this.crashReporting);
            jSONObject.put("crash_native_enabled", this.nativeCrashReporting);
            jSONObject.put("location_enabled", this.locationTracking);
            jSONObject.put("adv_identifiers_tracking", this.advIdentifiersTracking);
            jSONObject.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
            Map<String, String> map = this.errorEnvironment;
            jSONObject.put("error_environment", map == null ? null : new JSONObject(map));
            jSONObject.put("first_activation_as_update", this.firstActivationAsUpdate);
            jSONObject.put("data_sending_enabled", this.dataSendingEnabled);
            jSONObject.put("user_profile_id", this.userProfileID);
            jSONObject.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
            jSONObject.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
            jSONObject.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
            jSONObject.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
            jSONObject.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
            jSONObject.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
            jSONObject.put("max_reports_count", this.maxReportsCount);
            Map<String, String> map2 = this.appEnvironment;
            jSONObject.put("app_environment", map2 == null ? null : new JSONObject(map2));
            jSONObject.put("anr_monitoring", this.anrMonitoring);
            jSONObject.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
            List<String> list = this.customHosts;
            if (list != null) {
                if (!mo.a((Collection) list)) {
                    jSONArray = new JSONArray((Collection) list);
                }
                jSONObject.put("customHosts", jSONArray);
            }
            jSONObject.put("additional_config", new JSONObject());
            return jSONObject.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.f94918b;
        this.appVersion = builder.f94919c;
        this.sessionTimeout = builder.f94920d;
        this.crashReporting = builder.f94921e;
        this.nativeCrashReporting = builder.f94922f;
        this.location = builder.f94923g;
        this.locationTracking = builder.f94924h;
        this.advIdentifiersTracking = builder.f94925i;
        this.logs = builder.f94926j;
        this.preloadInfo = builder.f94927k;
        this.firstActivationAsUpdate = builder.f94928l;
        this.dataSendingEnabled = builder.f94929m;
        this.maxReportsInDatabaseCount = builder.f94930n;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f94931o);
        this.userProfileID = builder.f94932p;
        this.revenueAutoTrackingEnabled = builder.f94933q;
        this.sessionsAutoTrackingEnabled = builder.f94934r;
        this.appOpenTrackingEnabled = builder.f94935s;
        this.deviceType = builder.f94936t;
        this.appBuildNumber = builder.f94937u;
        this.dispatchPeriodSeconds = builder.f94938v;
        this.maxReportsCount = builder.f94939w;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f94940x);
        this.crashTransformer = builder.f94941y;
        this.anrMonitoring = builder.f94942z;
        this.anrMonitoringTimeout = builder.A;
        this.customHosts = builder.B;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.C);
    }

    public AppMetricaConfig(@NonNull AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.advIdentifiersTracking = appMetricaConfig.advIdentifiersTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }
}
