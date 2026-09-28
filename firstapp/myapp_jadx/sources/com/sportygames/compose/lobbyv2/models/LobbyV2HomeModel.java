package com.sportygames.compose.lobbyv2.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.mq0;
import defpackage.p200;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\n¨\u0006 "}, d2 = {"Lcom/sportygames/compose/lobbyv2/models/LobbyV2HomeModel;", "Landroid/os/Parcelable;", "isUserLoggedIn", "", AnalyticsParam.EVENT_PARAM_RESULT, "", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2HomeItemModel;", "isUserVariantResponse", "<init>", "(ZLjava/util/List;Z)V", "()Z", "getResult", "()Ljava/util/List;", "setResult", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LobbyV2HomeModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LobbyV2HomeModel> CREATOR = new a();
    private final boolean isUserLoggedIn;
    private final boolean isUserVariantResponse;
    private List<LobbyV2HomeItemModel> result;

    public static final class a implements Parcelable.Creator<LobbyV2HomeModel> {
        @Override // android.os.Parcelable.Creator
        public final LobbyV2HomeModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = p200.a(LobbyV2HomeItemModel.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new LobbyV2HomeModel(z, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final LobbyV2HomeModel[] newArray(int i) {
            return new LobbyV2HomeModel[i];
        }
    }

    public /* synthetic */ LobbyV2HomeModel(boolean z, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? false : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LobbyV2HomeModel copy$default(LobbyV2HomeModel lobbyV2HomeModel, boolean z, List list, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = lobbyV2HomeModel.isUserLoggedIn;
        }
        if ((i & 2) != 0) {
            list = lobbyV2HomeModel.result;
        }
        if ((i & 4) != 0) {
            z2 = lobbyV2HomeModel.isUserVariantResponse;
        }
        return lobbyV2HomeModel.copy(z, list, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsUserLoggedIn() {
        return this.isUserLoggedIn;
    }

    public final List<LobbyV2HomeItemModel> component2() {
        return this.result;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsUserVariantResponse() {
        return this.isUserVariantResponse;
    }

    public final LobbyV2HomeModel copy(boolean isUserLoggedIn, List<LobbyV2HomeItemModel> result, boolean isUserVariantResponse) {
        return new LobbyV2HomeModel(isUserLoggedIn, result, isUserVariantResponse);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LobbyV2HomeModel)) {
            return false;
        }
        LobbyV2HomeModel lobbyV2HomeModel = (LobbyV2HomeModel) other;
        return this.isUserLoggedIn == lobbyV2HomeModel.isUserLoggedIn && Intrinsics.g(this.result, lobbyV2HomeModel.result) && this.isUserVariantResponse == lobbyV2HomeModel.isUserVariantResponse;
    }

    public final List<LobbyV2HomeItemModel> getResult() {
        return this.result;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isUserLoggedIn) * 31;
        List<LobbyV2HomeItemModel> list = this.result;
        return Boolean.hashCode(this.isUserVariantResponse) + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final boolean isUserLoggedIn() {
        return this.isUserLoggedIn;
    }

    public final boolean isUserVariantResponse() {
        return this.isUserVariantResponse;
    }

    public final void setResult(List<LobbyV2HomeItemModel> list) {
        this.result = list;
    }

    public String toString() {
        boolean z = this.isUserLoggedIn;
        List<LobbyV2HomeItemModel> list = this.result;
        boolean z2 = this.isUserVariantResponse;
        StringBuilder sb = new StringBuilder("LobbyV2HomeModel(isUserLoggedIn=");
        sb.append(z);
        sb.append(", result=");
        sb.append(list);
        sb.append(", isUserVariantResponse=");
        return mq0.a(sb, z2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isUserLoggedIn ? 1 : 0);
        List<LobbyV2HomeItemModel> list = this.result;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<LobbyV2HomeItemModel> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.isUserVariantResponse ? 1 : 0);
    }

    public LobbyV2HomeModel(boolean z, List<LobbyV2HomeItemModel> list, boolean z2) {
        this.isUserLoggedIn = z;
        this.result = list;
        this.isUserVariantResponse = z2;
    }
}
