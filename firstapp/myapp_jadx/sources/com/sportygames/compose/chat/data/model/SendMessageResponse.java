package com.sportygames.compose.chat.data.model;

import com.appsflyer.internal.m;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.j26;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/sportygames/compose/chat/data/model/SendMessageResponse;", "", "msgType", "", "userId", "messageNo", "", "previousMessageNo", "jsonBody", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getMsgType", "()Ljava/lang/String;", "getUserId", "getMessageNo", "()I", "getPreviousMessageNo", "getJsonBody", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "JsonBody", "compose-chat_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SendMessageResponse {
    public static final int $stable = 0;
    private final String jsonBody;
    private final int messageNo;
    private final String msgType;
    private final int previousMessageNo;
    private final String userId;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/sportygames/compose/chat/data/model/SendMessageResponse$JsonBody;", "", "chatRoomId", "", "chatRoomType", "messageNo", "previousMessageNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChatRoomId", "()Ljava/lang/String;", "getChatRoomType", "getMessageNo", "getPreviousMessageNo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "compose-chat_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JsonBody {
        public static final int $stable = 0;
        private final String chatRoomId;
        private final String chatRoomType;
        private final String messageNo;
        private final String previousMessageNo;

        public JsonBody(String str, String str2, String str3, String str4) {
            wd7.a(str, str2, str3, str4);
            this.chatRoomId = str;
            this.chatRoomType = str2;
            this.messageNo = str3;
            this.previousMessageNo = str4;
        }

        public static /* synthetic */ JsonBody copy$default(JsonBody jsonBody, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = jsonBody.chatRoomId;
            }
            if ((i & 2) != 0) {
                str2 = jsonBody.chatRoomType;
            }
            if ((i & 4) != 0) {
                str3 = jsonBody.messageNo;
            }
            if ((i & 8) != 0) {
                str4 = jsonBody.previousMessageNo;
            }
            return jsonBody.copy(str, str2, str3, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getChatRoomId() {
            return this.chatRoomId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChatRoomType() {
            return this.chatRoomType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMessageNo() {
            return this.messageNo;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPreviousMessageNo() {
            return this.previousMessageNo;
        }

        public final JsonBody copy(String chatRoomId, String chatRoomType, String messageNo, String previousMessageNo) {
            chatRoomId.getClass();
            chatRoomType.getClass();
            messageNo.getClass();
            previousMessageNo.getClass();
            return new JsonBody(chatRoomId, chatRoomType, messageNo, previousMessageNo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JsonBody)) {
                return false;
            }
            JsonBody jsonBody = (JsonBody) other;
            return Intrinsics.g(this.chatRoomId, jsonBody.chatRoomId) && Intrinsics.g(this.chatRoomType, jsonBody.chatRoomType) && Intrinsics.g(this.messageNo, jsonBody.messageNo) && Intrinsics.g(this.previousMessageNo, jsonBody.previousMessageNo);
        }

        public final String getChatRoomId() {
            return this.chatRoomId;
        }

        public final String getChatRoomType() {
            return this.chatRoomType;
        }

        public final String getMessageNo() {
            return this.messageNo;
        }

        public final String getPreviousMessageNo() {
            return this.previousMessageNo;
        }

        public int hashCode() {
            return this.previousMessageNo.hashCode() + gmf0.a(gmf0.a(this.chatRoomId.hashCode() * 31, 31, this.chatRoomType), 31, this.messageNo);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("JsonBody(chatRoomId=");
            sb.append(this.chatRoomId);
            sb.append(", chatRoomType=");
            sb.append(this.chatRoomType);
            sb.append(", messageNo=");
            sb.append(this.messageNo);
            sb.append(", previousMessageNo=");
            return j26.a(sb, this.previousMessageNo, ')');
        }
    }

    public SendMessageResponse(String str, String str2, int i, int i2, String str3) {
        m.a(str, str2, str3);
        this.msgType = str;
        this.userId = str2;
        this.messageNo = i;
        this.previousMessageNo = i2;
        this.jsonBody = str3;
    }

    public static /* synthetic */ SendMessageResponse copy$default(SendMessageResponse sendMessageResponse, String str, String str2, int i, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sendMessageResponse.msgType;
        }
        if ((i3 & 2) != 0) {
            str2 = sendMessageResponse.userId;
        }
        if ((i3 & 4) != 0) {
            i = sendMessageResponse.messageNo;
        }
        if ((i3 & 8) != 0) {
            i2 = sendMessageResponse.previousMessageNo;
        }
        if ((i3 & 16) != 0) {
            str3 = sendMessageResponse.jsonBody;
        }
        String str4 = str3;
        int i4 = i;
        return sendMessageResponse.copy(str, str2, i4, i2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMsgType() {
        return this.msgType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMessageNo() {
        return this.messageNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPreviousMessageNo() {
        return this.previousMessageNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getJsonBody() {
        return this.jsonBody;
    }

    public final SendMessageResponse copy(String msgType, String userId, int messageNo, int previousMessageNo, String jsonBody) {
        msgType.getClass();
        userId.getClass();
        jsonBody.getClass();
        return new SendMessageResponse(msgType, userId, messageNo, previousMessageNo, jsonBody);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendMessageResponse)) {
            return false;
        }
        SendMessageResponse sendMessageResponse = (SendMessageResponse) other;
        return Intrinsics.g(this.msgType, sendMessageResponse.msgType) && Intrinsics.g(this.userId, sendMessageResponse.userId) && this.messageNo == sendMessageResponse.messageNo && this.previousMessageNo == sendMessageResponse.previousMessageNo && Intrinsics.g(this.jsonBody, sendMessageResponse.jsonBody);
    }

    public final String getJsonBody() {
        return this.jsonBody;
    }

    public final int getMessageNo() {
        return this.messageNo;
    }

    public final String getMsgType() {
        return this.msgType;
    }

    public final int getPreviousMessageNo() {
        return this.previousMessageNo;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.jsonBody.hashCode() + gpp.a(this.previousMessageNo, gpp.a(this.messageNo, gmf0.a(this.msgType.hashCode() * 31, 31, this.userId), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SendMessageResponse(msgType=");
        sb.append(this.msgType);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", messageNo=");
        sb.append(this.messageNo);
        sb.append(", previousMessageNo=");
        sb.append(this.previousMessageNo);
        sb.append(", jsonBody=");
        return j26.a(sb, this.jsonBody, ')');
    }
}
