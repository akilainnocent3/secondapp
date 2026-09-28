package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d42;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableChar extends d42 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new a();
    public char a;

    public class a implements Parcelable.Creator<ObservableChar> {
        @Override // android.os.Parcelable.Creator
        public final ObservableChar createFromParcel(Parcel parcel) {
            char c = (char) parcel.readInt();
            ObservableChar observableChar = new ObservableChar();
            observableChar.a = c;
            return observableChar;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableChar[] newArray(int i) {
            return new ObservableChar[i];
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
