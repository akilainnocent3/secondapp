package com.sportygames.compose.lobbyv2.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f78;
import defpackage.mtg0;
import defpackage.pq6;
import defpackage.uts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010Jl\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020\u0003J\u0013\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0006\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012¨\u00068"}, d2 = {"Lcom/sportygames/compose/lobbyv2/models/LobbyV2ProviderDetailsModel;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_PARAM_ID, "", "name", "", "isInHouseProvider", "", "lightImageUrl", "darkImageUrl", "isVisible", "position", "totalGamesCount", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLightImageUrl", "getDarkImageUrl", "()Z", "setVisible", "(Z)V", "getPosition", "setPosition", "getTotalGamesCount", "setTotalGamesCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;)Lcom/sportygames/compose/lobbyv2/models/LobbyV2ProviderDetailsModel;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LobbyV2ProviderDetailsModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LobbyV2ProviderDetailsModel> CREATOR = new a();
    private final String darkImageUrl;
    private Integer id;
    private final Boolean isInHouseProvider;
    private boolean isVisible;
    private final String lightImageUrl;
    private String name;
    private Integer position;
    private Integer totalGamesCount;

    public static final class a implements Parcelable.Creator<LobbyV2ProviderDetailsModel> {
        @Override // android.os.Parcelable.Creator
        public final LobbyV2ProviderDetailsModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z = false;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new LobbyV2ProviderDetailsModel(numValueOf, string, boolValueOf, string2, string3, z, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final LobbyV2ProviderDetailsModel[] newArray(int i) {
            return new LobbyV2ProviderDetailsModel[i];
        }
    }

    public /* synthetic */ LobbyV2ProviderDetailsModel(Integer num, String str, Boolean bool, String str2, String str3, boolean z, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? 0 : num2, (i & 128) != 0 ? 0 : num3);
    }

    public static /* synthetic */ LobbyV2ProviderDetailsModel copy$default(LobbyV2ProviderDetailsModel lobbyV2ProviderDetailsModel, Integer num, String str, Boolean bool, String str2, String str3, boolean z, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = lobbyV2ProviderDetailsModel.id;
        }
        if ((i & 2) != 0) {
            str = lobbyV2ProviderDetailsModel.name;
        }
        if ((i & 4) != 0) {
            bool = lobbyV2ProviderDetailsModel.isInHouseProvider;
        }
        if ((i & 8) != 0) {
            str2 = lobbyV2ProviderDetailsModel.lightImageUrl;
        }
        if ((i & 16) != 0) {
            str3 = lobbyV2ProviderDetailsModel.darkImageUrl;
        }
        if ((i & 32) != 0) {
            z = lobbyV2ProviderDetailsModel.isVisible;
        }
        if ((i & 64) != 0) {
            num2 = lobbyV2ProviderDetailsModel.position;
        }
        if ((i & 128) != 0) {
            num3 = lobbyV2ProviderDetailsModel.totalGamesCount;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        String str4 = str3;
        boolean z2 = z;
        return lobbyV2ProviderDetailsModel.copy(num, str, bool, str2, str4, z2, num4, num5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsInHouseProvider() {
        return this.isInHouseProvider;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLightImageUrl() {
        return this.lightImageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDarkImageUrl() {
        return this.darkImageUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getTotalGamesCount() {
        return this.totalGamesCount;
    }

    public final LobbyV2ProviderDetailsModel copy(Integer id, String name, Boolean isInHouseProvider, String lightImageUrl, String darkImageUrl, boolean isVisible, Integer position, Integer totalGamesCount) {
        return new LobbyV2ProviderDetailsModel(id, name, isInHouseProvider, lightImageUrl, darkImageUrl, isVisible, position, totalGamesCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LobbyV2ProviderDetailsModel)) {
            return false;
        }
        LobbyV2ProviderDetailsModel lobbyV2ProviderDetailsModel = (LobbyV2ProviderDetailsModel) other;
        return Intrinsics.g(this.id, lobbyV2ProviderDetailsModel.id) && Intrinsics.g(this.name, lobbyV2ProviderDetailsModel.name) && Intrinsics.g(this.isInHouseProvider, lobbyV2ProviderDetailsModel.isInHouseProvider) && Intrinsics.g(this.lightImageUrl, lobbyV2ProviderDetailsModel.lightImageUrl) && Intrinsics.g(this.darkImageUrl, lobbyV2ProviderDetailsModel.darkImageUrl) && this.isVisible == lobbyV2ProviderDetailsModel.isVisible && Intrinsics.g(this.position, lobbyV2ProviderDetailsModel.position) && Intrinsics.g(this.totalGamesCount, lobbyV2ProviderDetailsModel.totalGamesCount);
    }

    public final String getDarkImageUrl() {
        return this.darkImageUrl;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getLightImageUrl() {
        return this.lightImageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final Integer getTotalGamesCount() {
        return this.totalGamesCount;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isInHouseProvider;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.lightImageUrl;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkImageUrl;
        int iA = mtg0.a((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isVisible);
        Integer num2 = this.position;
        int iHashCode5 = (iA + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalGamesCount;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final Boolean isInHouseProvider() {
        return this.isInHouseProvider;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPosition(Integer num) {
        this.position = num;
    }

    public final void setTotalGamesCount(Integer num) {
        this.totalGamesCount = num;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    public String toString() {
        Integer num = this.id;
        String str = this.name;
        Boolean bool = this.isInHouseProvider;
        String str2 = this.lightImageUrl;
        String str3 = this.darkImageUrl;
        boolean z = this.isVisible;
        Integer num2 = this.position;
        Integer num3 = this.totalGamesCount;
        StringBuilder sbA = pq6.a(num, "LobbyV2ProviderDetailsModel(id=", ", name=", str, ", isInHouseProvider=");
        sbA.append(bool);
        sbA.append(", lightImageUrl=");
        sbA.append(str2);
        sbA.append(", darkImageUrl=");
        uts.b(str3, ", isVisible=", ", position=", sbA, z);
        sbA.append(num2);
        sbA.append(", totalGamesCount=");
        sbA.append(num3);
        sbA.append(")");
        return sbA.toString();
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
        dest.writeString(this.name);
        Boolean bool = this.isInHouseProvider;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.lightImageUrl);
        dest.writeString(this.darkImageUrl);
        dest.writeInt(this.isVisible ? 1 : 0);
        Integer num2 = this.position;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num2);
        }
        Integer num3 = this.totalGamesCount;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num3);
        }
    }

    public LobbyV2ProviderDetailsModel(Integer num, String str, Boolean bool, String str2, String str3, boolean z, Integer num2, Integer num3) {
        this.id = num;
        this.name = str;
        this.isInHouseProvider = bool;
        this.lightImageUrl = str2;
        this.darkImageUrl = str3;
        this.isVisible = z;
        this.position = num2;
        this.totalGamesCount = num3;
    }

    public LobbyV2ProviderDetailsModel() {
        this(null, null, null, null, null, false, null, null, 255, null);
    }
}
