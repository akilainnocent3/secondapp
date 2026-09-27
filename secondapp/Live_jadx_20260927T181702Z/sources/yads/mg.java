package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mg implements ss1 {
    public static final Parcelable.Creator<mg> CREATOR = new lg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152445c;

    public mg(int i10, String str) {
        this.f152444b = i10;
        this.f152445c = str;
    }

    @Override // yads.ss1
    public /* synthetic */ mx0 a() {
        return ya4.a(this);
    }

    @Override // yads.ss1
    public /* synthetic */ byte[] b() {
        return ya4.c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Ait(controlCode=" + this.f152444b + ",url=" + this.f152445c + gi.j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f152445c);
        parcel.writeInt(this.f152444b);
    }

    @Override // yads.ss1
    public /* synthetic */ void a(im1 im1Var) {
        ya4.b(this, im1Var);
    }
}
