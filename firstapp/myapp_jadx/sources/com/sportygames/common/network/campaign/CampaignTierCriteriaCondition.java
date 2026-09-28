package com.sportygames.common.network.campaign;

import defpackage.gmf0;
import defpackage.j26;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/sportygames/common/network/campaign/CampaignTierCriteriaCondition;", "", "type", "", "value", "startTime", "endTime", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "getStartTime", "getEndTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CampaignTierCriteriaCondition {
    private final String endTime;
    private final String startTime;
    private final String type;
    private final Object value;

    public CampaignTierCriteriaCondition(String str, Object obj, String str2, String str3) {
        str.getClass();
        obj.getClass();
        str2.getClass();
        str3.getClass();
        this.type = str;
        this.value = obj;
        this.startTime = str2;
        this.endTime = str3;
    }

    public static /* synthetic */ CampaignTierCriteriaCondition copy$default(CampaignTierCriteriaCondition campaignTierCriteriaCondition, String str, Object obj, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = campaignTierCriteriaCondition.type;
        }
        if ((i & 2) != 0) {
            obj = campaignTierCriteriaCondition.value;
        }
        if ((i & 4) != 0) {
            str2 = campaignTierCriteriaCondition.startTime;
        }
        if ((i & 8) != 0) {
            str3 = campaignTierCriteriaCondition.endTime;
        }
        return campaignTierCriteriaCondition.copy(str, obj, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    public final CampaignTierCriteriaCondition copy(String type, Object value, String startTime, String endTime) {
        type.getClass();
        value.getClass();
        startTime.getClass();
        endTime.getClass();
        return new CampaignTierCriteriaCondition(type, value, startTime, endTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignTierCriteriaCondition)) {
            return false;
        }
        CampaignTierCriteriaCondition campaignTierCriteriaCondition = (CampaignTierCriteriaCondition) other;
        return Intrinsics.g(this.type, campaignTierCriteriaCondition.type) && Intrinsics.g(this.value, campaignTierCriteriaCondition.value) && Intrinsics.g(this.startTime, campaignTierCriteriaCondition.startTime) && Intrinsics.g(this.endTime, campaignTierCriteriaCondition.endTime);
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getType() {
        return this.type;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.endTime.hashCode() + gmf0.a((this.value.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.startTime);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CampaignTierCriteriaCondition(type=");
        sb.append(this.type);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        return j26.a(sb, this.endTime, ')');
    }
}
