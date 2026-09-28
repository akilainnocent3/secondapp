package com.sportygames.sportyherov2.remote.models;

import defpackage.gmf0;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sportygames/sportyherov2/remote/models/UserInfoResponseSocket;", "", "bet", "Lcom/sportygames/sportyherov2/remote/models/TopBets;", "messageType", "", "timeStamp", "<init>", "(Lcom/sportygames/sportyherov2/remote/models/TopBets;Ljava/lang/String;Ljava/lang/String;)V", "getBet", "()Lcom/sportygames/sportyherov2/remote/models/TopBets;", "getMessageType", "()Ljava/lang/String;", "getTimeStamp", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserInfoResponseSocket {
    public static final int $stable = 0;
    private final TopBets bet;
    private final String messageType;
    private final String timeStamp;

    public UserInfoResponseSocket(TopBets topBets, String str, String str2) {
        topBets.getClass();
        str.getClass();
        str2.getClass();
        this.bet = topBets;
        this.messageType = str;
        this.timeStamp = str2;
    }

    public static /* synthetic */ UserInfoResponseSocket copy$default(UserInfoResponseSocket userInfoResponseSocket, TopBets topBets, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            topBets = userInfoResponseSocket.bet;
        }
        if ((i & 2) != 0) {
            str = userInfoResponseSocket.messageType;
        }
        if ((i & 4) != 0) {
            str2 = userInfoResponseSocket.timeStamp;
        }
        return userInfoResponseSocket.copy(topBets, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TopBets getBet() {
        return this.bet;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public final UserInfoResponseSocket copy(TopBets bet, String messageType, String timeStamp) {
        bet.getClass();
        messageType.getClass();
        timeStamp.getClass();
        return new UserInfoResponseSocket(bet, messageType, timeStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoResponseSocket)) {
            return false;
        }
        UserInfoResponseSocket userInfoResponseSocket = (UserInfoResponseSocket) other;
        return Intrinsics.g(this.bet, userInfoResponseSocket.bet) && Intrinsics.g(this.messageType, userInfoResponseSocket.messageType) && Intrinsics.g(this.timeStamp, userInfoResponseSocket.timeStamp);
    }

    public final TopBets getBet() {
        return this.bet;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return this.timeStamp.hashCode() + gmf0.a(this.bet.hashCode() * 31, 31, this.messageType);
    }

    public String toString() {
        TopBets topBets = this.bet;
        String str = this.messageType;
        String str2 = this.timeStamp;
        StringBuilder sb = new StringBuilder("UserInfoResponseSocket(bet=");
        sb.append(topBets);
        sb.append(", messageType=");
        sb.append(str);
        sb.append(", timeStamp=");
        return uf80.a(sb, str2, ")");
    }
}
