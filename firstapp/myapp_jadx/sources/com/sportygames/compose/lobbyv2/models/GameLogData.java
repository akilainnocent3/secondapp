package com.sportygames.compose.lobbyv2.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hxa;
import defpackage.ux5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\bJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/sportygames/compose/lobbyv2/models/GameLogData;", "Landroid/os/Parcelable;", "entrance", "", "sectionKey", "sectionName", "providerName", "gameIndex", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getEntrance", "()Ljava/lang/String;", "getSectionKey", "getSectionName", "getProviderName", "getGameIndex", "()I", "setGameIndex", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GameLogData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GameLogData> CREATOR = new a();
    private final String entrance;
    private int gameIndex;
    private final String providerName;
    private final String sectionKey;
    private final String sectionName;

    public static final class a implements Parcelable.Creator<GameLogData> {
        @Override // android.os.Parcelable.Creator
        public final GameLogData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new GameLogData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final GameLogData[] newArray(int i) {
            return new GameLogData[i];
        }
    }

    public /* synthetic */ GameLogData(String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, i);
    }

    public static /* synthetic */ GameLogData copy$default(GameLogData gameLogData, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gameLogData.entrance;
        }
        if ((i2 & 2) != 0) {
            str2 = gameLogData.sectionKey;
        }
        if ((i2 & 4) != 0) {
            str3 = gameLogData.sectionName;
        }
        if ((i2 & 8) != 0) {
            str4 = gameLogData.providerName;
        }
        if ((i2 & 16) != 0) {
            i = gameLogData.gameIndex;
        }
        int i3 = i;
        String str5 = str3;
        return gameLogData.copy(str, str2, str5, str4, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEntrance() {
        return this.entrance;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSectionKey() {
        return this.sectionKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSectionName() {
        return this.sectionName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProviderName() {
        return this.providerName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getGameIndex() {
        return this.gameIndex;
    }

    public final GameLogData copy(String entrance, String sectionKey, String sectionName, String providerName, int gameIndex) {
        entrance.getClass();
        return new GameLogData(entrance, sectionKey, sectionName, providerName, gameIndex);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameLogData)) {
            return false;
        }
        GameLogData gameLogData = (GameLogData) other;
        return Intrinsics.g(this.entrance, gameLogData.entrance) && Intrinsics.g(this.sectionKey, gameLogData.sectionKey) && Intrinsics.g(this.sectionName, gameLogData.sectionName) && Intrinsics.g(this.providerName, gameLogData.providerName) && this.gameIndex == gameLogData.gameIndex;
    }

    public final String getEntrance() {
        return this.entrance;
    }

    public final int getGameIndex() {
        return this.gameIndex;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final String getSectionKey() {
        return this.sectionKey;
    }

    public final String getSectionName() {
        return this.sectionName;
    }

    public int hashCode() {
        int iHashCode = this.entrance.hashCode() * 31;
        String str = this.sectionKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sectionName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.providerName;
        return Integer.hashCode(this.gameIndex) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final void setGameIndex(int i) {
        this.gameIndex = i;
    }

    public String toString() {
        String str = this.entrance;
        String str2 = this.sectionKey;
        String str3 = this.sectionName;
        String str4 = this.providerName;
        int i = this.gameIndex;
        StringBuilder sbA = ux5.a("GameLogData(entrance=", str, ", sectionKey=", str2, ", sectionName=");
        hxa.c(sbA, str3, ", providerName=", str4, ", gameIndex=");
        return zk1.a(i, ")", sbA);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.entrance);
        dest.writeString(this.sectionKey);
        dest.writeString(this.sectionName);
        dest.writeString(this.providerName);
        dest.writeInt(this.gameIndex);
    }

    public GameLogData(String str, String str2, String str3, String str4, int i) {
        str.getClass();
        this.entrance = str;
        this.sectionKey = str2;
        this.sectionName = str3;
        this.providerName = str4;
        this.gameIndex = i;
    }
}
