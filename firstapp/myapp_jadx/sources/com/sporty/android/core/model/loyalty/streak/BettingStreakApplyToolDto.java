package com.sporty.android.core.model.loyalty.streak;

import defpackage.cwz;
import defpackage.mtg0;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/loyalty/streak/BettingStreakApplyToolDto;", "", "dryRun", "", "changed", "hint", "", "<init>", "(ZZLjava/lang/String;)V", "getDryRun", "()Z", "getChanged", "getHint", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BettingStreakApplyToolDto {
    private final boolean changed;
    private final boolean dryRun;
    private final String hint;

    public BettingStreakApplyToolDto(boolean z, boolean z2, String str) {
        str.getClass();
        this.dryRun = z;
        this.changed = z2;
        this.hint = str;
    }

    public static /* synthetic */ BettingStreakApplyToolDto copy$default(BettingStreakApplyToolDto bettingStreakApplyToolDto, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bettingStreakApplyToolDto.dryRun;
        }
        if ((i & 2) != 0) {
            z2 = bettingStreakApplyToolDto.changed;
        }
        if ((i & 4) != 0) {
            str = bettingStreakApplyToolDto.hint;
        }
        return bettingStreakApplyToolDto.copy(z, z2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDryRun() {
        return this.dryRun;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getChanged() {
        return this.changed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    public final BettingStreakApplyToolDto copy(boolean dryRun, boolean changed, String hint) {
        hint.getClass();
        return new BettingStreakApplyToolDto(dryRun, changed, hint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BettingStreakApplyToolDto)) {
            return false;
        }
        BettingStreakApplyToolDto bettingStreakApplyToolDto = (BettingStreakApplyToolDto) other;
        return this.dryRun == bettingStreakApplyToolDto.dryRun && this.changed == bettingStreakApplyToolDto.changed && Intrinsics.g(this.hint, bettingStreakApplyToolDto.hint);
    }

    public final boolean getChanged() {
        return this.changed;
    }

    public final boolean getDryRun() {
        return this.dryRun;
    }

    public final String getHint() {
        return this.hint;
    }

    public int hashCode() {
        return this.hint.hashCode() + mtg0.a(Boolean.hashCode(this.dryRun) * 31, 31, this.changed);
    }

    public String toString() {
        boolean z = this.dryRun;
        boolean z2 = this.changed;
        return uf80.a(cwz.a("BettingStreakApplyToolDto(dryRun=", ", changed=", ", hint=", z, z2), this.hint, ")");
    }
}
