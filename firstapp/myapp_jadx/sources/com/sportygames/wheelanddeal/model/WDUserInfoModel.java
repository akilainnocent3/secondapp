package com.sportygames.wheelanddeal.model;

import defpackage.j26;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sportygames/wheelanddeal/model/WDUserInfoModel;", "", "nickname", "", "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNickname", "()Ljava/lang/String;", "getAvatar", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "game-wheelanddeal_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WDUserInfoModel {
    public static final int $stable = 0;
    private final String avatar;
    private final String nickname;

    public /* synthetic */ WDUserInfoModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ WDUserInfoModel copy$default(WDUserInfoModel wDUserInfoModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wDUserInfoModel.nickname;
        }
        if ((i & 2) != 0) {
            str2 = wDUserInfoModel.avatar;
        }
        return wDUserInfoModel.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    public final WDUserInfoModel copy(String nickname, String avatar) {
        nickname.getClass();
        avatar.getClass();
        return new WDUserInfoModel(nickname, avatar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WDUserInfoModel)) {
            return false;
        }
        WDUserInfoModel wDUserInfoModel = (WDUserInfoModel) other;
        return Intrinsics.g(this.nickname, wDUserInfoModel.nickname) && Intrinsics.g(this.avatar, wDUserInfoModel.avatar);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public int hashCode() {
        return this.avatar.hashCode() + (this.nickname.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WDUserInfoModel(nickname=");
        sb.append(this.nickname);
        sb.append(", avatar=");
        return j26.a(sb, this.avatar, ')');
    }

    public WDUserInfoModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.nickname = str;
        this.avatar = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WDUserInfoModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
