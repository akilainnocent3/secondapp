package com.sports.live.football.tv.models;

import android.os.Parcel;
import android.os.Parcelable;
import gi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;
import wo.i;
import yv.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@i(generateAdapter = true)
@g
public final class AppAd implements Parcelable {

    @l
    public static final Parcelable.Creator<AppAd> CREATOR = new Creator();

    @m
    private String ad_key;

    @m
    private List<AdLocation> ad_locations;

    @m
    private String ad_provider;

    @m
    private Boolean enable;

    @m
    private String otherad;

    @m
    private String time;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<AppAd> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppAd createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            m0.p(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList2.add(AdLocation.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new AppAd(arrayList, parcel.readString(), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppAd[] newArray(int i10) {
            return new AppAd[i10];
        }
    }

    public AppAd(@m @wo.g(name = "ad_locations") List<AdLocation> list, @m String str, @m Boolean bool, @m String str2, @m String str3, @m String str4) {
        this.ad_locations = list;
        this.ad_provider = str;
        this.enable = bool;
        this.otherad = str2;
        this.ad_key = str3;
        this.time = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppAd copy$default(AppAd appAd, List list, String str, Boolean bool, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = appAd.ad_locations;
        }
        if ((i10 & 2) != 0) {
            str = appAd.ad_provider;
        }
        if ((i10 & 4) != 0) {
            bool = appAd.enable;
        }
        if ((i10 & 8) != 0) {
            str2 = appAd.otherad;
        }
        if ((i10 & 16) != 0) {
            str3 = appAd.ad_key;
        }
        if ((i10 & 32) != 0) {
            str4 = appAd.time;
        }
        String str5 = str3;
        String str6 = str4;
        return appAd.copy(list, str, bool, str2, str5, str6);
    }

    @m
    public final List<AdLocation> component1() {
        return this.ad_locations;
    }

    @m
    public final String component2() {
        return this.ad_provider;
    }

    @m
    public final Boolean component3() {
        return this.enable;
    }

    @m
    public final String component4() {
        return this.otherad;
    }

    @m
    public final String component5() {
        return this.ad_key;
    }

    @m
    public final String component6() {
        return this.time;
    }

    @l
    public final AppAd copy(@m @wo.g(name = "ad_locations") List<AdLocation> list, @m String str, @m Boolean bool, @m String str2, @m String str3, @m String str4) {
        return new AppAd(list, str, bool, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppAd)) {
            return false;
        }
        AppAd appAd = (AppAd) obj;
        return m0.g(this.ad_locations, appAd.ad_locations) && m0.g(this.ad_provider, appAd.ad_provider) && m0.g(this.enable, appAd.enable) && m0.g(this.otherad, appAd.otherad) && m0.g(this.ad_key, appAd.ad_key) && m0.g(this.time, appAd.time);
    }

    @m
    public final String getAd_key() {
        return this.ad_key;
    }

    @m
    public final List<AdLocation> getAd_locations() {
        return this.ad_locations;
    }

    @m
    public final String getAd_provider() {
        return this.ad_provider;
    }

    @m
    public final Boolean getEnable() {
        return this.enable;
    }

    @m
    public final String getOtherad() {
        return this.otherad;
    }

    @m
    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        List<AdLocation> list = this.ad_locations;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.ad_provider;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.enable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.otherad;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ad_key;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.time;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAd_key(@m String str) {
        this.ad_key = str;
    }

    public final void setAd_locations(@m List<AdLocation> list) {
        this.ad_locations = list;
    }

    public final void setAd_provider(@m String str) {
        this.ad_provider = str;
    }

    public final void setEnable(@m Boolean bool) {
        this.enable = bool;
    }

    public final void setOtherad(@m String str) {
        this.otherad = str;
    }

    public final void setTime(@m String str) {
        this.time = str;
    }

    @l
    public String toString() {
        return "AppAd(ad_locations=" + this.ad_locations + ", ad_provider=" + this.ad_provider + ", enable=" + this.enable + ", otherad=" + this.otherad + ", ad_key=" + this.ad_key + ", time=" + this.time + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        List<AdLocation> list = this.ad_locations;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<AdLocation> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, i10);
            }
        }
        dest.writeString(this.ad_provider);
        Boolean bool = this.enable;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.otherad);
        dest.writeString(this.ad_key);
        dest.writeString(this.time);
    }
}
