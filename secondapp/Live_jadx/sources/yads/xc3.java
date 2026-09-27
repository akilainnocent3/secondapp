package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xc3 implements Parcelable {

    @oy.l
    @cs.g
    public static final Parcelable.Creator<xc3> CREATOR = new vc3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wc3 f157777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f157778c;

    public xc3(wc3 wc3Var, float f10) {
        this.f157777b = wc3Var;
        this.f157778c = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        wc3 wc3Var = this.f157777b;
        parcel.writeInt(wc3Var != null ? wc3Var.ordinal() : -1);
        parcel.writeFloat(this.f157778c);
    }
}
