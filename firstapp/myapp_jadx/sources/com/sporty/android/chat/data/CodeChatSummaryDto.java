package com.sporty.android.chat.data;

import defpackage.ew7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JD\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\u0002\b!¨\u0006 "}, d2 = {"Lcom/sporty/android/chat/data/CodeChatSummaryDto;", "", "chatRoomId", "", "messageCount", "", "recentAvatars", "", "lastMessage", "Lcom/sporty/android/chat/data/CodeChatLastMessageDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/sporty/android/chat/data/CodeChatLastMessageDto;)V", "getChatRoomId", "()Ljava/lang/String;", "getMessageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRecentAvatars", "()Ljava/util/List;", "getLastMessage", "()Lcom/sporty/android/chat/data/CodeChatLastMessageDto;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/sporty/android/chat/data/CodeChatLastMessageDto;)Lcom/sporty/android/chat/data/CodeChatSummaryDto;", "equals", "", "other", "hashCode", "toString", "sportychat", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CodeChatSummaryDto {
    private final String chatRoomId;
    private final CodeChatLastMessageDto lastMessage;
    private final Integer messageCount;
    private final List<String> recentAvatars;

    public /* synthetic */ CodeChatSummaryDto(String str, Integer num, List list, CodeChatLastMessageDto codeChatLastMessageDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : codeChatLastMessageDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CodeChatSummaryDto copy$default(CodeChatSummaryDto codeChatSummaryDto, String str, Integer num, List list, CodeChatLastMessageDto codeChatLastMessageDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeChatSummaryDto.chatRoomId;
        }
        if ((i & 2) != 0) {
            num = codeChatSummaryDto.messageCount;
        }
        if ((i & 4) != 0) {
            list = codeChatSummaryDto.recentAvatars;
        }
        if ((i & 8) != 0) {
            codeChatLastMessageDto = codeChatSummaryDto.lastMessage;
        }
        return codeChatSummaryDto.copy(str, num, list, codeChatLastMessageDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMessageCount() {
        return this.messageCount;
    }

    public final List<String> component3() {
        return this.recentAvatars;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CodeChatLastMessageDto getLastMessage() {
        return this.lastMessage;
    }

    public final CodeChatSummaryDto copy(String chatRoomId, Integer messageCount, List<String> recentAvatars, CodeChatLastMessageDto lastMessage) {
        return new CodeChatSummaryDto(chatRoomId, messageCount, recentAvatars, lastMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeChatSummaryDto)) {
            return false;
        }
        CodeChatSummaryDto codeChatSummaryDto = (CodeChatSummaryDto) other;
        return Intrinsics.g(this.chatRoomId, codeChatSummaryDto.chatRoomId) && Intrinsics.g(this.messageCount, codeChatSummaryDto.messageCount) && Intrinsics.g(this.recentAvatars, codeChatSummaryDto.recentAvatars) && Intrinsics.g(this.lastMessage, codeChatSummaryDto.lastMessage);
    }

    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public final CodeChatLastMessageDto getLastMessage() {
        return this.lastMessage;
    }

    public final Integer getMessageCount() {
        return this.messageCount;
    }

    public final List<String> getRecentAvatars() {
        return this.recentAvatars;
    }

    public int hashCode() {
        String str = this.chatRoomId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.messageCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.recentAvatars;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CodeChatLastMessageDto codeChatLastMessageDto = this.lastMessage;
        return iHashCode3 + (codeChatLastMessageDto != null ? codeChatLastMessageDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.chatRoomId;
        Integer num = this.messageCount;
        List<String> list = this.recentAvatars;
        CodeChatLastMessageDto codeChatLastMessageDto = this.lastMessage;
        StringBuilder sbA = ew7.a(num, "CodeChatSummaryDto(chatRoomId=", str, ", messageCount=", ", recentAvatars=");
        sbA.append(list);
        sbA.append(", lastMessage=");
        sbA.append(codeChatLastMessageDto);
        sbA.append(")");
        return sbA.toString();
    }

    public CodeChatSummaryDto(String str, Integer num, List<String> list, CodeChatLastMessageDto codeChatLastMessageDto) {
        this.chatRoomId = str;
        this.messageCount = num;
        this.recentAvatars = list;
        this.lastMessage = codeChatLastMessageDto;
    }

    public CodeChatSummaryDto() {
        this(null, null, null, null, 15, null);
    }
}
