package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
@yv.g
public final class j5 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150935b;

    @oy.l
    public static final h5 Companion = new h5();

    @oy.l
    public static final Parcelable.Creator<j5> CREATOR = new i5();

    public /* synthetic */ j5(int i10, String str) {
        if (1 != (i10 & 1)) {
            dw.g2.b(i10, 1, g5.f149397a.getDescriptor());
        }
        this.f150935b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5) && kotlin.jvm.internal.m0.g(this.f150935b, ((j5) obj).f150935b);
    }

    public final int hashCode() {
        return this.f150935b.hashCode();
    }

    public final String toString() {
        return "AdImpressionData(rawData=" + this.f150935b + gi.j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f150935b);
    }

    public j5(String str) {
        this.f150935b = str;
    }
}
