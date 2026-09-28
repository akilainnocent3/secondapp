package com.sportybet.android.account.international.data.model;

import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\fÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0017"}, d2 = {"Lcom/sportybet/android/account/international/data/model/FacialRecognitionStatusResponse;", "", AnalyticsParam.EVENT_STATUS, "", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getToken", "isApproved", "", "()Z", "isRejected", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FacialRecognitionStatusResponse {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String STATUS_APPROVED = "approved";

    @Deprecated
    public static final String STATUS_REJECTED = "reproved";
    private final String status;
    private final String token;

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/account/international/data/model/FacialRecognitionStatusResponse$Companion;", "", "<init>", "()V", "STATUS_APPROVED", "", "STATUS_REJECTED", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FacialRecognitionStatusResponse(String str, String str2) {
        this.status = str;
        this.token = str2;
    }

    public static /* synthetic */ FacialRecognitionStatusResponse copy$default(FacialRecognitionStatusResponse facialRecognitionStatusResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = facialRecognitionStatusResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = facialRecognitionStatusResponse.token;
        }
        return facialRecognitionStatusResponse.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final FacialRecognitionStatusResponse copy(String status, String token) {
        return new FacialRecognitionStatusResponse(status, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FacialRecognitionStatusResponse)) {
            return false;
        }
        FacialRecognitionStatusResponse facialRecognitionStatusResponse = (FacialRecognitionStatusResponse) other;
        return Intrinsics.g(this.status, facialRecognitionStatusResponse.status) && Intrinsics.g(this.token, facialRecognitionStatusResponse.token);
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.token;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isApproved() {
        String str = this.status;
        if (str != null) {
            return str.equalsIgnoreCase(STATUS_APPROVED);
        }
        return false;
    }

    public final boolean isRejected() {
        String str = this.status;
        if (str != null) {
            return str.equalsIgnoreCase(STATUS_REJECTED);
        }
        return false;
    }

    public String toString() {
        return tx5.a("FacialRecognitionStatusResponse(status=", this.status, yFmFZvuWxAYfEj.iufbNNR, this.token, ")");
    }
}
