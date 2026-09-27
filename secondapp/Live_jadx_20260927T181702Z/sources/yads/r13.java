package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class r13 implements ss1 {
    public static final Parcelable.Creator<r13> CREATOR = new q13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f154717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f154718c;

    public r13(int i10, float f10) {
        this.f154717b = f10;
        this.f154718c = i10;
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
        if (obj != null && r13.class == obj.getClass()) {
            r13 r13Var = (r13) obj;
            if (this.f154717b == r13Var.f154717b && this.f154718c == r13Var.f154718c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f154717b).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f154718c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f154717b + ", svcTemporalLayerCount=" + this.f154718c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f154717b);
        parcel.writeInt(this.f154718c);
    }

    @Override // yads.ss1
    public /* synthetic */ void a(im1 im1Var) {
        ya4.b(this, im1Var);
    }

    public r13(Parcel parcel) {
        this.f154717b = parcel.readFloat();
        this.f154718c = parcel.readInt();
    }
}
