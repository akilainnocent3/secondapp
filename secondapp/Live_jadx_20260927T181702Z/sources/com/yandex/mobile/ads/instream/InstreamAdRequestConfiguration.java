package com.yandex.mobile.ads.instream;

import fr.n1;
import java.util.Map;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class InstreamAdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f76877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f76878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f76879c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f76880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f76881b = "0";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map f76882c;

        public Builder(@l String str) {
            this.f76880a = str;
        }

        @l
        public final InstreamAdRequestConfiguration build() {
            return new InstreamAdRequestConfiguration(this.f76881b, this.f76880a, this.f76882c, null);
        }

        @l
        public final Builder setCategoryId(@m String str) {
            if (str == null) {
                str = "0";
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("Passed categoryId is empty");
            }
            this.f76881b = str;
            return this;
        }

        @l
        public final Builder setParameters(@m Map<String, String> map) {
            if (map == null) {
                map = n1.z();
            }
            this.f76882c = map;
            return this;
        }
    }

    public /* synthetic */ InstreamAdRequestConfiguration(String str, String str2, Map map, x xVar) {
        this(str, str2, map);
    }

    @l
    public final String getCategoryId() {
        return this.f76877a;
    }

    @l
    public final String getPageId() {
        return this.f76878b;
    }

    @m
    public final Map<String, String> getParameters() {
        return this.f76879c;
    }

    private InstreamAdRequestConfiguration(String str, String str2, Map map) {
        this.f76877a = str;
        this.f76878b = str2;
        this.f76879c = map;
    }
}
