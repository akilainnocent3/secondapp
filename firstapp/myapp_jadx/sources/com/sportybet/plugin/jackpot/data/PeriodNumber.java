package com.sportybet.plugin.jackpot.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001a"}, d2 = {"Lcom/sportybet/plugin/jackpot/data/PeriodNumber;", "", AnalyticsParam.EVENT_PARAM_ID, "", "periodNumber", "betType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getPeriodNumber", "setPeriodNumber", "getBetType", "setBetType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PeriodNumber {
    public static final int $stable = 8;
    private String betType;
    private String id;
    private String periodNumber;

    public /* synthetic */ PeriodNumber(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ PeriodNumber copy$default(PeriodNumber periodNumber, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = periodNumber.id;
        }
        if ((i & 2) != 0) {
            str2 = periodNumber.periodNumber;
        }
        if ((i & 4) != 0) {
            str3 = periodNumber.betType;
        }
        return periodNumber.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPeriodNumber() {
        return this.periodNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBetType() {
        return this.betType;
    }

    public final PeriodNumber copy(String id, String periodNumber, String betType) {
        return new PeriodNumber(id, periodNumber, betType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeriodNumber)) {
            return false;
        }
        PeriodNumber periodNumber = (PeriodNumber) other;
        return Intrinsics.g(this.id, periodNumber.id) && Intrinsics.g(this.periodNumber, periodNumber.periodNumber) && Intrinsics.g(this.betType, periodNumber.betType);
    }

    public final String getBetType() {
        return this.betType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPeriodNumber() {
        return this.periodNumber;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.periodNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.betType;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setBetType(String str) {
        this.betType = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setPeriodNumber(String str) {
        this.periodNumber = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.periodNumber;
        return uf80.a(ux5.a("PeriodNumber(id=", str, ", periodNumber=", str2, ", betType="), this.betType, ")");
    }

    public PeriodNumber(String str, String str2, String str3) {
        this.id = str;
        this.periodNumber = str2;
        this.betType = str3;
    }

    public PeriodNumber() {
        this(null, null, null, 7, null);
    }
}
