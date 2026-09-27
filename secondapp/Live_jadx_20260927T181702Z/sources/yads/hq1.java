package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hq1 implements Parcelable {

    @oy.l
    public static final Parcelable.Creator<hq1> CREATOR = new gq1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f150222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f150223c;

    public hq1(ArrayList arrayList, Map map) {
        this.f150222b = arrayList;
        this.f150223c = map;
    }

    public final List c() {
        return this.f150222b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f150222b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((qq1) it.next()).writeToParcel(parcel, i10);
        }
        Map map = this.f150223c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
