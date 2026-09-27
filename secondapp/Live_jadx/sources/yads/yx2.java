package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yx2 implements Parcelable {

    @oy.l
    public static final Parcelable.Creator<yx2> CREATOR = new xx2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158519b;

    public yx2(String str) {
        this.f158519b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yx2) && kotlin.jvm.internal.m0.g(this.f158519b, ((yx2) obj).f158519b);
    }

    public final int hashCode() {
        return this.f158519b.hashCode();
    }

    public final String toString() {
        return "ServerSideReward(rewardUrl=" + this.f158519b + gi.j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f158519b);
    }
}
