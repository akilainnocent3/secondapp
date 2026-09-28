package com.sportybet.android.verifybet.apidata;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.RTicket;
import defpackage.lng;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0006HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010Ê\u0001\u0002\b\u001dÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001c"}, d2 = {"Lcom/sportybet/android/verifybet/apidata/BetTicketDetailData;", "", "orderInfoVO", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/plugin/realsports/data/RTicket;", "userName", "", "isSwipe", "", "shouldShowBootMsg", "<init>", "(Lcom/sporty/android/common/network/data/BaseResponse;Ljava/lang/String;ZZ)V", "getOrderInfoVO", "()Lcom/sporty/android/common/network/data/BaseResponse;", "getUserName", "()Ljava/lang/String;", "()Z", "getShouldShowBootMsg", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetTicketDetailData {
    public static final int $stable = 8;
    private final boolean isSwipe;
    private final BaseResponse<RTicket> orderInfoVO;
    private final boolean shouldShowBootMsg;
    private final String userName;

    public BetTicketDetailData(BaseResponse<RTicket> baseResponse, String str, boolean z, boolean z2) {
        baseResponse.getClass();
        this.orderInfoVO = baseResponse;
        this.userName = str;
        this.isSwipe = z;
        this.shouldShowBootMsg = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetTicketDetailData copy$default(BetTicketDetailData betTicketDetailData, BaseResponse baseResponse, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            baseResponse = betTicketDetailData.orderInfoVO;
        }
        if ((i & 2) != 0) {
            str = betTicketDetailData.userName;
        }
        if ((i & 4) != 0) {
            z = betTicketDetailData.isSwipe;
        }
        if ((i & 8) != 0) {
            z2 = betTicketDetailData.shouldShowBootMsg;
        }
        return betTicketDetailData.copy(baseResponse, str, z, z2);
    }

    public final BaseResponse<RTicket> component1() {
        return this.orderInfoVO;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSwipe() {
        return this.isSwipe;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShouldShowBootMsg() {
        return this.shouldShowBootMsg;
    }

    public final BetTicketDetailData copy(BaseResponse<RTicket> orderInfoVO, String userName, boolean isSwipe, boolean shouldShowBootMsg) {
        orderInfoVO.getClass();
        return new BetTicketDetailData(orderInfoVO, userName, isSwipe, shouldShowBootMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetTicketDetailData)) {
            return false;
        }
        BetTicketDetailData betTicketDetailData = (BetTicketDetailData) other;
        return Intrinsics.g(this.orderInfoVO, betTicketDetailData.orderInfoVO) && Intrinsics.g(this.userName, betTicketDetailData.userName) && this.isSwipe == betTicketDetailData.isSwipe && this.shouldShowBootMsg == betTicketDetailData.shouldShowBootMsg;
    }

    public final BaseResponse<RTicket> getOrderInfoVO() {
        return this.orderInfoVO;
    }

    public final boolean getShouldShowBootMsg() {
        return this.shouldShowBootMsg;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iHashCode = this.orderInfoVO.hashCode() * 31;
        String str = this.userName;
        return Boolean.hashCode(this.shouldShowBootMsg) + mtg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSwipe);
    }

    public final boolean isSwipe() {
        return this.isSwipe;
    }

    public String toString() {
        BaseResponse<RTicket> baseResponse = this.orderInfoVO;
        String str = this.userName;
        boolean z = this.isSwipe;
        boolean z2 = this.shouldShowBootMsg;
        StringBuilder sb = new StringBuilder("BetTicketDetailData(orderInfoVO=");
        sb.append(baseResponse);
        sb.append(", userName=");
        sb.append(str);
        sb.append(", isSwipe=");
        return lng.a(", shouldShowBootMsg=", ")", sb, z, z2);
    }
}
