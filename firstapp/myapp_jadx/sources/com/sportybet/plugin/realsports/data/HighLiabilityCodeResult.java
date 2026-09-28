package com.sportybet.plugin.realsports.data;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.data.LiabilitiesResponse;
import com.sportygames.crash.models.header.snc.OdQr;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001a"}, d2 = {"Lcom/sportybet/plugin/realsports/data/HighLiabilityCodeResult;", "", "response", "Lcom/sportybet/android/data/LiabilitiesResponse;", "bookingData", "Lcom/sportybet/android/bookingcode/data/dto/BookingData;", "aliasCode", "", "<init>", "(Lcom/sportybet/android/data/LiabilitiesResponse;Lcom/sportybet/android/bookingcode/data/dto/BookingData;Ljava/lang/String;)V", "getResponse", "()Lcom/sportybet/android/data/LiabilitiesResponse;", "getBookingData", "()Lcom/sportybet/android/bookingcode/data/dto/BookingData;", "getAliasCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class HighLiabilityCodeResult {
    public static final int $stable = 8;
    private final String aliasCode;
    private final BookingData bookingData;
    private final LiabilitiesResponse response;

    public HighLiabilityCodeResult(LiabilitiesResponse liabilitiesResponse, BookingData bookingData, String str) {
        liabilitiesResponse.getClass();
        bookingData.getClass();
        str.getClass();
        this.response = liabilitiesResponse;
        this.bookingData = bookingData;
        this.aliasCode = str;
    }

    public static /* synthetic */ HighLiabilityCodeResult copy$default(HighLiabilityCodeResult highLiabilityCodeResult, LiabilitiesResponse liabilitiesResponse, BookingData bookingData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            liabilitiesResponse = highLiabilityCodeResult.response;
        }
        if ((i & 2) != 0) {
            bookingData = highLiabilityCodeResult.bookingData;
        }
        if ((i & 4) != 0) {
            str = highLiabilityCodeResult.aliasCode;
        }
        return highLiabilityCodeResult.copy(liabilitiesResponse, bookingData, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LiabilitiesResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BookingData getBookingData() {
        return this.bookingData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAliasCode() {
        return this.aliasCode;
    }

    public final HighLiabilityCodeResult copy(LiabilitiesResponse response, BookingData bookingData, String aliasCode) {
        response.getClass();
        bookingData.getClass();
        aliasCode.getClass();
        return new HighLiabilityCodeResult(response, bookingData, aliasCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighLiabilityCodeResult)) {
            return false;
        }
        HighLiabilityCodeResult highLiabilityCodeResult = (HighLiabilityCodeResult) other;
        return Intrinsics.g(this.response, highLiabilityCodeResult.response) && Intrinsics.g(this.bookingData, highLiabilityCodeResult.bookingData) && Intrinsics.g(this.aliasCode, highLiabilityCodeResult.aliasCode);
    }

    public final String getAliasCode() {
        return this.aliasCode;
    }

    public final BookingData getBookingData() {
        return this.bookingData;
    }

    public final LiabilitiesResponse getResponse() {
        return this.response;
    }

    public int hashCode() {
        return this.aliasCode.hashCode() + ((this.bookingData.hashCode() + (this.response.hashCode() * 31)) * 31);
    }

    public String toString() {
        LiabilitiesResponse liabilitiesResponse = this.response;
        BookingData bookingData = this.bookingData;
        String str = this.aliasCode;
        StringBuilder sb = new StringBuilder("HighLiabilityCodeResult(response=");
        sb.append(liabilitiesResponse);
        sb.append(OdQr.SEQgxnxZ);
        sb.append(bookingData);
        sb.append(", aliasCode=");
        return uf80.a(sb, str, ")");
    }
}
