package com.sportybet.android.social.data.local;

import defpackage.gmf0;
import defpackage.ijg0;
import defpackage.mtg0;
import defpackage.uts;
import defpackage.ux5;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\nHÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R%\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR%\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019Ê\u0001\u0002\b'Ê\u0001 \b(\u0012\u0012\b)\u0012\u000e\b\fJ\u0004\b\b(\u0002J\u0004\b\b(\u0004\u0012\b\b*\u0012\u0004\b\b(+Ê\u0001\f\b,\u0012\b\b-\u0012\u0004\b\u0003\u0010\u0002¨\u0006&"}, d2 = {"Lcom/sportybet/android/social/data/local/SocialFollowingEntity;", "", "account", "", "nickname", "avatarUrl", "isFollowed", "", "userType", "pageIndex", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V", "getAccount", "()Ljava/lang/String;", "Landroidx/room/ColumnInfo;", "name", "getNickname", "getAvatarUrl", "avatar_url", "()Z", "is_followed", "getUserType", "user_type", "getPageIndex", "()I", "page_index", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/room/Entity;", "primaryKeys", "tableName", "social_following_table", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocialFollowingEntity {
    public static final int $stable = 0;
    private final String account;
    private final String avatarUrl;
    private final boolean isFollowed;
    private final String nickname;
    private final int pageIndex;
    private final String userType;

    public SocialFollowingEntity(String str, String str2, String str3, boolean z, String str4, int i) {
        wd7.a(str, str2, str3, str4);
        this.account = str;
        this.nickname = str2;
        this.avatarUrl = str3;
        this.isFollowed = z;
        this.userType = str4;
        this.pageIndex = i;
    }

    public static /* synthetic */ SocialFollowingEntity copy$default(SocialFollowingEntity socialFollowingEntity, String str, String str2, String str3, boolean z, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = socialFollowingEntity.account;
        }
        if ((i2 & 2) != 0) {
            str2 = socialFollowingEntity.nickname;
        }
        if ((i2 & 4) != 0) {
            str3 = socialFollowingEntity.avatarUrl;
        }
        if ((i2 & 8) != 0) {
            z = socialFollowingEntity.isFollowed;
        }
        if ((i2 & 16) != 0) {
            str4 = socialFollowingEntity.userType;
        }
        if ((i2 & 32) != 0) {
            i = socialFollowingEntity.pageIndex;
        }
        String str5 = str4;
        int i3 = i;
        return socialFollowingEntity.copy(str, str2, str3, z, str5, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsFollowed() {
        return this.isFollowed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserType() {
        return this.userType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final SocialFollowingEntity copy(String account, String nickname, String avatarUrl, boolean isFollowed, String userType, int pageIndex) {
        account.getClass();
        nickname.getClass();
        avatarUrl.getClass();
        userType.getClass();
        return new SocialFollowingEntity(account, nickname, avatarUrl, isFollowed, userType, pageIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialFollowingEntity)) {
            return false;
        }
        SocialFollowingEntity socialFollowingEntity = (SocialFollowingEntity) other;
        return Intrinsics.g(this.account, socialFollowingEntity.account) && Intrinsics.g(this.nickname, socialFollowingEntity.nickname) && Intrinsics.g(this.avatarUrl, socialFollowingEntity.avatarUrl) && this.isFollowed == socialFollowingEntity.isFollowed && Intrinsics.g(this.userType, socialFollowingEntity.userType) && this.pageIndex == socialFollowingEntity.pageIndex;
    }

    public final String getAccount() {
        return this.account;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        return Integer.hashCode(this.pageIndex) + gmf0.a(mtg0.a(gmf0.a(gmf0.a(this.account.hashCode() * 31, 31, this.nickname), 31, this.avatarUrl), 31, this.isFollowed), 31, this.userType);
    }

    public final boolean isFollowed() {
        return this.isFollowed;
    }

    public String toString() {
        String str = this.account;
        String str2 = this.nickname;
        String str3 = this.avatarUrl;
        boolean z = this.isFollowed;
        String str4 = this.userType;
        int i = this.pageIndex;
        StringBuilder sbA = ux5.a("SocialFollowingEntity(account=", str, ", nickname=", str2, ", avatarUrl=");
        uts.b(str3, ", isFollowed=", ", userType=", sbA, z);
        return ijg0.a(i, str4, ", pageIndex=", ")", sbA);
    }
}
