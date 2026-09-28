package com.sporty.android.core.model.loyalty.streak;

import com.appsflyer.internal.w;
import defpackage.gpp;
import defpackage.ml5;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/sporty/android/core/model/loyalty/streak/StreakHistoryRecord;", "", "date", "", "level", "", "threshold", "boost", "", "repaired", "", "<init>", "(Ljava/lang/String;IIDZ)V", "getDate", "()Ljava/lang/String;", "getLevel", "()I", "getThreshold", "getBoost", "()D", "getRepaired", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StreakHistoryRecord {
    private final double boost;
    private final String date;
    private final int level;
    private final boolean repaired;
    private final int threshold;

    public StreakHistoryRecord(String str, int i, int i2, double d, boolean z) {
        str.getClass();
        this.date = str;
        this.level = i;
        this.threshold = i2;
        this.boost = d;
        this.repaired = z;
    }

    public static /* synthetic */ StreakHistoryRecord copy$default(StreakHistoryRecord streakHistoryRecord, String str, int i, int i2, double d, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = streakHistoryRecord.date;
        }
        if ((i3 & 2) != 0) {
            i = streakHistoryRecord.level;
        }
        if ((i3 & 4) != 0) {
            i2 = streakHistoryRecord.threshold;
        }
        if ((i3 & 8) != 0) {
            d = streakHistoryRecord.boost;
        }
        if ((i3 & 16) != 0) {
            z = streakHistoryRecord.repaired;
        }
        boolean z2 = z;
        int i4 = i2;
        return streakHistoryRecord.copy(str, i, i4, d, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getThreshold() {
        return this.threshold;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getBoost() {
        return this.boost;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getRepaired() {
        return this.repaired;
    }

    public final StreakHistoryRecord copy(String date, int level, int threshold, double boost, boolean repaired) {
        date.getClass();
        return new StreakHistoryRecord(date, level, threshold, boost, repaired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreakHistoryRecord)) {
            return false;
        }
        StreakHistoryRecord streakHistoryRecord = (StreakHistoryRecord) other;
        return Intrinsics.g(this.date, streakHistoryRecord.date) && this.level == streakHistoryRecord.level && this.threshold == streakHistoryRecord.threshold && Double.compare(this.boost, streakHistoryRecord.boost) == 0 && this.repaired == streakHistoryRecord.repaired;
    }

    public final double getBoost() {
        return this.boost;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getLevel() {
        return this.level;
    }

    public final boolean getRepaired() {
        return this.repaired;
    }

    public final int getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        return Boolean.hashCode(this.repaired) + nrg0.a(gpp.a(this.threshold, gpp.a(this.level, this.date.hashCode() * 31, 31), 31), 31, this.boost);
    }

    public String toString() {
        String str = this.date;
        int i = this.level;
        int i2 = this.threshold;
        double d = this.boost;
        boolean z = this.repaired;
        StringBuilder sbA = ml5.a(i, "StreakHistoryRecord(date=", str, ", level=", ", threshold=");
        sbA.append(i2);
        sbA.append(", boost=");
        sbA.append(d);
        return w.a(sbA, ", repaired=", z, ")");
    }
}
