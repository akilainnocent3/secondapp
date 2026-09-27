package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class ObservableChar extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f9429d = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f9430c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<ObservableChar> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableChar createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableChar[] newArray(int i10) {
            return new ObservableChar[i10];
        }
    }

    public ObservableChar(char c10) {
        this.f9430c = c10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public char j() {
        return this.f9430c;
    }

    public void k(char c10) {
        if (c10 != this.f9430c) {
            this.f9430c = c10;
            g();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9430c);
    }

    public ObservableChar() {
    }

    public ObservableChar(u... uVarArr) {
        super(uVarArr);
    }
}
