package com.sporty.android.core.model.pocket.deposit;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/FirstDepositStateWrapper;", "", "state", "Lcom/sporty/android/core/model/pocket/deposit/FirstDepositState;", "payRecordStatus", "Lcom/sporty/android/core/model/pocket/deposit/PayRecordStatus;", "<init>", "(Lcom/sporty/android/core/model/pocket/deposit/FirstDepositState;Lcom/sporty/android/core/model/pocket/deposit/PayRecordStatus;)V", "getState", "()Lcom/sporty/android/core/model/pocket/deposit/FirstDepositState;", "getPayRecordStatus", "()Lcom/sporty/android/core/model/pocket/deposit/PayRecordStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FirstDepositStateWrapper {
    private final PayRecordStatus payRecordStatus;
    private final FirstDepositState state;

    public FirstDepositStateWrapper(FirstDepositState firstDepositState, PayRecordStatus payRecordStatus) {
        firstDepositState.getClass();
        payRecordStatus.getClass();
        this.state = firstDepositState;
        this.payRecordStatus = payRecordStatus;
    }

    public static /* synthetic */ FirstDepositStateWrapper copy$default(FirstDepositStateWrapper firstDepositStateWrapper, FirstDepositState firstDepositState, PayRecordStatus payRecordStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            firstDepositState = firstDepositStateWrapper.state;
        }
        if ((i & 2) != 0) {
            payRecordStatus = firstDepositStateWrapper.payRecordStatus;
        }
        return firstDepositStateWrapper.copy(firstDepositState, payRecordStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FirstDepositState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PayRecordStatus getPayRecordStatus() {
        return this.payRecordStatus;
    }

    public final FirstDepositStateWrapper copy(FirstDepositState state, PayRecordStatus payRecordStatus) {
        state.getClass();
        payRecordStatus.getClass();
        return new FirstDepositStateWrapper(state, payRecordStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirstDepositStateWrapper)) {
            return false;
        }
        FirstDepositStateWrapper firstDepositStateWrapper = (FirstDepositStateWrapper) other;
        return this.state == firstDepositStateWrapper.state && this.payRecordStatus == firstDepositStateWrapper.payRecordStatus;
    }

    public final PayRecordStatus getPayRecordStatus() {
        return this.payRecordStatus;
    }

    public final FirstDepositState getState() {
        return this.state;
    }

    public int hashCode() {
        return this.payRecordStatus.hashCode() + (this.state.hashCode() * 31);
    }

    public String toString() {
        return "FirstDepositStateWrapper(state=" + this.state + ", payRecordStatus=" + this.payRecordStatus + ")";
    }
}
