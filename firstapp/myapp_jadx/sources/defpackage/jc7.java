package defpackage;

import com.sporty.android.chat.data.ChatRoomInfo;
import com.sporty.android.chat.data.CodeChatChatsResponseDto;
import com.sporty.android.chat.data.DefaultCommand;
import com.sporty.android.chat.data.LeaveChatroomData;
import com.sporty.android.chat.data.RemoveMessageData;
import com.sporty.android.chat.data.SendMessageData;
import com.sporty.android.chat.data.UploadImageResponse;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public interface jc7 {
    ct90<bi50<UploadImageResponse>> a(MultipartBody.Part part);

    ct90<bi50<DefaultCommand>> b(SendMessageData sendMessageData);

    ct90<bi50<ChatRoomInfo>> c(String str);

    ct90<bi50<DefaultCommand>> d(RemoveMessageData removeMessageData);

    ct90 e(int i, int i2, int i3, String str);

    lyh<CodeChatChatsResponseDto> f(int i, int i2);

    ct90<bi50<ResponseBody>> g(LeaveChatroomData leaveChatroomData);
}
