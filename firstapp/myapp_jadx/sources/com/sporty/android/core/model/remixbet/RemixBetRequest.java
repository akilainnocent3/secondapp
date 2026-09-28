package com.sporty.android.core.model.remixbet;

import defpackage.hxa;
import defpackage.ng1;
import defpackage.uqe0;
import defpackage.w03;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Jf\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010#J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aÊ\u0001\u0002\b*¨\u0006)"}, d2 = {"Lcom/sporty/android/core/model/remixbet/RemixBetRequest;", "", "seq", "", "shareCode", "", "orderId", "currency", "orderType", "totalStake", "selections", "", "Lcom/sporty/android/core/model/remixbet/RemixBetSelectionRequest;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getSeq", "()I", "getShareCode", "()Ljava/lang/String;", "getOrderId", "getCurrency", "getOrderType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalStake", "getSelections", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/sporty/android/core/model/remixbet/RemixBetRequest;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RemixBetRequest {
    private final String currency;
    private final String orderId;
    private final Integer orderType;
    private final List<RemixBetSelectionRequest> selections;
    private final int seq;
    private final String shareCode;
    private final String totalStake;

    public RemixBetRequest(int i, String str, String str2, String str3, Integer num, String str4, List<RemixBetSelectionRequest> list) {
        this.seq = i;
        this.shareCode = str;
        this.orderId = str2;
        this.currency = str3;
        this.orderType = num;
        this.totalStake = str4;
        this.selections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemixBetRequest copy$default(RemixBetRequest remixBetRequest, int i, String str, String str2, String str3, Integer num, String str4, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = remixBetRequest.seq;
        }
        if ((i2 & 2) != 0) {
            str = remixBetRequest.shareCode;
        }
        if ((i2 & 4) != 0) {
            str2 = remixBetRequest.orderId;
        }
        if ((i2 & 8) != 0) {
            str3 = remixBetRequest.currency;
        }
        if ((i2 & 16) != 0) {
            num = remixBetRequest.orderType;
        }
        if ((i2 & 32) != 0) {
            str4 = remixBetRequest.totalStake;
        }
        if ((i2 & 64) != 0) {
            list = remixBetRequest.selections;
        }
        String str5 = str4;
        List list2 = list;
        Integer num2 = num;
        String str6 = str2;
        return remixBetRequest.copy(i, str, str6, str3, num2, str5, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSeq() {
        return this.seq;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getOrderType() {
        return this.orderType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTotalStake() {
        return this.totalStake;
    }

    public final List<RemixBetSelectionRequest> component7() {
        return this.selections;
    }

    public final RemixBetRequest copy(int seq, String shareCode, String orderId, String currency, Integer orderType, String totalStake, List<RemixBetSelectionRequest> selections) {
        return new RemixBetRequest(seq, shareCode, orderId, currency, orderType, totalStake, selections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemixBetRequest)) {
            return false;
        }
        RemixBetRequest remixBetRequest = (RemixBetRequest) other;
        return this.seq == remixBetRequest.seq && Intrinsics.g(this.shareCode, remixBetRequest.shareCode) && Intrinsics.g(this.orderId, remixBetRequest.orderId) && Intrinsics.g(this.currency, remixBetRequest.currency) && Intrinsics.g(this.orderType, remixBetRequest.orderType) && Intrinsics.g(this.totalStake, remixBetRequest.totalStake) && Intrinsics.g(this.selections, remixBetRequest.selections);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Integer getOrderType() {
        return this.orderType;
    }

    public final List<RemixBetSelectionRequest> getSelections() {
        return this.selections;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public final String getTotalStake() {
        return this.totalStake;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.seq) * 31;
        String str = this.shareCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.orderId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.orderType;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.totalStake;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<RemixBetSelectionRequest> list = this.selections;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = this.seq;
        String str = this.shareCode;
        String str2 = this.orderId;
        String str3 = this.currency;
        Integer num = this.orderType;
        String str4 = this.totalStake;
        List<RemixBetSelectionRequest> list = this.selections;
        StringBuilder sbA = uqe0.a(i, "RemixBetRequest(seq=", ", shareCode=", str, ", orderId=");
        hxa.c(sbA, str2, ", currency=", str3, ", orderType=");
        w03.a(num, ", totalStake=", str4, ", selections=", sbA);
        return ng1.a(sbA, list, ")");
    }
}
