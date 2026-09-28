package com.sporty.android.chat.data;

import androidx.recyclerview.widget.r;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006\""}, d2 = {"Lcom/sporty/android/chat/data/MsgType;", "", "type", "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "TEXT", "IMAGE", "VIDEO", "JSON", "GIF", "BLOCK", "UNBLOCK", "FRIEND_ACCEPTED", "UNFRIEND", "CHAT_MESSAGE_ACCEPTED", "PROFILE_UPDATED", "FRIEND_REQUEST", "CHAT_MESSAGE_REQUEST", "FRIEND_REQUEST_CANCELLED", "CREATE_CHAT_ROOM", "MARK_READ", "RELOAD_FULL_CLIENT_CACHE", "DELETE_CHATROOM", "RECYCLE_MESSAGE", "DELETE_MESSAGE", "ADD_USER_TO_GROUP", "RENAME_GROUP", "REMOVE_USER_FROM_GROUP", "LEAVE_GROUP", "UPDATE_AVATAR", "Companion", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum MsgType {
    TEXT(1),
    IMAGE(2),
    VIDEO(3),
    JSON(4),
    GIF(5),
    BLOCK(100),
    UNBLOCK(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS),
    FRIEND_ACCEPTED(HttpStatusCodesKt.HTTP_PROCESSING),
    UNFRIEND(HttpStatusCodesKt.HTTP_EARLY_HINTS),
    CHAT_MESSAGE_ACCEPTED(104),
    PROFILE_UPDATED(105),
    FRIEND_REQUEST(106),
    CHAT_MESSAGE_REQUEST(107),
    FRIEND_REQUEST_CANCELLED(108),
    CREATE_CHAT_ROOM(r.d.DEFAULT_DRAG_ANIMATION_DURATION),
    MARK_READ(201),
    RELOAD_FULL_CLIENT_CACHE(202),
    DELETE_CHATROOM(203),
    RECYCLE_MESSAGE(300),
    DELETE_MESSAGE(301),
    ADD_USER_TO_GROUP(221),
    RENAME_GROUP(222),
    REMOVE_USER_FROM_GROUP(223),
    LEAVE_GROUP(224),
    UPDATE_AVATAR(225);

    private final int type;
    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/chat/data/MsgType$Companion;", "", "<init>", "()V", "fromType", "Lcom/sporty/android/chat/data/MsgType;", "type", "", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MsgType fromType(int type) {
            for (MsgType msgType : MsgType.values()) {
                if (msgType.getType() == type) {
                    return msgType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    MsgType(int i) {
        this.type = i;
    }

    public static tag<MsgType> getEntries() {
        return $ENTRIES;
    }

    public final int getType() {
        return this.type;
    }
}
