package com.sportybet.core.segmentation.api;

import com.google.gson.annotations.SerializedName;
import com.sportybet.core.segmentation.HomeSegment;
import defpackage.mq0;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R'\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R%\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017Ê\u0001\u0002\b$¨\u0006#"}, d2 = {"Lcom/sportybet/core/segmentation/api/SegmentationApiResponse;", "", "userId", "", "segment", "Lcom/sportybet/core/segmentation/HomeSegment;", "defaultSegment", "updateTime", "Ljava/util/Date;", "enable", "", "<init>", "(Ljava/lang/String;Lcom/sportybet/core/segmentation/HomeSegment;Lcom/sportybet/core/segmentation/HomeSegment;Ljava/util/Date;Z)V", "getUserId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getSegment", "()Lcom/sportybet/core/segmentation/HomeSegment;", "getDefaultSegment", "getUpdateTime", "()Ljava/util/Date;", "getEnable", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "segmentation", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SegmentationApiResponse {

    @SerializedName("defaultSegment")
    private final HomeSegment defaultSegment;

    @SerializedName("enable")
    private final boolean enable;

    @SerializedName("segment")
    private final HomeSegment segment;

    @SerializedName("updateTime")
    private final Date updateTime;

    @SerializedName("userId")
    private final String userId;

    public /* synthetic */ SegmentationApiResponse(String str, HomeSegment homeSegment, HomeSegment homeSegment2, Date date, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, homeSegment, homeSegment2, date, (i & 16) != 0 ? false : z);
    }

    public static /* synthetic */ SegmentationApiResponse copy$default(SegmentationApiResponse segmentationApiResponse, String str, HomeSegment homeSegment, HomeSegment homeSegment2, Date date, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = segmentationApiResponse.userId;
        }
        if ((i & 2) != 0) {
            homeSegment = segmentationApiResponse.segment;
        }
        if ((i & 4) != 0) {
            homeSegment2 = segmentationApiResponse.defaultSegment;
        }
        if ((i & 8) != 0) {
            date = segmentationApiResponse.updateTime;
        }
        if ((i & 16) != 0) {
            z = segmentationApiResponse.enable;
        }
        boolean z2 = z;
        HomeSegment homeSegment3 = homeSegment2;
        return segmentationApiResponse.copy(str, homeSegment, homeSegment3, date, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HomeSegment getSegment() {
        return this.segment;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HomeSegment getDefaultSegment() {
        return this.defaultSegment;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    public final SegmentationApiResponse copy(String userId, HomeSegment segment, HomeSegment defaultSegment, Date updateTime, boolean enable) {
        return new SegmentationApiResponse(userId, segment, defaultSegment, updateTime, enable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentationApiResponse)) {
            return false;
        }
        SegmentationApiResponse segmentationApiResponse = (SegmentationApiResponse) other;
        return Intrinsics.g(this.userId, segmentationApiResponse.userId) && this.segment == segmentationApiResponse.segment && this.defaultSegment == segmentationApiResponse.defaultSegment && Intrinsics.g(this.updateTime, segmentationApiResponse.updateTime) && this.enable == segmentationApiResponse.enable;
    }

    public final HomeSegment getDefaultSegment() {
        return this.defaultSegment;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final HomeSegment getSegment() {
        return this.segment;
    }

    public final Date getUpdateTime() {
        return this.updateTime;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        HomeSegment homeSegment = this.segment;
        int iHashCode2 = (iHashCode + (homeSegment == null ? 0 : homeSegment.hashCode())) * 31;
        HomeSegment homeSegment2 = this.defaultSegment;
        int iHashCode3 = (iHashCode2 + (homeSegment2 == null ? 0 : homeSegment2.hashCode())) * 31;
        Date date = this.updateTime;
        return Boolean.hashCode(this.enable) + ((iHashCode3 + (date != null ? date.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.userId;
        HomeSegment homeSegment = this.segment;
        HomeSegment homeSegment2 = this.defaultSegment;
        Date date = this.updateTime;
        boolean z = this.enable;
        StringBuilder sb = new StringBuilder("SegmentationApiResponse(userId=");
        sb.append(str);
        sb.append(", segment=");
        sb.append(homeSegment);
        sb.append(", defaultSegment=");
        sb.append(homeSegment2);
        sb.append(", updateTime=");
        sb.append(date);
        sb.append(", enable=");
        return mq0.a(sb, z, ")");
    }

    public SegmentationApiResponse(String str, HomeSegment homeSegment, HomeSegment homeSegment2, Date date, boolean z) {
        this.userId = str;
        this.segment = homeSegment;
        this.defaultSegment = homeSegment2;
        this.updateTime = date;
        this.enable = z;
    }
}
