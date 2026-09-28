package com.sporty.android.chat.data;

import com.appsflyer.internal.m;
import com.google.gson.annotations.SerializedName;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import defpackage.gmf0;
import defpackage.kwi;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/chat/data/SendMessageData;", "", "text", "", "chatRoomId", "msgType", "sharedBetsMeta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getChatRoomId", "getMsgType", "getSharedBetsMeta", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SendMessageData {

    @SerializedName("chatRoomId")
    private final String chatRoomId;

    @SerializedName("msgType")
    private final String msgType;

    @SerializedName("sharedBetsMeta")
    private final String sharedBetsMeta;

    @SerializedName("text")
    private final String text;

    public SendMessageData(String str, String str2, String str3, String str4) {
        m.a(str, str2, str3);
        this.text = str;
        this.chatRoomId = str2;
        this.msgType = str3;
        this.sharedBetsMeta = str4;
    }

    public static /* synthetic */ SendMessageData copy$default(SendMessageData sendMessageData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendMessageData.text;
        }
        if ((i & 2) != 0) {
            str2 = sendMessageData.chatRoomId;
        }
        if ((i & 4) != 0) {
            str3 = sendMessageData.msgType;
        }
        if ((i & 8) != 0) {
            str4 = sendMessageData.sharedBetsMeta;
        }
        return sendMessageData.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMsgType() {
        return this.msgType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSharedBetsMeta() {
        return this.sharedBetsMeta;
    }

    public final SendMessageData copy(String text, String chatRoomId, String msgType, String sharedBetsMeta) {
        text.getClass();
        chatRoomId.getClass();
        msgType.getClass();
        return new SendMessageData(text, chatRoomId, msgType, sharedBetsMeta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendMessageData)) {
            return false;
        }
        SendMessageData sendMessageData = (SendMessageData) other;
        return Intrinsics.g(this.text, sendMessageData.text) && Intrinsics.g(this.chatRoomId, sendMessageData.chatRoomId) && Intrinsics.g(this.msgType, sendMessageData.msgType) && Intrinsics.g(this.sharedBetsMeta, sendMessageData.sharedBetsMeta);
    }

    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public final String getMsgType() {
        return this.msgType;
    }

    public final String getSharedBetsMeta() {
        return this.sharedBetsMeta;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(this.text.hashCode() * 31, 31, this.chatRoomId), 31, this.msgType);
        String str = this.sharedBetsMeta;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.text;
        String str2 = this.chatRoomId;
        return kwi.a(ux5.a("SendMessageData(text=", str, ", chatRoomId=", str2, ", msgType="), this.msgType, ", sharedBetsMeta=", this.sharedBetsMeta, vZBMKENANSz.KwflhJXTRNCjvf);
    }

    public /* synthetic */ SendMessageData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4);
    }
}
