package com.sportygames.evenodd.remote.models;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import defpackage.gmf0;
import defpackage.kwi;
import defpackage.ux5;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/sportygames/evenodd/remote/models/ChatRoomResponse;", "", "chatRoomId", "", "countryCode", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "botUserId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChatRoomId", "()Ljava/lang/String;", "getCountryCode", "getGameName", "getBotUserId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChatRoomResponse {
    public static final int $stable = 0;
    private final String botUserId;
    private final String chatRoomId;
    private final String countryCode;
    private final String gameName;

    public ChatRoomResponse(String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.chatRoomId = str;
        this.countryCode = str2;
        this.gameName = str3;
        this.botUserId = str4;
    }

    public static /* synthetic */ ChatRoomResponse copy$default(ChatRoomResponse chatRoomResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatRoomResponse.chatRoomId;
        }
        if ((i & 2) != 0) {
            str2 = chatRoomResponse.countryCode;
        }
        if ((i & 4) != 0) {
            str3 = chatRoomResponse.gameName;
        }
        if ((i & 8) != 0) {
            str4 = chatRoomResponse.botUserId;
        }
        return chatRoomResponse.copy(str, str2, str3, str4);
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

    public final ChatRoomResponse copy(String chatRoomId, String countryCode, String gameName, String botUserId) {
        chatRoomId.getClass();
        countryCode.getClass();
        gameName.getClass();
        botUserId.getClass();
        return new ChatRoomResponse(chatRoomId, countryCode, gameName, botUserId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatRoomResponse)) {
            return false;
        }
        ChatRoomResponse chatRoomResponse = (ChatRoomResponse) other;
        return Intrinsics.g(this.chatRoomId, chatRoomResponse.chatRoomId) && Intrinsics.g(this.countryCode, chatRoomResponse.countryCode) && Intrinsics.g(this.gameName, chatRoomResponse.gameName) && Intrinsics.g(this.botUserId, chatRoomResponse.botUserId);
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

    public final String getGameName() {
        return this.gameName;
    }

    public int hashCode() {
        return this.botUserId.hashCode() + gmf0.a(gmf0.a(this.chatRoomId.hashCode() * 31, 31, this.countryCode), 31, this.gameName);
    }

    public String toString() {
        String str = this.chatRoomId;
        String str2 = this.countryCode;
        return kwi.a(ux5.a("ChatRoomResponse(chatRoomId=", str, ", countryCode=", str2, ", gameName="), this.gameName, ", botUserId=", this.botUserId, ")");
    }
}
