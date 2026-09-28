package com.sporty.android.core.model.pocket.transaction.fixstatus;

import defpackage.hxa;
import defpackage.uf80;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003JJ\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0006HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000fÊ\u0001\u0002\b(¨\u0006'"}, d2 = {"Lcom/sporty/android/core/model/pocket/transaction/fixstatus/FixStatusResponse;", "", "finalStatus", "", "isMatch", "payId", "", "reason", "tradeId", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFinalStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPayId", "()Ljava/lang/String;", "getReason", "getTradeId", "isMatched", "", "()Z", "isNewTxAdded", "shouldUpdateTx", "getShouldUpdateTx", "reasonTitle", "getReasonTitle", "reasonContent", "getReasonContent", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sporty/android/core/model/pocket/transaction/fixstatus/FixStatusResponse;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FixStatusResponse {
    private final Integer finalStatus;
    private final Integer isMatch;
    private final String payId;
    private final String reason;
    private final String tradeId;

    public FixStatusResponse(Integer num, Integer num2, String str, String str2, String str3) {
        this.finalStatus = num;
        this.isMatch = num2;
        this.payId = str;
        this.reason = str2;
        this.tradeId = str3;
    }

    public static /* synthetic */ FixStatusResponse copy$default(FixStatusResponse fixStatusResponse, Integer num, Integer num2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = fixStatusResponse.finalStatus;
        }
        if ((i & 2) != 0) {
            num2 = fixStatusResponse.isMatch;
        }
        if ((i & 4) != 0) {
            str = fixStatusResponse.payId;
        }
        if ((i & 8) != 0) {
            str2 = fixStatusResponse.reason;
        }
        if ((i & 16) != 0) {
            str3 = fixStatusResponse.tradeId;
        }
        String str4 = str3;
        String str5 = str;
        return fixStatusResponse.copy(num, num2, str5, str2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getFinalStatus() {
        return this.finalStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getIsMatch() {
        return this.isMatch;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPayId() {
        return this.payId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTradeId() {
        return this.tradeId;
    }

    public final FixStatusResponse copy(Integer finalStatus, Integer isMatch, String payId, String reason, String tradeId) {
        return new FixStatusResponse(finalStatus, isMatch, payId, reason, tradeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FixStatusResponse)) {
            return false;
        }
        FixStatusResponse fixStatusResponse = (FixStatusResponse) other;
        return Intrinsics.g(this.finalStatus, fixStatusResponse.finalStatus) && Intrinsics.g(this.isMatch, fixStatusResponse.isMatch) && Intrinsics.g(this.payId, fixStatusResponse.payId) && Intrinsics.g(this.reason, fixStatusResponse.reason) && Intrinsics.g(this.tradeId, fixStatusResponse.tradeId);
    }

    public final Integer getFinalStatus() {
        return this.finalStatus;
    }

    public final String getPayId() {
        return this.payId;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonContent() {
        String str;
        String str2 = this.reason;
        if (str2 != null) {
            List listSplit$default = StringsKt__StringsKt.split$default(str2, new String[]{"."}, false, 2, 2, null);
            if (listSplit$default.isEmpty()) {
                str = null;
            } else {
                str = listSplit$default.size() == 1 ? (String) CollectionsKt.T(listSplit$default) : (String) listSplit$default.get(1);
            }
            if (str != null) {
                return StringsKt.t0(str).toString();
            }
        }
        return null;
    }

    public final String getReasonTitle() {
        String str = this.reason;
        if (str != null) {
            List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
            String str2 = listSplit$default.size() < 2 ? null : (String) CollectionsKt.T(listSplit$default);
            if (str2 != null) {
                return StringsKt.t0(str2).toString();
            }
        }
        return null;
    }

    public final boolean getShouldUpdateTx() {
        if (!isMatched()) {
            return false;
        }
        Integer num = this.finalStatus;
        if (num != null && num.intValue() == 10) {
            return false;
        }
        Integer num2 = this.finalStatus;
        return num2 == null || num2.intValue() != 90;
    }

    public final String getTradeId() {
        return this.tradeId;
    }

    public int hashCode() {
        Integer num = this.finalStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.isMatch;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.payId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reason;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tradeId;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Integer isMatch() {
        return this.isMatch;
    }

    public final boolean isMatched() {
        Integer num = this.isMatch;
        return num != null && num.intValue() == 1;
    }

    public final boolean isNewTxAdded() {
        return isMatched() && this.tradeId != null;
    }

    public String toString() {
        Integer num = this.finalStatus;
        Integer num2 = this.isMatch;
        String str = this.payId;
        String str2 = this.reason;
        String str3 = this.tradeId;
        StringBuilder sb = new StringBuilder("FixStatusResponse(finalStatus=");
        sb.append(num);
        sb.append(", isMatch=");
        sb.append(num2);
        sb.append(", payId=");
        hxa.c(sb, str, ", reason=", str2, ", tradeId=");
        return uf80.a(sb, str3, ")");
    }
}
