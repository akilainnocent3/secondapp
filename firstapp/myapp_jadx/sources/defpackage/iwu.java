package defpackage;

import com.sporty.android.chat.data.ChatRoomInfo;
import com.sporty.android.chat.data.DefaultCommand;
import com.sporty.android.chat.data.LeaveChatroomData;
import com.sporty.android.chat.data.RemoveMessageData;
import com.sporty.android.chat.data.SendMessageData;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class iwu extends jz1 {
    @Override // defpackage.jc7
    public final ct90<bi50<DefaultCommand>> b(SendMessageData sendMessageData) {
        return this.a.g(sendMessageData);
    }

    @Override // defpackage.jc7
    public final ct90<bi50<ChatRoomInfo>> c(String str) {
        str.getClass();
        return this.a.c(str);
    }

    @Override // defpackage.jc7
    public final ct90<bi50<DefaultCommand>> d(RemoveMessageData removeMessageData) {
        return this.a.k(removeMessageData);
    }

    @Override // defpackage.jc7
    public final ct90 e(int i, int i2, int i3, String str) {
        str.getClass();
        return this.a.f(str, i, i2, false, i3);
    }

    @Override // defpackage.jc7
    public final ct90<bi50<ResponseBody>> g(LeaveChatroomData leaveChatroomData) {
        return this.a.d(leaveChatroomData);
    }
}
