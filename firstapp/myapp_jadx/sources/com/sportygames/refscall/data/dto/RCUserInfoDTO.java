package com.sportygames.refscall.data.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/sportygames/refscall/data/dto/RCUserInfoDTO;", "", "nickName", "", "avatarUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNickName", "()Ljava/lang/String;", "getAvatarUrl", "game-refscall_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RCUserInfoDTO {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final String nickName;

    public /* synthetic */ RCUserInfoDTO(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public RCUserInfoDTO(String str, String str2) {
        this.nickName = str;
        this.avatarUrl = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RCUserInfoDTO() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
