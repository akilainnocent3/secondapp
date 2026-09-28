package com.sportygames.evenodd.remote.models;

import defpackage.hxa;
import defpackage.mtg0;
import defpackage.nrg0;
import defpackage.pr0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006$"}, d2 = {"Lcom/sportygames/evenodd/remote/models/UserValidateResponse;", "", "currency", "", "insufficientBalanceMessage", "isAllowedToPlay", "", "userBalance", "", "avatarUrl", "userId", "nickName", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getInsufficientBalanceMessage", "()Z", "getUserBalance", "()D", "getAvatarUrl", "getUserId", "getNickName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserValidateResponse {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final String currency;
    private final String insufficientBalanceMessage;
    private final boolean isAllowedToPlay;
    private final String nickName;
    private final double userBalance;
    private final String userId;

    public UserValidateResponse(String str, String str2, boolean z, double d, String str3, String str4, String str5) {
        str.getClass();
        this.currency = str;
        this.insufficientBalanceMessage = str2;
        this.isAllowedToPlay = z;
        this.userBalance = d;
        this.avatarUrl = str3;
        this.userId = str4;
        this.nickName = str5;
    }

    public static /* synthetic */ UserValidateResponse copy$default(UserValidateResponse userValidateResponse, String str, String str2, boolean z, double d, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userValidateResponse.currency;
        }
        if ((i & 2) != 0) {
            str2 = userValidateResponse.insufficientBalanceMessage;
        }
        if ((i & 4) != 0) {
            z = userValidateResponse.isAllowedToPlay;
        }
        if ((i & 8) != 0) {
            d = userValidateResponse.userBalance;
        }
        if ((i & 16) != 0) {
            str3 = userValidateResponse.avatarUrl;
        }
        if ((i & 32) != 0) {
            str4 = userValidateResponse.userId;
        }
        if ((i & 64) != 0) {
            str5 = userValidateResponse.nickName;
        }
        String str6 = str5;
        String str7 = str3;
        double d2 = d;
        boolean z2 = z;
        return userValidateResponse.copy(str, str2, z2, d2, str7, str4, str6);
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
    public final boolean getIsAllowedToPlay() {
        return this.isAllowedToPlay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getUserBalance() {
        return this.userBalance;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    public final UserValidateResponse copy(String currency, String insufficientBalanceMessage, boolean isAllowedToPlay, double userBalance, String avatarUrl, String userId, String nickName) {
        currency.getClass();
        return new UserValidateResponse(currency, insufficientBalanceMessage, isAllowedToPlay, userBalance, avatarUrl, userId, nickName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserValidateResponse)) {
            return false;
        }
        UserValidateResponse userValidateResponse = (UserValidateResponse) other;
        return Intrinsics.g(this.currency, userValidateResponse.currency) && Intrinsics.g(this.insufficientBalanceMessage, userValidateResponse.insufficientBalanceMessage) && this.isAllowedToPlay == userValidateResponse.isAllowedToPlay && Double.compare(this.userBalance, userValidateResponse.userBalance) == 0 && Intrinsics.g(this.avatarUrl, userValidateResponse.avatarUrl) && Intrinsics.g(this.userId, userValidateResponse.userId) && Intrinsics.g(this.nickName, userValidateResponse.nickName);
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
        int iA = nrg0.a(mtg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isAllowedToPlay), 31, this.userBalance);
        String str2 = this.avatarUrl;
        int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nickName;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isAllowedToPlay() {
        return this.isAllowedToPlay;
    }

    public String toString() {
        String str = this.currency;
        String str2 = this.insufficientBalanceMessage;
        boolean z = this.isAllowedToPlay;
        double d = this.userBalance;
        String str3 = this.avatarUrl;
        String str4 = this.userId;
        String str5 = this.nickName;
        StringBuilder sbA = ux5.a("UserValidateResponse(currency=", str, ", insufficientBalanceMessage=", str2, ", isAllowedToPlay=");
        sbA.append(z);
        sbA.append(", userBalance=");
        sbA.append(d);
        hxa.c(sbA, ", avatarUrl=", str3, ", userId=", str4);
        return pr0.a(sbA, ", nickName=", str5, ")");
    }
}
