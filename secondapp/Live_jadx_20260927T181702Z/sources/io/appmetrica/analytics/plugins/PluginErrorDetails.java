package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class PluginErrorDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f98961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f98962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f98963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f98964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f98965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f98966f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f98967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f98968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f98969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f98970d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f98971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f98972f;

        @NonNull
        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f98967a, this.f98968b, (List) WrapUtils.getOrDefault(this.f98969c, new ArrayList()), this.f98970d, this.f98971e, (Map) WrapUtils.getOrDefault(this.f98972f, new HashMap()), 0);
        }

        @NonNull
        public Builder withExceptionClass(@Nullable String str) {
            this.f98967a = str;
            return this;
        }

        @NonNull
        public Builder withMessage(@Nullable String str) {
            this.f98968b = str;
            return this;
        }

        @NonNull
        public Builder withPlatform(@Nullable String str) {
            this.f98970d = str;
            return this;
        }

        @NonNull
        public Builder withPluginEnvironment(@Nullable Map<String, String> map) {
            this.f98972f = map;
            return this;
        }

        @NonNull
        public Builder withStacktrace(@Nullable List<StackTraceItem> list) {
            this.f98969c = list;
            return this;
        }

        @NonNull
        public Builder withVirtualMachineVersion(@Nullable String str) {
            this.f98971e = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i10) {
        this(str, str2, list, str3, str4, map);
    }

    @Nullable
    public String getExceptionClass() {
        return this.f98961a;
    }

    @Nullable
    public String getMessage() {
        return this.f98962b;
    }

    @Nullable
    public String getPlatform() {
        return this.f98964d;
    }

    @NonNull
    public Map<String, String> getPluginEnvironment() {
        return this.f98966f;
    }

    @NonNull
    public List<StackTraceItem> getStacktrace() {
        return this.f98963c;
    }

    @Nullable
    public String getVirtualMachineVersion() {
        return this.f98965e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f98961a = str;
        this.f98962b = str2;
        this.f98963c = new ArrayList(list);
        this.f98964d = str3;
        this.f98965e = str4;
        this.f98966f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
