package com.yandex.mobile.ads.common;

import android.location.Location;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import yads.k4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class AdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f76783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f76784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f76785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f76786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f76787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Location f76788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f76789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f76790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AdTheme f76791i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f76792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f76793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f76794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f76795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f76796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f76797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f76798g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f76799h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private AdTheme f76800i;

        public Builder(@l String str) {
            this.f76792a = str;
        }

        @l
        public final AdRequestConfiguration build() {
            return new AdRequestConfiguration(this.f76792a, this.f76793b, this.f76794c, this.f76796e, this.f76797f, this.f76795d, this.f76798g, this.f76799h, this.f76800i, null);
        }

        @l
        public final Builder setAge(@m String str) {
            this.f76793b = str;
            return this;
        }

        @l
        public final Builder setBiddingData(@m String str) {
            this.f76799h = str;
            return this;
        }

        @l
        public final Builder setContextQuery(@m String str) {
            this.f76796e = str;
            return this;
        }

        @l
        public final Builder setContextTags(@m List<String> list) {
            this.f76797f = list;
            return this;
        }

        @l
        public final Builder setGender(@m String str) {
            this.f76794c = str;
            return this;
        }

        @l
        public final Builder setLocation(@m Location location) {
            this.f76795d = location;
            return this;
        }

        @l
        public final Builder setParameters(@m Map<String, String> map) {
            this.f76798g = map;
            return this;
        }

        @l
        public final Builder setPreferredTheme(@m AdTheme adTheme) {
            this.f76800i = adTheme;
            return this;
        }
    }

    public /* synthetic */ AdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, x xVar) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.g(AdRequestConfiguration.class, obj.getClass())) {
            AdRequestConfiguration adRequestConfiguration = (AdRequestConfiguration) obj;
            if (m0.g(this.f76783a, adRequestConfiguration.f76783a) && m0.g(this.f76784b, adRequestConfiguration.f76784b) && m0.g(this.f76785c, adRequestConfiguration.f76785c) && m0.g(this.f76786d, adRequestConfiguration.f76786d) && m0.g(this.f76787e, adRequestConfiguration.f76787e) && m0.g(this.f76788f, adRequestConfiguration.f76788f) && m0.g(this.f76789g, adRequestConfiguration.f76789g) && m0.g(this.f76790h, adRequestConfiguration.f76790h) && this.f76791i == adRequestConfiguration.f76791i) {
                return true;
            }
        }
        return false;
    }

    @l
    public final String getAdUnitId() {
        return this.f76783a;
    }

    @m
    public final String getAge() {
        return this.f76784b;
    }

    @m
    public final String getBiddingData() {
        return this.f76790h;
    }

    @m
    public final String getContextQuery() {
        return this.f76786d;
    }

    @m
    public final List<String> getContextTags() {
        return this.f76787e;
    }

    @m
    public final String getGender() {
        return this.f76785c;
    }

    @m
    public final Location getLocation() {
        return this.f76788f;
    }

    @m
    public final Map<String, String> getParameters() {
        return this.f76789g;
    }

    @m
    public final AdTheme getPreferredTheme() {
        return this.f76791i;
    }

    public int hashCode() {
        String str = this.f76784b;
        int iA = k4.a(this.f76783a, (str != null ? str.hashCode() : 0) * 31, 31);
        String str2 = this.f76785c;
        int iHashCode = (iA + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f76786d;
        int iHashCode2 = (iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list = this.f76787e;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f76788f;
        int iHashCode4 = (iHashCode3 + (location != null ? location.hashCode() : 0)) * 31;
        Map map = this.f76789g;
        int iHashCode5 = (iHashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f76790h;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f76791i;
        return iHashCode6 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    private AdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme) {
        this.f76783a = str;
        this.f76784b = str2;
        this.f76785c = str3;
        this.f76786d = str4;
        this.f76787e = list;
        this.f76788f = location;
        this.f76789g = map;
        this.f76790h = str5;
        this.f76791i = adTheme;
    }
}
