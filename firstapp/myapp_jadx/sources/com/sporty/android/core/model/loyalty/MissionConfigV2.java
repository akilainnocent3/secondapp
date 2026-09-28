package com.sporty.android.core.model.loyalty;

import com.appsflyer.internal.b0;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.nrz;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J`\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0014\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010.\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00060"}, d2 = {"Lcom/sporty/android/core/model/loyalty/MissionConfigV2;", "", AnalyticsParam.EVENT_PARAM_ID, "", "type", "", "tier", "", AnalyticsParam.EVENT_STATUS, "Lcom/sporty/android/core/model/loyalty/MissionPublishState;", "content", "Lcom/sporty/android/core/model/loyalty/MissionContentV2;", "parameter", "Lcom/sporty/android/core/model/loyalty/MissionParameterV2;", "publishedTime", "unpublishedTime", "<init>", "(JLjava/lang/String;Ljava/lang/Integer;Lcom/sporty/android/core/model/loyalty/MissionPublishState;Lcom/sporty/android/core/model/loyalty/MissionContentV2;Lcom/sporty/android/core/model/loyalty/MissionParameterV2;JJ)V", "getId", "()J", "getType", "()Ljava/lang/String;", "getTier", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "()Lcom/sporty/android/core/model/loyalty/MissionPublishState;", "getContent", "()Lcom/sporty/android/core/model/loyalty/MissionContentV2;", "getParameter", "()Lcom/sporty/android/core/model/loyalty/MissionParameterV2;", "getPublishedTime", "getUnpublishedTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JLjava/lang/String;Ljava/lang/Integer;Lcom/sporty/android/core/model/loyalty/MissionPublishState;Lcom/sporty/android/core/model/loyalty/MissionContentV2;Lcom/sporty/android/core/model/loyalty/MissionParameterV2;JJ)Lcom/sporty/android/core/model/loyalty/MissionConfigV2;", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MissionConfigV2 {
    private final MissionContentV2 content;
    private final long id;
    private final MissionParameterV2 parameter;
    private final long publishedTime;
    private final MissionPublishState status;
    private final Integer tier;
    private final String type;
    private final long unpublishedTime;

    public MissionConfigV2(long j, String str, Integer num, MissionPublishState missionPublishState, MissionContentV2 missionContentV2, MissionParameterV2 missionParameterV2, long j2, long j3) {
        str.getClass();
        missionPublishState.getClass();
        missionContentV2.getClass();
        missionParameterV2.getClass();
        this.id = j;
        this.type = str;
        this.tier = num;
        this.status = missionPublishState;
        this.content = missionContentV2;
        this.parameter = missionParameterV2;
        this.publishedTime = j2;
        this.unpublishedTime = j3;
    }

    public static /* synthetic */ MissionConfigV2 copy$default(MissionConfigV2 missionConfigV2, long j, String str, Integer num, MissionPublishState missionPublishState, MissionContentV2 missionContentV2, MissionParameterV2 missionParameterV2, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = missionConfigV2.id;
        }
        return missionConfigV2.copy(j, (i & 2) != 0 ? missionConfigV2.type : str, (i & 4) != 0 ? missionConfigV2.tier : num, (i & 8) != 0 ? missionConfigV2.status : missionPublishState, (i & 16) != 0 ? missionConfigV2.content : missionContentV2, (i & 32) != 0 ? missionConfigV2.parameter : missionParameterV2, (i & 64) != 0 ? missionConfigV2.publishedTime : j2, (i & 128) != 0 ? missionConfigV2.unpublishedTime : j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTier() {
        return this.tier;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MissionPublishState getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MissionContentV2 getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MissionParameterV2 getParameter() {
        return this.parameter;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getPublishedTime() {
        return this.publishedTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getUnpublishedTime() {
        return this.unpublishedTime;
    }

    public final MissionConfigV2 copy(long id, String type, Integer tier, MissionPublishState status, MissionContentV2 content, MissionParameterV2 parameter, long publishedTime, long unpublishedTime) {
        type.getClass();
        status.getClass();
        content.getClass();
        parameter.getClass();
        return new MissionConfigV2(id, type, tier, status, content, parameter, publishedTime, unpublishedTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionConfigV2)) {
            return false;
        }
        MissionConfigV2 missionConfigV2 = (MissionConfigV2) other;
        return this.id == missionConfigV2.id && Intrinsics.g(this.type, missionConfigV2.type) && Intrinsics.g(this.tier, missionConfigV2.tier) && this.status == missionConfigV2.status && Intrinsics.g(this.content, missionConfigV2.content) && Intrinsics.g(this.parameter, missionConfigV2.parameter) && this.publishedTime == missionConfigV2.publishedTime && this.unpublishedTime == missionConfigV2.unpublishedTime;
    }

    public final MissionContentV2 getContent() {
        return this.content;
    }

    public final long getId() {
        return this.id;
    }

    public final MissionParameterV2 getParameter() {
        return this.parameter;
    }

    public final long getPublishedTime() {
        return this.publishedTime;
    }

    public final MissionPublishState getStatus() {
        return this.status;
    }

    public final Integer getTier() {
        return this.tier;
    }

    public final String getType() {
        return this.type;
    }

    public final long getUnpublishedTime() {
        return this.unpublishedTime;
    }

    public int hashCode() {
        int iA = gmf0.a(Long.hashCode(this.id) * 31, 31, this.type);
        Integer num = this.tier;
        return Long.hashCode(this.unpublishedTime) + f87.a((this.parameter.hashCode() + ((this.content.hashCode() + ((this.status.hashCode() + ((iA + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31)) * 31, this.publishedTime, 31);
    }

    public String toString() {
        long j = this.id;
        String str = this.type;
        Integer num = this.tier;
        MissionPublishState missionPublishState = this.status;
        MissionContentV2 missionContentV2 = this.content;
        MissionParameterV2 missionParameterV2 = this.parameter;
        long j2 = this.publishedTime;
        long j3 = this.unpublishedTime;
        StringBuilder sbA = b0.a(j, "MissionConfigV2(id=", ", type=", str);
        sbA.append(", tier=");
        sbA.append(num);
        sbA.append(", status=");
        sbA.append(missionPublishState);
        sbA.append(", content=");
        sbA.append(missionContentV2);
        sbA.append(", parameter=");
        sbA.append(missionParameterV2);
        g41.a(j2, ", publishedTime=", ", unpublishedTime=", sbA);
        return nrz.a(j3, ")", sbA);
    }
}
