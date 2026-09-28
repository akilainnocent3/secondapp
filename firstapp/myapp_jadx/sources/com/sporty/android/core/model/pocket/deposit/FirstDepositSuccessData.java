package com.sporty.android.core.model.pocket.deposit;

import defpackage.tzx;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/FirstDepositSuccessData;", "", "userId", "", "hasFirstDeposit", "", "<init>", "(Ljava/lang/String;Z)V", "getUserId", "()Ljava/lang/String;", "getHasFirstDeposit", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FirstDepositSuccessData {
    private final boolean hasFirstDeposit;
    private final String userId;

    public /* synthetic */ FirstDepositSuccessData(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ FirstDepositSuccessData copy$default(FirstDepositSuccessData firstDepositSuccessData, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = firstDepositSuccessData.userId;
        }
        if ((i & 2) != 0) {
            z = firstDepositSuccessData.hasFirstDeposit;
        }
        return firstDepositSuccessData.copy(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasFirstDeposit() {
        return this.hasFirstDeposit;
    }

    public final FirstDepositSuccessData copy(String userId, boolean hasFirstDeposit) {
        return new FirstDepositSuccessData(userId, hasFirstDeposit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirstDepositSuccessData)) {
            return false;
        }
        FirstDepositSuccessData firstDepositSuccessData = (FirstDepositSuccessData) other;
        return Intrinsics.g(this.userId, firstDepositSuccessData.userId) && this.hasFirstDeposit == firstDepositSuccessData.hasFirstDeposit;
    }

    public final boolean getHasFirstDeposit() {
        return this.hasFirstDeposit;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        return Boolean.hashCode(this.hasFirstDeposit) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return tzx.a("FirstDepositSuccessData(userId=", this.userId, ", hasFirstDeposit=", ")", this.hasFirstDeposit);
    }

    public FirstDepositSuccessData(String str, boolean z) {
        this.userId = str;
        this.hasFirstDeposit = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FirstDepositSuccessData() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
