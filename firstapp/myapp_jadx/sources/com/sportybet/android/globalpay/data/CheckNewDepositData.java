package com.sportybet.android.globalpay.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/globalpay/data/CheckNewDepositData;", "", "hasNewDeposits", "", "transactions", "", "Lcom/sportybet/android/globalpay/data/CheckNewDepositDataTransaction;", "<init>", "(ZLjava/util/List;)V", "getHasNewDeposits", "()Z", "getTransactions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CheckNewDepositData {
    public static final int $stable = 8;
    private final boolean hasNewDeposits;
    private final List<CheckNewDepositDataTransaction> transactions;

    public CheckNewDepositData(boolean z, List<CheckNewDepositDataTransaction> list) {
        this.hasNewDeposits = z;
        this.transactions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckNewDepositData copy$default(CheckNewDepositData checkNewDepositData, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkNewDepositData.hasNewDeposits;
        }
        if ((i & 2) != 0) {
            list = checkNewDepositData.transactions;
        }
        return checkNewDepositData.copy(z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasNewDeposits() {
        return this.hasNewDeposits;
    }

    public final List<CheckNewDepositDataTransaction> component2() {
        return this.transactions;
    }

    public final CheckNewDepositData copy(boolean hasNewDeposits, List<CheckNewDepositDataTransaction> transactions) {
        return new CheckNewDepositData(hasNewDeposits, transactions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckNewDepositData)) {
            return false;
        }
        CheckNewDepositData checkNewDepositData = (CheckNewDepositData) other;
        return this.hasNewDeposits == checkNewDepositData.hasNewDeposits && Intrinsics.g(this.transactions, checkNewDepositData.transactions);
    }

    public final boolean getHasNewDeposits() {
        return this.hasNewDeposits;
    }

    public final List<CheckNewDepositDataTransaction> getTransactions() {
        return this.transactions;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasNewDeposits) * 31;
        List<CheckNewDepositDataTransaction> list = this.transactions;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "CheckNewDepositData(hasNewDeposits=" + this.hasNewDeposits + ", transactions=" + this.transactions + ")";
    }
}
