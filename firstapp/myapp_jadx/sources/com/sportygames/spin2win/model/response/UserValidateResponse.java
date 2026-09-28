package com.sportygames.spin2win.model.response;

import defpackage.kwi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J<\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/sportygames/spin2win/model/response/UserValidateResponse;", "", "isAllowedToPlay", "", "avatarUrl", "", "nickName", "userId", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAvatarUrl", "()Ljava/lang/String;", "getNickName", "getUserId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sportygames/spin2win/model/response/UserValidateResponse;", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserValidateResponse {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final Boolean isAllowedToPlay;
    private final String nickName;
    private final String userId;

    public UserValidateResponse(Boolean bool, String str, String str2, String str3) {
        str3.getClass();
        this.isAllowedToPlay = bool;
        this.avatarUrl = str;
        this.nickName = str2;
        this.userId = str3;
    }

    public static /* synthetic */ UserValidateResponse copy$default(UserValidateResponse userValidateResponse, Boolean bool, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = userValidateResponse.isAllowedToPlay;
        }
        if ((i & 2) != 0) {
            str = userValidateResponse.avatarUrl;
        }
        if ((i & 4) != 0) {
            str2 = userValidateResponse.nickName;
        }
        if ((i & 8) != 0) {
            str3 = userValidateResponse.userId;
        }
        return userValidateResponse.copy(bool, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsAllowedToPlay() {
        return this.isAllowedToPlay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final UserValidateResponse copy(Boolean isAllowedToPlay, String avatarUrl, String nickName, String userId) {
        userId.getClass();
        return new UserValidateResponse(isAllowedToPlay, avatarUrl, nickName, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserValidateResponse)) {
            return false;
        }
        UserValidateResponse userValidateResponse = (UserValidateResponse) other;
        return Intrinsics.g(this.isAllowedToPlay, userValidateResponse.isAllowedToPlay) && Intrinsics.g(this.avatarUrl, userValidateResponse.avatarUrl) && Intrinsics.g(this.nickName, userValidateResponse.nickName) && Intrinsics.g(this.userId, userValidateResponse.userId);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Boolean bool = this.isAllowedToPlay;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.avatarUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nickName;
        return this.userId.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final Boolean isAllowedToPlay() {
        return this.isAllowedToPlay;
    }

    public String toString() {
        Boolean bool = this.isAllowedToPlay;
        String str = this.avatarUrl;
        String str2 = this.nickName;
        String str3 = this.userId;
        StringBuilder sb = new StringBuilder("UserValidateResponse(isAllowedToPlay=");
        sb.append(bool);
        sb.append(", avatarUrl=");
        sb.append(str);
        sb.append(", nickName=");
        return kwi.a(sb, str2, ", userId=", str3, ")");
    }
}
