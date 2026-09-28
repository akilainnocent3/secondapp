package com.sporty.android.chat.data;

import com.google.gson.annotations.SerializedName;
import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/chat/data/LeaveChatroomData;", "", "chatRoomId", "", "<init>", "(Ljava/lang/String;)V", "getChatRoomId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LeaveChatroomData {

    @SerializedName("chatRoomId")
    private final String chatRoomId;

    public LeaveChatroomData(String str) {
        str.getClass();
        this.chatRoomId = str;
    }

    public static /* synthetic */ LeaveChatroomData copy$default(LeaveChatroomData leaveChatroomData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leaveChatroomData.chatRoomId;
        }
        return leaveChatroomData.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public final LeaveChatroomData copy(String chatRoomId) {
        chatRoomId.getClass();
        return new LeaveChatroomData(chatRoomId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LeaveChatroomData) && Intrinsics.g(this.chatRoomId, ((LeaveChatroomData) other).chatRoomId);
    }

    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public int hashCode() {
        return this.chatRoomId.hashCode();
    }

    public String toString() {
        return tug.a("LeaveChatroomData(chatRoomId=", this.chatRoomId, ")");
    }
}
