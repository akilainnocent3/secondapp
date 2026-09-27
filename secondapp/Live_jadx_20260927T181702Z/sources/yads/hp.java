package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hp implements Parcelable {

    @oy.l
    public static final Parcelable.Creator<hp> CREATOR = new gp();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f150213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gs1 f150214c;

    public hp(ArrayList arrayList, gs1 gs1Var) {
        this.f150213b = arrayList;
        this.f150214c = gs1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return kotlin.jvm.internal.m0.g(this.f150213b, hpVar.f150213b) && kotlin.jvm.internal.m0.g(this.f150214c, hpVar.f150214c);
    }

    public final int hashCode() {
        int iHashCode = this.f150213b.hashCode() * 31;
        gs1 gs1Var = this.f150214c;
        return iHashCode + (gs1Var == null ? 0 : gs1Var.hashCode());
    }

    public final String toString() {
        return "BiddingSettings(adUnitIdBiddingSettingsList=" + this.f150213b + ", mediationPrefetchSettings=" + this.f150214c + gi.j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f150213b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((gb) it.next()).writeToParcel(parcel, i10);
        }
        gs1 gs1Var = this.f150214c;
        if (gs1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gs1Var.writeToParcel(parcel, i10);
        }
    }
}
