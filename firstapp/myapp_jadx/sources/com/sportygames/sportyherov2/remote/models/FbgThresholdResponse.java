package com.sportygames.sportyherov2.remote.models;

import defpackage.gmf0;
import defpackage.pr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sportygames/sportyherov2/remote/models/FbgThresholdResponse;", "", "fbgThreshold", "", "messageType", "", "sideBet", "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "getFbgThreshold", "()D", "getMessageType", "()Ljava/lang/String;", "getSideBet", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FbgThresholdResponse {
    public static final int $stable = 0;
    private final double fbgThreshold;
    private final String messageType;
    private final String sideBet;

    public FbgThresholdResponse(double d, String str, String str2) {
        str.getClass();
        this.fbgThreshold = d;
        this.messageType = str;
        this.sideBet = str2;
    }

    public static /* synthetic */ FbgThresholdResponse copy$default(FbgThresholdResponse fbgThresholdResponse, double d, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = fbgThresholdResponse.fbgThreshold;
        }
        if ((i & 2) != 0) {
            str = fbgThresholdResponse.messageType;
        }
        if ((i & 4) != 0) {
            str2 = fbgThresholdResponse.sideBet;
        }
        return fbgThresholdResponse.copy(d, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getFbgThreshold() {
        return this.fbgThreshold;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSideBet() {
        return this.sideBet;
    }

    public final FbgThresholdResponse copy(double fbgThreshold, String messageType, String sideBet) {
        messageType.getClass();
        return new FbgThresholdResponse(fbgThreshold, messageType, sideBet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FbgThresholdResponse)) {
            return false;
        }
        FbgThresholdResponse fbgThresholdResponse = (FbgThresholdResponse) other;
        return Double.compare(this.fbgThreshold, fbgThresholdResponse.fbgThreshold) == 0 && Intrinsics.g(this.messageType, fbgThresholdResponse.messageType) && Intrinsics.g(this.sideBet, fbgThresholdResponse.sideBet);
    }

    public final double getFbgThreshold() {
        return this.fbgThreshold;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getSideBet() {
        return this.sideBet;
    }

    public int hashCode() {
        int iA = gmf0.a(Double.hashCode(this.fbgThreshold) * 31, 31, this.messageType);
        String str = this.sideBet;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        double d = this.fbgThreshold;
        String str = this.messageType;
        String str2 = this.sideBet;
        StringBuilder sb = new StringBuilder("FbgThresholdResponse(fbgThreshold=");
        sb.append(d);
        sb.append(", messageType=");
        sb.append(str);
        return pr0.a(sb, ", sideBet=", str2, ")");
    }

    public /* synthetic */ FbgThresholdResponse(double d, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, str, str2);
    }
}
