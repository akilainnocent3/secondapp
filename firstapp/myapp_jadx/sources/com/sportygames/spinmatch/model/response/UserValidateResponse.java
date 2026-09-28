package com.sportygames.spinmatch.model.response;

import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.t160;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/sportygames/spinmatch/model/response/UserValidateResponse;", "", "isAllowedToPlay", "", "patronId", "", "avatarUrl", "nickName", "userId", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getPatronId", "()Ljava/lang/String;", "getAvatarUrl", "getNickName", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserValidateResponse {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final boolean isAllowedToPlay;
    private final String nickName;
    private final String patronId;
    private final String userId;

    public UserValidateResponse(boolean z, String str, String str2, String str3, String str4) {
        str.getClass();
        str4.getClass();
        this.isAllowedToPlay = z;
        this.patronId = str;
        this.avatarUrl = str2;
        this.nickName = str3;
        this.userId = str4;
    }

    public static /* synthetic */ UserValidateResponse copy$default(UserValidateResponse userValidateResponse, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userValidateResponse.isAllowedToPlay;
        }
        if ((i & 2) != 0) {
            str = userValidateResponse.patronId;
        }
        if ((i & 4) != 0) {
            str2 = userValidateResponse.avatarUrl;
        }
        if ((i & 8) != 0) {
            str3 = userValidateResponse.nickName;
        }
        if ((i & 16) != 0) {
            str4 = userValidateResponse.userId;
        }
        String str5 = str4;
        String str6 = str2;
        return userValidateResponse.copy(z, str, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsAllowedToPlay() {
        return this.isAllowedToPlay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPatronId() {
        return this.patronId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final UserValidateResponse copy(boolean isAllowedToPlay, String patronId, String avatarUrl, String nickName, String userId) {
        patronId.getClass();
        userId.getClass();
        return new UserValidateResponse(isAllowedToPlay, patronId, avatarUrl, nickName, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserValidateResponse)) {
            return false;
        }
        UserValidateResponse userValidateResponse = (UserValidateResponse) other;
        return this.isAllowedToPlay == userValidateResponse.isAllowedToPlay && Intrinsics.g(this.patronId, userValidateResponse.patronId) && Intrinsics.g(this.avatarUrl, userValidateResponse.avatarUrl) && Intrinsics.g(this.nickName, userValidateResponse.nickName) && Intrinsics.g(this.userId, userValidateResponse.userId);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getPatronId() {
        return this.patronId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = gmf0.a(Boolean.hashCode(this.isAllowedToPlay) * 31, 31, this.patronId);
        String str = this.avatarUrl;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nickName;
        return this.userId.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isAllowedToPlay() {
        return this.isAllowedToPlay;
    }

    public String toString() {
        boolean z = this.isAllowedToPlay;
        String str = this.patronId;
        String str2 = this.avatarUrl;
        String str3 = this.nickName;
        String str4 = this.userId;
        StringBuilder sbA = t160.a("UserValidateResponse(isAllowedToPlay=", ", patronId=", str, ", avatarUrl=", z);
        hxa.c(sbA, str2, ", nickName=", str3, ", userId=");
        return uf80.a(sbA, str4, dLRYz.jMQcfkrQfPxg);
    }
}
