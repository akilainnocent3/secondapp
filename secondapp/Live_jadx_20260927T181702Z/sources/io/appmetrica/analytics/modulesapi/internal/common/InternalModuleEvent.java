package io.appmetrica.analytics.modulesapi.internal.common;

import cs.o;
import fw.b;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class InternalModuleEvent {

    @l
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f98832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f98833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f98834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f98835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Category f98836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f98837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f98838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f98839h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f98840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f98841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f98842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f98843d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Category f98844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f98845f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f98846g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map f98847h;

        public Builder(int i10) {
            this.f98840a = i10;
        }

        @l
        public InternalModuleEvent build() {
            return new InternalModuleEvent(this, null);
        }

        @m
        public final Map<String, Object> getAttributes() {
            return this.f98847h;
        }

        @m
        public final Category getCategory() {
            return this.f98844e;
        }

        @m
        public final Map<String, Object> getEnvironment() {
            return this.f98845f;
        }

        @m
        public final Map<String, byte[]> getExtras() {
            return this.f98846g;
        }

        @m
        public final String getName() {
            return this.f98841b;
        }

        @m
        public final Integer getServiceDataReporterType() {
            return this.f98843d;
        }

        public final int getType$modules_api_release() {
            return this.f98840a;
        }

        @m
        public final String getValue() {
            return this.f98842c;
        }

        public final void setAttributes(@m Map<String, ? extends Object> map) {
            this.f98847h = map;
        }

        public final void setCategory(@m Category category) {
            this.f98844e = category;
        }

        public final void setEnvironment(@m Map<String, ? extends Object> map) {
            this.f98845f = map;
        }

        public final void setExtras(@m Map<String, byte[]> map) {
            this.f98846g = map;
        }

        public final void setName(@m String str) {
            this.f98841b = str;
        }

        public final void setServiceDataReporterType(@m Integer num) {
            this.f98843d = num;
        }

        public final void setValue(@m String str) {
            this.f98842c = str;
        }

        @l
        public final Builder withAttributes(@m Map<String, ? extends Object> map) {
            if (map != null) {
                this.f98847h = new HashMap(map);
            }
            return this;
        }

        @l
        public final Builder withCategory(@l Category category) {
            this.f98844e = category;
            return this;
        }

        @l
        public final Builder withEnvironment(@m Map<String, ? extends Object> map) {
            if (map != null) {
                this.f98845f = new HashMap(map);
            }
            return this;
        }

        @l
        public final Builder withExtras(@m Map<String, byte[]> map) {
            if (map != null) {
                this.f98846g = new HashMap(map);
            }
            return this;
        }

        @l
        public final Builder withName(@m String str) {
            this.f98841b = str;
            return this;
        }

        @l
        public final Builder withServiceDataReporterType(int i10) {
            this.f98843d = Integer.valueOf(i10);
            return this;
        }

        @l
        public final Builder withValue(@m String str) {
            this.f98842c = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Category {
        GENERAL,
        SYSTEM
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        @o
        public final Builder newBuilder(int i10) {
            return new Builder(i10);
        }

        private Companion() {
        }
    }

    public /* synthetic */ InternalModuleEvent(Builder builder, x xVar) {
        this(builder);
    }

    @l
    @o
    public static final Builder newBuilder(int i10) {
        return Companion.newBuilder(i10);
    }

    @m
    public final Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f98839h);
    }

    @m
    public final Category getCategory() {
        return this.f98836e;
    }

    @m
    public final Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f98837f);
    }

    @m
    public final Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f98838g);
    }

    @m
    public final String getName() {
        return this.f98833b;
    }

    @m
    public final Integer getServiceDataReporterType() {
        return this.f98835d;
    }

    public final int getType() {
        return this.f98832a;
    }

    @m
    public final String getValue() {
        return this.f98834c;
    }

    @l
    public String toString() {
        return "ModuleEvent{type=" + this.f98832a + ", name='" + this.f98833b + "', value='" + this.f98834c + "', serviceDataReporterType=" + this.f98835d + ", category=" + this.f98836e + ", environment=" + this.f98837f + ", extras=" + this.f98838g + ", attributes=" + this.f98839h + b.f85383j;
    }

    private InternalModuleEvent(Builder builder) {
        this.f98832a = builder.getType$modules_api_release();
        this.f98833b = builder.getName();
        this.f98834c = builder.getValue();
        this.f98835d = builder.getServiceDataReporterType();
        this.f98836e = builder.getCategory();
        this.f98837f = CollectionUtils.getListFromMap(builder.getEnvironment());
        this.f98838g = CollectionUtils.getListFromMap(builder.getExtras());
        this.f98839h = CollectionUtils.getListFromMap(builder.getAttributes());
    }
}
