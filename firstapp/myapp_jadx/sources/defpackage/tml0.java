package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoq;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class tml0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        ArrayList arrayListJ = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                tr60.u(parcel, i);
            } else {
                arrayListJ = tr60.j(parcel, i, zzom.CREATOR);
            }
        }
        tr60.k(parcel, iV);
        return new zzoq(arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzoq[i];
    }
}
