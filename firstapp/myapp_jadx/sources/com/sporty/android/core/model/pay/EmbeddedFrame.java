package com.sporty.android.core.model.pay;

import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/pay/EmbeddedFrame;", "", "transactionId", "", "clientKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTransactionId", "()Ljava/lang/String;", "getClientKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EmbeddedFrame {
    private final String clientKey;
    private final String transactionId;

    public /* synthetic */ EmbeddedFrame(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ EmbeddedFrame copy$default(EmbeddedFrame embeddedFrame, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = embeddedFrame.transactionId;
        }
        if ((i & 2) != 0) {
            str2 = embeddedFrame.clientKey;
        }
        return embeddedFrame.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientKey() {
        return this.clientKey;
    }

    public final EmbeddedFrame copy(String transactionId, String clientKey) {
        return new EmbeddedFrame(transactionId, clientKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbeddedFrame)) {
            return false;
        }
        EmbeddedFrame embeddedFrame = (EmbeddedFrame) other;
        return Intrinsics.g(this.transactionId, embeddedFrame.transactionId) && Intrinsics.g(this.clientKey, embeddedFrame.clientKey);
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.transactionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientKey;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return tx5.a("EmbeddedFrame(transactionId=", this.transactionId, ", clientKey=", this.clientKey, ")");
    }

    public EmbeddedFrame(String str, String str2) {
        this.transactionId = str;
        this.clientKey = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmbeddedFrame() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
