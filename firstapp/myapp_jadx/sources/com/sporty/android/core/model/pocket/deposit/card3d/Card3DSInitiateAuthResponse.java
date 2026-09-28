package com.sporty.android.core.model.pocket.deposit.card3d;

import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rÊ\u0001\u0002\b\u001a¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSInitiateAuthResponse;", "", "support3ds", "", "orderId", "", "txId", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getSupport3ds", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOrderId", "()Ljava/lang/String;", "getTxId", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSInitiateAuthResponse;", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Card3DSInitiateAuthResponse {
    private final String orderId;
    private final Boolean support3ds;
    private final String txId;

    public Card3DSInitiateAuthResponse(Boolean bool, String str, String str2) {
        this.support3ds = bool;
        this.orderId = str;
        this.txId = str2;
    }

    public static /* synthetic */ Card3DSInitiateAuthResponse copy$default(Card3DSInitiateAuthResponse card3DSInitiateAuthResponse, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = card3DSInitiateAuthResponse.support3ds;
        }
        if ((i & 2) != 0) {
            str = card3DSInitiateAuthResponse.orderId;
        }
        if ((i & 4) != 0) {
            str2 = card3DSInitiateAuthResponse.txId;
        }
        return card3DSInitiateAuthResponse.copy(bool, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSupport3ds() {
        return this.support3ds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTxId() {
        return this.txId;
    }

    public final Card3DSInitiateAuthResponse copy(Boolean support3ds, String orderId, String txId) {
        return new Card3DSInitiateAuthResponse(support3ds, orderId, txId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Card3DSInitiateAuthResponse)) {
            return false;
        }
        Card3DSInitiateAuthResponse card3DSInitiateAuthResponse = (Card3DSInitiateAuthResponse) other;
        return Intrinsics.g(this.support3ds, card3DSInitiateAuthResponse.support3ds) && Intrinsics.g(this.orderId, card3DSInitiateAuthResponse.orderId) && Intrinsics.g(this.txId, card3DSInitiateAuthResponse.txId);
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Boolean getSupport3ds() {
        return this.support3ds;
    }

    public final String getTxId() {
        return this.txId;
    }

    public int hashCode() {
        Boolean bool = this.support3ds;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.orderId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.txId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.support3ds;
        String str = this.orderId;
        String str2 = this.txId;
        StringBuilder sb = new StringBuilder("Card3DSInitiateAuthResponse(support3ds=");
        sb.append(bool);
        sb.append(", orderId=");
        sb.append(str);
        sb.append(", txId=");
        return uf80.a(sb, str2, ")");
    }
}
