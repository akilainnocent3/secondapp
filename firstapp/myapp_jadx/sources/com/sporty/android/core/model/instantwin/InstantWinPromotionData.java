package com.sporty.android.core.model.instantwin;

import defpackage.hxa;
import defpackage.oie;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0013¨\u0006("}, d2 = {"Lcom/sporty/android/core/model/instantwin/InstantWinPromotionData;", "", "bodyKey", "", "cmsPage", "imageKey", "maxPopupTimes", "", "redirectUrl", "titleKey", "type", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBodyKey", "()Ljava/lang/String;", "getCmsPage", "getImageKey", "getMaxPopupTimes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRedirectUrl", "getTitleKey", "getType", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sporty/android/core/model/instantwin/InstantWinPromotionData;", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class InstantWinPromotionData {
    private final String bodyKey;
    private final String cmsPage;
    private final String imageKey;
    private final Integer maxPopupTimes;
    private final String redirectUrl;
    private final String titleKey;
    private final String type;
    private final Integer version;

    public InstantWinPromotionData(String str, String str2, String str3, Integer num, String str4, String str5, String str6, Integer num2) {
        this.bodyKey = str;
        this.cmsPage = str2;
        this.imageKey = str3;
        this.maxPopupTimes = num;
        this.redirectUrl = str4;
        this.titleKey = str5;
        this.type = str6;
        this.version = num2;
    }

    public static /* synthetic */ InstantWinPromotionData copy$default(InstantWinPromotionData instantWinPromotionData, String str, String str2, String str3, Integer num, String str4, String str5, String str6, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instantWinPromotionData.bodyKey;
        }
        if ((i & 2) != 0) {
            str2 = instantWinPromotionData.cmsPage;
        }
        if ((i & 4) != 0) {
            str3 = instantWinPromotionData.imageKey;
        }
        if ((i & 8) != 0) {
            num = instantWinPromotionData.maxPopupTimes;
        }
        if ((i & 16) != 0) {
            str4 = instantWinPromotionData.redirectUrl;
        }
        if ((i & 32) != 0) {
            str5 = instantWinPromotionData.titleKey;
        }
        if ((i & 64) != 0) {
            str6 = instantWinPromotionData.type;
        }
        if ((i & 128) != 0) {
            num2 = instantWinPromotionData.version;
        }
        String str7 = str6;
        Integer num3 = num2;
        String str8 = str4;
        String str9 = str5;
        return instantWinPromotionData.copy(str, str2, str3, num, str8, str9, str7, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBodyKey() {
        return this.bodyKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCmsPage() {
        return this.cmsPage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageKey() {
        return this.imageKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getMaxPopupTimes() {
        return this.maxPopupTimes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitleKey() {
        return this.titleKey;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    public final InstantWinPromotionData copy(String bodyKey, String cmsPage, String imageKey, Integer maxPopupTimes, String redirectUrl, String titleKey, String type, Integer version) {
        return new InstantWinPromotionData(bodyKey, cmsPage, imageKey, maxPopupTimes, redirectUrl, titleKey, type, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstantWinPromotionData)) {
            return false;
        }
        InstantWinPromotionData instantWinPromotionData = (InstantWinPromotionData) other;
        return Intrinsics.g(this.bodyKey, instantWinPromotionData.bodyKey) && Intrinsics.g(this.cmsPage, instantWinPromotionData.cmsPage) && Intrinsics.g(this.imageKey, instantWinPromotionData.imageKey) && Intrinsics.g(this.maxPopupTimes, instantWinPromotionData.maxPopupTimes) && Intrinsics.g(this.redirectUrl, instantWinPromotionData.redirectUrl) && Intrinsics.g(this.titleKey, instantWinPromotionData.titleKey) && Intrinsics.g(this.type, instantWinPromotionData.type) && Intrinsics.g(this.version, instantWinPromotionData.version);
    }

    public final String getBodyKey() {
        return this.bodyKey;
    }

    public final String getCmsPage() {
        return this.cmsPage;
    }

    public final String getImageKey() {
        return this.imageKey;
    }

    public final Integer getMaxPopupTimes() {
        return this.maxPopupTimes;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getTitleKey() {
        return this.titleKey;
    }

    public final String getType() {
        return this.type;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.bodyKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cmsPage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.maxPopupTimes;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.redirectUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.titleKey;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.version;
        return iHashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.bodyKey;
        String str2 = this.cmsPage;
        String str3 = this.imageKey;
        Integer num = this.maxPopupTimes;
        String str4 = this.redirectUrl;
        String str5 = this.titleKey;
        String str6 = this.type;
        Integer num2 = this.version;
        StringBuilder sbA = ux5.a("InstantWinPromotionData(bodyKey=", str, ", cmsPage=", str2, ", imageKey=");
        oie.a(num, str3, ", maxPopupTimes=", ", redirectUrl=", sbA);
        hxa.c(sbA, str4, ", titleKey=", str5, ", type=");
        sbA.append(str6);
        sbA.append(", version=");
        sbA.append(num2);
        sbA.append(")");
        return sbA.toString();
    }
}
