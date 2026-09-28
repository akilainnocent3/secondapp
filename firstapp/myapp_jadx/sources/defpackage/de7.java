package defpackage;

import com.sporty.android.chat.data.ChatMessage;
import com.sporty.android.chat.data.ChatRoomInfo;
import com.sporty.android.chat.data.LogProcess;
import com.sporty.android.chat.data.LogStatus;
import com.sporty.android.chat.data.MsgType;
import com.sporty.android.common.data.CustomException;
import com.sporty.android.common.data.CustomExceptionType;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class de7 implements faj<bi50<ChatRoomInfo>, ct90<bi50<List<ChatMessage>>>> {
    public final /* synthetic */ be7 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ LinkedHashMap c;

    public de7(be7 be7Var, LinkedHashMap linkedHashMap, boolean z) {
        this.a = be7Var;
        this.b = z;
        this.c = linkedHashMap;
    }

    @Override // defpackage.faj
    public final ct90<bi50<List<ChatMessage>>> apply(bi50<ChatRoomInfo> bi50Var) throws CustomException {
        bi50<ChatRoomInfo> bi50Var2 = bi50Var;
        bi50Var2.getClass();
        Response response = bi50Var2.a;
        ResponseBody responseBody = bi50Var2.c;
        boolean isSuccessful = response.getIsSuccessful();
        be7 be7Var = this.a;
        if (isSuccessful) {
            ChatRoomInfo chatRoomInfo = bi50Var2.b;
            if (be7Var.d0) {
                be7Var.d0 = false;
                mpe0 mpe0Var = ljs.a;
                ljs.a(LogProcess.GET_CHAT_ROOM_INFO, LogStatus.SUCCESS, be7Var.V, jpu.b(new Pair("contentType", "init")));
            }
            if (chatRoomInfo != null) {
                String chatRoomId = chatRoomInfo.getChatRoomId();
                int lastMessageNo = chatRoomInfo.getLastMessageNo();
                itf0.a aVar = itf0.a;
                StringBuilder sbA = ce7.a(aVar, "SPORTY_CHAT", "getNewChatMessages(), chatRoomId: ", chatRoomId, ", chatRoomLastMsgNo: ");
                sbA.append(lastMessageNo);
                aVar.a(sbA.toString(), new Object[0]);
                if (!StringsKt.U(chatRoomId)) {
                    be7Var.W = chatRoomId;
                    int i = be7Var.X;
                    if (!this.b && lastMessageNo == i) {
                        mpe0 mpe0Var2 = ljs.a;
                        ljs.a(LogProcess.GET_CHAT_ROOM_INFO, LogStatus.SUCCESS, be7Var.V, jpu.b(new Pair("contentType", "polling_no_updates")));
                        throw new CustomException(CustomExceptionType.ABORT, "");
                    }
                    aVar.q("SPORTY_CHAT");
                    aVar.a("getNewChatMessages(), chatRoomLastMessageNo: " + lastMessageNo + ", currentLastMessageNo: " + i, new Object[0]);
                    int i2 = i == 0 ? 40 : lastMessageNo - i;
                    String strValueOf = String.valueOf(lastMessageNo);
                    LinkedHashMap linkedHashMap = this.c;
                    linkedHashMap.put("messageNo", strValueOf);
                    linkedHashMap.put("length", String.valueOf(i2));
                    mpe0 mpe0Var3 = ljs.a;
                    ljs.a(LogProcess.GET_CHAT_ROOM_INFO, LogStatus.SUCCESS, be7Var.V, jpu.b(new Pair("contentType", "polling_updates")));
                    jc7 jc7Var = be7Var.d;
                    if (jc7Var != null) {
                        return jc7Var.e(lastMessageNo, i2, MsgType.TEXT.getType(), chatRoomId);
                    }
                    Intrinsics.n("chatRepo");
                    throw null;
                }
            }
        } else {
            mpe0 mpe0Var4 = ljs.a;
            ljs.c(LogProcess.GET_CHAT_ROOM_INFO, be7Var.V, null, new CustomException(null, ui8.c(responseBody), 1, null), 12);
        }
        throw new CustomException(CustomExceptionType.ERROR, ui8.c(responseBody));
    }
}
