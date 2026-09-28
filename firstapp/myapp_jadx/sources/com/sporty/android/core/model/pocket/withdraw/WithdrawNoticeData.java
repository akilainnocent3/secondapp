package com.sporty.android.core.model.pocket.withdraw;

import com.twilio.voice.EventKeys;
import defpackage.kwi;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J<\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/core/model/pocket/withdraw/WithdrawNoticeData;", "", "ableToWithdraw", "", "needNotice", "title", "", EventKeys.ERROR_MESSAGE, "<init>", "(Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;)V", "getAbleToWithdraw", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNeedNotice", "()Z", "getTitle", "()Ljava/lang/String;", "getMessage", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;)Lcom/sporty/android/core/model/pocket/withdraw/WithdrawNoticeData;", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WithdrawNoticeData {
    private final Boolean ableToWithdraw;
    private final String message;
    private final boolean needNotice;
    private final String title;

    public WithdrawNoticeData(Boolean bool, boolean z, String str, String str2) {
        this.ableToWithdraw = bool;
        this.needNotice = z;
        this.title = str;
        this.message = str2;
    }

    public static /* synthetic */ WithdrawNoticeData copy$default(WithdrawNoticeData withdrawNoticeData, Boolean bool, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = withdrawNoticeData.ableToWithdraw;
        }
        if ((i & 2) != 0) {
            z = withdrawNoticeData.needNotice;
        }
        if ((i & 4) != 0) {
            str = withdrawNoticeData.title;
        }
        if ((i & 8) != 0) {
            str2 = withdrawNoticeData.message;
        }
        return withdrawNoticeData.copy(bool, z, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAbleToWithdraw() {
        return this.ableToWithdraw;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getNeedNotice() {
        return this.needNotice;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final WithdrawNoticeData copy(Boolean ableToWithdraw, boolean needNotice, String title, String message) {
        return new WithdrawNoticeData(ableToWithdraw, needNotice, title, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawNoticeData)) {
            return false;
        }
        WithdrawNoticeData withdrawNoticeData = (WithdrawNoticeData) other;
        return Intrinsics.g(this.ableToWithdraw, withdrawNoticeData.ableToWithdraw) && this.needNotice == withdrawNoticeData.needNotice && Intrinsics.g(this.title, withdrawNoticeData.title) && Intrinsics.g(this.message, withdrawNoticeData.message);
    }

    public final Boolean getAbleToWithdraw() {
        return this.ableToWithdraw;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getNeedNotice() {
        return this.needNotice;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Boolean bool = this.ableToWithdraw;
        int iA = mtg0.a((bool == null ? 0 : bool.hashCode()) * 31, 31, this.needNotice);
        String str = this.title;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.ableToWithdraw;
        boolean z = this.needNotice;
        String str = this.title;
        String str2 = this.message;
        StringBuilder sb = new StringBuilder("WithdrawNoticeData(ableToWithdraw=");
        sb.append(bool);
        sb.append(", needNotice=");
        sb.append(z);
        sb.append(", title=");
        return kwi.a(sb, str, ", message=", str2, ")");
    }
}
