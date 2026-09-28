package com.sporty.android.core.model.pocket.deposit.card3d;

import com.appsflyer.internal.m;
import defpackage.gmf0;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSCheckAuthPayerStatusRequest;", "", "userId", "", "orderId", "txId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getOrderId", "getTxId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Card3DSCheckAuthPayerStatusRequest {
    private final String orderId;
    private final String txId;
    private final String userId;

    public Card3DSCheckAuthPayerStatusRequest(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.userId = str;
        this.orderId = str2;
        this.txId = str3;
    }

    public static /* synthetic */ Card3DSCheckAuthPayerStatusRequest copy$default(Card3DSCheckAuthPayerStatusRequest card3DSCheckAuthPayerStatusRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = card3DSCheckAuthPayerStatusRequest.userId;
        }
        if ((i & 2) != 0) {
            str2 = card3DSCheckAuthPayerStatusRequest.orderId;
        }
        if ((i & 4) != 0) {
            str3 = card3DSCheckAuthPayerStatusRequest.txId;
        }
        return card3DSCheckAuthPayerStatusRequest.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTxId() {
        return this.txId;
    }

    public final Card3DSCheckAuthPayerStatusRequest copy(String userId, String orderId, String txId) {
        userId.getClass();
        orderId.getClass();
        txId.getClass();
        return new Card3DSCheckAuthPayerStatusRequest(userId, orderId, txId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Card3DSCheckAuthPayerStatusRequest)) {
            return false;
        }
        Card3DSCheckAuthPayerStatusRequest card3DSCheckAuthPayerStatusRequest = (Card3DSCheckAuthPayerStatusRequest) other;
        return Intrinsics.g(this.userId, card3DSCheckAuthPayerStatusRequest.userId) && Intrinsics.g(this.orderId, card3DSCheckAuthPayerStatusRequest.orderId) && Intrinsics.g(this.txId, card3DSCheckAuthPayerStatusRequest.txId);
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getTxId() {
        return this.txId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.txId.hashCode() + gmf0.a(this.userId.hashCode() * 31, 31, this.orderId);
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.orderId;
        return uf80.a(ux5.a("Card3DSCheckAuthPayerStatusRequest(userId=", str, ", orderId=", str2, ", txId="), this.txId, ")");
    }
}
