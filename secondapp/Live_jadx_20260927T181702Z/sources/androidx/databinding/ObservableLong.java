package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class ObservableLong extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f9437d = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9438c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<ObservableLong> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableLong createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableLong[] newArray(int i10) {
            return new ObservableLong[i10];
        }
    }

    public ObservableLong(long j10) {
        this.f9438c = j10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long j() {
        return this.f9438c;
    }

    public void k(long j10) {
        if (j10 != this.f9438c) {
            this.f9438c = j10;
            g();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9438c);
    }

    public ObservableLong() {
    }

    public ObservableLong(u... uVarArr) {
        super(uVarArr);
    }
}
