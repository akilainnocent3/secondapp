package com.sporty.android.core.model.survey;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020.HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R'\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R'\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR'\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR'\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(!¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010¨\u00060"}, d2 = {"Lcom/sporty/android/core/model/survey/AvailableSurveyIds;", "", "homepage", "", "openBets", "betHistory", "placeBet", "Lcom/sporty/android/core/model/survey/PlaceBetSurveyId;", AnalyticsEvent.DEPOSIT, "Lcom/sporty/android/core/model/survey/DepositSurveyIds;", "withdraw", "Lcom/sporty/android/core/model/survey/WithdrawalSurveyId;", "transactionPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/survey/PlaceBetSurveyId;Lcom/sporty/android/core/model/survey/DepositSurveyIds;Lcom/sporty/android/core/model/survey/WithdrawalSurveyId;Ljava/lang/String;)V", "getHomepage", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getOpenBets", "open_bets", "getBetHistory", "bet_history", "getPlaceBet", "()Lcom/sporty/android/core/model/survey/PlaceBetSurveyId;", "after_successfully_placed_a_bet", "getDeposit", "()Lcom/sporty/android/core/model/survey/DepositSurveyIds;", "after_successfully_deposit", "getWithdraw", "()Lcom/sporty/android/core/model/survey/WithdrawalSurveyId;", "after_successfully_withdrawal", "getTransactionPage", "transaction_page", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AvailableSurveyIds {

    @SerializedName("bet_history")
    private final String betHistory;

    @SerializedName("after_successfully_deposit")
    private final DepositSurveyIds deposit;

    @SerializedName("homepage")
    private final String homepage;

    @SerializedName("open_bets")
    private final String openBets;

    @SerializedName("after_successfully_placed_a_bet")
    private final PlaceBetSurveyId placeBet;

    @SerializedName("transaction_page")
    private final String transactionPage;

    @SerializedName("after_successfully_withdrawal")
    private final WithdrawalSurveyId withdraw;

    public AvailableSurveyIds(String str, String str2, String str3, PlaceBetSurveyId placeBetSurveyId, DepositSurveyIds depositSurveyIds, WithdrawalSurveyId withdrawalSurveyId, String str4) {
        this.homepage = str;
        this.openBets = str2;
        this.betHistory = str3;
        this.placeBet = placeBetSurveyId;
        this.deposit = depositSurveyIds;
        this.withdraw = withdrawalSurveyId;
        this.transactionPage = str4;
    }

    public static /* synthetic */ AvailableSurveyIds copy$default(AvailableSurveyIds availableSurveyIds, String str, String str2, String str3, PlaceBetSurveyId placeBetSurveyId, DepositSurveyIds depositSurveyIds, WithdrawalSurveyId withdrawalSurveyId, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = availableSurveyIds.homepage;
        }
        if ((i & 2) != 0) {
            str2 = availableSurveyIds.openBets;
        }
        if ((i & 4) != 0) {
            str3 = availableSurveyIds.betHistory;
        }
        if ((i & 8) != 0) {
            placeBetSurveyId = availableSurveyIds.placeBet;
        }
        if ((i & 16) != 0) {
            depositSurveyIds = availableSurveyIds.deposit;
        }
        if ((i & 32) != 0) {
            withdrawalSurveyId = availableSurveyIds.withdraw;
        }
        if ((i & 64) != 0) {
            str4 = availableSurveyIds.transactionPage;
        }
        WithdrawalSurveyId withdrawalSurveyId2 = withdrawalSurveyId;
        String str5 = str4;
        DepositSurveyIds depositSurveyIds2 = depositSurveyIds;
        String str6 = str3;
        return availableSurveyIds.copy(str, str2, str6, placeBetSurveyId, depositSurveyIds2, withdrawalSurveyId2, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHomepage() {
        return this.homepage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOpenBets() {
        return this.openBets;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBetHistory() {
        return this.betHistory;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PlaceBetSurveyId getPlaceBet() {
        return this.placeBet;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DepositSurveyIds getDeposit() {
        return this.deposit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final WithdrawalSurveyId getWithdraw() {
        return this.withdraw;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTransactionPage() {
        return this.transactionPage;
    }

    public final AvailableSurveyIds copy(String homepage, String openBets, String betHistory, PlaceBetSurveyId placeBet, DepositSurveyIds deposit, WithdrawalSurveyId withdraw, String transactionPage) {
        return new AvailableSurveyIds(homepage, openBets, betHistory, placeBet, deposit, withdraw, transactionPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableSurveyIds)) {
            return false;
        }
        AvailableSurveyIds availableSurveyIds = (AvailableSurveyIds) other;
        return Intrinsics.g(this.homepage, availableSurveyIds.homepage) && Intrinsics.g(this.openBets, availableSurveyIds.openBets) && Intrinsics.g(this.betHistory, availableSurveyIds.betHistory) && Intrinsics.g(this.placeBet, availableSurveyIds.placeBet) && Intrinsics.g(this.deposit, availableSurveyIds.deposit) && Intrinsics.g(this.withdraw, availableSurveyIds.withdraw) && Intrinsics.g(this.transactionPage, availableSurveyIds.transactionPage);
    }

    public final String getBetHistory() {
        return this.betHistory;
    }

    public final DepositSurveyIds getDeposit() {
        return this.deposit;
    }

    public final String getHomepage() {
        return this.homepage;
    }

    public final String getOpenBets() {
        return this.openBets;
    }

    public final PlaceBetSurveyId getPlaceBet() {
        return this.placeBet;
    }

    public final String getTransactionPage() {
        return this.transactionPage;
    }

    public final WithdrawalSurveyId getWithdraw() {
        return this.withdraw;
    }

    public int hashCode() {
        String str = this.homepage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.openBets;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.betHistory;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PlaceBetSurveyId placeBetSurveyId = this.placeBet;
        int iHashCode4 = (iHashCode3 + (placeBetSurveyId == null ? 0 : placeBetSurveyId.hashCode())) * 31;
        DepositSurveyIds depositSurveyIds = this.deposit;
        int iHashCode5 = (iHashCode4 + (depositSurveyIds == null ? 0 : depositSurveyIds.hashCode())) * 31;
        WithdrawalSurveyId withdrawalSurveyId = this.withdraw;
        int iHashCode6 = (iHashCode5 + (withdrawalSurveyId == null ? 0 : withdrawalSurveyId.hashCode())) * 31;
        String str4 = this.transactionPage;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.homepage;
        String str2 = this.openBets;
        String str3 = this.betHistory;
        PlaceBetSurveyId placeBetSurveyId = this.placeBet;
        DepositSurveyIds depositSurveyIds = this.deposit;
        WithdrawalSurveyId withdrawalSurveyId = this.withdraw;
        String str4 = this.transactionPage;
        StringBuilder sbA = ux5.a("AvailableSurveyIds(homepage=", str, ", openBets=", str2, ", betHistory=");
        sbA.append(str3);
        sbA.append(", placeBet=");
        sbA.append(placeBetSurveyId);
        sbA.append(", deposit=");
        sbA.append(depositSurveyIds);
        sbA.append(", withdraw=");
        sbA.append(withdrawalSurveyId);
        sbA.append(", transactionPage=");
        return uf80.a(sbA, str4, ")");
    }
}
