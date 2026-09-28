package com.sporty.android.core.model.pocket.deposit.card3d;

import defpackage.gmf0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bÊ\u0001\u0002\b\u001d¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSInitiateAuthRequest;", "", "userId", "", "country", "bankAssetId", "", "cardNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getCountry", "getBankAssetId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCardNumber", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSInitiateAuthRequest;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Card3DSInitiateAuthRequest {
    private final Integer bankAssetId;
    private final String cardNumber;
    private final String country;
    private final String userId;

    public Card3DSInitiateAuthRequest(String str, String str2, Integer num, String str3) {
        str.getClass();
        str2.getClass();
        this.userId = str;
        this.country = str2;
        this.bankAssetId = num;
        this.cardNumber = str3;
    }

    public static /* synthetic */ Card3DSInitiateAuthRequest copy$default(Card3DSInitiateAuthRequest card3DSInitiateAuthRequest, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = card3DSInitiateAuthRequest.userId;
        }
        if ((i & 2) != 0) {
            str2 = card3DSInitiateAuthRequest.country;
        }
        if ((i & 4) != 0) {
            num = card3DSInitiateAuthRequest.bankAssetId;
        }
        if ((i & 8) != 0) {
            str3 = card3DSInitiateAuthRequest.cardNumber;
        }
        return card3DSInitiateAuthRequest.copy(str, str2, num, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getBankAssetId() {
        return this.bankAssetId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final Card3DSInitiateAuthRequest copy(String userId, String country, Integer bankAssetId, String cardNumber) {
        userId.getClass();
        country.getClass();
        return new Card3DSInitiateAuthRequest(userId, country, bankAssetId, cardNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Card3DSInitiateAuthRequest)) {
            return false;
        }
        Card3DSInitiateAuthRequest card3DSInitiateAuthRequest = (Card3DSInitiateAuthRequest) other;
        return Intrinsics.g(this.userId, card3DSInitiateAuthRequest.userId) && Intrinsics.g(this.country, card3DSInitiateAuthRequest.country) && Intrinsics.g(this.bankAssetId, card3DSInitiateAuthRequest.bankAssetId) && Intrinsics.g(this.cardNumber, card3DSInitiateAuthRequest.cardNumber);
    }

    public final Integer getBankAssetId() {
        return this.bankAssetId;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = gmf0.a(this.userId.hashCode() * 31, 31, this.country);
        Integer num = this.bankAssetId;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.cardNumber;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.country;
        Integer num = this.bankAssetId;
        String str3 = this.cardNumber;
        StringBuilder sbA = ux5.a("Card3DSInitiateAuthRequest(userId=", str, ", country=", str2, ", bankAssetId=");
        sbA.append(num);
        sbA.append(", cardNumber=");
        sbA.append(str3);
        sbA.append(")");
        return sbA.toString();
    }
}
