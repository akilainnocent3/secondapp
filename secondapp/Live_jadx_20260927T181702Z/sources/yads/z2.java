package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z2 implements Parcelable {

    @oy.l
    public static final Parcelable.Creator<z2> CREATOR = new y2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f158565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f158566d;

    public z2(String str, String str2, String str3) {
        this.f158564b = str;
        this.f158565c = str2;
        this.f158566d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f158564b);
        parcel.writeString(this.f158565c);
        parcel.writeString(this.f158566d);
    }
}
