package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d42;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableInt extends d42 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new a();
    public int a;

    public class a implements Parcelable.Creator<ObservableInt> {
        @Override // android.os.Parcelable.Creator
        public final ObservableInt createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ObservableInt observableInt = new ObservableInt();
            observableInt.a = i;
            return observableInt;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableInt[] newArray(int i) {
            return new ObservableInt[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
