package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class v33 implements Comparable, Parcelable {
    public static final Parcelable.Creator<v33> CREATOR = new u33();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f156726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f156727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f156728d;

    public v33(int i10, int i11, int i12) {
        this.f156726b = i10;
        this.f156727c = i11;
        this.f156728d = i12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v33 v33Var = (v33) obj;
        int i10 = this.f156726b - v33Var.f156726b;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f156727c - v33Var.f156727c;
        return i11 == 0 ? this.f156728d - v33Var.f156728d : i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v33.class == obj.getClass()) {
            v33 v33Var = (v33) obj;
            if (this.f156726b == v33Var.f156726b && this.f156727c == v33Var.f156727c && this.f156728d == v33Var.f156728d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f156726b * 31) + this.f156727c) * 31) + this.f156728d;
    }

    public final String toString() {
        return this.f156726b + androidx.media3.session.fe.F + this.f156727c + androidx.media3.session.fe.F + this.f156728d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f156726b);
        parcel.writeInt(this.f156727c);
        parcel.writeInt(this.f156728d);
    }

    public v33(Parcel parcel) {
        this.f156726b = parcel.readInt();
        this.f156727c = parcel.readInt();
        this.f156728d = parcel.readInt();
    }
}
