package com.sporty.android.core.model.survey;

import com.google.gson.annotations.SerializedName;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/survey/DepositSurveyIds;", "", "depositPendingPage", "", "depositSuccessPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDepositPendingPage", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "upon_pending_message_shown", "getDepositSuccessPage", "upon_successful_message_shown", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DepositSurveyIds {

    @SerializedName("upon_pending_message_shown")
    private final String depositPendingPage;

    @SerializedName("upon_successful_message_shown")
    private final String depositSuccessPage;

    public DepositSurveyIds(String str, String str2) {
        this.depositPendingPage = str;
        this.depositSuccessPage = str2;
    }

    public static /* synthetic */ DepositSurveyIds copy$default(DepositSurveyIds depositSurveyIds, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depositSurveyIds.depositPendingPage;
        }
        if ((i & 2) != 0) {
            str2 = depositSurveyIds.depositSuccessPage;
        }
        return depositSurveyIds.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDepositPendingPage() {
        return this.depositPendingPage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDepositSuccessPage() {
        return this.depositSuccessPage;
    }

    public final DepositSurveyIds copy(String depositPendingPage, String depositSuccessPage) {
        return new DepositSurveyIds(depositPendingPage, depositSuccessPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepositSurveyIds)) {
            return false;
        }
        DepositSurveyIds depositSurveyIds = (DepositSurveyIds) other;
        return Intrinsics.g(this.depositPendingPage, depositSurveyIds.depositPendingPage) && Intrinsics.g(this.depositSuccessPage, depositSurveyIds.depositSuccessPage);
    }

    public final String getDepositPendingPage() {
        return this.depositPendingPage;
    }

    public final String getDepositSuccessPage() {
        return this.depositSuccessPage;
    }

    public int hashCode() {
        String str = this.depositPendingPage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.depositSuccessPage;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return tx5.a("DepositSurveyIds(depositPendingPage=", this.depositPendingPage, ", depositSuccessPage=", this.depositSuccessPage, ")");
    }
}
