package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d42;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableDouble extends d42 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new a();
    public double a;

    public class a implements Parcelable.Creator<ObservableDouble> {
        @Override // android.os.Parcelable.Creator
        public final ObservableDouble createFromParcel(Parcel parcel) {
            double d = parcel.readDouble();
            ObservableDouble observableDouble = new ObservableDouble();
            observableDouble.a = d;
            return observableDouble;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableDouble[] newArray(int i) {
            return new ObservableDouble[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.a);
    }
}
