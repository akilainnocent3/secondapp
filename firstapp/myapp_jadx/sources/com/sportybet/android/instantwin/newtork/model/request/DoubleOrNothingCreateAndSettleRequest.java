package com.sportybet.android.instantwin.newtork.model.request;

import com.appsflyer.internal.x;
import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/request/DoubleOrNothingCreateAndSettleRequest;", "", "challengeId", "", "stakeAmount", "", "playRoundNumber", "", "<init>", "(Ljava/lang/String;JI)V", "getChallengeId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getStakeAmount", "()J", "getPlayRoundNumber", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DoubleOrNothingCreateAndSettleRequest {
    public static final int $stable = 0;

    @SerializedName("challengeId")
    private final String challengeId;

    @SerializedName("playRoundNumber")
    private final int playRoundNumber;

    @SerializedName("stakeAmount")
    private final long stakeAmount;

    public DoubleOrNothingCreateAndSettleRequest(String str, long j, int i) {
        str.getClass();
        this.challengeId = str;
        this.stakeAmount = j;
        this.playRoundNumber = i;
    }

    public static /* synthetic */ DoubleOrNothingCreateAndSettleRequest copy$default(DoubleOrNothingCreateAndSettleRequest doubleOrNothingCreateAndSettleRequest, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = doubleOrNothingCreateAndSettleRequest.challengeId;
        }
        if ((i2 & 2) != 0) {
            j = doubleOrNothingCreateAndSettleRequest.stakeAmount;
        }
        if ((i2 & 4) != 0) {
            i = doubleOrNothingCreateAndSettleRequest.playRoundNumber;
        }
        return doubleOrNothingCreateAndSettleRequest.copy(str, j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChallengeId() {
        return this.challengeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPlayRoundNumber() {
        return this.playRoundNumber;
    }

    public final DoubleOrNothingCreateAndSettleRequest copy(String challengeId, long stakeAmount, int playRoundNumber) {
        challengeId.getClass();
        return new DoubleOrNothingCreateAndSettleRequest(challengeId, stakeAmount, playRoundNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoubleOrNothingCreateAndSettleRequest)) {
            return false;
        }
        DoubleOrNothingCreateAndSettleRequest doubleOrNothingCreateAndSettleRequest = (DoubleOrNothingCreateAndSettleRequest) other;
        return Intrinsics.g(this.challengeId, doubleOrNothingCreateAndSettleRequest.challengeId) && this.stakeAmount == doubleOrNothingCreateAndSettleRequest.stakeAmount && this.playRoundNumber == doubleOrNothingCreateAndSettleRequest.playRoundNumber;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final int getPlayRoundNumber() {
        return this.playRoundNumber;
    }

    public final long getStakeAmount() {
        return this.stakeAmount;
    }

    public int hashCode() {
        return Integer.hashCode(this.playRoundNumber) + f87.a(this.challengeId.hashCode() * 31, this.stakeAmount, 31);
    }

    public String toString() {
        String str = this.challengeId;
        long j = this.stakeAmount;
        int i = this.playRoundNumber;
        StringBuilder sbA = x.a(j, "DoubleOrNothingCreateAndSettleRequest(challengeId=", str, ", stakeAmount=");
        sbA.append(", playRoundNumber=");
        sbA.append(i);
        sbA.append(")");
        return sbA.toString();
    }
}
