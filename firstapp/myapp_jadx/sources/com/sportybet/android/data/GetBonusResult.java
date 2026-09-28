package com.sportybet.android.data;

import com.twilio.voice.EventKeys;
import defpackage.dd3;
import defpackage.f87;
import defpackage.gpp;
import defpackage.mtg0;
import defpackage.nng;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0014\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020\tHÖ\u0081\u0004J\n\u0010,\u001a\u00020-HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015Ê\u0001\f\b/\u0012\b\b0\u0012\u0004\b\u0003\u0010\u0000¨\u0006."}, d2 = {"Lcom/sportybet/android/data/GetBonusResult;", "", "isOverMaxBonus", "", "bonus", "Ljava/math/BigDecimal;", "isExistBonus", "isBonusActivated", "betType", "", EventKeys.TIMESTAMP, "", "minBonus", "<init>", "(ZLjava/math/BigDecimal;ZZIJLjava/math/BigDecimal;)V", "()Z", "setOverMaxBonus", "(Z)V", "getBonus", "()Ljava/math/BigDecimal;", "setBonus", "(Ljava/math/BigDecimal;)V", "setExistBonus", "getBetType", "()I", "setBetType", "(I)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getMinBonus", "setMinBonus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GetBonusResult {
    public static final int $stable = 8;
    private int betType;
    private BigDecimal bonus;
    private final boolean isBonusActivated;
    private boolean isExistBonus;
    private boolean isOverMaxBonus;
    private BigDecimal minBonus;
    private long timestamp;

    public GetBonusResult(boolean z, BigDecimal bigDecimal, boolean z2, boolean z3, int i, long j, BigDecimal bigDecimal2) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        this.isOverMaxBonus = z;
        this.bonus = bigDecimal;
        this.isExistBonus = z2;
        this.isBonusActivated = z3;
        this.betType = i;
        this.timestamp = j;
        this.minBonus = bigDecimal2;
    }

    public static /* synthetic */ GetBonusResult copy$default(GetBonusResult getBonusResult, boolean z, BigDecimal bigDecimal, boolean z2, boolean z3, int i, long j, BigDecimal bigDecimal2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = getBonusResult.isOverMaxBonus;
        }
        if ((i2 & 2) != 0) {
            bigDecimal = getBonusResult.bonus;
        }
        if ((i2 & 4) != 0) {
            z2 = getBonusResult.isExistBonus;
        }
        if ((i2 & 8) != 0) {
            z3 = getBonusResult.isBonusActivated;
        }
        if ((i2 & 16) != 0) {
            i = getBonusResult.betType;
        }
        if ((i2 & 32) != 0) {
            j = getBonusResult.timestamp;
        }
        if ((i2 & 64) != 0) {
            bigDecimal2 = getBonusResult.minBonus;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        long j2 = j;
        int i3 = i;
        boolean z4 = z2;
        return getBonusResult.copy(z, bigDecimal, z4, z3, i3, j2, bigDecimal3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsOverMaxBonus() {
        return this.isOverMaxBonus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getBonus() {
        return this.bonus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsExistBonus() {
        return this.isExistBonus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsBonusActivated() {
        return this.isBonusActivated;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBetType() {
        return this.betType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getMinBonus() {
        return this.minBonus;
    }

    public final GetBonusResult copy(boolean isOverMaxBonus, BigDecimal bonus, boolean isExistBonus, boolean isBonusActivated, int betType, long timestamp, BigDecimal minBonus) {
        bonus.getClass();
        minBonus.getClass();
        return new GetBonusResult(isOverMaxBonus, bonus, isExistBonus, isBonusActivated, betType, timestamp, minBonus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetBonusResult)) {
            return false;
        }
        GetBonusResult getBonusResult = (GetBonusResult) other;
        return this.isOverMaxBonus == getBonusResult.isOverMaxBonus && Intrinsics.g(this.bonus, getBonusResult.bonus) && this.isExistBonus == getBonusResult.isExistBonus && this.isBonusActivated == getBonusResult.isBonusActivated && this.betType == getBonusResult.betType && this.timestamp == getBonusResult.timestamp && Intrinsics.g(this.minBonus, getBonusResult.minBonus);
    }

    public final int getBetType() {
        return this.betType;
    }

    public final BigDecimal getBonus() {
        return this.bonus;
    }

    public final BigDecimal getMinBonus() {
        return this.minBonus;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.minBonus.hashCode() + f87.a(gpp.a(this.betType, mtg0.a(mtg0.a(dd3.a(this.bonus, Boolean.hashCode(this.isOverMaxBonus) * 31, 31), 31, this.isExistBonus), 31, this.isBonusActivated), 31), this.timestamp, 31);
    }

    public final boolean isBonusActivated() {
        return this.isBonusActivated;
    }

    public final boolean isExistBonus() {
        return this.isExistBonus;
    }

    public final boolean isOverMaxBonus() {
        return this.isOverMaxBonus;
    }

    public final void setBetType(int i) {
        this.betType = i;
    }

    public final void setBonus(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        this.bonus = bigDecimal;
    }

    public final void setExistBonus(boolean z) {
        this.isExistBonus = z;
    }

    public final void setMinBonus(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        this.minBonus = bigDecimal;
    }

    public final void setOverMaxBonus(boolean z) {
        this.isOverMaxBonus = z;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public String toString() {
        boolean z = this.isOverMaxBonus;
        BigDecimal bigDecimal = this.bonus;
        boolean z2 = this.isExistBonus;
        boolean z3 = this.isBonusActivated;
        int i = this.betType;
        long j = this.timestamp;
        BigDecimal bigDecimal2 = this.minBonus;
        StringBuilder sb = new StringBuilder("GetBonusResult(isOverMaxBonus=");
        sb.append(z);
        sb.append(", bonus=");
        sb.append(bigDecimal);
        sb.append(", isExistBonus=");
        nng.a(", isBonusActivated=", ", betType=", sb, z2, z3);
        sb.append(i);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append(", minBonus=");
        sb.append(bigDecimal2);
        sb.append(")");
        return sb.toString();
    }
}
