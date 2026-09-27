package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kt1 extends v21 {
    public static final Parcelable.Creator<kt1> CREATOR = new jt1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f151703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f151704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f151705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f151706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f151707g;

    public kt1(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f151703c = i10;
        this.f151704d = i11;
        this.f151705e = i12;
        this.f151706f = iArr;
        this.f151707g = iArr2;
    }

    @Override // yads.v21, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kt1.class == obj.getClass()) {
            kt1 kt1Var = (kt1) obj;
            if (this.f151703c == kt1Var.f151703c && this.f151704d == kt1Var.f151704d && this.f151705e == kt1Var.f151705e && Arrays.equals(this.f151706f, kt1Var.f151706f) && Arrays.equals(this.f151707g, kt1Var.f151707g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f151707g) + ((Arrays.hashCode(this.f151706f) + ((((((this.f151703c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f151704d) * 31) + this.f151705e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f151703c);
        parcel.writeInt(this.f151704d);
        parcel.writeInt(this.f151705e);
        parcel.writeIntArray(this.f151706f);
        parcel.writeIntArray(this.f151707g);
    }

    public kt1(Parcel parcel) {
        super("MLLT");
        this.f151703c = parcel.readInt();
        this.f151704d = parcel.readInt();
        this.f151705e = parcel.readInt();
        this.f151706f = (int[]) ib3.a(parcel.createIntArray());
        this.f151707g = (int[]) ib3.a(parcel.createIntArray());
    }
}
