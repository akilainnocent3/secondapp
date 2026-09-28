package com.sporty.android.core.model.promotion;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.d5d;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.nyf;
import defpackage.qn4;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\t\u00104\u001a\u00020\u0011HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\u0014\u00107\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00109\u001a\u00020\bHÖ\u0081\u0004J\n\u0010:\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R%\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR%\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR%\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R%\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R%\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R%\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R%\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR%\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010&R%\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010&R%\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017¨\u0006;"}, d2 = {"Lcom/sporty/android/core/model/promotion/ActivityItem;", "", "activityId", "", "activityTitle", "activityName", "activityDesc", AnalyticsParam.EVENT_STATUS, "", "kind", "activityStartTime", "", "activityEndTime", "imgUrl", "linkUrl", "weight", "isDisplayActivityTime", "", "isUtmApplied", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJLjava/lang/String;Ljava/lang/String;IZZLjava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getActivityTitle", "getActivityName", "getActivityDesc", "getStatus", "()I", "getKind", "getActivityStartTime", "()J", "getActivityEndTime", "getImgUrl", "getLinkUrl", "getWeight", "()Z", "getCountryCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ActivityItem {

    @SerializedName("activityDesc")
    private final String activityDesc;

    @SerializedName("activityEndTime")
    private final long activityEndTime;

    @SerializedName("activityId")
    private final String activityId;

    @SerializedName("activityName")
    private final String activityName;

    @SerializedName("activityStartTime")
    private final long activityStartTime;

    @SerializedName("activityTitle")
    private final String activityTitle;

    @SerializedName("countryCode")
    private final String countryCode;

    @SerializedName("imgUrl")
    private final String imgUrl;

    @SerializedName("isDisplayActivityTime")
    private final boolean isDisplayActivityTime;

    @SerializedName("isUtmApplied")
    private final boolean isUtmApplied;

    @SerializedName("kind")
    private final int kind;

    @SerializedName("linkUrl")
    private final String linkUrl;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    @SerializedName("weight")
    private final int weight;

    public ActivityItem(String str, String str2, String str3, String str4, int i, int i2, long j, long j2, String str5, String str6, int i3, boolean z, boolean z2, String str7) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.activityId = str;
        this.activityTitle = str2;
        this.activityName = str3;
        this.activityDesc = str4;
        this.status = i;
        this.kind = i2;
        this.activityStartTime = j;
        this.activityEndTime = j2;
        this.imgUrl = str5;
        this.linkUrl = str6;
        this.weight = i3;
        this.isDisplayActivityTime = z;
        this.isUtmApplied = z2;
        this.countryCode = str7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsDisplayActivityTime() {
        return this.isDisplayActivityTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsUtmApplied() {
        return this.isUtmApplied;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActivityTitle() {
        return this.activityTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getActivityDesc() {
        return this.activityDesc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getActivityStartTime() {
        return this.activityStartTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getActivityEndTime() {
        return this.activityEndTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final ActivityItem copy(String activityId, String activityTitle, String activityName, String activityDesc, int status, int kind, long activityStartTime, long activityEndTime, String imgUrl, String linkUrl, int weight, boolean isDisplayActivityTime, boolean isUtmApplied, String countryCode) {
        qn4.b(activityId, activityTitle, activityName, activityDesc, imgUrl);
        linkUrl.getClass();
        countryCode.getClass();
        return new ActivityItem(activityId, activityTitle, activityName, activityDesc, status, kind, activityStartTime, activityEndTime, imgUrl, linkUrl, weight, isDisplayActivityTime, isUtmApplied, countryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityItem)) {
            return false;
        }
        ActivityItem activityItem = (ActivityItem) other;
        return Intrinsics.g(this.activityId, activityItem.activityId) && Intrinsics.g(this.activityTitle, activityItem.activityTitle) && Intrinsics.g(this.activityName, activityItem.activityName) && Intrinsics.g(this.activityDesc, activityItem.activityDesc) && this.status == activityItem.status && this.kind == activityItem.kind && this.activityStartTime == activityItem.activityStartTime && this.activityEndTime == activityItem.activityEndTime && Intrinsics.g(this.imgUrl, activityItem.imgUrl) && Intrinsics.g(this.linkUrl, activityItem.linkUrl) && this.weight == activityItem.weight && this.isDisplayActivityTime == activityItem.isDisplayActivityTime && this.isUtmApplied == activityItem.isUtmApplied && Intrinsics.g(this.countryCode, activityItem.countryCode);
    }

    public final String getActivityDesc() {
        return this.activityDesc;
    }

    public final long getActivityEndTime() {
        return this.activityEndTime;
    }

    public final String getActivityId() {
        return this.activityId;
    }

    public final String getActivityName() {
        return this.activityName;
    }

    public final long getActivityStartTime() {
        return this.activityStartTime;
    }

    public final String getActivityTitle() {
        return this.activityTitle;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final int getKind() {
        return this.kind;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.countryCode.hashCode() + mtg0.a(mtg0.a(gpp.a(this.weight, gmf0.a(gmf0.a(f87.a(f87.a(gpp.a(this.kind, gpp.a(this.status, gmf0.a(gmf0.a(gmf0.a(this.activityId.hashCode() * 31, 31, this.activityTitle), 31, this.activityName), 31, this.activityDesc), 31), 31), this.activityStartTime, 31), this.activityEndTime, 31), 31, this.imgUrl), 31, this.linkUrl), 31), 31, this.isDisplayActivityTime), 31, this.isUtmApplied);
    }

    public final boolean isDisplayActivityTime() {
        return this.isDisplayActivityTime;
    }

    public final boolean isUtmApplied() {
        return this.isUtmApplied;
    }

    public String toString() {
        String str = this.activityId;
        String str2 = this.activityTitle;
        String str3 = this.activityName;
        String str4 = this.activityDesc;
        int i = this.status;
        int i2 = this.kind;
        long j = this.activityStartTime;
        long j2 = this.activityEndTime;
        String str5 = this.imgUrl;
        String str6 = this.linkUrl;
        int i3 = this.weight;
        boolean z = this.isDisplayActivityTime;
        boolean z2 = this.isUtmApplied;
        String str7 = this.countryCode;
        StringBuilder sbA = ux5.a("ActivityItem(activityId=", str, ", activityTitle=", str2, ", activityName=");
        hxa.c(sbA, str3, ", activityDesc=", str4, ", status=");
        d5d.a(sbA, i, ", kind=", i2, ", activityStartTime=");
        sbA.append(j);
        g41.a(j2, ", activityEndTime=", ", imgUrl=", sbA);
        hxa.c(sbA, str5, ", linkUrl=", str6, ", weight=");
        sbA.append(i3);
        sbA.append(", isDisplayActivityTime=");
        sbA.append(z);
        sbA.append(", isUtmApplied=");
        return nyf.a(", countryCode=", str7, ")", sbA, z2);
    }
}
