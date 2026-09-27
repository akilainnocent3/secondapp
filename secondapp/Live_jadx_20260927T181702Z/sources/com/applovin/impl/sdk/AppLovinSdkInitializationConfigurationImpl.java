package com.applovin.impl.sdk;

import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class AppLovinSdkInitializationConfigurationImpl extends AppLovinSdkInitializationConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MaxSegmentCollection f28666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f28667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f28668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f28669h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class BuilderImpl implements AppLovinSdkInitializationConfiguration.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f28670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f28671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f28672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f28673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private MaxSegmentCollection f28674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f28675f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f28676g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f28677h;

        public BuilderImpl(String str, @Nullable String str2) {
            List list = Collections.EMPTY_LIST;
            this.f28675f = list;
            this.f28676g = list;
            this.f28677h = true;
            this.f28670a = str;
            this.f28671b = str2;
            p.e("AppLovinSdkInitializationConfiguration", "Initializing with key: " + str);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration build() {
            return new AppLovinSdkInitializationConfigurationImpl(this);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getAdUnitIds() {
            return this.f28676g;
        }

        @Nullable
        public String getAxonEventKey() {
            return this.f28671b;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public String getMediationProvider() {
            return this.f28672c;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public String getPluginVersion() {
            return this.f28673d;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getSdkKey() {
            return this.f28670a;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public MaxSegmentCollection getSegmentCollection() {
            return this.f28674e;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getTestDeviceAdvertisingIds() {
            return this.f28675f;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public boolean isExceptionHandlerEnabled() {
            return this.f28677h;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setAdUnitIds(List<String> list) {
            p.e("AppLovinSdkInitializationConfiguration", "setAdUnitIds(adUnitIds=" + list + gi.j.f86771d);
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        p.h("AppLovinSdkInitializationConfiguration", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f28676g = arrayList;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setExceptionHandlerEnabled(boolean z10) {
            p.e("AppLovinSdkInitializationConfiguration", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z10 + gi.j.f86771d);
            this.f28677h = z10;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setMediationProvider(@Nullable String str) {
            p.e("AppLovinSdkInitializationConfiguration", "setMediationProvider(mediationProvider=" + str + gi.j.f86771d);
            if (str == null || (!str.isEmpty() && str.length() <= 64 && StringUtils.isAlphaNumeric(str))) {
                this.f28672c = str;
                return this;
            }
            p.h("AppLovinSdkInitializationConfiguration", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setPluginVersion(@Nullable String str) {
            p.e("AppLovinSdkInitializationConfiguration", "setPluginVersion(pluginVersion=" + str + gi.j.f86771d);
            this.f28673d = str;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setSdkKey(String str) {
            this.f28670a = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setSegmentCollection(MaxSegmentCollection maxSegmentCollection) {
            p.e("AppLovinSdkInitializationConfiguration", "setSegmentCollection(segmentCollection=" + maxSegmentCollection + gi.j.f86771d);
            this.f28674e = maxSegmentCollection;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setTestDeviceAdvertisingIds(List<String> list) {
            p.e("AppLovinSdkInitializationConfiguration", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + gi.j.f86771d);
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (str == null || str.length() != 36) {
                    p.h("AppLovinSdkInitializationConfiguration", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                } else {
                    arrayList.add(str);
                }
            }
            this.f28675f = arrayList;
            return this;
        }

        public String toString() {
            return "AppLovinSdkInitializationConfiguration.Builder{ sdkKey=" + this.f28670a + ", axonEventKey=" + this.f28671b + ", mediationProvider=" + this.f28672c + ", pluginVersion=" + this.f28673d + ", testDeviceAdvertisingIdentifiers=" + this.f28675f + ", adUnitIdentifiers=" + this.f28676g + ", isExceptionHandlerEnabled=" + this.f28677h + ", segmentCollection=" + this.f28674e + "}";
        }
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getAdUnitIds() {
        return this.f28668g;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getAxonEventKey() {
        return this.f28663b;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getMediationProvider() {
        return this.f28664c;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getPluginVersion() {
        return this.f28665d;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getSdkKey() {
        return this.f28662a;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public MaxSegmentCollection getSegmentCollection() {
        return this.f28666e;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getTestDeviceAdvertisingIds() {
        return this.f28667f;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public boolean isExceptionHandlerEnabled() {
        return this.f28669h;
    }

    public String toString() {
        return "AppLovinSdkInitializationConfiguration{ sdkKey=" + this.f28662a + ", axonEventKey=" + this.f28663b + ", mediationProvider=" + this.f28664c + ", pluginVersion=" + this.f28665d + ", testDeviceAdvertisingIds=" + this.f28667f + ", adUnitIdentifiers=" + this.f28668g + ", isExceptionHandlerEnabled=" + this.f28669h + ", segmentCollection=" + this.f28666e + "}";
    }

    private AppLovinSdkInitializationConfigurationImpl(BuilderImpl builderImpl) {
        this.f28662a = builderImpl.f28670a;
        this.f28663b = builderImpl.f28671b;
        this.f28664c = builderImpl.f28672c;
        this.f28665d = builderImpl.f28673d;
        this.f28666e = builderImpl.f28674e;
        this.f28667f = builderImpl.f28675f;
        this.f28668g = builderImpl.f28676g;
        this.f28669h = builderImpl.f28677h;
    }
}
