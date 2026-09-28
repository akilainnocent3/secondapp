package com.sporty.android.core.model.patron;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\u0002\b\u0013¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/core/model/patron/VerifyCodeStatus;", "", "remainMsgNum", "", "<init>", "(Ljava/lang/Integer;)V", "getRemainMsgNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/sporty/android/core/model/patron/VerifyCodeStatus;", "equals", "", "other", "hashCode", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VerifyCodeStatus {
    private final Integer remainMsgNum;

    public VerifyCodeStatus(Integer num) {
        this.remainMsgNum = num;
    }

    public static /* synthetic */ VerifyCodeStatus copy$default(VerifyCodeStatus verifyCodeStatus, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = verifyCodeStatus.remainMsgNum;
        }
        return verifyCodeStatus.copy(num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getRemainMsgNum() {
        return this.remainMsgNum;
    }

    public final VerifyCodeStatus copy(Integer remainMsgNum) {
        return new VerifyCodeStatus(remainMsgNum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VerifyCodeStatus) && Intrinsics.g(this.remainMsgNum, ((VerifyCodeStatus) other).remainMsgNum);
    }

    public final Integer getRemainMsgNum() {
        return this.remainMsgNum;
    }

    public int hashCode() {
        Integer num = this.remainMsgNum;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "VerifyCodeStatus(remainMsgNum=" + this.remainMsgNum + ")";
    }
}
