package com.sporty.android.core.model.pocket.common;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gpp;
import defpackage.hfb0;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.ng1;
import defpackage.uqe0;
import defpackage.wxa;
import defpackage.x03;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB=\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J?\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fÊ\u0001\u0002\b\u001e¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/AssetData;", "", "cards", "", "Lcom/sporty/android/core/model/pocket/common/AssetData$CardsBean;", "accounts", "Lcom/sporty/android/core/model/pocket/common/AssetData$AccountsBean;", "mobileMoneys", "Lcom/sporty/android/core/model/pocket/common/AssetData$MobileBean;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCards", "()Ljava/util/List;", "getAccounts", "getMobileMoneys", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CardsBean", "AccountsBean", "MobileBean", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AssetData {
    private final List<AccountsBean> accounts;
    private final List<CardsBean> cards;
    private final List<MobileBean> mobileMoneys;

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u009c\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00102J\u0014\u00103\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00105\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00106\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R)\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(#¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u000e\u0010\u001fR)\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b($¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u0010\u0010\u001fÊ\u0001\u0002\b8¨\u00067"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/AssetData$CardsBean;", "", AnalyticsParam.EVENT_PARAM_ID, "", "cardNumber", "", "cardType", "cardCvv", "bankCode", "bankIconUrl", "cardExpDate", "bankName", "cardBrandIconUrl", "cardBrand", "isDefault", "", "isExpired", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getId", "()I", "getCardNumber", "()Ljava/lang/String;", "getCardType", "getCardCvv", "getBankCode", "getBankIconUrl", "getCardExpDate", "getBankName", "getCardBrandIconUrl", "getCardBrand", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Lcom/google/gson/annotations/SerializedName;", "value", "default", "expired", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sporty/android/core/model/pocket/common/AssetData$CardsBean;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class CardsBean {
        private final String bankCode;
        private final String bankIconUrl;
        private final String bankName;
        private final String cardBrand;
        private final String cardBrandIconUrl;
        private final String cardCvv;
        private final String cardExpDate;
        private final String cardNumber;
        private final String cardType;
        private final int id;

        @SerializedName("default")
        private final Boolean isDefault;

        @SerializedName("expired")
        private final Boolean isExpired;

        public /* synthetic */ CardsBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : str8, (i2 & 512) != 0 ? null : str9, (i2 & 1024) != 0 ? null : bool, (i2 & 2048) != 0 ? null : bool2);
        }

        public static /* synthetic */ CardsBean copy$default(CardsBean cardsBean, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = cardsBean.id;
            }
            if ((i2 & 2) != 0) {
                str = cardsBean.cardNumber;
            }
            if ((i2 & 4) != 0) {
                str2 = cardsBean.cardType;
            }
            if ((i2 & 8) != 0) {
                str3 = cardsBean.cardCvv;
            }
            if ((i2 & 16) != 0) {
                str4 = cardsBean.bankCode;
            }
            if ((i2 & 32) != 0) {
                str5 = cardsBean.bankIconUrl;
            }
            if ((i2 & 64) != 0) {
                str6 = cardsBean.cardExpDate;
            }
            if ((i2 & 128) != 0) {
                str7 = cardsBean.bankName;
            }
            if ((i2 & 256) != 0) {
                str8 = cardsBean.cardBrandIconUrl;
            }
            if ((i2 & 512) != 0) {
                str9 = cardsBean.cardBrand;
            }
            if ((i2 & 1024) != 0) {
                bool = cardsBean.isDefault;
            }
            if ((i2 & 2048) != 0) {
                bool2 = cardsBean.isExpired;
            }
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            String str10 = str8;
            String str11 = str9;
            String str12 = str6;
            String str13 = str7;
            String str14 = str4;
            String str15 = str5;
            return cardsBean.copy(i, str, str2, str3, str14, str15, str12, str13, str10, str11, bool3, bool4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getCardBrand() {
            return this.cardBrand;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Boolean getIsDefault() {
            return this.isDefault;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Boolean getIsExpired() {
            return this.isExpired;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCardNumber() {
            return this.cardNumber;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCardType() {
            return this.cardType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCardCvv() {
            return this.cardCvv;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getBankCode() {
            return this.bankCode;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getBankIconUrl() {
            return this.bankIconUrl;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getCardExpDate() {
            return this.cardExpDate;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getCardBrandIconUrl() {
            return this.cardBrandIconUrl;
        }

        public final CardsBean copy(int id, String cardNumber, String cardType, String cardCvv, String bankCode, String bankIconUrl, String cardExpDate, String bankName, String cardBrandIconUrl, String cardBrand, Boolean isDefault, Boolean isExpired) {
            return new CardsBean(id, cardNumber, cardType, cardCvv, bankCode, bankIconUrl, cardExpDate, bankName, cardBrandIconUrl, cardBrand, isDefault, isExpired);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardsBean)) {
                return false;
            }
            CardsBean cardsBean = (CardsBean) other;
            return this.id == cardsBean.id && Intrinsics.g(this.cardNumber, cardsBean.cardNumber) && Intrinsics.g(this.cardType, cardsBean.cardType) && Intrinsics.g(this.cardCvv, cardsBean.cardCvv) && Intrinsics.g(this.bankCode, cardsBean.bankCode) && Intrinsics.g(this.bankIconUrl, cardsBean.bankIconUrl) && Intrinsics.g(this.cardExpDate, cardsBean.cardExpDate) && Intrinsics.g(this.bankName, cardsBean.bankName) && Intrinsics.g(this.cardBrandIconUrl, cardsBean.cardBrandIconUrl) && Intrinsics.g(this.cardBrand, cardsBean.cardBrand) && Intrinsics.g(this.isDefault, cardsBean.isDefault) && Intrinsics.g(this.isExpired, cardsBean.isExpired);
        }

        public final String getBankCode() {
            return this.bankCode;
        }

        public final String getBankIconUrl() {
            return this.bankIconUrl;
        }

        public final String getBankName() {
            return this.bankName;
        }

        public final String getCardBrand() {
            return this.cardBrand;
        }

        public final String getCardBrandIconUrl() {
            return this.cardBrandIconUrl;
        }

        public final String getCardCvv() {
            return this.cardCvv;
        }

        public final String getCardExpDate() {
            return this.cardExpDate;
        }

        public final String getCardNumber() {
            return this.cardNumber;
        }

        public final String getCardType() {
            return this.cardType;
        }

        public final int getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.id) * 31;
            String str = this.cardNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.cardType;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cardCvv;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.bankCode;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.bankIconUrl;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.cardExpDate;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.bankName;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.cardBrandIconUrl;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.cardBrand;
            int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Boolean bool = this.isDefault;
            int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isExpired;
            return iHashCode11 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final Boolean isDefault() {
            return this.isDefault;
        }

        public final Boolean isExpired() {
            return this.isExpired;
        }

        public String toString() {
            int i = this.id;
            String str = this.cardNumber;
            String str2 = this.cardType;
            String str3 = this.cardCvv;
            String str4 = this.bankCode;
            String str5 = this.bankIconUrl;
            String str6 = this.cardExpDate;
            String str7 = this.bankName;
            String str8 = this.cardBrandIconUrl;
            String str9 = this.cardBrand;
            Boolean bool = this.isDefault;
            Boolean bool2 = this.isExpired;
            StringBuilder sbA = uqe0.a(i, "CardsBean(id=", ", cardNumber=", str, ", cardType=");
            hxa.c(sbA, str2, ", cardCvv=", str3, oAudzpbdOhCI.HUIiLJnLL);
            hxa.c(sbA, str4, ", bankIconUrl=", str5, ", cardExpDate=");
            hxa.c(sbA, str6, ", bankName=", str7, ", cardBrandIconUrl=");
            hxa.c(sbA, str8, ", cardBrand=", str9, ", isDefault=");
            sbA.append(bool);
            sbA.append(", isExpired=");
            sbA.append(bool2);
            sbA.append(")");
            return sbA.toString();
        }

        public CardsBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2) {
            this.id = i;
            this.cardNumber = str;
            this.cardType = str2;
            this.cardCvv = str3;
            this.bankCode = str4;
            this.bankIconUrl = str5;
            this.cardExpDate = str6;
            this.bankName = str7;
            this.cardBrandIconUrl = str8;
            this.cardBrand = str9;
            this.isDefault = bool;
            this.isExpired = bool2;
        }
    }

    public /* synthetic */ AssetData(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetData copy$default(AssetData assetData, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = assetData.cards;
        }
        if ((i & 2) != 0) {
            list2 = assetData.accounts;
        }
        if ((i & 4) != 0) {
            list3 = assetData.mobileMoneys;
        }
        return assetData.copy(list, list2, list3);
    }

    public final List<CardsBean> component1() {
        return this.cards;
    }

    public final List<AccountsBean> component2() {
        return this.accounts;
    }

    public final List<MobileBean> component3() {
        return this.mobileMoneys;
    }

    public final AssetData copy(List<CardsBean> cards, List<AccountsBean> accounts, List<MobileBean> mobileMoneys) {
        return new AssetData(cards, accounts, mobileMoneys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetData)) {
            return false;
        }
        AssetData assetData = (AssetData) other;
        return Intrinsics.g(this.cards, assetData.cards) && Intrinsics.g(this.accounts, assetData.accounts) && Intrinsics.g(this.mobileMoneys, assetData.mobileMoneys);
    }

    public final List<AccountsBean> getAccounts() {
        return this.accounts;
    }

    public final List<CardsBean> getCards() {
        return this.cards;
    }

    public final List<MobileBean> getMobileMoneys() {
        return this.mobileMoneys;
    }

    public int hashCode() {
        List<CardsBean> list = this.cards;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AccountsBean> list2 = this.accounts;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MobileBean> list3 = this.mobileMoneys;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        List<CardsBean> list = this.cards;
        List<AccountsBean> list2 = this.accounts;
        return ng1.a(hfb0.a("AssetData(cards=", ", accounts=", ", mobileMoneys=", list, list2), this.mobileMoneys, ")");
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011Ê\u0001\u0002\b!¨\u0006 "}, d2 = {"Lcom/sporty/android/core/model/pocket/common/AssetData$MobileBean;", "", AnalyticsParam.EVENT_PARAM_ID, "", "phoneNo", "", "name", AppsFlyerProperties.CHANNEL, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getPhoneNo", "()Ljava/lang/String;", "setPhoneNo", "(Ljava/lang/String;)V", "getName", "setName", "getChannel", "setChannel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class MobileBean {
        private String channel;
        private int id;
        private String name;
        private String phoneNo;

        public /* synthetic */ MobileBean(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
        }

        public static /* synthetic */ MobileBean copy$default(MobileBean mobileBean, int i, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = mobileBean.id;
            }
            if ((i2 & 2) != 0) {
                str = mobileBean.phoneNo;
            }
            if ((i2 & 4) != 0) {
                str2 = mobileBean.name;
            }
            if ((i2 & 8) != 0) {
                str3 = mobileBean.channel;
            }
            return mobileBean.copy(i, str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPhoneNo() {
            return this.phoneNo;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getChannel() {
            return this.channel;
        }

        public final MobileBean copy(int id, String phoneNo, String name, String channel) {
            return new MobileBean(id, phoneNo, name, channel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MobileBean)) {
                return false;
            }
            MobileBean mobileBean = (MobileBean) other;
            return this.id == mobileBean.id && Intrinsics.g(this.phoneNo, mobileBean.phoneNo) && Intrinsics.g(this.name, mobileBean.name) && Intrinsics.g(this.channel, mobileBean.channel);
        }

        public final String getChannel() {
            return this.channel;
        }

        public final int getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhoneNo() {
            return this.phoneNo;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.id) * 31;
            String str = this.phoneNo;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.channel;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setChannel(String str) {
            this.channel = str;
        }

        public final void setId(int i) {
            this.id = i;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setPhoneNo(String str) {
            this.phoneNo = str;
        }

        public String toString() {
            int i = this.id;
            String str = this.phoneNo;
            return kwi.a(uqe0.a(i, "MobileBean(id=", ", phoneNo=", str, ", name="), this.name, ", channel=", this.channel, ")");
        }

        public MobileBean(int i, String str, String str2, String str3) {
            this.id = i;
            this.phoneNo = str;
            this.name = str2;
            this.channel = str3;
        }
    }

    public AssetData(List<CardsBean> list, List<AccountsBean> list2, List<MobileBean> list3) {
        this.cards = list;
        this.accounts = list2;
        this.mobileMoneys = list3;
    }

    public AssetData() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010%J\u009a\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00104J\u0014\u00105\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00107\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00108\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R)\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\"¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\r\u0010\u001eR)\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(#¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u000f\u0010\u001eR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%Ê\u0001\u0002\b:¨\u00069"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/AssetData$AccountsBean;", "", AnalyticsParam.EVENT_PARAM_ID, "", "accountName", "", "accountNumber", "accountType", "bankCode", "bankId", "bankIconUrl", "bankName", "phoneNo", "isDefault", "", "isDisabled", AnalyticsParam.EVENT_STATUS, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getId", "()I", "getAccountName", "()Ljava/lang/String;", "getAccountNumber", "getAccountType", "getBankCode", "getBankId", "getBankIconUrl", "getBankName", "getPhoneNo", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Lcom/google/gson/annotations/SerializedName;", "value", "default", "disable", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/sporty/android/core/model/pocket/common/AssetData$AccountsBean;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class AccountsBean {
        private final String accountName;
        private final String accountNumber;
        private final String accountType;
        private final String bankCode;
        private final String bankIconUrl;
        private final int bankId;
        private final String bankName;
        private final int id;

        @SerializedName("default")
        private final Boolean isDefault;

        @SerializedName("disable")
        private final Boolean isDisabled;
        private final String phoneNo;
        private final Integer status;

        public /* synthetic */ AccountsBean(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, Boolean bool, Boolean bool2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? -1 : i2, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? null : bool, (i3 & 1024) != 0 ? null : bool2, (i3 & 2048) != 0 ? null : num);
        }

        public static /* synthetic */ AccountsBean copy$default(AccountsBean accountsBean, int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, Boolean bool, Boolean bool2, Integer num, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = accountsBean.id;
            }
            if ((i3 & 2) != 0) {
                str = accountsBean.accountName;
            }
            if ((i3 & 4) != 0) {
                str2 = accountsBean.accountNumber;
            }
            if ((i3 & 8) != 0) {
                str3 = accountsBean.accountType;
            }
            if ((i3 & 16) != 0) {
                str4 = accountsBean.bankCode;
            }
            if ((i3 & 32) != 0) {
                i2 = accountsBean.bankId;
            }
            if ((i3 & 64) != 0) {
                str5 = accountsBean.bankIconUrl;
            }
            if ((i3 & 128) != 0) {
                str6 = accountsBean.bankName;
            }
            if ((i3 & 256) != 0) {
                str7 = accountsBean.phoneNo;
            }
            if ((i3 & 512) != 0) {
                bool = accountsBean.isDefault;
            }
            if ((i3 & 1024) != 0) {
                bool2 = accountsBean.isDisabled;
            }
            if ((i3 & 2048) != 0) {
                num = accountsBean.status;
            }
            Boolean bool3 = bool2;
            Integer num2 = num;
            String str8 = str7;
            Boolean bool4 = bool;
            String str9 = str5;
            String str10 = str6;
            String str11 = str4;
            int i4 = i2;
            return accountsBean.copy(i, str, str2, str3, str11, i4, str9, str10, str8, bool4, bool3, num2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Boolean getIsDefault() {
            return this.isDefault;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Boolean getIsDisabled() {
            return this.isDisabled;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Integer getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAccountName() {
            return this.accountName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAccountType() {
            return this.accountType;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getBankCode() {
            return this.bankCode;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getBankId() {
            return this.bankId;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getBankIconUrl() {
            return this.bankIconUrl;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getPhoneNo() {
            return this.phoneNo;
        }

        public final AccountsBean copy(int id, String accountName, String accountNumber, String accountType, String bankCode, int bankId, String bankIconUrl, String bankName, String phoneNo, Boolean isDefault, Boolean isDisabled, Integer status) {
            return new AccountsBean(id, accountName, accountNumber, accountType, bankCode, bankId, bankIconUrl, bankName, phoneNo, isDefault, isDisabled, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountsBean)) {
                return false;
            }
            AccountsBean accountsBean = (AccountsBean) other;
            return this.id == accountsBean.id && Intrinsics.g(this.accountName, accountsBean.accountName) && Intrinsics.g(this.accountNumber, accountsBean.accountNumber) && Intrinsics.g(this.accountType, accountsBean.accountType) && Intrinsics.g(this.bankCode, accountsBean.bankCode) && this.bankId == accountsBean.bankId && Intrinsics.g(this.bankIconUrl, accountsBean.bankIconUrl) && Intrinsics.g(this.bankName, accountsBean.bankName) && Intrinsics.g(this.phoneNo, accountsBean.phoneNo) && Intrinsics.g(this.isDefault, accountsBean.isDefault) && Intrinsics.g(this.isDisabled, accountsBean.isDisabled) && Intrinsics.g(this.status, accountsBean.status);
        }

        public final String getAccountName() {
            return this.accountName;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getAccountType() {
            return this.accountType;
        }

        public final String getBankCode() {
            return this.bankCode;
        }

        public final String getBankIconUrl() {
            return this.bankIconUrl;
        }

        public final int getBankId() {
            return this.bankId;
        }

        public final String getBankName() {
            return this.bankName;
        }

        public final int getId() {
            return this.id;
        }

        public final String getPhoneNo() {
            return this.phoneNo;
        }

        public final Integer getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.id) * 31;
            String str = this.accountName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.accountNumber;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.accountType;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.bankCode;
            int iA = gpp.a(this.bankId, (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
            String str5 = this.bankIconUrl;
            int iHashCode5 = (iA + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.bankName;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.phoneNo;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool = this.isDefault;
            int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isDisabled;
            int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Integer num = this.status;
            return iHashCode9 + (num != null ? num.hashCode() : 0);
        }

        public final Boolean isDefault() {
            return this.isDefault;
        }

        public final Boolean isDisabled() {
            return this.isDisabled;
        }

        public String toString() {
            int i = this.id;
            String str = this.accountName;
            String str2 = this.accountNumber;
            String str3 = this.accountType;
            String str4 = this.bankCode;
            int i2 = this.bankId;
            String str5 = this.bankIconUrl;
            String str6 = this.bankName;
            String str7 = this.phoneNo;
            Boolean bool = this.isDefault;
            Boolean bool2 = this.isDisabled;
            Integer num = this.status;
            StringBuilder sbA = uqe0.a(i, "AccountsBean(id=", ", accountName=", str, ", accountNumber=");
            hxa.c(sbA, str2, ", accountType=", str3, ", bankCode=");
            wxa.b(i2, str4, ", bankId=", ", bankIconUrl=", sbA);
            hxa.c(sbA, str5, ", bankName=", str6, ", phoneNo=");
            x03.a(sbA, str7, ", isDefault=", bool, ", isDisabled=");
            sbA.append(bool2);
            sbA.append(", status=");
            sbA.append(num);
            sbA.append(")");
            return sbA.toString();
        }

        public AccountsBean(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, Boolean bool, Boolean bool2, Integer num) {
            this.id = i;
            this.accountName = str;
            this.accountNumber = str2;
            this.accountType = str3;
            this.bankCode = str4;
            this.bankId = i2;
            this.bankIconUrl = str5;
            this.bankName = str6;
            this.phoneNo = str7;
            this.isDefault = bool;
            this.isDisabled = bool2;
            this.status = num;
        }
    }
}
