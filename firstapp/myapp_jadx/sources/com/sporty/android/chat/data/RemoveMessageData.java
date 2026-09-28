package com.sporty.android.chat.data;

import com.google.gson.annotations.SerializedName;
import defpackage.d830;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/chat/data/RemoveMessageData;", "", "chatRoomId", "", "messageNo", "", "<init>", "(Ljava/lang/String;I)V", "getChatRoomId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getMessageNo", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RemoveMessageData {

    @SerializedName("chatRoomId")
    private final String chatRoomId;

    @SerializedName("messageNo")
    private final int messageNo;

    public RemoveMessageData(String str, int i) {
        str.getClass();
        this.chatRoomId = str;
        this.messageNo = i;
    }

    public static /* synthetic */ RemoveMessageData copy$default(RemoveMessageData removeMessageData, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = removeMessageData.chatRoomId;
        }
        if ((i2 & 2) != 0) {
            i = removeMessageData.messageNo;
        }
        return removeMessageData.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMessageNo() {
        return this.messageNo;
    }

    public final RemoveMessageData copy(String chatRoomId, int messageNo) {
        chatRoomId.getClass();
        return new RemoveMessageData(chatRoomId, messageNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoveMessageData)) {
            return false;
        }
        RemoveMessageData removeMessageData = (RemoveMessageData) other;
        return Intrinsics.g(this.chatRoomId, removeMessageData.chatRoomId) && this.messageNo == removeMessageData.messageNo;
    }

    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public final int getMessageNo() {
        return this.messageNo;
    }

    public int hashCode() {
        return Integer.hashCode(this.messageNo) + (this.chatRoomId.hashCode() * 31);
    }

    public String toString() {
        return d830.a(this.messageNo, "RemoveMessageData(chatRoomId=", this.chatRoomId, ", messageNo=", ")");
    }
}
