package com.yandex.mobile.ads.instream.newapi.adbreak;

import com.yandex.mobile.ads.instream.newapi.InstreamExperimentalApi;
import java.util.Map;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@InstreamExperimentalApi
public final class InstreamAdBreakRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f76897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f76898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f76899c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f76900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f76901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map f76902c;

        public Builder(@l String str, @l String str2) {
            this.f76900a = str;
            this.f76901b = str2;
        }

        @l
        public final InstreamAdBreakRequestConfiguration build() {
            return new InstreamAdBreakRequestConfiguration(this.f76900a, this.f76901b, this.f76902c, null);
        }

        @l
        public final Builder setParameters(@m Map<String, String> map) {
            this.f76902c = map;
            return this;
        }
    }

    public /* synthetic */ InstreamAdBreakRequestConfiguration(String str, String str2, Map map, x xVar) {
        this(str, str2, map);
    }

    @l
    public final String getImpId() {
        return this.f76898b;
    }

    @l
    public final String getPageId() {
        return this.f76897a;
    }

    @m
    public final Map<String, String> getParameters() {
        return this.f76899c;
    }

    private InstreamAdBreakRequestConfiguration(String str, String str2, Map map) {
        this.f76897a = str;
        this.f76898b = str2;
        this.f76899c = map;
    }
}
