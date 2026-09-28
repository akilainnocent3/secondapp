package com.sportygames.compose.lobbyv2.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.p200;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0006J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/sportygames/compose/lobbyv2/models/LobbyV2ProviderGamesResponseModel;", "Landroid/os/Parcelable;", "data", "", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2GameDetailsModel;", "total", "", "<init>", "(Ljava/util/List;I)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getTotal", "()I", "setTotal", "(I)V", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LobbyV2ProviderGamesResponseModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LobbyV2ProviderGamesResponseModel> CREATOR = new a();
    private List<LobbyV2GameDetailsModel> data;
    private int total;

    public static final class a implements Parcelable.Creator<LobbyV2ProviderGamesResponseModel> {
        @Override // android.os.Parcelable.Creator
        public final LobbyV2ProviderGamesResponseModel createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = p200.a(LobbyV2GameDetailsModel.CREATOR, parcel, arrayList, iA, 1);
            }
            return new LobbyV2ProviderGamesResponseModel(arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LobbyV2ProviderGamesResponseModel[] newArray(int i) {
            return new LobbyV2ProviderGamesResponseModel[i];
        }
    }

    public /* synthetic */ LobbyV2ProviderGamesResponseModel(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : list, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LobbyV2ProviderGamesResponseModel copy$default(LobbyV2ProviderGamesResponseModel lobbyV2ProviderGamesResponseModel, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = lobbyV2ProviderGamesResponseModel.data;
        }
        if ((i2 & 2) != 0) {
            i = lobbyV2ProviderGamesResponseModel.total;
        }
        return lobbyV2ProviderGamesResponseModel.copy(list, i);
    }

    public final List<LobbyV2GameDetailsModel> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final LobbyV2ProviderGamesResponseModel copy(List<LobbyV2GameDetailsModel> data, int total) {
        data.getClass();
        return new LobbyV2ProviderGamesResponseModel(data, total);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LobbyV2ProviderGamesResponseModel)) {
            return false;
        }
        LobbyV2ProviderGamesResponseModel lobbyV2ProviderGamesResponseModel = (LobbyV2ProviderGamesResponseModel) other;
        return Intrinsics.g(this.data, lobbyV2ProviderGamesResponseModel.data) && this.total == lobbyV2ProviderGamesResponseModel.total;
    }

    public final List<LobbyV2GameDetailsModel> getData() {
        return this.data;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return Integer.hashCode(this.total) + (this.data.hashCode() * 31);
    }

    public final void setData(List<LobbyV2GameDetailsModel> list) {
        list.getClass();
        this.data = list;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    public String toString() {
        return "LobbyV2ProviderGamesResponseModel(data=" + this.data + ", total=" + this.total + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        List<LobbyV2GameDetailsModel> list = this.data;
        dest.writeInt(list.size());
        Iterator<LobbyV2GameDetailsModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.total);
    }

    public LobbyV2ProviderGamesResponseModel(List<LobbyV2GameDetailsModel> list, int i) {
        list.getClass();
        this.data = list;
        this.total = i;
    }
}
