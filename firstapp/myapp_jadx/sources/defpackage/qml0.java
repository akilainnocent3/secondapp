package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzoo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class qml0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        while (true) {
            ArrayList arrayList = null;
            while (true) {
                if (parcel.dataPosition() >= iV) {
                    tr60.k(parcel, iV);
                    return new zzoo(arrayList);
                }
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    tr60.u(parcel, i);
                } else {
                    int iT = tr60.t(parcel, i);
                    int iDataPosition = parcel.dataPosition();
                    if (iT == 0) {
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i2 = parcel.readInt();
                    for (int i3 = 0; i3 < i2; i3++) {
                        arrayList2.add(Integer.valueOf(parcel.readInt()));
                    }
                    parcel.setDataPosition(iDataPosition + iT);
                    arrayList = arrayList2;
                }
            }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzoo[i];
    }
}
