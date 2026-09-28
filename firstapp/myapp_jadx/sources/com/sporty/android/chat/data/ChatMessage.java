package com.sporty.android.chat.data;

import com.appsflyer.internal.m;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.d5d;
import defpackage.eal;
import defpackage.f87;
import defpackage.fu5;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ml5;
import defpackage.mtg0;
import defpackage.uf80;
import defpackage.ux5;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001:\u00018Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010%\u001a\u00020\u0003J\b\u0010&\u001a\u0004\u0018\u00010'J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\u0011HÆ\u0003Jy\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0014\u00104\u001a\u00020\r2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00106\u001a\u00020\u0005HÖ\u0081\u0004J\n\u00107\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R%\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R%\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R%\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R%\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R%\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R%\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010 R%\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R%\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00069"}, d2 = {"Lcom/sporty/android/chat/data/ChatMessage;", "", "chatRoomId", "", "chatRoomType", "", "messageNo", "previousMessageNo", "postUserId", "jsonBody", "sharedBetsMeta", AnalyticsParam.EVENT_STATUS, "isIsolated", "", "createTime", "", "userInfo", "Lcom/sporty/android/chat/data/ChatMessage$UserInfo;", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZJLcom/sporty/android/chat/data/ChatMessage$UserInfo;)V", "getChatRoomId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getChatRoomType", "()I", "getMessageNo", "getPreviousMessageNo", "getPostUserId", "getJsonBody", "getSharedBetsMeta", "getStatus", "()Z", "getCreateTime", "()J", "getUserInfo", "()Lcom/sporty/android/chat/data/ChatMessage$UserInfo;", "getConversation", "getShareBetData", "Lcom/sporty/android/chat/data/LiveShareBetData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "UserInfo", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ChatMessage {

    @SerializedName("chatRoomId")
    private final String chatRoomId;

    @SerializedName("chatRoomType")
    private final int chatRoomType;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("isIsolated")
    private final boolean isIsolated;

    @SerializedName("jsonBody")
    private final String jsonBody;

    @SerializedName("messageNo")
    private final int messageNo;

    @SerializedName("postUserId")
    private final String postUserId;

    @SerializedName("previousMessageNo")
    private final int previousMessageNo;

    @SerializedName("sharedBetsMeta")
    private final String sharedBetsMeta;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    @SerializedName("userInfo")
    private final UserInfo userInfo;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/chat/data/ChatMessage$UserInfo;", "", "nickname", "", "avatar", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNickname", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getAvatar", "getCountry", "getHiddenName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class UserInfo {

        @SerializedName("avatar")
        private final String avatar;

        @SerializedName("country")
        private final String country;

        @SerializedName("nickname")
        private final String nickname;

        public UserInfo(String str, String str2, String str3) {
            m.a(str, str2, str3);
            this.nickname = str;
            this.avatar = str2;
            this.country = str3;
        }

        public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userInfo.nickname;
            }
            if ((i & 2) != 0) {
                str2 = userInfo.avatar;
            }
            if ((i & 4) != 0) {
                str3 = userInfo.country;
            }
            return userInfo.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getNickname() {
            return this.nickname;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAvatar() {
            return this.avatar;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        public final UserInfo copy(String nickname, String avatar, String country) {
            nickname.getClass();
            avatar.getClass();
            country.getClass();
            return new UserInfo(nickname, avatar, country);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserInfo)) {
                return false;
            }
            UserInfo userInfo = (UserInfo) other;
            return Intrinsics.g(this.nickname, userInfo.nickname) && Intrinsics.g(this.avatar, userInfo.avatar) && Intrinsics.g(this.country, userInfo.country);
        }

        public final String getAvatar() {
            return this.avatar;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getHiddenName() {
            if (this.nickname.length() == 0) {
                return "";
            }
            int length = this.nickname.length();
            String str = this.nickname;
            return length > 5 ? fu5.a("(?<=\\d{2})\\d(?=\\d{3})", str, "*") : str;
        }

        public final String getNickname() {
            return this.nickname;
        }

        public int hashCode() {
            return this.country.hashCode() + gmf0.a(this.nickname.hashCode() * 31, 31, this.avatar);
        }

        public String toString() {
            String str = this.nickname;
            String str2 = this.avatar;
            return uf80.a(ux5.a("UserInfo(nickname=", str, ", avatar=", str2, ", country="), this.country, ")");
        }
    }

    public ChatMessage(String str, int i, int i2, int i3, String str2, String str3, String str4, int i4, boolean z, long j, UserInfo userInfo) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        userInfo.getClass();
        this.chatRoomId = str;
        this.chatRoomType = i;
        this.messageNo = i2;
        this.previousMessageNo = i3;
        this.postUserId = str2;
        this.jsonBody = str3;
        this.sharedBetsMeta = str4;
        this.status = i4;
        this.isIsolated = z;
        this.createTime = j;
        this.userInfo = userInfo;
    }

    public static /* synthetic */ ChatMessage copy$default(ChatMessage chatMessage, String str, int i, int i2, int i3, String str2, String str3, String str4, int i4, boolean z, long j, UserInfo userInfo, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = chatMessage.chatRoomId;
        }
        if ((i5 & 2) != 0) {
            i = chatMessage.chatRoomType;
        }
        if ((i5 & 4) != 0) {
            i2 = chatMessage.messageNo;
        }
        if ((i5 & 8) != 0) {
            i3 = chatMessage.previousMessageNo;
        }
        if ((i5 & 16) != 0) {
            str2 = chatMessage.postUserId;
        }
        if ((i5 & 32) != 0) {
            str3 = chatMessage.jsonBody;
        }
        if ((i5 & 64) != 0) {
            str4 = chatMessage.sharedBetsMeta;
        }
        if ((i5 & 128) != 0) {
            i4 = chatMessage.status;
        }
        if ((i5 & 256) != 0) {
            z = chatMessage.isIsolated;
        }
        if ((i5 & 512) != 0) {
            j = chatMessage.createTime;
        }
        if ((i5 & 1024) != 0) {
            userInfo = chatMessage.userInfo;
        }
        UserInfo userInfo2 = userInfo;
        long j2 = j;
        int i6 = i4;
        boolean z2 = z;
        String str5 = str3;
        String str6 = str4;
        String str7 = str2;
        int i7 = i2;
        return chatMessage.copy(str, i, i7, i3, str7, str5, str6, i6, z2, j2, userInfo2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getChatRoomType() {
        return this.chatRoomType;
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
    public final String getPostUserId() {
        return this.postUserId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getJsonBody() {
        return this.jsonBody;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSharedBetsMeta() {
        return this.sharedBetsMeta;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsIsolated() {
        return this.isIsolated;
    }

    public final ChatMessage copy(String chatRoomId, int chatRoomType, int messageNo, int previousMessageNo, String postUserId, String jsonBody, String sharedBetsMeta, int status, boolean isIsolated, long createTime, UserInfo userInfo) {
        chatRoomId.getClass();
        postUserId.getClass();
        jsonBody.getClass();
        userInfo.getClass();
        return new ChatMessage(chatRoomId, chatRoomType, messageNo, previousMessageNo, postUserId, jsonBody, sharedBetsMeta, status, isIsolated, createTime, userInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatMessage)) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage) other;
        return Intrinsics.g(this.chatRoomId, chatMessage.chatRoomId) && this.chatRoomType == chatMessage.chatRoomType && this.messageNo == chatMessage.messageNo && this.previousMessageNo == chatMessage.previousMessageNo && Intrinsics.g(this.postUserId, chatMessage.postUserId) && Intrinsics.g(this.jsonBody, chatMessage.jsonBody) && Intrinsics.g(this.sharedBetsMeta, chatMessage.sharedBetsMeta) && this.status == chatMessage.status && this.isIsolated == chatMessage.isIsolated && this.createTime == chatMessage.createTime && Intrinsics.g(this.userInfo, chatMessage.userInfo);
    }

    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public final int getChatRoomType() {
        return this.chatRoomType;
    }

    public final String getConversation() {
        if (this.jsonBody.length() > 0) {
            try {
                String strOptString = new JSONObject(this.jsonBody).optString("text", "");
                strOptString.getClass();
                return strOptString;
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getJsonBody() {
        return this.jsonBody;
    }

    public final int getMessageNo() {
        return this.messageNo;
    }

    public final String getPostUserId() {
        return this.postUserId;
    }

    public final int getPreviousMessageNo() {
        return this.previousMessageNo;
    }

    public final LiveShareBetData getShareBetData() {
        String str = this.sharedBetsMeta;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return (LiveShareBetData) new eal().e(this.sharedBetsMeta, LiveShareBetData.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String getSharedBetsMeta() {
        return this.sharedBetsMeta;
    }

    public final int getStatus() {
        return this.status;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(gpp.a(this.previousMessageNo, gpp.a(this.messageNo, gpp.a(this.chatRoomType, this.chatRoomId.hashCode() * 31, 31), 31), 31), 31, this.postUserId), 31, this.jsonBody);
        String str = this.sharedBetsMeta;
        return this.userInfo.hashCode() + f87.a(mtg0.a(gpp.a(this.status, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.isIsolated), this.createTime, 31);
    }

    public final boolean isIsolated() {
        return this.isIsolated;
    }

    public String toString() {
        String str = this.chatRoomId;
        int i = this.chatRoomType;
        int i2 = this.messageNo;
        int i3 = this.previousMessageNo;
        String str2 = this.postUserId;
        String str3 = this.jsonBody;
        String str4 = this.sharedBetsMeta;
        int i4 = this.status;
        boolean z = this.isIsolated;
        long j = this.createTime;
        UserInfo userInfo = this.userInfo;
        StringBuilder sbA = ml5.a(i, "ChatMessage(chatRoomId=", str, ", chatRoomType=", ", messageNo=");
        d5d.a(sbA, i2, ", previousMessageNo=", i3, ", postUserId=");
        hxa.c(sbA, str2, ", jsonBody=", str3, ", sharedBetsMeta=");
        wxa.b(i4, str4, ", status=", ", isIsolated=", sbA);
        sbA.append(z);
        sbA.append(", createTime=");
        sbA.append(j);
        sbA.append(", userInfo=");
        sbA.append(userInfo);
        sbA.append(")");
        return sbA.toString();
    }
}
