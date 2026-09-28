package com.sportybet.android.instantwin.newtork.model.response.doubleornothing;

import com.appsflyer.internal.a0;
import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.to10;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R%\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R%\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R%\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR%\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rÊ\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0002¨\u0006#"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingNextRoundState;", "", "roundNumber", "", "baseAmount", "", "minStake", "maxStake", "countdownDuration", "kickCountdownDuration", "<init>", "(IJJJII)V", "getRoundNumber", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getBaseAmount", "()J", "getMinStake", "getMaxStake", "getCountdownDuration", "getKickCountdownDuration", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkDoubleOrNothingNextRoundState {
    public static final int $stable = 0;

    @SerializedName("baseAmount")
    private final long baseAmount;

    @SerializedName("countdownDuration")
    private final int countdownDuration;

    @SerializedName("kickCountdownDuration")
    private final int kickCountdownDuration;

    @SerializedName("maxStake")
    private final long maxStake;

    @SerializedName("minStake")
    private final long minStake;

    @SerializedName("roundNumber")
    private final int roundNumber;

    public NetworkDoubleOrNothingNextRoundState(int i, long j, long j2, long j3, int i2, int i3) {
        this.roundNumber = i;
        this.baseAmount = j;
        this.minStake = j2;
        this.maxStake = j3;
        this.countdownDuration = i2;
        this.kickCountdownDuration = i3;
    }

    public static /* synthetic */ NetworkDoubleOrNothingNextRoundState copy$default(NetworkDoubleOrNothingNextRoundState networkDoubleOrNothingNextRoundState, int i, long j, long j2, long j3, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = networkDoubleOrNothingNextRoundState.roundNumber;
        }
        if ((i4 & 2) != 0) {
            j = networkDoubleOrNothingNextRoundState.baseAmount;
        }
        if ((i4 & 4) != 0) {
            j2 = networkDoubleOrNothingNextRoundState.minStake;
        }
        if ((i4 & 8) != 0) {
            j3 = networkDoubleOrNothingNextRoundState.maxStake;
        }
        if ((i4 & 16) != 0) {
            i2 = networkDoubleOrNothingNextRoundState.countdownDuration;
        }
        if ((i4 & 32) != 0) {
            i3 = networkDoubleOrNothingNextRoundState.kickCountdownDuration;
        }
        long j4 = j3;
        long j5 = j2;
        return networkDoubleOrNothingNextRoundState.copy(i, j, j5, j4, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRoundNumber() {
        return this.roundNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getMinStake() {
        return this.minStake;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getMaxStake() {
        return this.maxStake;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCountdownDuration() {
        return this.countdownDuration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getKickCountdownDuration() {
        return this.kickCountdownDuration;
    }

    public final NetworkDoubleOrNothingNextRoundState copy(int roundNumber, long baseAmount, long minStake, long maxStake, int countdownDuration, int kickCountdownDuration) {
        return new NetworkDoubleOrNothingNextRoundState(roundNumber, baseAmount, minStake, maxStake, countdownDuration, kickCountdownDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkDoubleOrNothingNextRoundState)) {
            return false;
        }
        NetworkDoubleOrNothingNextRoundState networkDoubleOrNothingNextRoundState = (NetworkDoubleOrNothingNextRoundState) other;
        return this.roundNumber == networkDoubleOrNothingNextRoundState.roundNumber && this.baseAmount == networkDoubleOrNothingNextRoundState.baseAmount && this.minStake == networkDoubleOrNothingNextRoundState.minStake && this.maxStake == networkDoubleOrNothingNextRoundState.maxStake && this.countdownDuration == networkDoubleOrNothingNextRoundState.countdownDuration && this.kickCountdownDuration == networkDoubleOrNothingNextRoundState.kickCountdownDuration;
    }

    public final long getBaseAmount() {
        return this.baseAmount;
    }

    public final int getCountdownDuration() {
        return this.countdownDuration;
    }

    public final int getKickCountdownDuration() {
        return this.kickCountdownDuration;
    }

    public final long getMaxStake() {
        return this.maxStake;
    }

    public final long getMinStake() {
        return this.minStake;
    }

    public final int getRoundNumber() {
        return this.roundNumber;
    }

    public int hashCode() {
        return Integer.hashCode(this.kickCountdownDuration) + gpp.a(this.countdownDuration, f87.a(f87.a(f87.a(Integer.hashCode(this.roundNumber) * 31, this.baseAmount, 31), this.minStake, 31), this.maxStake, 31), 31);
    }

    public String toString() {
        int i = this.roundNumber;
        long j = this.baseAmount;
        long j2 = this.minStake;
        long j3 = this.maxStake;
        int i2 = this.countdownDuration;
        int i3 = this.kickCountdownDuration;
        StringBuilder sbA = a0.a("NetworkDoubleOrNothingNextRoundState(roundNumber=", ", baseAmount=", i, j);
        g41.a(j2, ", minStake=", ", maxStake=", sbA);
        to10.a(sbA, j3, ", countdownDuration=", i2);
        sbA.append(", kickCountdownDuration=");
        sbA.append(i3);
        sbA.append(")");
        return sbA.toString();
    }
}
