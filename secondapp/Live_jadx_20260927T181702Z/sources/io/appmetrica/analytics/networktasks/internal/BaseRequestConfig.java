package io.appmetrica.analytics.networktasks.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fw.b;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class BaseRequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f98906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SdkEnvironment f98907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SdkIdentifiers f98908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppSetId f98909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RetryPolicyConfig f98910e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class BaseRequestArguments<I, O> implements ArgumentsMerger<I, O> {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class ComponentLoader<T extends BaseRequestConfig, A extends BaseRequestArguments, D extends DataSource<A>> implements RequestConfigLoader<T, D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f98911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f98912b;

        public ComponentLoader(@NonNull Context context, @NonNull String str) {
            this.f98911a = context;
            this.f98912b = str;
        }

        @NonNull
        public abstract T createBlankConfig();

        @NonNull
        public Context getContext() {
            return this.f98911a;
        }

        @NonNull
        public String getPackageName() {
            return this.f98912b;
        }

        @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
        @NonNull
        public T load(@NonNull D d10) {
            T t10 = (T) createBlankConfig();
            t10.setSdkIdentifiers(d10.sdkIdentifiers);
            t10.setSdkEnvironment(d10.sdkEnvironmentProvider.getSdkEnvironment());
            t10.setAppSetId(d10.platformIdentifiers.getAppSetIdProvider().getAppSetId());
            t10.setPackageName(this.f98912b);
            return t10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class DataSource<A> {

        @NonNull
        public final A componentArguments;

        @NonNull
        public final PlatformIdentifiers platformIdentifiers;

        @NonNull
        public final SdkEnvironmentProvider sdkEnvironmentProvider;

        @NonNull
        public final SdkIdentifiers sdkIdentifiers;

        public DataSource(@NonNull SdkIdentifiers sdkIdentifiers, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, @NonNull A a10) {
            this.sdkIdentifiers = sdkIdentifiers;
            this.componentArguments = a10;
            this.sdkEnvironmentProvider = sdkEnvironmentProvider;
            this.platformIdentifiers = platformIdentifiers;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface RequestConfigLoader<T extends BaseRequestConfig, D> {
        @NonNull
        T load(D d10);
    }

    public String getAnalyticsSdkBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f98907b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildNumber();
    }

    @NonNull
    public String getAnalyticsSdkBuildType() {
        SdkEnvironment sdkEnvironment = this.f98907b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildType();
    }

    public String getAnalyticsSdkVersionName() {
        SdkEnvironment sdkEnvironment = this.f98907b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkVersionName();
    }

    public String getAppBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f98907b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppBuildNumber();
    }

    @NonNull
    public String getAppFramework() {
        SdkEnvironment sdkEnvironment = this.f98907b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppFramework();
    }

    public String getAppPlatform() {
        return "android";
    }

    @NonNull
    public synchronized String getAppSetId() {
        AppSetId appSetId;
        try {
            appSetId = this.f98909d;
        } catch (Throwable th2) {
            throw th2;
        }
        return (appSetId == null || appSetId.getId() == null) ? "" : this.f98909d.getId();
    }

    @NonNull
    public synchronized String getAppSetIdScope() {
        AppSetId appSetId;
        try {
            appSetId = this.f98909d;
        } catch (Throwable th2) {
            throw th2;
        }
        return appSetId == null ? "" : appSetId.getScope().getValue();
    }

    public String getAppVersion() {
        SdkEnvironment sdkEnvironment = this.f98907b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppVersionName();
    }

    @NonNull
    public synchronized String getDeviceIDHash() {
        String deviceIdHash;
        deviceIdHash = "";
        SdkIdentifiers sdkIdentifiers = this.f98908c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceIdHash() != null) {
            deviceIdHash = this.f98908c.getDeviceIdHash();
        }
        return deviceIdHash;
    }

    @NonNull
    public synchronized String getDeviceId() {
        String deviceId;
        deviceId = "";
        SdkIdentifiers sdkIdentifiers = this.f98908c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceId() != null) {
            deviceId = this.f98908c.getDeviceId();
        }
        return deviceId;
    }

    @NonNull
    public String getDeviceRootStatus() {
        return ConstantDeviceInfo.DEVICE_ROOT_STATUS;
    }

    @NonNull
    public String getDeviceType() {
        SdkEnvironment sdkEnvironment = this.f98907b;
        return sdkEnvironment != null ? sdkEnvironment.getDeviceType() : "phone";
    }

    @NonNull
    public String getLocale() {
        String str;
        SdkEnvironment sdkEnvironment = this.f98907b;
        return (sdkEnvironment == null || (str = (String) CollectionUtils.getFirstOrNull(sdkEnvironment.getLocales())) == null) ? "" : str;
    }

    @NonNull
    public String getManufacturer() {
        return (String) WrapUtils.getOrDefault(ConstantDeviceInfo.MANUFACTURER, "");
    }

    @NonNull
    public String getModel() {
        return ConstantDeviceInfo.MODEL;
    }

    public int getOsApiLevel() {
        return ConstantDeviceInfo.OS_API_LEVEL;
    }

    @NonNull
    public String getOsVersion() {
        return ConstantDeviceInfo.OS_VERSION;
    }

    public String getPackageName() {
        return this.f98906a;
    }

    public String getProtocolVersion() {
        return "2";
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f98910e;
    }

    public float getScaleFactor() {
        SdkEnvironment sdkEnvironment = this.f98907b;
        if (sdkEnvironment == null) {
            return 0.0f;
        }
        return sdkEnvironment.getScreenInfo().getScaleFactor();
    }

    public int getScreenDpi() {
        SdkEnvironment sdkEnvironment = this.f98907b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getDpi();
    }

    public int getScreenHeight() {
        SdkEnvironment sdkEnvironment = this.f98907b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getHeight();
    }

    public int getScreenWidth() {
        SdkEnvironment sdkEnvironment = this.f98907b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getWidth();
    }

    @NonNull
    public synchronized String getUuid() {
        String uuid;
        uuid = "";
        SdkIdentifiers sdkIdentifiers = this.f98908c;
        if (sdkIdentifiers != null && sdkIdentifiers.getUuid() != null) {
            uuid = this.f98908c.getUuid();
        }
        return uuid;
    }

    public synchronized boolean isIdentifiersValid() {
        SdkIdentifiers sdkIdentifiers;
        String uuid;
        String deviceId;
        String deviceIdHash;
        sdkIdentifiers = this.f98908c;
        return (sdkIdentifiers == null || (uuid = sdkIdentifiers.getUuid()) == null || uuid.length() == 0 || (deviceId = sdkIdentifiers.getDeviceId()) == null || deviceId.length() == 0 || (deviceIdHash = sdkIdentifiers.getDeviceIdHash()) == null || deviceIdHash.length() == 0) ? false : true;
    }

    public void setAppSetId(@NonNull AppSetId appSetId) {
        this.f98909d = appSetId;
    }

    public void setPackageName(String str) {
        this.f98906a = str;
    }

    public void setRetryPolicyConfig(RetryPolicyConfig retryPolicyConfig) {
        this.f98910e = retryPolicyConfig;
    }

    public void setSdkEnvironment(@NonNull SdkEnvironment sdkEnvironment) {
        this.f98907b = sdkEnvironment;
    }

    public void setSdkIdentifiers(@Nullable SdkIdentifiers sdkIdentifiers) {
        this.f98908c = sdkIdentifiers;
    }

    public String toString() {
        return "BaseRequestConfig{mPackageName='" + this.f98906a + "', sdkEnvironment=" + this.f98907b + ", mProtocolVersion='2', sdkIdentifiers=" + this.f98908c + ", retryPolicyConfig=" + this.f98910e + b.f85383j;
    }
}
