package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rv implements Parcelable {

    @oy.l
    public static final Parcelable.Creator<rv> CREATOR = new qv();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155162c;

    public rv(int i10, String str) {
        this.f155161b = i10;
        this.f155162c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv)) {
            return false;
        }
        rv rvVar = (rv) obj;
        return this.f155161b == rvVar.f155161b && kotlin.jvm.internal.m0.g(this.f155162c, rvVar.f155162c);
    }

    public final int hashCode() {
        return this.f155162c.hashCode() + (this.f155161b * 31);
    }

    public final String toString() {
        return "ClientSideReward(rewardAmount=" + this.f155161b + ", rewardType=" + this.f155162c + gi.j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f155161b);
        parcel.writeString(this.f155162c);
    }
}
