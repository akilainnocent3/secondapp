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
public final class Category implements Parcelable {

    @l
    public static final Parcelable.Creator<Category> CREATOR = new Creator();

    @m
    private String category_image_url;

    @m
    private List<Channel> channels;

    @m
    private String image_url;

    @m
    private Boolean live;

    @m
    private String name;

    @m
    private Integer priority;

    @m
    private String thumbnail_image;

    @m
    private String web_image_url;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Category> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Category createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            m0.p(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(Channel.CREATOR.createFromParcel(parcel));
                }
            }
            return new Category(string, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Category[] newArray(int i10) {
            return new Category[i10];
        }
    }

    public Category(@m String str, @m @wo.g(name = "channels") List<Channel> list, @m String str2, @m Boolean bool, @m String str3, @m Integer num, @m String str4, @m String str5) {
        this.category_image_url = str;
        this.channels = list;
        this.image_url = str2;
        this.live = bool;
        this.name = str3;
        this.priority = num;
        this.thumbnail_image = str4;
        this.web_image_url = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Category copy$default(Category category, String str, List list, String str2, Boolean bool, String str3, Integer num, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = category.category_image_url;
        }
        if ((i10 & 2) != 0) {
            list = category.channels;
        }
        if ((i10 & 4) != 0) {
            str2 = category.image_url;
        }
        if ((i10 & 8) != 0) {
            bool = category.live;
        }
        if ((i10 & 16) != 0) {
            str3 = category.name;
        }
        if ((i10 & 32) != 0) {
            num = category.priority;
        }
        if ((i10 & 64) != 0) {
            str4 = category.thumbnail_image;
        }
        if ((i10 & 128) != 0) {
            str5 = category.web_image_url;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        Integer num2 = num;
        return category.copy(str, list, str2, bool, str8, num2, str6, str7);
    }

    @m
    public final String component1() {
        return this.category_image_url;
    }

    @m
    public final List<Channel> component2() {
        return this.channels;
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
        return this.thumbnail_image;
    }

    @m
    public final String component8() {
        return this.web_image_url;
    }

    @l
    public final Category copy(@m String str, @m @wo.g(name = "channels") List<Channel> list, @m String str2, @m Boolean bool, @m String str3, @m Integer num, @m String str4, @m String str5) {
        return new Category(str, list, str2, bool, str3, num, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        return m0.g(this.category_image_url, category.category_image_url) && m0.g(this.channels, category.channels) && m0.g(this.image_url, category.image_url) && m0.g(this.live, category.live) && m0.g(this.name, category.name) && m0.g(this.priority, category.priority) && m0.g(this.thumbnail_image, category.thumbnail_image) && m0.g(this.web_image_url, category.web_image_url);
    }

    @m
    public final String getCategory_image_url() {
        return this.category_image_url;
    }

    @m
    public final List<Channel> getChannels() {
        return this.channels;
    }

    @m
    public final String getImage_url() {
        return this.image_url;
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
    public final String getThumbnail_image() {
        return this.thumbnail_image;
    }

    @m
    public final String getWeb_image_url() {
        return this.web_image_url;
    }

    public int hashCode() {
        String str = this.category_image_url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Channel> list = this.channels;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.image_url;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.live;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.priority;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.thumbnail_image;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.web_image_url;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setCategory_image_url(@m String str) {
        this.category_image_url = str;
    }

    public final void setChannels(@m List<Channel> list) {
        this.channels = list;
    }

    public final void setImage_url(@m String str) {
        this.image_url = str;
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

    public final void setThumbnail_image(@m String str) {
        this.thumbnail_image = str;
    }

    public final void setWeb_image_url(@m String str) {
        this.web_image_url = str;
    }

    @l
    public String toString() {
        return "Category(category_image_url=" + this.category_image_url + ", channels=" + this.channels + ", image_url=" + this.image_url + ", live=" + this.live + ", name=" + this.name + ", priority=" + this.priority + ", thumbnail_image=" + this.thumbnail_image + ", web_image_url=" + this.web_image_url + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.category_image_url);
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
        dest.writeString(this.thumbnail_image);
        dest.writeString(this.web_image_url);
    }
}
