package com.sportybet.android.instantwin.newtork.model.response.doubleornothing;

import com.google.gson.annotations.SerializedName;
import defpackage.gpp;
import defpackage.ml5;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R'\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R'\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bÊ\u0001\f\b)\u0012\b\b*\u0012\u0004\b\u0003\u0010\u0000¨\u0006("}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingCreateAndSettleResult;", "", "challengeId", "", "roundNumber", "", "maxRounds", "odds", "", "currentRoundResult", "Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingCurrentRoundResult;", "nextRoundState", "Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingNextRoundState;", "<init>", "(Ljava/lang/String;IIDLcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingCurrentRoundResult;Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingNextRoundState;)V", "getChallengeId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getRoundNumber", "()I", "getMaxRounds", "getOdds", "()D", "getCurrentRoundResult", "()Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingCurrentRoundResult;", "getNextRoundState", "()Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingNextRoundState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkDoubleOrNothingCreateAndSettleResult {
    public static final int $stable = NetworkDoubleOrNothingNextRoundState.$stable | NetworkDoubleOrNothingCurrentRoundResult.$stable;

    @SerializedName("challengeId")
    private final String challengeId;

    @SerializedName("currentRoundResult")
    private final NetworkDoubleOrNothingCurrentRoundResult currentRoundResult;

    @SerializedName("maxRounds")
    private final int maxRounds;

    @SerializedName("nextRoundState")
    private final NetworkDoubleOrNothingNextRoundState nextRoundState;

    @SerializedName("odds")
    private final double odds;

    @SerializedName("roundNumber")
    private final int roundNumber;

    public NetworkDoubleOrNothingCreateAndSettleResult(String str, int i, int i2, double d, NetworkDoubleOrNothingCurrentRoundResult networkDoubleOrNothingCurrentRoundResult, NetworkDoubleOrNothingNextRoundState networkDoubleOrNothingNextRoundState) {
        this.challengeId = str;
        this.roundNumber = i;
        this.maxRounds = i2;
        this.odds = d;
        this.currentRoundResult = networkDoubleOrNothingCurrentRoundResult;
        this.nextRoundState = networkDoubleOrNothingNextRoundState;
    }

    public static /* synthetic */ NetworkDoubleOrNothingCreateAndSettleResult copy$default(NetworkDoubleOrNothingCreateAndSettleResult networkDoubleOrNothingCreateAndSettleResult, String str, int i, int i2, double d, NetworkDoubleOrNothingCurrentRoundResult networkDoubleOrNothingCurrentRoundResult, NetworkDoubleOrNothingNextRoundState networkDoubleOrNothingNextRoundState, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = networkDoubleOrNothingCreateAndSettleResult.challengeId;
        }
        if ((i3 & 2) != 0) {
            i = networkDoubleOrNothingCreateAndSettleResult.roundNumber;
        }
        if ((i3 & 4) != 0) {
            i2 = networkDoubleOrNothingCreateAndSettleResult.maxRounds;
        }
        if ((i3 & 8) != 0) {
            d = networkDoubleOrNothingCreateAndSettleResult.odds;
        }
        if ((i3 & 16) != 0) {
            networkDoubleOrNothingCurrentRoundResult = networkDoubleOrNothingCreateAndSettleResult.currentRoundResult;
        }
        if ((i3 & 32) != 0) {
            networkDoubleOrNothingNextRoundState = networkDoubleOrNothingCreateAndSettleResult.nextRoundState;
        }
        double d2 = d;
        int i4 = i2;
        return networkDoubleOrNothingCreateAndSettleResult.copy(str, i, i4, d2, networkDoubleOrNothingCurrentRoundResult, networkDoubleOrNothingNextRoundState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChallengeId() {
        return this.challengeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRoundNumber() {
        return this.roundNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxRounds() {
        return this.maxRounds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final NetworkDoubleOrNothingCurrentRoundResult getCurrentRoundResult() {
        return this.currentRoundResult;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final NetworkDoubleOrNothingNextRoundState getNextRoundState() {
        return this.nextRoundState;
    }

    public final NetworkDoubleOrNothingCreateAndSettleResult copy(String challengeId, int roundNumber, int maxRounds, double odds, NetworkDoubleOrNothingCurrentRoundResult currentRoundResult, NetworkDoubleOrNothingNextRoundState nextRoundState) {
        return new NetworkDoubleOrNothingCreateAndSettleResult(challengeId, roundNumber, maxRounds, odds, currentRoundResult, nextRoundState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkDoubleOrNothingCreateAndSettleResult)) {
            return false;
        }
        NetworkDoubleOrNothingCreateAndSettleResult networkDoubleOrNothingCreateAndSettleResult = (NetworkDoubleOrNothingCreateAndSettleResult) other;
        return Intrinsics.g(this.challengeId, networkDoubleOrNothingCreateAndSettleResult.challengeId) && this.roundNumber == networkDoubleOrNothingCreateAndSettleResult.roundNumber && this.maxRounds == networkDoubleOrNothingCreateAndSettleResult.maxRounds && Double.compare(this.odds, networkDoubleOrNothingCreateAndSettleResult.odds) == 0 && Intrinsics.g(this.currentRoundResult, networkDoubleOrNothingCreateAndSettleResult.currentRoundResult) && Intrinsics.g(this.nextRoundState, networkDoubleOrNothingCreateAndSettleResult.nextRoundState);
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final NetworkDoubleOrNothingCurrentRoundResult getCurrentRoundResult() {
        return this.currentRoundResult;
    }

    public final int getMaxRounds() {
        return this.maxRounds;
    }

    public final NetworkDoubleOrNothingNextRoundState getNextRoundState() {
        return this.nextRoundState;
    }

    public final double getOdds() {
        return this.odds;
    }

    public final int getRoundNumber() {
        return this.roundNumber;
    }

    public int hashCode() {
        String str = this.challengeId;
        int iA = nrg0.a(gpp.a(this.maxRounds, gpp.a(this.roundNumber, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31, this.odds);
        NetworkDoubleOrNothingCurrentRoundResult networkDoubleOrNothingCurrentRoundResult = this.currentRoundResult;
        int iHashCode = (iA + (networkDoubleOrNothingCurrentRoundResult == null ? 0 : networkDoubleOrNothingCurrentRoundResult.hashCode())) * 31;
        NetworkDoubleOrNothingNextRoundState networkDoubleOrNothingNextRoundState = this.nextRoundState;
        return iHashCode + (networkDoubleOrNothingNextRoundState != null ? networkDoubleOrNothingNextRoundState.hashCode() : 0);
    }

    public String toString() {
        String str = this.challengeId;
        int i = this.roundNumber;
        int i2 = this.maxRounds;
        double d = this.odds;
        NetworkDoubleOrNothingCurrentRoundResult networkDoubleOrNothingCurrentRoundResult = this.currentRoundResult;
        NetworkDoubleOrNothingNextRoundState networkDoubleOrNothingNextRoundState = this.nextRoundState;
        StringBuilder sbA = ml5.a(i, "NetworkDoubleOrNothingCreateAndSettleResult(challengeId=", str, ", roundNumber=", ", maxRounds=");
        sbA.append(i2);
        sbA.append(", odds=");
        sbA.append(d);
        sbA.append(", currentRoundResult=");
        sbA.append(networkDoubleOrNothingCurrentRoundResult);
        sbA.append(", nextRoundState=");
        sbA.append(networkDoubleOrNothingNextRoundState);
        sbA.append(")");
        return sbA.toString();
    }
}
