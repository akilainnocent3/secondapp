package com.sportygames.commons.chat.remote.models;

import com.appsflyer.internal.m;
import com.twilio.voice.EventKeys;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.mtg0;
import defpackage.uf80;
import defpackage.uts;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/sportygames/commons/chat/remote/models/ChatListResponse;", "", "chatRoomId", "", "messageNo", "userInfo", "Lcom/sportygames/commons/chat/remote/models/ChatListResponse$UserInfo;", "jsonBody", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sportygames/commons/chat/remote/models/ChatListResponse$UserInfo;Ljava/lang/String;)V", "getChatRoomId", "()Ljava/lang/String;", "getMessageNo", "getUserInfo", "()Lcom/sportygames/commons/chat/remote/models/ChatListResponse$UserInfo;", "getJsonBody", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "UserInfo", "JSONBody", "JSON", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChatListResponse {
    public static final int $stable = 0;
    private final String chatRoomId;
    private final String jsonBody;
    private final String messageNo;
    private final UserInfo userInfo;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/sportygames/commons/chat/remote/models/ChatListResponse$UserInfo;", "", "avatar", "", "nickname", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getNickname", "getCountry", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserInfo {
        public static final int $stable = 0;
        private final String avatar;
        private final String country;
        private final String nickname;

        public UserInfo(String str, String str2, String str3) {
            m.a(str, str2, str3);
            this.avatar = str;
            this.nickname = str2;
            this.country = str3;
        }

        public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userInfo.avatar;
            }
            if ((i & 2) != 0) {
                str2 = userInfo.nickname;
            }
            if ((i & 4) != 0) {
                str3 = userInfo.country;
            }
            return userInfo.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAvatar() {
            return this.avatar;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getNickname() {
            return this.nickname;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        public final UserInfo copy(String avatar, String nickname, String country) {
            avatar.getClass();
            nickname.getClass();
            country.getClass();
            return new UserInfo(avatar, nickname, country);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserInfo)) {
                return false;
            }
            UserInfo userInfo = (UserInfo) other;
            return Intrinsics.g(this.avatar, userInfo.avatar) && Intrinsics.g(this.nickname, userInfo.nickname) && Intrinsics.g(this.country, userInfo.country);
        }

        public final String getAvatar() {
            return this.avatar;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getNickname() {
            return this.nickname;
        }

        public int hashCode() {
            return this.country.hashCode() + gmf0.a(this.avatar.hashCode() * 31, 31, this.nickname);
        }

        public String toString() {
            String str = this.avatar;
            String str2 = this.nickname;
            return uf80.a(ux5.a("UserInfo(avatar=", str, ", nickname=", str2, ", country="), this.country, ")");
        }
    }

    public ChatListResponse(String str, String str2, UserInfo userInfo, String str3) {
        str.getClass();
        str2.getClass();
        userInfo.getClass();
        str3.getClass();
        this.chatRoomId = str;
        this.messageNo = str2;
        this.userInfo = userInfo;
        this.jsonBody = str3;
    }

    public static /* synthetic */ ChatListResponse copy$default(ChatListResponse chatListResponse, String str, String str2, UserInfo userInfo, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatListResponse.chatRoomId;
        }
        if ((i & 2) != 0) {
            str2 = chatListResponse.messageNo;
        }
        if ((i & 4) != 0) {
            userInfo = chatListResponse.userInfo;
        }
        if ((i & 8) != 0) {
            str3 = chatListResponse.jsonBody;
        }
        return chatListResponse.copy(str, str2, userInfo, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageNo() {
        return this.messageNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getJsonBody() {
        return this.jsonBody;
    }

    public final ChatListResponse copy(String chatRoomId, String messageNo, UserInfo userInfo, String jsonBody) {
        chatRoomId.getClass();
        messageNo.getClass();
        userInfo.getClass();
        jsonBody.getClass();
        return new ChatListResponse(chatRoomId, messageNo, userInfo, jsonBody);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatListResponse)) {
            return false;
        }
        ChatListResponse chatListResponse = (ChatListResponse) other;
        return Intrinsics.g(this.chatRoomId, chatListResponse.chatRoomId) && Intrinsics.g(this.messageNo, chatListResponse.messageNo) && Intrinsics.g(this.userInfo, chatListResponse.userInfo) && Intrinsics.g(this.jsonBody, chatListResponse.jsonBody);
    }

    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public final String getJsonBody() {
        return this.jsonBody;
    }

    public final String getMessageNo() {
        return this.messageNo;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        return this.jsonBody.hashCode() + ((this.userInfo.hashCode() + gmf0.a(this.chatRoomId.hashCode() * 31, 31, this.messageNo)) * 31);
    }

    public String toString() {
        String str = this.chatRoomId;
        String str2 = this.messageNo;
        UserInfo userInfo = this.userInfo;
        String str3 = this.jsonBody;
        StringBuilder sbA = ux5.a("ChatListResponse(chatRoomId=", str, ", messageNo=", str2, ", userInfo=");
        sbA.append(userInfo);
        sbA.append(", jsonBody=");
        sbA.append(str3);
        sbA.append(")");
        return sbA.toString();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006$"}, d2 = {"Lcom/sportygames/commons/chat/remote/models/ChatListResponse$JSONBody;", "", "jsonBody", "Lorg/json/JSONObject;", "userInfo", "json", "Lcom/sportygames/commons/chat/remote/models/ChatListResponse$JSON;", "IS_BOT", "", "text", "", "gif", "<init>", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/sportygames/commons/chat/remote/models/ChatListResponse$JSON;ZLjava/lang/String;Ljava/lang/String;)V", "getJsonBody", "()Lorg/json/JSONObject;", "getUserInfo", "getJson", "()Lcom/sportygames/commons/chat/remote/models/ChatListResponse$JSON;", "getIS_BOT", "()Z", "getText", "()Ljava/lang/String;", "getGif", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JSONBody {
        public static final int $stable = 8;
        private final boolean IS_BOT;
        private final String gif;
        private final JSON json;
        private final JSONObject jsonBody;
        private final String text;
        private final JSONObject userInfo;

        public JSONBody(JSONObject jSONObject, JSONObject jSONObject2, JSON json, boolean z, String str, String str2) {
            this.jsonBody = jSONObject;
            this.userInfo = jSONObject2;
            this.json = json;
            this.IS_BOT = z;
            this.text = str;
            this.gif = str2;
        }

        public static /* synthetic */ JSONBody copy$default(JSONBody jSONBody, JSONObject jSONObject, JSONObject jSONObject2, JSON json, boolean z, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = jSONBody.jsonBody;
            }
            if ((i & 2) != 0) {
                jSONObject2 = jSONBody.userInfo;
            }
            if ((i & 4) != 0) {
                json = jSONBody.json;
            }
            if ((i & 8) != 0) {
                z = jSONBody.IS_BOT;
            }
            if ((i & 16) != 0) {
                str = jSONBody.text;
            }
            if ((i & 32) != 0) {
                str2 = jSONBody.gif;
            }
            String str3 = str;
            String str4 = str2;
            return jSONBody.copy(jSONObject, jSONObject2, json, z, str3, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final JSONObject getJsonBody() {
            return this.jsonBody;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final JSONObject getUserInfo() {
            return this.userInfo;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final JSON getJson() {
            return this.json;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIS_BOT() {
            return this.IS_BOT;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getGif() {
            return this.gif;
        }

        public final JSONBody copy(JSONObject jsonBody, JSONObject userInfo, JSON json, boolean IS_BOT, String text, String gif) {
            return new JSONBody(jsonBody, userInfo, json, IS_BOT, text, gif);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JSONBody)) {
                return false;
            }
            JSONBody jSONBody = (JSONBody) other;
            return Intrinsics.g(this.jsonBody, jSONBody.jsonBody) && Intrinsics.g(this.userInfo, jSONBody.userInfo) && Intrinsics.g(this.json, jSONBody.json) && this.IS_BOT == jSONBody.IS_BOT && Intrinsics.g(this.text, jSONBody.text) && Intrinsics.g(this.gif, jSONBody.gif);
        }

        public final String getGif() {
            return this.gif;
        }

        public final boolean getIS_BOT() {
            return this.IS_BOT;
        }

        public final JSON getJson() {
            return this.json;
        }

        public final JSONObject getJsonBody() {
            return this.jsonBody;
        }

        public final String getText() {
            return this.text;
        }

        public final JSONObject getUserInfo() {
            return this.userInfo;
        }

        public int hashCode() {
            JSONObject jSONObject = this.jsonBody;
            int iHashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
            JSONObject jSONObject2 = this.userInfo;
            int iHashCode2 = (iHashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
            JSON json = this.json;
            int iA = mtg0.a((iHashCode2 + (json == null ? 0 : json.hashCode())) * 31, 31, this.IS_BOT);
            String str = this.text;
            int iHashCode3 = (iA + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.gif;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            JSONObject jSONObject = this.jsonBody;
            JSONObject jSONObject2 = this.userInfo;
            JSON json = this.json;
            boolean z = this.IS_BOT;
            String str = this.text;
            String str2 = this.gif;
            StringBuilder sb = new StringBuilder("JSONBody(jsonBody=");
            sb.append(jSONObject);
            sb.append(", userInfo=");
            sb.append(jSONObject2);
            sb.append(", json=");
            sb.append(json);
            sb.append(", IS_BOT=");
            sb.append(z);
            sb.append(", text=");
            return kwi.a(sb, str, ", gif=", str2, ")");
        }

        public /* synthetic */ JSONBody(JSONObject jSONObject, JSONObject jSONObject2, JSON json, boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(jSONObject, jSONObject2, json, (i & 8) != 0 ? false : z, str, str2);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u007f\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006,"}, d2 = {"Lcom/sportygames/commons/chat/remote/models/ChatListResponse$JSON;", "", "payoutAmount", "", "cashOutCoefficient", "stakeAmount", "IS_BOT", "", "nickName", "betId", "currency", EventKeys.ERROR_MESSAGE, "roundId", "avatarUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPayoutAmount", "()Ljava/lang/String;", "getCashOutCoefficient", "getStakeAmount", "getIS_BOT", "()Z", "getNickName", "getBetId", "getCurrency", "getMessage", "getRoundId", "getAvatarUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JSON {
        public static final int $stable = 0;
        private final boolean IS_BOT;
        private final String avatarUrl;
        private final String betId;
        private final String cashOutCoefficient;
        private final String currency;
        private final String message;
        private final String nickName;
        private final String payoutAmount;
        private final String roundId;
        private final String stakeAmount;

        public /* synthetic */ JSON(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? false : z, str4, str5, str6, str7, str8, str9);
        }

        public static /* synthetic */ JSON copy$default(JSON json, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
            if ((i & 1) != 0) {
                str = json.payoutAmount;
            }
            if ((i & 2) != 0) {
                str2 = json.cashOutCoefficient;
            }
            if ((i & 4) != 0) {
                str3 = json.stakeAmount;
            }
            if ((i & 8) != 0) {
                z = json.IS_BOT;
            }
            if ((i & 16) != 0) {
                str4 = json.nickName;
            }
            if ((i & 32) != 0) {
                str5 = json.betId;
            }
            if ((i & 64) != 0) {
                str6 = json.currency;
            }
            if ((i & 128) != 0) {
                str7 = json.message;
            }
            if ((i & 256) != 0) {
                str8 = json.roundId;
            }
            if ((i & 512) != 0) {
                str9 = json.avatarUrl;
            }
            String str10 = str8;
            String str11 = str9;
            String str12 = str6;
            String str13 = str7;
            String str14 = str4;
            String str15 = str5;
            return json.copy(str, str2, str3, z, str14, str15, str12, str13, str10, str11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPayoutAmount() {
            return this.payoutAmount;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCashOutCoefficient() {
            return this.cashOutCoefficient;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getStakeAmount() {
            return this.stakeAmount;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIS_BOT() {
            return this.IS_BOT;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getNickName() {
            return this.nickName;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getBetId() {
            return this.betId;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getRoundId() {
            return this.roundId;
        }

        public final JSON copy(String payoutAmount, String cashOutCoefficient, String stakeAmount, boolean IS_BOT, String nickName, String betId, String currency, String message, String roundId, String avatarUrl) {
            return new JSON(payoutAmount, cashOutCoefficient, stakeAmount, IS_BOT, nickName, betId, currency, message, roundId, avatarUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JSON)) {
                return false;
            }
            JSON json = (JSON) other;
            return Intrinsics.g(this.payoutAmount, json.payoutAmount) && Intrinsics.g(this.cashOutCoefficient, json.cashOutCoefficient) && Intrinsics.g(this.stakeAmount, json.stakeAmount) && this.IS_BOT == json.IS_BOT && Intrinsics.g(this.nickName, json.nickName) && Intrinsics.g(this.betId, json.betId) && Intrinsics.g(this.currency, json.currency) && Intrinsics.g(this.message, json.message) && Intrinsics.g(this.roundId, json.roundId) && Intrinsics.g(this.avatarUrl, json.avatarUrl);
        }

        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final String getBetId() {
            return this.betId;
        }

        public final String getCashOutCoefficient() {
            return this.cashOutCoefficient;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final boolean getIS_BOT() {
            return this.IS_BOT;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getNickName() {
            return this.nickName;
        }

        public final String getPayoutAmount() {
            return this.payoutAmount;
        }

        public final String getRoundId() {
            return this.roundId;
        }

        public final String getStakeAmount() {
            return this.stakeAmount;
        }

        public int hashCode() {
            String str = this.payoutAmount;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cashOutCoefficient;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.stakeAmount;
            int iA = mtg0.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.IS_BOT);
            String str4 = this.nickName;
            int iHashCode3 = (iA + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.betId;
            int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.currency;
            int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.message;
            int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.roundId;
            int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.avatarUrl;
            return iHashCode7 + (str9 != null ? str9.hashCode() : 0);
        }

        public String toString() {
            String str = this.payoutAmount;
            String str2 = this.cashOutCoefficient;
            String str3 = this.stakeAmount;
            boolean z = this.IS_BOT;
            String str4 = this.nickName;
            String str5 = this.betId;
            String str6 = this.currency;
            String str7 = this.message;
            String str8 = this.roundId;
            String str9 = this.avatarUrl;
            StringBuilder sbA = ux5.a("JSON(payoutAmount=", str, ", cashOutCoefficient=", str2, ", stakeAmount=");
            uts.b(str3, ", IS_BOT=", ", nickName=", sbA, z);
            hxa.c(sbA, str4, ", betId=", str5, ", currency=");
            hxa.c(sbA, str6, ", message=", str7, ", roundId=");
            return kwi.a(sbA, str8, ", avatarUrl=", str9, ")");
        }

        public JSON(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.payoutAmount = str;
            this.cashOutCoefficient = str2;
            this.stakeAmount = str3;
            this.IS_BOT = z;
            this.nickName = str4;
            this.betId = str5;
            this.currency = str6;
            this.message = str7;
            this.roundId = str8;
            this.avatarUrl = str9;
        }
    }
}
