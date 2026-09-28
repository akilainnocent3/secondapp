package com.sportygames.rush.model.response;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.ux5;
import defpackage.wd7;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/sportygames/rush/model/response/ChatRoomResponse;", "", "chatRoomId", "", "countryCode", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "botUserId", "currentRoomId", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getChatRoomId", "()Ljava/lang/String;", "getCountryCode", "getGameName", "getBotUserId", "getCurrentRoomId", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChatRoomResponse {
    public static final int $stable = 0;
    private final String botUserId;
    private final String chatRoomId;
    private final String countryCode;
    private final int currentRoomId;
    private final String gameName;

    public ChatRoomResponse(String str, String str2, String str3, String str4, int i) {
        wd7.a(str, str2, str3, str4);
        this.chatRoomId = str;
        this.countryCode = str2;
        this.gameName = str3;
        this.botUserId = str4;
        this.currentRoomId = i;
    }

    public static /* synthetic */ ChatRoomResponse copy$default(ChatRoomResponse chatRoomResponse, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatRoomResponse.chatRoomId;
        }
        if ((i2 & 2) != 0) {
            str2 = chatRoomResponse.countryCode;
        }
        if ((i2 & 4) != 0) {
            str3 = chatRoomResponse.gameName;
        }
        if ((i2 & 8) != 0) {
            str4 = chatRoomResponse.botUserId;
        }
        if ((i2 & 16) != 0) {
            i = chatRoomResponse.currentRoomId;
        }
        int i3 = i;
        String str5 = str3;
        return chatRoomResponse.copy(str, str2, str5, str4, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGameName() {
        return this.gameName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBotUserId() {
        return this.botUserId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCurrentRoomId() {
        return this.currentRoomId;
    }

    public final ChatRoomResponse copy(String chatRoomId, String countryCode, String gameName, String botUserId, int currentRoomId) {
        chatRoomId.getClass();
        countryCode.getClass();
        gameName.getClass();
        botUserId.getClass();
        return new ChatRoomResponse(chatRoomId, countryCode, gameName, botUserId, currentRoomId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatRoomResponse)) {
            return false;
        }
        ChatRoomResponse chatRoomResponse = (ChatRoomResponse) other;
        return Intrinsics.g(this.chatRoomId, chatRoomResponse.chatRoomId) && Intrinsics.g(this.countryCode, chatRoomResponse.countryCode) && Intrinsics.g(this.gameName, chatRoomResponse.gameName) && Intrinsics.g(this.botUserId, chatRoomResponse.botUserId) && this.currentRoomId == chatRoomResponse.currentRoomId;
    }

    public final String getBotUserId() {
        return this.botUserId;
    }

    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final int getCurrentRoomId() {
        return this.currentRoomId;
    }

    public final String getGameName() {
        return this.gameName;
    }

    public int hashCode() {
        return Integer.hashCode(this.currentRoomId) + gmf0.a(gmf0.a(gmf0.a(this.chatRoomId.hashCode() * 31, 31, this.countryCode), 31, this.gameName), 31, this.botUserId);
    }

    public String toString() {
        String str = this.chatRoomId;
        String str2 = this.countryCode;
        String str3 = this.gameName;
        String str4 = this.botUserId;
        int i = this.currentRoomId;
        StringBuilder sbA = ux5.a("ChatRoomResponse(chatRoomId=", str, ", countryCode=", str2, ", gameName=");
        hxa.c(sbA, str3, ", botUserId=", str4, ", currentRoomId=");
        return zk1.a(i, ")", sbA);
    }
}
