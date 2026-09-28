package com.sporty.android.core.model.pay.pix.data.dto;

import com.appsflyer.internal.x;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.pr0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JD\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006!"}, d2 = {"Lcom/sporty/android/core/model/pay/pix/data/dto/PixPendingDepositResponse;", "", "tradeId", "", "amount", "", "currency", "expirationDate", "qrCode", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getTradeId", "()Ljava/lang/String;", "getAmount", "()J", "getCurrency", "getExpirationDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getQrCode", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/sporty/android/core/model/pay/pix/data/dto/PixPendingDepositResponse;", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PixPendingDepositResponse {
    private final long amount;
    private final String currency;
    private final Long expirationDate;
    private final String qrCode;
    private final String tradeId;

    public PixPendingDepositResponse(String str, long j, String str2, Long l, String str3) {
        str.getClass();
        str2.getClass();
        this.tradeId = str;
        this.amount = j;
        this.currency = str2;
        this.expirationDate = l;
        this.qrCode = str3;
    }

    public static /* synthetic */ PixPendingDepositResponse copy$default(PixPendingDepositResponse pixPendingDepositResponse, String str, long j, String str2, Long l, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pixPendingDepositResponse.tradeId;
        }
        if ((i & 2) != 0) {
            j = pixPendingDepositResponse.amount;
        }
        if ((i & 4) != 0) {
            str2 = pixPendingDepositResponse.currency;
        }
        if ((i & 8) != 0) {
            l = pixPendingDepositResponse.expirationDate;
        }
        if ((i & 16) != 0) {
            str3 = pixPendingDepositResponse.qrCode;
        }
        String str4 = str3;
        String str5 = str2;
        return pixPendingDepositResponse.copy(str, j, str5, l, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeId() {
        return this.tradeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getQrCode() {
        return this.qrCode;
    }

    public final PixPendingDepositResponse copy(String tradeId, long amount, String currency, Long expirationDate, String qrCode) {
        tradeId.getClass();
        currency.getClass();
        return new PixPendingDepositResponse(tradeId, amount, currency, expirationDate, qrCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PixPendingDepositResponse)) {
            return false;
        }
        PixPendingDepositResponse pixPendingDepositResponse = (PixPendingDepositResponse) other;
        return Intrinsics.g(this.tradeId, pixPendingDepositResponse.tradeId) && this.amount == pixPendingDepositResponse.amount && Intrinsics.g(this.currency, pixPendingDepositResponse.currency) && Intrinsics.g(this.expirationDate, pixPendingDepositResponse.expirationDate) && Intrinsics.g(this.qrCode, pixPendingDepositResponse.qrCode);
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    public final String getQrCode() {
        return this.qrCode;
    }

    public final String getTradeId() {
        return this.tradeId;
    }

    public int hashCode() {
        int iA = gmf0.a(f87.a(this.tradeId.hashCode() * 31, this.amount, 31), 31, this.currency);
        Long l = this.expirationDate;
        int iHashCode = (iA + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.qrCode;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.tradeId;
        long j = this.amount;
        String str2 = this.currency;
        Long l = this.expirationDate;
        String str3 = this.qrCode;
        StringBuilder sbA = x.a(j, "PixPendingDepositResponse(tradeId=", str, ", amount=");
        sbA.append(", currency=");
        sbA.append(str2);
        sbA.append(", expirationDate=");
        sbA.append(l);
        return pr0.a(sbA, ", qrCode=", str3, ")");
    }
}
