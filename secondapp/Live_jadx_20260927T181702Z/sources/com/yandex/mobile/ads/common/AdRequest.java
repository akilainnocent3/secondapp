package com.yandex.mobile.ads.common;

import android.location.Location;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class AdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f76767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f76768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Location f76769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f76770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f76771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f76772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f76773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AdTheme f76774h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f76775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f76776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Location f76777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f76778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f76779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f76780f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f76781g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private AdTheme f76782h;

        @l
        public final AdRequest build() {
            return new AdRequest(this.f76775a, this.f76776b, this.f76777c, this.f76778d, this.f76779e, this.f76780f, this.f76781g, this.f76782h, null);
        }

        @l
        public final Builder setAge(@m String str) {
            this.f76775a = str;
            return this;
        }

        @l
        public final Builder setBiddingData(@m String str) {
            this.f76781g = str;
            return this;
        }

        @l
        public final Builder setContextQuery(@m String str) {
            this.f76778d = str;
            return this;
        }

        @l
        public final Builder setContextTags(@m List<String> list) {
            this.f76779e = list;
            return this;
        }

        @l
        public final Builder setGender(@m String str) {
            this.f76776b = str;
            return this;
        }

        @l
        public final Builder setLocation(@m Location location) {
            this.f76777c = location;
            return this;
        }

        @l
        public final Builder setParameters(@m Map<String, String> map) {
            this.f76780f = map;
            return this;
        }

        @l
        public final Builder setPreferredTheme(@m AdTheme adTheme) {
            this.f76782h = adTheme;
            return this;
        }
    }

    public /* synthetic */ AdRequest(String str, String str2, Location location, String str3, List list, Map map, String str4, AdTheme adTheme, x xVar) {
        this(str, str2, str3, str4, list, location, map, adTheme);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.g(AdRequest.class, obj.getClass())) {
            AdRequest adRequest = (AdRequest) obj;
            if (m0.g(this.f76767a, adRequest.f76767a) && m0.g(this.f76768b, adRequest.f76768b) && m0.g(this.f76770d, adRequest.f76770d) && m0.g(this.f76771e, adRequest.f76771e) && m0.g(this.f76769c, adRequest.f76769c) && m0.g(this.f76772f, adRequest.f76772f) && m0.g(this.f76773g, adRequest.f76773g) && this.f76774h == adRequest.f76774h) {
                return true;
            }
        }
        return false;
    }

    @m
    public final String getAge() {
        return this.f76767a;
    }

    @m
    public final String getBiddingData() {
        return this.f76773g;
    }

    @m
    public final String getContextQuery() {
        return this.f76770d;
    }

    @m
    public final List<String> getContextTags() {
        return this.f76771e;
    }

    @m
    public final String getGender() {
        return this.f76768b;
    }

    @m
    public final Location getLocation() {
        return this.f76769c;
    }

    @m
    public final Map<String, String> getParameters() {
        return this.f76772f;
    }

    @m
    public final AdTheme getPreferredTheme() {
        return this.f76774h;
    }

    public int hashCode() {
        String str = this.f76767a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f76768b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f76770d;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list = this.f76771e;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f76769c;
        int iHashCode5 = (iHashCode4 + (location != null ? location.hashCode() : 0)) * 31;
        Map map = this.f76772f;
        int iHashCode6 = (iHashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f76773g;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f76774h;
        return iHashCode7 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    private AdRequest(String str, String str2, String str3, String str4, List list, Location location, Map map, AdTheme adTheme) {
        this.f76767a = str;
        this.f76768b = str2;
        this.f76769c = location;
        this.f76770d = str3;
        this.f76771e = list;
        this.f76772f = map;
        this.f76773g = str4;
        this.f76774h = adTheme;
    }
}
