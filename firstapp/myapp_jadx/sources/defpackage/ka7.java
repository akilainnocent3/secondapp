package defpackage;

import com.sportygames.chat.remote.models.AddGroupResponse;
import com.sportygames.chat.remote.models.LeaveRequest;
import com.sportygames.chat.remote.models.SendMessageResponse;
import com.sportygames.commons.chat.remote.models.ChatListResponse;
import com.sportygames.commons.chat.remote.models.SendMessageRequest;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lka7;", "", "", "chatRoom", "time", "Lcom/sportygames/chat/remote/models/AddGroupResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "messageNo", "length", "messageType", "includingDeleted", "", "Lcom/sportygames/commons/chat/remote/models/ChatListResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/chat/remote/models/LeaveRequest;", "leaveRequest", "c", "(Lcom/sportygames/chat/remote/models/LeaveRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/commons/chat/remote/models/SendMessageRequest;", "chatRequest", "Lcom/sportygames/chat/remote/models/SendMessageResponse;", "d", "(Lcom/sportygames/commons/chat/remote/models/SendMessageRequest;Lv1b;)Ljava/lang/Object;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ka7 {
    @sbj("chat/chat/backwardV2")
    Object a(@db30("chatroomId") String str, @db30("messageNo") String str2, @db30("length") String str3, @db30("messageType") String str4, @db30("includingDeleted") String str5, v1b<? super List<ChatListResponse>> v1bVar);

    @sbj("chat/chatroom/groups/{chatRoom}")
    Object b(@dxz("chatRoom") String str, @db30("_t") String str2, v1b<? super AddGroupResponse> v1bVar);

    @flz("chat/chatroom/groups/leave")
    Object c(@jh4 LeaveRequest leaveRequest, v1b<? super ChatListResponse> v1bVar);

    @flz("chat/chat/messageV2")
    Object d(@jh4 SendMessageRequest sendMessageRequest, v1b<? super SendMessageResponse> v1bVar);
}
