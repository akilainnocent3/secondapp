package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d42;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableFloat extends d42 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new a();
    public float a;

    public class a implements Parcelable.Creator<ObservableFloat> {
        @Override // android.os.Parcelable.Creator
        public final ObservableFloat createFromParcel(Parcel parcel) {
            float f = parcel.readFloat();
            ObservableFloat observableFloat = new ObservableFloat();
            observableFloat.a = f;
            return observableFloat;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableFloat[] newArray(int i) {
            return new ObservableFloat[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
    }
}
