package com.sporty.android.core.model.patron;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.t160;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006 "}, d2 = {"Lcom/sporty/android/core/model/patron/VerifiedInfoResponse;", "", "isDisplay", "", "requirementId", "", "requirementName", "requirementValue", AnalyticsParam.EVENT_STATUS, "", "hasApproved", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "()Z", "getRequirementId", "()Ljava/lang/String;", "getRequirementName", "getRequirementValue", "getStatus", "()I", "getHasApproved", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VerifiedInfoResponse {
    private final boolean hasApproved;
    private final boolean isDisplay;
    private final String requirementId;
    private final String requirementName;
    private final String requirementValue;
    private final int status;

    public VerifiedInfoResponse(boolean z, String str, String str2, String str3, int i, boolean z2) {
        m.a(str, str2, str3);
        this.isDisplay = z;
        this.requirementId = str;
        this.requirementName = str2;
        this.requirementValue = str3;
        this.status = i;
        this.hasApproved = z2;
    }

    public static /* synthetic */ VerifiedInfoResponse copy$default(VerifiedInfoResponse verifiedInfoResponse, boolean z, String str, String str2, String str3, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = verifiedInfoResponse.isDisplay;
        }
        if ((i2 & 2) != 0) {
            str = verifiedInfoResponse.requirementId;
        }
        if ((i2 & 4) != 0) {
            str2 = verifiedInfoResponse.requirementName;
        }
        if ((i2 & 8) != 0) {
            str3 = verifiedInfoResponse.requirementValue;
        }
        if ((i2 & 16) != 0) {
            i = verifiedInfoResponse.status;
        }
        if ((i2 & 32) != 0) {
            z2 = verifiedInfoResponse.hasApproved;
        }
        int i3 = i;
        boolean z3 = z2;
        return verifiedInfoResponse.copy(z, str, str2, str3, i3, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsDisplay() {
        return this.isDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRequirementId() {
        return this.requirementId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRequirementName() {
        return this.requirementName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRequirementValue() {
        return this.requirementValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHasApproved() {
        return this.hasApproved;
    }

    public final VerifiedInfoResponse copy(boolean isDisplay, String requirementId, String requirementName, String requirementValue, int status, boolean hasApproved) {
        requirementId.getClass();
        requirementName.getClass();
        requirementValue.getClass();
        return new VerifiedInfoResponse(isDisplay, requirementId, requirementName, requirementValue, status, hasApproved);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifiedInfoResponse)) {
            return false;
        }
        VerifiedInfoResponse verifiedInfoResponse = (VerifiedInfoResponse) other;
        return this.isDisplay == verifiedInfoResponse.isDisplay && Intrinsics.g(this.requirementId, verifiedInfoResponse.requirementId) && Intrinsics.g(this.requirementName, verifiedInfoResponse.requirementName) && Intrinsics.g(this.requirementValue, verifiedInfoResponse.requirementValue) && this.status == verifiedInfoResponse.status && this.hasApproved == verifiedInfoResponse.hasApproved;
    }

    public final boolean getHasApproved() {
        return this.hasApproved;
    }

    public final String getRequirementId() {
        return this.requirementId;
    }

    public final String getRequirementName() {
        return this.requirementName;
    }

    public final String getRequirementValue() {
        return this.requirementValue;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasApproved) + gpp.a(this.status, gmf0.a(gmf0.a(gmf0.a(Boolean.hashCode(this.isDisplay) * 31, 31, this.requirementId), 31, this.requirementName), 31, this.requirementValue), 31);
    }

    public final boolean isDisplay() {
        return this.isDisplay;
    }

    public String toString() {
        boolean z = this.isDisplay;
        String str = this.requirementId;
        String str2 = this.requirementName;
        String str3 = this.requirementValue;
        int i = this.status;
        boolean z2 = this.hasApproved;
        StringBuilder sbA = t160.a("VerifiedInfoResponse(isDisplay=", ", requirementId=", str, ", requirementName=", z);
        hxa.c(sbA, str2, ", requirementValue=", str3, ", status=");
        sbA.append(i);
        sbA.append(", hasApproved=");
        sbA.append(z2);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ VerifiedInfoResponse(boolean z, String str, String str2, String str3, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, str3, i, (i2 & 32) != 0 ? false : z2);
    }
}
