package com.sporty.android.core.model.primaryphone;

import defpackage.gmf0;
import defpackage.mtg0;
import defpackage.uf80;
import defpackage.uts;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fÊ\u0001\u0002\b\u001e¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/core/model/primaryphone/GetReviewedPrimaryPhoneResult;", "", "currentPhone", "", "newPhone", "phoneCountryCode", "review", "", "validTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getCurrentPhone", "()Ljava/lang/String;", "getNewPhone", "getPhoneCountryCode", "getReview", "()Z", "getValidTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GetReviewedPrimaryPhoneResult {
    private final String currentPhone;
    private final String newPhone;
    private final String phoneCountryCode;
    private final boolean review;
    private final String validTime;

    public /* synthetic */ GetReviewedPrimaryPhoneResult(String str, String str2, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str4);
    }

    public static /* synthetic */ GetReviewedPrimaryPhoneResult copy$default(GetReviewedPrimaryPhoneResult getReviewedPrimaryPhoneResult, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getReviewedPrimaryPhoneResult.currentPhone;
        }
        if ((i & 2) != 0) {
            str2 = getReviewedPrimaryPhoneResult.newPhone;
        }
        if ((i & 4) != 0) {
            str3 = getReviewedPrimaryPhoneResult.phoneCountryCode;
        }
        if ((i & 8) != 0) {
            z = getReviewedPrimaryPhoneResult.review;
        }
        if ((i & 16) != 0) {
            str4 = getReviewedPrimaryPhoneResult.validTime;
        }
        String str5 = str4;
        String str6 = str3;
        return getReviewedPrimaryPhoneResult.copy(str, str2, str6, z, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrentPhone() {
        return this.currentPhone;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNewPhone() {
        return this.newPhone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getReview() {
        return this.review;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValidTime() {
        return this.validTime;
    }

    public final GetReviewedPrimaryPhoneResult copy(String currentPhone, String newPhone, String phoneCountryCode, boolean review, String validTime) {
        currentPhone.getClass();
        phoneCountryCode.getClass();
        return new GetReviewedPrimaryPhoneResult(currentPhone, newPhone, phoneCountryCode, review, validTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetReviewedPrimaryPhoneResult)) {
            return false;
        }
        GetReviewedPrimaryPhoneResult getReviewedPrimaryPhoneResult = (GetReviewedPrimaryPhoneResult) other;
        return Intrinsics.g(this.currentPhone, getReviewedPrimaryPhoneResult.currentPhone) && Intrinsics.g(this.newPhone, getReviewedPrimaryPhoneResult.newPhone) && Intrinsics.g(this.phoneCountryCode, getReviewedPrimaryPhoneResult.phoneCountryCode) && this.review == getReviewedPrimaryPhoneResult.review && Intrinsics.g(this.validTime, getReviewedPrimaryPhoneResult.validTime);
    }

    public final String getCurrentPhone() {
        return this.currentPhone;
    }

    public final String getNewPhone() {
        return this.newPhone;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final boolean getReview() {
        return this.review;
    }

    public final String getValidTime() {
        return this.validTime;
    }

    public int hashCode() {
        int iHashCode = this.currentPhone.hashCode() * 31;
        String str = this.newPhone;
        int iA = mtg0.a(gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.phoneCountryCode), 31, this.review);
        String str2 = this.validTime;
        return iA + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.currentPhone;
        String str2 = this.newPhone;
        String str3 = this.phoneCountryCode;
        boolean z = this.review;
        String str4 = this.validTime;
        StringBuilder sbA = ux5.a("GetReviewedPrimaryPhoneResult(currentPhone=", str, ", newPhone=", str2, ", phoneCountryCode=");
        uts.b(str3, ", review=", ", validTime=", sbA, z);
        return uf80.a(sbA, str4, ")");
    }

    public GetReviewedPrimaryPhoneResult(String str, String str2, String str3, boolean z, String str4) {
        str.getClass();
        str3.getClass();
        this.currentPhone = str;
        this.newPhone = str2;
        this.phoneCountryCode = str3;
        this.review = z;
        this.validTime = str4;
    }
}
