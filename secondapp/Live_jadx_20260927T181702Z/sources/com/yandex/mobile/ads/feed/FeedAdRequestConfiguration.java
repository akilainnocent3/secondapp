package com.yandex.mobile.ads.feed;

import android.location.Location;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class FeedAdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f76855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f76856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f76857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f76858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f76859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Location f76860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f76861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AdTheme f76862h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f76863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f76864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f76865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f76866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f76867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Location f76868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f76869g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private AdTheme f76870h;

        public Builder(@l String str) {
            this.f76863a = str;
        }

        @l
        public final FeedAdRequestConfiguration build() {
            return new FeedAdRequestConfiguration(this.f76863a, this.f76864b, this.f76865c, this.f76866d, this.f76867e, this.f76868f, this.f76869g, this.f76870h);
        }

        @l
        public final Builder setAge(@m String str) {
            this.f76864b = str;
            return this;
        }

        @l
        public final Builder setContextQuery(@m String str) {
            this.f76866d = str;
            return this;
        }

        @l
        public final Builder setContextTags(@m List<String> list) {
            this.f76867e = list;
            return this;
        }

        @l
        public final Builder setGender(@m String str) {
            this.f76865c = str;
            return this;
        }

        @l
        public final Builder setLocation(@m Location location) {
            this.f76868f = location;
            return this;
        }

        @l
        public final Builder setParameters(@m Map<String, String> map) {
            this.f76869g = map;
            return this;
        }

        @l
        public final Builder setPreferredTheme(@m AdTheme adTheme) {
            this.f76870h = adTheme;
            return this;
        }
    }

    public FeedAdRequestConfiguration(@l String str, @m String str2, @m String str3, @m String str4, @m List<String> list, @m Location location, @m Map<String, String> map, @m AdTheme adTheme) {
        this.f76855a = str;
        this.f76856b = str2;
        this.f76857c = str3;
        this.f76858d = str4;
        this.f76859e = list;
        this.f76860f = location;
        this.f76861g = map;
        this.f76862h = adTheme;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m0.g(FeedAdRequestConfiguration.class, obj.getClass())) {
            return false;
        }
        FeedAdRequestConfiguration feedAdRequestConfiguration = (FeedAdRequestConfiguration) obj;
        return m0.g(this.f76855a, feedAdRequestConfiguration.f76855a) && m0.g(this.f76856b, feedAdRequestConfiguration.f76856b) && m0.g(this.f76857c, feedAdRequestConfiguration.f76857c) && m0.g(this.f76858d, feedAdRequestConfiguration.f76858d) && m0.g(this.f76859e, feedAdRequestConfiguration.f76859e) && m0.g(this.f76860f, feedAdRequestConfiguration.f76860f) && m0.g(this.f76861g, feedAdRequestConfiguration.f76861g) && this.f76862h == feedAdRequestConfiguration.f76862h;
    }

    @l
    public final String getAdUnitId() {
        return this.f76855a;
    }

    @m
    public final String getAge() {
        return this.f76856b;
    }

    @m
    public final String getContextQuery() {
        return this.f76858d;
    }

    @m
    public final List<String> getContextTags() {
        return this.f76859e;
    }

    @m
    public final String getGender() {
        return this.f76857c;
    }

    @m
    public final Location getLocation() {
        return this.f76860f;
    }

    @m
    public final Map<String, String> getParameters() {
        return this.f76861g;
    }

    @m
    public final AdTheme getPreferredTheme() {
        return this.f76862h;
    }

    public int hashCode() {
        int iHashCode = this.f76855a.hashCode() * 31;
        String str = this.f76856b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f76857c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f76858d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list = this.f76859e;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f76860f;
        int iHashCode6 = (iHashCode5 + (location != null ? location.hashCode() : 0)) * 31;
        Map map = this.f76861g;
        int iHashCode7 = (iHashCode6 + (map != null ? map.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f76862h;
        return iHashCode7 + (adTheme != null ? adTheme.hashCode() : 0);
    }
}
