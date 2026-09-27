package com.yandex.mobile.ads.nativeads;

import android.location.Location;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class NativeAdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f76916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f76917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f76918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f76919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f76920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Location f76921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f76922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f76923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AdTheme f76924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f76925j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f76926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f76927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f76928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f76929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f76930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f76931f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f76932g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f76933h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private AdTheme f76934i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f76935j = true;

        public Builder(@l String str) {
            this.f76926a = str;
        }

        @l
        public final NativeAdRequestConfiguration build() {
            return new NativeAdRequestConfiguration(this.f76926a, this.f76927b, this.f76928c, this.f76930e, this.f76931f, this.f76929d, this.f76932g, this.f76933h, this.f76934i, this.f76935j, null);
        }

        @l
        public final Builder setAge(@l String str) {
            this.f76927b = str;
            return this;
        }

        @l
        public final Builder setBiddingData(@l String str) {
            this.f76933h = str;
            return this;
        }

        @l
        public final Builder setContextQuery(@l String str) {
            this.f76930e = str;
            return this;
        }

        @l
        public final Builder setContextTags(@l List<String> list) {
            this.f76931f = list;
            return this;
        }

        @l
        public final Builder setGender(@l String str) {
            this.f76928c = str;
            return this;
        }

        @l
        public final Builder setLocation(@l Location location) {
            this.f76929d = location;
            return this;
        }

        @l
        public final Builder setParameters(@l Map<String, String> map) {
            this.f76932g = map;
            return this;
        }

        @l
        public final Builder setPreferredTheme(@l AdTheme adTheme) {
            this.f76934i = adTheme;
            return this;
        }

        @l
        public final Builder setShouldLoadImagesAutomatically(boolean z10) {
            this.f76935j = z10;
            return this;
        }
    }

    public /* synthetic */ NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z10, x xVar) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme, z10);
    }

    @l
    public final String getAdUnitId() {
        return this.f76916a;
    }

    @m
    public final String getAge() {
        return this.f76917b;
    }

    @m
    public final String getBiddingData() {
        return this.f76923h;
    }

    @m
    public final String getContextQuery() {
        return this.f76919d;
    }

    @m
    public final List<String> getContextTags() {
        return this.f76920e;
    }

    @m
    public final String getGender() {
        return this.f76918c;
    }

    @m
    public final Location getLocation() {
        return this.f76921f;
    }

    @m
    public final Map<String, String> getParameters() {
        return this.f76922g;
    }

    @m
    public final AdTheme getPreferredTheme() {
        return this.f76924i;
    }

    public final boolean getShouldLoadImagesAutomatically() {
        return this.f76925j;
    }

    private NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z10) {
        this.f76916a = str;
        this.f76917b = str2;
        this.f76918c = str3;
        this.f76919d = str4;
        this.f76920e = list;
        this.f76921f = location;
        this.f76922g = map;
        this.f76923h = str5;
        this.f76924i = adTheme;
        this.f76925j = z10;
    }
}
