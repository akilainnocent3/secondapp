package com.sporty.android.core.model.remixbet;

import defpackage.d830;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0015¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/remixbet/RemixBetOrderRequest;", "", "orderId", "", "seq", "", "<init>", "(Ljava/lang/String;I)V", "getOrderId", "()Ljava/lang/String;", "getSeq", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RemixBetOrderRequest {
    private final String orderId;
    private final int seq;

    public RemixBetOrderRequest(String str, int i) {
        str.getClass();
        this.orderId = str;
        this.seq = i;
    }

    public static /* synthetic */ RemixBetOrderRequest copy$default(RemixBetOrderRequest remixBetOrderRequest, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = remixBetOrderRequest.orderId;
        }
        if ((i2 & 2) != 0) {
            i = remixBetOrderRequest.seq;
        }
        return remixBetOrderRequest.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSeq() {
        return this.seq;
    }

    public final RemixBetOrderRequest copy(String orderId, int seq) {
        orderId.getClass();
        return new RemixBetOrderRequest(orderId, seq);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemixBetOrderRequest)) {
            return false;
        }
        RemixBetOrderRequest remixBetOrderRequest = (RemixBetOrderRequest) other;
        return Intrinsics.g(this.orderId, remixBetOrderRequest.orderId) && this.seq == remixBetOrderRequest.seq;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final int getSeq() {
        return this.seq;
    }

    public int hashCode() {
        return Integer.hashCode(this.seq) + (this.orderId.hashCode() * 31);
    }

    public String toString() {
        return d830.a(this.seq, "RemixBetOrderRequest(orderId=", this.orderId, ", seq=", ")");
    }
}
