package com.sportygames.goldmine.data.dto;

import defpackage.j26;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sportygames/goldmine/data/dto/TGUserInfoDTO;", "", "nickname", "", "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNickname", "()Ljava/lang/String;", "getAvatar", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "game-goldmine_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TGUserInfoDTO {
    public static final int $stable = 0;
    private final String avatar;
    private final String nickname;

    public /* synthetic */ TGUserInfoDTO(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ TGUserInfoDTO copy$default(TGUserInfoDTO tGUserInfoDTO, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tGUserInfoDTO.nickname;
        }
        if ((i & 2) != 0) {
            str2 = tGUserInfoDTO.avatar;
        }
        return tGUserInfoDTO.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    public final TGUserInfoDTO copy(String nickname, String avatar) {
        return new TGUserInfoDTO(nickname, avatar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TGUserInfoDTO)) {
            return false;
        }
        TGUserInfoDTO tGUserInfoDTO = (TGUserInfoDTO) other;
        return Intrinsics.g(this.nickname, tGUserInfoDTO.nickname) && Intrinsics.g(this.avatar, tGUserInfoDTO.avatar);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public int hashCode() {
        String str = this.nickname;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatar;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TGUserInfoDTO(nickname=");
        sb.append(this.nickname);
        sb.append(", avatar=");
        return j26.a(sb, this.avatar, ')');
    }

    public TGUserInfoDTO(String str, String str2) {
        this.nickname = str;
        this.avatar = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TGUserInfoDTO() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
