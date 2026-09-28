package com.sporty.android.core.model.loyalty;

import defpackage.f87;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/loyalty/DailyRecordContent;", "", "isAccumulate", "", "dailyRewardStartDate", "", "dailyRewardEndDate", "<init>", "(ZJLjava/lang/Long;)V", "()Z", "getDailyRewardStartDate", "()J", "getDailyRewardEndDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(ZJLjava/lang/Long;)Lcom/sporty/android/core/model/loyalty/DailyRecordContent;", "equals", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DailyRecordContent {
    private final Long dailyRewardEndDate;
    private final long dailyRewardStartDate;
    private final boolean isAccumulate;

    public DailyRecordContent(boolean z, long j, Long l) {
        this.isAccumulate = z;
        this.dailyRewardStartDate = j;
        this.dailyRewardEndDate = l;
    }

    public static /* synthetic */ DailyRecordContent copy$default(DailyRecordContent dailyRecordContent, boolean z, long j, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dailyRecordContent.isAccumulate;
        }
        if ((i & 2) != 0) {
            j = dailyRecordContent.dailyRewardStartDate;
        }
        if ((i & 4) != 0) {
            l = dailyRecordContent.dailyRewardEndDate;
        }
        return dailyRecordContent.copy(z, j, l);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsAccumulate() {
        return this.isAccumulate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDailyRewardStartDate() {
        return this.dailyRewardStartDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getDailyRewardEndDate() {
        return this.dailyRewardEndDate;
    }

    public final DailyRecordContent copy(boolean isAccumulate, long dailyRewardStartDate, Long dailyRewardEndDate) {
        return new DailyRecordContent(isAccumulate, dailyRewardStartDate, dailyRewardEndDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyRecordContent)) {
            return false;
        }
        DailyRecordContent dailyRecordContent = (DailyRecordContent) other;
        return this.isAccumulate == dailyRecordContent.isAccumulate && this.dailyRewardStartDate == dailyRecordContent.dailyRewardStartDate && Intrinsics.g(this.dailyRewardEndDate, dailyRecordContent.dailyRewardEndDate);
    }

    public final Long getDailyRewardEndDate() {
        return this.dailyRewardEndDate;
    }

    public final long getDailyRewardStartDate() {
        return this.dailyRewardStartDate;
    }

    public int hashCode() {
        int iA = f87.a(Boolean.hashCode(this.isAccumulate) * 31, this.dailyRewardStartDate, 31);
        Long l = this.dailyRewardEndDate;
        return iA + (l == null ? 0 : l.hashCode());
    }

    public final boolean isAccumulate() {
        return this.isAccumulate;
    }

    public String toString() {
        return "DailyRecordContent(isAccumulate=" + this.isAccumulate + ", dailyRewardStartDate=" + this.dailyRewardStartDate + ", dailyRewardEndDate=" + this.dailyRewardEndDate + ")";
    }
}
