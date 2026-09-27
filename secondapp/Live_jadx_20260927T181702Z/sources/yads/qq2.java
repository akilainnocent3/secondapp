package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qq2 implements Parcelable {

    @oy.l
    public static final Parcelable.Creator<qq2> CREATOR = new oq2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f154562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rv f154563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yx2 f154564d;

    public qq2(boolean z10, rv rvVar, yx2 yx2Var) {
        this.f154562b = z10;
        this.f154563c = rvVar;
        this.f154564d = yx2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq2)) {
            return false;
        }
        qq2 qq2Var = (qq2) obj;
        return this.f154562b == qq2Var.f154562b && kotlin.jvm.internal.m0.g(this.f154563c, qq2Var.f154563c) && kotlin.jvm.internal.m0.g(this.f154564d, qq2Var.f154564d);
    }

    public final int hashCode() {
        int iA = g8.a.a(this.f154562b) * 31;
        rv rvVar = this.f154563c;
        int iHashCode = (iA + (rvVar == null ? 0 : rvVar.hashCode())) * 31;
        yx2 yx2Var = this.f154564d;
        return iHashCode + (yx2Var != null ? yx2Var.f158519b.hashCode() : 0);
    }

    public final String toString() {
        return "RewardData(serverSideRewardType=" + this.f154562b + ", clientSideReward=" + this.f154563c + ", serverSideReward=" + this.f154564d + gi.j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f154562b ? 1 : 0);
        rv rvVar = this.f154563c;
        if (rvVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(rvVar.f155161b);
            parcel.writeString(rvVar.f155162c);
        }
        yx2 yx2Var = this.f154564d;
        if (yx2Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(yx2Var.f158519b);
        }
    }
}
