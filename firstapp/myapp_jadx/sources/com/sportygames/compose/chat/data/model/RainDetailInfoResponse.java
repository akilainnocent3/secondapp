package com.sportygames.compose.chat.data.model;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.j26;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/sportygames/compose/chat/data/model/RainDetailInfoResponse;", "", AnalyticsParam.EVENT_PARAM_ID, "", "startTime", "", "endTime", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartTime", "()Ljava/lang/String;", "getEndTime", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/sportygames/compose/chat/data/model/RainDetailInfoResponse;", "equals", "", "other", "hashCode", "toString", "compose-chat_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RainDetailInfoResponse {
    public static final int $stable = 0;
    private final String endTime;
    private final Integer id;
    private final String startTime;

    public RainDetailInfoResponse(Integer num, String str, String str2) {
        this.id = num;
        this.startTime = str;
        this.endTime = str2;
    }

    public static /* synthetic */ RainDetailInfoResponse copy$default(RainDetailInfoResponse rainDetailInfoResponse, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = rainDetailInfoResponse.id;
        }
        if ((i & 2) != 0) {
            str = rainDetailInfoResponse.startTime;
        }
        if ((i & 4) != 0) {
            str2 = rainDetailInfoResponse.endTime;
        }
        return rainDetailInfoResponse.copy(num, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    public final RainDetailInfoResponse copy(Integer id, String startTime, String endTime) {
        return new RainDetailInfoResponse(id, startTime, endTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RainDetailInfoResponse)) {
            return false;
        }
        RainDetailInfoResponse rainDetailInfoResponse = (RainDetailInfoResponse) other;
        return Intrinsics.g(this.id, rainDetailInfoResponse.id) && Intrinsics.g(this.startTime, rainDetailInfoResponse.startTime) && Intrinsics.g(this.endTime, rainDetailInfoResponse.endTime);
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.startTime;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endTime;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RainDetailInfoResponse(id=");
        sb.append(this.id);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        return j26.a(sb, this.endTime, ')');
    }
}
