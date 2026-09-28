package com.sporty.android.core.model.pocket.withdraw;

import com.appsflyer.AppsFlyerProperties;
import com.sporty.android.core.model.pocket.common.ClabeType;
import defpackage.dd3;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.oie;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002XYBÿ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u008e\u0002\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010RJ\u0014\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010V\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010W\u001a\u00020\bHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0002\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010+\u001a\u0004\b-\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:Ê\u0001\u0002\b[¨\u0006Z"}, d2 = {"Lcom/sporty/android/core/model/pocket/withdraw/WithdrawRequest;", "", "isConfirmAudit", "", "payAmount", "Ljava/math/BigDecimal;", "payChId", "phoneNo", "", "country", "currency", "whtAmount", "bankAssetId", "bankCode", "bankId", "bankAccNum", "accountType", AppsFlyerProperties.CHANNEL, "withdrawPINCode", "withdrawFingerprintToken", "withdrawOTPUnifyCode", "withdrawOTPUnifyToken", "ispb", "branch", "accountId", "clabeNumber", "clabeType", "Lcom/sporty/android/core/model/pocket/common/ClabeType;", "<init>", "(ILjava/math/BigDecimal;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/pocket/common/ClabeType;)V", "isConfirmAudit$annotations", "()V", "()I", "getPayAmount", "()Ljava/math/BigDecimal;", "getPayChId", "getPhoneNo", "()Ljava/lang/String;", "getCountry", "getCurrency", "getWhtAmount", "getBankAssetId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBankCode", "getBankId", "getBankAccNum", "getAccountType", "getChannel", "getWithdrawPINCode", "getWithdrawFingerprintToken", "getWithdrawOTPUnifyCode", "getWithdrawOTPUnifyToken", "getIspb", "getBranch", "getAccountId", "getClabeNumber", "getClabeType", "()Lcom/sporty/android/core/model/pocket/common/ClabeType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(ILjava/math/BigDecimal;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/pocket/common/ClabeType;)Lcom/sporty/android/core/model/pocket/withdraw/WithdrawRequest;", "equals", "", "other", "hashCode", "toString", "Companion", "ConfirmAudit", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WithdrawRequest {
    public static final int CONFIRM_AUDIT_FALSE = 0;
    public static final int CONFIRM_AUDIT_TRUE = 1;
    private final String accountId;
    private final String accountType;
    private final String bankAccNum;
    private final Integer bankAssetId;
    private final String bankCode;
    private final Integer bankId;
    private final String branch;
    private final String channel;
    private final String clabeNumber;
    private final ClabeType clabeType;
    private final String country;
    private final String currency;
    private final int isConfirmAudit;
    private final String ispb;
    private final BigDecimal payAmount;
    private final int payChId;
    private final String phoneNo;
    private final BigDecimal whtAmount;
    private final String withdrawFingerprintToken;
    private final String withdrawOTPUnifyCode;
    private final String withdrawOTPUnifyToken;
    private final String withdrawPINCode;

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000Ê\u0001\u000e\b\u0003\u0012\n\b\u0004\u0012\u0006\b\n0\u00058\u0006¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/core/model/pocket/withdraw/WithdrawRequest$ConfirmAudit;", "", "model", "Lkotlin/annotation/Retention;", "value", "Lkotlin/annotation/AnnotationRetention;", "SOURCE"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public @interface ConfirmAudit {
    }

    public /* synthetic */ WithdrawRequest(int i, BigDecimal bigDecimal, int i2, String str, String str2, String str3, BigDecimal bigDecimal2, Integer num, String str4, Integer num2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, ClabeType clabeType, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bigDecimal, i2, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2, str3, (i3 & 64) != 0 ? null : bigDecimal2, (i3 & 128) != 0 ? null : num, (i3 & 256) != 0 ? null : str4, (i3 & 512) != 0 ? null : num2, (i3 & 1024) != 0 ? null : str5, (i3 & 2048) != 0 ? null : str6, (i3 & 4096) != 0 ? null : str7, (i3 & 8192) != 0 ? null : str8, (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str9, (32768 & i3) != 0 ? null : str10, (65536 & i3) != 0 ? null : str11, (131072 & i3) != 0 ? null : str12, (262144 & i3) != 0 ? null : str13, (524288 & i3) != 0 ? null : str14, (1048576 & i3) != 0 ? null : str15, (i3 & 2097152) != 0 ? null : clabeType);
    }

    public static /* synthetic */ WithdrawRequest copy$default(WithdrawRequest withdrawRequest, int i, BigDecimal bigDecimal, int i2, String str, String str2, String str3, BigDecimal bigDecimal2, Integer num, String str4, Integer num2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, ClabeType clabeType, int i3, Object obj) {
        ClabeType clabeType2;
        String str16;
        int i4 = (i3 & 1) != 0 ? withdrawRequest.isConfirmAudit : i;
        BigDecimal bigDecimal3 = (i3 & 2) != 0 ? withdrawRequest.payAmount : bigDecimal;
        int i5 = (i3 & 4) != 0 ? withdrawRequest.payChId : i2;
        String str17 = (i3 & 8) != 0 ? withdrawRequest.phoneNo : str;
        String str18 = (i3 & 16) != 0 ? withdrawRequest.country : str2;
        String str19 = (i3 & 32) != 0 ? withdrawRequest.currency : str3;
        BigDecimal bigDecimal4 = (i3 & 64) != 0 ? withdrawRequest.whtAmount : bigDecimal2;
        Integer num3 = (i3 & 128) != 0 ? withdrawRequest.bankAssetId : num;
        String str20 = (i3 & 256) != 0 ? withdrawRequest.bankCode : str4;
        Integer num4 = (i3 & 512) != 0 ? withdrawRequest.bankId : num2;
        String str21 = (i3 & 1024) != 0 ? withdrawRequest.bankAccNum : str5;
        String str22 = (i3 & 2048) != 0 ? withdrawRequest.accountType : str6;
        String str23 = (i3 & 4096) != 0 ? withdrawRequest.channel : str7;
        String str24 = (i3 & 8192) != 0 ? withdrawRequest.withdrawPINCode : str8;
        int i6 = i4;
        String str25 = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? withdrawRequest.withdrawFingerprintToken : str9;
        String str26 = (i3 & 32768) != 0 ? withdrawRequest.withdrawOTPUnifyCode : str10;
        String str27 = (i3 & 65536) != 0 ? withdrawRequest.withdrawOTPUnifyToken : str11;
        String str28 = (i3 & 131072) != 0 ? withdrawRequest.ispb : str12;
        String str29 = (i3 & 262144) != 0 ? withdrawRequest.branch : str13;
        String str30 = (i3 & 524288) != 0 ? withdrawRequest.accountId : str14;
        String str31 = (i3 & 1048576) != 0 ? withdrawRequest.clabeNumber : str15;
        if ((i3 & 2097152) != 0) {
            str16 = str31;
            clabeType2 = withdrawRequest.clabeType;
        } else {
            clabeType2 = clabeType;
            str16 = str31;
        }
        return withdrawRequest.copy(i6, bigDecimal3, i5, str17, str18, str19, bigDecimal4, num3, str20, num4, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str16, clabeType2);
    }

    public static /* synthetic */ void isConfirmAudit$annotations() {
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
    public final String getBankAccNum() {
        return this.bankAccNum;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getWithdrawPINCode() {
        return this.withdrawPINCode;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getWithdrawFingerprintToken() {
        return this.withdrawFingerprintToken;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getWithdrawOTPUnifyCode() {
        return this.withdrawOTPUnifyCode;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getWithdrawOTPUnifyToken() {
        return this.withdrawOTPUnifyToken;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getIspb() {
        return this.ispb;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getBranch() {
        return this.branch;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getPayAmount() {
        return this.payAmount;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getClabeNumber() {
        return this.clabeNumber;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final ClabeType getClabeType() {
        return this.clabeType;
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
    public final BigDecimal getWhtAmount() {
        return this.whtAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getBankAssetId() {
        return this.bankAssetId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    public final WithdrawRequest copy(int isConfirmAudit, BigDecimal payAmount, int payChId, String phoneNo, String country, String currency, BigDecimal whtAmount, Integer bankAssetId, String bankCode, Integer bankId, String bankAccNum, String accountType, String channel, String withdrawPINCode, String withdrawFingerprintToken, String withdrawOTPUnifyCode, String withdrawOTPUnifyToken, String ispb, String branch, String accountId, String clabeNumber, ClabeType clabeType) {
        payAmount.getClass();
        currency.getClass();
        return new WithdrawRequest(isConfirmAudit, payAmount, payChId, phoneNo, country, currency, whtAmount, bankAssetId, bankCode, bankId, bankAccNum, accountType, channel, withdrawPINCode, withdrawFingerprintToken, withdrawOTPUnifyCode, withdrawOTPUnifyToken, ispb, branch, accountId, clabeNumber, clabeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawRequest)) {
            return false;
        }
        WithdrawRequest withdrawRequest = (WithdrawRequest) other;
        return this.isConfirmAudit == withdrawRequest.isConfirmAudit && Intrinsics.g(this.payAmount, withdrawRequest.payAmount) && this.payChId == withdrawRequest.payChId && Intrinsics.g(this.phoneNo, withdrawRequest.phoneNo) && Intrinsics.g(this.country, withdrawRequest.country) && Intrinsics.g(this.currency, withdrawRequest.currency) && Intrinsics.g(this.whtAmount, withdrawRequest.whtAmount) && Intrinsics.g(this.bankAssetId, withdrawRequest.bankAssetId) && Intrinsics.g(this.bankCode, withdrawRequest.bankCode) && Intrinsics.g(this.bankId, withdrawRequest.bankId) && Intrinsics.g(this.bankAccNum, withdrawRequest.bankAccNum) && Intrinsics.g(this.accountType, withdrawRequest.accountType) && Intrinsics.g(this.channel, withdrawRequest.channel) && Intrinsics.g(this.withdrawPINCode, withdrawRequest.withdrawPINCode) && Intrinsics.g(this.withdrawFingerprintToken, withdrawRequest.withdrawFingerprintToken) && Intrinsics.g(this.withdrawOTPUnifyCode, withdrawRequest.withdrawOTPUnifyCode) && Intrinsics.g(this.withdrawOTPUnifyToken, withdrawRequest.withdrawOTPUnifyToken) && Intrinsics.g(this.ispb, withdrawRequest.ispb) && Intrinsics.g(this.branch, withdrawRequest.branch) && Intrinsics.g(this.accountId, withdrawRequest.accountId) && Intrinsics.g(this.clabeNumber, withdrawRequest.clabeNumber) && this.clabeType == withdrawRequest.clabeType;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getAccountType() {
        return this.accountType;
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

    public final String getBranch() {
        return this.branch;
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

    public final String getIspb() {
        return this.ispb;
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

    public final BigDecimal getWhtAmount() {
        return this.whtAmount;
    }

    public final String getWithdrawFingerprintToken() {
        return this.withdrawFingerprintToken;
    }

    public final String getWithdrawOTPUnifyCode() {
        return this.withdrawOTPUnifyCode;
    }

    public final String getWithdrawOTPUnifyToken() {
        return this.withdrawOTPUnifyToken;
    }

    public final String getWithdrawPINCode() {
        return this.withdrawPINCode;
    }

    public int hashCode() {
        int iA = gpp.a(this.payChId, dd3.a(this.payAmount, Integer.hashCode(this.isConfirmAudit) * 31, 31), 31);
        String str = this.phoneNo;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.country;
        int iA2 = gmf0.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.currency);
        BigDecimal bigDecimal = this.whtAmount;
        int iHashCode2 = (iA2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num = this.bankAssetId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.bankCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.bankId;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.bankAccNum;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.accountType;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.channel;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.withdrawPINCode;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.withdrawFingerprintToken;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.withdrawOTPUnifyCode;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.withdrawOTPUnifyToken;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.ispb;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.branch;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.accountId;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.clabeNumber;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        ClabeType clabeType = this.clabeType;
        return iHashCode16 + (clabeType != null ? clabeType.hashCode() : 0);
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
        BigDecimal bigDecimal2 = this.whtAmount;
        Integer num = this.bankAssetId;
        String str4 = this.bankCode;
        Integer num2 = this.bankId;
        String str5 = this.bankAccNum;
        String str6 = this.accountType;
        String str7 = this.channel;
        String str8 = this.withdrawPINCode;
        String str9 = this.withdrawFingerprintToken;
        String str10 = this.withdrawOTPUnifyCode;
        String str11 = this.withdrawOTPUnifyToken;
        String str12 = this.ispb;
        String str13 = this.branch;
        String str14 = this.accountId;
        String str15 = this.clabeNumber;
        ClabeType clabeType = this.clabeType;
        StringBuilder sb = new StringBuilder("WithdrawRequest(isConfirmAudit=");
        sb.append(i);
        sb.append(", payAmount=");
        sb.append(bigDecimal);
        sb.append(", payChId=");
        f78.b(i2, ", phoneNo=", str, ", country=", sb);
        hxa.c(sb, str2, ", currency=", str3, ", whtAmount=");
        sb.append(bigDecimal2);
        sb.append(", bankAssetId=");
        sb.append(num);
        sb.append(", bankCode=");
        oie.a(num2, str4, ", bankId=", ", bankAccNum=", sb);
        hxa.c(sb, str5, ", accountType=", str6, ", channel=");
        hxa.c(sb, str7, ", withdrawPINCode=", str8, ", withdrawFingerprintToken=");
        hxa.c(sb, str9, ", withdrawOTPUnifyCode=", str10, ", withdrawOTPUnifyToken=");
        hxa.c(sb, str11, ", ispb=", str12, ", branch=");
        hxa.c(sb, str13, ", accountId=", str14, ", clabeNumber=");
        sb.append(str15);
        sb.append(", clabeType=");
        sb.append(clabeType);
        sb.append(")");
        return sb.toString();
    }

    public WithdrawRequest(int i, BigDecimal bigDecimal, int i2, String str, String str2, String str3, BigDecimal bigDecimal2, Integer num, String str4, Integer num2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, ClabeType clabeType) {
        bigDecimal.getClass();
        str3.getClass();
        this.isConfirmAudit = i;
        this.payAmount = bigDecimal;
        this.payChId = i2;
        this.phoneNo = str;
        this.country = str2;
        this.currency = str3;
        this.whtAmount = bigDecimal2;
        this.bankAssetId = num;
        this.bankCode = str4;
        this.bankId = num2;
        this.bankAccNum = str5;
        this.accountType = str6;
        this.channel = str7;
        this.withdrawPINCode = str8;
        this.withdrawFingerprintToken = str9;
        this.withdrawOTPUnifyCode = str10;
        this.withdrawOTPUnifyToken = str11;
        this.ispb = str12;
        this.branch = str13;
        this.accountId = str14;
        this.clabeNumber = str15;
        this.clabeType = clabeType;
    }
}
