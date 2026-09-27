package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ua3 extends v21 {
    public static final Parcelable.Creator<ua3> CREATOR = new ta3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f156341d;

    public ua3(Parcel parcel) {
        super((String) ib3.a((Object) parcel.readString()));
        this.f156340c = parcel.readString();
        this.f156341d = (String) ib3.a((Object) parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ua3.class == obj.getClass()) {
            ua3 ua3Var = (ua3) obj;
            if (this.f156721b.equals(ua3Var.f156721b) && ib3.a(this.f156340c, ua3Var.f156340c) && ib3.a(this.f156341d, ua3Var.f156341d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = k4.a(this.f156721b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f156340c;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f156341d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f156721b + ": url=" + this.f156341d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f156721b);
        parcel.writeString(this.f156340c);
        parcel.writeString(this.f156341d);
    }

    public ua3(String str, String str2, String str3) {
        super(str);
        this.f156340c = str2;
        this.f156341d = str3;
    }
}
