package com.sportybet.android.instantwin.newtork.model.response.doubleornothing;

import com.google.gson.annotations.SerializedName;
import defpackage.b7f;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.ml5;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003Je\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0014\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010.\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R%\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR%\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR%\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR%\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R%\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016Ê\u0001\f\b0\u0012\b\b1\u0012\u0004\b\u0003\u0010\u0002¨\u0006/"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingInfo;", "", "challengeId", "", "currentRoundNumber", "", "maxRounds", "odds", "", "baseAmount", "", "minStake", "maxStake", "countdownDuration", "kickCountdownDuration", "<init>", "(Ljava/lang/String;IIDJJJII)V", "getChallengeId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getCurrentRoundNumber", "()I", "getMaxRounds", "getOdds", "()D", "getBaseAmount", "()J", "getMinStake", "getMaxStake", "getCountdownDuration", "getKickCountdownDuration", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkDoubleOrNothingInfo {
    public static final int $stable = 0;

    @SerializedName("baseAmount")
    private final long baseAmount;

    @SerializedName("challengeId")
    private final String challengeId;

    @SerializedName("countdownDuration")
    private final int countdownDuration;

    @SerializedName("currentRoundNumber")
    private final int currentRoundNumber;

    @SerializedName("kickCountdownDuration")
    private final int kickCountdownDuration;

    @SerializedName("maxRounds")
    private final int maxRounds;

    @SerializedName("maxStake")
    private final long maxStake;

    @SerializedName("minStake")
    private final long minStake;

    @SerializedName("odds")
    private final double odds;

    public NetworkDoubleOrNothingInfo(String str, int i, int i2, double d, long j, long j2, long j3, int i3, int i4) {
        this.challengeId = str;
        this.currentRoundNumber = i;
        this.maxRounds = i2;
        this.odds = d;
        this.baseAmount = j;
        this.minStake = j2;
        this.maxStake = j3;
        this.countdownDuration = i3;
        this.kickCountdownDuration = i4;
    }

    public static /* synthetic */ NetworkDoubleOrNothingInfo copy$default(NetworkDoubleOrNothingInfo networkDoubleOrNothingInfo, String str, int i, int i2, double d, long j, long j2, long j3, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = networkDoubleOrNothingInfo.challengeId;
        }
        return networkDoubleOrNothingInfo.copy(str, (i5 & 2) != 0 ? networkDoubleOrNothingInfo.currentRoundNumber : i, (i5 & 4) != 0 ? networkDoubleOrNothingInfo.maxRounds : i2, (i5 & 8) != 0 ? networkDoubleOrNothingInfo.odds : d, (i5 & 16) != 0 ? networkDoubleOrNothingInfo.baseAmount : j, (i5 & 32) != 0 ? networkDoubleOrNothingInfo.minStake : j2, (i5 & 64) != 0 ? networkDoubleOrNothingInfo.maxStake : j3, (i5 & 128) != 0 ? networkDoubleOrNothingInfo.countdownDuration : i3, (i5 & 256) != 0 ? networkDoubleOrNothingInfo.kickCountdownDuration : i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChallengeId() {
        return this.challengeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrentRoundNumber() {
        return this.currentRoundNumber;
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
    public final long getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getMinStake() {
        return this.minStake;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getMaxStake() {
        return this.maxStake;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCountdownDuration() {
        return this.countdownDuration;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getKickCountdownDuration() {
        return this.kickCountdownDuration;
    }

    public final NetworkDoubleOrNothingInfo copy(String challengeId, int currentRoundNumber, int maxRounds, double odds, long baseAmount, long minStake, long maxStake, int countdownDuration, int kickCountdownDuration) {
        return new NetworkDoubleOrNothingInfo(challengeId, currentRoundNumber, maxRounds, odds, baseAmount, minStake, maxStake, countdownDuration, kickCountdownDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkDoubleOrNothingInfo)) {
            return false;
        }
        NetworkDoubleOrNothingInfo networkDoubleOrNothingInfo = (NetworkDoubleOrNothingInfo) other;
        return Intrinsics.g(this.challengeId, networkDoubleOrNothingInfo.challengeId) && this.currentRoundNumber == networkDoubleOrNothingInfo.currentRoundNumber && this.maxRounds == networkDoubleOrNothingInfo.maxRounds && Double.compare(this.odds, networkDoubleOrNothingInfo.odds) == 0 && this.baseAmount == networkDoubleOrNothingInfo.baseAmount && this.minStake == networkDoubleOrNothingInfo.minStake && this.maxStake == networkDoubleOrNothingInfo.maxStake && this.countdownDuration == networkDoubleOrNothingInfo.countdownDuration && this.kickCountdownDuration == networkDoubleOrNothingInfo.kickCountdownDuration;
    }

    public final long getBaseAmount() {
        return this.baseAmount;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final int getCountdownDuration() {
        return this.countdownDuration;
    }

    public final int getCurrentRoundNumber() {
        return this.currentRoundNumber;
    }

    public final int getKickCountdownDuration() {
        return this.kickCountdownDuration;
    }

    public final int getMaxRounds() {
        return this.maxRounds;
    }

    public final long getMaxStake() {
        return this.maxStake;
    }

    public final long getMinStake() {
        return this.minStake;
    }

    public final double getOdds() {
        return this.odds;
    }

    public int hashCode() {
        String str = this.challengeId;
        return Integer.hashCode(this.kickCountdownDuration) + gpp.a(this.countdownDuration, f87.a(f87.a(f87.a(nrg0.a(gpp.a(this.maxRounds, gpp.a(this.currentRoundNumber, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31, this.odds), this.baseAmount, 31), this.minStake, 31), this.maxStake, 31), 31);
    }

    public String toString() {
        String str = this.challengeId;
        int i = this.currentRoundNumber;
        int i2 = this.maxRounds;
        double d = this.odds;
        long j = this.baseAmount;
        long j2 = this.minStake;
        long j3 = this.maxStake;
        int i3 = this.countdownDuration;
        int i4 = this.kickCountdownDuration;
        StringBuilder sbA = ml5.a(i, "NetworkDoubleOrNothingInfo(challengeId=", str, ", currentRoundNumber=", ", maxRounds=");
        sbA.append(i2);
        sbA.append(", odds=");
        sbA.append(d);
        g41.a(j, ", baseAmount=", ", minStake=", sbA);
        sbA.append(j2);
        g41.a(j3, ", maxStake=", ", countdownDuration=", sbA);
        return b7f.a(sbA, i3, ", kickCountdownDuration=", i4, ")");
    }
}
