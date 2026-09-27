package com.yandex.mobile.ads.common;

import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Creative {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f76831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f76832b;

    /* JADX WARN: Multi-variable type inference failed */
    public Creative() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Creative copy$default(Creative creative, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = creative.f76831a;
        }
        if ((i10 & 2) != 0) {
            str2 = creative.f76832b;
        }
        return creative.copy(str, str2);
    }

    @m
    public final String component1() {
        return this.f76831a;
    }

    @m
    public final String component2() {
        return this.f76832b;
    }

    @l
    public final Creative copy(@m String str, @m String str2) {
        return new Creative(str, str2);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Creative)) {
            return false;
        }
        Creative creative = (Creative) obj;
        return m0.g(this.f76831a, creative.f76831a) && m0.g(this.f76832b, creative.f76832b);
    }

    @m
    public final String getCampaignId() {
        return this.f76832b;
    }

    @m
    public final String getCreativeId() {
        return this.f76831a;
    }

    public int hashCode() {
        String str = this.f76831a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f76832b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @l
    public String toString() {
        return "Creative(creativeId=" + this.f76831a + ", campaignId=" + this.f76832b + j.f86771d;
    }

    public Creative(@m String str, @m String str2) {
        this.f76831a = str;
        this.f76832b = str2;
    }

    public /* synthetic */ Creative(String str, String str2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
