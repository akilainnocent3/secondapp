package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hdy;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableParcelable<T extends Parcelable> extends hdy<T> implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new a();

    public class a implements Parcelable.Creator<ObservableParcelable> {
        @Override // android.os.Parcelable.Creator
        public final ObservableParcelable createFromParcel(Parcel parcel) {
            Parcelable parcelable = parcel.readParcelable(a.class.getClassLoader());
            ObservableParcelable observableParcelable = new ObservableParcelable();
            observableParcelable.a = parcelable;
            return observableParcelable;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableParcelable[] newArray(int i) {
            return new ObservableParcelable[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
    }
}
