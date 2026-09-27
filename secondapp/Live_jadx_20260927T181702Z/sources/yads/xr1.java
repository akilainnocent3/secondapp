package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
@yv.g
public final class xr1 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f157974c;

    @oy.l
    public static final vr1 Companion = new vr1();

    @oy.l
    public static final Parcelable.Creator<xr1> CREATOR = new wr1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zv.j[] f157972d = {null, new dw.f(zr1.f159005a)};

    public /* synthetic */ xr1(int i10, String str, List list) {
        if (3 != (i10 & 3)) {
            dw.g2.b(i10, 3, ur1.f156560a.getDescriptor());
        }
        this.f157973b = str;
        this.f157974c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr1)) {
            return false;
        }
        xr1 xr1Var = (xr1) obj;
        return kotlin.jvm.internal.m0.g(this.f157973b, xr1Var.f157973b) && kotlin.jvm.internal.m0.g(this.f157974c, xr1Var.f157974c);
    }

    public final int hashCode() {
        return this.f157974c.hashCode() + (this.f157973b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchAdUnit(adUnitId=" + this.f157973b + ", networks=" + this.f157974c + gi.j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f157973b);
        List list = this.f157974c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((cs1) it.next()).writeToParcel(parcel, i10);
        }
    }

    public xr1(String str, ArrayList arrayList) {
        this.f157973b = str;
        this.f157974c = arrayList;
    }
}
