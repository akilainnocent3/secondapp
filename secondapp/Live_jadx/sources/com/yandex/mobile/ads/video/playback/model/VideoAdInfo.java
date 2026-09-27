package com.yandex.mobile.ads.video.playback.model;

import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class VideoAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f77027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f77028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f77029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f77030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f77031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f77032f;

    public VideoAdInfo(@m String str, @m String str2, @m String str3, @m String str4, @m String str5, @m String str6) {
        this.f77027a = str;
        this.f77028b = str2;
        this.f77029c = str3;
        this.f77030d = str4;
        this.f77031e = str5;
        this.f77032f = str6;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(VideoAdInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0.n(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.video.playback.model.VideoAdInfo");
        VideoAdInfo videoAdInfo = (VideoAdInfo) obj;
        return m0.g(this.f77027a, videoAdInfo.f77027a) && m0.g(this.f77028b, videoAdInfo.f77028b) && m0.g(this.f77029c, videoAdInfo.f77029c) && m0.g(this.f77030d, videoAdInfo.f77030d) && m0.g(this.f77031e, videoAdInfo.f77031e) && m0.g(this.f77032f, videoAdInfo.f77032f);
    }

    @m
    public final String getAdId() {
        return this.f77027a;
    }

    @m
    public final String getAdParameters() {
        return this.f77032f;
    }

    @m
    public final String getAdvertiserInfo() {
        return this.f77031e;
    }

    @m
    public final String getBannerId() {
        return this.f77029c;
    }

    @m
    public final String getCreativeId() {
        return this.f77028b;
    }

    @m
    public final String getData() {
        return this.f77030d;
    }

    public int hashCode() {
        String str = this.f77027a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f77028b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f77029c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f77030d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f77031e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f77032f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @l
    public String toString() {
        String str = this.f77027a;
        if (str == null) {
            str = "";
        }
        String str2 = this.f77028b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.f77029c;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.f77030d;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = this.f77031e;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = this.f77032f;
        return "VideoAdInfo (adId: " + str + ", creativeId: " + str2 + ", bannerId: " + str3 + ", data: " + str4 + ", advertiserInfo: " + str5 + ", adParameters: " + (str6 != null ? str6 : "") + j.f86771d;
    }
}
