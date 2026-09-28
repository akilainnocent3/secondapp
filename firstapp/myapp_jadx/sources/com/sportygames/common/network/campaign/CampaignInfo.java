package com.sportygames.common.network.campaign;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.j26;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/sportygames/common/network/campaign/CampaignInfo;", "", "name", "", "displayName", AnalyticsParam.EVENT_STATUS, "remainingTime", "", "timeUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getDisplayName", "getStatus", "getRemainingTime", "()I", "getTimeUnit", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CampaignInfo {
    private final String displayName;
    private final String name;
    private final int remainingTime;
    private final String status;
    private final String timeUnit;

    public CampaignInfo(String str, String str2, String str3, int i, String str4) {
        wd7.a(str, str2, str3, str4);
        this.name = str;
        this.displayName = str2;
        this.status = str3;
        this.remainingTime = i;
        this.timeUnit = str4;
    }

    public static /* synthetic */ CampaignInfo copy$default(CampaignInfo campaignInfo, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = campaignInfo.name;
        }
        if ((i2 & 2) != 0) {
            str2 = campaignInfo.displayName;
        }
        if ((i2 & 4) != 0) {
            str3 = campaignInfo.status;
        }
        if ((i2 & 8) != 0) {
            i = campaignInfo.remainingTime;
        }
        if ((i2 & 16) != 0) {
            str4 = campaignInfo.timeUnit;
        }
        String str5 = str4;
        String str6 = str3;
        return campaignInfo.copy(str, str2, str6, i, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRemainingTime() {
        return this.remainingTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimeUnit() {
        return this.timeUnit;
    }

    public final CampaignInfo copy(String name, String displayName, String status, int remainingTime, String timeUnit) {
        name.getClass();
        displayName.getClass();
        status.getClass();
        timeUnit.getClass();
        return new CampaignInfo(name, displayName, status, remainingTime, timeUnit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignInfo)) {
            return false;
        }
        CampaignInfo campaignInfo = (CampaignInfo) other;
        return Intrinsics.g(this.name, campaignInfo.name) && Intrinsics.g(this.displayName, campaignInfo.displayName) && Intrinsics.g(this.status, campaignInfo.status) && this.remainingTime == campaignInfo.remainingTime && Intrinsics.g(this.timeUnit, campaignInfo.timeUnit);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRemainingTime() {
        return this.remainingTime;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTimeUnit() {
        return this.timeUnit;
    }

    public int hashCode() {
        return this.timeUnit.hashCode() + gpp.a(this.remainingTime, gmf0.a(gmf0.a(this.name.hashCode() * 31, 31, this.displayName), 31, this.status), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CampaignInfo(name=");
        sb.append(this.name);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", remainingTime=");
        sb.append(this.remainingTime);
        sb.append(", timeUnit=");
        return j26.a(sb, this.timeUnit, ')');
    }
}
