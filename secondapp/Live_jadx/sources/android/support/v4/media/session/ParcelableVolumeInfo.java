package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5895f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(int i10, int i11, int i12, int i13, int i14) {
        this.f5891b = i10;
        this.f5892c = i11;
        this.f5893d = i12;
        this.f5894e = i13;
        this.f5895f = i14;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5891b);
        parcel.writeInt(this.f5893d);
        parcel.writeInt(this.f5894e);
        parcel.writeInt(this.f5895f);
        parcel.writeInt(this.f5892c);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f5891b = parcel.readInt();
        this.f5893d = parcel.readInt();
        this.f5894e = parcel.readInt();
        this.f5895f = parcel.readInt();
        this.f5892c = parcel.readInt();
    }
}
