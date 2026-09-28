package com.sportygames.lobby.remote.models;

import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import defpackage.gmf0;
import defpackage.kwi;
import defpackage.ux5;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/sportygames/lobby/remote/models/UpdateFavouriteRequest;", "", "firstGameId", "", "secondGameId", "firstGamePosition", "secondGamePosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstGameId", "()Ljava/lang/String;", "setFirstGameId", "(Ljava/lang/String;)V", "getSecondGameId", "setSecondGameId", "getFirstGamePosition", "setFirstGamePosition", "getSecondGamePosition", "setSecondGamePosition", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpdateFavouriteRequest {
    public static final int $stable = 8;
    private String firstGameId;
    private String firstGamePosition;
    private String secondGameId;
    private String secondGamePosition;

    public /* synthetic */ UpdateFavouriteRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "0" : str3, (i & 8) != 0 ? "" : str4);
    }

    public static /* synthetic */ UpdateFavouriteRequest copy$default(UpdateFavouriteRequest updateFavouriteRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateFavouriteRequest.firstGameId;
        }
        if ((i & 2) != 0) {
            str2 = updateFavouriteRequest.secondGameId;
        }
        if ((i & 4) != 0) {
            str3 = updateFavouriteRequest.firstGamePosition;
        }
        if ((i & 8) != 0) {
            str4 = updateFavouriteRequest.secondGamePosition;
        }
        return updateFavouriteRequest.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstGameId() {
        return this.firstGameId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSecondGameId() {
        return this.secondGameId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirstGamePosition() {
        return this.firstGamePosition;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSecondGamePosition() {
        return this.secondGamePosition;
    }

    public final UpdateFavouriteRequest copy(String firstGameId, String secondGameId, String firstGamePosition, String secondGamePosition) {
        firstGameId.getClass();
        secondGameId.getClass();
        firstGamePosition.getClass();
        secondGamePosition.getClass();
        return new UpdateFavouriteRequest(firstGameId, secondGameId, firstGamePosition, secondGamePosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateFavouriteRequest)) {
            return false;
        }
        UpdateFavouriteRequest updateFavouriteRequest = (UpdateFavouriteRequest) other;
        return Intrinsics.g(this.firstGameId, updateFavouriteRequest.firstGameId) && Intrinsics.g(this.secondGameId, updateFavouriteRequest.secondGameId) && Intrinsics.g(this.firstGamePosition, updateFavouriteRequest.firstGamePosition) && Intrinsics.g(this.secondGamePosition, updateFavouriteRequest.secondGamePosition);
    }

    public final String getFirstGameId() {
        return this.firstGameId;
    }

    public final String getFirstGamePosition() {
        return this.firstGamePosition;
    }

    public final String getSecondGameId() {
        return this.secondGameId;
    }

    public final String getSecondGamePosition() {
        return this.secondGamePosition;
    }

    public int hashCode() {
        return this.secondGamePosition.hashCode() + gmf0.a(gmf0.a(this.firstGameId.hashCode() * 31, 31, this.secondGameId), 31, this.firstGamePosition);
    }

    public final void setFirstGameId(String str) {
        str.getClass();
        this.firstGameId = str;
    }

    public final void setFirstGamePosition(String str) {
        str.getClass();
        this.firstGamePosition = str;
    }

    public final void setSecondGameId(String str) {
        str.getClass();
        this.secondGameId = str;
    }

    public final void setSecondGamePosition(String str) {
        str.getClass();
        this.secondGamePosition = str;
    }

    public String toString() {
        String str = this.firstGameId;
        String str2 = this.secondGameId;
        return kwi.a(ux5.a("UpdateFavouriteRequest(firstGameId=", str, ", secondGameId=", str2, vZBMKENANSz.zMJ), this.firstGamePosition, ", secondGamePosition=", this.secondGamePosition, ")");
    }

    public UpdateFavouriteRequest(String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.firstGameId = str;
        this.secondGameId = str2;
        this.firstGamePosition = str3;
        this.secondGamePosition = str4;
    }

    public UpdateFavouriteRequest() {
        this(null, null, null, null, 15, null);
    }
}
