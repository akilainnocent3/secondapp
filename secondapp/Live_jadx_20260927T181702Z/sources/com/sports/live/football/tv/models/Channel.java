package com.sports.live.football.tv.models;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class Channel implements Parcelable {

    @l
    public static final Parcelable.Creator<Channel> CREATOR = new Creator();

    @m
    private List<ChannelConfiguration> channel_configurations;

    @m
    private String channel_image_url;

    @m
    private String channel_type;

    @m
    private String clear_key;

    @m
    private List<String> country_codes;

    @m
    private String date;

    @m
    private String forwarded_for;

    @m
    private String image_url;

    @m
    private Boolean important;

    @m
    private String initial_time;

    @m
    private Boolean isSelected;

    @m
    private Boolean live;

    @m
    private String name;

    @m
    private Integer position;

    @m
    private Integer priority;

    @m
    private String url;

    @m
    private String user_agent;

    @m
    private String web_image_url;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Channel> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r17v4, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
        @Override // android.os.Parcelable.Creator
        public final Channel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Integer num;
            Object objValueOf;
            Object objValueOf2;
            m0.p(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
                num = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                num = null;
            }
            String string4 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            String string6 = parcel.readString();
            Object obj = num;
            Integer num2 = numValueOf;
            Integer num3 = numValueOf2;
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf = obj;
            } else {
                objValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string8 = parcel.readString();
            ?? r13 = objValueOf;
            String string9 = parcel.readString();
            Object obj2 = obj;
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf2 = obj2;
            } else {
                objValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string11 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                int i11 = 0;
                while (i11 != i10) {
                    arrayList.add(ChannelConfiguration.CREATOR.createFromParcel(parcel));
                    i11++;
                    i10 = i10;
                }
                obj2 = arrayList;
            }
            return new Channel(string, string2, string3, boolValueOf, string4, num2, string5, num3, string6, string7, r13, string8, string9, string10, objValueOf2, arrayListCreateStringArrayList, string11, obj2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Channel[] newArray(int i10) {
            return new Channel[i10];
        }
    }

    public Channel(@m String str, @m String str2, @m String str3, @m Boolean bool, @m String str4, @m Integer num, @m String str5, @m Integer num2, @m String str6, @m String str7, @m Boolean bool2, @m String str8, @m String str9, @m String str10, @m Boolean bool3, @m List<String> list, @m String str11, @m List<ChannelConfiguration> list2) {
        this.channel_image_url = str;
        this.channel_type = str2;
        this.image_url = str3;
        this.live = bool;
        this.name = str4;
        this.position = num;
        this.date = str5;
        this.priority = num2;
        this.url = str6;
        this.web_image_url = str7;
        this.important = bool2;
        this.clear_key = str8;
        this.user_agent = str9;
        this.forwarded_for = str10;
        this.isSelected = bool3;
        this.country_codes = list;
        this.initial_time = str11;
        this.channel_configurations = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Channel copy$default(Channel channel, String str, String str2, String str3, Boolean bool, String str4, Integer num, String str5, Integer num2, String str6, String str7, Boolean bool2, String str8, String str9, String str10, Boolean bool3, List list, String str11, List list2, int i10, Object obj) {
        List list3;
        String str12;
        String str13 = (i10 & 1) != 0 ? channel.channel_image_url : str;
        String str14 = (i10 & 2) != 0 ? channel.channel_type : str2;
        String str15 = (i10 & 4) != 0 ? channel.image_url : str3;
        Boolean bool4 = (i10 & 8) != 0 ? channel.live : bool;
        String str16 = (i10 & 16) != 0 ? channel.name : str4;
        Integer num3 = (i10 & 32) != 0 ? channel.position : num;
        String str17 = (i10 & 64) != 0 ? channel.date : str5;
        Integer num4 = (i10 & 128) != 0 ? channel.priority : num2;
        String str18 = (i10 & 256) != 0 ? channel.url : str6;
        String str19 = (i10 & 512) != 0 ? channel.web_image_url : str7;
        Boolean bool5 = (i10 & 1024) != 0 ? channel.important : bool2;
        String str20 = (i10 & 2048) != 0 ? channel.clear_key : str8;
        String str21 = (i10 & 4096) != 0 ? channel.user_agent : str9;
        String str22 = (i10 & 8192) != 0 ? channel.forwarded_for : str10;
        String str23 = str13;
        Boolean bool6 = (i10 & 16384) != 0 ? channel.isSelected : bool3;
        List list4 = (i10 & 32768) != 0 ? channel.country_codes : list;
        String str24 = (i10 & 65536) != 0 ? channel.initial_time : str11;
        if ((i10 & 131072) != 0) {
            str12 = str24;
            list3 = channel.channel_configurations;
        } else {
            list3 = list2;
            str12 = str24;
        }
        return channel.copy(str23, str14, str15, bool4, str16, num3, str17, num4, str18, str19, bool5, str20, str21, str22, bool6, list4, str12, list3);
    }

    @m
    public final String component1() {
        return this.channel_image_url;
    }

    @m
    public final String component10() {
        return this.web_image_url;
    }

    @m
    public final Boolean component11() {
        return this.important;
    }

    @m
    public final String component12() {
        return this.clear_key;
    }

    @m
    public final String component13() {
        return this.user_agent;
    }

    @m
    public final String component14() {
        return this.forwarded_for;
    }

    @m
    public final Boolean component15() {
        return this.isSelected;
    }

    @m
    public final List<String> component16() {
        return this.country_codes;
    }

    @m
    public final String component17() {
        return this.initial_time;
    }

    @m
    public final List<ChannelConfiguration> component18() {
        return this.channel_configurations;
    }

    @m
    public final String component2() {
        return this.channel_type;
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
        return this.position;
    }

    @m
    public final String component7() {
        return this.date;
    }

    @m
    public final Integer component8() {
        return this.priority;
    }

    @m
    public final String component9() {
        return this.url;
    }

    @l
    public final Channel copy(@m String str, @m String str2, @m String str3, @m Boolean bool, @m String str4, @m Integer num, @m String str5, @m Integer num2, @m String str6, @m String str7, @m Boolean bool2, @m String str8, @m String str9, @m String str10, @m Boolean bool3, @m List<String> list, @m String str11, @m List<ChannelConfiguration> list2) {
        return new Channel(str, str2, str3, bool, str4, num, str5, num2, str6, str7, bool2, str8, str9, str10, bool3, list, str11, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) obj;
        return m0.g(this.channel_image_url, channel.channel_image_url) && m0.g(this.channel_type, channel.channel_type) && m0.g(this.image_url, channel.image_url) && m0.g(this.live, channel.live) && m0.g(this.name, channel.name) && m0.g(this.position, channel.position) && m0.g(this.date, channel.date) && m0.g(this.priority, channel.priority) && m0.g(this.url, channel.url) && m0.g(this.web_image_url, channel.web_image_url) && m0.g(this.important, channel.important) && m0.g(this.clear_key, channel.clear_key) && m0.g(this.user_agent, channel.user_agent) && m0.g(this.forwarded_for, channel.forwarded_for) && m0.g(this.isSelected, channel.isSelected) && m0.g(this.country_codes, channel.country_codes) && m0.g(this.initial_time, channel.initial_time) && m0.g(this.channel_configurations, channel.channel_configurations);
    }

    @m
    public final List<ChannelConfiguration> getChannel_configurations() {
        return this.channel_configurations;
    }

    @m
    public final String getChannel_image_url() {
        return this.channel_image_url;
    }

    @m
    public final String getChannel_type() {
        return this.channel_type;
    }

    @m
    public final String getClear_key() {
        return this.clear_key;
    }

    @m
    public final List<String> getCountry_codes() {
        return this.country_codes;
    }

    @m
    public final String getDate() {
        return this.date;
    }

    @m
    public final String getForwarded_for() {
        return this.forwarded_for;
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
    public final String getInitial_time() {
        return this.initial_time;
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
    public final Integer getPosition() {
        return this.position;
    }

    @m
    public final Integer getPriority() {
        return this.priority;
    }

    @m
    public final String getUrl() {
        return this.url;
    }

    @m
    public final String getUser_agent() {
        return this.user_agent;
    }

    @m
    public final String getWeb_image_url() {
        return this.web_image_url;
    }

    public int hashCode() {
        String str = this.channel_image_url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channel_type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image_url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.live;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.position;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.date;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.priority;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.url;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.web_image_url;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool2 = this.important;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str8 = this.clear_key;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.user_agent;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.forwarded_for;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool3 = this.isSelected;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<String> list = this.country_codes;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        String str11 = this.initial_time;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<ChannelConfiguration> list2 = this.channel_configurations;
        return iHashCode17 + (list2 != null ? list2.hashCode() : 0);
    }

    @m
    public final Boolean isSelected() {
        return this.isSelected;
    }

    public final void setChannel_configurations(@m List<ChannelConfiguration> list) {
        this.channel_configurations = list;
    }

    public final void setChannel_image_url(@m String str) {
        this.channel_image_url = str;
    }

    public final void setChannel_type(@m String str) {
        this.channel_type = str;
    }

    public final void setClear_key(@m String str) {
        this.clear_key = str;
    }

    public final void setCountry_codes(@m List<String> list) {
        this.country_codes = list;
    }

    public final void setDate(@m String str) {
        this.date = str;
    }

    public final void setForwarded_for(@m String str) {
        this.forwarded_for = str;
    }

    public final void setImage_url(@m String str) {
        this.image_url = str;
    }

    public final void setImportant(@m Boolean bool) {
        this.important = bool;
    }

    public final void setInitial_time(@m String str) {
        this.initial_time = str;
    }

    public final void setLive(@m Boolean bool) {
        this.live = bool;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    public final void setPosition(@m Integer num) {
        this.position = num;
    }

    public final void setPriority(@m Integer num) {
        this.priority = num;
    }

    public final void setSelected(@m Boolean bool) {
        this.isSelected = bool;
    }

    public final void setUrl(@m String str) {
        this.url = str;
    }

    public final void setUser_agent(@m String str) {
        this.user_agent = str;
    }

    public final void setWeb_image_url(@m String str) {
        this.web_image_url = str;
    }

    @l
    public String toString() {
        return "Channel(channel_image_url=" + this.channel_image_url + ", channel_type=" + this.channel_type + ", image_url=" + this.image_url + ", live=" + this.live + ", name=" + this.name + ", position=" + this.position + ", date=" + this.date + ", priority=" + this.priority + ", url=" + this.url + ", web_image_url=" + this.web_image_url + ", important=" + this.important + ", clear_key=" + this.clear_key + ", user_agent=" + this.user_agent + ", forwarded_for=" + this.forwarded_for + ", isSelected=" + this.isSelected + ", country_codes=" + this.country_codes + ", initial_time=" + this.initial_time + ", channel_configurations=" + this.channel_configurations + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.channel_image_url);
        dest.writeString(this.channel_type);
        dest.writeString(this.image_url);
        Boolean bool = this.live;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.name);
        Integer num = this.position;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.date);
        Integer num2 = this.priority;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.url);
        dest.writeString(this.web_image_url);
        Boolean bool2 = this.important;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.clear_key);
        dest.writeString(this.user_agent);
        dest.writeString(this.forwarded_for);
        Boolean bool3 = this.isSelected;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeStringList(this.country_codes);
        dest.writeString(this.initial_time);
        List<ChannelConfiguration> list = this.channel_configurations;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<ChannelConfiguration> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i10);
        }
    }

    public /* synthetic */ Channel(String str, String str2, String str3, Boolean bool, String str4, Integer num, String str5, Integer num2, String str6, String str7, Boolean bool2, String str8, String str9, String str10, Boolean bool3, List list, String str11, List list2, int i10, x xVar) {
        this(str, str2, str3, bool, str4, num, str5, num2, str6, str7, bool2, str8, str9, str10, (i10 & 16384) != 0 ? Boolean.FALSE : bool3, (32768 & i10) != 0 ? null : list, (i10 & 65536) != 0 ? null : str11, list2);
    }
}
