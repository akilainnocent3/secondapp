package com.sporty.android.core.model.pocket.withdraw.transfer;

import defpackage.iib0;
import defpackage.mh2;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0092\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00103J\u0014\u00104\u001a\u00020\u00032\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00106\u001a\u00020\tHÖ\u0081\u0004J\n\u00107\u001a\u000208HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0019\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006:"}, d2 = {"Lcom/sporty/android/core/model/pocket/withdraw/transfer/TransferStatus;", "", "bvn", "", "email", "withdrawPin", "otp", "enableTransfer", "maxRecipients", "", "maxSenders", "enableTime", "", "maxDailyTransferAmount", "Ljava/math/BigDecimal;", "minTransferAmount", "maxTransferAmount", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getBvn", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEmail", "getWithdrawPin", "getOtp", "getEnableTransfer", "getMaxRecipients", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxSenders", "getEnableTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMaxDailyTransferAmount", "()Ljava/math/BigDecimal;", "getMinTransferAmount", "getMaxTransferAmount", "isVerificationAllPassed", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/sporty/android/core/model/pocket/withdraw/transfer/TransferStatus;", "equals", "other", "hashCode", "toString", "", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TransferStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final TransferStatus f2default = new TransferStatus(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    private final Boolean bvn;
    private final Boolean email;
    private final Long enableTime;
    private final Boolean enableTransfer;
    private final BigDecimal maxDailyTransferAmount;
    private final Integer maxRecipients;
    private final Integer maxSenders;
    private final BigDecimal maxTransferAmount;
    private final BigDecimal minTransferAmount;
    private final Boolean otp;
    private final Boolean withdrawPin;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/pocket/withdraw/transfer/TransferStatus$Companion;", "", "<init>", "()V", "default", "Lcom/sporty/android/core/model/pocket/withdraw/transfer/TransferStatus;", "getDefault", "()Lcom/sporty/android/core/model/pocket/withdraw/transfer/TransferStatus;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TransferStatus getDefault() {
            return TransferStatus.f2default;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TransferStatus(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2, Long l, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : bigDecimal, (i & 512) != 0 ? null : bigDecimal2, (i & 1024) != 0 ? null : bigDecimal3);
    }

    public static /* synthetic */ TransferStatus copy$default(TransferStatus transferStatus, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2, Long l, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = transferStatus.bvn;
        }
        if ((i & 2) != 0) {
            bool2 = transferStatus.email;
        }
        if ((i & 4) != 0) {
            bool3 = transferStatus.withdrawPin;
        }
        if ((i & 8) != 0) {
            bool4 = transferStatus.otp;
        }
        if ((i & 16) != 0) {
            bool5 = transferStatus.enableTransfer;
        }
        if ((i & 32) != 0) {
            num = transferStatus.maxRecipients;
        }
        if ((i & 64) != 0) {
            num2 = transferStatus.maxSenders;
        }
        if ((i & 128) != 0) {
            l = transferStatus.enableTime;
        }
        if ((i & 256) != 0) {
            bigDecimal = transferStatus.maxDailyTransferAmount;
        }
        if ((i & 512) != 0) {
            bigDecimal2 = transferStatus.minTransferAmount;
        }
        if ((i & 1024) != 0) {
            bigDecimal3 = transferStatus.maxTransferAmount;
        }
        BigDecimal bigDecimal4 = bigDecimal2;
        BigDecimal bigDecimal5 = bigDecimal3;
        Long l2 = l;
        BigDecimal bigDecimal6 = bigDecimal;
        Integer num3 = num;
        Integer num4 = num2;
        Boolean bool6 = bool5;
        Boolean bool7 = bool3;
        return transferStatus.copy(bool, bool2, bool7, bool4, bool6, num3, num4, l2, bigDecimal6, bigDecimal4, bigDecimal5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getBvn() {
        return this.bvn;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getMinTransferAmount() {
        return this.minTransferAmount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getMaxTransferAmount() {
        return this.maxTransferAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getWithdrawPin() {
        return this.withdrawPin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getOtp() {
        return this.otp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getEnableTransfer() {
        return this.enableTransfer;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMaxRecipients() {
        return this.maxRecipients;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getMaxSenders() {
        return this.maxSenders;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getEnableTime() {
        return this.enableTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getMaxDailyTransferAmount() {
        return this.maxDailyTransferAmount;
    }

    public final TransferStatus copy(Boolean bvn, Boolean email, Boolean withdrawPin, Boolean otp, Boolean enableTransfer, Integer maxRecipients, Integer maxSenders, Long enableTime, BigDecimal maxDailyTransferAmount, BigDecimal minTransferAmount, BigDecimal maxTransferAmount) {
        return new TransferStatus(bvn, email, withdrawPin, otp, enableTransfer, maxRecipients, maxSenders, enableTime, maxDailyTransferAmount, minTransferAmount, maxTransferAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferStatus)) {
            return false;
        }
        TransferStatus transferStatus = (TransferStatus) other;
        return Intrinsics.g(this.bvn, transferStatus.bvn) && Intrinsics.g(this.email, transferStatus.email) && Intrinsics.g(this.withdrawPin, transferStatus.withdrawPin) && Intrinsics.g(this.otp, transferStatus.otp) && Intrinsics.g(this.enableTransfer, transferStatus.enableTransfer) && Intrinsics.g(this.maxRecipients, transferStatus.maxRecipients) && Intrinsics.g(this.maxSenders, transferStatus.maxSenders) && Intrinsics.g(this.enableTime, transferStatus.enableTime) && Intrinsics.g(this.maxDailyTransferAmount, transferStatus.maxDailyTransferAmount) && Intrinsics.g(this.minTransferAmount, transferStatus.minTransferAmount) && Intrinsics.g(this.maxTransferAmount, transferStatus.maxTransferAmount);
    }

    public final Boolean getBvn() {
        return this.bvn;
    }

    public final Boolean getEmail() {
        return this.email;
    }

    public final Long getEnableTime() {
        return this.enableTime;
    }

    public final Boolean getEnableTransfer() {
        return this.enableTransfer;
    }

    public final BigDecimal getMaxDailyTransferAmount() {
        return this.maxDailyTransferAmount;
    }

    public final Integer getMaxRecipients() {
        return this.maxRecipients;
    }

    public final Integer getMaxSenders() {
        return this.maxSenders;
    }

    public final BigDecimal getMaxTransferAmount() {
        return this.maxTransferAmount;
    }

    public final BigDecimal getMinTransferAmount() {
        return this.minTransferAmount;
    }

    public final Boolean getOtp() {
        return this.otp;
    }

    public final Boolean getWithdrawPin() {
        return this.withdrawPin;
    }

    public int hashCode() {
        Boolean bool = this.bvn;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.email;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.withdrawPin;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.otp;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.enableTransfer;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num = this.maxRecipients;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxSenders;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.enableTime;
        int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        BigDecimal bigDecimal = this.maxDailyTransferAmount;
        int iHashCode9 = (iHashCode8 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.minTransferAmount;
        int iHashCode10 = (iHashCode9 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.maxTransferAmount;
        return iHashCode10 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }

    public final boolean isVerificationAllPassed() {
        Boolean bool = this.bvn;
        Boolean bool2 = Boolean.TRUE;
        return Intrinsics.g(bool, bool2) && Intrinsics.g(this.withdrawPin, bool2) && Intrinsics.g(this.email, bool2);
    }

    public String toString() {
        Boolean bool = this.bvn;
        Boolean bool2 = this.email;
        Boolean bool3 = this.withdrawPin;
        Boolean bool4 = this.otp;
        Boolean bool5 = this.enableTransfer;
        Integer num = this.maxRecipients;
        Integer num2 = this.maxSenders;
        Long l = this.enableTime;
        BigDecimal bigDecimal = this.maxDailyTransferAmount;
        BigDecimal bigDecimal2 = this.minTransferAmount;
        BigDecimal bigDecimal3 = this.maxTransferAmount;
        StringBuilder sb = new StringBuilder("TransferStatus(bvn=");
        sb.append(bool);
        sb.append(", email=");
        sb.append(bool2);
        sb.append(", withdrawPin=");
        sb.append(bool3);
        sb.append(", otp=");
        sb.append(bool4);
        sb.append(", enableTransfer=");
        sb.append(bool5);
        sb.append(", maxRecipients=");
        sb.append(num);
        sb.append(", maxSenders=");
        sb.append(num2);
        sb.append(", enableTime=");
        sb.append(l);
        sb.append(", maxDailyTransferAmount=");
        iib0.b(sb, bigDecimal, ", minTransferAmount=", bigDecimal2, ", maxTransferAmount=");
        return mh2.a(")", sb, bigDecimal3);
    }

    public TransferStatus(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2, Long l, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.bvn = bool;
        this.email = bool2;
        this.withdrawPin = bool3;
        this.otp = bool4;
        this.enableTransfer = bool5;
        this.maxRecipients = num;
        this.maxSenders = num2;
        this.enableTime = l;
        this.maxDailyTransferAmount = bigDecimal;
        this.minTransferAmount = bigDecimal2;
        this.maxTransferAmount = bigDecimal3;
    }

    public TransferStatus() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
