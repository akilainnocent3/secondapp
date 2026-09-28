package com.sportybet.android.globalpay.data;

import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import defpackage.ai50;
import defpackage.dy5;
import defpackage.f87;
import defpackage.gfs;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.ng1;
import defpackage.to10;
import defpackage.uf80;
import defpackage.uqe0;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001a"}, d2 = {"Lcom/sportybet/android/globalpay/data/KycLimitData;", "", "currentLevel", "", "maxLevel", "paymentLimitTierLevels", "", "Lcom/sportybet/android/globalpay/data/KycLimitData$PaymentLimitLevelData;", "<init>", "(IILjava/util/List;)V", "getCurrentLevel", "()I", "getMaxLevel", "getPaymentLimitTierLevels", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "PaymentLimitLevelData", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class KycLimitData {
    public static final int $stable = 8;
    private final int currentLevel;
    private final int maxLevel;
    private final List<PaymentLimitLevelData> paymentLimitTierLevels;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sportybet/android/globalpay/data/KycLimitData$PaymentLimitLevelData;", "", "level", "", "paymentLimitTypeInfoDetails", "", "Lcom/sportybet/android/globalpay/data/KycLimitData$PaymentLimitLevelData$PaymentLimitTypeInfoDetailsData;", "<init>", "(ILjava/util/List;)V", "getLevel", "()I", "getPaymentLimitTypeInfoDetails", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "PaymentLimitTypeInfoDetailsData", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class PaymentLimitLevelData {
        public static final int $stable = 8;
        private final int level;
        private final List<PaymentLimitTypeInfoDetailsData> paymentLimitTypeInfoDetails;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rÊ\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0000¨\u0006!"}, d2 = {"Lcom/sportybet/android/globalpay/data/KycLimitData$PaymentLimitLevelData$PaymentLimitTypeInfoDetailsData;", "", "channelId", "", "combinedId", "paymentLimitTypeDetails", "", "Lcom/sportybet/android/globalpay/data/KycLimitData$PaymentLimitLevelData$PaymentLimitTypeInfoDetailsData$PaymentLimitTypeDetailsData;", "paymentLimitTypeName", "providerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getCombinedId", "getPaymentLimitTypeDetails", "()Ljava/util/List;", "getPaymentLimitTypeName", "getProviderId", "isChannelLimit", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "PaymentLimitTypeDetailsData", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class PaymentLimitTypeInfoDetailsData {
            public static final int $stable = 8;
            private final String channelId;
            private final String combinedId;
            private final List<PaymentLimitTypeDetailsData> paymentLimitTypeDetails;
            private final String paymentLimitTypeName;
            private final String providerId;

            /* JADX INFO: loaded from: classes2.dex */
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fÊ\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001c"}, d2 = {"Lcom/sportybet/android/globalpay/data/KycLimitData$PaymentLimitLevelData$PaymentLimitTypeInfoDetailsData$PaymentLimitTypeDetailsData;", "", "amountType", "", "currency", "", "maxAmount", "", "paymentType", "<init>", "(ILjava/lang/String;JI)V", "getAmountType", "()I", "getCurrency", "()Ljava/lang/String;", "getMaxAmount", "()J", "getPaymentType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
            public static final /* data */ class PaymentLimitTypeDetailsData {
                public static final int $stable = 0;
                private final int amountType;
                private final String currency;
                private final long maxAmount;
                private final int paymentType;

                public PaymentLimitTypeDetailsData(int i, String str, long j, int i2) {
                    str.getClass();
                    this.amountType = i;
                    this.currency = str;
                    this.maxAmount = j;
                    this.paymentType = i2;
                }

                public static /* synthetic */ PaymentLimitTypeDetailsData copy$default(PaymentLimitTypeDetailsData paymentLimitTypeDetailsData, int i, String str, long j, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        i = paymentLimitTypeDetailsData.amountType;
                    }
                    if ((i3 & 2) != 0) {
                        str = paymentLimitTypeDetailsData.currency;
                    }
                    if ((i3 & 4) != 0) {
                        j = paymentLimitTypeDetailsData.maxAmount;
                    }
                    if ((i3 & 8) != 0) {
                        i2 = paymentLimitTypeDetailsData.paymentType;
                    }
                    int i4 = i2;
                    return paymentLimitTypeDetailsData.copy(i, str, j, i4);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final int getAmountType() {
                    return this.amountType;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getCurrency() {
                    return this.currency;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final long getMaxAmount() {
                    return this.maxAmount;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final int getPaymentType() {
                    return this.paymentType;
                }

                public final PaymentLimitTypeDetailsData copy(int amountType, String currency, long maxAmount, int paymentType) {
                    currency.getClass();
                    return new PaymentLimitTypeDetailsData(amountType, currency, maxAmount, paymentType);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PaymentLimitTypeDetailsData)) {
                        return false;
                    }
                    PaymentLimitTypeDetailsData paymentLimitTypeDetailsData = (PaymentLimitTypeDetailsData) other;
                    return this.amountType == paymentLimitTypeDetailsData.amountType && Intrinsics.g(this.currency, paymentLimitTypeDetailsData.currency) && this.maxAmount == paymentLimitTypeDetailsData.maxAmount && this.paymentType == paymentLimitTypeDetailsData.paymentType;
                }

                public final int getAmountType() {
                    return this.amountType;
                }

                public final String getCurrency() {
                    return this.currency;
                }

                public final long getMaxAmount() {
                    return this.maxAmount;
                }

                public final int getPaymentType() {
                    return this.paymentType;
                }

                public int hashCode() {
                    return Integer.hashCode(this.paymentType) + f87.a(gmf0.a(Integer.hashCode(this.amountType) * 31, 31, this.currency), this.maxAmount, 31);
                }

                public String toString() {
                    int i = this.amountType;
                    String str = this.currency;
                    long j = this.maxAmount;
                    int i2 = this.paymentType;
                    StringBuilder sbA = uqe0.a(i, "PaymentLimitTypeDetailsData(amountType=", ", currency=", str, dLRYz.tSfKeQXPMsl);
                    to10.a(sbA, j, ", paymentType=", i2);
                    sbA.append(")");
                    return sbA.toString();
                }
            }

            public PaymentLimitTypeInfoDetailsData(String str, String str2, List<PaymentLimitTypeDetailsData> list, String str3, String str4) {
                str.getClass();
                str2.getClass();
                list.getClass();
                str3.getClass();
                str4.getClass();
                this.channelId = str;
                this.combinedId = str2;
                this.paymentLimitTypeDetails = list;
                this.paymentLimitTypeName = str3;
                this.providerId = str4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PaymentLimitTypeInfoDetailsData copy$default(PaymentLimitTypeInfoDetailsData paymentLimitTypeInfoDetailsData, String str, String str2, List list, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = paymentLimitTypeInfoDetailsData.channelId;
                }
                if ((i & 2) != 0) {
                    str2 = paymentLimitTypeInfoDetailsData.combinedId;
                }
                if ((i & 4) != 0) {
                    list = paymentLimitTypeInfoDetailsData.paymentLimitTypeDetails;
                }
                if ((i & 8) != 0) {
                    str3 = paymentLimitTypeInfoDetailsData.paymentLimitTypeName;
                }
                if ((i & 16) != 0) {
                    str4 = paymentLimitTypeInfoDetailsData.providerId;
                }
                String str5 = str4;
                List list2 = list;
                return paymentLimitTypeInfoDetailsData.copy(str, str2, list2, str3, str5);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getChannelId() {
                return this.channelId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getCombinedId() {
                return this.combinedId;
            }

            public final List<PaymentLimitTypeDetailsData> component3() {
                return this.paymentLimitTypeDetails;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getPaymentLimitTypeName() {
                return this.paymentLimitTypeName;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getProviderId() {
                return this.providerId;
            }

            public final PaymentLimitTypeInfoDetailsData copy(String channelId, String combinedId, List<PaymentLimitTypeDetailsData> paymentLimitTypeDetails, String paymentLimitTypeName, String providerId) {
                channelId.getClass();
                combinedId.getClass();
                paymentLimitTypeDetails.getClass();
                paymentLimitTypeName.getClass();
                providerId.getClass();
                return new PaymentLimitTypeInfoDetailsData(channelId, combinedId, paymentLimitTypeDetails, paymentLimitTypeName, providerId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentLimitTypeInfoDetailsData)) {
                    return false;
                }
                PaymentLimitTypeInfoDetailsData paymentLimitTypeInfoDetailsData = (PaymentLimitTypeInfoDetailsData) other;
                return Intrinsics.g(this.channelId, paymentLimitTypeInfoDetailsData.channelId) && Intrinsics.g(this.combinedId, paymentLimitTypeInfoDetailsData.combinedId) && Intrinsics.g(this.paymentLimitTypeDetails, paymentLimitTypeInfoDetailsData.paymentLimitTypeDetails) && Intrinsics.g(this.paymentLimitTypeName, paymentLimitTypeInfoDetailsData.paymentLimitTypeName) && Intrinsics.g(this.providerId, paymentLimitTypeInfoDetailsData.providerId);
            }

            public final String getChannelId() {
                return this.channelId;
            }

            public final String getCombinedId() {
                return this.combinedId;
            }

            public final List<PaymentLimitTypeDetailsData> getPaymentLimitTypeDetails() {
                return this.paymentLimitTypeDetails;
            }

            public final String getPaymentLimitTypeName() {
                return this.paymentLimitTypeName;
            }

            public final String getProviderId() {
                return this.providerId;
            }

            public int hashCode() {
                return this.providerId.hashCode() + gmf0.a(ai50.a(gmf0.a(this.channelId.hashCode() * 31, 31, this.combinedId), 31, this.paymentLimitTypeDetails), 31, this.paymentLimitTypeName);
            }

            public final boolean isChannelLimit() {
                return this.channelId.length() > 0;
            }

            public String toString() {
                String str = this.channelId;
                String str2 = this.combinedId;
                List<PaymentLimitTypeDetailsData> list = this.paymentLimitTypeDetails;
                String str3 = this.paymentLimitTypeName;
                String str4 = this.providerId;
                StringBuilder sbA = ux5.a("PaymentLimitTypeInfoDetailsData(channelId=", str, ", combinedId=", str2, ", paymentLimitTypeDetails=");
                gfs.a(", paymentLimitTypeName=", str3, ", providerId=", sbA, list);
                return uf80.a(sbA, str4, ")");
            }
        }

        public PaymentLimitLevelData(int i, List<PaymentLimitTypeInfoDetailsData> list) {
            list.getClass();
            this.level = i;
            this.paymentLimitTypeInfoDetails = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentLimitLevelData copy$default(PaymentLimitLevelData paymentLimitLevelData, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = paymentLimitLevelData.level;
            }
            if ((i2 & 2) != 0) {
                list = paymentLimitLevelData.paymentLimitTypeInfoDetails;
            }
            return paymentLimitLevelData.copy(i, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getLevel() {
            return this.level;
        }

        public final List<PaymentLimitTypeInfoDetailsData> component2() {
            return this.paymentLimitTypeInfoDetails;
        }

        public final PaymentLimitLevelData copy(int level, List<PaymentLimitTypeInfoDetailsData> paymentLimitTypeInfoDetails) {
            paymentLimitTypeInfoDetails.getClass();
            return new PaymentLimitLevelData(level, paymentLimitTypeInfoDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentLimitLevelData)) {
                return false;
            }
            PaymentLimitLevelData paymentLimitLevelData = (PaymentLimitLevelData) other;
            return this.level == paymentLimitLevelData.level && Intrinsics.g(this.paymentLimitTypeInfoDetails, paymentLimitLevelData.paymentLimitTypeInfoDetails);
        }

        public final int getLevel() {
            return this.level;
        }

        public final List<PaymentLimitTypeInfoDetailsData> getPaymentLimitTypeInfoDetails() {
            return this.paymentLimitTypeInfoDetails;
        }

        public int hashCode() {
            return this.paymentLimitTypeInfoDetails.hashCode() + (Integer.hashCode(this.level) * 31);
        }

        public String toString() {
            return "PaymentLimitLevelData(level=" + this.level + ", paymentLimitTypeInfoDetails=" + this.paymentLimitTypeInfoDetails + ")";
        }
    }

    public KycLimitData(int i, int i2, List<PaymentLimitLevelData> list) {
        list.getClass();
        this.currentLevel = i;
        this.maxLevel = i2;
        this.paymentLimitTierLevels = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycLimitData copy$default(KycLimitData kycLimitData, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = kycLimitData.currentLevel;
        }
        if ((i3 & 2) != 0) {
            i2 = kycLimitData.maxLevel;
        }
        if ((i3 & 4) != 0) {
            list = kycLimitData.paymentLimitTierLevels;
        }
        return kycLimitData.copy(i, i2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentLevel() {
        return this.currentLevel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxLevel() {
        return this.maxLevel;
    }

    public final List<PaymentLimitLevelData> component3() {
        return this.paymentLimitTierLevels;
    }

    public final KycLimitData copy(int currentLevel, int maxLevel, List<PaymentLimitLevelData> paymentLimitTierLevels) {
        paymentLimitTierLevels.getClass();
        return new KycLimitData(currentLevel, maxLevel, paymentLimitTierLevels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycLimitData)) {
            return false;
        }
        KycLimitData kycLimitData = (KycLimitData) other;
        return this.currentLevel == kycLimitData.currentLevel && this.maxLevel == kycLimitData.maxLevel && Intrinsics.g(this.paymentLimitTierLevels, kycLimitData.paymentLimitTierLevels);
    }

    public final int getCurrentLevel() {
        return this.currentLevel;
    }

    public final int getMaxLevel() {
        return this.maxLevel;
    }

    public final List<PaymentLimitLevelData> getPaymentLimitTierLevels() {
        return this.paymentLimitTierLevels;
    }

    public int hashCode() {
        return this.paymentLimitTierLevels.hashCode() + gpp.a(this.maxLevel, Integer.hashCode(this.currentLevel) * 31, 31);
    }

    public String toString() {
        int i = this.currentLevel;
        int i2 = this.maxLevel;
        return ng1.a(dy5.a("KycLimitData(currentLevel=", i, i2, ", maxLevel=", ", paymentLimitTierLevels="), this.paymentLimitTierLevels, ")");
    }
}
