package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d42;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableBoolean extends d42 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new a();
    public boolean a;

    public class a implements Parcelable.Creator<ObservableBoolean> {
        @Override // android.os.Parcelable.Creator
        public final ObservableBoolean createFromParcel(Parcel parcel) {
            boolean z = parcel.readInt() == 1;
            ObservableBoolean observableBoolean = new ObservableBoolean();
            observableBoolean.a = z;
            return observableBoolean;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableBoolean[] newArray(int i) {
            return new ObservableBoolean[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
    }
}
