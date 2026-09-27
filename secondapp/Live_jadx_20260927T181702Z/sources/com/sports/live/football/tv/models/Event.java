package com.sports.live.football.tv.models;

import android.os.Parcel;
import android.os.Parcelable;
import g8.a;
import gi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import wo.i;
import yv.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@i(generateAdapter = true)
@g
public final class Event implements Parcelable {

    @l
    public static final Parcelable.Creator<Event> CREATOR = new Creator();

    @m
    private List<Channel> channels;

    @m
    private List<String> country_codes;

    @m
    private String event_image_url;

    @m
    private String image_url;

    @m
    private Boolean important;
    private boolean isFavorite;

    @m
    private Boolean live;

    @m
    private String name;

    @m
    private Integer priority;

    @m
    private String status;

    @m
    private String web_image_url;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Event> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Event createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            m0.p(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList2.add(Channel.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new Event(arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null, parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Event[] newArray(int i10) {
            return new Event[i10];
        }
    }

    public Event(@m @wo.g(name = "channels") List<Channel> list, @m String str, @m String str2, @m Boolean bool, @m String str3, @m Integer num, @m String str4, @m Boolean bool2, @m String str5, @m List<String> list2, boolean z10) {
        this.channels = list;
        this.event_image_url = str;
        this.image_url = str2;
        this.live = bool;
        this.name = str3;
        this.priority = num;
        this.status = str4;
        this.important = bool2;
        this.web_image_url = str5;
        this.country_codes = list2;
        this.isFavorite = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Event copy$default(Event event, List list, String str, String str2, Boolean bool, String str3, Integer num, String str4, Boolean bool2, String str5, List list2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = event.channels;
        }
        if ((i10 & 2) != 0) {
            str = event.event_image_url;
        }
        if ((i10 & 4) != 0) {
            str2 = event.image_url;
        }
        if ((i10 & 8) != 0) {
            bool = event.live;
        }
        if ((i10 & 16) != 0) {
            str3 = event.name;
        }
        if ((i10 & 32) != 0) {
            num = event.priority;
        }
        if ((i10 & 64) != 0) {
            str4 = event.status;
        }
        if ((i10 & 128) != 0) {
            bool2 = event.important;
        }
        if ((i10 & 256) != 0) {
            str5 = event.web_image_url;
        }
        if ((i10 & 512) != 0) {
            list2 = event.country_codes;
        }
        if ((i10 & 1024) != 0) {
            z10 = event.isFavorite;
        }
        List list3 = list2;
        boolean z11 = z10;
        Boolean bool3 = bool2;
        String str6 = str5;
        Integer num2 = num;
        String str7 = str4;
        String str8 = str3;
        String str9 = str2;
        return event.copy(list, str, str9, bool, str8, num2, str7, bool3, str6, list3, z11);
    }

    @m
    public final List<Channel> component1() {
        return this.channels;
    }

    @m
    public final List<String> component10() {
        return this.country_codes;
    }

    public final boolean component11() {
        return this.isFavorite;
    }

    @m
    public final String component2() {
        return this.event_image_url;
    }

    @m
    public final String component3() {
        return this.image_url;
    }

    @m
    public final Boolean component4() {
        return this.live;
    }

    @m
    public final String component5() {
        return this.name;
    }

    @m
    public final Integer component6() {
        return this.priority;
    }

    @m
    public final String component7() {
        return this.status;
    }

    @m
    public final Boolean component8() {
        return this.important;
    }

    @m
    public final String component9() {
        return this.web_image_url;
    }

    @l
    public final Event copy(@m @wo.g(name = "channels") List<Channel> list, @m String str, @m String str2, @m Boolean bool, @m String str3, @m Integer num, @m String str4, @m Boolean bool2, @m String str5, @m List<String> list2, boolean z10) {
        return new Event(list, str, str2, bool, str3, num, str4, bool2, str5, list2, z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return m0.g(this.channels, event.channels) && m0.g(this.event_image_url, event.event_image_url) && m0.g(this.image_url, event.image_url) && m0.g(this.live, event.live) && m0.g(this.name, event.name) && m0.g(this.priority, event.priority) && m0.g(this.status, event.status) && m0.g(this.important, event.important) && m0.g(this.web_image_url, event.web_image_url) && m0.g(this.country_codes, event.country_codes) && this.isFavorite == event.isFavorite;
    }

    @m
    public final List<Channel> getChannels() {
        return this.channels;
    }

    @m
    public final List<String> getCountry_codes() {
        return this.country_codes;
    }

    @m
    public final String getEvent_image_url() {
        return this.event_image_url;
    }

    @m
    public final String getImage_url() {
        return this.image_url;
    }

    @m
    public final Boolean getImportant() {
        return this.important;
    }

    @m
    public final Boolean getLive() {
        return this.live;
    }

    @m
    public final String getName() {
        return this.name;
    }

    @m
    public final Integer getPriority() {
        return this.priority;
    }

    @m
    public final String getStatus() {
        return this.status;
    }

    @m
    public final String getWeb_image_url() {
        return this.web_image_url;
    }

    public int hashCode() {
        List<Channel> list = this.channels;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.event_image_url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image_url;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.live;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.priority;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.status;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.important;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.web_image_url;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list2 = this.country_codes;
        return ((iHashCode9 + (list2 != null ? list2.hashCode() : 0)) * 31) + a.a(this.isFavorite);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final void setChannels(@m List<Channel> list) {
        this.channels = list;
    }

    public final void setCountry_codes(@m List<String> list) {
        this.country_codes = list;
    }

    public final void setEvent_image_url(@m String str) {
        this.event_image_url = str;
    }

    public final void setFavorite(boolean z10) {
        this.isFavorite = z10;
    }

    public final void setImage_url(@m String str) {
        this.image_url = str;
    }

    public final void setImportant(@m Boolean bool) {
        this.important = bool;
    }

    public final void setLive(@m Boolean bool) {
        this.live = bool;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    public final void setPriority(@m Integer num) {
        this.priority = num;
    }

    public final void setStatus(@m String str) {
        this.status = str;
    }

    public final void setWeb_image_url(@m String str) {
        this.web_image_url = str;
    }

    @l
    public String toString() {
        return "Event(channels=" + this.channels + ", event_image_url=" + this.event_image_url + ", image_url=" + this.image_url + ", live=" + this.live + ", name=" + this.name + ", priority=" + this.priority + ", status=" + this.status + ", important=" + this.important + ", web_image_url=" + this.web_image_url + ", country_codes=" + this.country_codes + ", isFavorite=" + this.isFavorite + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        List<Channel> list = this.channels;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Channel> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, i10);
            }
        }
        dest.writeString(this.event_image_url);
        dest.writeString(this.image_url);
        Boolean bool = this.live;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.name);
        Integer num = this.priority;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.status);
        Boolean bool2 = this.important;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.web_image_url);
        dest.writeStringList(this.country_codes);
        dest.writeInt(this.isFavorite ? 1 : 0);
    }

    public /* synthetic */ Event(List list, String str, String str2, Boolean bool, String str3, Integer num, String str4, Boolean bool2, String str5, List list2, boolean z10, int i10, x xVar) {
        this(list, str, str2, bool, str3, num, str4, (i10 & 128) != 0 ? Boolean.FALSE : bool2, str5, (i10 & 512) != 0 ? null : list2, (i10 & 1024) != 0 ? false : z10);
    }
}
