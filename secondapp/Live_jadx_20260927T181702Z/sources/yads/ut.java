package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ut extends v21 {
    public static final Parcelable.Creator<ut> CREATOR = new tt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f156573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f156574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f156575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f156576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v21[] f156577h;

    public ut(Parcel parcel) {
        super("CHAP");
        this.f156572c = (String) ib3.a((Object) parcel.readString());
        this.f156573d = parcel.readInt();
        this.f156574e = parcel.readInt();
        this.f156575f = parcel.readLong();
        this.f156576g = parcel.readLong();
        int i10 = parcel.readInt();
        this.f156577h = new v21[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f156577h[i11] = (v21) parcel.readParcelable(v21.class.getClassLoader());
        }
    }

    @Override // yads.v21, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ut.class == obj.getClass()) {
            ut utVar = (ut) obj;
            if (this.f156573d == utVar.f156573d && this.f156574e == utVar.f156574e && this.f156575f == utVar.f156575f && this.f156576g == utVar.f156576g && ib3.a(this.f156572c, utVar.f156572c) && Arrays.equals(this.f156577h, utVar.f156577h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((this.f156573d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f156574e) * 31) + ((int) this.f156575f)) * 31) + ((int) this.f156576g)) * 31;
        String str = this.f156572c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f156572c);
        parcel.writeInt(this.f156573d);
        parcel.writeInt(this.f156574e);
        parcel.writeLong(this.f156575f);
        parcel.writeLong(this.f156576g);
        parcel.writeInt(this.f156577h.length);
        for (v21 v21Var : this.f156577h) {
            parcel.writeParcelable(v21Var, 0);
        }
    }

    public ut(String str, int i10, int i11, long j10, long j11, v21[] v21VarArr) {
        super("CHAP");
        this.f156572c = str;
        this.f156573d = i10;
        this.f156574e = i11;
        this.f156575f = j10;
        this.f156576g = j11;
        this.f156577h = v21VarArr;
    }
}
