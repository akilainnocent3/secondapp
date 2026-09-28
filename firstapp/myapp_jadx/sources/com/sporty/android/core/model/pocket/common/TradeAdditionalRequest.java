package com.sporty.android.core.model.pocket.common;

import defpackage.gmf0;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.uqe0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0005HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012Ê\u0001\u0002\b&¨\u0006%"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/TradeAdditionalRequest;", "", "type", "", "tradeId", "", "sms", "otp", "pin", "reservedPhone", "birthday", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType$annotations", "()V", "getType", "()I", "getTradeId", "()Ljava/lang/String;", "getSms", "getOtp", "getPin", "getReservedPhone", "getBirthday", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TradeAdditionalRequest {
    private final String birthday;
    private final String otp;
    private final String pin;
    private final String reservedPhone;
    private final String sms;
    private final String tradeId;
    private final int type;

    public /* synthetic */ TradeAdditionalRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6);
    }

    public static /* synthetic */ TradeAdditionalRequest copy$default(TradeAdditionalRequest tradeAdditionalRequest, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tradeAdditionalRequest.type;
        }
        if ((i2 & 2) != 0) {
            str = tradeAdditionalRequest.tradeId;
        }
        if ((i2 & 4) != 0) {
            str2 = tradeAdditionalRequest.sms;
        }
        if ((i2 & 8) != 0) {
            str3 = tradeAdditionalRequest.otp;
        }
        if ((i2 & 16) != 0) {
            str4 = tradeAdditionalRequest.pin;
        }
        if ((i2 & 32) != 0) {
            str5 = tradeAdditionalRequest.reservedPhone;
        }
        if ((i2 & 64) != 0) {
            str6 = tradeAdditionalRequest.birthday;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return tradeAdditionalRequest.copy(i, str, str10, str3, str9, str7, str8);
    }

    public static /* synthetic */ void getType$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTradeId() {
        return this.tradeId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSms() {
        return this.sms;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOtp() {
        return this.otp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReservedPhone() {
        return this.reservedPhone;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    public final TradeAdditionalRequest copy(int type, String tradeId, String sms, String otp, String pin, String reservedPhone, String birthday) {
        tradeId.getClass();
        return new TradeAdditionalRequest(type, tradeId, sms, otp, pin, reservedPhone, birthday);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeAdditionalRequest)) {
            return false;
        }
        TradeAdditionalRequest tradeAdditionalRequest = (TradeAdditionalRequest) other;
        return this.type == tradeAdditionalRequest.type && Intrinsics.g(this.tradeId, tradeAdditionalRequest.tradeId) && Intrinsics.g(this.sms, tradeAdditionalRequest.sms) && Intrinsics.g(this.otp, tradeAdditionalRequest.otp) && Intrinsics.g(this.pin, tradeAdditionalRequest.pin) && Intrinsics.g(this.reservedPhone, tradeAdditionalRequest.reservedPhone) && Intrinsics.g(this.birthday, tradeAdditionalRequest.birthday);
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final String getPin() {
        return this.pin;
    }

    public final String getReservedPhone() {
        return this.reservedPhone;
    }

    public final String getSms() {
        return this.sms;
    }

    public final String getTradeId() {
        return this.tradeId;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = gmf0.a(Integer.hashCode(this.type) * 31, 31, this.tradeId);
        String str = this.sms;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.otp;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pin;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reservedPhone;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.birthday;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        int i = this.type;
        String str = this.tradeId;
        String str2 = this.sms;
        String str3 = this.otp;
        String str4 = this.pin;
        String str5 = this.reservedPhone;
        String str6 = this.birthday;
        StringBuilder sbA = uqe0.a(i, "TradeAdditionalRequest(type=", ", tradeId=", str, ", sms=");
        hxa.c(sbA, str2, ", otp=", str3, ", pin=");
        hxa.c(sbA, str4, ", reservedPhone=", str5, ", birthday=");
        return uf80.a(sbA, str6, ")");
    }

    public TradeAdditionalRequest(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        this.type = i;
        this.tradeId = str;
        this.sms = str2;
        this.otp = str3;
        this.pin = str4;
        this.reservedPhone = str5;
        this.birthday = str6;
    }
}
