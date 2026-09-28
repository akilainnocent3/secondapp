package com.sportygames.pocketrocket.model.response;

import defpackage.uf80;
import defpackage.uqe0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/ActiveRoomResponse;", "", "currentRoomId", "", "chatRoomId", "", "botUserId", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getCurrentRoomId", "()I", "getChatRoomId", "()Ljava/lang/String;", "getBotUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActiveRoomResponse {
    public static final int $stable = 0;
    private final String botUserId;
    private final String chatRoomId;
    private final int currentRoomId;

    public ActiveRoomResponse(int i, String str, String str2) {
        this.currentRoomId = i;
        this.chatRoomId = str;
        this.botUserId = str2;
    }

    public static /* synthetic */ ActiveRoomResponse copy$default(ActiveRoomResponse activeRoomResponse, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = activeRoomResponse.currentRoomId;
        }
        if ((i2 & 2) != 0) {
            str = activeRoomResponse.chatRoomId;
        }
        if ((i2 & 4) != 0) {
            str2 = activeRoomResponse.botUserId;
        }
        return activeRoomResponse.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentRoomId() {
        return this.currentRoomId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBotUserId() {
        return this.botUserId;
    }

    public final ActiveRoomResponse copy(int currentRoomId, String chatRoomId, String botUserId) {
        return new ActiveRoomResponse(currentRoomId, chatRoomId, botUserId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveRoomResponse)) {
            return false;
        }
        ActiveRoomResponse activeRoomResponse = (ActiveRoomResponse) other;
        return this.currentRoomId == activeRoomResponse.currentRoomId && Intrinsics.g(this.chatRoomId, activeRoomResponse.chatRoomId) && Intrinsics.g(this.botUserId, activeRoomResponse.botUserId);
    }

    public final String getBotUserId() {
        return this.botUserId;
    }

    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public final int getCurrentRoomId() {
        return this.currentRoomId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.currentRoomId) * 31;
        String str = this.chatRoomId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.botUserId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = this.currentRoomId;
        String str = this.chatRoomId;
        return uf80.a(uqe0.a(i, "ActiveRoomResponse(currentRoomId=", ", chatRoomId=", str, ", botUserId="), this.botUserId, ")");
    }
}
