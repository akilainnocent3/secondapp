package com.sportygames.commons.models;

import com.appsflyer.internal.v;
import com.sportygames.redblack.remote.models.UserCard;
import defpackage.hxa;
import defpackage.ux5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB\u0013\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018Jb\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\nHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/sportygames/commons/models/CardDetail;", "", "color", "", "rank", "rankLetter", "rankName", "suit", "suitName", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "userCard", "Lcom/sportygames/redblack/remote/models/UserCard;", "(Lcom/sportygames/redblack/remote/models/UserCard;)V", "getColor", "()Ljava/lang/String;", "getRank", "getRankLetter", "getRankName", "getSuit", "getSuitName", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sportygames/commons/models/CardDetail;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDetail {
    public static final int $stable = 0;
    private final String color;
    private final String rank;
    private final String rankLetter;
    private final String rankName;
    private final String suit;
    private final String suitName;
    private final Integer value;

    public CardDetail(UserCard userCard) {
        this(userCard != null ? userCard.getColor() : null, userCard != null ? userCard.getRank() : null, userCard != null ? userCard.getRankLetter() : null, userCard != null ? userCard.getRankName() : null, userCard != null ? userCard.getSuit() : null, userCard != null ? userCard.getSuitName() : null, userCard != null ? userCard.getValue() : null);
    }

    public static /* synthetic */ CardDetail copy$default(CardDetail cardDetail, String str, String str2, String str3, String str4, String str5, String str6, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardDetail.color;
        }
        if ((i & 2) != 0) {
            str2 = cardDetail.rank;
        }
        if ((i & 4) != 0) {
            str3 = cardDetail.rankLetter;
        }
        if ((i & 8) != 0) {
            str4 = cardDetail.rankName;
        }
        if ((i & 16) != 0) {
            str5 = cardDetail.suit;
        }
        if ((i & 32) != 0) {
            str6 = cardDetail.suitName;
        }
        if ((i & 64) != 0) {
            num = cardDetail.value;
        }
        String str7 = str6;
        Integer num2 = num;
        String str8 = str5;
        String str9 = str3;
        return cardDetail.copy(str, str2, str9, str4, str8, str7, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRankLetter() {
        return this.rankLetter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRankName() {
        return this.rankName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuit() {
        return this.suit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSuitName() {
        return this.suitName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    public final CardDetail copy(String color, String rank, String rankLetter, String rankName, String suit, String suitName, Integer value) {
        return new CardDetail(color, rank, rankLetter, rankName, suit, suitName, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDetail)) {
            return false;
        }
        CardDetail cardDetail = (CardDetail) other;
        return Intrinsics.g(this.color, cardDetail.color) && Intrinsics.g(this.rank, cardDetail.rank) && Intrinsics.g(this.rankLetter, cardDetail.rankLetter) && Intrinsics.g(this.rankName, cardDetail.rankName) && Intrinsics.g(this.suit, cardDetail.suit) && Intrinsics.g(this.suitName, cardDetail.suitName) && Intrinsics.g(this.value, cardDetail.value);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getRank() {
        return this.rank;
    }

    public final String getRankLetter() {
        return this.rankLetter;
    }

    public final String getRankName() {
        return this.rankName;
    }

    public final String getSuit() {
        return this.suit;
    }

    public final String getSuitName() {
        return this.suitName;
    }

    public final Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.color;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rank;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rankLetter;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rankName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.suit;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.suitName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.value;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.color;
        String str2 = this.rank;
        String str3 = this.rankLetter;
        String str4 = this.rankName;
        String str5 = this.suit;
        String str6 = this.suitName;
        Integer num = this.value;
        StringBuilder sbA = ux5.a("CardDetail(color=", str, ", rank=", str2, ", rankLetter=");
        hxa.c(sbA, str3, ", rankName=", str4, ", suit=");
        hxa.c(sbA, str5, ", suitName=", str6, ", value=");
        return v.a(sbA, num, ")");
    }

    public CardDetail(String str, String str2, String str3, String str4, String str5, String str6, Integer num) {
        this.color = str;
        this.rank = str2;
        this.rankLetter = str3;
        this.rankName = str4;
        this.suit = str5;
        this.suitName = str6;
        this.value = num;
    }
}
