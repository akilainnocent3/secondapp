package defpackage;

import com.sporty.android.chat.data.ChatMessage;
import com.sporty.android.chat.data.ChatRoomInfo;
import com.sporty.android.chat.data.CodeChatChatsResponseDto;
import com.sporty.android.chat.data.DefaultCommand;
import com.sporty.android.chat.data.LeaveChatroomData;
import com.sporty.android.chat.data.RemoveMessageData;
import com.sporty.android.chat.data.SendMessageData;
import com.sporty.android.chat.data.UploadImageResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJS\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\fH'¢\u0006\u0004\b\u0014\u0010\u0015JS\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\fH'¢\u0006\u0004\b\u0016\u0010\u0015J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u001c\u0010\u001bJ%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00050\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u001dH'¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00050\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u001dH'¢\u0006\u0004\b!\u0010 J%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00050\u00042\b\b\u0001\u0010\u0018\u001a\u00020\"H'¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00050\u00042\b\b\u0001\u0010\u0018\u001a\u00020\"H'¢\u0006\u0004\b%\u0010$J%\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00050\u00042\b\b\u0001\u0010'\u001a\u00020&H'¢\u0006\u0004\b)\u0010*J$\u0010.\u001a\u00020-2\b\b\u0001\u0010+\u001a\u00020\f2\b\b\u0001\u0010,\u001a\u00020\fH§@¢\u0006\u0004\b.\u0010/¨\u00060À\u0006\u0003"}, d2 = {"Lca7;", "", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "Lct90;", "Lbi50;", "Lcom/sporty/android/chat/data/ChatRoomInfo;", "c", "(Ljava/lang/String;)Lct90;", "bookingCode", "b", "chatroomId", "", "messageNo", "length", "", "includingDeletedMessage", "messageType", "", "Lcom/sporty/android/chat/data/ChatMessage;", "f", "(Ljava/lang/String;IIZI)Lct90;", "l", "Lcom/sporty/android/chat/data/LeaveChatroomData;", "data", "Lokhttp3/ResponseBody;", "d", "(Lcom/sporty/android/chat/data/LeaveChatroomData;)Lct90;", "j", "Lcom/sporty/android/chat/data/SendMessageData;", "Lcom/sporty/android/chat/data/DefaultCommand;", "g", "(Lcom/sporty/android/chat/data/SendMessageData;)Lct90;", "h", "Lcom/sporty/android/chat/data/RemoveMessageData;", "k", "(Lcom/sporty/android/chat/data/RemoveMessageData;)Lct90;", "e", "Lokhttp3/MultipartBody$Part;", "filePart", "Lcom/sporty/android/chat/data/UploadImageResponse;", "a", "(Lokhttp3/MultipartBody$Part;)Lct90;", AnalyticsParam.MINI_GAMES_PAGE, "pageSize", "Lcom/sporty/android/chat/data/CodeChatChatsResponseDto;", "i", "(IILv1b;)Ljava/lang/Object;", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ca7 {
    @flz("chat/images")
    @jmw
    ct90<bi50<UploadImageResponse>> a(@usz MultipartBody.Part filePart);

    @sbj("chat/booking-code/{bookingCode}")
    ct90<bi50<ChatRoomInfo>> b(@dxz("bookingCode") String bookingCode);

    @sbj("chat/match/{eventId}")
    ct90<bi50<ChatRoomInfo>> c(@dxz(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String eventId);

    @flz("chat/match/leave")
    @gil({"Content-Type: application/json"})
    ct90<bi50<ResponseBody>> d(@jh4 LeaveChatroomData data);

    @flz("chat/booking-code/remove")
    @gil({"Content-Type: application/json"})
    ct90<bi50<DefaultCommand>> e(@jh4 RemoveMessageData data);

    @sbj("chat/match/backward")
    ct90<bi50<List<ChatMessage>>> f(@db30("chatroomId") String chatroomId, @db30("messageNo") int messageNo, @db30("length") int length, @db30("includingDeleted") boolean includingDeletedMessage, @db30("messageType") int messageType);

    @flz("chat/match/message")
    @gil({"Content-Type: application/json"})
    ct90<bi50<DefaultCommand>> g(@jh4 SendMessageData data);

    @flz("chat/booking-code/message")
    @gil({"Content-Type: application/json"})
    ct90<bi50<DefaultCommand>> h(@jh4 SendMessageData data);

    @sbj("chat/booking-code/chats")
    Object i(@db30(AnalyticsParam.MINI_GAMES_PAGE) int i, @db30("pageSize") int i2, v1b<? super CodeChatChatsResponseDto> v1bVar);

    @flz("chat/booking-code/leave")
    @gil({"Content-Type: application/json"})
    ct90<bi50<ResponseBody>> j(@jh4 LeaveChatroomData data);

    @flz("chat/match/remove")
    @gil({"Content-Type: application/json"})
    ct90<bi50<DefaultCommand>> k(@jh4 RemoveMessageData data);

    @sbj("chat/booking-code/backward")
    ct90<bi50<List<ChatMessage>>> l(@db30("chatroomId") String chatroomId, @db30("messageNo") int messageNo, @db30("length") int length, @db30("includingDeleted") boolean includingDeletedMessage, @db30("messageType") int messageType);
}
