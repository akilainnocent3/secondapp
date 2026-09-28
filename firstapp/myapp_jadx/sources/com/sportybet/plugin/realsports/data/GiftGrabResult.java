package com.sportybet.plugin.realsports.data;

import com.appsflyer.internal.a0;
import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.pr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0007HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabResult;", "", "resultCode", "", "amount", "", "currency", "", "<init>", "(IJLjava/lang/String;)V", "getResultCode", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getAmount", "()J", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GiftGrabResult {
    public static final int $stable = 0;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("currency")
    private final String currency;

    @SerializedName("resultCode")
    private final int resultCode;

    public /* synthetic */ GiftGrabResult(int i, long j, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? "" : str);
    }

    public static /* synthetic */ GiftGrabResult copy$default(GiftGrabResult giftGrabResult, int i, long j, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = giftGrabResult.resultCode;
        }
        if ((i2 & 2) != 0) {
            j = giftGrabResult.amount;
        }
        if ((i2 & 4) != 0) {
            str = giftGrabResult.currency;
        }
        return giftGrabResult.copy(i, j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResultCode() {
        return this.resultCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final GiftGrabResult copy(int resultCode, long amount, String currency) {
        currency.getClass();
        return new GiftGrabResult(resultCode, amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftGrabResult)) {
            return false;
        }
        GiftGrabResult giftGrabResult = (GiftGrabResult) other;
        return this.resultCode == giftGrabResult.resultCode && this.amount == giftGrabResult.amount && Intrinsics.g(this.currency, giftGrabResult.currency);
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        return this.currency.hashCode() + f87.a(Integer.hashCode(this.resultCode) * 31, this.amount, 31);
    }

    public String toString() {
        int i = this.resultCode;
        long j = this.amount;
        return pr0.a(a0.a("GiftGrabResult(resultCode=", ", amount=", i, j), ", currency=", this.currency, ")");
    }

    public GiftGrabResult(int i, long j, String str) {
        str.getClass();
        this.resultCode = i;
        this.amount = j;
        this.currency = str;
    }
}
