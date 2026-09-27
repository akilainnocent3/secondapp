package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class ObservableFloat extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f9433d = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9434c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<ObservableFloat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableFloat createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableFloat[] newArray(int i10) {
            return new ObservableFloat[i10];
        }
    }

    public ObservableFloat(float f10) {
        this.f9434c = f10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float j() {
        return this.f9434c;
    }

    public void k(float f10) {
        if (f10 != this.f9434c) {
            this.f9434c = f10;
            g();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f9434c);
    }

    public ObservableFloat() {
    }

    public ObservableFloat(u... uVarArr) {
        super(uVarArr);
    }
}
