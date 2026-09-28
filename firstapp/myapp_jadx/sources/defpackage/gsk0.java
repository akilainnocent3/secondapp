package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;

/* JADX INFO: loaded from: classes4.dex */
public final class gsk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        int iP = 0;
        short s = 0;
        short s2 = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 2) {
                tr60.x(parcel, i, 4);
                s = (short) parcel.readInt();
            } else if (c != 3) {
                tr60.u(parcel, i);
            } else {
                tr60.x(parcel, i, 4);
                s2 = (short) parcel.readInt();
            }
        }
        tr60.k(parcel, iV);
        return new UvmEntry(s, s2, iP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UvmEntry[i];
    }
}
