package com.sporty.android.core.model.cashout;

import com.twilio.voice.EventKeys;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/cashout/UnCashableReason;", "", EventKeys.ERROR_CODE, "", "selectionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getSelectionId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UnCashableReason {
    private final String code;
    private final String selectionId;

    public UnCashableReason(String str, String str2) {
        str.getClass();
        this.code = str;
        this.selectionId = str2;
    }

    public static /* synthetic */ UnCashableReason copy$default(UnCashableReason unCashableReason, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unCashableReason.code;
        }
        if ((i & 2) != 0) {
            str2 = unCashableReason.selectionId;
        }
        return unCashableReason.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSelectionId() {
        return this.selectionId;
    }

    public final UnCashableReason copy(String code, String selectionId) {
        code.getClass();
        return new UnCashableReason(code, selectionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnCashableReason)) {
            return false;
        }
        UnCashableReason unCashableReason = (UnCashableReason) other;
        return Intrinsics.g(this.code, unCashableReason.code) && Intrinsics.g(this.selectionId, unCashableReason.selectionId);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getSelectionId() {
        return this.selectionId;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        String str = this.selectionId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return tx5.a("UnCashableReason(code=", this.code, ", selectionId=", this.selectionId, ")");
    }

    public /* synthetic */ UnCashableReason(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
