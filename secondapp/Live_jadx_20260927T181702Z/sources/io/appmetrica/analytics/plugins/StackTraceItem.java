package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class StackTraceItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f98973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f98974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f98975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f98976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f98977e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f98978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f98979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f98980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f98981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f98982e;

        @NonNull
        public StackTraceItem build() {
            return new StackTraceItem(this.f98978a, this.f98979b, this.f98980c, this.f98981d, this.f98982e, 0);
        }

        @NonNull
        public Builder withClassName(@Nullable String str) {
            this.f98978a = str;
            return this;
        }

        @NonNull
        public Builder withColumn(@Nullable Integer num) {
            this.f98981d = num;
            return this;
        }

        @NonNull
        public Builder withFileName(@Nullable String str) {
            this.f98979b = str;
            return this;
        }

        @NonNull
        public Builder withLine(@Nullable Integer num) {
            this.f98980c = num;
            return this;
        }

        @NonNull
        public Builder withMethodName(@Nullable String str) {
            this.f98982e = str;
            return this;
        }
    }

    public /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i10) {
        this(str, str2, num, num2, str3);
    }

    @Nullable
    public String getClassName() {
        return this.f98973a;
    }

    @Nullable
    public Integer getColumn() {
        return this.f98976d;
    }

    @Nullable
    public String getFileName() {
        return this.f98974b;
    }

    @Nullable
    public Integer getLine() {
        return this.f98975c;
    }

    @Nullable
    public String getMethodName() {
        return this.f98977e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f98973a = str;
        this.f98974b = str2;
        this.f98975c = num;
        this.f98976d = num2;
        this.f98977e = str3;
    }
}
