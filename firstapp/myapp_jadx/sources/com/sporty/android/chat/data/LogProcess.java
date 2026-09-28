package com.sporty.android.chat.data;

import defpackage.om2;
import defpackage.tag;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, d2 = {"Lcom/sporty/android/chat/data/LogProcess;", "", "<init>", "(Ljava/lang/String;I)V", "GET_CHAT_ROOM_INFO", "LOAD_MESSAGES", "WEBSOCKET_CONNECTION_STATUS", "SENDING_MESSAGE", "LEAVE_CHAT_ROOM", "DELETING_MESSAGE", "getString", "", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum LogProcess {
    GET_CHAT_ROOM_INFO,
    LOAD_MESSAGES,
    WEBSOCKET_CONNECTION_STATUS,
    SENDING_MESSAGE,
    LEAVE_CHAT_ROOM,
    DELETING_MESSAGE;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    public static tag<LogProcess> getEntries() {
        return $ENTRIES;
    }

    public final String getString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
