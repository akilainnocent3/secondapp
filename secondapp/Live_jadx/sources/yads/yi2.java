package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yi2 extends j23 {
    public static final Parcelable.Creator<yi2> CREATOR = new xi2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f158354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f158355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f158356d;

    public yi2(long j10, byte[] bArr, long j11) {
        this.f158354b = j11;
        this.f158355c = j10;
        this.f158356d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f158354b);
        parcel.writeLong(this.f158355c);
        parcel.writeByteArray(this.f158356d);
    }

    public yi2(Parcel parcel) {
        this.f158354b = parcel.readLong();
        this.f158355c = parcel.readLong();
        this.f158356d = (byte[]) ib3.a((Object) parcel.createByteArray());
    }
}
