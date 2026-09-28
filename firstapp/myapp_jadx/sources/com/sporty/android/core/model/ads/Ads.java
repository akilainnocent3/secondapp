package com.sporty.android.core.model.ads;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import defpackage.f87;
import defpackage.g41;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0080\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0014\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020.HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\n\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\f\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u001d\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lcom/sporty/android/core/model/ads/Ads;", "", AnalyticsParam.EVENT_PARAM_ID, "", "imgUrl", "linkUrl", "text", "startTime", "", "endTime", "isNew", "", "isHot", EventKeys.EVENT_GROUP, "imgUrlDark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getImgUrl", "getLinkUrl", "getText", "getStartTime", "()J", "getEndTime", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGroup", "getImgUrlDark", "isAvailable", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/sporty/android/core/model/ads/Ads;", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Ads {
    private final long endTime;
    private final String group;
    private final String id;
    private final String imgUrl;
    private final String imgUrlDark;
    private final Boolean isHot;
    private final Boolean isNew;
    private final String linkUrl;
    private final long startTime;
    private final String text;

    public /* synthetic */ Ads(String str, String str2, String str3, String str4, long j, long j2, Boolean bool, Boolean bool2, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? 0L : j, (i & 32) == 0 ? j2 : 0L, (i & 64) != 0 ? Boolean.FALSE : bool, (i & 128) != 0 ? Boolean.FALSE : bool2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6);
    }

    public static /* synthetic */ Ads copy$default(Ads ads, String str, String str2, String str3, String str4, long j, long j2, Boolean bool, Boolean bool2, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ads.id;
        }
        if ((i & 2) != 0) {
            str2 = ads.imgUrl;
        }
        if ((i & 4) != 0) {
            str3 = ads.linkUrl;
        }
        if ((i & 8) != 0) {
            str4 = ads.text;
        }
        if ((i & 16) != 0) {
            j = ads.startTime;
        }
        if ((i & 32) != 0) {
            j2 = ads.endTime;
        }
        if ((i & 64) != 0) {
            bool = ads.isNew;
        }
        if ((i & 128) != 0) {
            bool2 = ads.isHot;
        }
        if ((i & 256) != 0) {
            str5 = ads.group;
        }
        if ((i & 512) != 0) {
            str6 = ads.imgUrlDark;
        }
        long j3 = j2;
        long j4 = j;
        String str7 = str3;
        String str8 = str4;
        return ads.copy(str, str2, str7, str8, j4, j3, bool, bool2, str5, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getImgUrlDark() {
        return this.imgUrlDark;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
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
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsNew() {
        return this.isNew;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsHot() {
        return this.isHot;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    public final Ads copy(String id, String imgUrl, String linkUrl, String text, long startTime, long endTime, Boolean isNew, Boolean isHot, String group, String imgUrlDark) {
        id.getClass();
        return new Ads(id, imgUrl, linkUrl, text, startTime, endTime, isNew, isHot, group, imgUrlDark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ads)) {
            return false;
        }
        Ads ads = (Ads) other;
        return Intrinsics.g(this.id, ads.id) && Intrinsics.g(this.imgUrl, ads.imgUrl) && Intrinsics.g(this.linkUrl, ads.linkUrl) && Intrinsics.g(this.text, ads.text) && this.startTime == ads.startTime && this.endTime == ads.endTime && Intrinsics.g(this.isNew, ads.isNew) && Intrinsics.g(this.isHot, ads.isHot) && Intrinsics.g(this.group, ads.group) && Intrinsics.g(this.imgUrlDark, ads.imgUrlDark);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getGroup() {
        return this.group;
    }

    public final String getId() {
        return this.id;
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

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.imgUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.linkUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int iA = f87.a(f87.a((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, this.startTime, 31), this.endTime, 31);
        Boolean bool = this.isNew;
        int iHashCode4 = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isHot;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.group;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imgUrlDark;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isAvailable() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        return jCurrentTimeMillis < this.endTime && this.startTime <= jCurrentTimeMillis && this.imgUrl != null;
    }

    public final Boolean isHot() {
        return this.isHot;
    }

    public final Boolean isNew() {
        return this.isNew;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.imgUrl;
        String str3 = this.linkUrl;
        String str4 = this.text;
        long j = this.startTime;
        long j2 = this.endTime;
        Boolean bool = this.isNew;
        Boolean bool2 = this.isHot;
        String str5 = this.group;
        String str6 = this.imgUrlDark;
        StringBuilder sbA = ux5.a("Ads(id=", str, ", imgUrl=", str2, ", linkUrl=");
        hxa.c(sbA, str3, ", text=", str4, ", startTime=");
        sbA.append(j);
        g41.a(j2, ", endTime=", ", isNew=", sbA);
        sbA.append(bool);
        sbA.append(", isHot=");
        sbA.append(bool2);
        sbA.append(", group=");
        return kwi.a(sbA, str5, ", imgUrlDark=", str6, ")");
    }

    public Ads(String str, String str2, String str3, String str4, long j, long j2, Boolean bool, Boolean bool2, String str5, String str6) {
        str.getClass();
        this.id = str;
        this.imgUrl = str2;
        this.linkUrl = str3;
        this.text = str4;
        this.startTime = j;
        this.endTime = j2;
        this.isNew = bool;
        this.isHot = bool2;
        this.group = str5;
        this.imgUrlDark = str6;
    }

    public Ads() {
        this(null, null, null, null, 0L, 0L, null, null, null, null, 1023, null);
    }
}
