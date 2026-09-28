package com.sporty.android.core.model.ads;

import android.text.TextUtils;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.mq0;
import defpackage.mtg0;
import defpackage.ux5;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u001a\u001a\u00020\u0003H\u0096\u0080\u0004J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0001HÆ\u0003Jo\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0014\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016¨\u0006)"}, d2 = {"Lcom/sporty/android/core/model/ads/RealSportsAds;", "", "imgUrl", "", "imgUrlDark", "linkUrl", "text", "btnText", "sportId", "isNew", "", "isHide", "configKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Object;)V", "getImgUrl", "()Ljava/lang/String;", "getImgUrlDark", "getLinkUrl", "getText", "getBtnText", "getSportId", "()Z", "getConfigKey", "()Ljava/lang/Object;", "isImageUrlSupported", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RealSportsAds {
    private final String btnText;
    private final Object configKey;
    private final String imgUrl;
    private final String imgUrlDark;
    private final boolean isHide;
    private final boolean isNew;
    private final String linkUrl;
    private final String sportId;
    private final String text;

    public /* synthetic */ RealSportsAds(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : obj);
    }

    public static /* synthetic */ RealSportsAds copy$default(RealSportsAds realSportsAds, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = realSportsAds.imgUrl;
        }
        if ((i & 2) != 0) {
            str2 = realSportsAds.imgUrlDark;
        }
        if ((i & 4) != 0) {
            str3 = realSportsAds.linkUrl;
        }
        if ((i & 8) != 0) {
            str4 = realSportsAds.text;
        }
        if ((i & 16) != 0) {
            str5 = realSportsAds.btnText;
        }
        if ((i & 32) != 0) {
            str6 = realSportsAds.sportId;
        }
        if ((i & 64) != 0) {
            z = realSportsAds.isNew;
        }
        if ((i & 128) != 0) {
            z2 = realSportsAds.isHide;
        }
        if ((i & 256) != 0) {
            obj = realSportsAds.configKey;
        }
        boolean z3 = z2;
        Object obj3 = obj;
        String str7 = str6;
        boolean z4 = z;
        String str8 = str5;
        String str9 = str3;
        return realSportsAds.copy(str, str2, str9, str4, str8, str7, z4, z3, obj3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImgUrlDark() {
        return this.imgUrlDark;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBtnText() {
        return this.btnText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsHide() {
        return this.isHide;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getConfigKey() {
        return this.configKey;
    }

    public final RealSportsAds copy(String imgUrl, String imgUrlDark, String linkUrl, String text, String btnText, String sportId, boolean isNew, boolean isHide, Object configKey) {
        text.getClass();
        return new RealSportsAds(imgUrl, imgUrlDark, linkUrl, text, btnText, sportId, isNew, isHide, configKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealSportsAds)) {
            return false;
        }
        RealSportsAds realSportsAds = (RealSportsAds) other;
        return Intrinsics.g(this.imgUrl, realSportsAds.imgUrl) && Intrinsics.g(this.imgUrlDark, realSportsAds.imgUrlDark) && Intrinsics.g(this.linkUrl, realSportsAds.linkUrl) && Intrinsics.g(this.text, realSportsAds.text) && Intrinsics.g(this.btnText, realSportsAds.btnText) && Intrinsics.g(this.sportId, realSportsAds.sportId) && this.isNew == realSportsAds.isNew && this.isHide == realSportsAds.isHide && Intrinsics.g(this.configKey, realSportsAds.configKey);
    }

    public final String getBtnText() {
        return this.btnText;
    }

    public final Object getConfigKey() {
        return this.configKey;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final String getImgUrlDark() {
        return this.imgUrlDark;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.imgUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imgUrlDark;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.linkUrl;
        int iA = gmf0.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.text);
        String str4 = this.btnText;
        int iHashCode3 = (iA + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sportId;
        int iA2 = mtg0.a(mtg0.a((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.isNew), 31, this.isHide);
        Object obj = this.configKey;
        return iA2 + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean isHide() {
        return this.isHide;
    }

    public final boolean isImageUrlSupported() {
        try {
            return TextUtils.equals("https", new URL(this.imgUrl).getProtocol());
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public String toString() {
        String str = this.imgUrl;
        String str2 = this.imgUrlDark;
        String str3 = this.linkUrl;
        String str4 = this.text;
        String str5 = this.btnText;
        String str6 = this.sportId;
        boolean z = this.isNew;
        StringBuilder sbA = ux5.a("Ads{imgUrl='", str, "', imgUrlDark='", str2, "', linkUrl='");
        hxa.c(sbA, str3, "', text='", str4, "', btnText='");
        hxa.c(sbA, str5, "', sportId='", str6, "', isNew=");
        return mq0.a(sbA, z, "}");
    }

    public RealSportsAds(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, Object obj) {
        str4.getClass();
        this.imgUrl = str;
        this.imgUrlDark = str2;
        this.linkUrl = str3;
        this.text = str4;
        this.btnText = str5;
        this.sportId = str6;
        this.isNew = z;
        this.isHide = z2;
        this.configKey = obj;
    }

    public RealSportsAds() {
        this(null, null, null, null, null, null, false, false, null, 511, null);
    }
}
