package com.sporty.android.core.model.pocket.deposit.card3d;

import com.appsflyer.internal.m;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import defpackage.em5;
import defpackage.f78;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ml5;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000223Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jx\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0014\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00100\u001a\u00020\u000bHÖ\u0081\u0004J\n\u00101\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013Ê\u0001\u0002\b5¨\u00064"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSAuthPayerRequest;", "", "userId", "", "country", "amount", "", "orderId", "txId", "cardExpDate", "bankAssetId", "", "cardNumber", LastLoginDeviceInfo.KEY_DEVICE, "Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSAuthPayerRequest$Device;", "redirectResponseUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSAuthPayerRequest$Device;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getCountry", "getAmount", "()J", "getOrderId", "getTxId", "getCardExpDate", "getBankAssetId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCardNumber", "getDevice", "()Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSAuthPayerRequest$Device;", "getRedirectResponseUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSAuthPayerRequest$Device;Ljava/lang/String;)Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSAuthPayerRequest;", "equals", "", "other", "hashCode", "toString", "Companion", "Device", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Card3DSAuthPayerRequest {
    private static final String defaultRedirectResponseUrl = "https://www.yourSameOriginHere.com";
    private final long amount;
    private final Integer bankAssetId;
    private final String cardExpDate;
    private final String cardNumber;
    private final String country;
    private final Device device;
    private final String orderId;
    private final String redirectResponseUrl;
    private final String txId;
    private final String userId;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR%\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fÊ\u0001\u0002\b\"¨\u0006!"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSAuthPayerRequest$Device;", "", "browser", "", "screenWidth", "", "screenHeight", "timezone", "threeDSecureChallengeWindowSize", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getBrowser", "()Ljava/lang/String;", "getScreenWidth", "()I", "getScreenHeight", "getTimezone", "getThreeDSecureChallengeWindowSize", "Lcom/google/gson/annotations/SerializedName;", "value", "__3DSecureChallengeWindowSize", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Device {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: default, reason: not valid java name */
        private static final Device f1default = new Device("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36", 1000, 1000, "+00", "500_X_600");
        private final String browser;
        private final int screenHeight;
        private final int screenWidth;

        @SerializedName("__3DSecureChallengeWindowSize")
        private final String threeDSecureChallengeWindowSize;
        private final String timezone;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSAuthPayerRequest$Device$Companion;", "", "<init>", "()V", "default", "Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSAuthPayerRequest$Device;", "getDefault", "()Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSAuthPayerRequest$Device;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Device getDefault() {
                return Device.f1default;
            }

            private Companion() {
            }
        }

        public Device(String str, int i, int i2, String str2, String str3) {
            m.a(str, str2, str3);
            this.browser = str;
            this.screenWidth = i;
            this.screenHeight = i2;
            this.timezone = str2;
            this.threeDSecureChallengeWindowSize = str3;
        }

        public static /* synthetic */ Device copy$default(Device device, String str, int i, int i2, String str2, String str3, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = device.browser;
            }
            if ((i3 & 2) != 0) {
                i = device.screenWidth;
            }
            if ((i3 & 4) != 0) {
                i2 = device.screenHeight;
            }
            if ((i3 & 8) != 0) {
                str2 = device.timezone;
            }
            if ((i3 & 16) != 0) {
                str3 = device.threeDSecureChallengeWindowSize;
            }
            String str4 = str3;
            int i4 = i2;
            return device.copy(str, i, i4, str2, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBrowser() {
            return this.browser;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getScreenWidth() {
            return this.screenWidth;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getScreenHeight() {
            return this.screenHeight;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTimezone() {
            return this.timezone;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getThreeDSecureChallengeWindowSize() {
            return this.threeDSecureChallengeWindowSize;
        }

        public final Device copy(String browser, int screenWidth, int screenHeight, String timezone, String threeDSecureChallengeWindowSize) {
            browser.getClass();
            timezone.getClass();
            threeDSecureChallengeWindowSize.getClass();
            return new Device(browser, screenWidth, screenHeight, timezone, threeDSecureChallengeWindowSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Device)) {
                return false;
            }
            Device device = (Device) other;
            return Intrinsics.g(this.browser, device.browser) && this.screenWidth == device.screenWidth && this.screenHeight == device.screenHeight && Intrinsics.g(this.timezone, device.timezone) && Intrinsics.g(this.threeDSecureChallengeWindowSize, device.threeDSecureChallengeWindowSize);
        }

        public final String getBrowser() {
            return this.browser;
        }

        public final int getScreenHeight() {
            return this.screenHeight;
        }

        public final int getScreenWidth() {
            return this.screenWidth;
        }

        public final String getThreeDSecureChallengeWindowSize() {
            return this.threeDSecureChallengeWindowSize;
        }

        public final String getTimezone() {
            return this.timezone;
        }

        public int hashCode() {
            return this.threeDSecureChallengeWindowSize.hashCode() + gmf0.a(gpp.a(this.screenHeight, gpp.a(this.screenWidth, this.browser.hashCode() * 31, 31), 31), 31, this.timezone);
        }

        public String toString() {
            String str = this.browser;
            int i = this.screenWidth;
            int i2 = this.screenHeight;
            String str2 = this.timezone;
            String str3 = this.threeDSecureChallengeWindowSize;
            StringBuilder sbA = ml5.a(i, "Device(browser=", str, ", screenWidth=", ", screenHeight=");
            f78.b(i2, ", timezone=", str2, ", threeDSecureChallengeWindowSize=", sbA);
            return uf80.a(sbA, str3, ")");
        }
    }

    public /* synthetic */ Card3DSAuthPayerRequest(String str, String str2, long j, String str3, String str4, String str5, Integer num, String str6, Device device, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, str5, num, str6, (i & 256) != 0 ? Device.INSTANCE.getDefault() : device, (i & 512) != 0 ? defaultRedirectResponseUrl : str7);
    }

    public static /* synthetic */ Card3DSAuthPayerRequest copy$default(Card3DSAuthPayerRequest card3DSAuthPayerRequest, String str, String str2, long j, String str3, String str4, String str5, Integer num, String str6, Device device, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = card3DSAuthPayerRequest.userId;
        }
        if ((i & 2) != 0) {
            str2 = card3DSAuthPayerRequest.country;
        }
        if ((i & 4) != 0) {
            j = card3DSAuthPayerRequest.amount;
        }
        if ((i & 8) != 0) {
            str3 = card3DSAuthPayerRequest.orderId;
        }
        if ((i & 16) != 0) {
            str4 = card3DSAuthPayerRequest.txId;
        }
        if ((i & 32) != 0) {
            str5 = card3DSAuthPayerRequest.cardExpDate;
        }
        if ((i & 64) != 0) {
            num = card3DSAuthPayerRequest.bankAssetId;
        }
        if ((i & 128) != 0) {
            str6 = card3DSAuthPayerRequest.cardNumber;
        }
        if ((i & 256) != 0) {
            device = card3DSAuthPayerRequest.device;
        }
        if ((i & 512) != 0) {
            str7 = card3DSAuthPayerRequest.redirectResponseUrl;
        }
        Device device2 = device;
        String str8 = str7;
        String str9 = str6;
        String str10 = str5;
        String str11 = str3;
        long j2 = j;
        return card3DSAuthPayerRequest.copy(str, str2, j2, str11, str4, str10, num, str9, device2, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRedirectResponseUrl() {
        return this.redirectResponseUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCardExpDate() {
        return this.cardExpDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getBankAssetId() {
        return this.bankAssetId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Device getDevice() {
        return this.device;
    }

    public final Card3DSAuthPayerRequest copy(String userId, String country, long amount, String orderId, String txId, String cardExpDate, Integer bankAssetId, String cardNumber, Device device, String redirectResponseUrl) {
        userId.getClass();
        country.getClass();
        orderId.getClass();
        txId.getClass();
        device.getClass();
        redirectResponseUrl.getClass();
        return new Card3DSAuthPayerRequest(userId, country, amount, orderId, txId, cardExpDate, bankAssetId, cardNumber, device, redirectResponseUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Card3DSAuthPayerRequest)) {
            return false;
        }
        Card3DSAuthPayerRequest card3DSAuthPayerRequest = (Card3DSAuthPayerRequest) other;
        return Intrinsics.g(this.userId, card3DSAuthPayerRequest.userId) && Intrinsics.g(this.country, card3DSAuthPayerRequest.country) && this.amount == card3DSAuthPayerRequest.amount && Intrinsics.g(this.orderId, card3DSAuthPayerRequest.orderId) && Intrinsics.g(this.txId, card3DSAuthPayerRequest.txId) && Intrinsics.g(this.cardExpDate, card3DSAuthPayerRequest.cardExpDate) && Intrinsics.g(this.bankAssetId, card3DSAuthPayerRequest.bankAssetId) && Intrinsics.g(this.cardNumber, card3DSAuthPayerRequest.cardNumber) && Intrinsics.g(this.device, card3DSAuthPayerRequest.device) && Intrinsics.g(this.redirectResponseUrl, card3DSAuthPayerRequest.redirectResponseUrl);
    }

    public final long getAmount() {
        return this.amount;
    }

    public final Integer getBankAssetId() {
        return this.bankAssetId;
    }

    public final String getCardExpDate() {
        return this.cardExpDate;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCountry() {
        return this.country;
    }

    public final Device getDevice() {
        return this.device;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getRedirectResponseUrl() {
        return this.redirectResponseUrl;
    }

    public final String getTxId() {
        return this.txId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(f87.a(gmf0.a(this.userId.hashCode() * 31, 31, this.country), this.amount, 31), 31, this.orderId), 31, this.txId);
        String str = this.cardExpDate;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.bankAssetId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.cardNumber;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        return this.redirectResponseUrl.hashCode() + ((this.device.hashCode() + ((iHashCode2 + iHashCode3) * 31)) * 31);
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.country;
        long j = this.amount;
        String str3 = this.orderId;
        String str4 = this.txId;
        String str5 = this.cardExpDate;
        Integer num = this.bankAssetId;
        String str6 = this.cardNumber;
        Device device = this.device;
        String str7 = this.redirectResponseUrl;
        StringBuilder sbA = ux5.a("Card3DSAuthPayerRequest(userId=", str, ", country=", str2, ", amount=");
        em5.a(j, ", orderId=", str3, sbA);
        hxa.c(sbA, ", txId=", str4, ", cardExpDate=", str5);
        sbA.append(", bankAssetId=");
        sbA.append(num);
        sbA.append(", cardNumber=");
        sbA.append(str6);
        sbA.append(", device=");
        sbA.append(device);
        sbA.append(", redirectResponseUrl=");
        sbA.append(str7);
        sbA.append(")");
        return sbA.toString();
    }

    public Card3DSAuthPayerRequest(String str, String str2, long j, String str3, String str4, String str5, Integer num, String str6, Device device, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        device.getClass();
        str7.getClass();
        this.userId = str;
        this.country = str2;
        this.amount = j;
        this.orderId = str3;
        this.txId = str4;
        this.cardExpDate = str5;
        this.bankAssetId = num;
        this.cardNumber = str6;
        this.device = device;
        this.redirectResponseUrl = str7;
    }
}
