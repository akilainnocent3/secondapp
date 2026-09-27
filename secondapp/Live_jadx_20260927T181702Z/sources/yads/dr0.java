package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dr0 implements Parcelable {

    @oy.l
    public static final Parcelable.Creator<dr0> CREATOR = new cr0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f148327c;

    public dr0(String str, long j10) {
        this.f148326b = str;
        this.f148327c = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr0)) {
            return false;
        }
        dr0 dr0Var = (dr0) obj;
        return kotlin.jvm.internal.m0.g(this.f148326b, dr0Var.f148326b) && this.f148327c == dr0Var.f148327c;
    }

    public final int hashCode() {
        return f0.p.a(this.f148327c) + (this.f148326b.hashCode() * 31);
    }

    public final String toString() {
        return "FalseClick(url=" + this.f148326b + ", interval=" + this.f148327c + gi.j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f148326b);
        parcel.writeLong(this.f148327c);
    }
}
