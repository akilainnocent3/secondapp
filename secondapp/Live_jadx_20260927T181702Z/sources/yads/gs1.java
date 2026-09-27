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
public final class gs1 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f149763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f149764c;

    @oy.l
    public static final es1 Companion = new es1();

    @oy.l
    public static final Parcelable.Creator<gs1> CREATOR = new fs1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zv.j[] f149762d = {null, new dw.f(ur1.f156560a)};

    public /* synthetic */ gs1(int i10, long j10, List list) {
        this.f149763b = (i10 & 1) == 0 ? 30000L : j10;
        if ((i10 & 2) == 0) {
            this.f149764c = fr.h0.J();
        } else {
            this.f149764c = list;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs1)) {
            return false;
        }
        gs1 gs1Var = (gs1) obj;
        return this.f149763b == gs1Var.f149763b && kotlin.jvm.internal.m0.g(this.f149764c, gs1Var.f149764c);
    }

    public final int hashCode() {
        return this.f149764c.hashCode() + (f0.p.a(this.f149763b) * 31);
    }

    public final String toString() {
        return "MediationPrefetchSettings(loadTimeoutMillis=" + this.f149763b + ", mediationPrefetchAdUnits=" + this.f149764c + gi.j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f149763b);
        List list = this.f149764c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((xr1) it.next()).writeToParcel(parcel, i10);
        }
    }

    public gs1(long j10, ArrayList arrayList) {
        this.f149763b = j10;
        this.f149764c = arrayList;
    }
}
