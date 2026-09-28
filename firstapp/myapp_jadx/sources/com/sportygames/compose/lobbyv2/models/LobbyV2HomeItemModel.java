package com.sportygames.compose.lobbyv2.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.m;
import defpackage.d5d;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.p200;
import defpackage.qpu;
import defpackage.uqe0;
import defpackage.wxa;
import defpackage.zk1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u000eHÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J¯\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001J\u0006\u0010=\u001a\u00020\u0003J\u0013\u0010>\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0003HÖ\u0001J\t\u0010B\u001a\u00020\u0005HÖ\u0001J\u0016\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010%R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010%R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001a¨\u0006H"}, d2 = {"Lcom/sportygames/compose/lobbyv2/models/LobbyV2HomeItemModel;", "Landroid/os/Parcelable;", "order", "", "sectionName", "", "sectionId", "categoryId", "gameListVO", "", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2GameDetailsModel;", "providerList", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2ProviderDetailsModel;", "isDynamicSection", "", "isUserControlled", "listType", "maxItems", "minItems", "showAll", "key", "total", "limit", "<init>", "(ILjava/lang/String;IILjava/util/List;Ljava/util/List;ZZLjava/lang/String;IIZLjava/lang/String;II)V", "getOrder", "()I", "getSectionName", "()Ljava/lang/String;", "getSectionId", "getCategoryId", "getGameListVO", "()Ljava/util/List;", "setGameListVO", "(Ljava/util/List;)V", "getProviderList", "setProviderList", "()Z", "getListType", "getMaxItems", "getMinItems", "getShowAll", "getKey", "getTotal", "getLimit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LobbyV2HomeItemModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LobbyV2HomeItemModel> CREATOR = new a();
    private final int categoryId;
    private List<LobbyV2GameDetailsModel> gameListVO;
    private final boolean isDynamicSection;
    private final boolean isUserControlled;
    private final String key;
    private final int limit;
    private final String listType;
    private final int maxItems;
    private final int minItems;
    private final int order;
    private List<LobbyV2ProviderDetailsModel> providerList;
    private final int sectionId;
    private final String sectionName;
    private final boolean showAll;
    private final int total;

    public static final class a implements Parcelable.Creator<LobbyV2HomeItemModel> {
        @Override // android.os.Parcelable.Creator
        public final LobbyV2HomeItemModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            parcel.getClass();
            int i = parcel.readInt();
            String string = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = null;
            boolean z2 = true;
            boolean z3 = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iA = 0;
                while (iA != i4) {
                    iA = p200.a(LobbyV2GameDetailsModel.CREATOR, parcel, arrayList3, iA, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iA2 = 0;
                while (iA2 != i5) {
                    iA2 = p200.a(LobbyV2ProviderDetailsModel.CREATOR, parcel, arrayList4, iA2, 1);
                }
                arrayList2 = arrayList4;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
                z = true;
            } else {
                z = z2;
            }
            String string2 = parcel.readString();
            boolean z4 = false;
            int i6 = parcel.readInt();
            boolean z5 = z;
            int i7 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z4 = z5;
            }
            return new LobbyV2HomeItemModel(i, string, i2, i3, arrayList, arrayList2, z2, z3, string2, i6, i7, z4, parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LobbyV2HomeItemModel[] newArray(int i) {
            return new LobbyV2HomeItemModel[i];
        }
    }

    public /* synthetic */ LobbyV2HomeItemModel(int i, String str, int i2, int i3, List list, List list2, boolean z, boolean z2, String str2, int i4, int i5, boolean z3, String str3, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, (i8 & 8) != 0 ? 0 : i3, (i8 & 16) != 0 ? new ArrayList() : list, (i8 & 32) != 0 ? new ArrayList() : list2, z, z2, str2, i4, i5, (i8 & 2048) != 0 ? false : z3, str3, i6, i7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getMaxItems() {
        return this.maxItems;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getMinItems() {
        return this.minItems;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getShowAll() {
        return this.showAll;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSectionName() {
        return this.sectionName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSectionId() {
        return this.sectionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    public final List<LobbyV2GameDetailsModel> component5() {
        return this.gameListVO;
    }

    public final List<LobbyV2ProviderDetailsModel> component6() {
        return this.providerList;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsDynamicSection() {
        return this.isDynamicSection;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsUserControlled() {
        return this.isUserControlled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getListType() {
        return this.listType;
    }

    public final LobbyV2HomeItemModel copy(int order, String sectionName, int sectionId, int categoryId, List<LobbyV2GameDetailsModel> gameListVO, List<LobbyV2ProviderDetailsModel> providerList, boolean isDynamicSection, boolean isUserControlled, String listType, int maxItems, int minItems, boolean showAll, String key, int total, int limit) {
        sectionName.getClass();
        listType.getClass();
        key.getClass();
        return new LobbyV2HomeItemModel(order, sectionName, sectionId, categoryId, gameListVO, providerList, isDynamicSection, isUserControlled, listType, maxItems, minItems, showAll, key, total, limit);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LobbyV2HomeItemModel)) {
            return false;
        }
        LobbyV2HomeItemModel lobbyV2HomeItemModel = (LobbyV2HomeItemModel) other;
        return this.order == lobbyV2HomeItemModel.order && Intrinsics.g(this.sectionName, lobbyV2HomeItemModel.sectionName) && this.sectionId == lobbyV2HomeItemModel.sectionId && this.categoryId == lobbyV2HomeItemModel.categoryId && Intrinsics.g(this.gameListVO, lobbyV2HomeItemModel.gameListVO) && Intrinsics.g(this.providerList, lobbyV2HomeItemModel.providerList) && this.isDynamicSection == lobbyV2HomeItemModel.isDynamicSection && this.isUserControlled == lobbyV2HomeItemModel.isUserControlled && Intrinsics.g(this.listType, lobbyV2HomeItemModel.listType) && this.maxItems == lobbyV2HomeItemModel.maxItems && this.minItems == lobbyV2HomeItemModel.minItems && this.showAll == lobbyV2HomeItemModel.showAll && Intrinsics.g(this.key, lobbyV2HomeItemModel.key) && this.total == lobbyV2HomeItemModel.total && this.limit == lobbyV2HomeItemModel.limit;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final List<LobbyV2GameDetailsModel> getGameListVO() {
        return this.gameListVO;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getListType() {
        return this.listType;
    }

    public final int getMaxItems() {
        return this.maxItems;
    }

    public final int getMinItems() {
        return this.minItems;
    }

    public final int getOrder() {
        return this.order;
    }

    public final List<LobbyV2ProviderDetailsModel> getProviderList() {
        return this.providerList;
    }

    public final int getSectionId() {
        return this.sectionId;
    }

    public final String getSectionName() {
        return this.sectionName;
    }

    public final boolean getShowAll() {
        return this.showAll;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        int iA = gpp.a(this.categoryId, gpp.a(this.sectionId, gmf0.a(Integer.hashCode(this.order) * 31, 31, this.sectionName), 31), 31);
        List<LobbyV2GameDetailsModel> list = this.gameListVO;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        List<LobbyV2ProviderDetailsModel> list2 = this.providerList;
        return Integer.hashCode(this.limit) + gpp.a(this.total, gmf0.a(mtg0.a(gpp.a(this.minItems, gpp.a(this.maxItems, gmf0.a(mtg0.a(mtg0.a((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.isDynamicSection), 31, this.isUserControlled), 31, this.listType), 31), 31), 31, this.showAll), 31, this.key), 31);
    }

    public final boolean isDynamicSection() {
        return this.isDynamicSection;
    }

    public final boolean isUserControlled() {
        return this.isUserControlled;
    }

    public final void setGameListVO(List<LobbyV2GameDetailsModel> list) {
        this.gameListVO = list;
    }

    public final void setProviderList(List<LobbyV2ProviderDetailsModel> list) {
        this.providerList = list;
    }

    public String toString() {
        int i = this.order;
        String str = this.sectionName;
        int i2 = this.sectionId;
        int i3 = this.categoryId;
        List<LobbyV2GameDetailsModel> list = this.gameListVO;
        List<LobbyV2ProviderDetailsModel> list2 = this.providerList;
        boolean z = this.isDynamicSection;
        boolean z2 = this.isUserControlled;
        String str2 = this.listType;
        int i4 = this.maxItems;
        int i5 = this.minItems;
        boolean z3 = this.showAll;
        String str3 = this.key;
        int i6 = this.total;
        int i7 = this.limit;
        StringBuilder sbA = uqe0.a(i, "LobbyV2HomeItemModel(order=", ", sectionName=", str, ", sectionId=");
        d5d.a(sbA, i2, ", categoryId=", i3, ", gameListVO=");
        qpu.a(", providerList=", ", isDynamicSection=", sbA, list, list2);
        nng.a(", isUserControlled=", ", listType=", sbA, z, z2);
        wxa.b(i4, str2, ", maxItems=", ", minItems=", sbA);
        sbA.append(i5);
        sbA.append(", showAll=");
        sbA.append(z3);
        sbA.append(", key=");
        wxa.b(i6, str3, ", total=", ", limit=", sbA);
        return zk1.a(i7, ")", sbA);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.order);
        dest.writeString(this.sectionName);
        dest.writeInt(this.sectionId);
        dest.writeInt(this.categoryId);
        List<LobbyV2GameDetailsModel> list = this.gameListVO;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<LobbyV2GameDetailsModel> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        List<LobbyV2ProviderDetailsModel> list2 = this.providerList;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<LobbyV2ProviderDetailsModel> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.isDynamicSection ? 1 : 0);
        dest.writeInt(this.isUserControlled ? 1 : 0);
        dest.writeString(this.listType);
        dest.writeInt(this.maxItems);
        dest.writeInt(this.minItems);
        dest.writeInt(this.showAll ? 1 : 0);
        dest.writeString(this.key);
        dest.writeInt(this.total);
        dest.writeInt(this.limit);
    }

    public LobbyV2HomeItemModel(int i, String str, int i2, int i3, List<LobbyV2GameDetailsModel> list, List<LobbyV2ProviderDetailsModel> list2, boolean z, boolean z2, String str2, int i4, int i5, boolean z3, String str3, int i6, int i7) {
        m.a(str, str2, str3);
        this.order = i;
        this.sectionName = str;
        this.sectionId = i2;
        this.categoryId = i3;
        this.gameListVO = list;
        this.providerList = list2;
        this.isDynamicSection = z;
        this.isUserControlled = z2;
        this.listType = str2;
        this.maxItems = i4;
        this.minItems = i5;
        this.showAll = z3;
        this.key = str3;
        this.total = i6;
        this.limit = i7;
    }
}
