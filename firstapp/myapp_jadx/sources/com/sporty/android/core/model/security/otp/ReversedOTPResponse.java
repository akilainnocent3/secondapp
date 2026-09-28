package com.sporty.android.core.model.security.otp;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.d830;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0015¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/security/otp/ReversedOTPResponse;", "", "lastVerifiedAt", "", AnalyticsParam.EVENT_STATUS, "", "<init>", "(Ljava/lang/String;I)V", "getLastVerifiedAt", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ReversedOTPResponse {
    private final String lastVerifiedAt;
    private final int status;

    public ReversedOTPResponse(String str, int i) {
        str.getClass();
        this.lastVerifiedAt = str;
        this.status = i;
    }

    public static /* synthetic */ ReversedOTPResponse copy$default(ReversedOTPResponse reversedOTPResponse, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = reversedOTPResponse.lastVerifiedAt;
        }
        if ((i2 & 2) != 0) {
            i = reversedOTPResponse.status;
        }
        return reversedOTPResponse.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLastVerifiedAt() {
        return this.lastVerifiedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final ReversedOTPResponse copy(String lastVerifiedAt, int status) {
        lastVerifiedAt.getClass();
        return new ReversedOTPResponse(lastVerifiedAt, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReversedOTPResponse)) {
            return false;
        }
        ReversedOTPResponse reversedOTPResponse = (ReversedOTPResponse) other;
        return Intrinsics.g(this.lastVerifiedAt, reversedOTPResponse.lastVerifiedAt) && this.status == reversedOTPResponse.status;
    }

    public final String getLastVerifiedAt() {
        return this.lastVerifiedAt;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Integer.hashCode(this.status) + (this.lastVerifiedAt.hashCode() * 31);
    }

    public String toString() {
        return d830.a(this.status, "ReversedOTPResponse(lastVerifiedAt=", this.lastVerifiedAt, ", status=", ")");
    }

    public /* synthetic */ ReversedOTPResponse(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, i);
    }
}
