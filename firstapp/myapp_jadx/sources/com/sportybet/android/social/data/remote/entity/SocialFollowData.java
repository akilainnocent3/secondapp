package com.sportybet.android.social.data.remote.entity;

import defpackage.d5d;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.mng;
import defpackage.mtg0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003Jg\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0014\u0010'\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020\tHÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cÊ\u0001\u0002\b,Ê\u0001\f\b-\u0012\b\b.\u0012\u0004\b\u0003\u0010\u0002¨\u0006+"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/SocialFollowData;", "", "nickname", "", "avatar", "isFollowed", "", "userType", "followersCount", "", "totalCodes", "totalWins", "userId", "winRatio", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIILjava/lang/String;D)V", "getNickname", "()Ljava/lang/String;", "getAvatar", "()Z", "getUserType", "getFollowersCount", "()I", "getTotalCodes", "getTotalWins", "getUserId", "getWinRatio", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocialFollowData {
    public static final int $stable = 0;
    private final String avatar;
    private final int followersCount;
    private final boolean isFollowed;
    private final String nickname;
    private final int totalCodes;
    private final int totalWins;
    private final String userId;
    private final String userType;
    private final double winRatio;

    public /* synthetic */ SocialFollowData(String str, String str2, boolean z, String str3, int i, int i2, int i3, String str4, double d, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : str2, z, str3, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0 : i3, str4, (i4 & 256) != 0 ? 0.0d : d);
    }

    public static /* synthetic */ SocialFollowData copy$default(SocialFollowData socialFollowData, String str, String str2, boolean z, String str3, int i, int i2, int i3, String str4, double d, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = socialFollowData.nickname;
        }
        if ((i4 & 2) != 0) {
            str2 = socialFollowData.avatar;
        }
        if ((i4 & 4) != 0) {
            z = socialFollowData.isFollowed;
        }
        if ((i4 & 8) != 0) {
            str3 = socialFollowData.userType;
        }
        if ((i4 & 16) != 0) {
            i = socialFollowData.followersCount;
        }
        if ((i4 & 32) != 0) {
            i2 = socialFollowData.totalCodes;
        }
        if ((i4 & 64) != 0) {
            i3 = socialFollowData.totalWins;
        }
        if ((i4 & 128) != 0) {
            str4 = socialFollowData.userId;
        }
        if ((i4 & 256) != 0) {
            d = socialFollowData.winRatio;
        }
        double d2 = d;
        int i5 = i3;
        String str5 = str4;
        int i6 = i;
        int i7 = i2;
        return socialFollowData.copy(str, str2, z, str3, i6, i7, i5, str5, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsFollowed() {
        return this.isFollowed;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserType() {
        return this.userType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFollowersCount() {
        return this.followersCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotalCodes() {
        return this.totalCodes;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTotalWins() {
        return this.totalWins;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getWinRatio() {
        return this.winRatio;
    }

    public final SocialFollowData copy(String nickname, String avatar, boolean isFollowed, String userType, int followersCount, int totalCodes, int totalWins, String userId, double winRatio) {
        nickname.getClass();
        userId.getClass();
        return new SocialFollowData(nickname, avatar, isFollowed, userType, followersCount, totalCodes, totalWins, userId, winRatio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialFollowData)) {
            return false;
        }
        SocialFollowData socialFollowData = (SocialFollowData) other;
        return Intrinsics.g(this.nickname, socialFollowData.nickname) && Intrinsics.g(this.avatar, socialFollowData.avatar) && this.isFollowed == socialFollowData.isFollowed && Intrinsics.g(this.userType, socialFollowData.userType) && this.followersCount == socialFollowData.followersCount && this.totalCodes == socialFollowData.totalCodes && this.totalWins == socialFollowData.totalWins && Intrinsics.g(this.userId, socialFollowData.userId) && Double.compare(this.winRatio, socialFollowData.winRatio) == 0;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final int getFollowersCount() {
        return this.followersCount;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final int getTotalCodes() {
        return this.totalCodes;
    }

    public final int getTotalWins() {
        return this.totalWins;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserType() {
        return this.userType;
    }

    public final double getWinRatio() {
        return this.winRatio;
    }

    public int hashCode() {
        int iHashCode = this.nickname.hashCode() * 31;
        String str = this.avatar;
        int iA = mtg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isFollowed);
        String str2 = this.userType;
        return Double.hashCode(this.winRatio) + gmf0.a(gpp.a(this.totalWins, gpp.a(this.totalCodes, gpp.a(this.followersCount, (iA + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31), 31, this.userId);
    }

    public final boolean isFollowed() {
        return this.isFollowed;
    }

    public String toString() {
        String str = this.nickname;
        String str2 = this.avatar;
        boolean z = this.isFollowed;
        String str3 = this.userType;
        int i = this.followersCount;
        int i2 = this.totalCodes;
        int i3 = this.totalWins;
        String str4 = this.userId;
        double d = this.winRatio;
        StringBuilder sbA = ux5.a("SocialFollowData(nickname=", str, ", avatar=", str2, ", isFollowed=");
        mng.a(", userType=", str3, ", followersCount=", sbA, z);
        d5d.a(sbA, i, ", totalCodes=", i2, ", totalWins=");
        f78.b(i3, ", userId=", str4, ", winRatio=", sbA);
        sbA.append(d);
        sbA.append(")");
        return sbA.toString();
    }

    public SocialFollowData(String str, String str2, boolean z, String str3, int i, int i2, int i3, String str4, double d) {
        str.getClass();
        str4.getClass();
        this.nickname = str;
        this.avatar = str2;
        this.isFollowed = z;
        this.userType = str3;
        this.followersCount = i;
        this.totalCodes = i2;
        this.totalWins = i3;
        this.userId = str4;
        this.winRatio = d;
    }
}
