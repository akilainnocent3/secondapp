package com.sportygames.compose.lobbyv2.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f78;
import defpackage.hxa;
import defpackage.pq6;
import defpackage.uf80;
import defpackage.xbp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÂ\u0003JJ\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0003J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/sportygames/compose/lobbyv2/models/LobbyV2AddFavouritesResponse;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_PARAM_ID, "", "createdAt", "", "updatedAt", "gameId", "favPosition", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getGameId", "()Ljava/lang/String;", "setGameId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sportygames/compose/lobbyv2/models/LobbyV2AddFavouritesResponse;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LobbyV2AddFavouritesResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LobbyV2AddFavouritesResponse> CREATOR = new a();
    private final String createdAt;
    private final String favPosition;
    private String gameId;
    private Integer id;
    private final String updatedAt;

    public static final class a implements Parcelable.Creator<LobbyV2AddFavouritesResponse> {
        @Override // android.os.Parcelable.Creator
        public final LobbyV2AddFavouritesResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LobbyV2AddFavouritesResponse(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LobbyV2AddFavouritesResponse[] newArray(int i) {
            return new LobbyV2AddFavouritesResponse[i];
        }
    }

    public /* synthetic */ LobbyV2AddFavouritesResponse(Integer num, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getFavPosition() {
        return this.favPosition;
    }

    public static /* synthetic */ LobbyV2AddFavouritesResponse copy$default(LobbyV2AddFavouritesResponse lobbyV2AddFavouritesResponse, Integer num, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = lobbyV2AddFavouritesResponse.id;
        }
        if ((i & 2) != 0) {
            str = lobbyV2AddFavouritesResponse.createdAt;
        }
        if ((i & 4) != 0) {
            str2 = lobbyV2AddFavouritesResponse.updatedAt;
        }
        if ((i & 8) != 0) {
            str3 = lobbyV2AddFavouritesResponse.gameId;
        }
        if ((i & 16) != 0) {
            str4 = lobbyV2AddFavouritesResponse.favPosition;
        }
        String str5 = str4;
        String str6 = str2;
        return lobbyV2AddFavouritesResponse.copy(num, str, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    public final LobbyV2AddFavouritesResponse copy(@xbp(name = AnalyticsParam.EVENT_PARAM_ID) Integer id, @xbp(name = "createdAt") String createdAt, @xbp(name = "updatedAt") String updatedAt, @xbp(name = "gameId") String gameId, @xbp(name = "favPosition") String favPosition) {
        return new LobbyV2AddFavouritesResponse(id, createdAt, updatedAt, gameId, favPosition);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LobbyV2AddFavouritesResponse)) {
            return false;
        }
        LobbyV2AddFavouritesResponse lobbyV2AddFavouritesResponse = (LobbyV2AddFavouritesResponse) other;
        return Intrinsics.g(this.id, lobbyV2AddFavouritesResponse.id) && Intrinsics.g(this.createdAt, lobbyV2AddFavouritesResponse.createdAt) && Intrinsics.g(this.updatedAt, lobbyV2AddFavouritesResponse.updatedAt) && Intrinsics.g(this.gameId, lobbyV2AddFavouritesResponse.gameId) && Intrinsics.g(this.favPosition, lobbyV2AddFavouritesResponse.favPosition);
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final Integer getId() {
        return this.id;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.createdAt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gameId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.favPosition;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setGameId(String str) {
        this.gameId = str;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public String toString() {
        Integer num = this.id;
        String str = this.createdAt;
        String str2 = this.updatedAt;
        String str3 = this.gameId;
        String str4 = this.favPosition;
        StringBuilder sbA = pq6.a(num, "LobbyV2AddFavouritesResponse(id=", ", createdAt=", str, ", updatedAt=");
        hxa.c(sbA, str2, ", gameId=", str3, ", favPosition=");
        return uf80.a(sbA, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num);
        }
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeString(this.gameId);
        dest.writeString(this.favPosition);
    }

    public LobbyV2AddFavouritesResponse(@xbp(name = AnalyticsParam.EVENT_PARAM_ID) Integer num, @xbp(name = "createdAt") String str, @xbp(name = "updatedAt") String str2, @xbp(name = "gameId") String str3, @xbp(name = "favPosition") String str4) {
        this.id = num;
        this.createdAt = str;
        this.updatedAt = str2;
        this.gameId = str3;
        this.favPosition = str4;
    }

    public LobbyV2AddFavouritesResponse() {
        this(null, null, null, null, null, 31, null);
    }
}
