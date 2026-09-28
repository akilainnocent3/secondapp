package com.sportygames.compose.lobbyv2.models;

import android.os.Parcel;
import android.os.Parcelable;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import defpackage.p200;
import defpackage.w9d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/sportygames/compose/lobbyv2/models/LobbyV2GamesListUIStateModel;", "Landroid/os/Parcelable;", "home", "", "", "others", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2GameDetailsModel;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getHome", "()Ljava/util/List;", "getOthers", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LobbyV2GamesListUIStateModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LobbyV2GamesListUIStateModel> CREATOR = new a();
    private final List<String> home;
    private final List<LobbyV2GameDetailsModel> others;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements Parcelable.Creator<LobbyV2GamesListUIStateModel> {
        @Override // android.os.Parcelable.Creator
        public final LobbyV2GamesListUIStateModel createFromParcel(Parcel parcel) {
            parcel.getClass();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = p200.a(LobbyV2GameDetailsModel.CREATOR, parcel, arrayList, iA, 1);
            }
            return new LobbyV2GamesListUIStateModel(arrayListCreateStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final LobbyV2GamesListUIStateModel[] newArray(int i) {
            return new LobbyV2GamesListUIStateModel[i];
        }
    }

    public LobbyV2GamesListUIStateModel(List<String> list, List<LobbyV2GameDetailsModel> list2) {
        list.getClass();
        list2.getClass();
        this.home = list;
        this.others = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LobbyV2GamesListUIStateModel copy$default(LobbyV2GamesListUIStateModel lobbyV2GamesListUIStateModel, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lobbyV2GamesListUIStateModel.home;
        }
        if ((i & 2) != 0) {
            list2 = lobbyV2GamesListUIStateModel.others;
        }
        return lobbyV2GamesListUIStateModel.copy(list, list2);
    }

    public final List<String> component1() {
        return this.home;
    }

    public final List<LobbyV2GameDetailsModel> component2() {
        return this.others;
    }

    public final LobbyV2GamesListUIStateModel copy(List<String> home, List<LobbyV2GameDetailsModel> others) {
        home.getClass();
        others.getClass();
        return new LobbyV2GamesListUIStateModel(home, others);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LobbyV2GamesListUIStateModel)) {
            return false;
        }
        LobbyV2GamesListUIStateModel lobbyV2GamesListUIStateModel = (LobbyV2GamesListUIStateModel) other;
        return Intrinsics.g(this.home, lobbyV2GamesListUIStateModel.home) && Intrinsics.g(this.others, lobbyV2GamesListUIStateModel.others);
    }

    public final List<String> getHome() {
        return this.home;
    }

    public final List<LobbyV2GameDetailsModel> getOthers() {
        return this.others;
    }

    public int hashCode() {
        return this.others.hashCode() + (this.home.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeStringList(this.home);
        List<LobbyV2GameDetailsModel> list = this.others;
        dest.writeInt(list.size());
        Iterator<LobbyV2GameDetailsModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public String toString() {
        return w9d.a("LobbyV2GamesListUIStateModel(home=", ", others=", lobGSRIlnSGJY.nUVVEQHWFPP, this.home, this.others);
    }
}
