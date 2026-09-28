package com.sportygames.lobby.remote.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import defpackage.xbp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000b\"\u0004\b\u0012\u0010\r¨\u0006&"}, d2 = {"Lcom/sportygames/lobby/remote/models/CategoriesResponse;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_PARAM_ID, "", "name", "imageUrl", "position", "isVisible", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "getImageUrl", "getPosition", "setVisible", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CategoriesResponse implements Parcelable {
    private String id;
    private final String imageUrl;
    private String isVisible;
    private String name;
    private final String position;
    public static final Parcelable.Creator<CategoriesResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CategoriesResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoriesResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CategoriesResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoriesResponse[] newArray(int i) {
            return new CategoriesResponse[i];
        }
    }

    public /* synthetic */ CategoriesResponse(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    public static /* synthetic */ CategoriesResponse copy$default(CategoriesResponse categoriesResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = categoriesResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = categoriesResponse.name;
        }
        if ((i & 4) != 0) {
            str3 = categoriesResponse.imageUrl;
        }
        if ((i & 8) != 0) {
            str4 = categoriesResponse.position;
        }
        if ((i & 16) != 0) {
            str5 = categoriesResponse.isVisible;
        }
        String str6 = str5;
        String str7 = str3;
        return categoriesResponse.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIsVisible() {
        return this.isVisible;
    }

    public final CategoriesResponse copy(@xbp(name = AnalyticsParam.EVENT_PARAM_ID) String id, @xbp(name = "name") String name, @xbp(name = "imageUrl") String imageUrl, @xbp(name = "position") String position, @xbp(name = "isVisible") String isVisible) {
        id.getClass();
        return new CategoriesResponse(id, name, imageUrl, position, isVisible);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoriesResponse)) {
            return false;
        }
        CategoriesResponse categoriesResponse = (CategoriesResponse) other;
        return Intrinsics.g(this.id, categoriesResponse.id) && Intrinsics.g(this.name, categoriesResponse.name) && Intrinsics.g(this.imageUrl, categoriesResponse.imageUrl) && Intrinsics.g(this.position, categoriesResponse.position) && Intrinsics.g(this.isVisible, categoriesResponse.isVisible);
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPosition() {
        return this.position;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.position;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.isVisible;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String isVisible() {
        return this.isVisible;
    }

    public final void setId(String str) {
        str.getClass();
        this.id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setVisible(String str) {
        this.isVisible = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.imageUrl;
        String str4 = this.position;
        String str5 = this.isVisible;
        StringBuilder sbA = ux5.a("CategoriesResponse(id=", str, ", name=", str2, ", imageUrl=");
        hxa.c(sbA, str3, ", position=", str4, ", isVisible=");
        return uf80.a(sbA, str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.imageUrl);
        dest.writeString(this.position);
        dest.writeString(this.isVisible);
    }

    public CategoriesResponse(@xbp(name = AnalyticsParam.EVENT_PARAM_ID) String str, @xbp(name = "name") String str2, @xbp(name = "imageUrl") String str3, @xbp(name = "position") String str4, @xbp(name = "isVisible") String str5) {
        str.getClass();
        this.id = str;
        this.name = str2;
        this.imageUrl = str3;
        this.position = str4;
        this.isVisible = str5;
    }
}
