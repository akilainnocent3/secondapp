package com.sporty.android.core.model.luckywheel;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.gpp;
import defpackage.ka1;
import defpackage.m2g;
import defpackage.uqe0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J^\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0014\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eÊ\u0001\u0002\b-¨\u0006,"}, d2 = {"Lcom/sporty/android/core/model/luckywheel/TicketInfo;", "", "type", "", "typeName", "", "ticketNum", "hasAvailableActivity", "", "expireDate", "", AnalyticsParam.EVENT_STATUS, "Lcom/sporty/android/core/model/luckywheel/LuckyWheelTicketStatus;", "idList", "", "<init>", "(ILjava/lang/String;ILjava/lang/Boolean;JLcom/sporty/android/core/model/luckywheel/LuckyWheelTicketStatus;Ljava/util/List;)V", "getType", "()I", "getTypeName", "()Ljava/lang/String;", "getTicketNum", "getHasAvailableActivity", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExpireDate", "()J", "getStatus", "()Lcom/sporty/android/core/model/luckywheel/LuckyWheelTicketStatus;", "getIdList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/String;ILjava/lang/Boolean;JLcom/sporty/android/core/model/luckywheel/LuckyWheelTicketStatus;Ljava/util/List;)Lcom/sporty/android/core/model/luckywheel/TicketInfo;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TicketInfo {
    private final long expireDate;
    private final Boolean hasAvailableActivity;
    private final List<Integer> idList;
    private final LuckyWheelTicketStatus status;
    private final int ticketNum;
    private final int type;
    private final String typeName;

    public TicketInfo(int i, String str, int i2, Boolean bool, long j, LuckyWheelTicketStatus luckyWheelTicketStatus, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : bool, (i3 & 16) != 0 ? 0L : j, (i3 & 32) != 0 ? LuckyWheelTicketStatus.ALL : luckyWheelTicketStatus, (i3 & 64) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketInfo copy$default(TicketInfo ticketInfo, int i, String str, int i2, Boolean bool, long j, LuckyWheelTicketStatus luckyWheelTicketStatus, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = ticketInfo.type;
        }
        if ((i3 & 2) != 0) {
            str = ticketInfo.typeName;
        }
        if ((i3 & 4) != 0) {
            i2 = ticketInfo.ticketNum;
        }
        if ((i3 & 8) != 0) {
            bool = ticketInfo.hasAvailableActivity;
        }
        if ((i3 & 16) != 0) {
            j = ticketInfo.expireDate;
        }
        if ((i3 & 32) != 0) {
            luckyWheelTicketStatus = ticketInfo.status;
        }
        if ((i3 & 64) != 0) {
            list = ticketInfo.idList;
        }
        long j2 = j;
        int i4 = i2;
        Boolean bool2 = bool;
        return ticketInfo.copy(i, str, i4, bool2, j2, luckyWheelTicketStatus, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTypeName() {
        return this.typeName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTicketNum() {
        return this.ticketNum;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getHasAvailableActivity() {
        return this.hasAvailableActivity;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getExpireDate() {
        return this.expireDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LuckyWheelTicketStatus getStatus() {
        return this.status;
    }

    public final List<Integer> component7() {
        return this.idList;
    }

    public final TicketInfo copy(int type, String typeName, int ticketNum, Boolean hasAvailableActivity, long expireDate, LuckyWheelTicketStatus status, List<Integer> idList) {
        status.getClass();
        idList.getClass();
        return new TicketInfo(type, typeName, ticketNum, hasAvailableActivity, expireDate, status, idList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketInfo)) {
            return false;
        }
        TicketInfo ticketInfo = (TicketInfo) other;
        return this.type == ticketInfo.type && Intrinsics.g(this.typeName, ticketInfo.typeName) && this.ticketNum == ticketInfo.ticketNum && Intrinsics.g(this.hasAvailableActivity, ticketInfo.hasAvailableActivity) && this.expireDate == ticketInfo.expireDate && this.status == ticketInfo.status && Intrinsics.g(this.idList, ticketInfo.idList);
    }

    public final long getExpireDate() {
        return this.expireDate;
    }

    public final Boolean getHasAvailableActivity() {
        return this.hasAvailableActivity;
    }

    public final List<Integer> getIdList() {
        return this.idList;
    }

    public final LuckyWheelTicketStatus getStatus() {
        return this.status;
    }

    public final int getTicketNum() {
        return this.ticketNum;
    }

    public final int getType() {
        return this.type;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type) * 31;
        String str = this.typeName;
        int iA = gpp.a(this.ticketNum, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Boolean bool = this.hasAvailableActivity;
        return this.idList.hashCode() + ((this.status.hashCode() + f87.a((iA + (bool != null ? bool.hashCode() : 0)) * 31, this.expireDate, 31)) * 31);
    }

    public String toString() {
        int i = this.type;
        String str = this.typeName;
        int i2 = this.ticketNum;
        Boolean bool = this.hasAvailableActivity;
        long j = this.expireDate;
        LuckyWheelTicketStatus luckyWheelTicketStatus = this.status;
        List<Integer> list = this.idList;
        StringBuilder sbA = uqe0.a(i, "TicketInfo(type=", ", typeName=", str, ", ticketNum=");
        sbA.append(i2);
        sbA.append(", hasAvailableActivity=");
        sbA.append(bool);
        sbA.append(", expireDate=");
        sbA.append(j);
        sbA.append(", status=");
        sbA.append(luckyWheelTicketStatus);
        return ka1.a(sbA, ", idList=", list, ")");
    }

    public TicketInfo(int i, String str, int i2, Boolean bool, long j, LuckyWheelTicketStatus luckyWheelTicketStatus, List<Integer> list) {
        luckyWheelTicketStatus.getClass();
        list.getClass();
        this.type = i;
        this.typeName = str;
        this.ticketNum = i2;
        this.hasAvailableActivity = bool;
        this.expireDate = j;
        this.status = luckyWheelTicketStatus;
        this.idList = list;
    }

    public TicketInfo() {
        this(0, null, 0, null, 0L, null, null, 127, null);
    }
}
