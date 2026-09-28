package com.sporty.android.chat.data;

import com.sportygames.crash.models.header.snc.OdQr;
import defpackage.hxa;
import defpackage.rg2;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\u0002\b ¨\u0006\u001f"}, d2 = {"Lcom/sporty/android/chat/data/CodeChatLastMessageDto;", "", "userNickname", "", "userId", "avatar", "text", "followedByRequester", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getUserNickname", "()Ljava/lang/String;", "getUserId", "getAvatar", "getText", "getFollowedByRequester", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/sporty/android/chat/data/CodeChatLastMessageDto;", "equals", "other", "hashCode", "", "toString", "sportychat", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CodeChatLastMessageDto {
    private final String avatar;
    private final Boolean followedByRequester;
    private final String text;
    private final String userId;
    private final String userNickname;

    public /* synthetic */ CodeChatLastMessageDto(String str, String str2, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool);
    }

    public static /* synthetic */ CodeChatLastMessageDto copy$default(CodeChatLastMessageDto codeChatLastMessageDto, String str, String str2, String str3, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeChatLastMessageDto.userNickname;
        }
        if ((i & 2) != 0) {
            str2 = codeChatLastMessageDto.userId;
        }
        if ((i & 4) != 0) {
            str3 = codeChatLastMessageDto.avatar;
        }
        if ((i & 8) != 0) {
            str4 = codeChatLastMessageDto.text;
        }
        if ((i & 16) != 0) {
            bool = codeChatLastMessageDto.followedByRequester;
        }
        Boolean bool2 = bool;
        String str5 = str3;
        return codeChatLastMessageDto.copy(str, str2, str5, str4, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserNickname() {
        return this.userNickname;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getFollowedByRequester() {
        return this.followedByRequester;
    }

    public final CodeChatLastMessageDto copy(String userNickname, String userId, String avatar, String text, Boolean followedByRequester) {
        return new CodeChatLastMessageDto(userNickname, userId, avatar, text, followedByRequester);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeChatLastMessageDto)) {
            return false;
        }
        CodeChatLastMessageDto codeChatLastMessageDto = (CodeChatLastMessageDto) other;
        return Intrinsics.g(this.userNickname, codeChatLastMessageDto.userNickname) && Intrinsics.g(this.userId, codeChatLastMessageDto.userId) && Intrinsics.g(this.avatar, codeChatLastMessageDto.avatar) && Intrinsics.g(this.text, codeChatLastMessageDto.text) && Intrinsics.g(this.followedByRequester, codeChatLastMessageDto.followedByRequester);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final Boolean getFollowedByRequester() {
        return this.followedByRequester;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserNickname() {
        return this.userNickname;
    }

    public int hashCode() {
        String str = this.userNickname;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatar;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.followedByRequester;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.userNickname;
        String str2 = this.userId;
        String str3 = this.avatar;
        String str4 = this.text;
        Boolean bool = this.followedByRequester;
        StringBuilder sbA = ux5.a("CodeChatLastMessageDto(userNickname=", str, ", userId=", str2, ", avatar=");
        hxa.c(sbA, str3, ", text=", str4, OdQr.PrypKZnToW);
        return rg2.a(sbA, bool, ")");
    }

    public CodeChatLastMessageDto(String str, String str2, String str3, String str4, Boolean bool) {
        this.userNickname = str;
        this.userId = str2;
        this.avatar = str3;
        this.text = str4;
        this.followedByRequester = bool;
    }

    public CodeChatLastMessageDto() {
        this(null, null, null, null, null, 31, null);
    }
}
