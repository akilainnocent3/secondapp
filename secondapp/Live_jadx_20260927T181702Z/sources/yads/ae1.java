package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ae1 implements Parcelable {

    @oy.l
    public static final Parcelable.Creator<ae1> CREATOR = new zd1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f146775d;

    public ae1(String str, String str2, boolean z10) {
        this.f146773b = str;
        this.f146774c = str2;
        this.f146775d = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae1)) {
            return false;
        }
        ae1 ae1Var = (ae1) obj;
        return kotlin.jvm.internal.m0.g(this.f146773b, ae1Var.f146773b) && kotlin.jvm.internal.m0.g(this.f146774c, ae1Var.f146774c) && this.f146775d == ae1Var.f146775d;
    }

    public final int hashCode() {
        return g8.a.a(this.f146775d) + k4.a(this.f146774c, this.f146773b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "JavaScriptResource(apiFramework=" + this.f146773b + ", url=" + this.f146774c + ", browserOptional=" + this.f146775d + gi.j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f146773b);
        parcel.writeString(this.f146774c);
        parcel.writeInt(this.f146775d ? 1 : 0);
    }
}
