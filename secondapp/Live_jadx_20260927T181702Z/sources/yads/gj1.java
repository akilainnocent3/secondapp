package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gj1 implements ss1 {
    public static final Parcelable.Creator<gj1> CREATOR = new fj1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f149653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f149654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f149655e;

    public gj1(int i10, int i11, String str, byte[] bArr) {
        this.f149652b = str;
        this.f149653c = bArr;
        this.f149654d = i10;
        this.f149655e = i11;
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
        if (obj != null && gj1.class == obj.getClass()) {
            gj1 gj1Var = (gj1) obj;
            if (this.f149652b.equals(gj1Var.f149652b) && Arrays.equals(this.f149653c, gj1Var.f149653c) && this.f149654d == gj1Var.f149654d && this.f149655e == gj1Var.f149655e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f149653c) + k4.a(this.f149652b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31)) * 31) + this.f149654d) * 31) + this.f149655e;
    }

    public final String toString() {
        return "mdta: key=" + this.f149652b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f149652b);
        parcel.writeByteArray(this.f149653c);
        parcel.writeInt(this.f149654d);
        parcel.writeInt(this.f149655e);
    }

    @Override // yads.ss1
    public /* synthetic */ void a(im1 im1Var) {
        ya4.b(this, im1Var);
    }

    public gj1(Parcel parcel) {
        this.f149652b = (String) ib3.a((Object) parcel.readString());
        this.f149653c = (byte[]) ib3.a((Object) parcel.createByteArray());
        this.f149654d = parcel.readInt();
        this.f149655e = parcel.readInt();
    }
}
