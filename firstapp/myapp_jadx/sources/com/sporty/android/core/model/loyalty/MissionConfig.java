package com.sporty.android.core.model.loyalty;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.zug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0014\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010*\u001a\u00020+HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u0006,"}, d2 = {"Lcom/sporty/android/core/model/loyalty/MissionConfig;", "", AnalyticsParam.EVENT_PARAM_ID, "", "type", "Lcom/sporty/android/core/model/loyalty/MissionConfigType;", AnalyticsParam.EVENT_STATUS, "Lcom/sporty/android/core/model/loyalty/MissionPublishState;", "content", "Lcom/sporty/android/core/model/loyalty/MissionDetails;", "parameter", "Lcom/sporty/android/core/model/loyalty/MissionCriteria;", "publishedTime", "", "unpublishedTime", "<init>", "(ILcom/sporty/android/core/model/loyalty/MissionConfigType;Lcom/sporty/android/core/model/loyalty/MissionPublishState;Lcom/sporty/android/core/model/loyalty/MissionDetails;Lcom/sporty/android/core/model/loyalty/MissionCriteria;JJ)V", "getId", "()I", "getType", "()Lcom/sporty/android/core/model/loyalty/MissionConfigType;", "getStatus", "()Lcom/sporty/android/core/model/loyalty/MissionPublishState;", "getContent", "()Lcom/sporty/android/core/model/loyalty/MissionDetails;", "getParameter", "()Lcom/sporty/android/core/model/loyalty/MissionCriteria;", "getPublishedTime", "()J", "getUnpublishedTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MissionConfig {
    private final MissionDetails content;
    private final int id;
    private final MissionCriteria parameter;
    private final long publishedTime;
    private final MissionPublishState status;
    private final MissionConfigType type;
    private final long unpublishedTime;

    public MissionConfig(int i, MissionConfigType missionConfigType, MissionPublishState missionPublishState, MissionDetails missionDetails, MissionCriteria missionCriteria, long j, long j2) {
        missionConfigType.getClass();
        missionPublishState.getClass();
        missionDetails.getClass();
        missionCriteria.getClass();
        this.id = i;
        this.type = missionConfigType;
        this.status = missionPublishState;
        this.content = missionDetails;
        this.parameter = missionCriteria;
        this.publishedTime = j;
        this.unpublishedTime = j2;
    }

    public static /* synthetic */ MissionConfig copy$default(MissionConfig missionConfig, int i, MissionConfigType missionConfigType, MissionPublishState missionPublishState, MissionDetails missionDetails, MissionCriteria missionCriteria, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = missionConfig.id;
        }
        if ((i2 & 2) != 0) {
            missionConfigType = missionConfig.type;
        }
        if ((i2 & 4) != 0) {
            missionPublishState = missionConfig.status;
        }
        if ((i2 & 8) != 0) {
            missionDetails = missionConfig.content;
        }
        if ((i2 & 16) != 0) {
            missionCriteria = missionConfig.parameter;
        }
        if ((i2 & 32) != 0) {
            j = missionConfig.publishedTime;
        }
        if ((i2 & 64) != 0) {
            j2 = missionConfig.unpublishedTime;
        }
        long j3 = j2;
        long j4 = j;
        MissionCriteria missionCriteria2 = missionCriteria;
        MissionPublishState missionPublishState2 = missionPublishState;
        return missionConfig.copy(i, missionConfigType, missionPublishState2, missionDetails, missionCriteria2, j4, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MissionConfigType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MissionPublishState getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MissionDetails getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MissionCriteria getParameter() {
        return this.parameter;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getPublishedTime() {
        return this.publishedTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getUnpublishedTime() {
        return this.unpublishedTime;
    }

    public final MissionConfig copy(int id, MissionConfigType type, MissionPublishState status, MissionDetails content, MissionCriteria parameter, long publishedTime, long unpublishedTime) {
        type.getClass();
        status.getClass();
        content.getClass();
        parameter.getClass();
        return new MissionConfig(id, type, status, content, parameter, publishedTime, unpublishedTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionConfig)) {
            return false;
        }
        MissionConfig missionConfig = (MissionConfig) other;
        return this.id == missionConfig.id && this.type == missionConfig.type && this.status == missionConfig.status && Intrinsics.g(this.content, missionConfig.content) && Intrinsics.g(this.parameter, missionConfig.parameter) && this.publishedTime == missionConfig.publishedTime && this.unpublishedTime == missionConfig.unpublishedTime;
    }

    public final MissionDetails getContent() {
        return this.content;
    }

    public final int getId() {
        return this.id;
    }

    public final MissionCriteria getParameter() {
        return this.parameter;
    }

    public final long getPublishedTime() {
        return this.publishedTime;
    }

    public final MissionPublishState getStatus() {
        return this.status;
    }

    public final MissionConfigType getType() {
        return this.type;
    }

    public final long getUnpublishedTime() {
        return this.unpublishedTime;
    }

    public int hashCode() {
        return Long.hashCode(this.unpublishedTime) + f87.a((this.parameter.hashCode() + ((this.content.hashCode() + ((this.status.hashCode() + ((this.type.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31)) * 31)) * 31, this.publishedTime, 31);
    }

    public String toString() {
        int i = this.id;
        MissionConfigType missionConfigType = this.type;
        MissionPublishState missionPublishState = this.status;
        MissionDetails missionDetails = this.content;
        MissionCriteria missionCriteria = this.parameter;
        long j = this.publishedTime;
        long j2 = this.unpublishedTime;
        StringBuilder sb = new StringBuilder("MissionConfig(id=");
        sb.append(i);
        sb.append(", type=");
        sb.append(missionConfigType);
        sb.append(", status=");
        sb.append(missionPublishState);
        sb.append(", content=");
        sb.append(missionDetails);
        sb.append(", parameter=");
        sb.append(missionCriteria);
        sb.append(", publishedTime=");
        sb.append(j);
        return zug.a(j2, ", unpublishedTime=", ")", sb);
    }
}
