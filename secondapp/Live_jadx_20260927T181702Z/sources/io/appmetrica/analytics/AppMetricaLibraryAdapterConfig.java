package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fw.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class AppMetricaLibraryAdapterConfig {

    @Nullable
    public final Boolean advIdentifiersTracking;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f94944a;

        @NonNull
        public AppMetricaLibraryAdapterConfig build() {
            return new AppMetricaLibraryAdapterConfig(this, 0);
        }

        @NonNull
        public Builder withAdvIdentifiersTracking(boolean z10) {
            this.f94944a = Boolean.valueOf(z10);
            return this;
        }
    }

    public /* synthetic */ AppMetricaLibraryAdapterConfig(Builder builder, int i10) {
        this(builder);
    }

    public static Builder newConfigBuilder() {
        return new Builder();
    }

    @NonNull
    public String toString() {
        return "AppMetricaLibraryAdapterConfig{advIdentifiersTracking=" + this.advIdentifiersTracking + b.f85383j;
    }

    private AppMetricaLibraryAdapterConfig(Builder builder) {
        this.advIdentifiersTracking = builder.f94944a;
    }
}
