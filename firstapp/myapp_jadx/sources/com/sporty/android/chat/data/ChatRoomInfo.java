package com.sporty.android.chat.data;

import com.appsflyer.internal.b0;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.pr0;
import defpackage.qn4;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003Jw\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\u0014\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00101\u001a\u00020\bHÖ\u0081\u0004J\n\u00102\u001a\u00020\u0005HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR%\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R%\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R%\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R%\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R%\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R%\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R%\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017¨\u00063"}, d2 = {"Lcom/sporty/android/chat/data/ChatRoomInfo;", "", AnalyticsParam.EVENT_PARAM_ID, "", "chatRoomId", "", "chatRoomType", "lastMessageNo", "", "createTime", "updateTime", "creatorUserId", "name", "avatarUrl", "bizUserId", "refId", "<init>", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "Lcom/google/gson/annotations/SerializedName;", "value", "getChatRoomId", "()Ljava/lang/String;", "getChatRoomType", "getLastMessageNo", "()I", "getCreateTime", "getUpdateTime", "getCreatorUserId", "getName", "getAvatarUrl", "getBizUserId", "getRefId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ChatRoomInfo {

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName("bizUserId")
    private final String bizUserId;

    @SerializedName("chatRoomId")
    private final String chatRoomId;

    @SerializedName("chatRoomType")
    private final String chatRoomType;

    @SerializedName("createTime")
    private final String createTime;

    @SerializedName("creatorUserId")
    private final String creatorUserId;

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final long id;

    @SerializedName("lastMessageNo")
    private final int lastMessageNo;

    @SerializedName("name")
    private final String name;

    @SerializedName("refId")
    private final String refId;

    @SerializedName("updateTime")
    private final String updateTime;

    public ChatRoomInfo(long j, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        qn4.b(str, str2, str3, str4, str5);
        wd7.a(str6, str7, str8, str9);
        this.id = j;
        this.chatRoomId = str;
        this.chatRoomType = str2;
        this.lastMessageNo = i;
        this.createTime = str3;
        this.updateTime = str4;
        this.creatorUserId = str5;
        this.name = str6;
        this.avatarUrl = str7;
        this.bizUserId = str8;
        this.refId = str9;
    }

    public static /* synthetic */ ChatRoomInfo copy$default(ChatRoomInfo chatRoomInfo, long j, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = chatRoomInfo.id;
        }
        return chatRoomInfo.copy(j, (i2 & 2) != 0 ? chatRoomInfo.chatRoomId : str, (i2 & 4) != 0 ? chatRoomInfo.chatRoomType : str2, (i2 & 8) != 0 ? chatRoomInfo.lastMessageNo : i, (i2 & 16) != 0 ? chatRoomInfo.createTime : str3, (i2 & 32) != 0 ? chatRoomInfo.updateTime : str4, (i2 & 64) != 0 ? chatRoomInfo.creatorUserId : str5, (i2 & 128) != 0 ? chatRoomInfo.name : str6, (i2 & 256) != 0 ? chatRoomInfo.avatarUrl : str7, (i2 & 512) != 0 ? chatRoomInfo.bizUserId : str8, (i2 & 1024) != 0 ? chatRoomInfo.refId : str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBizUserId() {
        return this.bizUserId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRefId() {
        return this.refId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChatRoomType() {
        return this.chatRoomType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLastMessageNo() {
        return this.lastMessageNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCreatorUserId() {
        return this.creatorUserId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final ChatRoomInfo copy(long id, String chatRoomId, String chatRoomType, int lastMessageNo, String createTime, String updateTime, String creatorUserId, String name, String avatarUrl, String bizUserId, String refId) {
        qn4.b(chatRoomId, chatRoomType, createTime, updateTime, creatorUserId);
        name.getClass();
        avatarUrl.getClass();
        bizUserId.getClass();
        refId.getClass();
        return new ChatRoomInfo(id, chatRoomId, chatRoomType, lastMessageNo, createTime, updateTime, creatorUserId, name, avatarUrl, bizUserId, refId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatRoomInfo)) {
            return false;
        }
        ChatRoomInfo chatRoomInfo = (ChatRoomInfo) other;
        return this.id == chatRoomInfo.id && Intrinsics.g(this.chatRoomId, chatRoomInfo.chatRoomId) && Intrinsics.g(this.chatRoomType, chatRoomInfo.chatRoomType) && this.lastMessageNo == chatRoomInfo.lastMessageNo && Intrinsics.g(this.createTime, chatRoomInfo.createTime) && Intrinsics.g(this.updateTime, chatRoomInfo.updateTime) && Intrinsics.g(this.creatorUserId, chatRoomInfo.creatorUserId) && Intrinsics.g(this.name, chatRoomInfo.name) && Intrinsics.g(this.avatarUrl, chatRoomInfo.avatarUrl) && Intrinsics.g(this.bizUserId, chatRoomInfo.bizUserId) && Intrinsics.g(this.refId, chatRoomInfo.refId);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBizUserId() {
        return this.bizUserId;
    }

    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public final String getChatRoomType() {
        return this.chatRoomType;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getCreatorUserId() {
        return this.creatorUserId;
    }

    public final long getId() {
        return this.id;
    }

    public final int getLastMessageNo() {
        return this.lastMessageNo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return this.refId.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gpp.a(this.lastMessageNo, gmf0.a(gmf0.a(Long.hashCode(this.id) * 31, 31, this.chatRoomId), 31, this.chatRoomType), 31), 31, this.createTime), 31, this.updateTime), 31, this.creatorUserId), 31, this.name), 31, this.avatarUrl), 31, this.bizUserId);
    }

    public String toString() {
        long j = this.id;
        String str = this.chatRoomId;
        String str2 = this.chatRoomType;
        int i = this.lastMessageNo;
        String str3 = this.createTime;
        String str4 = this.updateTime;
        String str5 = this.creatorUserId;
        String str6 = this.name;
        String str7 = this.avatarUrl;
        String str8 = this.bizUserId;
        String str9 = this.refId;
        StringBuilder sbA = b0.a(j, "ChatRoomInfo(id=", ", chatRoomId=", str);
        sbA.append(", chatRoomType=");
        sbA.append(str2);
        sbA.append(", lastMessageNo=");
        sbA.append(i);
        hxa.c(sbA, ", createTime=", str3, ", updateTime=", str4);
        hxa.c(sbA, ", creatorUserId=", str5, ", name=", str6);
        hxa.c(sbA, ", avatarUrl=", str7, ", bizUserId=", str8);
        return pr0.a(sbA, ", refId=", str9, ")");
    }
}
