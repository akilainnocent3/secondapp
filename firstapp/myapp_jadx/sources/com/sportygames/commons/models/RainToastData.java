package com.sportygames.commons.models;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.chat.remote.models.ClaimLimit;
import defpackage.hxa;
import defpackage.pq6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Jl\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lcom/sportygames/commons/models/RainToastData;", "", AnalyticsParam.EVENT_PARAM_ID, "", "toastType", "", "primaryData", "secondaryData", "visibleDuration", "", "visibility", "claimLimit", "Lcom/sportygames/chat/remote/models/ClaimLimit;", "errorType", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Lcom/sportygames/chat/remote/models/ClaimLimit;I)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getToastType", "()Ljava/lang/String;", "getPrimaryData", "getSecondaryData", "getVisibleDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVisibility", "getClaimLimit", "()Lcom/sportygames/chat/remote/models/ClaimLimit;", "getErrorType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Lcom/sportygames/chat/remote/models/ClaimLimit;I)Lcom/sportygames/commons/models/RainToastData;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RainToastData {
    public static final int $stable = 0;
    private final ClaimLimit claimLimit;
    private final int errorType;
    private final Integer id;
    private final String primaryData;
    private final String secondaryData;
    private final String toastType;
    private final Integer visibility;
    private final Long visibleDuration;

    public /* synthetic */ RainToastData(Integer num, String str, String str2, String str3, Long l, Integer num2, ClaimLimit claimLimit, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, str3, l, num2, claimLimit, (i2 & 128) != 0 ? 0 : i);
    }

    public static /* synthetic */ RainToastData copy$default(RainToastData rainToastData, Integer num, String str, String str2, String str3, Long l, Integer num2, ClaimLimit claimLimit, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = rainToastData.id;
        }
        if ((i2 & 2) != 0) {
            str = rainToastData.toastType;
        }
        if ((i2 & 4) != 0) {
            str2 = rainToastData.primaryData;
        }
        if ((i2 & 8) != 0) {
            str3 = rainToastData.secondaryData;
        }
        if ((i2 & 16) != 0) {
            l = rainToastData.visibleDuration;
        }
        if ((i2 & 32) != 0) {
            num2 = rainToastData.visibility;
        }
        if ((i2 & 64) != 0) {
            claimLimit = rainToastData.claimLimit;
        }
        if ((i2 & 128) != 0) {
            i = rainToastData.errorType;
        }
        ClaimLimit claimLimit2 = claimLimit;
        int i3 = i;
        Long l2 = l;
        Integer num3 = num2;
        return rainToastData.copy(num, str, str2, str3, l2, num3, claimLimit2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToastType() {
        return this.toastType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPrimaryData() {
        return this.primaryData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSecondaryData() {
        return this.secondaryData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getVisibleDuration() {
        return this.visibleDuration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getVisibility() {
        return this.visibility;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ClaimLimit getClaimLimit() {
        return this.claimLimit;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getErrorType() {
        return this.errorType;
    }

    public final RainToastData copy(Integer id, String toastType, String primaryData, String secondaryData, Long visibleDuration, Integer visibility, ClaimLimit claimLimit, int errorType) {
        return new RainToastData(id, toastType, primaryData, secondaryData, visibleDuration, visibility, claimLimit, errorType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RainToastData)) {
            return false;
        }
        RainToastData rainToastData = (RainToastData) other;
        return Intrinsics.g(this.id, rainToastData.id) && Intrinsics.g(this.toastType, rainToastData.toastType) && Intrinsics.g(this.primaryData, rainToastData.primaryData) && Intrinsics.g(this.secondaryData, rainToastData.secondaryData) && Intrinsics.g(this.visibleDuration, rainToastData.visibleDuration) && Intrinsics.g(this.visibility, rainToastData.visibility) && Intrinsics.g(this.claimLimit, rainToastData.claimLimit) && this.errorType == rainToastData.errorType;
    }

    public final ClaimLimit getClaimLimit() {
        return this.claimLimit;
    }

    public final int getErrorType() {
        return this.errorType;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getPrimaryData() {
        return this.primaryData;
    }

    public final String getSecondaryData() {
        return this.secondaryData;
    }

    public final String getToastType() {
        return this.toastType;
    }

    public final Integer getVisibility() {
        return this.visibility;
    }

    public final Long getVisibleDuration() {
        return this.visibleDuration;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.toastType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.primaryData;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondaryData;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.visibleDuration;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.visibility;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ClaimLimit claimLimit = this.claimLimit;
        return Integer.hashCode(this.errorType) + ((iHashCode6 + (claimLimit != null ? claimLimit.hashCode() : 0)) * 31);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.toastType;
        String str2 = this.primaryData;
        String str3 = this.secondaryData;
        Long l = this.visibleDuration;
        Integer num2 = this.visibility;
        ClaimLimit claimLimit = this.claimLimit;
        int i = this.errorType;
        StringBuilder sbA = pq6.a(num, "RainToastData(id=", ", toastType=", str, ", primaryData=");
        hxa.c(sbA, str2, ", secondaryData=", str3, ", visibleDuration=");
        sbA.append(l);
        sbA.append(", visibility=");
        sbA.append(num2);
        sbA.append(", claimLimit=");
        sbA.append(claimLimit);
        sbA.append(", errorType=");
        sbA.append(i);
        sbA.append(")");
        return sbA.toString();
    }

    public RainToastData(Integer num, String str, String str2, String str3, Long l, Integer num2, ClaimLimit claimLimit, int i) {
        this.id = num;
        this.toastType = str;
        this.primaryData = str2;
        this.secondaryData = str3;
        this.visibleDuration = l;
        this.visibility = num2;
        this.claimLimit = claimLimit;
        this.errorType = i;
    }
}
