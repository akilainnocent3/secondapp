package com.sportygames.lobby.remote.models;

import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/sportygames/lobby/remote/models/AddFavouriteRequest;", "", "gameId", "", "<init>", "(Ljava/lang/String;)V", "getGameId", "()Ljava/lang/String;", "setGameId", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddFavouriteRequest {
    public static final int $stable = 8;
    private String gameId;

    public /* synthetic */ AddFavouriteRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str);
    }

    public static /* synthetic */ AddFavouriteRequest copy$default(AddFavouriteRequest addFavouriteRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addFavouriteRequest.gameId;
        }
        return addFavouriteRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    public final AddFavouriteRequest copy(String gameId) {
        gameId.getClass();
        return new AddFavouriteRequest(gameId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AddFavouriteRequest) && Intrinsics.g(this.gameId, ((AddFavouriteRequest) other).gameId);
    }

    public final String getGameId() {
        return this.gameId;
    }

    public int hashCode() {
        return this.gameId.hashCode();
    }

    public final void setGameId(String str) {
        str.getClass();
        this.gameId = str;
    }

    public String toString() {
        return tug.a("AddFavouriteRequest(gameId=", this.gameId, ")");
    }

    public AddFavouriteRequest(String str) {
        str.getClass();
        this.gameId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddFavouriteRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
