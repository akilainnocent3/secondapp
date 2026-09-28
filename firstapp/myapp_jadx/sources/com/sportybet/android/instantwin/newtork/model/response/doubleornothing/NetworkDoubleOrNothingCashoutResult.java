package com.sportybet.android.instantwin.newtork.model.response.doubleornothing;

import com.google.gson.annotations.SerializedName;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.nrg0;
import defpackage.zug;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001f"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingCashoutResult;", "", "roundNumber", "", "maxRounds", "odds", "", "totalReturn", "", "<init>", "(IIDJ)V", "getRoundNumber", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getMaxRounds", "getOdds", "()D", "getTotalReturn", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkDoubleOrNothingCashoutResult {
    public static final int $stable = 0;

    @SerializedName("maxRounds")
    private final int maxRounds;

    @SerializedName("odds")
    private final double odds;

    @SerializedName("roundNumber")
    private final int roundNumber;

    @SerializedName("totalReturn")
    private final long totalReturn;

    public NetworkDoubleOrNothingCashoutResult(int i, int i2, double d, long j) {
        this.roundNumber = i;
        this.maxRounds = i2;
        this.odds = d;
        this.totalReturn = j;
    }

    public static /* synthetic */ NetworkDoubleOrNothingCashoutResult copy$default(NetworkDoubleOrNothingCashoutResult networkDoubleOrNothingCashoutResult, int i, int i2, double d, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = networkDoubleOrNothingCashoutResult.roundNumber;
        }
        if ((i3 & 2) != 0) {
            i2 = networkDoubleOrNothingCashoutResult.maxRounds;
        }
        if ((i3 & 4) != 0) {
            d = networkDoubleOrNothingCashoutResult.odds;
        }
        if ((i3 & 8) != 0) {
            j = networkDoubleOrNothingCashoutResult.totalReturn;
        }
        long j2 = j;
        return networkDoubleOrNothingCashoutResult.copy(i, i2, d, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRoundNumber() {
        return this.roundNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxRounds() {
        return this.maxRounds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTotalReturn() {
        return this.totalReturn;
    }

    public final NetworkDoubleOrNothingCashoutResult copy(int roundNumber, int maxRounds, double odds, long totalReturn) {
        return new NetworkDoubleOrNothingCashoutResult(roundNumber, maxRounds, odds, totalReturn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkDoubleOrNothingCashoutResult)) {
            return false;
        }
        NetworkDoubleOrNothingCashoutResult networkDoubleOrNothingCashoutResult = (NetworkDoubleOrNothingCashoutResult) other;
        return this.roundNumber == networkDoubleOrNothingCashoutResult.roundNumber && this.maxRounds == networkDoubleOrNothingCashoutResult.maxRounds && Double.compare(this.odds, networkDoubleOrNothingCashoutResult.odds) == 0 && this.totalReturn == networkDoubleOrNothingCashoutResult.totalReturn;
    }

    public final int getMaxRounds() {
        return this.maxRounds;
    }

    public final double getOdds() {
        return this.odds;
    }

    public final int getRoundNumber() {
        return this.roundNumber;
    }

    public final long getTotalReturn() {
        return this.totalReturn;
    }

    public int hashCode() {
        return Long.hashCode(this.totalReturn) + nrg0.a(gpp.a(this.maxRounds, Integer.hashCode(this.roundNumber) * 31, 31), 31, this.odds);
    }

    public String toString() {
        int i = this.roundNumber;
        int i2 = this.maxRounds;
        double d = this.odds;
        long j = this.totalReturn;
        StringBuilder sbA = dy5.a("NetworkDoubleOrNothingCashoutResult(roundNumber=", i, i2, ", maxRounds=", ", odds=");
        sbA.append(d);
        return zug.a(j, ", totalReturn=", ")", sbA);
    }
}
