package com.sporty.android.core.model.autobet;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ai50;
import defpackage.f78;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ml5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jk\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0014\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010.\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lcom/sporty/android/core/model/autobet/AutoBet;", "", "settingId", "", AnalyticsParam.EVENT_STATUS, "", "orderType", "stake", "minOdds", "maxOdds", "createTime", "", "selections", "", "Lcom/sporty/android/core/model/autobet/AutoBetSelection;", "latestHistory", "Lcom/sporty/android/core/model/autobet/LatestHistory;", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Lcom/sporty/android/core/model/autobet/LatestHistory;)V", "getSettingId", "()Ljava/lang/String;", "getStatus", "()I", "getOrderType", "getStake", "getMinOdds", "getMaxOdds", "getCreateTime", "()J", "getSelections", "()Ljava/util/List;", "getLatestHistory", "()Lcom/sporty/android/core/model/autobet/LatestHistory;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AutoBet {
    private final long createTime;
    private final LatestHistory latestHistory;
    private final String maxOdds;
    private final String minOdds;
    private final int orderType;
    private final List<AutoBetSelection> selections;
    private final String settingId;
    private final String stake;
    private final int status;

    public AutoBet(String str, int i, int i2, String str2, String str3, String str4, long j, List<AutoBetSelection> list, LatestHistory latestHistory) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.settingId = str;
        this.status = i;
        this.orderType = i2;
        this.stake = str2;
        this.minOdds = str3;
        this.maxOdds = str4;
        this.createTime = j;
        this.selections = list;
        this.latestHistory = latestHistory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoBet copy$default(AutoBet autoBet, String str, int i, int i2, String str2, String str3, String str4, long j, List list, LatestHistory latestHistory, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = autoBet.settingId;
        }
        if ((i3 & 2) != 0) {
            i = autoBet.status;
        }
        if ((i3 & 4) != 0) {
            i2 = autoBet.orderType;
        }
        if ((i3 & 8) != 0) {
            str2 = autoBet.stake;
        }
        if ((i3 & 16) != 0) {
            str3 = autoBet.minOdds;
        }
        if ((i3 & 32) != 0) {
            str4 = autoBet.maxOdds;
        }
        if ((i3 & 64) != 0) {
            j = autoBet.createTime;
        }
        if ((i3 & 128) != 0) {
            list = autoBet.selections;
        }
        if ((i3 & 256) != 0) {
            latestHistory = autoBet.latestHistory;
        }
        long j2 = j;
        String str5 = str3;
        String str6 = str4;
        int i4 = i2;
        String str7 = str2;
        return autoBet.copy(str, i, i4, str7, str5, str6, j2, list, latestHistory);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSettingId() {
        return this.settingId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStake() {
        return this.stake;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMinOdds() {
        return this.minOdds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMaxOdds() {
        return this.maxOdds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<AutoBetSelection> component8() {
        return this.selections;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final LatestHistory getLatestHistory() {
        return this.latestHistory;
    }

    public final AutoBet copy(String settingId, int status, int orderType, String stake, String minOdds, String maxOdds, long createTime, List<AutoBetSelection> selections, LatestHistory latestHistory) {
        settingId.getClass();
        stake.getClass();
        minOdds.getClass();
        maxOdds.getClass();
        selections.getClass();
        return new AutoBet(settingId, status, orderType, stake, minOdds, maxOdds, createTime, selections, latestHistory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoBet)) {
            return false;
        }
        AutoBet autoBet = (AutoBet) other;
        return Intrinsics.g(this.settingId, autoBet.settingId) && this.status == autoBet.status && this.orderType == autoBet.orderType && Intrinsics.g(this.stake, autoBet.stake) && Intrinsics.g(this.minOdds, autoBet.minOdds) && Intrinsics.g(this.maxOdds, autoBet.maxOdds) && this.createTime == autoBet.createTime && Intrinsics.g(this.selections, autoBet.selections) && Intrinsics.g(this.latestHistory, autoBet.latestHistory);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final LatestHistory getLatestHistory() {
        return this.latestHistory;
    }

    public final String getMaxOdds() {
        return this.maxOdds;
    }

    public final String getMinOdds() {
        return this.minOdds;
    }

    public final int getOrderType() {
        return this.orderType;
    }

    public final List<AutoBetSelection> getSelections() {
        return this.selections;
    }

    public final String getSettingId() {
        return this.settingId;
    }

    public final String getStake() {
        return this.stake;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iA = ai50.a(f87.a(gmf0.a(gmf0.a(gmf0.a(gpp.a(this.orderType, gpp.a(this.status, this.settingId.hashCode() * 31, 31), 31), 31, this.stake), 31, this.minOdds), 31, this.maxOdds), this.createTime, 31), 31, this.selections);
        LatestHistory latestHistory = this.latestHistory;
        return iA + (latestHistory == null ? 0 : latestHistory.hashCode());
    }

    public String toString() {
        String str = this.settingId;
        int i = this.status;
        int i2 = this.orderType;
        String str2 = this.stake;
        String str3 = this.minOdds;
        String str4 = this.maxOdds;
        long j = this.createTime;
        List<AutoBetSelection> list = this.selections;
        LatestHistory latestHistory = this.latestHistory;
        StringBuilder sbA = ml5.a(i, "AutoBet(settingId=", str, ", status=", ", orderType=");
        f78.b(i2, ", stake=", str2, ", minOdds=", sbA);
        hxa.c(sbA, str3, ", maxOdds=", str4, ", createTime=");
        sbA.append(j);
        sbA.append(", selections=");
        sbA.append(list);
        sbA.append(", latestHistory=");
        sbA.append(latestHistory);
        sbA.append(")");
        return sbA.toString();
    }
}
