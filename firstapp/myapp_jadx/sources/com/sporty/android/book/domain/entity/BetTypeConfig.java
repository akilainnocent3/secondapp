package com.sporty.android.book.domain.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/book/domain/entity/BetTypeConfig;", "", "flexi", "Lcom/sporty/android/book/domain/entity/BetTypeFlexiBetConfig;", "anyWin", "Lcom/sporty/android/book/domain/entity/BetTypeAnyWinConfig;", "<init>", "(Lcom/sporty/android/book/domain/entity/BetTypeFlexiBetConfig;Lcom/sporty/android/book/domain/entity/BetTypeAnyWinConfig;)V", "getFlexi", "()Lcom/sporty/android/book/domain/entity/BetTypeFlexiBetConfig;", "getAnyWin", "()Lcom/sporty/android/book/domain/entity/BetTypeAnyWinConfig;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetTypeConfig {
    public static final int $stable = BetTypeAnyWinConfig.$stable | BetTypeFlexiBetConfig.$stable;
    private final BetTypeAnyWinConfig anyWin;
    private final BetTypeFlexiBetConfig flexi;

    public BetTypeConfig(BetTypeFlexiBetConfig betTypeFlexiBetConfig, BetTypeAnyWinConfig betTypeAnyWinConfig) {
        this.flexi = betTypeFlexiBetConfig;
        this.anyWin = betTypeAnyWinConfig;
    }

    public static /* synthetic */ BetTypeConfig copy$default(BetTypeConfig betTypeConfig, BetTypeFlexiBetConfig betTypeFlexiBetConfig, BetTypeAnyWinConfig betTypeAnyWinConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            betTypeFlexiBetConfig = betTypeConfig.flexi;
        }
        if ((i & 2) != 0) {
            betTypeAnyWinConfig = betTypeConfig.anyWin;
        }
        return betTypeConfig.copy(betTypeFlexiBetConfig, betTypeAnyWinConfig);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BetTypeFlexiBetConfig getFlexi() {
        return this.flexi;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BetTypeAnyWinConfig getAnyWin() {
        return this.anyWin;
    }

    public final BetTypeConfig copy(BetTypeFlexiBetConfig flexi, BetTypeAnyWinConfig anyWin) {
        return new BetTypeConfig(flexi, anyWin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetTypeConfig)) {
            return false;
        }
        BetTypeConfig betTypeConfig = (BetTypeConfig) other;
        return Intrinsics.g(this.flexi, betTypeConfig.flexi) && Intrinsics.g(this.anyWin, betTypeConfig.anyWin);
    }

    public final BetTypeAnyWinConfig getAnyWin() {
        return this.anyWin;
    }

    public final BetTypeFlexiBetConfig getFlexi() {
        return this.flexi;
    }

    public int hashCode() {
        BetTypeFlexiBetConfig betTypeFlexiBetConfig = this.flexi;
        int iHashCode = (betTypeFlexiBetConfig == null ? 0 : betTypeFlexiBetConfig.hashCode()) * 31;
        BetTypeAnyWinConfig betTypeAnyWinConfig = this.anyWin;
        return iHashCode + (betTypeAnyWinConfig != null ? betTypeAnyWinConfig.hashCode() : 0);
    }

    public String toString() {
        return "BetTypeConfig(flexi=" + this.flexi + ", anyWin=" + this.anyWin + ")";
    }
}
