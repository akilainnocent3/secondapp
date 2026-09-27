package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class PreloadInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f94968b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f94969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f94970b;

        public /* synthetic */ Builder(String str, int i10) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f94970b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f94969a = str;
            this.f94970b = new HashMap();
        }
    }

    public /* synthetic */ PreloadInfo(Builder builder, int i10) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f94968b;
    }

    public String getTrackingId() {
        return this.f94967a;
    }

    private PreloadInfo(Builder builder) {
        this.f94967a = builder.f94969a;
        this.f94968b = CollectionUtils.unmodifiableMapCopy(builder.f94970b);
    }
}
