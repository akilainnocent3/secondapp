package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qq1 implements Parcelable {

    @oy.l
    public static final Parcelable.Creator<qq1> CREATOR = new nq1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f154556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f154557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f154558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f154559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j5 f154560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f154561h;

    public qq1(String str, Map map, List list, List list2, List list3, j5 j5Var, Map map2) {
        this.f154555b = str;
        this.f154556c = map;
        this.f154557d = list;
        this.f154558e = list2;
        this.f154559f = list3;
        this.f154560g = j5Var;
        this.f154561h = map2;
    }

    public final String c() {
        return this.f154555b;
    }

    public final Map d() {
        return this.f154556c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq1)) {
            return false;
        }
        qq1 qq1Var = (qq1) obj;
        return kotlin.jvm.internal.m0.g(this.f154555b, qq1Var.f154555b) && kotlin.jvm.internal.m0.g(this.f154556c, qq1Var.f154556c) && kotlin.jvm.internal.m0.g(this.f154557d, qq1Var.f154557d) && kotlin.jvm.internal.m0.g(this.f154558e, qq1Var.f154558e) && kotlin.jvm.internal.m0.g(this.f154559f, qq1Var.f154559f) && kotlin.jvm.internal.m0.g(this.f154560g, qq1Var.f154560g) && kotlin.jvm.internal.m0.g(this.f154561h, qq1Var.f154561h);
    }

    public final int hashCode() {
        int iHashCode = (this.f154556c.hashCode() + (this.f154555b.hashCode() * 31)) * 31;
        List list = this.f154557d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f154558e;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f154559f;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        j5 j5Var = this.f154560g;
        int iHashCode5 = (iHashCode4 + (j5Var == null ? 0 : j5Var.f150935b.hashCode())) * 31;
        Map map = this.f154561h;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "MediationNetwork(adapter=" + this.f154555b + ", networkData=" + this.f154556c + ", impressionTrackingUrls=" + this.f154557d + ", clickTrackingUrls=" + this.f154558e + ", adResponseTrackingUrls=" + this.f154559f + ", adImpressionData=" + this.f154560g + ", biddingInfo=" + this.f154561h + gi.j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f154555b);
        Map map = this.f154556c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeStringList(this.f154557d);
        parcel.writeStringList(this.f154558e);
        parcel.writeStringList(this.f154559f);
        j5 j5Var = this.f154560g;
        if (j5Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(j5Var.f150935b);
        }
        Map map2 = this.f154561h;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            parcel.writeString((String) entry2.getValue());
        }
    }
}
