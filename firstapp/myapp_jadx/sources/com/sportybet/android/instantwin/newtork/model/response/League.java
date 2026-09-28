package com.sportybet.android.instantwin.newtork.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0010J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R&\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\b\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\u0002\n\u0000R&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\b\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\b\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005¢\u0006\u0002\n\u0000Ê\u0001\u0002\b\u001dÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001c"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/League;", "Landroid/os/Parcelable;", "leagueId", "", "name", "iconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/jvm/JvmField;", "Lcom/google/gson/annotations/SerializedName;", "value", "equals", "", "other", "", "hashCode", "", "component1", "component2", "component3", "copy", "describeContents", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "instantWin", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class League implements Parcelable {

    @SerializedName("iconUrl")
    public final String iconUrl;

    @SerializedName("leagueId")
    public final String leagueId;

    @SerializedName("name")
    public final String name;
    public static final Parcelable.Creator<League> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<League> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final League createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new League(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final League[] newArray(int i) {
            return new League[i];
        }
    }

    public League(String str, String str2, String str3) {
        this.leagueId = str;
        this.name = str2;
        this.iconUrl = str3;
    }

    public static /* synthetic */ League copy$default(League league, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = league.leagueId;
        }
        if ((i & 2) != 0) {
            str2 = league.name;
        }
        if ((i & 4) != 0) {
            str3 = league.iconUrl;
        }
        return league.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final League copy(String leagueId, String name, String iconUrl) {
        return new League(leagueId, name, iconUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !League.class.equals(other.getClass())) {
            return false;
        }
        return Intrinsics.g(this.leagueId, ((League) other).leagueId);
    }

    public int hashCode() {
        String str = this.leagueId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = this.leagueId;
        String str2 = this.name;
        return uf80.a(ux5.a("League(leagueId=", str, ", name=", str2, ", iconUrl="), this.iconUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.leagueId);
        dest.writeString(this.name);
        dest.writeString(this.iconUrl);
    }
}
