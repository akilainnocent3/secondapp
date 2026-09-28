package com.sportygames.refscall.data.dto;

import defpackage.j26;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/sportygames/refscall/data/dto/RCUserAvailableDTO;", "", "currency", "", "insufficientBalanceMessage", "userBalance", "", "avatarUrl", "nickName", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getInsufficientBalanceMessage", "getUserBalance", "()D", "getAvatarUrl", "getNickName", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "game-refscall_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RCUserAvailableDTO {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final String currency;
    private final String insufficientBalanceMessage;
    private final String nickName;
    private final double userBalance;
    private final String userId;

    public RCUserAvailableDTO(String str, String str2, double d, String str3, String str4, String str5) {
        str.getClass();
        str5.getClass();
        this.currency = str;
        this.insufficientBalanceMessage = str2;
        this.userBalance = d;
        this.avatarUrl = str3;
        this.nickName = str4;
        this.userId = str5;
    }

    public static /* synthetic */ RCUserAvailableDTO copy$default(RCUserAvailableDTO rCUserAvailableDTO, String str, String str2, double d, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rCUserAvailableDTO.currency;
        }
        if ((i & 2) != 0) {
            str2 = rCUserAvailableDTO.insufficientBalanceMessage;
        }
        if ((i & 4) != 0) {
            d = rCUserAvailableDTO.userBalance;
        }
        if ((i & 8) != 0) {
            str3 = rCUserAvailableDTO.avatarUrl;
        }
        if ((i & 16) != 0) {
            str4 = rCUserAvailableDTO.nickName;
        }
        if ((i & 32) != 0) {
            str5 = rCUserAvailableDTO.userId;
        }
        String str6 = str5;
        String str7 = str3;
        double d2 = d;
        return rCUserAvailableDTO.copy(str, str2, d2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInsufficientBalanceMessage() {
        return this.insufficientBalanceMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getUserBalance() {
        return this.userBalance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final RCUserAvailableDTO copy(String currency, String insufficientBalanceMessage, double userBalance, String avatarUrl, String nickName, String userId) {
        currency.getClass();
        userId.getClass();
        return new RCUserAvailableDTO(currency, insufficientBalanceMessage, userBalance, avatarUrl, nickName, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RCUserAvailableDTO)) {
            return false;
        }
        RCUserAvailableDTO rCUserAvailableDTO = (RCUserAvailableDTO) other;
        return Intrinsics.g(this.currency, rCUserAvailableDTO.currency) && Intrinsics.g(this.insufficientBalanceMessage, rCUserAvailableDTO.insufficientBalanceMessage) && Double.compare(this.userBalance, rCUserAvailableDTO.userBalance) == 0 && Intrinsics.g(this.avatarUrl, rCUserAvailableDTO.avatarUrl) && Intrinsics.g(this.nickName, rCUserAvailableDTO.nickName) && Intrinsics.g(this.userId, rCUserAvailableDTO.userId);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getInsufficientBalanceMessage() {
        return this.insufficientBalanceMessage;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final double getUserBalance() {
        return this.userBalance;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.currency.hashCode() * 31;
        String str = this.insufficientBalanceMessage;
        int iA = nrg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.userBalance);
        String str2 = this.avatarUrl;
        int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickName;
        return this.userId.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RCUserAvailableDTO(currency=");
        sb.append(this.currency);
        sb.append(", insufficientBalanceMessage=");
        sb.append(this.insufficientBalanceMessage);
        sb.append(", userBalance=");
        sb.append(this.userBalance);
        sb.append(", avatarUrl=");
        sb.append(this.avatarUrl);
        sb.append(", nickName=");
        sb.append(this.nickName);
        sb.append(", userId=");
        return j26.a(sb, this.userId, ')');
    }
}
