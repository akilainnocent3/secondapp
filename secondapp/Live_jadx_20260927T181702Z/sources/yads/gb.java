package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gb implements Parcelable {

    @oy.l
    public static final Parcelable.Creator<gb> CREATOR = new fb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f149502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f149503d;

    public gb(String str, String str2, ArrayList arrayList) {
        this.f149501b = str;
        this.f149502c = arrayList;
        this.f149503d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return kotlin.jvm.internal.m0.g(this.f149501b, gbVar.f149501b) && kotlin.jvm.internal.m0.g(this.f149502c, gbVar.f149502c) && kotlin.jvm.internal.m0.g(this.f149503d, gbVar.f149503d);
    }

    public final int hashCode() {
        return this.f149503d.hashCode() + eb.a(this.f149502c, this.f149501b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdUnitIdBiddingSettings(adUnitId=" + this.f149501b + ", mediationNetworks=" + this.f149502c + ", rawData=" + this.f149503d + gi.j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f149501b);
        List list = this.f149502c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((qq1) it.next()).writeToParcel(parcel, i10);
        }
        parcel.writeString(this.f149503d);
    }
}
