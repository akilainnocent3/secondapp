package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zc1 extends v21 {
    public static final Parcelable.Creator<zc1> CREATOR = new yc1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f158756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f158757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f158758e;

    public zc1(Parcel parcel) {
        super("----");
        this.f158756c = (String) ib3.a((Object) parcel.readString());
        this.f158757d = (String) ib3.a((Object) parcel.readString());
        this.f158758e = (String) ib3.a((Object) parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zc1.class == obj.getClass()) {
            zc1 zc1Var = (zc1) obj;
            if (ib3.a(this.f158757d, zc1Var.f158757d) && ib3.a(this.f158756c, zc1Var.f158756c) && ib3.a(this.f158758e, zc1Var.f158758e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f158756c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f158757d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f158758e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f156721b + ": domain=" + this.f158756c + ", description=" + this.f158757d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f156721b);
        parcel.writeString(this.f158756c);
        parcel.writeString(this.f158758e);
    }

    public zc1(String str, String str2, String str3) {
        super("----");
        this.f158756c = str;
        this.f158757d = str2;
        this.f158758e = str3;
    }
}
