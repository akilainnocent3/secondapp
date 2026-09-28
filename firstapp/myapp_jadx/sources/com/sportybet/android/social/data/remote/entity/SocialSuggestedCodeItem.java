package com.sportybet.android.social.data.remote.entity;

import com.google.gson.annotations.SerializedName;
import com.twilio.voice.EventKeys;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003Jb\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010'J\u0014\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R)\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R)\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0007\u0010\u0017R)\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R'\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017Ê\u0001\u0002\b-Ê\u0001\f\b.\u0012\b\b/\u0012\u0004\b\u0003\u0010\u0000¨\u0006,"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCodeItem;", "", "nickname", "", "avatar", "followersCount", "", "isFollowed", "", "followed", "userType", EventKeys.ERROR_CODE, "Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCode;)V", "getNickname", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getAvatar", "getFollowersCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFollowed", "getUserType", "getCode", "()Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCode;", "followedByMe", "getFollowedByMe", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCode;)Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCodeItem;", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocialSuggestedCodeItem {
    public static final int $stable = SocialSuggestedCode.$stable;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName(EventKeys.ERROR_CODE)
    private final SocialSuggestedCode code;

    @SerializedName("followed")
    private final Boolean followed;

    @SerializedName("followersCount")
    private final Integer followersCount;

    @SerializedName("isFollowed")
    private final Boolean isFollowed;

    @SerializedName("nickname")
    private final String nickname;

    @SerializedName("userType")
    private final String userType;

    public /* synthetic */ SocialSuggestedCodeItem(String str, String str2, Integer num, Boolean bool, Boolean bool2, String str3, SocialSuggestedCode socialSuggestedCode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : socialSuggestedCode);
    }

    public static /* synthetic */ SocialSuggestedCodeItem copy$default(SocialSuggestedCodeItem socialSuggestedCodeItem, String str, String str2, Integer num, Boolean bool, Boolean bool2, String str3, SocialSuggestedCode socialSuggestedCode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = socialSuggestedCodeItem.nickname;
        }
        if ((i & 2) != 0) {
            str2 = socialSuggestedCodeItem.avatar;
        }
        if ((i & 4) != 0) {
            num = socialSuggestedCodeItem.followersCount;
        }
        if ((i & 8) != 0) {
            bool = socialSuggestedCodeItem.isFollowed;
        }
        if ((i & 16) != 0) {
            bool2 = socialSuggestedCodeItem.followed;
        }
        if ((i & 32) != 0) {
            str3 = socialSuggestedCodeItem.userType;
        }
        if ((i & 64) != 0) {
            socialSuggestedCode = socialSuggestedCodeItem.code;
        }
        String str4 = str3;
        SocialSuggestedCode socialSuggestedCode2 = socialSuggestedCode;
        Boolean bool3 = bool2;
        Integer num2 = num;
        return socialSuggestedCodeItem.copy(str, str2, num2, bool, bool3, str4, socialSuggestedCode2);
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
    public final Integer getFollowersCount() {
        return this.followersCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsFollowed() {
        return this.isFollowed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getFollowed() {
        return this.followed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserType() {
        return this.userType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SocialSuggestedCode getCode() {
        return this.code;
    }

    public final SocialSuggestedCodeItem copy(String nickname, String avatar, Integer followersCount, Boolean isFollowed, Boolean followed, String userType, SocialSuggestedCode code) {
        return new SocialSuggestedCodeItem(nickname, avatar, followersCount, isFollowed, followed, userType, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialSuggestedCodeItem)) {
            return false;
        }
        SocialSuggestedCodeItem socialSuggestedCodeItem = (SocialSuggestedCodeItem) other;
        return Intrinsics.g(this.nickname, socialSuggestedCodeItem.nickname) && Intrinsics.g(this.avatar, socialSuggestedCodeItem.avatar) && Intrinsics.g(this.followersCount, socialSuggestedCodeItem.followersCount) && Intrinsics.g(this.isFollowed, socialSuggestedCodeItem.isFollowed) && Intrinsics.g(this.followed, socialSuggestedCodeItem.followed) && Intrinsics.g(this.userType, socialSuggestedCodeItem.userType) && Intrinsics.g(this.code, socialSuggestedCodeItem.code);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final SocialSuggestedCode getCode() {
        return this.code;
    }

    public final Boolean getFollowed() {
        return this.followed;
    }

    public final Boolean getFollowedByMe() {
        Boolean bool = this.isFollowed;
        return bool == null ? this.followed : bool;
    }

    public final Integer getFollowersCount() {
        return this.followersCount;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        String str = this.nickname;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.followersCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isFollowed;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.followed;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.userType;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SocialSuggestedCode socialSuggestedCode = this.code;
        return iHashCode6 + (socialSuggestedCode != null ? socialSuggestedCode.hashCode() : 0);
    }

    public final Boolean isFollowed() {
        return this.isFollowed;
    }

    public String toString() {
        String str = this.nickname;
        String str2 = this.avatar;
        Integer num = this.followersCount;
        Boolean bool = this.isFollowed;
        Boolean bool2 = this.followed;
        String str3 = this.userType;
        SocialSuggestedCode socialSuggestedCode = this.code;
        StringBuilder sbA = ux5.a("SocialSuggestedCodeItem(nickname=", str, ", avatar=", str2, ", followersCount=");
        sbA.append(num);
        sbA.append(", isFollowed=");
        sbA.append(bool);
        sbA.append(", followed=");
        sbA.append(bool2);
        sbA.append(", userType=");
        sbA.append(str3);
        sbA.append(", code=");
        sbA.append(socialSuggestedCode);
        sbA.append(")");
        return sbA.toString();
    }

    public SocialSuggestedCodeItem(String str, String str2, Integer num, Boolean bool, Boolean bool2, String str3, SocialSuggestedCode socialSuggestedCode) {
        this.nickname = str;
        this.avatar = str2;
        this.followersCount = num;
        this.isFollowed = bool;
        this.followed = bool2;
        this.userType = str3;
        this.code = socialSuggestedCode;
    }

    public SocialSuggestedCodeItem() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
