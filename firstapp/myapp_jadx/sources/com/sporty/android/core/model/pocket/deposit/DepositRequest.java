package com.sporty.android.core.model.pocket.deposit;

import com.appsflyer.AppsFlyerProperties;
import com.sporty.android.core.model.pocket.common.ClabeType;
import defpackage.dd3;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.oie;
import defpackage.w03;
import defpackage.x03;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001f\u0010 J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010G\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010J\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010N\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010O\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\bHÆ\u0003J¦\u0002\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010YJ\u0014\u0010Z\u001a\u00020\u00132\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\\\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010]\u001a\u00020\bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010+\u001a\u0004\b.\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u00104\u001a\u0004\b5\u00103R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010&R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b?\u0010&Ê\u0001\u0002\b_¨\u0006^"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/DepositRequest;", "", "isConfirmAudit", "", "payAmount", "Ljava/math/BigDecimal;", "payChId", "phoneNo", "", "country", "currency", "bankAssetId", "bankCode", "bankAccNum", "bankId", "cardNum", "cardExpDate", "cardCvv", "autoSave", "", "saveAssetAsDefault", AppsFlyerProperties.CHANNEL, "depositPINCode", "depositFingerprintToken", "depositOTPToken", "voucherCode", "uid", "clabeNumber", "clabeType", "Lcom/sporty/android/core/model/pocket/common/ClabeType;", "entrySource", "<init>", "(ILjava/math/BigDecimal;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/pocket/common/ClabeType;Ljava/lang/String;)V", "()I", "getPayAmount", "()Ljava/math/BigDecimal;", "getPayChId", "getPhoneNo", "()Ljava/lang/String;", "getCountry", "getCurrency", "getBankAssetId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBankCode", "getBankAccNum", "getBankId", "getCardNum", "getCardExpDate", "getCardCvv", "getAutoSave", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSaveAssetAsDefault", "getChannel", "getDepositPINCode", "getDepositFingerprintToken", "getDepositOTPToken", "getVoucherCode", "getUid", "getClabeNumber", "getClabeType", "()Lcom/sporty/android/core/model/pocket/common/ClabeType;", "getEntrySource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(ILjava/math/BigDecimal;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/pocket/common/ClabeType;Ljava/lang/String;)Lcom/sporty/android/core/model/pocket/deposit/DepositRequest;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DepositRequest {
    private final Boolean autoSave;
    private final String bankAccNum;
    private final Integer bankAssetId;
    private final String bankCode;
    private final Integer bankId;
    private final String cardCvv;
    private final String cardExpDate;
    private final String cardNum;
    private final String channel;
    private final String clabeNumber;
    private final ClabeType clabeType;
    private final String country;
    private final String currency;
    private final String depositFingerprintToken;
    private final String depositOTPToken;
    private final String depositPINCode;
    private final String entrySource;
    private final int isConfirmAudit;
    private final BigDecimal payAmount;
    private final int payChId;
    private final String phoneNo;
    private final Boolean saveAssetAsDefault;
    private final String uid;
    private final String voucherCode;

    public /* synthetic */ DepositRequest(int i, BigDecimal bigDecimal, int i2, String str, String str2, String str3, Integer num, String str4, String str5, Integer num2, String str6, String str7, String str8, Boolean bool, Boolean bool2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, ClabeType clabeType, String str16, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bigDecimal, i2, str, (i3 & 16) != 0 ? null : str2, str3, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : str4, (i3 & 256) != 0 ? null : str5, (i3 & 512) != 0 ? null : num2, (i3 & 1024) != 0 ? null : str6, (i3 & 2048) != 0 ? null : str7, (i3 & 4096) != 0 ? null : str8, (i3 & 8192) != 0 ? null : bool, (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : bool2, (32768 & i3) != 0 ? null : str9, (65536 & i3) != 0 ? null : str10, (131072 & i3) != 0 ? null : str11, (262144 & i3) != 0 ? null : str12, (524288 & i3) != 0 ? null : str13, (1048576 & i3) != 0 ? null : str14, (2097152 & i3) != 0 ? null : str15, (4194304 & i3) != 0 ? null : clabeType, (i3 & 8388608) != 0 ? null : str16);
    }

    public static /* synthetic */ DepositRequest copy$default(DepositRequest depositRequest, int i, BigDecimal bigDecimal, int i2, String str, String str2, String str3, Integer num, String str4, String str5, Integer num2, String str6, String str7, String str8, Boolean bool, Boolean bool2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, ClabeType clabeType, String str16, int i3, Object obj) {
        String str17;
        ClabeType clabeType2;
        int i4 = (i3 & 1) != 0 ? depositRequest.isConfirmAudit : i;
        BigDecimal bigDecimal2 = (i3 & 2) != 0 ? depositRequest.payAmount : bigDecimal;
        int i5 = (i3 & 4) != 0 ? depositRequest.payChId : i2;
        String str18 = (i3 & 8) != 0 ? depositRequest.phoneNo : str;
        String str19 = (i3 & 16) != 0 ? depositRequest.country : str2;
        String str20 = (i3 & 32) != 0 ? depositRequest.currency : str3;
        Integer num3 = (i3 & 64) != 0 ? depositRequest.bankAssetId : num;
        String str21 = (i3 & 128) != 0 ? depositRequest.bankCode : str4;
        String str22 = (i3 & 256) != 0 ? depositRequest.bankAccNum : str5;
        Integer num4 = (i3 & 512) != 0 ? depositRequest.bankId : num2;
        String str23 = (i3 & 1024) != 0 ? depositRequest.cardNum : str6;
        String str24 = (i3 & 2048) != 0 ? depositRequest.cardExpDate : str7;
        String str25 = (i3 & 4096) != 0 ? depositRequest.cardCvv : str8;
        Boolean bool3 = (i3 & 8192) != 0 ? depositRequest.autoSave : bool;
        int i6 = i4;
        Boolean bool4 = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? depositRequest.saveAssetAsDefault : bool2;
        String str26 = (i3 & 32768) != 0 ? depositRequest.channel : str9;
        String str27 = (i3 & 65536) != 0 ? depositRequest.depositPINCode : str10;
        String str28 = (i3 & 131072) != 0 ? depositRequest.depositFingerprintToken : str11;
        String str29 = (i3 & 262144) != 0 ? depositRequest.depositOTPToken : str12;
        String str30 = (i3 & 524288) != 0 ? depositRequest.voucherCode : str13;
        String str31 = (i3 & 1048576) != 0 ? depositRequest.uid : str14;
        String str32 = (i3 & 2097152) != 0 ? depositRequest.clabeNumber : str15;
        ClabeType clabeType3 = (i3 & 4194304) != 0 ? depositRequest.clabeType : clabeType;
        if ((i3 & 8388608) != 0) {
            clabeType2 = clabeType3;
            str17 = depositRequest.entrySource;
        } else {
            str17 = str16;
            clabeType2 = clabeType3;
        }
        return depositRequest.copy(i6, bigDecimal2, i5, str18, str19, str20, num3, str21, str22, num4, str23, str24, str25, bool3, bool4, str26, str27, str28, str29, str30, str31, str32, clabeType2, str17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIsConfirmAudit() {
        return this.isConfirmAudit;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getBankId() {
        return this.bankId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCardNum() {
        return this.cardNum;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCardExpDate() {
        return this.cardExpDate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCardCvv() {
        return this.cardCvv;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getAutoSave() {
        return this.autoSave;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getSaveAssetAsDefault() {
        return this.saveAssetAsDefault;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getDepositPINCode() {
        return this.depositPINCode;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getDepositFingerprintToken() {
        return this.depositFingerprintToken;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getDepositOTPToken() {
        return this.depositOTPToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getPayAmount() {
        return this.payAmount;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getVoucherCode() {
        return this.voucherCode;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getClabeNumber() {
        return this.clabeNumber;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final ClabeType getClabeType() {
        return this.clabeType;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getEntrySource() {
        return this.entrySource;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPayChId() {
        return this.payChId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhoneNo() {
        return this.phoneNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getBankAssetId() {
        return this.bankAssetId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBankAccNum() {
        return this.bankAccNum;
    }

    public final DepositRequest copy(int isConfirmAudit, BigDecimal payAmount, int payChId, String phoneNo, String country, String currency, Integer bankAssetId, String bankCode, String bankAccNum, Integer bankId, String cardNum, String cardExpDate, String cardCvv, Boolean autoSave, Boolean saveAssetAsDefault, String channel, String depositPINCode, String depositFingerprintToken, String depositOTPToken, String voucherCode, String uid, String clabeNumber, ClabeType clabeType, String entrySource) {
        payAmount.getClass();
        currency.getClass();
        return new DepositRequest(isConfirmAudit, payAmount, payChId, phoneNo, country, currency, bankAssetId, bankCode, bankAccNum, bankId, cardNum, cardExpDate, cardCvv, autoSave, saveAssetAsDefault, channel, depositPINCode, depositFingerprintToken, depositOTPToken, voucherCode, uid, clabeNumber, clabeType, entrySource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepositRequest)) {
            return false;
        }
        DepositRequest depositRequest = (DepositRequest) other;
        return this.isConfirmAudit == depositRequest.isConfirmAudit && Intrinsics.g(this.payAmount, depositRequest.payAmount) && this.payChId == depositRequest.payChId && Intrinsics.g(this.phoneNo, depositRequest.phoneNo) && Intrinsics.g(this.country, depositRequest.country) && Intrinsics.g(this.currency, depositRequest.currency) && Intrinsics.g(this.bankAssetId, depositRequest.bankAssetId) && Intrinsics.g(this.bankCode, depositRequest.bankCode) && Intrinsics.g(this.bankAccNum, depositRequest.bankAccNum) && Intrinsics.g(this.bankId, depositRequest.bankId) && Intrinsics.g(this.cardNum, depositRequest.cardNum) && Intrinsics.g(this.cardExpDate, depositRequest.cardExpDate) && Intrinsics.g(this.cardCvv, depositRequest.cardCvv) && Intrinsics.g(this.autoSave, depositRequest.autoSave) && Intrinsics.g(this.saveAssetAsDefault, depositRequest.saveAssetAsDefault) && Intrinsics.g(this.channel, depositRequest.channel) && Intrinsics.g(this.depositPINCode, depositRequest.depositPINCode) && Intrinsics.g(this.depositFingerprintToken, depositRequest.depositFingerprintToken) && Intrinsics.g(this.depositOTPToken, depositRequest.depositOTPToken) && Intrinsics.g(this.voucherCode, depositRequest.voucherCode) && Intrinsics.g(this.uid, depositRequest.uid) && Intrinsics.g(this.clabeNumber, depositRequest.clabeNumber) && this.clabeType == depositRequest.clabeType && Intrinsics.g(this.entrySource, depositRequest.entrySource);
    }

    public final Boolean getAutoSave() {
        return this.autoSave;
    }

    public final String getBankAccNum() {
        return this.bankAccNum;
    }

    public final Integer getBankAssetId() {
        return this.bankAssetId;
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final Integer getBankId() {
        return this.bankId;
    }

    public final String getCardCvv() {
        return this.cardCvv;
    }

    public final String getCardExpDate() {
        return this.cardExpDate;
    }

    public final String getCardNum() {
        return this.cardNum;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getClabeNumber() {
        return this.clabeNumber;
    }

    public final ClabeType getClabeType() {
        return this.clabeType;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDepositFingerprintToken() {
        return this.depositFingerprintToken;
    }

    public final String getDepositOTPToken() {
        return this.depositOTPToken;
    }

    public final String getDepositPINCode() {
        return this.depositPINCode;
    }

    public final String getEntrySource() {
        return this.entrySource;
    }

    public final BigDecimal getPayAmount() {
        return this.payAmount;
    }

    public final int getPayChId() {
        return this.payChId;
    }

    public final String getPhoneNo() {
        return this.phoneNo;
    }

    public final Boolean getSaveAssetAsDefault() {
        return this.saveAssetAsDefault;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getVoucherCode() {
        return this.voucherCode;
    }

    public int hashCode() {
        int iA = gpp.a(this.payChId, dd3.a(this.payAmount, Integer.hashCode(this.isConfirmAudit) * 31, 31), 31);
        String str = this.phoneNo;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.country;
        int iA2 = gmf0.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.currency);
        Integer num = this.bankAssetId;
        int iHashCode2 = (iA2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.bankCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bankAccNum;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.bankId;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.cardNum;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardExpDate;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cardCvv;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.autoSave;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.saveAssetAsDefault;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str8 = this.channel;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.depositPINCode;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.depositFingerprintToken;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.depositOTPToken;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.voucherCode;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.uid;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.clabeNumber;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        ClabeType clabeType = this.clabeType;
        int iHashCode18 = (iHashCode17 + (clabeType == null ? 0 : clabeType.hashCode())) * 31;
        String str15 = this.entrySource;
        return iHashCode18 + (str15 != null ? str15.hashCode() : 0);
    }

    public final int isConfirmAudit() {
        return this.isConfirmAudit;
    }

    public String toString() {
        int i = this.isConfirmAudit;
        BigDecimal bigDecimal = this.payAmount;
        int i2 = this.payChId;
        String str = this.phoneNo;
        String str2 = this.country;
        String str3 = this.currency;
        Integer num = this.bankAssetId;
        String str4 = this.bankCode;
        String str5 = this.bankAccNum;
        Integer num2 = this.bankId;
        String str6 = this.cardNum;
        String str7 = this.cardExpDate;
        String str8 = this.cardCvv;
        Boolean bool = this.autoSave;
        Boolean bool2 = this.saveAssetAsDefault;
        String str9 = this.channel;
        String str10 = this.depositPINCode;
        String str11 = this.depositFingerprintToken;
        String str12 = this.depositOTPToken;
        String str13 = this.voucherCode;
        String str14 = this.uid;
        String str15 = this.clabeNumber;
        ClabeType clabeType = this.clabeType;
        String str16 = this.entrySource;
        StringBuilder sb = new StringBuilder("DepositRequest(isConfirmAudit=");
        sb.append(i);
        sb.append(", payAmount=");
        sb.append(bigDecimal);
        sb.append(", payChId=");
        f78.b(i2, ", phoneNo=", str, ", country=", sb);
        hxa.c(sb, str2, ", currency=", str3, ", bankAssetId=");
        w03.a(num, ", bankCode=", str4, ", bankAccNum=", sb);
        oie.a(num2, str5, ", bankId=", ", cardNum=", sb);
        hxa.c(sb, str6, ", cardExpDate=", str7, ", cardCvv=");
        x03.a(sb, str8, ", autoSave=", bool, ", saveAssetAsDefault=");
        sb.append(bool2);
        sb.append(", channel=");
        sb.append(str9);
        sb.append(", depositPINCode=");
        hxa.c(sb, str10, ", depositFingerprintToken=", str11, ", depositOTPToken=");
        hxa.c(sb, str12, ", voucherCode=", str13, ", uid=");
        hxa.c(sb, str14, ", clabeNumber=", str15, ", clabeType=");
        sb.append(clabeType);
        sb.append(", entrySource=");
        sb.append(str16);
        sb.append(")");
        return sb.toString();
    }

    public DepositRequest(int i, BigDecimal bigDecimal, int i2, String str, String str2, String str3, Integer num, String str4, String str5, Integer num2, String str6, String str7, String str8, Boolean bool, Boolean bool2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, ClabeType clabeType, String str16) {
        bigDecimal.getClass();
        str3.getClass();
        this.isConfirmAudit = i;
        this.payAmount = bigDecimal;
        this.payChId = i2;
        this.phoneNo = str;
        this.country = str2;
        this.currency = str3;
        this.bankAssetId = num;
        this.bankCode = str4;
        this.bankAccNum = str5;
        this.bankId = num2;
        this.cardNum = str6;
        this.cardExpDate = str7;
        this.cardCvv = str8;
        this.autoSave = bool;
        this.saveAssetAsDefault = bool2;
        this.channel = str9;
        this.depositPINCode = str10;
        this.depositFingerprintToken = str11;
        this.depositOTPToken = str12;
        this.voucherCode = str13;
        this.uid = str14;
        this.clabeNumber = str15;
        this.clabeType = clabeType;
        this.entrySource = str16;
    }
}
