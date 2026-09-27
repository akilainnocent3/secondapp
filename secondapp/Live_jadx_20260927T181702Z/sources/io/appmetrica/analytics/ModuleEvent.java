package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fw.b;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class ModuleEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f94949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f94950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f94951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f94952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Category f94953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f94954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f94955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f94956h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f94957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f94958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f94959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f94960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Category f94961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private HashMap f94962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private HashMap f94963g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private HashMap f94964h;

        public /* synthetic */ Builder(int i10, int i11) {
            this(i10);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(@Nullable Map<String, Object> map) {
            if (map != null) {
                this.f94964h = new HashMap(map);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.f94961e = category;
            return this;
        }

        public Builder withEnvironment(@Nullable Map<String, Object> map) {
            if (map != null) {
                this.f94962f = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(@Nullable Map<String, byte[]> map) {
            if (map != null) {
                this.f94963g = new HashMap(map);
            }
            return this;
        }

        public Builder withName(@Nullable String str) {
            this.f94958b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i10) {
            this.f94960d = i10;
            return this;
        }

        public Builder withValue(@Nullable String str) {
            this.f94959c = str;
            return this;
        }

        private Builder(int i10) {
            this.f94960d = 1;
            this.f94961e = Category.GENERAL;
            this.f94957a = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Category {
        GENERAL,
        SYSTEM
    }

    public /* synthetic */ ModuleEvent(Builder builder, int i10) {
        this(builder);
    }

    public static Builder newBuilder(int i10) {
        return new Builder(i10, 0);
    }

    @Nullable
    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f94956h);
    }

    public Category getCategory() {
        return this.f94953e;
    }

    @Nullable
    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f94954f);
    }

    @Nullable
    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f94955g);
    }

    @Nullable
    public String getName() {
        return this.f94950b;
    }

    public int getServiceDataReporterType() {
        return this.f94952d;
    }

    public int getType() {
        return this.f94949a;
    }

    @Nullable
    public String getValue() {
        return this.f94951c;
    }

    @NonNull
    public String toString() {
        return "ModuleEvent{type=" + this.f94949a + ", name='" + this.f94950b + "', value='" + this.f94951c + "', serviceDataReporterType=" + this.f94952d + ", category=" + this.f94953e + ", environment=" + this.f94954f + ", extras=" + this.f94955g + ", attributes=" + this.f94956h + b.f85383j;
    }

    private ModuleEvent(Builder builder) {
        this.f94949a = builder.f94957a;
        this.f94950b = builder.f94958b;
        this.f94951c = builder.f94959c;
        this.f94952d = builder.f94960d;
        this.f94953e = builder.f94961e;
        this.f94954f = CollectionUtils.getListFromMap(builder.f94962f);
        this.f94955g = CollectionUtils.getListFromMap(builder.f94963g);
        this.f94956h = CollectionUtils.getListFromMap(builder.f94964h);
    }
}
