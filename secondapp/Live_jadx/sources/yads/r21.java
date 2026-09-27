package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class r21 implements ss1 {
    public static final Parcelable.Creator<r21> CREATOR = new q21();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f154720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f154722d;

    public r21(Parcel parcel) {
        this.f154720b = (byte[]) ni.a(parcel.createByteArray());
        this.f154721c = parcel.readString();
        this.f154722d = parcel.readString();
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r21.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f154720b, ((r21) obj).f154720b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f154720b);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f154721c + "\", url=\"" + this.f154722d + "\", rawMetadata.length=\"" + this.f154720b.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f154720b);
        parcel.writeString(this.f154721c);
        parcel.writeString(this.f154722d);
    }

    @Override // yads.ss1
    public final void a(im1 im1Var) {
        String str = this.f154721c;
        if (str != null) {
            im1Var.f150677a = str;
        }
    }

    public r21(byte[] bArr, String str, String str2) {
        this.f154720b = bArr;
        this.f154721c = str;
        this.f154722d = str2;
    }
}
